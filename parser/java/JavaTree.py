import sys
import antlr4

from antlr4 import *
from antlr4.tree.Trees import Trees
from antlr4.error.ErrorListener import ErrorListener

from antlr4.InputStream import InputStream
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.atn.PredictionMode import PredictionMode

from java.JavaLexer import JavaLexer
from java.JavaParser import JavaParser

from concurrent import futures
import multiprocessing

from typing import List

from utils import Function

class JavaTreeParser():
    def __init__(self) -> None:
        self.function_list:List[Function] = []
        self.functionInstance = None

        self.funcNameFlag = 0
        self.funcNameStr = ""

        self.paramNameFlag = 0
        self.paramNameStr = ""

        self.typeNameFlag = 0
        self.typeNameStr = ""

        self.funcDefFlag = 0

        self.compoundStmtFlag = 0

        self.srcFileName = ""
        self.numLines = 0
        
    
    def ParseFile(self, srcFileName, bSLL=0)->List[Function]:
        ret = []
        try:
            antlrFileStream = FileStream(srcFileName, encoding='utf-8')
            lexer = JavaLexer(antlrFileStream)
            tokens = CommonTokenStream(lexer)
            parser = JavaParser(tokens)
            # parser.ruleNames
            parser.removeErrorListeners()

            sys.setrecursionlimit(2000)

            tree = parser.compilationUnit()

            # self._init(parser)
            # self.enableSLL = bSLL

            with open(srcFileName, 'r') as file:
                self.numLines = sum(1 for _ in file)
                
            self.srcFileName = srcFileName

                
            ParseTreeWalker.DEFAULT.walk(self, tree)

            for function_ in self.function_list:
                ret.append(function_)

        except Exception as e:
            print(e)
            return None

        return ret

    def enterEveryRule(self, ctx:ParserRuleContext):
        if type(ctx) == JavaParser.MethodDeclarationContext:
            self.funcDefFlag = 1
            self.functionInstance = Function(self.srcFileName)
            self.functionInstance.parentNumLoc = self.numLines
            self.functionInstance.funcId = len(self.function_list) + 1
            self.functionInstance.lineStart = ctx.start.line
            self.functionInstance.lineStop = ctx.stop.line
        elif self.funcDefFlag == 0:
            return
        elif type(ctx) == JavaParser.Method_nameContext:#TreeParser.IDX[TreeParser.FUNCTION_NAME]:
            self.funcNameFlag = 1
        elif type(ctx) == JavaParser.Paramater_nameContext:#TreeParser.IDX[TreeParser.PARAMETER_NAME]:
            self.paramNameFlag = 1
        elif type(ctx) == JavaParser.TypeTypeContext:#TreeParser.IDX[TreeParser.TYPE_NAME]:
            self.typeNameFlag = 1
        elif type(ctx) == JavaParser.MethodBodyContext:#TreeParser.IDX[TreeParser.COMPOUND_STMT]:
            self.compoundStmtFlag = 1

    def exitEveryRule(self, ctx:ParserRuleContext):
        # return
        # ruleIndex = ctx.getRuleIndex()

        if type(ctx) == JavaParser.MethodDeclarationContext and self.funcDefFlag != 0:#TreeParser.IDX[TreeParser.FUNCTION_DEF] and self.funcDefFlag != 0:
            self.funcDefFlag = 0
        elif type(ctx) == JavaParser.Method_nameContext and self.funcNameFlag != 0:#TreeParser.IDX[TreeParser.FUNCTION_NAME] and self.funcNameFlag != 0:
            self.functionInstance.name = self.funcNameStr.strip()
            self.funcNameFlag = 0
            self.funcNameStr = ""
        elif type(ctx) == JavaParser.Paramater_nameContext and self.paramNameFlag != 0:#TreeParser.IDX[TreeParser.PARAMETER_NAME] and self.paramNameFlag != 0:
            self.functionInstance.parameterList.append(self.paramNameStr.strip())
            self.paramNameFlag = 0
            self.paramNameStr = ""
        elif type(ctx) == JavaParser.TypeTypeContext and self.typeNameFlag != 0:#TreeParser.IDX[TreeParser.TYPE_NAME] and self.typeNameFlag != 0:
            self.functionInstance.dataTypeList.append(self.typeNameStr.strip())
            self.typeNameFlag = 0
            self.typeNameStr = ""
        elif type(ctx) == JavaParser.MethodBodyContext and self.compoundStmtFlag != 0:#TreeParser.IDX[TreeParser.COMPOUND_STMT] and self.compoundStmtFlag != 0:
            self.compoundStmtFlag = 0
            inputStream:InputStream = ctx.start.getInputStream()
            start_index = ctx.start.stop 
            stop_index = ctx.stop.stop 
            
            string = inputStream.getText(start_index + 1,stop_index - 1)
            line = ctx.start.line
            
            self.functionInstance.funcBody = string

            self.function_list.append(self.functionInstance)

    def visitTerminal(self, node):
        # return
        if self.compoundStmtFlag != 0 or self.funcDefFlag == 0:
            return
        elif self.funcNameFlag != 0:
            self.funcNameStr += Trees.getNodeText(node, JavaParser.ruleNames) + ' '
        elif self.paramNameFlag != 0:
            self.paramNameStr += Trees.getNodeText(node, JavaParser.ruleNames) + ' '
        elif self.typeNameFlag != 0:
            self.typeNameStr += Trees.getNodeText(node, JavaParser.ruleNames) + ' '

    def visitErrorNode(self, node):
        pass

    
    def test(self):
        print("testbegin")   
        funcObjs = self.ParseFile("/home/srb/wky/lab/ntu/Py-Func-Parser/input/java/hello.java")
        for funcObj in funcObjs:
            print("funcName=={}".format(funcObj.name))
            print("lineStart=={}".format(funcObj.lineStart))
            print("lineEnd=={}".format(funcObj.lineStop))
            print("dataType=={}".format(funcObj.dataTypeList))
            print("calleeFuncs=={}".format(funcObj.funcCalleeList))
            print("params=={}".format(funcObj.parameterList))
            print(funcObj.parentNumLoc)
            print(funcObj.funcBody)
            print("----------------------------------")
