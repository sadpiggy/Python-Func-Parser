# Generated from Module.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ModuleParser import ModuleParser
else:
    from ModuleParser import ModuleParser

# This class defines a complete listener for a parse tree produced by ModuleParser.
class ModuleListener(ParseTreeListener):

    # Enter a parse tree produced by ModuleParser#code.
    def enterCode(self, ctx:ModuleParser.CodeContext):
        pass

    # Exit a parse tree produced by ModuleParser#code.
    def exitCode(self, ctx:ModuleParser.CodeContext):
        pass


    # Enter a parse tree produced by ModuleParser#using_directive.
    def enterUsing_directive(self, ctx:ModuleParser.Using_directiveContext):
        pass

    # Exit a parse tree produced by ModuleParser#using_directive.
    def exitUsing_directive(self, ctx:ModuleParser.Using_directiveContext):
        pass


    # Enter a parse tree produced by ModuleParser#expr.
    def enterExpr(self, ctx:ModuleParser.ExprContext):
        pass

    # Exit a parse tree produced by ModuleParser#expr.
    def exitExpr(self, ctx:ModuleParser.ExprContext):
        pass


    # Enter a parse tree produced by ModuleParser#assign_expr.
    def enterAssign_expr(self, ctx:ModuleParser.Assign_exprContext):
        pass

    # Exit a parse tree produced by ModuleParser#assign_expr.
    def exitAssign_expr(self, ctx:ModuleParser.Assign_exprContext):
        pass


    # Enter a parse tree produced by ModuleParser#normOr.
    def enterNormOr(self, ctx:ModuleParser.NormOrContext):
        pass

    # Exit a parse tree produced by ModuleParser#normOr.
    def exitNormOr(self, ctx:ModuleParser.NormOrContext):
        pass


    # Enter a parse tree produced by ModuleParser#cndExpr.
    def enterCndExpr(self, ctx:ModuleParser.CndExprContext):
        pass

    # Exit a parse tree produced by ModuleParser#cndExpr.
    def exitCndExpr(self, ctx:ModuleParser.CndExprContext):
        pass


    # Enter a parse tree produced by ModuleParser#or_expression.
    def enterOr_expression(self, ctx:ModuleParser.Or_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#or_expression.
    def exitOr_expression(self, ctx:ModuleParser.Or_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#and_expression.
    def enterAnd_expression(self, ctx:ModuleParser.And_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#and_expression.
    def exitAnd_expression(self, ctx:ModuleParser.And_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#inclusive_or_expression.
    def enterInclusive_or_expression(self, ctx:ModuleParser.Inclusive_or_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#inclusive_or_expression.
    def exitInclusive_or_expression(self, ctx:ModuleParser.Inclusive_or_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#exclusive_or_expression.
    def enterExclusive_or_expression(self, ctx:ModuleParser.Exclusive_or_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#exclusive_or_expression.
    def exitExclusive_or_expression(self, ctx:ModuleParser.Exclusive_or_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#bit_and_expression.
    def enterBit_and_expression(self, ctx:ModuleParser.Bit_and_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#bit_and_expression.
    def exitBit_and_expression(self, ctx:ModuleParser.Bit_and_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#equality_expression.
    def enterEquality_expression(self, ctx:ModuleParser.Equality_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#equality_expression.
    def exitEquality_expression(self, ctx:ModuleParser.Equality_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#relational_expression.
    def enterRelational_expression(self, ctx:ModuleParser.Relational_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#relational_expression.
    def exitRelational_expression(self, ctx:ModuleParser.Relational_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#shift_expression.
    def enterShift_expression(self, ctx:ModuleParser.Shift_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#shift_expression.
    def exitShift_expression(self, ctx:ModuleParser.Shift_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#additive_expression.
    def enterAdditive_expression(self, ctx:ModuleParser.Additive_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#additive_expression.
    def exitAdditive_expression(self, ctx:ModuleParser.Additive_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#multiplicative_expression.
    def enterMultiplicative_expression(self, ctx:ModuleParser.Multiplicative_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#multiplicative_expression.
    def exitMultiplicative_expression(self, ctx:ModuleParser.Multiplicative_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#cast_expression.
    def enterCast_expression(self, ctx:ModuleParser.Cast_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#cast_expression.
    def exitCast_expression(self, ctx:ModuleParser.Cast_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#cast_target.
    def enterCast_target(self, ctx:ModuleParser.Cast_targetContext):
        pass

    # Exit a parse tree produced by ModuleParser#cast_target.
    def exitCast_target(self, ctx:ModuleParser.Cast_targetContext):
        pass


    # Enter a parse tree produced by ModuleParser#unary_expression.
    def enterUnary_expression(self, ctx:ModuleParser.Unary_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#unary_expression.
    def exitUnary_expression(self, ctx:ModuleParser.Unary_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#new_expression.
    def enterNew_expression(self, ctx:ModuleParser.New_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#new_expression.
    def exitNew_expression(self, ctx:ModuleParser.New_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#unary_op_and_cast_expr.
    def enterUnary_op_and_cast_expr(self, ctx:ModuleParser.Unary_op_and_cast_exprContext):
        pass

    # Exit a parse tree produced by ModuleParser#unary_op_and_cast_expr.
    def exitUnary_op_and_cast_expr(self, ctx:ModuleParser.Unary_op_and_cast_exprContext):
        pass


    # Enter a parse tree produced by ModuleParser#sizeof_expression.
    def enterSizeof_expression(self, ctx:ModuleParser.Sizeof_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#sizeof_expression.
    def exitSizeof_expression(self, ctx:ModuleParser.Sizeof_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#sizeof.
    def enterSizeof(self, ctx:ModuleParser.SizeofContext):
        pass

    # Exit a parse tree produced by ModuleParser#sizeof.
    def exitSizeof(self, ctx:ModuleParser.SizeofContext):
        pass


    # Enter a parse tree produced by ModuleParser#sizeof_operand.
    def enterSizeof_operand(self, ctx:ModuleParser.Sizeof_operandContext):
        pass

    # Exit a parse tree produced by ModuleParser#sizeof_operand.
    def exitSizeof_operand(self, ctx:ModuleParser.Sizeof_operandContext):
        pass


    # Enter a parse tree produced by ModuleParser#sizeof_operand2.
    def enterSizeof_operand2(self, ctx:ModuleParser.Sizeof_operand2Context):
        pass

    # Exit a parse tree produced by ModuleParser#sizeof_operand2.
    def exitSizeof_operand2(self, ctx:ModuleParser.Sizeof_operand2Context):
        pass


    # Enter a parse tree produced by ModuleParser#inc_dec.
    def enterInc_dec(self, ctx:ModuleParser.Inc_decContext):
        pass

    # Exit a parse tree produced by ModuleParser#inc_dec.
    def exitInc_dec(self, ctx:ModuleParser.Inc_decContext):
        pass


    # Enter a parse tree produced by ModuleParser#memberAccess.
    def enterMemberAccess(self, ctx:ModuleParser.MemberAccessContext):
        pass

    # Exit a parse tree produced by ModuleParser#memberAccess.
    def exitMemberAccess(self, ctx:ModuleParser.MemberAccessContext):
        pass


    # Enter a parse tree produced by ModuleParser#incDecOp.
    def enterIncDecOp(self, ctx:ModuleParser.IncDecOpContext):
        pass

    # Exit a parse tree produced by ModuleParser#incDecOp.
    def exitIncDecOp(self, ctx:ModuleParser.IncDecOpContext):
        pass


    # Enter a parse tree produced by ModuleParser#primaryOnly.
    def enterPrimaryOnly(self, ctx:ModuleParser.PrimaryOnlyContext):
        pass

    # Exit a parse tree produced by ModuleParser#primaryOnly.
    def exitPrimaryOnly(self, ctx:ModuleParser.PrimaryOnlyContext):
        pass


    # Enter a parse tree produced by ModuleParser#funcCall.
    def enterFuncCall(self, ctx:ModuleParser.FuncCallContext):
        pass

    # Exit a parse tree produced by ModuleParser#funcCall.
    def exitFuncCall(self, ctx:ModuleParser.FuncCallContext):
        pass


    # Enter a parse tree produced by ModuleParser#arrayIndexing.
    def enterArrayIndexing(self, ctx:ModuleParser.ArrayIndexingContext):
        pass

    # Exit a parse tree produced by ModuleParser#arrayIndexing.
    def exitArrayIndexing(self, ctx:ModuleParser.ArrayIndexingContext):
        pass


    # Enter a parse tree produced by ModuleParser#ptrMemberAccess.
    def enterPtrMemberAccess(self, ctx:ModuleParser.PtrMemberAccessContext):
        pass

    # Exit a parse tree produced by ModuleParser#ptrMemberAccess.
    def exitPtrMemberAccess(self, ctx:ModuleParser.PtrMemberAccessContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_argument_list.
    def enterFunction_argument_list(self, ctx:ModuleParser.Function_argument_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_argument_list.
    def exitFunction_argument_list(self, ctx:ModuleParser.Function_argument_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_argument.
    def enterFunction_argument(self, ctx:ModuleParser.Function_argumentContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_argument.
    def exitFunction_argument(self, ctx:ModuleParser.Function_argumentContext):
        pass


    # Enter a parse tree produced by ModuleParser#primary_expression.
    def enterPrimary_expression(self, ctx:ModuleParser.Primary_expressionContext):
        pass

    # Exit a parse tree produced by ModuleParser#primary_expression.
    def exitPrimary_expression(self, ctx:ModuleParser.Primary_expressionContext):
        pass


    # Enter a parse tree produced by ModuleParser#unary_operator.
    def enterUnary_operator(self, ctx:ModuleParser.Unary_operatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#unary_operator.
    def exitUnary_operator(self, ctx:ModuleParser.Unary_operatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#relational_operator.
    def enterRelational_operator(self, ctx:ModuleParser.Relational_operatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#relational_operator.
    def exitRelational_operator(self, ctx:ModuleParser.Relational_operatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#constant.
    def enterConstant(self, ctx:ModuleParser.ConstantContext):
        pass

    # Exit a parse tree produced by ModuleParser#constant.
    def exitConstant(self, ctx:ModuleParser.ConstantContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_decl_specifiers.
    def enterFunction_decl_specifiers(self, ctx:ModuleParser.Function_decl_specifiersContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_decl_specifiers.
    def exitFunction_decl_specifiers(self, ctx:ModuleParser.Function_decl_specifiersContext):
        pass


    # Enter a parse tree produced by ModuleParser#ptr_operator.
    def enterPtr_operator(self, ctx:ModuleParser.Ptr_operatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#ptr_operator.
    def exitPtr_operator(self, ctx:ModuleParser.Ptr_operatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#access_specifier.
    def enterAccess_specifier(self, ctx:ModuleParser.Access_specifierContext):
        pass

    # Exit a parse tree produced by ModuleParser#access_specifier.
    def exitAccess_specifier(self, ctx:ModuleParser.Access_specifierContext):
        pass


    # Enter a parse tree produced by ModuleParser#operator.
    def enterOperator(self, ctx:ModuleParser.OperatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#operator.
    def exitOperator(self, ctx:ModuleParser.OperatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#assignment_operator.
    def enterAssignment_operator(self, ctx:ModuleParser.Assignment_operatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#assignment_operator.
    def exitAssignment_operator(self, ctx:ModuleParser.Assignment_operatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#equality_operator.
    def enterEquality_operator(self, ctx:ModuleParser.Equality_operatorContext):
        pass

    # Exit a parse tree produced by ModuleParser#equality_operator.
    def exitEquality_operator(self, ctx:ModuleParser.Equality_operatorContext):
        pass


    # Enter a parse tree produced by ModuleParser#template_decl_start.
    def enterTemplate_decl_start(self, ctx:ModuleParser.Template_decl_startContext):
        pass

    # Exit a parse tree produced by ModuleParser#template_decl_start.
    def exitTemplate_decl_start(self, ctx:ModuleParser.Template_decl_startContext):
        pass


    # Enter a parse tree produced by ModuleParser#template_param_list.
    def enterTemplate_param_list(self, ctx:ModuleParser.Template_param_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#template_param_list.
    def exitTemplate_param_list(self, ctx:ModuleParser.Template_param_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_brackets.
    def enterNo_brackets(self, ctx:ModuleParser.No_bracketsContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_brackets.
    def exitNo_brackets(self, ctx:ModuleParser.No_bracketsContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_brackets_curlies_or_squares.
    def enterNo_brackets_curlies_or_squares(self, ctx:ModuleParser.No_brackets_curlies_or_squaresContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_brackets_curlies_or_squares.
    def exitNo_brackets_curlies_or_squares(self, ctx:ModuleParser.No_brackets_curlies_or_squaresContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_brackets_or_semicolon.
    def enterNo_brackets_or_semicolon(self, ctx:ModuleParser.No_brackets_or_semicolonContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_brackets_or_semicolon.
    def exitNo_brackets_or_semicolon(self, ctx:ModuleParser.No_brackets_or_semicolonContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_angle_brackets_or_brackets.
    def enterNo_angle_brackets_or_brackets(self, ctx:ModuleParser.No_angle_brackets_or_bracketsContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_angle_brackets_or_brackets.
    def exitNo_angle_brackets_or_brackets(self, ctx:ModuleParser.No_angle_brackets_or_bracketsContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_curlies.
    def enterNo_curlies(self, ctx:ModuleParser.No_curliesContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_curlies.
    def exitNo_curlies(self, ctx:ModuleParser.No_curliesContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_squares.
    def enterNo_squares(self, ctx:ModuleParser.No_squaresContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_squares.
    def exitNo_squares(self, ctx:ModuleParser.No_squaresContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_squares_or_semicolon.
    def enterNo_squares_or_semicolon(self, ctx:ModuleParser.No_squares_or_semicolonContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_squares_or_semicolon.
    def exitNo_squares_or_semicolon(self, ctx:ModuleParser.No_squares_or_semicolonContext):
        pass


    # Enter a parse tree produced by ModuleParser#no_comma_or_semicolon.
    def enterNo_comma_or_semicolon(self, ctx:ModuleParser.No_comma_or_semicolonContext):
        pass

    # Exit a parse tree produced by ModuleParser#no_comma_or_semicolon.
    def exitNo_comma_or_semicolon(self, ctx:ModuleParser.No_comma_or_semicolonContext):
        pass


    # Enter a parse tree produced by ModuleParser#assign_water.
    def enterAssign_water(self, ctx:ModuleParser.Assign_waterContext):
        pass

    # Exit a parse tree produced by ModuleParser#assign_water.
    def exitAssign_water(self, ctx:ModuleParser.Assign_waterContext):
        pass


    # Enter a parse tree produced by ModuleParser#assign_water_l2.
    def enterAssign_water_l2(self, ctx:ModuleParser.Assign_water_l2Context):
        pass

    # Exit a parse tree produced by ModuleParser#assign_water_l2.
    def exitAssign_water_l2(self, ctx:ModuleParser.Assign_water_l2Context):
        pass


    # Enter a parse tree produced by ModuleParser#water.
    def enterWater(self, ctx:ModuleParser.WaterContext):
        pass

    # Exit a parse tree produced by ModuleParser#water.
    def exitWater(self, ctx:ModuleParser.WaterContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_def.
    def enterFunction_def(self, ctx:ModuleParser.Function_defContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_def.
    def exitFunction_def(self, ctx:ModuleParser.Function_defContext):
        pass


    # Enter a parse tree produced by ModuleParser#return_type.
    def enterReturn_type(self, ctx:ModuleParser.Return_typeContext):
        pass

    # Exit a parse tree produced by ModuleParser#return_type.
    def exitReturn_type(self, ctx:ModuleParser.Return_typeContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_param_list.
    def enterFunction_param_list(self, ctx:ModuleParser.Function_param_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_param_list.
    def exitFunction_param_list(self, ctx:ModuleParser.Function_param_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#parameter_decl_clause.
    def enterParameter_decl_clause(self, ctx:ModuleParser.Parameter_decl_clauseContext):
        pass

    # Exit a parse tree produced by ModuleParser#parameter_decl_clause.
    def exitParameter_decl_clause(self, ctx:ModuleParser.Parameter_decl_clauseContext):
        pass


    # Enter a parse tree produced by ModuleParser#parameter_decl.
    def enterParameter_decl(self, ctx:ModuleParser.Parameter_declContext):
        pass

    # Exit a parse tree produced by ModuleParser#parameter_decl.
    def exitParameter_decl(self, ctx:ModuleParser.Parameter_declContext):
        pass


    # Enter a parse tree produced by ModuleParser#parameter_id.
    def enterParameter_id(self, ctx:ModuleParser.Parameter_idContext):
        pass

    # Exit a parse tree produced by ModuleParser#parameter_id.
    def exitParameter_id(self, ctx:ModuleParser.Parameter_idContext):
        pass


    # Enter a parse tree produced by ModuleParser#compound_statement.
    def enterCompound_statement(self, ctx:ModuleParser.Compound_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#compound_statement.
    def exitCompound_statement(self, ctx:ModuleParser.Compound_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#ctor_list.
    def enterCtor_list(self, ctx:ModuleParser.Ctor_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#ctor_list.
    def exitCtor_list(self, ctx:ModuleParser.Ctor_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#ctor_initializer.
    def enterCtor_initializer(self, ctx:ModuleParser.Ctor_initializerContext):
        pass

    # Exit a parse tree produced by ModuleParser#ctor_initializer.
    def exitCtor_initializer(self, ctx:ModuleParser.Ctor_initializerContext):
        pass


    # Enter a parse tree produced by ModuleParser#initializer_id.
    def enterInitializer_id(self, ctx:ModuleParser.Initializer_idContext):
        pass

    # Exit a parse tree produced by ModuleParser#initializer_id.
    def exitInitializer_id(self, ctx:ModuleParser.Initializer_idContext):
        pass


    # Enter a parse tree produced by ModuleParser#ctor_expr.
    def enterCtor_expr(self, ctx:ModuleParser.Ctor_exprContext):
        pass

    # Exit a parse tree produced by ModuleParser#ctor_expr.
    def exitCtor_expr(self, ctx:ModuleParser.Ctor_exprContext):
        pass


    # Enter a parse tree produced by ModuleParser#function_name.
    def enterFunction_name(self, ctx:ModuleParser.Function_nameContext):
        pass

    # Exit a parse tree produced by ModuleParser#function_name.
    def exitFunction_name(self, ctx:ModuleParser.Function_nameContext):
        pass


    # Enter a parse tree produced by ModuleParser#exception_specification.
    def enterException_specification(self, ctx:ModuleParser.Exception_specificationContext):
        pass

    # Exit a parse tree produced by ModuleParser#exception_specification.
    def exitException_specification(self, ctx:ModuleParser.Exception_specificationContext):
        pass


    # Enter a parse tree produced by ModuleParser#type_id_list.
    def enterType_id_list(self, ctx:ModuleParser.Type_id_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#type_id_list.
    def exitType_id_list(self, ctx:ModuleParser.Type_id_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#statements.
    def enterStatements(self, ctx:ModuleParser.StatementsContext):
        pass

    # Exit a parse tree produced by ModuleParser#statements.
    def exitStatements(self, ctx:ModuleParser.StatementsContext):
        pass


    # Enter a parse tree produced by ModuleParser#statement.
    def enterStatement(self, ctx:ModuleParser.StatementContext):
        pass

    # Exit a parse tree produced by ModuleParser#statement.
    def exitStatement(self, ctx:ModuleParser.StatementContext):
        pass


    # Enter a parse tree produced by ModuleParser#pre_opener.
    def enterPre_opener(self, ctx:ModuleParser.Pre_openerContext):
        pass

    # Exit a parse tree produced by ModuleParser#pre_opener.
    def exitPre_opener(self, ctx:ModuleParser.Pre_openerContext):
        pass


    # Enter a parse tree produced by ModuleParser#pre_else.
    def enterPre_else(self, ctx:ModuleParser.Pre_elseContext):
        pass

    # Exit a parse tree produced by ModuleParser#pre_else.
    def exitPre_else(self, ctx:ModuleParser.Pre_elseContext):
        pass


    # Enter a parse tree produced by ModuleParser#pre_closer.
    def enterPre_closer(self, ctx:ModuleParser.Pre_closerContext):
        pass

    # Exit a parse tree produced by ModuleParser#pre_closer.
    def exitPre_closer(self, ctx:ModuleParser.Pre_closerContext):
        pass


    # Enter a parse tree produced by ModuleParser#opening_curly.
    def enterOpening_curly(self, ctx:ModuleParser.Opening_curlyContext):
        pass

    # Exit a parse tree produced by ModuleParser#opening_curly.
    def exitOpening_curly(self, ctx:ModuleParser.Opening_curlyContext):
        pass


    # Enter a parse tree produced by ModuleParser#closing_curly.
    def enterClosing_curly(self, ctx:ModuleParser.Closing_curlyContext):
        pass

    # Exit a parse tree produced by ModuleParser#closing_curly.
    def exitClosing_curly(self, ctx:ModuleParser.Closing_curlyContext):
        pass


    # Enter a parse tree produced by ModuleParser#block_starter.
    def enterBlock_starter(self, ctx:ModuleParser.Block_starterContext):
        pass

    # Exit a parse tree produced by ModuleParser#block_starter.
    def exitBlock_starter(self, ctx:ModuleParser.Block_starterContext):
        pass


    # Enter a parse tree produced by ModuleParser#Try_statement.
    def enterTry_statement(self, ctx:ModuleParser.Try_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#Try_statement.
    def exitTry_statement(self, ctx:ModuleParser.Try_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#Catch_statement.
    def enterCatch_statement(self, ctx:ModuleParser.Catch_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#Catch_statement.
    def exitCatch_statement(self, ctx:ModuleParser.Catch_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#If_statement.
    def enterIf_statement(self, ctx:ModuleParser.If_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#If_statement.
    def exitIf_statement(self, ctx:ModuleParser.If_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#Else_statement.
    def enterElse_statement(self, ctx:ModuleParser.Else_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#Else_statement.
    def exitElse_statement(self, ctx:ModuleParser.Else_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#Switch_statement.
    def enterSwitch_statement(self, ctx:ModuleParser.Switch_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#Switch_statement.
    def exitSwitch_statement(self, ctx:ModuleParser.Switch_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#For_statement.
    def enterFor_statement(self, ctx:ModuleParser.For_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#For_statement.
    def exitFor_statement(self, ctx:ModuleParser.For_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#Do_statement.
    def enterDo_statement(self, ctx:ModuleParser.Do_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#Do_statement.
    def exitDo_statement(self, ctx:ModuleParser.Do_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#While_statement.
    def enterWhile_statement(self, ctx:ModuleParser.While_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#While_statement.
    def exitWhile_statement(self, ctx:ModuleParser.While_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#do_statement1.
    def enterDo_statement1(self, ctx:ModuleParser.Do_statement1Context):
        pass

    # Exit a parse tree produced by ModuleParser#do_statement1.
    def exitDo_statement1(self, ctx:ModuleParser.Do_statement1Context):
        pass


    # Enter a parse tree produced by ModuleParser#for_init_statement.
    def enterFor_init_statement(self, ctx:ModuleParser.For_init_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#for_init_statement.
    def exitFor_init_statement(self, ctx:ModuleParser.For_init_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#breakStatement.
    def enterBreakStatement(self, ctx:ModuleParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by ModuleParser#breakStatement.
    def exitBreakStatement(self, ctx:ModuleParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by ModuleParser#continueStatement.
    def enterContinueStatement(self, ctx:ModuleParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by ModuleParser#continueStatement.
    def exitContinueStatement(self, ctx:ModuleParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by ModuleParser#gotoStatement.
    def enterGotoStatement(self, ctx:ModuleParser.GotoStatementContext):
        pass

    # Exit a parse tree produced by ModuleParser#gotoStatement.
    def exitGotoStatement(self, ctx:ModuleParser.GotoStatementContext):
        pass


    # Enter a parse tree produced by ModuleParser#returnStatement.
    def enterReturnStatement(self, ctx:ModuleParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by ModuleParser#returnStatement.
    def exitReturnStatement(self, ctx:ModuleParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by ModuleParser#label.
    def enterLabel(self, ctx:ModuleParser.LabelContext):
        pass

    # Exit a parse tree produced by ModuleParser#label.
    def exitLabel(self, ctx:ModuleParser.LabelContext):
        pass


    # Enter a parse tree produced by ModuleParser#expr_statement.
    def enterExpr_statement(self, ctx:ModuleParser.Expr_statementContext):
        pass

    # Exit a parse tree produced by ModuleParser#expr_statement.
    def exitExpr_statement(self, ctx:ModuleParser.Expr_statementContext):
        pass


    # Enter a parse tree produced by ModuleParser#condition.
    def enterCondition(self, ctx:ModuleParser.ConditionContext):
        pass

    # Exit a parse tree produced by ModuleParser#condition.
    def exitCondition(self, ctx:ModuleParser.ConditionContext):
        pass


    # Enter a parse tree produced by ModuleParser#initDeclWithCall.
    def enterInitDeclWithCall(self, ctx:ModuleParser.InitDeclWithCallContext):
        pass

    # Exit a parse tree produced by ModuleParser#initDeclWithCall.
    def exitInitDeclWithCall(self, ctx:ModuleParser.InitDeclWithCallContext):
        pass


    # Enter a parse tree produced by ModuleParser#initDeclWithAssign.
    def enterInitDeclWithAssign(self, ctx:ModuleParser.InitDeclWithAssignContext):
        pass

    # Exit a parse tree produced by ModuleParser#initDeclWithAssign.
    def exitInitDeclWithAssign(self, ctx:ModuleParser.InitDeclWithAssignContext):
        pass


    # Enter a parse tree produced by ModuleParser#initDeclSimple.
    def enterInitDeclSimple(self, ctx:ModuleParser.InitDeclSimpleContext):
        pass

    # Exit a parse tree produced by ModuleParser#initDeclSimple.
    def exitInitDeclSimple(self, ctx:ModuleParser.InitDeclSimpleContext):
        pass


    # Enter a parse tree produced by ModuleParser#declarator.
    def enterDeclarator(self, ctx:ModuleParser.DeclaratorContext):
        pass

    # Exit a parse tree produced by ModuleParser#declarator.
    def exitDeclarator(self, ctx:ModuleParser.DeclaratorContext):
        pass


    # Enter a parse tree produced by ModuleParser#type_suffix.
    def enterType_suffix(self, ctx:ModuleParser.Type_suffixContext):
        pass

    # Exit a parse tree produced by ModuleParser#type_suffix.
    def exitType_suffix(self, ctx:ModuleParser.Type_suffixContext):
        pass


    # Enter a parse tree produced by ModuleParser#simple_decl.
    def enterSimple_decl(self, ctx:ModuleParser.Simple_declContext):
        pass

    # Exit a parse tree produced by ModuleParser#simple_decl.
    def exitSimple_decl(self, ctx:ModuleParser.Simple_declContext):
        pass


    # Enter a parse tree produced by ModuleParser#declByClass.
    def enterDeclByClass(self, ctx:ModuleParser.DeclByClassContext):
        pass

    # Exit a parse tree produced by ModuleParser#declByClass.
    def exitDeclByClass(self, ctx:ModuleParser.DeclByClassContext):
        pass


    # Enter a parse tree produced by ModuleParser#declByType.
    def enterDeclByType(self, ctx:ModuleParser.DeclByTypeContext):
        pass

    # Exit a parse tree produced by ModuleParser#declByType.
    def exitDeclByType(self, ctx:ModuleParser.DeclByTypeContext):
        pass


    # Enter a parse tree produced by ModuleParser#init_declarator_list.
    def enterInit_declarator_list(self, ctx:ModuleParser.Init_declarator_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#init_declarator_list.
    def exitInit_declarator_list(self, ctx:ModuleParser.Init_declarator_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#initializer.
    def enterInitializer(self, ctx:ModuleParser.InitializerContext):
        pass

    # Exit a parse tree produced by ModuleParser#initializer.
    def exitInitializer(self, ctx:ModuleParser.InitializerContext):
        pass


    # Enter a parse tree produced by ModuleParser#initializer_list.
    def enterInitializer_list(self, ctx:ModuleParser.Initializer_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#initializer_list.
    def exitInitializer_list(self, ctx:ModuleParser.Initializer_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#class_def.
    def enterClass_def(self, ctx:ModuleParser.Class_defContext):
        pass

    # Exit a parse tree produced by ModuleParser#class_def.
    def exitClass_def(self, ctx:ModuleParser.Class_defContext):
        pass


    # Enter a parse tree produced by ModuleParser#class_name.
    def enterClass_name(self, ctx:ModuleParser.Class_nameContext):
        pass

    # Exit a parse tree produced by ModuleParser#class_name.
    def exitClass_name(self, ctx:ModuleParser.Class_nameContext):
        pass


    # Enter a parse tree produced by ModuleParser#base_classes.
    def enterBase_classes(self, ctx:ModuleParser.Base_classesContext):
        pass

    # Exit a parse tree produced by ModuleParser#base_classes.
    def exitBase_classes(self, ctx:ModuleParser.Base_classesContext):
        pass


    # Enter a parse tree produced by ModuleParser#base_class.
    def enterBase_class(self, ctx:ModuleParser.Base_classContext):
        pass

    # Exit a parse tree produced by ModuleParser#base_class.
    def exitBase_class(self, ctx:ModuleParser.Base_classContext):
        pass


    # Enter a parse tree produced by ModuleParser#type_name.
    def enterType_name(self, ctx:ModuleParser.Type_nameContext):
        pass

    # Exit a parse tree produced by ModuleParser#type_name.
    def exitType_name(self, ctx:ModuleParser.Type_nameContext):
        pass


    # Enter a parse tree produced by ModuleParser#base_type.
    def enterBase_type(self, ctx:ModuleParser.Base_typeContext):
        pass

    # Exit a parse tree produced by ModuleParser#base_type.
    def exitBase_type(self, ctx:ModuleParser.Base_typeContext):
        pass


    # Enter a parse tree produced by ModuleParser#param_decl_specifiers.
    def enterParam_decl_specifiers(self, ctx:ModuleParser.Param_decl_specifiersContext):
        pass

    # Exit a parse tree produced by ModuleParser#param_decl_specifiers.
    def exitParam_decl_specifiers(self, ctx:ModuleParser.Param_decl_specifiersContext):
        pass


    # Enter a parse tree produced by ModuleParser#parameter_name.
    def enterParameter_name(self, ctx:ModuleParser.Parameter_nameContext):
        pass

    # Exit a parse tree produced by ModuleParser#parameter_name.
    def exitParameter_name(self, ctx:ModuleParser.Parameter_nameContext):
        pass


    # Enter a parse tree produced by ModuleParser#param_type_list.
    def enterParam_type_list(self, ctx:ModuleParser.Param_type_listContext):
        pass

    # Exit a parse tree produced by ModuleParser#param_type_list.
    def exitParam_type_list(self, ctx:ModuleParser.Param_type_listContext):
        pass


    # Enter a parse tree produced by ModuleParser#param_type.
    def enterParam_type(self, ctx:ModuleParser.Param_typeContext):
        pass

    # Exit a parse tree produced by ModuleParser#param_type.
    def exitParam_type(self, ctx:ModuleParser.Param_typeContext):
        pass


    # Enter a parse tree produced by ModuleParser#param_type_id.
    def enterParam_type_id(self, ctx:ModuleParser.Param_type_idContext):
        pass

    # Exit a parse tree produced by ModuleParser#param_type_id.
    def exitParam_type_id(self, ctx:ModuleParser.Param_type_idContext):
        pass


    # Enter a parse tree produced by ModuleParser#identifier.
    def enterIdentifier(self, ctx:ModuleParser.IdentifierContext):
        pass

    # Exit a parse tree produced by ModuleParser#identifier.
    def exitIdentifier(self, ctx:ModuleParser.IdentifierContext):
        pass


    # Enter a parse tree produced by ModuleParser#number.
    def enterNumber(self, ctx:ModuleParser.NumberContext):
        pass

    # Exit a parse tree produced by ModuleParser#number.
    def exitNumber(self, ctx:ModuleParser.NumberContext):
        pass


    # Enter a parse tree produced by ModuleParser#ptrs.
    def enterPtrs(self, ctx:ModuleParser.PtrsContext):
        pass

    # Exit a parse tree produced by ModuleParser#ptrs.
    def exitPtrs(self, ctx:ModuleParser.PtrsContext):
        pass


    # Enter a parse tree produced by ModuleParser#assign_expr_w_.
    def enterAssign_expr_w_(self, ctx:ModuleParser.Assign_expr_w_Context):
        pass

    # Exit a parse tree produced by ModuleParser#assign_expr_w_.
    def exitAssign_expr_w_(self, ctx:ModuleParser.Assign_expr_w_Context):
        pass


    # Enter a parse tree produced by ModuleParser#assign_expr_w__l2.
    def enterAssign_expr_w__l2(self, ctx:ModuleParser.Assign_expr_w__l2Context):
        pass

    # Exit a parse tree produced by ModuleParser#assign_expr_w__l2.
    def exitAssign_expr_w__l2(self, ctx:ModuleParser.Assign_expr_w__l2Context):
        pass


    # Enter a parse tree produced by ModuleParser#constant_expr_w_.
    def enterConstant_expr_w_(self, ctx:ModuleParser.Constant_expr_w_Context):
        pass

    # Exit a parse tree produced by ModuleParser#constant_expr_w_.
    def exitConstant_expr_w_(self, ctx:ModuleParser.Constant_expr_w_Context):
        pass



del ModuleParser