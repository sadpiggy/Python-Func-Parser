import sys
import antlr4

from antlr4 import *
from antlr4.tree.Trees import Trees
from antlr4.error.ErrorListener import ErrorListener

from antlr4.InputStream import InputStream
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.atn.PredictionMode import PredictionMode

from ModuleLexer import ModuleLexer
from ModuleParser import ModuleParser
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
    use_multi_thread = 0

    table = ["function_def", "function_name", "parameter_name",
             "declarator", "type_name", "identifier", "compound_statement"]
    IDX = [0, 0, 0, 0, 0, 0, 0]

    ruleNames = []

    def __init__(self):
        super().__init__()

        self.executorService:futures.ThreadPoolExecutor = None
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
        # what is ssl?
        self.enableSLL = 0

    # 
    def _init(self, parser:ModuleParser):
        self.executorService = futures.ThreadPoolExecutor(max_workers=multiprocessing.cpu_count())

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
            
            # print("after removeErrorListeners")
            
            #也不知道对不对
            if bSLL != 0:
                parser._interp.predictionMode = PredictionMode.SLL
                parser._errHandler = BailErrorStrategy()
                # parser.getInterpreter().setPredictionMode(PredictionMode.SLL)
                # parser.setErrorHandler(BailErrorStrategy())

            #和原版相比，缺少一个错误处理（python版或者此版本antlr，没有这个类）
            tree = parser.code()
            # print("before initparser")
            self._init(parser)
            # print("after initparser")
            self.enableSLL = bSLL

            with open(srcFileName, 'r') as file:
                self.numLines = sum(1 for _ in file)
                
            # print("numLines: ", self.numLines)


            self.srcFileName = srcFileName


            ParseTreeWalker.DEFAULT.walk(self, tree)

            for function_ in self.function_list:
                #修改future.get()为future.result()
                ret.append(function_)

        except Exception as e:
            # e.printStackTrace() 没有这个函数，也不知道替代品
            print(e)
            self.executorService.shutdown()
            return None

        self.executorService.shutdown()
        return ret

    def enterEveryRule(self, ctx:ParserRuleContext):
        # print("enter")
        ruleIndex = ctx.getRuleIndex()

        if ruleIndex == TreeParser.IDX[TreeParser.FUNCTION_DEF]:
            self.funcDefFlag = 1
            self.functionInstance = Function(self.srcFileName)
            self.functionInstance.parentNumLoc = self.numLines
            self.functionInstance.funcId = len(self.function_list) + 1
            self.functionInstance.lineStart = ctx.start.line#ctx.getStart().getLine()
            self.functionInstance.lineStop = ctx.stop.line#ctx.getStop().getLine()
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
        # print("exit")
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
            # 猜的，不知道是不是InputStream
            inputStream:InputStream = ctx.start.getInputStream()
            #修改
            start_index = ctx.start.stop #ctx.start.getStopIndex()
            stop_index = ctx.stop.stop #ctx.stop.getStopIndex();
            
            # string = inputStream.getText(Interval(start_index + 1, stop_index - 1))
            string = inputStream.getText(start_index + 1,stop_index - 1)
            line = ctx.start.line
            
            self.functionInstance.funcBody = string

            # self.function_list.append(
            #     self.executorService.submit(JobInstance(string, self.functionInstance, line, self.enableSLL)).result()
            # )
            if TreeParser.collect_callee == 1:
                if TreeParser.use_multi_thread == 1:
                    self.executorService.submit(JobInstance(string, self.functionInstance, line, self.enableSLL))
                else:
                    p = utils.BodyParser()
                    p.ParseString(string, self.functionInstance, line, self.enableSLL)
                    
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
    funcObjs:List[Function] =  parser.ParseFile("../debugInput/error.c")
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
    