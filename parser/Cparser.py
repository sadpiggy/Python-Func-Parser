import io
import os
import sys
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
from concurrent.futures import ThreadPoolExecutor
import math

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
        def __init__(self, filePaths):
            self.filePaths = filePaths
            # self.totalTask = totalTask

        def __call__(self):
            for filePath in self.filePaths:
                try:
                    # check file hash is existed
                    with open(filePath, "rb") as f:
                        file_hash = hashlib.md5(f.read()).hexdigest()

                    fileAttr = {
                        "file_hash": file_hash,
                        "file_path": filePath,
                        "file_name": os.path.basename(filePath)
                    }

                    functionList = []

                    # parse the function info
                    treeParser = TreeParser()
                    funcObjs = treeParser.ParseFile(filePath)
                    # return

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
                        # 具体有哪些呢？
                        CPPoperandsTypes = [CPP14Lexer.Identifier, CPP14Lexer.IntegerLiteral, CPP14Lexer.CharacterLiteral, CPP14Lexer.FloatingLiteral, CPP14Lexer.StringLiteral, CPP14Lexer.BooleanLiteral, CPP14Lexer.PointerLiteral,CPP14Lexer.UserDefinedLiteral,
                                            CPP14Lexer.UserDefinedCharacterLiteral, CPP14Lexer.UserDefinedFloatingLiteral, CPP14Lexer.UserDefinedIntegerLiteral, CPP14Lexer.UserDefinedStringLiteral,
                                            CPP14Lexer.DecimalLiteral, CPP14Lexer.OctalLiteral, CPP14Lexer.HexadecimalLiteral, CPP14Lexer.BinaryLiteral, CPP14Lexer.Integersuffix]
                        
                        if use_cpp_parser == 0:
                            cLexer = CLexer(InputStream(funcObj.funcBody))
                            tokens = cLexer.getAllTokens()
                            tokens = list(tokens)

                            for token in tokens:
                                if token.type in CoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                    
                        else:
                            cppLexer = CPP14Lexer(InputStream(funcObj.funcBody))
                            tokens = cppLexer.getAllTokens()
                            tokens = list(tokens)
                            
                            for token in tokens:
                                if token.type in CPPoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                            


                        function_content_no_comment = Cparser.removeComment(funcObj.funcBody)

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

                    Cparser.funcResultList.append(fileAttr)

                except Exception as e:
                    print(e)
                finally:
                    with Cparser.lock:
                        Cparser.finished += 1

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
        return fileList

    @staticmethod
    def main(args):
        # global funcResultList, finished, finalResultPath, repoPath, targetFileListPath, targetFileList

        Cparser.repoPath = args[0]
        concurrent_size = int(args[1])
        Cparser.finalResultPath = args[2]


        Cparser.finished = 0

        fileList = Cparser.getCFileList(repoPath)
        filterFileList = Cparser.targetFileList if Cparser.targetFileList else fileList

        chunk_paths = Cparser.chunkSize(filterFileList, concurrent_size)
        
        # print(repoPath)
        # print(fileList)
        # return

        with ThreadPoolExecutor() as executor:
            for filePaths in chunk_paths:
                executor.submit(Cparser.ParseRunnable(filePaths))

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

    Cparser.main(argv[1:])

    
