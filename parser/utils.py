import sys
import antlr4

from antlr4 import *
from antlr4.tree.Trees import Trees
from antlr4.tree.Tree import TerminalNodeImpl
from antlr4.error.ErrorListener import ErrorListener

from antlr4.InputStream import InputStream
from antlr4.CommonTokenStream import CommonTokenStream
from antlr4.atn.PredictionMode import PredictionMode
from antlr4.Token import CommonToken

from c.FunctionParser import FunctionParser
from c.FunctionLexer import FunctionLexer


class Function:
    def __init__(self, fileName):
        self.parentFile = fileName
        self.parentNumLoc = 0
        self.name = ""
        self.lineStart = 0
        self.lineStop = 0
        self.funcId = 0
        self.funcBody = ""
        self.parameterList = []
        self.variableList = []
        self.dataTypeList = []
        self.funcCalleeList = []
        self.operands = []
        self.operators = []

    def __str__(self):
        ret = "\r\0?\r?\0\r\n"  # function string start
        ret += self.parentFile + "\n"
        ret += str(self.parentNumLoc) + "\n"
        ret += self.name + "\n"
        ret += str(self.lineStart) + "\t" + str(self.lineStop) + "\n"
        ret += str(self.funcId) + "\n"

        for s in self.parameterList:
            ret += s + "\t"
        ret += "\n"

        for s in self.variableList:
            ret += s + "\t"
        ret += "\n"

        for s in self.dataTypeList:
            ret += s + "\t"
        ret += "\n"

        for s in self.funcCalleeList:
            ret += s + "\t"
        ret += "\n"

        ret += self.funcBody + "\n"

        return ret

class BodyParser(ParseTreeListener):
    IS_FIRST = 1

    FUNCTION_DEF = 0
    FUNCTION_NAME = 1
    PARAMETER_NAME = 2
    DECLARATOR = 3
    TYPE_NAME = 4
    FUNCTION_CALL = 5
    COMPOUND_STMT = 6
    

    table = ["function_def", "function_name", "parameter_name", "declarator", "type_name", "identifier", "compound_statement"]
    IDX = [0, 0, 0, 0, 0, 0, 0]

    ruleNames = None

    def __init__(self):
        self.functionInstance:Function = None
        self.defaultLine = 0
        
        self.declaratorFlag = 0
        self.declaratorStr = ""
        
        self.typeNameFlag = 0
        self.typeNameStr = ""
        
        self.funcCallFlag = 0
        self.funcCallStr = ""
        #set ssl option. ssl是什么
        self.enableSLL = 0

    def _init(self, parser:FunctionParser):
        self.functionInstance = None
        self.defaultLine = 0
        
        self.declaratorFlag = 0
        self.declaratorStr = ""
        
        self.typeNameFlag = 0
        self.typeNameStr = ""
        
        self.funcCallFlag = 0
        self.funcCallStr = ""
        
        self.enableSLL = 0

        if BodyParser.IS_FIRST != 0:
            self.ruleNames = parser.ruleNames

            for i in range(len(parser.ruleNames)):
                for j in range(len(BodyParser.table)):
                    if parser.ruleNames[i] == BodyParser.table[j]:
                        BodyParser.IDX[j] = i

            BodyParser.IS_FIRST = 0

    def ParseString(self, string, functionInstance, line=0, bSLL=0):
        input = InputStream(string)
        lexer = FunctionLexer(input)
        tokens = CommonTokenStream(lexer)
        parser = FunctionParser(tokens)
        parser.removeErrorListeners()
        

        if bSLL != 0:
            parser._interp.predictionMode = PredictionMode.SLL
            parser._errHandler = BailErrorStrategy()

        tree = parser.statements()


        self._init(parser)
        self.enableSLL = bSLL
        self.functionInstance = functionInstance

        if line != 0:
            self.defaultLine = line - 1

        ParseTreeWalker.DEFAULT.walk(self, tree)

    def enterEveryRule(self, ctx:ParserRuleContext):
        ruleIndex = ctx.getRuleIndex()

        if ruleIndex == BodyParser.IDX[BodyParser.DECLARATOR]:
            self.declaratorFlag = 1
        elif ruleIndex == BodyParser.IDX[BodyParser.TYPE_NAME]:
            self.typeNameFlag = 1
        elif type(ctx) == FunctionParser.FuncCallContext:
            self.funcCallFlag = 1

    def exitEveryRule(self, ctx:ParserRuleContext):
        ruleIndex = ctx.getRuleIndex()

        if ruleIndex == BodyParser.IDX[BodyParser.DECLARATOR] and self.declaratorFlag != 0:
            self.functionInstance.variableList.append(self.declaratorStr.strip())
            self.declaratorFlag = 0
            self.declaratorStr = ""
        elif ruleIndex == BodyParser.IDX[BodyParser.TYPE_NAME] and self.typeNameFlag != 0:
            self.functionInstance.dataTypeList.append(self.typeNameStr.strip())
            self.typeNameFlag = 0
            self.typeNameStr = ""
        elif ruleIndex == BodyParser.IDX[BodyParser.FUNCTION_CALL] and self.funcCallFlag != 0:
            if self.funcCallFlag == 2:
                self.functionInstance.funcCalleeList.append(self.funcCallStr.strip())
            self.funcCallFlag = 0
            self.funcCallStr = ""

            if self.declaratorFlag != 0:
                self.functionInstance.variableList.append(self.declaratorStr.strip())
                self.declaratorFlag = 0
                self.declaratorStr = ""

    def visitTerminal(self, node:TerminalNodeImpl):        
        
        if self.declaratorFlag != 0:
            tmpText = Trees.getNodeText(node, self.ruleNames)
            if tmpText != "*":
                self.declaratorStr += tmpText
                self.declaratorStr += ' '
                
        elif self.typeNameFlag != 0:
            self.typeNameStr += Trees.getNodeText(node, self.ruleNames)
            self.typeNameStr += ' '
        elif self.funcCallFlag != 0:
            try:
                p1:TerminalNodeImpl = node 
                p1 = p1.getParent()
                if isinstance(p1, FunctionParser.IdentifierContext):
                    self.funcCallStr += Trees.getNodeText(node, self.ruleNames)
                    self.funcCallStr += ' '
                    self.funcCallFlag = 2
            except Exception as e:
                print(e)
                pass

    def visitErrorNode(self, node):
        pass

class JobInstance:
    def __init__(self,s:str,function:Function,l:int,e:int):
        self.string = s
        self.functionInstance = function
        self.line = l
        self.enableSLL = e
    
    def __call__(self) -> Function:
        p = BodyParser()
        p.ParseString(self.string, self.functionInstance, self.line, self.enableSLL)
        return self.functionInstance
        