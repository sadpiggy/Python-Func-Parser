import sys
import antlr4

from antlr4 import *
from antlr4.tree.Trees import Trees
from antlr4.error.ErrorListener import ErrorListener

from antlr4.InputStream import InputStream
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.atn.PredictionMode import PredictionMode

from c.ModuleLexer import ModuleLexer
from c.ModuleParser import ModuleParser
from utils import Function, JobInstance

from concurrent import futures
import multiprocessing
import utils

from typing import List




class TreeParser(ParseTreeListener):
    IS_FIRST = 1
    FUNCTION_DEF = 0
    FUNCTION_NAME = 1
    PARAMETER_NAME = 2
    DECLARATOR = 3
    TYPE_NAME = 4
    FUNCTION_CALL = 5
    COMPOUND_STMT = 6
    
    collect_callee = 0
    # use_multi_thread = 0

    table = ["function_def", "function_name", "parameter_name",
             "declarator", "type_name", "identifier", "compound_statement"]
    IDX = [0, 0, 0, 0, 0, 0, 0]

    ruleNames = []

    def __init__(self):
        super().__init__()

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
        
        self.enableSLL = 0

    def _init(self, parser:ModuleParser):

        self.functionInstance = None

        self.funcNameFlag = 0
        self.funcNameStr = ""

        self.paramNameFlag = 0
        self.paramNameStr = ""

        self.typeNameFlag = 0
        self.typeNameStr = ""

        self.funcDefFlag = 0

        self.compoundStmtFlag = 0

        self.enableSLL = 0

        if self.IS_FIRST != 0:
            self.ruleNames = parser.ruleNames

            for i in range(len(parser.ruleNames)):
                for j in range(len(TreeParser.table)):
                    if parser.ruleNames[i] == TreeParser.table[j]:
                        TreeParser.IDX[j] = i

        self.IS_FIRST = 0

    def ParseFile(self, srcFileName, bSLL=0)->List[Function]:
        ret = []
        try:
            antlrFileStream = FileStream(srcFileName, encoding='utf-8')
            lexer = ModuleLexer(antlrFileStream)
            tokens = CommonTokenStream(lexer)
            parser = ModuleParser(tokens)
            parser.removeErrorListeners()

            sys.setrecursionlimit(2000)
            tree = parser.code()
            self._init(parser)
            self.enableSLL = bSLL

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
        ruleIndex = ctx.getRuleIndex()

        if ruleIndex == TreeParser.IDX[TreeParser.FUNCTION_DEF]:
            self.funcDefFlag = 1
            self.functionInstance = Function(self.srcFileName)
            self.functionInstance.parentNumLoc = self.numLines
            self.functionInstance.funcId = len(self.function_list) + 1
            self.functionInstance.lineStart = ctx.start.line
            self.functionInstance.lineStop = ctx.stop.line
        elif self.funcDefFlag == 0:
            return
        elif ruleIndex == TreeParser.IDX[TreeParser.FUNCTION_NAME]:
            self.funcNameFlag = 1
        elif ruleIndex == TreeParser.IDX[TreeParser.PARAMETER_NAME]:
            self.paramNameFlag = 1
        elif ruleIndex == TreeParser.IDX[TreeParser.TYPE_NAME]:
            self.typeNameFlag = 1
        elif ruleIndex == TreeParser.IDX[TreeParser.COMPOUND_STMT]:
            self.compoundStmtFlag = 1

    def exitEveryRule(self, ctx:ParserRuleContext):
        ruleIndex = ctx.getRuleIndex()

        if ruleIndex == TreeParser.IDX[TreeParser.FUNCTION_DEF] and self.funcDefFlag != 0:
            self.funcDefFlag = 0
        elif ruleIndex == TreeParser.IDX[TreeParser.FUNCTION_NAME] and self.funcNameFlag != 0:
            self.functionInstance.name = self.funcNameStr.strip()
            self.funcNameFlag = 0
            self.funcNameStr = ""
        elif ruleIndex == TreeParser.IDX[TreeParser.PARAMETER_NAME] and self.paramNameFlag != 0:
            self.functionInstance.parameterList.append(self.paramNameStr.strip())
            self.paramNameFlag = 0
            self.paramNameStr = ""
        elif ruleIndex == TreeParser.IDX[TreeParser.TYPE_NAME] and self.typeNameFlag != 0:
            self.functionInstance.dataTypeList.append(self.typeNameStr.strip())
            self.typeNameFlag = 0
            self.typeNameStr = ""
        elif ruleIndex == TreeParser.IDX[TreeParser.COMPOUND_STMT] and self.compoundStmtFlag != 0:
            self.compoundStmtFlag = 0
            inputStream:InputStream = ctx.start.getInputStream()
            start_index = ctx.start.stop 
            stop_index = ctx.stop.stop 
            
            string = inputStream.getText(start_index + 1,stop_index - 1)
            line = ctx.start.line
            
            self.functionInstance.funcBody = string

            # if TreeParser.collect_callee == 1:
            #     p = utils.BodyParser()
            #     p.ParseString(string, self.functionInstance, line, self.enableSLL)
                    
            self.function_list.append(self.functionInstance)

    def visitTerminal(self, node):
        if self.compoundStmtFlag != 0 or self.funcDefFlag == 0:
            return
        elif self.funcNameFlag != 0:
            self.funcNameStr += Trees.getNodeText(node, self.ruleNames) + ' '
        elif self.paramNameFlag != 0:
            self.paramNameStr += Trees.getNodeText(node, self.ruleNames) + ' '
        elif self.typeNameFlag != 0:
            self.typeNameStr += Trees.getNodeText(node, self.ruleNames) + ' '

    def visitErrorNode(self, node):
        pass

if __name__ == "__main__":
    parser = TreeParser()
    funcObjs:List[Function] =  parser.ParseFile("../../input/test/test.c")
    for funcObj in funcObjs:
        print(funcObj.name)
        print(funcObj.lineStart)
        print(funcObj.lineStop)
        print(funcObj.dataTypeList)
        print(funcObj.funcCalleeList)
        print(funcObj.parameterList)
        print(funcObj.parentNumLoc)
        print(funcObj.funcBody)
        print("----------------------------------")
    