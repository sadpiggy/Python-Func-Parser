// Generated from /home/srb/wky/lab/ntu/Python-Func-Parser/parser/Function.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, IF=56, ELSE=57, FOR=58, WHILE=59, BREAK=60, 
		CASE=61, CONTINUE=62, SWITCH=63, DO=64, GOTO=65, RETURN=66, TYPEDEF=67, 
		VOID=68, UNSIGNED=69, SIGNED=70, LONG=71, CV_QUALIFIER=72, VIRTUAL=73, 
		TRY=74, CATCH=75, THROW=76, USING=77, NAMESPACE=78, AUTO=79, REGISTER=80, 
		OPERATOR=81, TEMPLATE=82, NEW=83, CLASS_KEY=84, ALPHA_NUMERIC=85, OPENING_CURLY=86, 
		CLOSING_CURLY=87, PRE_IF=88, PRE_ELSE=89, PRE_ENDIF=90, HEX_LITERAL=91, 
		DECIMAL_LITERAL=92, OCTAL_LITERAL=93, FLOATING_POINT_LITERAL=94, CHAR=95, 
		STRING=96, COMMENT=97, WHITESPACE=98, CPPCOMMENT=99, OTHER=100;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_pre_opener = 2, RULE_pre_else = 3, 
		RULE_pre_closer = 4, RULE_opening_curly = 5, RULE_closing_curly = 6, RULE_block_starter = 7, 
		RULE_selection_or_iteration = 8, RULE_do_statement1 = 9, RULE_for_init_statement = 10, 
		RULE_jump_statement = 11, RULE_label = 12, RULE_expr_statement = 13, RULE_condition = 14, 
		RULE_unary_operator = 15, RULE_relational_operator = 16, RULE_constant = 17, 
		RULE_function_decl_specifiers = 18, RULE_ptr_operator = 19, RULE_access_specifier = 20, 
		RULE_operator = 21, RULE_assignment_operator = 22, RULE_equality_operator = 23, 
		RULE_template_decl_start = 24, RULE_template_param_list = 25, RULE_no_brackets = 26, 
		RULE_no_brackets_curlies_or_squares = 27, RULE_no_brackets_or_semicolon = 28, 
		RULE_no_angle_brackets_or_brackets = 29, RULE_no_curlies = 30, RULE_no_squares = 31, 
		RULE_no_squares_or_semicolon = 32, RULE_no_comma_or_semicolon = 33, RULE_assign_water = 34, 
		RULE_assign_water_l2 = 35, RULE_water = 36, RULE_expr = 37, RULE_assign_expr = 38, 
		RULE_conditional_expression = 39, RULE_or_expression = 40, RULE_and_expression = 41, 
		RULE_inclusive_or_expression = 42, RULE_exclusive_or_expression = 43, 
		RULE_bit_and_expression = 44, RULE_equality_expression = 45, RULE_relational_expression = 46, 
		RULE_shift_expression = 47, RULE_additive_expression = 48, RULE_multiplicative_expression = 49, 
		RULE_cast_expression = 50, RULE_cast_target = 51, RULE_unary_expression = 52, 
		RULE_new_expression = 53, RULE_unary_op_and_cast_expr = 54, RULE_sizeof_expression = 55, 
		RULE_sizeof = 56, RULE_sizeof_operand = 57, RULE_sizeof_operand2 = 58, 
		RULE_inc_dec = 59, RULE_postfix_expression = 60, RULE_function_argument_list = 61, 
		RULE_function_argument = 62, RULE_primary_expression = 63, RULE_init_declarator = 64, 
		RULE_declarator = 65, RULE_type_suffix = 66, RULE_simple_decl = 67, RULE_var_decl = 68, 
		RULE_init_declarator_list = 69, RULE_initializer = 70, RULE_initializer_list = 71, 
		RULE_class_def = 72, RULE_class_name = 73, RULE_base_classes = 74, RULE_base_class = 75, 
		RULE_type_name = 76, RULE_base_type = 77, RULE_param_decl_specifiers = 78, 
		RULE_parameter_name = 79, RULE_param_type_list = 80, RULE_param_type = 81, 
		RULE_param_type_id = 82, RULE_identifier = 83, RULE_number = 84, RULE_ptrs = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "pre_opener", "pre_else", "pre_closer", "opening_curly", 
			"closing_curly", "block_starter", "selection_or_iteration", "do_statement1", 
			"for_init_statement", "jump_statement", "label", "expr_statement", "condition", 
			"unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
			"ptr_operator", "access_specifier", "operator", "assignment_operator", 
			"equality_operator", "template_decl_start", "template_param_list", "no_brackets", 
			"no_brackets_curlies_or_squares", "no_brackets_or_semicolon", "no_angle_brackets_or_brackets", 
			"no_curlies", "no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", 
			"assign_water", "assign_water_l2", "water", "expr", "assign_expr", "conditional_expression", 
			"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
			"bit_and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "additive_expression", "multiplicative_expression", 
			"cast_expression", "cast_target", "unary_expression", "new_expression", 
			"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "sizeof_operand", 
			"sizeof_operand2", "inc_dec", "postfix_expression", "function_argument_list", 
			"function_argument", "primary_expression", "init_declarator", "declarator", 
			"type_suffix", "simple_decl", "var_decl", "init_declarator_list", "initializer", 
			"initializer_list", "class_def", "class_name", "base_classes", "base_class", 
			"type_name", "base_type", "param_decl_specifiers", "parameter_name", 
			"param_type_list", "param_type", "param_type_id", "identifier", "number", 
			"ptrs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "':'", "'='", "'&'", "'*'", "'+'", "'-'", 
			"'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'inline'", "'explicit'", 
			"'friend'", "'static'", "'public'", "'private'", "'protected'", "'delete'", 
			"'['", "']'", "'/'", "'%'", "'^'", "'|'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", "'=='", 
			"'!='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", 
			"'::'", "'sizeof'", "'.'", "'restrict'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", 
			"'typedef'", "'void'", "'unsigned'", "'signed'", "'long'", null, "'virtual'", 
			"'try'", "'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
			"'operator'", "'template'", "'new'", null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
			"TYPEDEF", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", 
			"TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "OPERATOR", 
			"TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
			"PRE_IF", "PRE_ELSE", "PRE_ENDIF", "HEX_LITERAL", "DECIMAL_LITERAL", 
			"OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "CHAR", "STRING", "COMMENT", 
			"WHITESPACE", "CPPCOMMENT", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Function.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	def skipToEndOfObject(self):
	    CurlyStack = []
	    o = object()
	    t = self._input.LA(1)

	    while t  and not (not CurlyStack and t == self.CLOSING_CURLY):
	        if t == self.PRE_ELSE:
	            ifdefStack = []
	            self.consume()
	            t = self._input.LA(1)

	            while t  and not (not ifdefStack and t == self.PRE_ENDIF):
	                if t == self.PRE_IF:
	                    ifdefStack.append(o)
	                elif t == self.PRE_ENDIF:
	                    ifdefStack.pop()
	                self.consume()
	                t = self._input.LA(1)

	        if t == self.OPENING_CURLY:
	            CurlyStack.append(o)
	        elif t == self.CLOSING_CURLY:
	            CurlyStack.pop()

	        self.consume()
	        t = self._input.LA(1)

	    if t :
	        self.consume()

	    return True

	def preProcSkipToEnd(self):
	    CurlyStack = []
	    o = object()
	    t = self._input.LA(1)

	    while t and not (not CurlyStack and t == self.PRE_ENDIF):
	        if t == self.PRE_IF:
	            CurlyStack.append(o)
	        elif t == self.PRE_ENDIF:
	            CurlyStack.pop()

	        self.consume()
	        t = self._input.LA(1)

	    if t:
	        self.consume()

	    return True

	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<Pre_openerContext> pre_opener() {
			return getRuleContexts(Pre_openerContext.class);
		}
		public Pre_openerContext pre_opener(int i) {
			return getRuleContext(Pre_openerContext.class,i);
		}
		public List<Pre_closerContext> pre_closer() {
			return getRuleContexts(Pre_closerContext.class);
		}
		public Pre_closerContext pre_closer(int i) {
			return getRuleContext(Pre_closerContext.class,i);
		}
		public List<Pre_elseContext> pre_else() {
			return getRuleContexts(Pre_elseContext.class);
		}
		public Pre_elseContext pre_else(int i) {
			return getRuleContext(Pre_elseContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(172);
					pre_opener();
					}
					break;
				case 2:
					{
					setState(173);
					pre_closer();
					}
					break;
				case 3:
					{
					setState(174);
					pre_else();
					self.preProcSkipToEnd(); 
					}
					break;
				case 4:
					{
					setState(177);
					statement();
					}
					break;
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Opening_curlyContext opening_curly() {
			return getRuleContext(Opening_curlyContext.class,0);
		}
		public Closing_curlyContext closing_curly() {
			return getRuleContext(Closing_curlyContext.class,0);
		}
		public Block_starterContext block_starter() {
			return getRuleContext(Block_starterContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				water();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_openerContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public Pre_openerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_opener; }
	}

	public final Pre_openerContext pre_opener() throws RecognitionException {
		Pre_openerContext _localctx = new Pre_openerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(PRE_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_elseContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public Pre_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else; }
	}

	public final Pre_elseContext pre_else() throws RecognitionException {
		Pre_elseContext _localctx = new Pre_elseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(PRE_ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_closerContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Pre_closerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_closer; }
	}

	public final Pre_closerContext pre_closer() throws RecognitionException {
		Pre_closerContext _localctx = new Pre_closerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(PRE_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opening_curlyContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Opening_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_curly; }
	}

	public final Opening_curlyContext opening_curly() throws RecognitionException {
		Opening_curlyContext _localctx = new Opening_curlyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opening_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(OPENING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closing_curlyContext extends ParserRuleContext {
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Closing_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_curly; }
	}

	public final Closing_curlyContext closing_curly() throws RecognitionException {
		Closing_curlyContext _localctx = new Closing_curlyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closing_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CLOSING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_starterContext extends ParserRuleContext {
		public Selection_or_iterationContext selection_or_iteration() {
			return getRuleContext(Selection_or_iterationContext.class,0);
		}
		public Block_starterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_starter; }
	}

	public final Block_starterContext block_starter() throws RecognitionException {
		Block_starterContext _localctx = new Block_starterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			selection_or_iteration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_or_iterationContext extends ParserRuleContext {
		public Selection_or_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_or_iteration; }
	 
		public Selection_or_iterationContext() { }
		public void copyFrom(Selection_or_iterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_statementContext extends Selection_or_iterationContext {
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public Try_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class If_statementContext extends Selection_or_iterationContext {
		public TerminalNode IF() { return getToken(FunctionParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class Catch_statementContext extends Selection_or_iterationContext {
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public Catch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class For_statementContext extends Selection_or_iterationContext {
		public TerminalNode FOR() { return getToken(FunctionParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class Else_statementContext extends Selection_or_iterationContext {
		public TerminalNode ELSE() { return getToken(FunctionParser.ELSE, 0); }
		public Else_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class Switch_statementContext extends Selection_or_iterationContext {
		public TerminalNode SWITCH() { return getToken(FunctionParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Switch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class Do_statementContext extends Selection_or_iterationContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public Do_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}
	public static class While_statementContext extends Selection_or_iterationContext {
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
	}

	public final Selection_or_iterationContext selection_or_iteration() throws RecognitionException {
		Selection_or_iterationContext _localctx = new Selection_or_iterationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selection_or_iteration);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(CATCH);
				setState(207);
				match(T__0);
				setState(208);
				param_type();
				setState(209);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(IF);
				setState(212);
				match(T__0);
				setState(213);
				condition();
				setState(214);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(SWITCH);
				setState(218);
				match(T__0);
				setState(219);
				condition();
				setState(220);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(FOR);
				setState(223);
				match(T__0);
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__19:
				case T__20:
				case T__21:
				case T__45:
				case T__46:
				case T__51:
				case T__52:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
					{
					setState(224);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(225);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (LONG - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (NEW - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (ALPHA_NUMERIC - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (OCTAL_LITERAL - 68)) | (1L << (FLOATING_POINT_LITERAL - 68)) | (1L << (CHAR - 68)) | (1L << (STRING - 68)))) != 0)) {
					{
					setState(228);
					condition();
					}
				}

				setState(231);
				match(T__2);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(232);
					expr();
					}
				}

				setState(235);
				match(T__1);
				}
				break;
			case DO:
				_localctx = new Do_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(WHILE);
				setState(238);
				match(T__0);
				setState(239);
				condition();
				setState(240);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statement1Context extends ParserRuleContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement1; }
	}

	public final Do_statement1Context do_statement1() throws RecognitionException {
		Do_statement1Context _localctx = new Do_statement1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_statement1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(DO);
			setState(245);
			statement();
			setState(246);
			match(WHILE);
			setState(247);
			match(T__0);
			setState(248);
			expr();
			setState(249);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_init_statementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_init_statement);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				simple_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				expr();
				setState(253);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(FunctionParser.BREAK, 0); }
		public BreakStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(FunctionParser.CONTINUE, 0); }
		public ContinueStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(FunctionParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(FunctionParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jump_statement);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(BREAK);
				setState(258);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(CONTINUE);
				setState(260);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(GOTO);
				setState(262);
				identifier();
				setState(263);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(RETURN);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(266);
					expr();
					}
				}

				setState(269);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode CASE() { return getToken(FunctionParser.CASE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(272);
				match(CASE);
				}
			}

			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case ALPHA_NUMERIC:
				{
				setState(275);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(276);
				number();
				}
				break;
			case CHAR:
				{
				setState(277);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
				{
				setState(282);
				expr();
				}
			}

			setState(285);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				type_name();
				setState(289);
				declarator();
				setState(290);
				match(T__4);
				setState(291);
				assign_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(FunctionParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (T__16 - 16)) | (1L << (T__17 - 16)) | (1L << (T__18 - 16)) | (1L << (VIRTUAL - 16)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(308);
					match(T__23);
					setState(309);
					match(T__24);
					}
				}

				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(T__8);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(T__6);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				match(T__27);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				match(T__5);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				match(T__28);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(320);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 11);
				{
				setState(321);
				match(T__10);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(322);
				match(T__4);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 13);
				{
				setState(323);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 14);
				{
				setState(324);
				match(T__12);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 15);
				{
				setState(325);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 16);
				{
				setState(326);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 17);
				{
				setState(327);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 18);
				{
				setState(328);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 19);
				{
				setState(329);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 20);
				{
				setState(330);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 21);
				{
				setState(331);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 22);
				{
				setState(332);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 23);
				{
				setState(333);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 24);
				{
				setState(334);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 25);
				{
				setState(335);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 26);
				{
				setState(336);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 27);
				{
				setState(337);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 28);
				{
				setState(338);
				match(T__42);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 29);
				{
				setState(339);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 30);
				{
				setState(340);
				match(T__14);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 31);
				{
				setState(341);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 32);
				{
				setState(342);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 33);
				{
				setState(343);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 34);
				{
				setState(344);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 35);
				{
				setState(345);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 36);
				{
				setState(346);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 37);
				{
				setState(347);
				match(T__49);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(348);
				match(T__0);
				setState(349);
				match(T__1);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 39);
				{
				setState(350);
				match(T__23);
				setState(351);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_startContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(TEMPLATE);
			setState(359);
			match(T__11);
			setState(360);
			template_param_list();
			setState(361);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_param_listContext extends ParserRuleContext {
		public List<No_angle_brackets_or_bracketsContext> no_angle_brackets_or_brackets() {
			return getRuleContexts(No_angle_brackets_or_bracketsContext.class);
		}
		public No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets(int i) {
			return getRuleContext(No_angle_brackets_or_bracketsContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(363);
					match(T__11);
					setState(364);
					template_param_list();
					setState(365);
					match(T__12);
					}
					}
					break;
				case T__0:
					{
					{
					setState(367);
					match(T__0);
					setState(368);
					template_param_list();
					setState(369);
					match(T__1);
					}
					}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case IF:
				case ELSE:
				case FOR:
				case WHILE:
				case BREAK:
				case CASE:
				case CONTINUE:
				case SWITCH:
				case DO:
				case GOTO:
				case RETURN:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case OPERATOR:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case PRE_IF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case COMMENT:
				case WHITESPACE:
				case CPPCOMMENT:
				case OTHER:
					{
					setState(371);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE) | (1L << CONTINUE) | (1L << SWITCH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (CPPCOMMENT - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__23) | (1L << T__24))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_curliesContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_waterContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << T__47))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_water_l2Context extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__23) | (1L << T__24))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			assign_expr();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(399);
				match(T__47);
				setState(400);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			conditional_expression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(404);
				assignment_operator();
				setState(405);
				assign_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditional_expression);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				or_expression();
				{
				setState(411);
				match(T__50);
				setState(412);
				expr();
				setState(413);
				match(T__3);
				setState(414);
				conditional_expression();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			and_expression();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(419);
				match(T__44);
				setState(420);
				or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			inclusive_or_expression();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(424);
				match(T__43);
				setState(425);
				and_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			exclusive_or_expression();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(429);
				match(T__28);
				setState(430);
				inclusive_or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			bit_and_expression();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(434);
				match(T__27);
				setState(435);
				exclusive_or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			equality_expression();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(439);
				match(T__5);
				setState(440);
				bit_and_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			relational_expression();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41 || _la==T__42) {
				{
				setState(444);
				equality_operator();
				setState(445);
				equality_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			shift_expression();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(450);
				relational_operator();
				setState(451);
				relational_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			additive_expression();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37 || _la==T__38) {
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				shift_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			multiplicative_expression();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				additive_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			cast_expression();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(466);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(467);
				multiplicative_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cast_expression);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(470);
				match(T__0);
				setState(471);
				cast_target();
				setState(472);
				match(T__1);
				setState(473);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			type_name();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(479);
				ptr_operator();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unary_expression);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				inc_dec();
				setState(486);
				cast_expression();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				unary_op_and_cast_expr();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				sizeof_expression();
				}
				break;
			case T__51:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				new_expression();
				}
				break;
			case T__0:
			case T__19:
			case T__20:
			case T__21:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				postfix_expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_new_expression);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(494);
					match(T__51);
					}
				}

				setState(497);
				match(NEW);
				setState(498);
				type_name();
				setState(499);
				match(T__23);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(500);
					conditional_expression();
					}
				}

				setState(503);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(505);
					match(T__51);
					}
				}

				setState(508);
				match(NEW);
				setState(509);
				type_name();
				setState(510);
				match(T__0);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(511);
					expr();
					}
				}

				setState(514);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			unary_operator();
			setState(519);
			cast_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sizeof_expression);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				sizeof();
				setState(522);
				match(T__0);
				setState(523);
				sizeof_operand();
				setState(524);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				sizeof();
				setState(527);
				sizeof_operand2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			type_name();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(534);
				ptr_operator();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(545);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(571);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(547);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(548);
						match(T__23);
						setState(549);
						expr();
						setState(550);
						match(T__24);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(552);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(553);
						match(T__0);
						setState(554);
						function_argument_list();
						setState(555);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(557);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(558);
						match(T__53);
						setState(560);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(559);
							match(TEMPLATE);
							}
						}

						{
						setState(562);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(563);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(564);
						match(T__49);
						setState(566);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(565);
							match(TEMPLATE);
							}
						}

						{
						setState(568);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(569);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(570);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
				{
				setState(576);
				function_argument();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__47) {
					{
					{
					setState(577);
					match(T__47);
					setState(578);
					function_argument();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			assign_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primary_expression);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				constant();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(T__0);
				setState(591);
				expr();
				setState(592);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclWithAssignContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclWithAssignContext(Init_declaratorContext ctx) { copyFrom(ctx); }
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
	}
	public static class InitDeclWithCallContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitDeclWithCallContext(Init_declaratorContext ctx) { copyFrom(ctx); }
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_init_declarator);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				declarator();
				setState(597);
				match(T__0);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(598);
					expr();
					}
				}

				setState(601);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				declarator();
				setState(604);
				match(T__4);
				setState(605);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				declarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(610);
				ptrs();
				}
			}

			setState(613);
			identifier();
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(614);
				type_suffix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_suffixContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_type_suffix);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(617);
				match(T__23);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__45) | (1L << T__46) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NEW - 83)) | (1L << (ALPHA_NUMERIC - 83)) | (1L << (HEX_LITERAL - 83)) | (1L << (DECIMAL_LITERAL - 83)) | (1L << (OCTAL_LITERAL - 83)) | (1L << (FLOATING_POINT_LITERAL - 83)) | (1L << (CHAR - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(618);
					conditional_expression();
					}
				}

				setState(621);
				match(T__24);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				param_type_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(625);
				match(TYPEDEF);
				}
			}

			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(628);
				template_decl_start();
				}
			}

			}
			setState(631);
			var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_var_decl);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				class_def();
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(634);
					init_declarator_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				type_name();
				setState(638);
				init_declarator_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			init_declarator();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(643);
				match(T__47);
				setState(644);
				init_declarator();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_initializer);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__45:
			case T__46:
			case T__51:
			case T__52:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(OPENING_CURLY);
				setState(654);
				initializer_list();
				setState(655);
				match(CLOSING_CURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			initializer();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(660);
				match(T__47);
				setState(661);
				initializer();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(CLASS_KEY);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(668);
				class_name();
				}
			}

			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(671);
				base_classes();
				}
			}

			setState(674);
			match(OPENING_CURLY);
			self.skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__3);
			setState(680);
			base_class();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(681);
				match(T__47);
				setState(682);
				base_class();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(688);
				match(VIRTUAL);
				}
			}

			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(691);
				access_specifier();
				}
				break;
			}
			setState(694);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(FunctionParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(FunctionParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(FunctionParser.SIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_type_name);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(696);
					match(CV_QUALIFIER);
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (CLASS_KEY - 69)))) != 0)) {
					{
					setState(702);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (UNSIGNED - 69)) | (1L << (SIGNED - 69)) | (1L << (CLASS_KEY - 69)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(705);
				base_type();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(706);
					match(T__11);
					setState(707);
					template_param_list();
					setState(708);
					match(T__12);
					}
				}

				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__51) {
					{
					{
					setState(712);
					match(T__51);
					setState(713);
					base_type();
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11) {
						{
						setState(714);
						match(T__11);
						setState(715);
						template_param_list();
						setState(716);
						match(T__12);
						}
					}

					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(725);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(UNSIGNED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				match(SIGNED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(FunctionParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(FunctionParser.LONG, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(732);
					_la = _input.LA(1);
					if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (LONG - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(735); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(FunctionParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(FunctionParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(737);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(740);
			type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_param_type_list);
		int _la;
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(T__0);
				setState(745);
				match(VOID);
				setState(746);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(T__0);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (VOID - 68)) | (1L << (UNSIGNED - 68)) | (1L << (SIGNED - 68)) | (1L << (LONG - 68)) | (1L << (CV_QUALIFIER - 68)) | (1L << (AUTO - 68)) | (1L << (REGISTER - 68)) | (1L << (CLASS_KEY - 68)) | (1L << (ALPHA_NUMERIC - 68)))) != 0)) {
					{
					setState(748);
					param_type();
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__47) {
						{
						{
						setState(749);
						match(T__47);
						setState(750);
						param_type();
						}
						}
						setState(755);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(758);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_typeContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			param_decl_specifiers();
			setState(762);
			param_type_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(764);
				ptrs();
				}
			}

			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(767);
				match(T__0);
				setState(768);
				param_type_id();
				setState(769);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(771);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__23) {
				{
				setState(776);
				type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		try {
			int _alt;
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(779);
				match(ALPHA_NUMERIC);
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						match(T__51);
						setState(781);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				}
				break;
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				access_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrsContext extends ParserRuleContext {
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(792);
				ptr_operator();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__54) {
					{
					setState(793);
					match(T__54);
					}
				}

				}
				}
				setState(798); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==T__6 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0323\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c2\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3\n\5\n\u00e8"+
		"\n\n\3\n\3\n\5\n\u00ec\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f5\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0102\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3\r\5\r\u0111\n\r\3\16"+
		"\5\16\u0114\n\16\3\16\3\16\3\16\5\16\u0119\n\16\3\16\3\16\3\17\5\17\u011e"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0128\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u0139\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0163\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u0177\n\33\r\33\16\33\u0178\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u0194\n\'\3(\3(\3(\3(\5(\u019a\n(\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u01a3\n)\3*\3*\3*\5*\u01a8\n*\3+\3+\3+\5+\u01ad\n+"+
		"\3,\3,\3,\5,\u01b2\n,\3-\3-\3-\5-\u01b7\n-\3.\3.\3.\5.\u01bc\n.\3/\3/"+
		"\3/\3/\5/\u01c2\n/\3\60\3\60\3\60\3\60\5\60\u01c8\n\60\3\61\3\61\3\61"+
		"\5\61\u01cd\n\61\3\62\3\62\3\62\5\62\u01d2\n\62\3\63\3\63\3\63\5\63\u01d7"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01df\n\64\3\65\3\65\7\65\u01e3"+
		"\n\65\f\65\16\65\u01e6\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01ef"+
		"\n\66\3\67\5\67\u01f2\n\67\3\67\3\67\3\67\3\67\5\67\u01f8\n\67\3\67\3"+
		"\67\3\67\5\67\u01fd\n\67\3\67\3\67\3\67\3\67\5\67\u0203\n\67\3\67\3\67"+
		"\5\67\u0207\n\67\38\38\38\39\39\39\39\39\39\39\39\59\u0214\n9\3:\3:\3"+
		";\3;\7;\u021a\n;\f;\16;\u021d\13;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0233\n>\3>\3>\3>\3>\5>\u0239\n>\3>\3>\3>"+
		"\7>\u023e\n>\f>\16>\u0241\13>\3?\3?\3?\7?\u0246\n?\f?\16?\u0249\13?\5"+
		"?\u024b\n?\3@\3@\3A\3A\3A\3A\3A\3A\5A\u0255\nA\3B\3B\3B\5B\u025a\nB\3"+
		"B\3B\3B\3B\3B\3B\3B\5B\u0263\nB\3C\5C\u0266\nC\3C\3C\5C\u026a\nC\3D\3"+
		"D\5D\u026e\nD\3D\3D\5D\u0272\nD\3E\5E\u0275\nE\3E\5E\u0278\nE\3E\3E\3"+
		"F\3F\5F\u027e\nF\3F\3F\3F\5F\u0283\nF\3G\3G\3G\7G\u0288\nG\fG\16G\u028b"+
		"\13G\3G\3G\3H\3H\3H\3H\3H\5H\u0294\nH\3I\3I\3I\7I\u0299\nI\fI\16I\u029c"+
		"\13I\3J\3J\5J\u02a0\nJ\3J\5J\u02a3\nJ\3J\3J\3J\3K\3K\3L\3L\3L\3L\7L\u02ae"+
		"\nL\fL\16L\u02b1\13L\3M\5M\u02b4\nM\3M\5M\u02b7\nM\3M\3M\3N\7N\u02bc\n"+
		"N\fN\16N\u02bf\13N\3N\5N\u02c2\nN\3N\3N\3N\3N\3N\5N\u02c9\nN\3N\3N\3N"+
		"\3N\3N\3N\5N\u02d1\nN\7N\u02d3\nN\fN\16N\u02d6\13N\3N\5N\u02d9\nN\3N\3"+
		"N\5N\u02dd\nN\3O\6O\u02e0\nO\rO\16O\u02e1\3P\5P\u02e5\nP\3P\3P\3Q\3Q\3"+
		"R\3R\3R\3R\3R\3R\3R\7R\u02f2\nR\fR\16R\u02f5\13R\5R\u02f7\nR\3R\5R\u02fa"+
		"\nR\3S\3S\3S\3T\5T\u0300\nT\3T\3T\3T\3T\3T\5T\u0307\nT\5T\u0309\nT\3T"+
		"\5T\u030c\nT\3U\3U\3U\7U\u0311\nU\fU\16U\u0314\13U\3U\5U\u0317\nU\3V\3"+
		"V\3W\3W\5W\u031d\nW\6W\u031f\nW\rW\16W\u0320\3W\2\3zX\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\2\34\3\2\b\r\3\2\16\21\3\2]b\4\2\22\25KK\3\2\b\t\3\2\26\30\4\2"+
		"\31\31UU\5\2\7\7 \'*+\3\2,-\3\2\3\4\5\2\3\4\32\33XY\3\2\3\5\4\2\3\4\16"+
		"\17\3\2XY\3\2\32\33\4\2\5\5\32\33\4\2\5\5\62\62\6\2\3\5\32\33\62\62XY"+
		"\3\2()\3\2\n\13\4\2\t\t\34\35\3\2\60\61\4\2GHVV\5\2FFIIWW\3\2QR\3\2]_"+
		"\2\u0362\2\u00b6\3\2\2\2\4\u00c1\3\2\2\2\6\u00c3\3\2\2\2\b\u00c5\3\2\2"+
		"\2\n\u00c7\3\2\2\2\f\u00c9\3\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22"+
		"\u00f4\3\2\2\2\24\u00f6\3\2\2\2\26\u0101\3\2\2\2\30\u0110\3\2\2\2\32\u0113"+
		"\3\2\2\2\34\u011d\3\2\2\2\36\u0127\3\2\2\2 \u0129\3\2\2\2\"\u012b\3\2"+
		"\2\2$\u012d\3\2\2\2&\u012f\3\2\2\2(\u0131\3\2\2\2*\u0133\3\2\2\2,\u0162"+
		"\3\2\2\2.\u0164\3\2\2\2\60\u0166\3\2\2\2\62\u0168\3\2\2\2\64\u0176\3\2"+
		"\2\2\66\u017a\3\2\2\28\u017c\3\2\2\2:\u017e\3\2\2\2<\u0180\3\2\2\2>\u0182"+
		"\3\2\2\2@\u0184\3\2\2\2B\u0186\3\2\2\2D\u0188\3\2\2\2F\u018a\3\2\2\2H"+
		"\u018c\3\2\2\2J\u018e\3\2\2\2L\u0190\3\2\2\2N\u0195\3\2\2\2P\u01a2\3\2"+
		"\2\2R\u01a4\3\2\2\2T\u01a9\3\2\2\2V\u01ae\3\2\2\2X\u01b3\3\2\2\2Z\u01b8"+
		"\3\2\2\2\\\u01bd\3\2\2\2^\u01c3\3\2\2\2`\u01c9\3\2\2\2b\u01ce\3\2\2\2"+
		"d\u01d3\3\2\2\2f\u01de\3\2\2\2h\u01e0\3\2\2\2j\u01ee\3\2\2\2l\u0206\3"+
		"\2\2\2n\u0208\3\2\2\2p\u0213\3\2\2\2r\u0215\3\2\2\2t\u0217\3\2\2\2v\u021e"+
		"\3\2\2\2x\u0220\3\2\2\2z\u0222\3\2\2\2|\u024a\3\2\2\2~\u024c\3\2\2\2\u0080"+
		"\u0254\3\2\2\2\u0082\u0262\3\2\2\2\u0084\u0265\3\2\2\2\u0086\u0271\3\2"+
		"\2\2\u0088\u0274\3\2\2\2\u008a\u0282\3\2\2\2\u008c\u0284\3\2\2\2\u008e"+
		"\u0293\3\2\2\2\u0090\u0295\3\2\2\2\u0092\u029d\3\2\2\2\u0094\u02a7\3\2"+
		"\2\2\u0096\u02a9\3\2\2\2\u0098\u02b3\3\2\2\2\u009a\u02dc\3\2\2\2\u009c"+
		"\u02df\3\2\2\2\u009e\u02e4\3\2\2\2\u00a0\u02e8\3\2\2\2\u00a2\u02f9\3\2"+
		"\2\2\u00a4\u02fb\3\2\2\2\u00a6\u02ff\3\2\2\2\u00a8\u0316\3\2\2\2\u00aa"+
		"\u0318\3\2\2\2\u00ac\u031e\3\2\2\2\u00ae\u00b5\5\6\4\2\u00af\u00b5\5\n"+
		"\6\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\b\2\1\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b5\5\4\3\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\3\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c2\5\f\7\2"+
		"\u00ba\u00c2\5\16\b\2\u00bb\u00c2\5\20\t\2\u00bc\u00c2\5\30\r\2\u00bd"+
		"\u00c2\5\32\16\2\u00be\u00c2\5\u0088E\2\u00bf\u00c2\5\34\17\2\u00c0\u00c2"+
		"\5J&\2\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2\5\3\2\2\2\u00c3\u00c4\7Z\2\2\u00c4\7\3"+
		"\2\2\2\u00c5\u00c6\7[\2\2\u00c6\t\3\2\2\2\u00c7\u00c8\7\\\2\2\u00c8\13"+
		"\3\2\2\2\u00c9\u00ca\7X\2\2\u00ca\r\3\2\2\2\u00cb\u00cc\7Y\2\2\u00cc\17"+
		"\3\2\2\2\u00cd\u00ce\5\22\n\2\u00ce\21\3\2\2\2\u00cf\u00f5\7L\2\2\u00d0"+
		"\u00d1\7M\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\5\u00a4S\2\u00d3\u00d4\7"+
		"\4\2\2\u00d4\u00f5\3\2\2\2\u00d5\u00d6\7:\2\2\u00d6\u00d7\7\3\2\2\u00d7"+
		"\u00d8\5\36\20\2\u00d8\u00d9\7\4\2\2\u00d9\u00f5\3\2\2\2\u00da\u00f5\7"+
		";\2\2\u00db\u00dc\7A\2\2\u00dc\u00dd\7\3\2\2\u00dd\u00de\5\36\20\2\u00de"+
		"\u00df\7\4\2\2\u00df\u00f5\3\2\2\2\u00e0\u00e1\7<\2\2\u00e1\u00e4\7\3"+
		"\2\2\u00e2\u00e5\5\26\f\2\u00e3\u00e5\7\5\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5\36\20\2\u00e7\u00e6\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7\5\2\2\u00ea"+
		"\u00ec\5L\'\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00f5\7\4\2\2\u00ee\u00f5\7B\2\2\u00ef\u00f0\7=\2\2\u00f0\u00f1"+
		"\7\3\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\4\2\2\u00f3\u00f5\3\2\2\2"+
		"\u00f4\u00cf\3\2\2\2\u00f4\u00d0\3\2\2\2\u00f4\u00d5\3\2\2\2\u00f4\u00da"+
		"\3\2\2\2\u00f4\u00db\3\2\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f5\23\3\2\2\2\u00f6\u00f7\7B\2\2\u00f7\u00f8\5\4\3\2"+
		"\u00f8\u00f9\7=\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5L\'\2\u00fb\u00fc"+
		"\7\4\2\2\u00fc\25\3\2\2\2\u00fd\u0102\5\u0088E\2\u00fe\u00ff\5L\'\2\u00ff"+
		"\u0100\7\5\2\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2"+
		"\2\2\u0102\27\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0111\7\5\2\2\u0105\u0106"+
		"\7@\2\2\u0106\u0111\7\5\2\2\u0107\u0108\7C\2\2\u0108\u0109\5\u00a8U\2"+
		"\u0109\u010a\7\5\2\2\u010a\u0111\3\2\2\2\u010b\u010d\7D\2\2\u010c\u010e"+
		"\5L\'\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\7\5\2\2\u0110\u0103\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0107\3\2"+
		"\2\2\u0110\u010b\3\2\2\2\u0111\31\3\2\2\2\u0112\u0114\7?\2\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0119\5\u00a8U"+
		"\2\u0116\u0119\5\u00aaV\2\u0117\u0119\7a\2\2\u0118\u0115\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\6"+
		"\2\2\u011b\33\3\2\2\2\u011c\u011e\5L\'\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\5\2\2\u0120\35\3\2\2\2\u0121"+
		"\u0128\5L\'\2\u0122\u0123\5\u009aN\2\u0123\u0124\5\u0084C\2\u0124\u0125"+
		"\7\7\2\2\u0125\u0126\5N(\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0127"+
		"\u0122\3\2\2\2\u0128\37\3\2\2\2\u0129\u012a\t\2\2\2\u012a!\3\2\2\2\u012b"+
		"\u012c\t\3\2\2\u012c#\3\2\2\2\u012d\u012e\t\4\2\2\u012e%\3\2\2\2\u012f"+
		"\u0130\t\5\2\2\u0130\'\3\2\2\2\u0131\u0132\t\6\2\2\u0132)\3\2\2\2\u0133"+
		"\u0134\t\7\2\2\u0134+\3\2\2\2\u0135\u0138\t\b\2\2\u0136\u0137\7\32\2\2"+
		"\u0137\u0139\7\33\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0163"+
		"\3\2\2\2\u013a\u0163\7\n\2\2\u013b\u0163\7\13\2\2\u013c\u0163\7\t\2\2"+
		"\u013d\u0163\7\34\2\2\u013e\u0163\7\35\2\2\u013f\u0163\7\36\2\2\u0140"+
		"\u0163\7\b\2\2\u0141\u0163\7\37\2\2\u0142\u0163\7\f\2\2\u0143\u0163\7"+
		"\r\2\2\u0144\u0163\7\7\2\2\u0145\u0163\7\16\2\2\u0146\u0163\7\17\2\2\u0147"+
		"\u0163\7 \2\2\u0148\u0163\7!\2\2\u0149\u0163\7\"\2\2\u014a\u0163\7#\2"+
		"\2\u014b\u0163\7$\2\2\u014c\u0163\7%\2\2\u014d\u0163\7&\2\2\u014e\u0163"+
		"\7\'\2\2\u014f\u0163\7(\2\2\u0150\u0163\7)\2\2\u0151\u0163\7*\2\2\u0152"+
		"\u0163\7+\2\2\u0153\u0163\7,\2\2\u0154\u0163\7-\2\2\u0155\u0163\7\20\2"+
		"\2\u0156\u0163\7\21\2\2\u0157\u0163\7.\2\2\u0158\u0163\7/\2\2\u0159\u0163"+
		"\7\60\2\2\u015a\u0163\7\61\2\2\u015b\u0163\7\62\2\2\u015c\u0163\7\63\2"+
		"\2\u015d\u0163\7\64\2\2\u015e\u015f\7\3\2\2\u015f\u0163\7\4\2\2\u0160"+
		"\u0161\7\32\2\2\u0161\u0163\7\33\2\2\u0162\u0135\3\2\2\2\u0162\u013a\3"+
		"\2\2\2\u0162\u013b\3\2\2\2\u0162\u013c\3\2\2\2\u0162\u013d\3\2\2\2\u0162"+
		"\u013e\3\2\2\2\u0162\u013f\3\2\2\2\u0162\u0140\3\2\2\2\u0162\u0141\3\2"+
		"\2\2\u0162\u0142\3\2\2\2\u0162\u0143\3\2\2\2\u0162\u0144\3\2\2\2\u0162"+
		"\u0145\3\2\2\2\u0162\u0146\3\2\2\2\u0162\u0147\3\2\2\2\u0162\u0148\3\2"+
		"\2\2\u0162\u0149\3\2\2\2\u0162\u014a\3\2\2\2\u0162\u014b\3\2\2\2\u0162"+
		"\u014c\3\2\2\2\u0162\u014d\3\2\2\2\u0162\u014e\3\2\2\2\u0162\u014f\3\2"+
		"\2\2\u0162\u0150\3\2\2\2\u0162\u0151\3\2\2\2\u0162\u0152\3\2\2\2\u0162"+
		"\u0153\3\2\2\2\u0162\u0154\3\2\2\2\u0162\u0155\3\2\2\2\u0162\u0156\3\2"+
		"\2\2\u0162\u0157\3\2\2\2\u0162\u0158\3\2\2\2\u0162\u0159\3\2\2\2\u0162"+
		"\u015a\3\2\2\2\u0162\u015b\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2"+
		"\2\2\u0162\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0163-\3\2\2\2\u0164\u0165"+
		"\t\t\2\2\u0165/\3\2\2\2\u0166\u0167\t\n\2\2\u0167\61\3\2\2\2\u0168\u0169"+
		"\7T\2\2\u0169\u016a\7\16\2\2\u016a\u016b\5\64\33\2\u016b\u016c\7\17\2"+
		"\2\u016c\63\3\2\2\2\u016d\u016e\7\16\2\2\u016e\u016f\5\64\33\2\u016f\u0170"+
		"\7\17\2\2\u0170\u0177\3\2\2\2\u0171\u0172\7\3\2\2\u0172\u0173\5\64\33"+
		"\2\u0173\u0174\7\4\2\2\u0174\u0177\3\2\2\2\u0175\u0177\5<\37\2\u0176\u016d"+
		"\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\65\3\2\2\2\u017a\u017b\n\13\2"+
		"\2\u017b\67\3\2\2\2\u017c\u017d\n\f\2\2\u017d9\3\2\2\2\u017e\u017f\n\r"+
		"\2\2\u017f;\3\2\2\2\u0180\u0181\n\16\2\2\u0181=\3\2\2\2\u0182\u0183\n"+
		"\17\2\2\u0183?\3\2\2\2\u0184\u0185\n\20\2\2\u0185A\3\2\2\2\u0186\u0187"+
		"\n\21\2\2\u0187C\3\2\2\2\u0188\u0189\n\22\2\2\u0189E\3\2\2\2\u018a\u018b"+
		"\n\23\2\2\u018bG\3\2\2\2\u018c\u018d\n\f\2\2\u018dI\3\2\2\2\u018e\u018f"+
		"\13\2\2\2\u018fK\3\2\2\2\u0190\u0193\5N(\2\u0191\u0192\7\62\2\2\u0192"+
		"\u0194\5L\'\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194M\3\2\2\2\u0195"+
		"\u0199\5P)\2\u0196\u0197\5.\30\2\u0197\u0198\5N(\2\u0198\u019a\3\2\2\2"+
		"\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019aO\3\2\2\2\u019b\u01a3\5"+
		"R*\2\u019c\u019d\5R*\2\u019d\u019e\7\65\2\2\u019e\u019f\5L\'\2\u019f\u01a0"+
		"\7\6\2\2\u01a0\u01a1\5P)\2\u01a1\u01a3\3\2\2\2\u01a2\u019b\3\2\2\2\u01a2"+
		"\u019c\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a7\5T+\2\u01a5\u01a6\7/\2\2\u01a6"+
		"\u01a8\5R*\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8S\3\2\2\2\u01a9"+
		"\u01ac\5V,\2\u01aa\u01ab\7.\2\2\u01ab\u01ad\5T+\2\u01ac\u01aa\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01adU\3\2\2\2\u01ae\u01b1\5X-\2\u01af\u01b0\7\37"+
		"\2\2\u01b0\u01b2\5V,\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2W"+
		"\3\2\2\2\u01b3\u01b6\5Z.\2\u01b4\u01b5\7\36\2\2\u01b5\u01b7\5X-\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01bb\5\\/\2\u01b9"+
		"\u01ba\7\b\2\2\u01ba\u01bc\5Z.\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2"+
		"\2\u01bc[\3\2\2\2\u01bd\u01c1\5^\60\2\u01be\u01bf\5\60\31\2\u01bf\u01c0"+
		"\5\\/\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"]\3\2\2\2\u01c3\u01c7\5`\61\2\u01c4\u01c5\5\"\22\2\u01c5\u01c6\5^\60\2"+
		"\u01c6\u01c8\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8_\3"+
		"\2\2\2\u01c9\u01cc\5b\62\2\u01ca\u01cb\t\24\2\2\u01cb\u01cd\5`\61\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cda\3\2\2\2\u01ce\u01d1\5d\63\2"+
		"\u01cf\u01d0\t\25\2\2\u01d0\u01d2\5b\62\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2c\3\2\2\2\u01d3\u01d6\5f\64\2\u01d4\u01d5\t\26\2\2\u01d5"+
		"\u01d7\5d\63\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7e\3\2\2\2"+
		"\u01d8\u01d9\7\3\2\2\u01d9\u01da\5h\65\2\u01da\u01db\7\4\2\2\u01db\u01dc"+
		"\5f\64\2\u01dc\u01df\3\2\2\2\u01dd\u01df\5j\66\2\u01de\u01d8\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01dfg\3\2\2\2\u01e0\u01e4\5\u009aN\2\u01e1\u01e3\5(\25"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5i\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\5x=\2\u01e8\u01e9"+
		"\5f\64\2\u01e9\u01ef\3\2\2\2\u01ea\u01ef\5n8\2\u01eb\u01ef\5p9\2\u01ec"+
		"\u01ef\5l\67\2\u01ed\u01ef\5z>\2\u01ee\u01e7\3\2\2\2\u01ee\u01ea\3\2\2"+
		"\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efk"+
		"\3\2\2\2\u01f0\u01f2\7\66\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2"+
		"\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7U\2\2\u01f4\u01f5\5\u009aN\2\u01f5\u01f7"+
		"\7\32\2\2\u01f6\u01f8\5P)\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\7\33\2\2\u01fa\u0207\3\2\2\2\u01fb\u01fd\7"+
		"\66\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\7U\2\2\u01ff\u0200\5\u009aN\2\u0200\u0202\7\3\2\2\u0201\u0203\5"+
		"L\'\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\7\4\2\2\u0205\u0207\3\2\2\2\u0206\u01f1\3\2\2\2\u0206\u01fc\3\2"+
		"\2\2\u0207m\3\2\2\2\u0208\u0209\5 \21\2\u0209\u020a\5f\64\2\u020ao\3\2"+
		"\2\2\u020b\u020c\5r:\2\u020c\u020d\7\3\2\2\u020d\u020e\5t;\2\u020e\u020f"+
		"\7\4\2\2\u020f\u0214\3\2\2\2\u0210\u0211\5r:\2\u0211\u0212\5v<\2\u0212"+
		"\u0214\3\2\2\2\u0213\u020b\3\2\2\2\u0213\u0210\3\2\2\2\u0214q\3\2\2\2"+
		"\u0215\u0216\7\67\2\2\u0216s\3\2\2\2\u0217\u021b\5\u009aN\2\u0218\u021a"+
		"\5(\25\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021cu\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\5j\66\2"+
		"\u021fw\3\2\2\2\u0220\u0221\t\27\2\2\u0221y\3\2\2\2\u0222\u0223\b>\1\2"+
		"\u0223\u0224\5\u0080A\2\u0224\u023f\3\2\2\2\u0225\u0226\f\b\2\2\u0226"+
		"\u0227\7\32\2\2\u0227\u0228\5L\'\2\u0228\u0229\7\33\2\2\u0229\u023e\3"+
		"\2\2\2\u022a\u022b\f\7\2\2\u022b\u022c\7\3\2\2\u022c\u022d\5|?\2\u022d"+
		"\u022e\7\4\2\2\u022e\u023e\3\2\2\2\u022f\u0230\f\6\2\2\u0230\u0232\78"+
		"\2\2\u0231\u0233\7T\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u023e\5\u00a8U\2\u0235\u0236\f\5\2\2\u0236\u0238"+
		"\7\64\2\2\u0237\u0239\7T\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023e\5\u00a8U\2\u023b\u023c\f\4\2\2\u023c\u023e"+
		"\5x=\2\u023d\u0225\3\2\2\2\u023d\u022a\3\2\2\2\u023d\u022f\3\2\2\2\u023d"+
		"\u0235\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240{\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0247"+
		"\5~@\2\u0243\u0244\7\62\2\2\u0244\u0246\5~@\2\u0245\u0243\3\2\2\2\u0246"+
		"\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024b\3\2"+
		"\2\2\u0249\u0247\3\2\2\2\u024a\u0242\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"}\3\2\2\2\u024c\u024d\5N(\2\u024d\177\3\2\2\2\u024e\u0255\5\u00a8U\2\u024f"+
		"\u0255\5$\23\2\u0250\u0251\7\3\2\2\u0251\u0252\5L\'\2\u0252\u0253\7\4"+
		"\2\2\u0253\u0255\3\2\2\2\u0254\u024e\3\2\2\2\u0254\u024f\3\2\2\2\u0254"+
		"\u0250\3\2\2\2\u0255\u0081\3\2\2\2\u0256\u0257\5\u0084C\2\u0257\u0259"+
		"\7\3\2\2\u0258\u025a\5L\'\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\7\4\2\2\u025c\u0263\3\2\2\2\u025d\u025e\5\u0084"+
		"C\2\u025e\u025f\7\7\2\2\u025f\u0260\5\u008eH\2\u0260\u0263\3\2\2\2\u0261"+
		"\u0263\5\u0084C\2\u0262\u0256\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u0261"+
		"\3\2\2\2\u0263\u0083\3\2\2\2\u0264\u0266\5\u00acW\2\u0265\u0264\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\5\u00a8U\2\u0268"+
		"\u026a\5\u0086D\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0085"+
		"\3\2\2\2\u026b\u026d\7\32\2\2\u026c\u026e\5P)\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272\7\33\2\2\u0270\u0272\5"+
		"\u00a2R\2\u0271\u026b\3\2\2\2\u0271\u0270\3\2\2\2\u0272\u0087\3\2\2\2"+
		"\u0273\u0275\7E\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0278\5\62\32\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2"+
		"\u0278\u0279\3\2\2\2\u0279\u027a\5\u008aF\2\u027a\u0089\3\2\2\2\u027b"+
		"\u027d\5\u0092J\2\u027c\u027e\5\u008cG\2\u027d\u027c\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u0283\3\2\2\2\u027f\u0280\5\u009aN\2\u0280\u0281\5\u008c"+
		"G\2\u0281\u0283\3\2\2\2\u0282\u027b\3\2\2\2\u0282\u027f\3\2\2\2\u0283"+
		"\u008b\3\2\2\2\u0284\u0289\5\u0082B\2\u0285\u0286\7\62\2\2\u0286\u0288"+
		"\5\u0082B\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2"+
		"\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d"+
		"\7\5\2\2\u028d\u008d\3\2\2\2\u028e\u0294\5N(\2\u028f\u0290\7X\2\2\u0290"+
		"\u0291\5\u0090I\2\u0291\u0292\7Y\2\2\u0292\u0294\3\2\2\2\u0293\u028e\3"+
		"\2\2\2\u0293\u028f\3\2\2\2\u0294\u008f\3\2\2\2\u0295\u029a\5\u008eH\2"+
		"\u0296\u0297\7\62\2\2\u0297\u0299\5\u008eH\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0091\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7V\2\2\u029e\u02a0\5\u0094K\2\u029f"+
		"\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u02a3\5\u0096"+
		"L\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\7X\2\2\u02a5\u02a6\bJ\1\2\u02a6\u0093\3\2\2\2\u02a7\u02a8\5\u00a8"+
		"U\2\u02a8\u0095\3\2\2\2\u02a9\u02aa\7\6\2\2\u02aa\u02af\5\u0098M\2\u02ab"+
		"\u02ac\7\62\2\2\u02ac\u02ae\5\u0098M\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1"+
		"\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u0097\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b4\7K\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b7\5*\26\2\u02b6\u02b5\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\5\u00a8U\2\u02b9\u0099"+
		"\3\2\2\2\u02ba\u02bc\7J\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd"+
		"\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2"+
		"\2\2\u02c0\u02c2\t\30\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c8\5\u009cO\2\u02c4\u02c5\7\16\2\2\u02c5\u02c6"+
		"\5\64\33\2\u02c6\u02c7\7\17\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c4\3\2\2"+
		"\2\u02c8\u02c9\3\2\2\2\u02c9\u02d4\3\2\2\2\u02ca\u02cb\7\66\2\2\u02cb"+
		"\u02d0\5\u009cO\2\u02cc\u02cd\7\16\2\2\u02cd\u02ce\5\64\33\2\u02ce\u02cf"+
		"\7\17\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d0\u02d1\3\2\2\2"+
		"\u02d1\u02d3\3\2\2\2\u02d2\u02ca\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7"+
		"\u02d9\7J\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dd\3\2"+
		"\2\2\u02da\u02dd\7G\2\2\u02db\u02dd\7H\2\2\u02dc\u02bd\3\2\2\2\u02dc\u02da"+
		"\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u009b\3\2\2\2\u02de\u02e0\t\31\2\2"+
		"\u02df\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u009d\3\2\2\2\u02e3\u02e5\t\32\2\2\u02e4\u02e3\3\2\2\2"+
		"\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\5\u009aN\2\u02e7"+
		"\u009f\3\2\2\2\u02e8\u02e9\5\u00a8U\2\u02e9\u00a1\3\2\2\2\u02ea\u02eb"+
		"\7\3\2\2\u02eb\u02ec\7F\2\2\u02ec\u02fa\7\4\2\2\u02ed\u02f6\7\3\2\2\u02ee"+
		"\u02f3\5\u00a4S\2\u02ef\u02f0\7\62\2\2\u02f0\u02f2\5\u00a4S\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02ee\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\7\4\2\2\u02f9\u02ea\3\2\2\2\u02f9"+
		"\u02ed\3\2\2\2\u02fa\u00a3\3\2\2\2\u02fb\u02fc\5\u009eP\2\u02fc\u02fd"+
		"\5\u00a6T\2\u02fd\u00a5\3\2\2\2\u02fe\u0300\5\u00acW\2\u02ff\u02fe\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u0308\3\2\2\2\u0301\u0302\7\3\2\2\u0302"+
		"\u0303\5\u00a6T\2\u0303\u0304\7\4\2\2\u0304\u0309\3\2\2\2\u0305\u0307"+
		"\5\u00a0Q\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2"+
		"\2\u0308\u0301\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u030c"+
		"\5\u0086D\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u00a7\3\2\2"+
		"\2\u030d\u0312\7W\2\2\u030e\u030f\7\66\2\2\u030f\u0311\7W\2\2\u0310\u030e"+
		"\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0317\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0317\5*\26\2\u0316\u030d\3\2"+
		"\2\2\u0316\u0315\3\2\2\2\u0317\u00a9\3\2\2\2\u0318\u0319\t\33\2\2\u0319"+
		"\u00ab\3\2\2\2\u031a\u031c\5(\25\2\u031b\u031d\79\2\2\u031c\u031b\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u031a\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u00ad\3\2"+
		"\2\2X\u00b4\u00b6\u00c1\u00e4\u00e7\u00eb\u00f4\u0101\u010d\u0110\u0113"+
		"\u0118\u011d\u0127\u0138\u0162\u0176\u0178\u0193\u0199\u01a2\u01a7\u01ac"+
		"\u01b1\u01b6\u01bb\u01c1\u01c7\u01cc\u01d1\u01d6\u01de\u01e4\u01ee\u01f1"+
		"\u01f7\u01fc\u0202\u0206\u0213\u021b\u0232\u0238\u023d\u023f\u0247\u024a"+
		"\u0254\u0259\u0262\u0265\u0269\u026d\u0271\u0274\u0277\u027d\u0282\u0289"+
		"\u0293\u029a\u029f\u02a2\u02af\u02b3\u02b6\u02bd\u02c1\u02c8\u02d0\u02d4"+
		"\u02d8\u02dc\u02e1\u02e4\u02f3\u02f6\u02f9\u02ff\u0306\u0308\u030b\u0312"+
		"\u0316\u031c\u0320";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}