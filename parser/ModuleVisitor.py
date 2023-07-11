# Generated from Module.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ModuleParser import ModuleParser
else:
    from ModuleParser import ModuleParser

# This class defines a complete generic visitor for a parse tree produced by ModuleParser.

class ModuleVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ModuleParser#code.
    def visitCode(self, ctx:ModuleParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#using_directive.
    def visitUsing_directive(self, ctx:ModuleParser.Using_directiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#expr.
    def visitExpr(self, ctx:ModuleParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assign_expr.
    def visitAssign_expr(self, ctx:ModuleParser.Assign_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#normOr.
    def visitNormOr(self, ctx:ModuleParser.NormOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#cndExpr.
    def visitCndExpr(self, ctx:ModuleParser.CndExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#or_expression.
    def visitOr_expression(self, ctx:ModuleParser.Or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#and_expression.
    def visitAnd_expression(self, ctx:ModuleParser.And_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#inclusive_or_expression.
    def visitInclusive_or_expression(self, ctx:ModuleParser.Inclusive_or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#exclusive_or_expression.
    def visitExclusive_or_expression(self, ctx:ModuleParser.Exclusive_or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#bit_and_expression.
    def visitBit_and_expression(self, ctx:ModuleParser.Bit_and_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#equality_expression.
    def visitEquality_expression(self, ctx:ModuleParser.Equality_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#relational_expression.
    def visitRelational_expression(self, ctx:ModuleParser.Relational_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#shift_expression.
    def visitShift_expression(self, ctx:ModuleParser.Shift_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#additive_expression.
    def visitAdditive_expression(self, ctx:ModuleParser.Additive_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#multiplicative_expression.
    def visitMultiplicative_expression(self, ctx:ModuleParser.Multiplicative_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#cast_expression.
    def visitCast_expression(self, ctx:ModuleParser.Cast_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#cast_target.
    def visitCast_target(self, ctx:ModuleParser.Cast_targetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#unary_expression.
    def visitUnary_expression(self, ctx:ModuleParser.Unary_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#new_expression.
    def visitNew_expression(self, ctx:ModuleParser.New_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#unary_op_and_cast_expr.
    def visitUnary_op_and_cast_expr(self, ctx:ModuleParser.Unary_op_and_cast_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#sizeof_expression.
    def visitSizeof_expression(self, ctx:ModuleParser.Sizeof_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#sizeof.
    def visitSizeof(self, ctx:ModuleParser.SizeofContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#sizeof_operand.
    def visitSizeof_operand(self, ctx:ModuleParser.Sizeof_operandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#sizeof_operand2.
    def visitSizeof_operand2(self, ctx:ModuleParser.Sizeof_operand2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#inc_dec.
    def visitInc_dec(self, ctx:ModuleParser.Inc_decContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#memberAccess.
    def visitMemberAccess(self, ctx:ModuleParser.MemberAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#incDecOp.
    def visitIncDecOp(self, ctx:ModuleParser.IncDecOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#primaryOnly.
    def visitPrimaryOnly(self, ctx:ModuleParser.PrimaryOnlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#funcCall.
    def visitFuncCall(self, ctx:ModuleParser.FuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#arrayIndexing.
    def visitArrayIndexing(self, ctx:ModuleParser.ArrayIndexingContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ptrMemberAccess.
    def visitPtrMemberAccess(self, ctx:ModuleParser.PtrMemberAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_argument_list.
    def visitFunction_argument_list(self, ctx:ModuleParser.Function_argument_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_argument.
    def visitFunction_argument(self, ctx:ModuleParser.Function_argumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#primary_expression.
    def visitPrimary_expression(self, ctx:ModuleParser.Primary_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#unary_operator.
    def visitUnary_operator(self, ctx:ModuleParser.Unary_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#relational_operator.
    def visitRelational_operator(self, ctx:ModuleParser.Relational_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#constant.
    def visitConstant(self, ctx:ModuleParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_decl_specifiers.
    def visitFunction_decl_specifiers(self, ctx:ModuleParser.Function_decl_specifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ptr_operator.
    def visitPtr_operator(self, ctx:ModuleParser.Ptr_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#access_specifier.
    def visitAccess_specifier(self, ctx:ModuleParser.Access_specifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#operator.
    def visitOperator(self, ctx:ModuleParser.OperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assignment_operator.
    def visitAssignment_operator(self, ctx:ModuleParser.Assignment_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#equality_operator.
    def visitEquality_operator(self, ctx:ModuleParser.Equality_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#template_decl_start.
    def visitTemplate_decl_start(self, ctx:ModuleParser.Template_decl_startContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#template_param_list.
    def visitTemplate_param_list(self, ctx:ModuleParser.Template_param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_brackets.
    def visitNo_brackets(self, ctx:ModuleParser.No_bracketsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_brackets_curlies_or_squares.
    def visitNo_brackets_curlies_or_squares(self, ctx:ModuleParser.No_brackets_curlies_or_squaresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_brackets_or_semicolon.
    def visitNo_brackets_or_semicolon(self, ctx:ModuleParser.No_brackets_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_angle_brackets_or_brackets.
    def visitNo_angle_brackets_or_brackets(self, ctx:ModuleParser.No_angle_brackets_or_bracketsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_curlies.
    def visitNo_curlies(self, ctx:ModuleParser.No_curliesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_squares.
    def visitNo_squares(self, ctx:ModuleParser.No_squaresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_squares_or_semicolon.
    def visitNo_squares_or_semicolon(self, ctx:ModuleParser.No_squares_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#no_comma_or_semicolon.
    def visitNo_comma_or_semicolon(self, ctx:ModuleParser.No_comma_or_semicolonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assign_water.
    def visitAssign_water(self, ctx:ModuleParser.Assign_waterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assign_water_l2.
    def visitAssign_water_l2(self, ctx:ModuleParser.Assign_water_l2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#water.
    def visitWater(self, ctx:ModuleParser.WaterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_def.
    def visitFunction_def(self, ctx:ModuleParser.Function_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#return_type.
    def visitReturn_type(self, ctx:ModuleParser.Return_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_param_list.
    def visitFunction_param_list(self, ctx:ModuleParser.Function_param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#parameter_decl_clause.
    def visitParameter_decl_clause(self, ctx:ModuleParser.Parameter_decl_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#parameter_decl.
    def visitParameter_decl(self, ctx:ModuleParser.Parameter_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#parameter_id.
    def visitParameter_id(self, ctx:ModuleParser.Parameter_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#compound_statement.
    def visitCompound_statement(self, ctx:ModuleParser.Compound_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ctor_list.
    def visitCtor_list(self, ctx:ModuleParser.Ctor_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ctor_initializer.
    def visitCtor_initializer(self, ctx:ModuleParser.Ctor_initializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initializer_id.
    def visitInitializer_id(self, ctx:ModuleParser.Initializer_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ctor_expr.
    def visitCtor_expr(self, ctx:ModuleParser.Ctor_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#function_name.
    def visitFunction_name(self, ctx:ModuleParser.Function_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#exception_specification.
    def visitException_specification(self, ctx:ModuleParser.Exception_specificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#type_id_list.
    def visitType_id_list(self, ctx:ModuleParser.Type_id_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#statements.
    def visitStatements(self, ctx:ModuleParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#statement.
    def visitStatement(self, ctx:ModuleParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#pre_opener.
    def visitPre_opener(self, ctx:ModuleParser.Pre_openerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#pre_else.
    def visitPre_else(self, ctx:ModuleParser.Pre_elseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#pre_closer.
    def visitPre_closer(self, ctx:ModuleParser.Pre_closerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#opening_curly.
    def visitOpening_curly(self, ctx:ModuleParser.Opening_curlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#closing_curly.
    def visitClosing_curly(self, ctx:ModuleParser.Closing_curlyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#block_starter.
    def visitBlock_starter(self, ctx:ModuleParser.Block_starterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#Try_statement.
    def visitTry_statement(self, ctx:ModuleParser.Try_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#Catch_statement.
    def visitCatch_statement(self, ctx:ModuleParser.Catch_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#If_statement.
    def visitIf_statement(self, ctx:ModuleParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#Else_statement.
    def visitElse_statement(self, ctx:ModuleParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#Switch_statement.
    def visitSwitch_statement(self, ctx:ModuleParser.Switch_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#For_statement.
    def visitFor_statement(self, ctx:ModuleParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#Do_statement.
    def visitDo_statement(self, ctx:ModuleParser.Do_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#While_statement.
    def visitWhile_statement(self, ctx:ModuleParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#do_statement1.
    def visitDo_statement1(self, ctx:ModuleParser.Do_statement1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#for_init_statement.
    def visitFor_init_statement(self, ctx:ModuleParser.For_init_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#breakStatement.
    def visitBreakStatement(self, ctx:ModuleParser.BreakStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#continueStatement.
    def visitContinueStatement(self, ctx:ModuleParser.ContinueStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#gotoStatement.
    def visitGotoStatement(self, ctx:ModuleParser.GotoStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#returnStatement.
    def visitReturnStatement(self, ctx:ModuleParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#label.
    def visitLabel(self, ctx:ModuleParser.LabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#expr_statement.
    def visitExpr_statement(self, ctx:ModuleParser.Expr_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#condition.
    def visitCondition(self, ctx:ModuleParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initDeclWithCall.
    def visitInitDeclWithCall(self, ctx:ModuleParser.InitDeclWithCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initDeclWithAssign.
    def visitInitDeclWithAssign(self, ctx:ModuleParser.InitDeclWithAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initDeclSimple.
    def visitInitDeclSimple(self, ctx:ModuleParser.InitDeclSimpleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#declarator.
    def visitDeclarator(self, ctx:ModuleParser.DeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#type_suffix.
    def visitType_suffix(self, ctx:ModuleParser.Type_suffixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#simple_decl.
    def visitSimple_decl(self, ctx:ModuleParser.Simple_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#declByClass.
    def visitDeclByClass(self, ctx:ModuleParser.DeclByClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#declByType.
    def visitDeclByType(self, ctx:ModuleParser.DeclByTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#init_declarator_list.
    def visitInit_declarator_list(self, ctx:ModuleParser.Init_declarator_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initializer.
    def visitInitializer(self, ctx:ModuleParser.InitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#initializer_list.
    def visitInitializer_list(self, ctx:ModuleParser.Initializer_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#class_def.
    def visitClass_def(self, ctx:ModuleParser.Class_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#class_name.
    def visitClass_name(self, ctx:ModuleParser.Class_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#base_classes.
    def visitBase_classes(self, ctx:ModuleParser.Base_classesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#base_class.
    def visitBase_class(self, ctx:ModuleParser.Base_classContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#type_name.
    def visitType_name(self, ctx:ModuleParser.Type_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#base_type.
    def visitBase_type(self, ctx:ModuleParser.Base_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#param_decl_specifiers.
    def visitParam_decl_specifiers(self, ctx:ModuleParser.Param_decl_specifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#parameter_name.
    def visitParameter_name(self, ctx:ModuleParser.Parameter_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#param_type_list.
    def visitParam_type_list(self, ctx:ModuleParser.Param_type_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#param_type.
    def visitParam_type(self, ctx:ModuleParser.Param_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#param_type_id.
    def visitParam_type_id(self, ctx:ModuleParser.Param_type_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#identifier.
    def visitIdentifier(self, ctx:ModuleParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#number.
    def visitNumber(self, ctx:ModuleParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#ptrs.
    def visitPtrs(self, ctx:ModuleParser.PtrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assign_expr_w_.
    def visitAssign_expr_w_(self, ctx:ModuleParser.Assign_expr_w_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#assign_expr_w__l2.
    def visitAssign_expr_w__l2(self, ctx:ModuleParser.Assign_expr_w__l2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ModuleParser#constant_expr_w_.
    def visitConstant_expr_w_(self, ctx:ModuleParser.Constant_expr_w_Context):
        return self.visitChildren(ctx)



del ModuleParser