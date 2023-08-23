import io
import os
import sys
import time
from antlr4 import *
from c.Tree import TreeParser

from c.ModuleLexer import ModuleLexer
from utils import Function
from typing import Any, List

from c.CLexer import CLexer

from c.CPP14Lexer import CPP14Lexer

from java.JavaTree import JavaTreeParser
from java.JavaLexer import JavaLexer

from python.PythonTree import PythonTreeParser
from python.Python3Lexer import Python3Lexer

import json
import hashlib
import re
from concurrent.futures import ThreadPoolExecutor,ProcessPoolExecutor
from concurrent import futures
import math
import random

from threading import Lock

use_cpp_parser = 1

class MultiLanguageparser:
    funcResultList = []
    finished = 0
    
    finalResultPath = ""
    repoPath = ""
    
    targetFileListPath = ""
    targetFileList = None
    lock = Lock()
    
    VulMatch_ENGINE_SUPPORT_EXTENSIONS_cpp = [".cpp", ".c", ".C", ".cc", ".CPP", ".c++", ".cp"]
    
    VulMatch_ENGINE_SUPPORT_EXTENSIONS_java = [".java"]
    
    VulMatch_ENGINE_SUPPORT_EXTENSIONS_python = [".py"]
    
    targetLanguage = ""

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
                    if MultiLanguageparser.targetLanguage == "java":
                        treeParser = JavaTreeParser()
                    elif MultiLanguageparser.targetLanguage == "cpp":
                        treeParser = TreeParser()
                    elif MultiLanguageparser.targetLanguage == "python":
                        treeParser = PythonTreeParser()
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
                        
                        JavaoperandsTypes = [JavaLexer.IDENTIFIER, JavaLexer.DECIMAL_LITERAL, JavaLexer.HEX_LITERAL, JavaLexer.OCT_LITERAL, JavaLexer.BINARY_LITERAL, JavaLexer.FLOAT_LITERAL, JavaLexer.HEX_FLOAT_LITERAL, JavaLexer.BOOL_LITERAL, JavaLexer.CHAR_LITERAL, JavaLexer.STRING_LITERAL, JavaLexer.TEXT_BLOCK, JavaLexer.NULL_LITERAL]
                        
                        PythonoperandsTypes = [Python3Lexer.STRING, Python3Lexer.NUMBER, Python3Lexer.IMAG_NUMBER, Python3Lexer.INTEGER, Python3Lexer.NAME]
                        
                        function_content_no_comment = funcObj.funcBody
                        # function_content_no_comment = MultiLanguageparser.removeComment(funcObj.funcBody)
                        # print(function_content_no_comment)
                        if MultiLanguageparser.targetLanguage == "java":
                            javaLexer = JavaLexer(InputStream(function_content_no_comment))
                            tokens = javaLexer.getAllTokens()
                        elif MultiLanguageparser.targetLanguage == "cpp":
                            function_content_no_comment = MultiLanguageparser.removeComment(funcObj.funcBody)
                            cppLexer = CPP14Lexer(InputStream(function_content_no_comment))
                            tokens = cppLexer.getAllTokens()
                        elif MultiLanguageparser.targetLanguage == "python":
                            pythonLexer = Python3Lexer(InputStream(function_content_no_comment))
                            tokens = pythonLexer.getAllTokens()
                        tokens = list(tokens)
                        old_token = None
                        
                        if MultiLanguageparser.targetLanguage == "java":
                            for token in tokens:
                                # print(token.text)
                                if token.type in JavaoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                if token.type == javaLexer.LPAREN:
                                    if old_token is not None and old_token.type == javaLexer.IDENTIFIER:
                                        funcObj.funcCalleeList.append(old_token.text)
                                old_token = token
                        elif MultiLanguageparser.targetLanguage == "cpp":   
                            for token in tokens:
                                # print(token.text)
                                if token.type in CPPoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                if token.type == CPP14Lexer.LeftParen:
                                    if old_token is not None and old_token.type == CPP14Lexer.Identifier:
                                        funcObj.funcCalleeList.append(old_token.text)
                                old_token = token
                        elif MultiLanguageparser.targetLanguage == "python":
                            for token in tokens:
                                # print(token.text)
                                if token.type in PythonoperandsTypes:
                                    tokenAttributes["operands"].append(token.text)
                                else:
                                    tokenAttributes["operators"].append(token.text)
                                if token.type == Python3Lexer.OPEN_PAREN:
                                    if old_token is not None and old_token.type == Python3Lexer.NAME:
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

                        function_normalized = MultiLanguageparser.normalize(function_content_no_comment)
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

    ## java和c的注释好像都是这个样子的，python的注释不太一样
    ## 这个函数不需要被调用，因为在解析的时候已经去掉了注释
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
                if any(file.endswith(ext) for ext in MultiLanguageparser.VulMatch_ENGINE_SUPPORT_EXTENSIONS_cpp):
                    fileList.append(os.path.join(root, file))
        # shullfe fileList to balance the workload
        random.shuffle(fileList)    
        return fileList
    
    @staticmethod
    def getJavaFileList(target_folder):
        fileList = []
        for root, _, files in os.walk(target_folder):
            for file in files:
                if any(file.endswith(ext) for ext in MultiLanguageparser.VulMatch_ENGINE_SUPPORT_EXTENSIONS_java):
                    fileList.append(os.path.join(root, file))
        # shullfe fileList to balance the workload
        random.shuffle(fileList)    
        return fileList

    @staticmethod
    def getPythonFileList(target_folder):
        fileList = []
        for root, _, files in os.walk(target_folder):
            for file in files:
                if any(file.endswith(ext) for ext in MultiLanguageparser.VulMatch_ENGINE_SUPPORT_EXTENSIONS_python):
                    fileList.append(os.path.join(root, file))
        # shullfe fileList to balance the workload
        random.shuffle(fileList)    
        return fileList

    @staticmethod
    def main(args):
        MultiLanguageparser.repoPath = args[0]
        concurrent_size = int(args[1])
        MultiLanguageparser.finalResultPath = args[2]
        MultiLanguageparser.finished = 0
        if MultiLanguageparser.targetLanguage == "java":
            fileList = MultiLanguageparser.getJavaFileList(repoPath)
        elif MultiLanguageparser.targetLanguage == "cpp":
            fileList = MultiLanguageparser.getCFileList(repoPath)
        elif MultiLanguageparser.targetLanguage == "python":
            fileList = MultiLanguageparser.getPythonFileList(repoPath)
            
        filterFileList = MultiLanguageparser.targetFileList if MultiLanguageparser.targetFileList else fileList

        chunk_paths = MultiLanguageparser.chunkSize(filterFileList, concurrent_size)
        
        futures_list = []
        

        with ProcessPoolExecutor(max_workers=concurrent_size) as executor:
            index = 0
            for filePaths in chunk_paths:
                futures_list.append(executor.submit(MultiLanguageparser.ParseRunnable(filePaths,index)))
                index += 1

            for future in futures.as_completed(futures_list):
                try:
                    MultiLanguageparser.funcResultList.extend(future.result())
                except Exception as e:
                    print("error in funcResultListExtend: {}".format(e))
                

        gsonObject = json.dumps(MultiLanguageparser.funcResultList)
        with open(finalResultPath, "w") as f:
            f.write(gsonObject)




if __name__ == "__main__":
    
    argv = sys.argv
    argc = len(argv)
    if argc < 4:
        print("Usage: python3 CParser.py <repoPath> <concurrent_size> <finalResultPath> <targetLanguage>=[cpp/c,java,python]")
        exit(1)
    repoPath = argv[1]
    concurrent_size = int(argv[2])
    finalResultPath = argv[3]
    
    targetLanguage = argv[4]
    if targetLanguage == "c":
        targetLanguage = "cpp"
    MultiLanguageparser.targetLanguage = targetLanguage
    startTime = time.time()
    
    MultiLanguageparser.main(argv[1:])
    
    endTime = time.time()
    elapsed_time = endTime - startTime
    print("Elapsed Time: {:.2f} seconds".format(elapsed_time))
    
