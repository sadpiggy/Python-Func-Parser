import io
import os
import sys
import time
from antlr4 import *
from Tree import TreeParser

from ModuleLexer import ModuleLexer
from utils import Function
from typing import Any, List

from CLexer import CLexer

from CPP14Lexer import CPP14Lexer

import json
import hashlib
import re
from concurrent.futures import ThreadPoolExecutor,ProcessPoolExecutor
from concurrent import futures
import math
import random

from threading import Lock

use_cpp_parser = 1

class Cparser:
    funcResultList = []
    finished = 0
    
    finalResultPath = ""
    repoPath = ""
    
    targetFileListPath = ""
    targetFileList = None
    lock = Lock()
    
    VulMatch_ENGINE_SUPPORT_EXTENSIONS = [".cpp", ".c", ".C", ".cc", ".CPP", ".c++", ".cp"]

    class ParseRunnable:
        def __init__(self, filePaths,index):
            self.filePaths = filePaths
            self.funcResultList_per_process = []
            self.index = index

        def __call__(self):
            for filePath in self.filePaths:
                try:
                    with open(filePath, "rb") as f:
                        file_hash = hashlib.md5(f.read()).hexdigest()

                    fileAttr = {
                        "file_hash": file_hash,
                        "file_path": filePath,
                        "file_name": os.path.basename(filePath)
                    }

                    functionList = []

                    treeParser = TreeParser()
                    # continue
                    funcObjs = treeParser.ParseFile(filePath)
                    if funcObjs is None:
                        print(filePath)
                        continue

                    for funcObj in funcObjs:
                        functionAttr = {
                            "line_start": funcObj.lineStart,
                            "line_stop": funcObj.lineStop,
                            "function_name": funcObj.name,
                            "file_path": filePath.replace(repoPath, "")
                        }
                        
                        tokenAttributes = {
                            "operators": [],
                            "operands": []
                        }
                        
                        
                        CoperandsTypes = [CLexer.Identifier,CLexer.Constant,CLexer.DigitSequence,CLexer.StringLiteral]
                       
                        CPPoperandsTypes = [CPP14Lexer.Identifier, CPP14Lexer.IntegerLiteral, CPP14Lexer.CharacterLiteral, CPP14Lexer.FloatingLiteral, CPP14Lexer.StringLiteral, CPP14Lexer.BooleanLiteral, CPP14Lexer.PointerLiteral,CPP14Lexer.UserDefinedLiteral,
                                            CPP14Lexer.UserDefinedCharacterLiteral, CPP14Lexer.UserDefinedFloatingLiteral, CPP14Lexer.UserDefinedIntegerLiteral, CPP14Lexer.UserDefinedStringLiteral,
                                            CPP14Lexer.DecimalLiteral, CPP14Lexer.OctalLiteral, CPP14Lexer.HexadecimalLiteral, CPP14Lexer.BinaryLiteral, CPP14Lexer.Integersuffix]
                        
                        function_content_no_comment = Cparser.removeComment(funcObj.funcBody)
                        
                        if use_cpp_parser == 0:
                            cLexer = CLexer(InputStream(function_content_no_comment))
                            tokens = cLexer.getAllTokens()
                            tokens = list(tokens)

                            for token in tokens:
                                if token.type in CoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                    
                        else:
                            cppLexer = CPP14Lexer(InputStream(function_content_no_comment))
                            tokens = cppLexer.getAllTokens()
                            tokens = list(tokens)
                            old_token = None
                            
                            for token in tokens:
                                if token.type in CPPoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                if token.type == CPP14Lexer.LeftParen:
                                    if old_token is not None and old_token.type == CPP14Lexer.Identifier:
                                        funcObj.funcCalleeList.append(old_token.text)
                                old_token = token
                            



                        line_of_code = len([
                            line for line in function_content_no_comment.split("\n")
                            if line.strip()
                        ])

                        functionAttr["line_of_code"] = line_of_code
                        functionAttr["operators"] = tokenAttributes["operators"]
                        functionAttr["operands"] = tokenAttributes["operands"]
                        functionAttr["callee_func"] = funcObj.funcCalleeList

                        function_normalized = Cparser.normalize(function_content_no_comment)
                        functionAttr["function_normalized_hash"] = hashlib.md5(function_normalized.encode()).hexdigest()

                        functionList.append(functionAttr)

                    fileAttr["function_list"] = functionList

                    self.funcResultList_per_process.append(fileAttr)

                except Exception as e:
                    print(e)
            print("process {} finished".format(self.index))
            return self.funcResultList_per_process       

    @staticmethod
    def log2(n):
        return math.log(n) / math.log(2)

    @staticmethod
    def normalize(funcBody:str):
        result = "".join(funcBody.replace("\n", "")
                        .replace("\r", "")
                        .replace("\t", "")
                        .replace("{", "")
                        .replace("}", "").split()).lower()
        return result


    @staticmethod
    def removeComment(funcBody:str):
        cPattern = re.compile(r"(//.*?$|[{}]+)|(/\*.*?\*/)|('(?:\\.|[^\\'])*'|\"(?:\\.|[^\\\"])*\"|.[^/'\"]*)", re.DOTALL | re.MULTILINE)
        result = ""
        for match in cPattern.finditer(funcBody):
            if match.group(3) is None:
                result += ""
            else:
                result += match.group(3)
        return result

    @staticmethod
    def chunkSize(fileList:List[str], concurrent_size:int):
        chunk_paths = []
        if len(fileList) < concurrent_size:
            chunk_paths.append(fileList)
        else:
            chunk_size = len(fileList) // concurrent_size
            for i in range(concurrent_size):
                fromIndex = i * chunk_size
                endIndex = (i + 1) * chunk_size
                if i == concurrent_size - 1:
                    endIndex = max(endIndex, len(fileList))
                chunk_paths.append(fileList[fromIndex:endIndex])
        return chunk_paths

    @staticmethod
    def getCFileList(target_folder):
        fileList = []
        for root, _, files in os.walk(target_folder):
            for file in files:
                if any(file.endswith(ext) for ext in Cparser.VulMatch_ENGINE_SUPPORT_EXTENSIONS):
                    fileList.append(os.path.join(root, file))
        # shullfe fileList to balance the workload
        random.shuffle(fileList)    
        return fileList

    @staticmethod
    def main(args):
        Cparser.repoPath = args[0]
        concurrent_size = int(args[1])
        Cparser.finalResultPath = args[2]
        Cparser.finished = 0
        fileList = Cparser.getCFileList(repoPath)
        filterFileList = Cparser.targetFileList if Cparser.targetFileList else fileList

        chunk_paths = Cparser.chunkSize(filterFileList, concurrent_size)
        
        futures_list = []

        with ProcessPoolExecutor(max_workers=concurrent_size) as executor:
            index = 0
            for filePaths in chunk_paths:
                futures_list.append(executor.submit(Cparser.ParseRunnable(filePaths,index)))
                index += 1

            for future in futures.as_completed(futures_list):
                try:
                    Cparser.funcResultList.extend(future.result())
                except Exception as e:
                    print("error in funcResultListExtend: {}".format(e))
                

        gsonObject = json.dumps(Cparser.funcResultList)
        with open(finalResultPath, "w") as f:
            f.write(gsonObject)




if __name__ == "__main__":
    
    argv = sys.argv
    argc = len(argv)
    if argc < 4:
        print("Usage: python3 CParser.py <repoPath> <concurrent_size> <finalResultPath>")
        exit(1)
    repoPath = argv[1]
    concurrent_size = int(argv[2])
    finalResultPath = argv[3]
    
    startTime = time.time()
    
    Cparser.main(argv[1:])
    
    endTime = time.time()
    elapsed_time = endTime - startTime
    print("Elapsed Time: {:.2f} seconds".format(elapsed_time))
    
