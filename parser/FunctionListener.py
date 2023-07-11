# Generated from Function.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .FunctionParser import FunctionParser
else:
    from FunctionParser import FunctionParser

# This class defines a complete listener for a parse tree produced by FunctionParser.
class FunctionListener(ParseTreeListener):

    # Enter a parse tree produced by FunctionParser#statements.
    def enterStatements(self, ctx:FunctionParser.StatementsContext):
        pass

    # Exit a parse tree produced by FunctionParser#statements.
    def exitStatements(self, ctx:FunctionParser.StatementsContext):
        pass


    # Enter a parse tree produced by FunctionParser#statement.
    def enterStatement(self, ctx:FunctionParser.StatementContext):
        pass

    # Exit a parse tree produced by FunctionParser#statement.
    def exitStatement(self, ctx:FunctionParser.StatementContext):
        pass


    # Enter a parse tree produced by FunctionParser#pre_opener.
    def enterPre_opener(self, ctx:FunctionParser.Pre_openerContext):
        pass

    # Exit a parse tree produced by FunctionParser#pre_opener.
    def exitPre_opener(self, ctx:FunctionParser.Pre_openerContext):
        pass


    # Enter a parse tree produced by FunctionParser#pre_else.
    def enterPre_else(self, ctx:FunctionParser.Pre_elseContext):
        pass

    # Exit a parse tree produced by FunctionParser#pre_else.
    def exitPre_else(self, ctx:FunctionParser.Pre_elseContext):
        pass


    # Enter a parse tree produced by FunctionParser#pre_closer.
    def enterPre_closer(self, ctx:FunctionParser.Pre_closerContext):
        pass

    # Exit a parse tree produced by FunctionParser#pre_closer.
    def exitPre_closer(self, ctx:FunctionParser.Pre_closerContext):
        pass


    # Enter a parse tree produced by FunctionParser#opening_curly.
    def enterOpening_curly(self, ctx:FunctionParser.Opening_curlyContext):
        pass

    # Exit a parse tree produced by FunctionParser#opening_curly.
    def exitOpening_curly(self, ctx:FunctionParser.Opening_curlyContext):
        pass


    # Enter a parse tree produced by FunctionParser#closing_curly.
    def enterClosing_curly(self, ctx:FunctionParser.Closing_curlyContext):
        pass

    # Exit a parse tree produced by FunctionParser#closing_curly.
    def exitClosing_curly(self, ctx:FunctionParser.Closing_curlyContext):
        pass


    # Enter a parse tree produced by FunctionParser#block_starter.
    def enterBlock_starter(self, ctx:FunctionParser.Block_starterContext):
        pass

    # Exit a parse tree produced by FunctionParser#block_starter.
    def exitBlock_starter(self, ctx:FunctionParser.Block_starterContext):
        pass


    # Enter a parse tree produced by FunctionParser#Try_statement.
    def enterTry_statement(self, ctx:FunctionParser.Try_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#Try_statement.
    def exitTry_statement(self, ctx:FunctionParser.Try_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#Catch_statement.
    def enterCatch_statement(self, ctx:FunctionParser.Catch_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#Catch_statement.
    def exitCatch_statement(self, ctx:FunctionParser.Catch_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#If_statement.
    def enterIf_statement(self, ctx:FunctionParser.If_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#If_statement.
    def exitIf_statement(self, ctx:FunctionParser.If_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#Else_statement.
    def enterElse_statement(self, ctx:FunctionParser.Else_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#Else_statement.
    def exitElse_statement(self, ctx:FunctionParser.Else_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#Switch_statement.
    def enterSwitch_statement(self, ctx:FunctionParser.Switch_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#Switch_statement.
    def exitSwitch_statement(self, ctx:FunctionParser.Switch_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#For_statement.
    def enterFor_statement(self, ctx:FunctionParser.For_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#For_statement.
    def exitFor_statement(self, ctx:FunctionParser.For_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#Do_statement.
    def enterDo_statement(self, ctx:FunctionParser.Do_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#Do_statement.
    def exitDo_statement(self, ctx:FunctionParser.Do_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#While_statement.
    def enterWhile_statement(self, ctx:FunctionParser.While_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#While_statement.
    def exitWhile_statement(self, ctx:FunctionParser.While_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#do_statement1.
    def enterDo_statement1(self, ctx:FunctionParser.Do_statement1Context):
        pass

    # Exit a parse tree produced by FunctionParser#do_statement1.
    def exitDo_statement1(self, ctx:FunctionParser.Do_statement1Context):
        pass


    # Enter a parse tree produced by FunctionParser#for_init_statement.
    def enterFor_init_statement(self, ctx:FunctionParser.For_init_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#for_init_statement.
    def exitFor_init_statement(self, ctx:FunctionParser.For_init_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#breakStatement.
    def enterBreakStatement(self, ctx:FunctionParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by FunctionParser#breakStatement.
    def exitBreakStatement(self, ctx:FunctionParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by FunctionParser#continueStatement.
    def enterContinueStatement(self, ctx:FunctionParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by FunctionParser#continueStatement.
    def exitContinueStatement(self, ctx:FunctionParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by FunctionParser#gotoStatement.
    def enterGotoStatement(self, ctx:FunctionParser.GotoStatementContext):
        pass

    # Exit a parse tree produced by FunctionParser#gotoStatement.
    def exitGotoStatement(self, ctx:FunctionParser.GotoStatementContext):
        pass


    # Enter a parse tree produced by FunctionParser#returnStatement.
    def enterReturnStatement(self, ctx:FunctionParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by FunctionParser#returnStatement.
    def exitReturnStatement(self, ctx:FunctionParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by FunctionParser#label.
    def enterLabel(self, ctx:FunctionParser.LabelContext):
        pass

    # Exit a parse tree produced by FunctionParser#label.
    def exitLabel(self, ctx:FunctionParser.LabelContext):
        pass


    # Enter a parse tree produced by FunctionParser#expr_statement.
    def enterExpr_statement(self, ctx:FunctionParser.Expr_statementContext):
        pass

    # Exit a parse tree produced by FunctionParser#expr_statement.
    def exitExpr_statement(self, ctx:FunctionParser.Expr_statementContext):
        pass


    # Enter a parse tree produced by FunctionParser#condition.
    def enterCondition(self, ctx:FunctionParser.ConditionContext):
        pass

    # Exit a parse tree produced by FunctionParser#condition.
    def exitCondition(self, ctx:FunctionParser.ConditionContext):
        pass


    # Enter a parse tree produced by FunctionParser#unary_operator.
    def enterUnary_operator(self, ctx:FunctionParser.Unary_operatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#unary_operator.
    def exitUnary_operator(self, ctx:FunctionParser.Unary_operatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#relational_operator.
    def enterRelational_operator(self, ctx:FunctionParser.Relational_operatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#relational_operator.
    def exitRelational_operator(self, ctx:FunctionParser.Relational_operatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#constant.
    def enterConstant(self, ctx:FunctionParser.ConstantContext):
        pass

    # Exit a parse tree produced by FunctionParser#constant.
    def exitConstant(self, ctx:FunctionParser.ConstantContext):
        pass


    # Enter a parse tree produced by FunctionParser#function_decl_specifiers.
    def enterFunction_decl_specifiers(self, ctx:FunctionParser.Function_decl_specifiersContext):
        pass

    # Exit a parse tree produced by FunctionParser#function_decl_specifiers.
    def exitFunction_decl_specifiers(self, ctx:FunctionParser.Function_decl_specifiersContext):
        pass


    # Enter a parse tree produced by FunctionParser#ptr_operator.
    def enterPtr_operator(self, ctx:FunctionParser.Ptr_operatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#ptr_operator.
    def exitPtr_operator(self, ctx:FunctionParser.Ptr_operatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#access_specifier.
    def enterAccess_specifier(self, ctx:FunctionParser.Access_specifierContext):
        pass

    # Exit a parse tree produced by FunctionParser#access_specifier.
    def exitAccess_specifier(self, ctx:FunctionParser.Access_specifierContext):
        pass


    # Enter a parse tree produced by FunctionParser#operator.
    def enterOperator(self, ctx:FunctionParser.OperatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#operator.
    def exitOperator(self, ctx:FunctionParser.OperatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#assignment_operator.
    def enterAssignment_operator(self, ctx:FunctionParser.Assignment_operatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#assignment_operator.
    def exitAssignment_operator(self, ctx:FunctionParser.Assignment_operatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#equality_operator.
    def enterEquality_operator(self, ctx:FunctionParser.Equality_operatorContext):
        pass

    # Exit a parse tree produced by FunctionParser#equality_operator.
    def exitEquality_operator(self, ctx:FunctionParser.Equality_operatorContext):
        pass


    # Enter a parse tree produced by FunctionParser#template_decl_start.
    def enterTemplate_decl_start(self, ctx:FunctionParser.Template_decl_startContext):
        pass

    # Exit a parse tree produced by FunctionParser#template_decl_start.
    def exitTemplate_decl_start(self, ctx:FunctionParser.Template_decl_startContext):
        pass


    # Enter a parse tree produced by FunctionParser#template_param_list.
    def enterTemplate_param_list(self, ctx:FunctionParser.Template_param_listContext):
        pass

    # Exit a parse tree produced by FunctionParser#template_param_list.
    def exitTemplate_param_list(self, ctx:FunctionParser.Template_param_listContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_brackets.
    def enterNo_brackets(self, ctx:FunctionParser.No_bracketsContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_brackets.
    def exitNo_brackets(self, ctx:FunctionParser.No_bracketsContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_brackets_curlies_or_squares.
    def enterNo_brackets_curlies_or_squares(self, ctx:FunctionParser.No_brackets_curlies_or_squaresContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_brackets_curlies_or_squares.
    def exitNo_brackets_curlies_or_squares(self, ctx:FunctionParser.No_brackets_curlies_or_squaresContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_brackets_or_semicolon.
    def enterNo_brackets_or_semicolon(self, ctx:FunctionParser.No_brackets_or_semicolonContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_brackets_or_semicolon.
    def exitNo_brackets_or_semicolon(self, ctx:FunctionParser.No_brackets_or_semicolonContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_angle_brackets_or_brackets.
    def enterNo_angle_brackets_or_brackets(self, ctx:FunctionParser.No_angle_brackets_or_bracketsContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_angle_brackets_or_brackets.
    def exitNo_angle_brackets_or_brackets(self, ctx:FunctionParser.No_angle_brackets_or_bracketsContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_curlies.
    def enterNo_curlies(self, ctx:FunctionParser.No_curliesContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_curlies.
    def exitNo_curlies(self, ctx:FunctionParser.No_curliesContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_squares.
    def enterNo_squares(self, ctx:FunctionParser.No_squaresContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_squares.
    def exitNo_squares(self, ctx:FunctionParser.No_squaresContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_squares_or_semicolon.
    def enterNo_squares_or_semicolon(self, ctx:FunctionParser.No_squares_or_semicolonContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_squares_or_semicolon.
    def exitNo_squares_or_semicolon(self, ctx:FunctionParser.No_squares_or_semicolonContext):
        pass


    # Enter a parse tree produced by FunctionParser#no_comma_or_semicolon.
    def enterNo_comma_or_semicolon(self, ctx:FunctionParser.No_comma_or_semicolonContext):
        pass

    # Exit a parse tree produced by FunctionParser#no_comma_or_semicolon.
    def exitNo_comma_or_semicolon(self, ctx:FunctionParser.No_comma_or_semicolonContext):
        pass


    # Enter a parse tree produced by FunctionParser#assign_water.
    def enterAssign_water(self, ctx:FunctionParser.Assign_waterContext):
        pass

    # Exit a parse tree produced by FunctionParser#assign_water.
    def exitAssign_water(self, ctx:FunctionParser.Assign_waterContext):
        pass


    # Enter a parse tree produced by FunctionParser#assign_water_l2.
    def enterAssign_water_l2(self, ctx:FunctionParser.Assign_water_l2Context):
        pass

    # Exit a parse tree produced by FunctionParser#assign_water_l2.
    def exitAssign_water_l2(self, ctx:FunctionParser.Assign_water_l2Context):
        pass


    # Enter a parse tree produced by FunctionParser#water.
    def enterWater(self, ctx:FunctionParser.WaterContext):
        pass

    # Exit a parse tree produced by FunctionParser#water.
    def exitWater(self, ctx:FunctionParser.WaterContext):
        pass


    # Enter a parse tree produced by FunctionParser#expr.
    def enterExpr(self, ctx:FunctionParser.ExprContext):
        pass

    # Exit a parse tree produced by FunctionParser#expr.
    def exitExpr(self, ctx:FunctionParser.ExprContext):
        pass


    # Enter a parse tree produced by FunctionParser#assign_expr.
    def enterAssign_expr(self, ctx:FunctionParser.Assign_exprContext):
        pass

    # Exit a parse tree produced by FunctionParser#assign_expr.
    def exitAssign_expr(self, ctx:FunctionParser.Assign_exprContext):
        pass


    # Enter a parse tree produced by FunctionParser#normOr.
    def enterNormOr(self, ctx:FunctionParser.NormOrContext):
        pass

    # Exit a parse tree produced by FunctionParser#normOr.
    def exitNormOr(self, ctx:FunctionParser.NormOrContext):
        pass


    # Enter a parse tree produced by FunctionParser#cndExpr.
    def enterCndExpr(self, ctx:FunctionParser.CndExprContext):
        pass

    # Exit a parse tree produced by FunctionParser#cndExpr.
    def exitCndExpr(self, ctx:FunctionParser.CndExprContext):
        pass


    # Enter a parse tree produced by FunctionParser#or_expression.
    def enterOr_expression(self, ctx:FunctionParser.Or_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#or_expression.
    def exitOr_expression(self, ctx:FunctionParser.Or_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#and_expression.
    def enterAnd_expression(self, ctx:FunctionParser.And_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#and_expression.
    def exitAnd_expression(self, ctx:FunctionParser.And_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#inclusive_or_expression.
    def enterInclusive_or_expression(self, ctx:FunctionParser.Inclusive_or_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#inclusive_or_expression.
    def exitInclusive_or_expression(self, ctx:FunctionParser.Inclusive_or_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#exclusive_or_expression.
    def enterExclusive_or_expression(self, ctx:FunctionParser.Exclusive_or_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#exclusive_or_expression.
    def exitExclusive_or_expression(self, ctx:FunctionParser.Exclusive_or_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#bit_and_expression.
    def enterBit_and_expression(self, ctx:FunctionParser.Bit_and_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#bit_and_expression.
    def exitBit_and_expression(self, ctx:FunctionParser.Bit_and_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#equality_expression.
    def enterEquality_expression(self, ctx:FunctionParser.Equality_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#equality_expression.
    def exitEquality_expression(self, ctx:FunctionParser.Equality_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#relational_expression.
    def enterRelational_expression(self, ctx:FunctionParser.Relational_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#relational_expression.
    def exitRelational_expression(self, ctx:FunctionParser.Relational_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#shift_expression.
    def enterShift_expression(self, ctx:FunctionParser.Shift_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#shift_expression.
    def exitShift_expression(self, ctx:FunctionParser.Shift_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#additive_expression.
    def enterAdditive_expression(self, ctx:FunctionParser.Additive_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#additive_expression.
    def exitAdditive_expression(self, ctx:FunctionParser.Additive_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#multiplicative_expression.
    def enterMultiplicative_expression(self, ctx:FunctionParser.Multiplicative_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#multiplicative_expression.
    def exitMultiplicative_expression(self, ctx:FunctionParser.Multiplicative_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#cast_expression.
    def enterCast_expression(self, ctx:FunctionParser.Cast_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#cast_expression.
    def exitCast_expression(self, ctx:FunctionParser.Cast_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#cast_target.
    def enterCast_target(self, ctx:FunctionParser.Cast_targetContext):
        pass

    # Exit a parse tree produced by FunctionParser#cast_target.
    def exitCast_target(self, ctx:FunctionParser.Cast_targetContext):
        pass


    # Enter a parse tree produced by FunctionParser#unary_expression.
    def enterUnary_expression(self, ctx:FunctionParser.Unary_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#unary_expression.
    def exitUnary_expression(self, ctx:FunctionParser.Unary_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#new_expression.
    def enterNew_expression(self, ctx:FunctionParser.New_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#new_expression.
    def exitNew_expression(self, ctx:FunctionParser.New_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#unary_op_and_cast_expr.
    def enterUnary_op_and_cast_expr(self, ctx:FunctionParser.Unary_op_and_cast_exprContext):
        pass

    # Exit a parse tree produced by FunctionParser#unary_op_and_cast_expr.
    def exitUnary_op_and_cast_expr(self, ctx:FunctionParser.Unary_op_and_cast_exprContext):
        pass


    # Enter a parse tree produced by FunctionParser#sizeof_expression.
    def enterSizeof_expression(self, ctx:FunctionParser.Sizeof_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#sizeof_expression.
    def exitSizeof_expression(self, ctx:FunctionParser.Sizeof_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#sizeof.
    def enterSizeof(self, ctx:FunctionParser.SizeofContext):
        pass

    # Exit a parse tree produced by FunctionParser#sizeof.
    def exitSizeof(self, ctx:FunctionParser.SizeofContext):
        pass


    # Enter a parse tree produced by FunctionParser#sizeof_operand.
    def enterSizeof_operand(self, ctx:FunctionParser.Sizeof_operandContext):
        pass

    # Exit a parse tree produced by FunctionParser#sizeof_operand.
    def exitSizeof_operand(self, ctx:FunctionParser.Sizeof_operandContext):
        pass


    # Enter a parse tree produced by FunctionParser#sizeof_operand2.
    def enterSizeof_operand2(self, ctx:FunctionParser.Sizeof_operand2Context):
        pass

    # Exit a parse tree produced by FunctionParser#sizeof_operand2.
    def exitSizeof_operand2(self, ctx:FunctionParser.Sizeof_operand2Context):
        pass


    # Enter a parse tree produced by FunctionParser#inc_dec.
    def enterInc_dec(self, ctx:FunctionParser.Inc_decContext):
        pass

    # Exit a parse tree produced by FunctionParser#inc_dec.
    def exitInc_dec(self, ctx:FunctionParser.Inc_decContext):
        pass


    # Enter a parse tree produced by FunctionParser#memberAccess.
    def enterMemberAccess(self, ctx:FunctionParser.MemberAccessContext):
        pass

    # Exit a parse tree produced by FunctionParser#memberAccess.
    def exitMemberAccess(self, ctx:FunctionParser.MemberAccessContext):
        pass


    # Enter a parse tree produced by FunctionParser#incDecOp.
    def enterIncDecOp(self, ctx:FunctionParser.IncDecOpContext):
        pass

    # Exit a parse tree produced by FunctionParser#incDecOp.
    def exitIncDecOp(self, ctx:FunctionParser.IncDecOpContext):
        pass


    # Enter a parse tree produced by FunctionParser#primaryOnly.
    def enterPrimaryOnly(self, ctx:FunctionParser.PrimaryOnlyContext):
        pass

    # Exit a parse tree produced by FunctionParser#primaryOnly.
    def exitPrimaryOnly(self, ctx:FunctionParser.PrimaryOnlyContext):
        pass


    # Enter a parse tree produced by FunctionParser#funcCall.
    def enterFuncCall(self, ctx:FunctionParser.FuncCallContext):
        pass

    # Exit a parse tree produced by FunctionParser#funcCall.
    def exitFuncCall(self, ctx:FunctionParser.FuncCallContext):
        pass


    # Enter a parse tree produced by FunctionParser#arrayIndexing.
    def enterArrayIndexing(self, ctx:FunctionParser.ArrayIndexingContext):
        pass

    # Exit a parse tree produced by FunctionParser#arrayIndexing.
    def exitArrayIndexing(self, ctx:FunctionParser.ArrayIndexingContext):
        pass


    # Enter a parse tree produced by FunctionParser#ptrMemberAccess.
    def enterPtrMemberAccess(self, ctx:FunctionParser.PtrMemberAccessContext):
        pass

    # Exit a parse tree produced by FunctionParser#ptrMemberAccess.
    def exitPtrMemberAccess(self, ctx:FunctionParser.PtrMemberAccessContext):
        pass


    # Enter a parse tree produced by FunctionParser#function_argument_list.
    def enterFunction_argument_list(self, ctx:FunctionParser.Function_argument_listContext):
        pass

    # Exit a parse tree produced by FunctionParser#function_argument_list.
    def exitFunction_argument_list(self, ctx:FunctionParser.Function_argument_listContext):
        pass


    # Enter a parse tree produced by FunctionParser#function_argument.
    def enterFunction_argument(self, ctx:FunctionParser.Function_argumentContext):
        pass

    # Exit a parse tree produced by FunctionParser#function_argument.
    def exitFunction_argument(self, ctx:FunctionParser.Function_argumentContext):
        pass


    # Enter a parse tree produced by FunctionParser#primary_expression.
    def enterPrimary_expression(self, ctx:FunctionParser.Primary_expressionContext):
        pass

    # Exit a parse tree produced by FunctionParser#primary_expression.
    def exitPrimary_expression(self, ctx:FunctionParser.Primary_expressionContext):
        pass


    # Enter a parse tree produced by FunctionParser#initDeclWithCall.
    def enterInitDeclWithCall(self, ctx:FunctionParser.InitDeclWithCallContext):
        pass

    # Exit a parse tree produced by FunctionParser#initDeclWithCall.
    def exitInitDeclWithCall(self, ctx:FunctionParser.InitDeclWithCallContext):
        pass


    # Enter a parse tree produced by FunctionParser#initDeclWithAssign.
    def enterInitDeclWithAssign(self, ctx:FunctionParser.InitDeclWithAssignContext):
        pass

    # Exit a parse tree produced by FunctionParser#initDeclWithAssign.
    def exitInitDeclWithAssign(self, ctx:FunctionParser.InitDeclWithAssignContext):
        pass


    # Enter a parse tree produced by FunctionParser#initDeclSimple.
    def enterInitDeclSimple(self, ctx:FunctionParser.InitDeclSimpleContext):
        pass

    # Exit a parse tree produced by FunctionParser#initDeclSimple.
    def exitInitDeclSimple(self, ctx:FunctionParser.InitDeclSimpleContext):
        pass


    # Enter a parse tree produced by FunctionParser#declarator.
    def enterDeclarator(self, ctx:FunctionParser.DeclaratorContext):
        pass

    # Exit a parse tree produced by FunctionParser#declarator.
    def exitDeclarator(self, ctx:FunctionParser.DeclaratorContext):
        pass


    # Enter a parse tree produced by FunctionParser#type_suffix.
    def enterType_suffix(self, ctx:FunctionParser.Type_suffixContext):
        pass

    # Exit a parse tree produced by FunctionParser#type_suffix.
    def exitType_suffix(self, ctx:FunctionParser.Type_suffixContext):
        pass


    # Enter a parse tree produced by FunctionParser#simple_decl.
    def enterSimple_decl(self, ctx:FunctionParser.Simple_declContext):
        pass

    # Exit a parse tree produced by FunctionParser#simple_decl.
    def exitSimple_decl(self, ctx:FunctionParser.Simple_declContext):
        pass


    # Enter a parse tree produced by FunctionParser#declByClass.
    def enterDeclByClass(self, ctx:FunctionParser.DeclByClassContext):
        pass

    # Exit a parse tree produced by FunctionParser#declByClass.
    def exitDeclByClass(self, ctx:FunctionParser.DeclByClassContext):
        pass


    # Enter a parse tree produced by FunctionParser#declByType.
    def enterDeclByType(self, ctx:FunctionParser.DeclByTypeContext):
        pass

    # Exit a parse tree produced by FunctionParser#declByType.
    def exitDeclByType(self, ctx:FunctionParser.DeclByTypeContext):
        pass


    # Enter a parse tree produced by FunctionParser#init_declarator_list.
    def enterInit_declarator_list(self, ctx:FunctionParser.Init_declarator_listContext):
        pass

    # Exit a parse tree produced by FunctionParser#init_declarator_list.
    def exitInit_declarator_list(self, ctx:FunctionParser.Init_declarator_listContext):
        pass


    # Enter a parse tree produced by FunctionParser#initializer.
    def enterInitializer(self, ctx:FunctionParser.InitializerContext):
        pass

    # Exit a parse tree produced by FunctionParser#initializer.
    def exitInitializer(self, ctx:FunctionParser.InitializerContext):
        pass


    # Enter a parse tree produced by FunctionParser#initializer_list.
    def enterInitializer_list(self, ctx:FunctionParser.Initializer_listContext):
        pass

    # Exit a parse tree produced by FunctionParser#initializer_list.
    def exitInitializer_list(self, ctx:FunctionParser.Initializer_listContext):
        pass


    # Enter a parse tree produced by FunctionParser#class_def.
    def enterClass_def(self, ctx:FunctionParser.Class_defContext):
        pass

    # Exit a parse tree produced by FunctionParser#class_def.
    def exitClass_def(self, ctx:FunctionParser.Class_defContext):
        pass


    # Enter a parse tree produced by FunctionParser#class_name.
    def enterClass_name(self, ctx:FunctionParser.Class_nameContext):
        pass

    # Exit a parse tree produced by FunctionParser#class_name.
    def exitClass_name(self, ctx:FunctionParser.Class_nameContext):
        pass


    # Enter a parse tree produced by FunctionParser#base_classes.
    def enterBase_classes(self, ctx:FunctionParser.Base_classesContext):
        pass

    # Exit a parse tree produced by FunctionParser#base_classes.
    def exitBase_classes(self, ctx:FunctionParser.Base_classesContext):
        pass


    # Enter a parse tree produced by FunctionParser#base_class.
    def enterBase_class(self, ctx:FunctionParser.Base_classContext):
        pass

    # Exit a parse tree produced by FunctionParser#base_class.
    def exitBase_class(self, ctx:FunctionParser.Base_classContext):
        pass


    # Enter a parse tree produced by FunctionParser#type_name.
    def enterType_name(self, ctx:FunctionParser.Type_nameContext):
        pass

    # Exit a parse tree produced by FunctionParser#type_name.
    def exitType_name(self, ctx:FunctionParser.Type_nameContext):
        pass


    # Enter a parse tree produced by FunctionParser#base_type.
    def enterBase_type(self, ctx:FunctionParser.Base_typeContext):
        pass

    # Exit a parse tree produced by FunctionParser#base_type.
    def exitBase_type(self, ctx:FunctionParser.Base_typeContext):
        pass


    # Enter a parse tree produced by FunctionParser#param_decl_specifiers.
    def enterParam_decl_specifiers(self, ctx:FunctionParser.Param_decl_specifiersContext):
        pass

    # Exit a parse tree produced by FunctionParser#param_decl_specifiers.
    def exitParam_decl_specifiers(self, ctx:FunctionParser.Param_decl_specifiersContext):
        pass


    # Enter a parse tree produced by FunctionParser#parameter_name.
    def enterParameter_name(self, ctx:FunctionParser.Parameter_nameContext):
        pass

    # Exit a parse tree produced by FunctionParser#parameter_name.
    def exitParameter_name(self, ctx:FunctionParser.Parameter_nameContext):
        pass


    # Enter a parse tree produced by FunctionParser#param_type_list.
    def enterParam_type_list(self, ctx:FunctionParser.Param_type_listContext):
        pass

    # Exit a parse tree produced by FunctionParser#param_type_list.
    def exitParam_type_list(self, ctx:FunctionParser.Param_type_listContext):
        pass


    # Enter a parse tree produced by FunctionParser#param_type.
    def enterParam_type(self, ctx:FunctionParser.Param_typeContext):
        pass

    # Exit a parse tree produced by FunctionParser#param_type.
    def exitParam_type(self, ctx:FunctionParser.Param_typeContext):
        pass


    # Enter a parse tree produced by FunctionParser#param_type_id.
    def enterParam_type_id(self, ctx:FunctionParser.Param_type_idContext):
        pass

    # Exit a parse tree produced by FunctionParser#param_type_id.
    def exitParam_type_id(self, ctx:FunctionParser.Param_type_idContext):
        pass


    # Enter a parse tree produced by FunctionParser#identifier.
    def enterIdentifier(self, ctx:FunctionParser.IdentifierContext):
        pass

    # Exit a parse tree produced by FunctionParser#identifier.
    def exitIdentifier(self, ctx:FunctionParser.IdentifierContext):
        pass


    # Enter a parse tree produced by FunctionParser#number.
    def enterNumber(self, ctx:FunctionParser.NumberContext):
        pass

    # Exit a parse tree produced by FunctionParser#number.
    def exitNumber(self, ctx:FunctionParser.NumberContext):
        pass


    # Enter a parse tree produced by FunctionParser#ptrs.
    def enterPtrs(self, ctx:FunctionParser.PtrsContext):
        pass

    # Exit a parse tree produced by FunctionParser#ptrs.
    def exitPtrs(self, ctx:FunctionParser.PtrsContext):
        pass



del FunctionParser