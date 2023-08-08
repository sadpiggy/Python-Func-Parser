# Generated from Function.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .FunctionParser import FunctionParser
else:
    from FunctionParser import FunctionParser

# This class defines a complete generic visitor for a parse tree produced by FunctionParser.

class FunctionVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by FunctionParser#statements.
    def visitStatements(self, ctx:FunctionParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#statement.
    def visitStatement(self, ctx:FunctionParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#pre_opener.
    def visitPre_opener(self, ctx:FunctionParser.Pre_openerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#pre_else.
    def visitPre_else(self, ctx:FunctionParser.Pre_elseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#pre_closer.
    def visitPre_closer(self, ctx:FunctionParser.Pre_closerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#opening_curly.
    def visitOpening_curly(self, ctx:FunctionParser.Opening_curlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#closing_curly.
    def visitClosing_curly(self, ctx:FunctionParser.Closing_curlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#block_starter.
    def visitBlock_starter(self, ctx:FunctionParser.Block_starterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#Try_statement.
    def visitTry_statement(self, ctx:FunctionParser.Try_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#Catch_statement.
    def visitCatch_statement(self, ctx:FunctionParser.Catch_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#If_statement.
    def visitIf_statement(self, ctx:FunctionParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#Else_statement.
    def visitElse_statement(self, ctx:FunctionParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#Switch_statement.
    def visitSwitch_statement(self, ctx:FunctionParser.Switch_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#For_statement.
    def visitFor_statement(self, ctx:FunctionParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#Do_statement.
    def visitDo_statement(self, ctx:FunctionParser.Do_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#While_statement.
    def visitWhile_statement(self, ctx:FunctionParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#do_statement1.
    def visitDo_statement1(self, ctx:FunctionParser.Do_statement1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#for_init_statement.
    def visitFor_init_statement(self, ctx:FunctionParser.For_init_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#breakStatement.
    def visitBreakStatement(self, ctx:FunctionParser.BreakStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#continueStatement.
    def visitContinueStatement(self, ctx:FunctionParser.ContinueStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#gotoStatement.
    def visitGotoStatement(self, ctx:FunctionParser.GotoStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#returnStatement.
    def visitReturnStatement(self, ctx:FunctionParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#label.
    def visitLabel(self, ctx:FunctionParser.LabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#expr_statement.
    def visitExpr_statement(self, ctx:FunctionParser.Expr_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#condition.
    def visitCondition(self, ctx:FunctionParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#unary_operator.
    def visitUnary_operator(self, ctx:FunctionParser.Unary_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#relational_operator.
    def visitRelational_operator(self, ctx:FunctionParser.Relational_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#constant.
    def visitConstant(self, ctx:FunctionParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#function_decl_specifiers.
    def visitFunction_decl_specifiers(self, ctx:FunctionParser.Function_decl_specifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#ptr_operator.
    def visitPtr_operator(self, ctx:FunctionParser.Ptr_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#access_specifier.
    def visitAccess_specifier(self, ctx:FunctionParser.Access_specifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#operator.
    def visitOperator(self, ctx:FunctionParser.OperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#assignment_operator.
    def visitAssignment_operator(self, ctx:FunctionParser.Assignment_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#equality_operator.
    def visitEquality_operator(self, ctx:FunctionParser.Equality_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#template_decl_start.
    def visitTemplate_decl_start(self, ctx:FunctionParser.Template_decl_startContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#template_param_list.
    def visitTemplate_param_list(self, ctx:FunctionParser.Template_param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_brackets.
    def visitNo_brackets(self, ctx:FunctionParser.No_bracketsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_brackets_curlies_or_squares.
    def visitNo_brackets_curlies_or_squares(self, ctx:FunctionParser.No_brackets_curlies_or_squaresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_brackets_or_semicolon.
    def visitNo_brackets_or_semicolon(self, ctx:FunctionParser.No_brackets_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_angle_brackets_or_brackets.
    def visitNo_angle_brackets_or_brackets(self, ctx:FunctionParser.No_angle_brackets_or_bracketsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_curlies.
    def visitNo_curlies(self, ctx:FunctionParser.No_curliesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_squares.
    def visitNo_squares(self, ctx:FunctionParser.No_squaresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_squares_or_semicolon.
    def visitNo_squares_or_semicolon(self, ctx:FunctionParser.No_squares_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#no_comma_or_semicolon.
    def visitNo_comma_or_semicolon(self, ctx:FunctionParser.No_comma_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#assign_water.
    def visitAssign_water(self, ctx:FunctionParser.Assign_waterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#assign_water_l2.
    def visitAssign_water_l2(self, ctx:FunctionParser.Assign_water_l2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#water.
    def visitWater(self, ctx:FunctionParser.WaterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#expr.
    def visitExpr(self, ctx:FunctionParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#assign_expr.
    def visitAssign_expr(self, ctx:FunctionParser.Assign_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#normOr.
    def visitNormOr(self, ctx:FunctionParser.NormOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#cndExpr.
    def visitCndExpr(self, ctx:FunctionParser.CndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#or_expression.
    def visitOr_expression(self, ctx:FunctionParser.Or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#and_expression.
    def visitAnd_expression(self, ctx:FunctionParser.And_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#inclusive_or_expression.
    def visitInclusive_or_expression(self, ctx:FunctionParser.Inclusive_or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#exclusive_or_expression.
    def visitExclusive_or_expression(self, ctx:FunctionParser.Exclusive_or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#bit_and_expression.
    def visitBit_and_expression(self, ctx:FunctionParser.Bit_and_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#equality_expression.
    def visitEquality_expression(self, ctx:FunctionParser.Equality_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#relational_expression.
    def visitRelational_expression(self, ctx:FunctionParser.Relational_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#shift_expression.
    def visitShift_expression(self, ctx:FunctionParser.Shift_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#additive_expression.
    def visitAdditive_expression(self, ctx:FunctionParser.Additive_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#multiplicative_expression.
    def visitMultiplicative_expression(self, ctx:FunctionParser.Multiplicative_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#cast_expression.
    def visitCast_expression(self, ctx:FunctionParser.Cast_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#cast_target.
    def visitCast_target(self, ctx:FunctionParser.Cast_targetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#unary_expression.
    def visitUnary_expression(self, ctx:FunctionParser.Unary_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#new_expression.
    def visitNew_expression(self, ctx:FunctionParser.New_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#unary_op_and_cast_expr.
    def visitUnary_op_and_cast_expr(self, ctx:FunctionParser.Unary_op_and_cast_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#sizeof_expression.
    def visitSizeof_expression(self, ctx:FunctionParser.Sizeof_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#sizeof.
    def visitSizeof(self, ctx:FunctionParser.SizeofContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#sizeof_operand.
    def visitSizeof_operand(self, ctx:FunctionParser.Sizeof_operandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#sizeof_operand2.
    def visitSizeof_operand2(self, ctx:FunctionParser.Sizeof_operand2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#inc_dec.
    def visitInc_dec(self, ctx:FunctionParser.Inc_decContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#memberAccess.
    def visitMemberAccess(self, ctx:FunctionParser.MemberAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#incDecOp.
    def visitIncDecOp(self, ctx:FunctionParser.IncDecOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#primaryOnly.
    def visitPrimaryOnly(self, ctx:FunctionParser.PrimaryOnlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#funcCall.
    def visitFuncCall(self, ctx:FunctionParser.FuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#arrayIndexing.
    def visitArrayIndexing(self, ctx:FunctionParser.ArrayIndexingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#ptrMemberAccess.
    def visitPtrMemberAccess(self, ctx:FunctionParser.PtrMemberAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#function_argument_list.
    def visitFunction_argument_list(self, ctx:FunctionParser.Function_argument_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#function_argument.
    def visitFunction_argument(self, ctx:FunctionParser.Function_argumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#primary_expression.
    def visitPrimary_expression(self, ctx:FunctionParser.Primary_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#initDeclWithCall.
    def visitInitDeclWithCall(self, ctx:FunctionParser.InitDeclWithCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#initDeclWithAssign.
    def visitInitDeclWithAssign(self, ctx:FunctionParser.InitDeclWithAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#initDeclSimple.
    def visitInitDeclSimple(self, ctx:FunctionParser.InitDeclSimpleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#declarator.
    def visitDeclarator(self, ctx:FunctionParser.DeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#type_suffix.
    def visitType_suffix(self, ctx:FunctionParser.Type_suffixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#simple_decl.
    def visitSimple_decl(self, ctx:FunctionParser.Simple_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#declByClass.
    def visitDeclByClass(self, ctx:FunctionParser.DeclByClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#declByType.
    def visitDeclByType(self, ctx:FunctionParser.DeclByTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#init_declarator_list.
    def visitInit_declarator_list(self, ctx:FunctionParser.Init_declarator_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#initializer.
    def visitInitializer(self, ctx:FunctionParser.InitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#initializer_list.
    def visitInitializer_list(self, ctx:FunctionParser.Initializer_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#class_def.
    def visitClass_def(self, ctx:FunctionParser.Class_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#class_name.
    def visitClass_name(self, ctx:FunctionParser.Class_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#base_classes.
    def visitBase_classes(self, ctx:FunctionParser.Base_classesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#base_class.
    def visitBase_class(self, ctx:FunctionParser.Base_classContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#type_name.
    def visitType_name(self, ctx:FunctionParser.Type_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#base_type.
    def visitBase_type(self, ctx:FunctionParser.Base_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#param_decl_specifiers.
    def visitParam_decl_specifiers(self, ctx:FunctionParser.Param_decl_specifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#parameter_name.
    def visitParameter_name(self, ctx:FunctionParser.Parameter_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#param_type_list.
    def visitParam_type_list(self, ctx:FunctionParser.Param_type_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#param_type.
    def visitParam_type(self, ctx:FunctionParser.Param_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#param_type_id.
    def visitParam_type_id(self, ctx:FunctionParser.Param_type_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#identifier.
    def visitIdentifier(self, ctx:FunctionParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#number.
    def visitNumber(self, ctx:FunctionParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FunctionParser#ptrs.
    def visitPtrs(self, ctx:FunctionParser.PtrsContext):
        return self.visitChildren(ctx)



del FunctionParser