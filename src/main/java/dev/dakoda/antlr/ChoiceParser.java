// Generated from dev.dakoda.antlr/Choice.g4 by ANTLR 4.7
package dev.dakoda.antlr;

import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChoiceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WS=12, TRUE=13, FALSE=14, ROOT_KEY=15, HERE_KEY=16, 
		BOOLEAN_OPERATOR=17, THEN=18, IF_PREFIX=19, SWITCH_PREFIX=20, SELECTOR_SUFFIX=21, 
		ELSE=22, ROOT_START=23, BRANCH_START=24, VAR_START=25, NEST_START=26, 
		NEST_END=27, INTEGER=28, TEXT_CHARACTER_RESTRICTED=29, TEXT_CHARACTER=30, 
		STRING=31, CHAR=32, FLOAT=33, WHITESPACE=34, NEWLINE=35, STATEMENT_END=36, 
		EMPTY_STRING=37, METHOD=38;
	public static final int
		RULE_varFloat = 0, RULE_varInteger = 1, RULE_varNumber = 2, RULE_varBoolean = 3, 
		RULE_varString = 4, RULE_branchName = 5, RULE_switchCase = 6, RULE_branchDisplay = 7, 
		RULE_arrayOfValues = 8, RULE_commaSeparatedVariables = 9, RULE_simpleVariable = 10, 
		RULE_variable = 11, RULE_method = 12, RULE_methodInnerVariable = 13, RULE_methodWithoutParams = 14, 
		RULE_methodWithParams = 15, RULE_methods = 16, RULE_booleanExpression = 17, 
		RULE_simpleBooleanExpression = 18, RULE_reversedBoolean = 19, RULE_variableKeywords = 20, 
		RULE_variableKeywordInnerVariable = 21, RULE_content = 22, RULE_elseContent = 23, 
		RULE_rootStart = 24, RULE_nestEnd = 25, RULE_root = 26, RULE_branchVariableOrMethod = 27, 
		RULE_branch = 28, RULE_blankBranch = 29, RULE_simpleBranch = 30, RULE_nestingBranch = 31, 
		RULE_switchBranch = 32, RULE_switchBranchNormal = 33, RULE_switchBlankBranch = 34, 
		RULE_ifBranchTernary = 35, RULE_branchVar = 36, RULE_branchSimpleVar = 37, 
		RULE_branchNestingVar = 38, RULE_simpleNest = 39, RULE_varNest = 40, RULE_branchNestingVarContent = 41, 
		RULE_key = 42, RULE_value = 43, RULE_keyValuePair = 44, RULE_selector = 45, 
		RULE_selectorSwitch = 46, RULE_selectorSwitchContent = 47, RULE_selectorIf = 48, 
		RULE_selectorIfNormal = 49, RULE_selectorIfElse = 50;
	public static final String[] ruleNames = {
		"varFloat", "varInteger", "varNumber", "varBoolean", "varString", "branchName", 
		"switchCase", "branchDisplay", "arrayOfValues", "commaSeparatedVariables", 
		"simpleVariable", "variable", "method", "methodInnerVariable", "methodWithoutParams", 
		"methodWithParams", "methods", "booleanExpression", "simpleBooleanExpression", 
		"reversedBoolean", "variableKeywords", "variableKeywordInnerVariable", 
		"content", "elseContent", "rootStart", "nestEnd", "root", "branchVariableOrMethod", 
		"branch", "blankBranch", "simpleBranch", "nestingBranch", "switchBranch", 
		"switchBranchNormal", "switchBlankBranch", "ifBranchTernary", "branchVar", 
		"branchSimpleVar", "branchNestingVar", "simpleNest", "varNest", "branchNestingVarContent", 
		"key", "value", "keyValuePair", "selector", "selectorSwitch", "selectorSwitchContent", 
		"selectorIf", "selectorIfNormal", "selectorIfElse"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'['", "']'", "','", "'.'", "'('", "')'", "'!('", "'~'", 
		"'}'", "':'", null, "'true'", "'false'", "'root'", "'here'", null, "'-then->'", 
		"'-if('", "'-switch('", "')->'", "'-else->'", "'=>'", "'->'", "'~>'", 
		"'{'", "'};'", null, null, null, null, null, null, null, null, "';'", 
		"'\"\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"WS", "TRUE", "FALSE", "ROOT_KEY", "HERE_KEY", "BOOLEAN_OPERATOR", "THEN", 
		"IF_PREFIX", "SWITCH_PREFIX", "SELECTOR_SUFFIX", "ELSE", "ROOT_START", 
		"BRANCH_START", "VAR_START", "NEST_START", "NEST_END", "INTEGER", "TEXT_CHARACTER_RESTRICTED", 
		"TEXT_CHARACTER", "STRING", "CHAR", "FLOAT", "WHITESPACE", "NEWLINE", 
		"STATEMENT_END", "EMPTY_STRING", "METHOD"
	};
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
	public String getGrammarFileName() { return "Choice.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChoiceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarFloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ChoiceParser.FLOAT, 0); }
		public VarFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarFloat(this);
		}
	}

	public final VarFloatContext varFloat() throws RecognitionException {
		VarFloatContext _localctx = new VarFloatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varFloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FLOAT);
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

	public static class VarIntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ChoiceParser.INTEGER, 0); }
		public VarIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarInteger(this);
		}
	}

	public final VarIntegerContext varInteger() throws RecognitionException {
		VarIntegerContext _localctx = new VarIntegerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(INTEGER);
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

	public static class VarNumberContext extends ParserRuleContext {
		public VarIntegerContext varInteger() {
			return getRuleContext(VarIntegerContext.class,0);
		}
		public VarFloatContext varFloat() {
			return getRuleContext(VarFloatContext.class,0);
		}
		public VarNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarNumber(this);
		}
	}

	public final VarNumberContext varNumber() throws RecognitionException {
		VarNumberContext _localctx = new VarNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(106);
				match(T__0);
				}
			}

			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(109);
				varInteger();
				}
				break;
			case FLOAT:
				{
				setState(110);
				varFloat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarBooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ChoiceParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ChoiceParser.FALSE, 0); }
		public VarBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarBoolean(this);
		}
	}

	public final VarBooleanContext varBoolean() throws RecognitionException {
		VarBooleanContext _localctx = new VarBooleanContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class VarStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChoiceParser.STRING, 0); }
		public VarStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarString(this);
		}
	}

	public final VarStringContext varString() throws RecognitionException {
		VarStringContext _localctx = new VarStringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(STRING);
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

	public static class BranchNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChoiceParser.STRING, 0); }
		public BranchNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchName(this);
		}
	}

	public final BranchNameContext branchName() throws RecognitionException {
		BranchNameContext _localctx = new BranchNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branchName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(STRING);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChoiceParser.STRING, 0); }
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(STRING);
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

	public static class BranchDisplayContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ChoiceParser.STRING, 0); }
		public BranchDisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchDisplay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchDisplay(this);
		}
	}

	public final BranchDisplayContext branchDisplay() throws RecognitionException {
		BranchDisplayContext _localctx = new BranchDisplayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branchDisplay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(STRING);
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

	public static class ArrayOfValuesContext extends ParserRuleContext {
		public CommaSeparatedVariablesContext commaSeparatedVariables() {
			return getRuleContext(CommaSeparatedVariablesContext.class,0);
		}
		public ArrayOfValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOfValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterArrayOfValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitArrayOfValues(this);
		}
	}

	public final ArrayOfValuesContext arrayOfValues() throws RecognitionException {
		ArrayOfValuesContext _localctx = new ArrayOfValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayOfValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(124);
			commaSeparatedVariables();
			setState(125);
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

	public static class CommaSeparatedVariablesContext extends ParserRuleContext {
		public List<SimpleVariableContext> simpleVariable() {
			return getRuleContexts(SimpleVariableContext.class);
		}
		public SimpleVariableContext simpleVariable(int i) {
			return getRuleContext(SimpleVariableContext.class,i);
		}
		public CommaSeparatedVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaSeparatedVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterCommaSeparatedVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitCommaSeparatedVariables(this);
		}
	}

	public final CommaSeparatedVariablesContext commaSeparatedVariables() throws RecognitionException {
		CommaSeparatedVariablesContext _localctx = new CommaSeparatedVariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commaSeparatedVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			simpleVariable();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(128);
				match(T__3);
				setState(129);
				simpleVariable();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SimpleVariableContext extends ParserRuleContext {
		public VarBooleanContext varBoolean() {
			return getRuleContext(VarBooleanContext.class,0);
		}
		public VarStringContext varString() {
			return getRuleContext(VarStringContext.class,0);
		}
		public VarNumberContext varNumber() {
			return getRuleContext(VarNumberContext.class,0);
		}
		public VariableKeywordsContext variableKeywords() {
			return getRuleContext(VariableKeywordsContext.class,0);
		}
		public SimpleVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSimpleVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSimpleVariable(this);
		}
	}

	public final SimpleVariableContext simpleVariable() throws RecognitionException {
		SimpleVariableContext _localctx = new SimpleVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(135);
				varBoolean();
				}
				break;
			case 2:
				{
				setState(136);
				varString();
				}
				break;
			case 3:
				{
				setState(137);
				varNumber();
				}
				break;
			case 4:
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(138);
					match(T__0);
					}
				}

				setState(141);
				variableKeywords();
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

	public static class VariableContext extends ParserRuleContext {
		public SimpleVariableContext simpleVariable() {
			return getRuleContext(SimpleVariableContext.class,0);
		}
		public ArrayOfValuesContext arrayOfValues() {
			return getRuleContext(ArrayOfValuesContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TRUE:
			case FALSE:
			case ROOT_KEY:
			case HERE_KEY:
			case INTEGER:
			case STRING:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				simpleVariable();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				arrayOfValues();
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

	public static class MethodContext extends ParserRuleContext {
		public MethodWithoutParamsContext methodWithoutParams() {
			return getRuleContext(MethodWithoutParamsContext.class,0);
		}
		public MethodWithParamsContext methodWithParams() {
			return getRuleContext(MethodWithParamsContext.class,0);
		}
		public List<MethodInnerVariableContext> methodInnerVariable() {
			return getRuleContexts(MethodInnerVariableContext.class);
		}
		public MethodInnerVariableContext methodInnerVariable(int i) {
			return getRuleContext(MethodInnerVariableContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(148);
				match(T__0);
				}
			}

			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(151);
				methodWithoutParams();
				}
				break;
			case 2:
				{
				setState(152);
				methodWithParams();
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(155);
					methodInnerVariable();
					}
					}
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MethodInnerVariableContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_CHARACTER_RESTRICTED() { return getTokens(ChoiceParser.TEXT_CHARACTER_RESTRICTED); }
		public TerminalNode TEXT_CHARACTER_RESTRICTED(int i) {
			return getToken(ChoiceParser.TEXT_CHARACTER_RESTRICTED, i);
		}
		public MethodInnerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInnerVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterMethodInnerVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitMethodInnerVariable(this);
		}
	}

	public final MethodInnerVariableContext methodInnerVariable() throws RecognitionException {
		MethodInnerVariableContext _localctx = new MethodInnerVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodInnerVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			match(T__4);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				match(TEXT_CHARACTER_RESTRICTED);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT_CHARACTER_RESTRICTED );
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

	public static class MethodWithoutParamsContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(ChoiceParser.METHOD, 0); }
		public MethodWithoutParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodWithoutParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterMethodWithoutParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitMethodWithoutParams(this);
		}
	}

	public final MethodWithoutParamsContext methodWithoutParams() throws RecognitionException {
		MethodWithoutParamsContext _localctx = new MethodWithoutParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodWithoutParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(METHOD);
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

	public static class MethodWithParamsContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(ChoiceParser.METHOD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CommaSeparatedVariablesContext commaSeparatedVariables() {
			return getRuleContext(CommaSeparatedVariablesContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodWithParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodWithParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterMethodWithParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitMethodWithParams(this);
		}
	}

	public final MethodWithParamsContext methodWithParams() throws RecognitionException {
		MethodWithParamsContext _localctx = new MethodWithParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodWithParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(METHOD);
			setState(170);
			match(T__5);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(171);
				variable();
				}
				break;
			case 2:
				{
				setState(172);
				commaSeparatedVariables();
				}
				break;
			case 3:
				{
				setState(173);
				method();
				}
				break;
			}
			setState(176);
			match(T__6);
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

	public static class MethodsContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitMethods(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methods);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			method();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(179);
					match(T__3);
					setState(180);
					method();
					}
					}
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public VarBooleanContext varBoolean() {
			return getRuleContext(VarBooleanContext.class,0);
		}
		public SimpleBooleanExpressionContext simpleBooleanExpression() {
			return getRuleContext(SimpleBooleanExpressionContext.class,0);
		}
		public ReversedBooleanContext reversedBoolean() {
			return getRuleContext(ReversedBooleanContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpression);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				varBoolean();
				}
				break;
			case T__0:
			case INTEGER:
			case FLOAT:
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				simpleBooleanExpression();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				reversedBoolean();
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

	public static class SimpleBooleanExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_OPERATOR() { return getToken(ChoiceParser.BOOLEAN_OPERATOR, 0); }
		public List<VarNumberContext> varNumber() {
			return getRuleContexts(VarNumberContext.class);
		}
		public VarNumberContext varNumber(int i) {
			return getRuleContext(VarNumberContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SimpleBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSimpleBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSimpleBooleanExpression(this);
		}
	}

	public final SimpleBooleanExpressionContext simpleBooleanExpression() throws RecognitionException {
		SimpleBooleanExpressionContext _localctx = new SimpleBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(191);
				varNumber();
				}
				break;
			case 2:
				{
				setState(192);
				method();
				}
				break;
			}
			setState(195);
			match(BOOLEAN_OPERATOR);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(196);
				varNumber();
				}
				break;
			case 2:
				{
				setState(197);
				method();
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

	public static class ReversedBooleanContext extends ParserRuleContext {
		public SimpleBooleanExpressionContext simpleBooleanExpression() {
			return getRuleContext(SimpleBooleanExpressionContext.class,0);
		}
		public ReversedBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reversedBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterReversedBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitReversedBoolean(this);
		}
	}

	public final ReversedBooleanContext reversedBoolean() throws RecognitionException {
		ReversedBooleanContext _localctx = new ReversedBooleanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_reversedBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__7);
			setState(201);
			simpleBooleanExpression();
			setState(202);
			match(T__6);
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

	public static class VariableKeywordsContext extends ParserRuleContext {
		public TerminalNode HERE_KEY() { return getToken(ChoiceParser.HERE_KEY, 0); }
		public TerminalNode ROOT_KEY() { return getToken(ChoiceParser.ROOT_KEY, 0); }
		public List<VariableKeywordInnerVariableContext> variableKeywordInnerVariable() {
			return getRuleContexts(VariableKeywordInnerVariableContext.class);
		}
		public VariableKeywordInnerVariableContext variableKeywordInnerVariable(int i) {
			return getRuleContext(VariableKeywordInnerVariableContext.class,i);
		}
		public VariableKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVariableKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVariableKeywords(this);
		}
	}

	public final VariableKeywordsContext variableKeywords() throws RecognitionException {
		VariableKeywordsContext _localctx = new VariableKeywordsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableKeywords);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==ROOT_KEY || _la==HERE_KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(205);
					variableKeywordInnerVariable();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class VariableKeywordInnerVariableContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_CHARACTER_RESTRICTED() { return getTokens(ChoiceParser.TEXT_CHARACTER_RESTRICTED); }
		public TerminalNode TEXT_CHARACTER_RESTRICTED(int i) {
			return getToken(ChoiceParser.TEXT_CHARACTER_RESTRICTED, i);
		}
		public VariableKeywordInnerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableKeywordInnerVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVariableKeywordInnerVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVariableKeywordInnerVariable(this);
		}
	}

	public final VariableKeywordInnerVariableContext variableKeywordInnerVariable() throws RecognitionException {
		VariableKeywordInnerVariableContext _localctx = new VariableKeywordInnerVariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableKeywordInnerVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			match(T__4);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				match(TEXT_CHARACTER_RESTRICTED);
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT_CHARACTER_RESTRICTED );
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

	public static class ContentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ChoiceParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ChoiceParser.NEWLINE, i);
		}
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public List<BranchVarContext> branchVar() {
			return getRuleContexts(BranchVarContext.class);
		}
		public BranchVarContext branchVar(int i) {
			return getRuleContext(BranchVarContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_PREFIX) | (1L << SWITCH_PREFIX) | (1L << BRANCH_START) | (1L << VAR_START) | (1L << NEWLINE))) != 0)) {
				{
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(217);
					match(NEWLINE);
					}
					break;
				case BRANCH_START:
					{
					setState(218);
					branch();
					}
					break;
				case VAR_START:
					{
					setState(219);
					branchVar();
					}
					break;
				case IF_PREFIX:
				case SWITCH_PREFIX:
					{
					setState(220);
					selector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(225);
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

	public static class ElseContentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ChoiceParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ChoiceParser.NEWLINE, i);
		}
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public List<BranchVarContext> branchVar() {
			return getRuleContexts(BranchVarContext.class);
		}
		public BranchVarContext branchVar(int i) {
			return getRuleContext(BranchVarContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public ElseContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterElseContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitElseContent(this);
		}
	}

	public final ElseContentContext elseContent() throws RecognitionException {
		ElseContentContext _localctx = new ElseContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_PREFIX) | (1L << SWITCH_PREFIX) | (1L << BRANCH_START) | (1L << VAR_START) | (1L << NEWLINE))) != 0)) {
				{
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(226);
					match(NEWLINE);
					}
					break;
				case BRANCH_START:
					{
					setState(227);
					branch();
					}
					break;
				case VAR_START:
					{
					setState(228);
					branchVar();
					}
					break;
				case IF_PREFIX:
				case SWITCH_PREFIX:
					{
					setState(229);
					selector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234);
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

	public static class RootStartContext extends ParserRuleContext {
		public TerminalNode ROOT_START() { return getToken(ChoiceParser.ROOT_START, 0); }
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RootStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterRootStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitRootStart(this);
		}
	}

	public final RootStartContext rootStart() throws RecognitionException {
		RootStartContext _localctx = new RootStartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rootStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ROOT_START);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TRUE) | (1L << FALSE) | (1L << ROOT_KEY) | (1L << HERE_KEY) | (1L << INTEGER) | (1L << STRING) | (1L << FLOAT))) != 0)) {
				{
				setState(236);
				variable();
				}
			}

			setState(239);
			match(NEST_START);
			setState(240);
			match(NEWLINE);
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

	public static class NestEndContext extends ParserRuleContext {
		public TerminalNode NEST_END() { return getToken(ChoiceParser.NEST_END, 0); }
		public NestEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterNestEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitNestEnd(this);
		}
	}

	public final NestEndContext nestEnd() throws RecognitionException {
		NestEndContext _localctx = new NestEndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nestEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(NEST_END);
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

	public static class RootContext extends ParserRuleContext {
		public RootStartContext rootStart() {
			return getRuleContext(RootStartContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			rootStart();
			setState(245);
			content();
			setState(246);
			nestEnd();
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

	public static class BranchVariableOrMethodContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ChoiceParser.THEN, 0); }
		public BranchVariableOrMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchVariableOrMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchVariableOrMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchVariableOrMethod(this);
		}
	}

	public final BranchVariableOrMethodContext branchVariableOrMethod() throws RecognitionException {
		BranchVariableOrMethodContext _localctx = new BranchVariableOrMethodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_branchVariableOrMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(248);
				variable();
				}
				break;
			case 2:
				{
				setState(249);
				methods();
				}
				break;
			case 3:
				{
				setState(250);
				variable();
				setState(251);
				match(THEN);
				setState(252);
				methods();
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

	public static class BranchContext extends ParserRuleContext {
		public SimpleBranchContext simpleBranch() {
			return getRuleContext(SimpleBranchContext.class,0);
		}
		public BlankBranchContext blankBranch() {
			return getRuleContext(BlankBranchContext.class,0);
		}
		public NestingBranchContext nestingBranch() {
			return getRuleContext(NestingBranchContext.class,0);
		}
		public IfBranchTernaryContext ifBranchTernary() {
			return getRuleContext(IfBranchTernaryContext.class,0);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_branch);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				simpleBranch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				blankBranch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				nestingBranch();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				ifBranchTernary();
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

	public static class BlankBranchContext extends ParserRuleContext {
		public TerminalNode BRANCH_START() { return getToken(ChoiceParser.BRANCH_START, 0); }
		public BranchNameContext branchName() {
			return getRuleContext(BranchNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public BranchDisplayContext branchDisplay() {
			return getRuleContext(BranchDisplayContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(ChoiceParser.STATEMENT_END, 0); }
		public BlankBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBlankBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBlankBranch(this);
		}
	}

	public final BlankBranchContext blankBranch() throws RecognitionException {
		BlankBranchContext _localctx = new BlankBranchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blankBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(BRANCH_START);
			setState(263);
			branchName();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(264);
				match(T__3);
				setState(265);
				branchDisplay();
				}
			}

			setState(268);
			match(T__8);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(269);
				match(STATEMENT_END);
				}
			}

			setState(272);
			match(NEWLINE);
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

	public static class SimpleBranchContext extends ParserRuleContext {
		public TerminalNode BRANCH_START() { return getToken(ChoiceParser.BRANCH_START, 0); }
		public BranchNameContext branchName() {
			return getRuleContext(BranchNameContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(ChoiceParser.STATEMENT_END, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public BranchDisplayContext branchDisplay() {
			return getRuleContext(BranchDisplayContext.class,0);
		}
		public BranchVariableOrMethodContext branchVariableOrMethod() {
			return getRuleContext(BranchVariableOrMethodContext.class,0);
		}
		public SimpleBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSimpleBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSimpleBranch(this);
		}
	}

	public final SimpleBranchContext simpleBranch() throws RecognitionException {
		SimpleBranchContext _localctx = new SimpleBranchContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(BRANCH_START);
			setState(275);
			branchName();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(276);
				match(T__3);
				setState(277);
				branchDisplay();
				}
			}

			setState(280);
			match(T__8);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TRUE) | (1L << FALSE) | (1L << ROOT_KEY) | (1L << HERE_KEY) | (1L << INTEGER) | (1L << STRING) | (1L << FLOAT) | (1L << METHOD))) != 0)) {
				{
				setState(281);
				branchVariableOrMethod();
				}
			}

			setState(284);
			match(STATEMENT_END);
			setState(285);
			match(NEWLINE);
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

	public static class NestingBranchContext extends ParserRuleContext {
		public TerminalNode BRANCH_START() { return getToken(ChoiceParser.BRANCH_START, 0); }
		public BranchNameContext branchName() {
			return getRuleContext(BranchNameContext.class,0);
		}
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public BranchDisplayContext branchDisplay() {
			return getRuleContext(BranchDisplayContext.class,0);
		}
		public BranchVariableOrMethodContext branchVariableOrMethod() {
			return getRuleContext(BranchVariableOrMethodContext.class,0);
		}
		public NestingBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestingBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterNestingBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitNestingBranch(this);
		}
	}

	public final NestingBranchContext nestingBranch() throws RecognitionException {
		NestingBranchContext _localctx = new NestingBranchContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nestingBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BRANCH_START);
			setState(288);
			branchName();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(289);
				match(T__3);
				setState(290);
				branchDisplay();
				}
			}

			setState(293);
			match(T__8);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TRUE) | (1L << FALSE) | (1L << ROOT_KEY) | (1L << HERE_KEY) | (1L << INTEGER) | (1L << STRING) | (1L << FLOAT) | (1L << METHOD))) != 0)) {
				{
				setState(294);
				branchVariableOrMethod();
				}
			}

			setState(297);
			match(NEST_START);
			setState(298);
			match(NEWLINE);
			setState(299);
			content();
			setState(300);
			nestEnd();
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

	public static class SwitchBranchContext extends ParserRuleContext {
		public SwitchBranchNormalContext switchBranchNormal() {
			return getRuleContext(SwitchBranchNormalContext.class,0);
		}
		public SwitchBlankBranchContext switchBlankBranch() {
			return getRuleContext(SwitchBlankBranchContext.class,0);
		}
		public SwitchBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSwitchBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSwitchBranch(this);
		}
	}

	public final SwitchBranchContext switchBranch() throws RecognitionException {
		SwitchBranchContext _localctx = new SwitchBranchContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchBranch);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				switchBranchNormal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				switchBlankBranch();
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

	public static class SwitchBranchNormalContext extends ParserRuleContext {
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public SwitchBranchNormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBranchNormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSwitchBranchNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSwitchBranchNormal(this);
		}
	}

	public final SwitchBranchNormalContext switchBranchNormal() throws RecognitionException {
		SwitchBranchNormalContext _localctx = new SwitchBranchNormalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switchBranchNormal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			switchCase();
			setState(307);
			branch();
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

	public static class SwitchBlankBranchContext extends ParserRuleContext {
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public TerminalNode BRANCH_START() { return getToken(ChoiceParser.BRANCH_START, 0); }
		public SwitchBlankBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlankBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSwitchBlankBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSwitchBlankBranch(this);
		}
	}

	public final SwitchBlankBranchContext switchBlankBranch() throws RecognitionException {
		SwitchBlankBranchContext _localctx = new SwitchBlankBranchContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchBlankBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			switchCase();
			setState(310);
			match(BRANCH_START);
			setState(311);
			match(T__8);
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

	public static class IfBranchTernaryContext extends ParserRuleContext {
		public TerminalNode BRANCH_START() { return getToken(ChoiceParser.BRANCH_START, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public IfBranchTernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBranchTernary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterIfBranchTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitIfBranchTernary(this);
		}
	}

	public final IfBranchTernaryContext ifBranchTernary() throws RecognitionException {
		IfBranchTernaryContext _localctx = new IfBranchTernaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifBranchTernary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(BRANCH_START);
			setState(314);
			booleanExpression();
			setState(315);
			branch();
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

	public static class BranchVarContext extends ParserRuleContext {
		public BranchSimpleVarContext branchSimpleVar() {
			return getRuleContext(BranchSimpleVarContext.class,0);
		}
		public BranchNestingVarContext branchNestingVar() {
			return getRuleContext(BranchNestingVarContext.class,0);
		}
		public BranchVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchVar(this);
		}
	}

	public final BranchVarContext branchVar() throws RecognitionException {
		BranchVarContext _localctx = new BranchVarContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_branchVar);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				branchSimpleVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				branchNestingVar();
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

	public static class BranchSimpleVarContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(ChoiceParser.VAR_START, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(ChoiceParser.STATEMENT_END, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public BranchSimpleVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchSimpleVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchSimpleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchSimpleVar(this);
		}
	}

	public final BranchSimpleVarContext branchSimpleVar() throws RecognitionException {
		BranchSimpleVarContext _localctx = new BranchSimpleVarContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_branchSimpleVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(VAR_START);
			setState(322);
			variable();
			setState(323);
			match(STATEMENT_END);
			setState(324);
			match(NEWLINE);
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

	public static class BranchNestingVarContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(ChoiceParser.VAR_START, 0); }
		public SimpleNestContext simpleNest() {
			return getRuleContext(SimpleNestContext.class,0);
		}
		public BranchNestingVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchNestingVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchNestingVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchNestingVar(this);
		}
	}

	public final BranchNestingVarContext branchNestingVar() throws RecognitionException {
		BranchNestingVarContext _localctx = new BranchNestingVarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_branchNestingVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(VAR_START);
			setState(327);
			simpleNest();
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

	public static class SimpleNestContext extends ParserRuleContext {
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public BranchNestingVarContentContext branchNestingVarContent() {
			return getRuleContext(BranchNestingVarContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public SimpleNestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSimpleNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSimpleNest(this);
		}
	}

	public final SimpleNestContext simpleNest() throws RecognitionException {
		SimpleNestContext _localctx = new SimpleNestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simpleNest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(NEST_START);
			setState(330);
			match(NEWLINE);
			setState(331);
			branchNestingVarContent();
			setState(332);
			nestEnd();
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

	public static class VarNestContext extends ParserRuleContext {
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public BranchNestingVarContentContext branchNestingVarContent() {
			return getRuleContext(BranchNestingVarContentContext.class,0);
		}
		public VarNestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterVarNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitVarNest(this);
		}
	}

	public final VarNestContext varNest() throws RecognitionException {
		VarNestContext _localctx = new VarNestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_varNest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(NEST_START);
			setState(335);
			match(NEWLINE);
			setState(336);
			branchNestingVarContent();
			setState(337);
			match(T__9);
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

	public static class BranchNestingVarContentContext extends ParserRuleContext {
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ChoiceParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ChoiceParser.NEWLINE, i);
		}
		public BranchNestingVarContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchNestingVarContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterBranchNestingVarContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitBranchNestingVarContent(this);
		}
	}

	public final BranchNestingVarContentContext branchNestingVarContent() throws RecognitionException {
		BranchNestingVarContentContext _localctx = new BranchNestingVarContentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_branchNestingVarContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT_CHARACTER_RESTRICTED || _la==NEWLINE) {
				{
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT_CHARACTER_RESTRICTED:
					{
					setState(339);
					keyValuePair();
					}
					break;
				case NEWLINE:
					{
					setState(340);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(345);
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

	public static class KeyContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_CHARACTER_RESTRICTED() { return getTokens(ChoiceParser.TEXT_CHARACTER_RESTRICTED); }
		public TerminalNode TEXT_CHARACTER_RESTRICTED(int i) {
			return getToken(ChoiceParser.TEXT_CHARACTER_RESTRICTED, i);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				match(TEXT_CHARACTER_RESTRICTED);
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT_CHARACTER_RESTRICTED );
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

	public static class ValueContext extends ParserRuleContext {
		public SimpleVariableContext simpleVariable() {
			return getRuleContext(SimpleVariableContext.class,0);
		}
		public VarNestContext varNest() {
			return getRuleContext(VarNestContext.class,0);
		}
		public ArrayOfValuesContext arrayOfValues() {
			return getRuleContext(ArrayOfValuesContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TRUE:
			case FALSE:
			case ROOT_KEY:
			case HERE_KEY:
			case INTEGER:
			case STRING:
			case FLOAT:
				{
				setState(351);
				simpleVariable();
				}
				break;
			case NEST_START:
				{
				setState(352);
				varNest();
				}
				break;
			case T__1:
				{
				setState(353);
				arrayOfValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ChoiceParser.NEWLINE, 0); }
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			key();
			setState(357);
			match(T__10);
			setState(358);
			value();
			setState(359);
			match(T__3);
			setState(360);
			match(NEWLINE);
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

	public static class SelectorContext extends ParserRuleContext {
		public SelectorIfContext selectorIf() {
			return getRuleContext(SelectorIfContext.class,0);
		}
		public SelectorSwitchContext selectorSwitch() {
			return getRuleContext(SelectorSwitchContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selector);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				selectorIf();
				}
				break;
			case SWITCH_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				selectorSwitch();
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

	public static class SelectorSwitchContext extends ParserRuleContext {
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public SelectorSwitchContentContext selectorSwitchContent() {
			return getRuleContext(SelectorSwitchContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public VariableKeywordsContext variableKeywords() {
			return getRuleContext(VariableKeywordsContext.class,0);
		}
		public SelectorSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelectorSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelectorSwitch(this);
		}
	}

	public final SelectorSwitchContext selectorSwitch() throws RecognitionException {
		SelectorSwitchContext _localctx = new SelectorSwitchContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectorSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(SWITCH_PREFIX);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(367);
				variable();
				}
				break;
			case 2:
				{
				setState(368);
				method();
				}
				break;
			case 3:
				{
				setState(369);
				variableKeywords();
				}
				break;
			}
			setState(372);
			match(SELECTOR_SUFFIX);
			setState(373);
			match(NEST_START);
			setState(374);
			selectorSwitchContent();
			setState(375);
			nestEnd();
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

	public static class SelectorSwitchContentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ChoiceParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ChoiceParser.NEWLINE, i);
		}
		public List<SwitchBranchContext> switchBranch() {
			return getRuleContexts(SwitchBranchContext.class);
		}
		public SwitchBranchContext switchBranch(int i) {
			return getRuleContext(SwitchBranchContext.class,i);
		}
		public SelectorSwitchContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorSwitchContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelectorSwitchContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelectorSwitchContent(this);
		}
	}

	public final SelectorSwitchContentContext selectorSwitchContent() throws RecognitionException {
		SelectorSwitchContentContext _localctx = new SelectorSwitchContentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectorSwitchContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==NEWLINE) {
				{
				setState(379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(377);
					match(NEWLINE);
					}
					break;
				case STRING:
					{
					setState(378);
					switchBranch();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(383);
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

	public static class SelectorIfContext extends ParserRuleContext {
		public SelectorIfNormalContext selectorIfNormal() {
			return getRuleContext(SelectorIfNormalContext.class,0);
		}
		public SelectorIfElseContext selectorIfElse() {
			return getRuleContext(SelectorIfElseContext.class,0);
		}
		public SelectorIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelectorIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelectorIf(this);
		}
	}

	public final SelectorIfContext selectorIf() throws RecognitionException {
		SelectorIfContext _localctx = new SelectorIfContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectorIf);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				selectorIfNormal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				selectorIfElse();
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

	public static class SelectorIfNormalContext extends ParserRuleContext {
		public TerminalNode NEST_START() { return getToken(ChoiceParser.NEST_START, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public VariableKeywordsContext variableKeywords() {
			return getRuleContext(VariableKeywordsContext.class,0);
		}
		public SelectorIfNormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorIfNormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelectorIfNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelectorIfNormal(this);
		}
	}

	public final SelectorIfNormalContext selectorIfNormal() throws RecognitionException {
		SelectorIfNormalContext _localctx = new SelectorIfNormalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectorIfNormal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(IF_PREFIX);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case TRUE:
			case FALSE:
			case INTEGER:
			case FLOAT:
			case METHOD:
				{
				setState(389);
				booleanExpression();
				}
				break;
			case ROOT_KEY:
			case HERE_KEY:
				{
				setState(390);
				variableKeywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(393);
			match(SELECTOR_SUFFIX);
			setState(394);
			match(NEST_START);
			setState(395);
			content();
			setState(396);
			nestEnd();
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

	public static class SelectorIfElseContext extends ParserRuleContext {
		public List<TerminalNode> NEST_START() { return getTokens(ChoiceParser.NEST_START); }
		public TerminalNode NEST_START(int i) {
			return getToken(ChoiceParser.NEST_START, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ChoiceParser.ELSE, 0); }
		public ElseContentContext elseContent() {
			return getRuleContext(ElseContentContext.class,0);
		}
		public NestEndContext nestEnd() {
			return getRuleContext(NestEndContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public VariableKeywordsContext variableKeywords() {
			return getRuleContext(VariableKeywordsContext.class,0);
		}
		public SelectorIfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorIfElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).enterSelectorIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChoiceListener ) ((ChoiceListener)listener).exitSelectorIfElse(this);
		}
	}

	public final SelectorIfElseContext selectorIfElse() throws RecognitionException {
		SelectorIfElseContext _localctx = new SelectorIfElseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectorIfElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(IF_PREFIX);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case TRUE:
			case FALSE:
			case INTEGER:
			case FLOAT:
			case METHOD:
				{
				setState(399);
				booleanExpression();
				}
				break;
			case ROOT_KEY:
			case HERE_KEY:
				{
				setState(400);
				variableKeywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
			match(SELECTOR_SUFFIX);
			setState(404);
			match(NEST_START);
			setState(405);
			content();
			setState(406);
			match(T__9);
			setState(407);
			match(ELSE);
			setState(408);
			match(NEST_START);
			setState(409);
			elseContent();
			setState(410);
			nestEnd();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\3\3\3\3\4\5\4n\n\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0085\n\13\f"+
		"\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\5\f\u008e\n\f\3\f\5\f\u0091\n\f"+
		"\3\r\3\r\5\r\u0095\n\r\3\16\5\16\u0098\n\16\3\16\3\16\5\16\u009c\n\16"+
		"\3\16\7\16\u009f\n\16\f\16\16\16\u00a2\13\16\3\17\3\17\6\17\u00a6\n\17"+
		"\r\17\16\17\u00a7\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22\u00bb\13\22\3\23\3"+
		"\23\3\23\5\23\u00c0\n\23\3\24\3\24\5\24\u00c4\n\24\3\24\3\24\3\24\5\24"+
		"\u00c9\n\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4"+
		"\13\26\3\27\3\27\6\27\u00d8\n\27\r\27\16\27\u00d9\3\30\3\30\3\30\3\30"+
		"\7\30\u00e0\n\30\f\30\16\30\u00e3\13\30\3\31\3\31\3\31\3\31\7\31\u00e9"+
		"\n\31\f\31\16\31\u00ec\13\31\3\32\3\32\5\32\u00f0\n\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0101"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u0107\n\36\3\37\3\37\3\37\3\37\5\37\u010d"+
		"\n\37\3\37\3\37\5\37\u0111\n\37\3\37\3\37\3 \3 \3 \3 \5 \u0119\n \3 \3"+
		" \5 \u011d\n \3 \3 \3 \3!\3!\3!\3!\5!\u0126\n!\3!\3!\5!\u012a\n!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\5\"\u0133\n\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\5&\u0142\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\7+\u0158\n+\f+\16+\u015b\13+\3,\6,\u015e\n,\r,\16,\u015f\3-"+
		"\3-\3-\5-\u0165\n-\3.\3.\3.\3.\3.\3.\3/\3/\5/\u016f\n/\3\60\3\60\3\60"+
		"\3\60\5\60\u0175\n\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u017e\n"+
		"\61\f\61\16\61\u0181\13\61\3\62\3\62\5\62\u0185\n\62\3\63\3\63\3\63\5"+
		"\63\u018a\n\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u0194\n\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\u00a0\u00b9\u00d2"+
		"\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdf\2\4\3\2\17\20\3\2\21\22\2\u01a3\2h\3\2\2\2\4j\3"+
		"\2\2\2\6m\3\2\2\2\bs\3\2\2\2\nu\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20{\3\2"+
		"\2\2\22}\3\2\2\2\24\u0081\3\2\2\2\26\u0090\3\2\2\2\30\u0094\3\2\2\2\32"+
		"\u0097\3\2\2\2\34\u00a3\3\2\2\2\36\u00a9\3\2\2\2 \u00ab\3\2\2\2\"\u00b4"+
		"\3\2\2\2$\u00bf\3\2\2\2&\u00c3\3\2\2\2(\u00ca\3\2\2\2*\u00ce\3\2\2\2,"+
		"\u00d5\3\2\2\2.\u00e1\3\2\2\2\60\u00ea\3\2\2\2\62\u00ed\3\2\2\2\64\u00f4"+
		"\3\2\2\2\66\u00f6\3\2\2\28\u0100\3\2\2\2:\u0106\3\2\2\2<\u0108\3\2\2\2"+
		">\u0114\3\2\2\2@\u0121\3\2\2\2B\u0132\3\2\2\2D\u0134\3\2\2\2F\u0137\3"+
		"\2\2\2H\u013b\3\2\2\2J\u0141\3\2\2\2L\u0143\3\2\2\2N\u0148\3\2\2\2P\u014b"+
		"\3\2\2\2R\u0150\3\2\2\2T\u0159\3\2\2\2V\u015d\3\2\2\2X\u0164\3\2\2\2Z"+
		"\u0166\3\2\2\2\\\u016e\3\2\2\2^\u0170\3\2\2\2`\u017f\3\2\2\2b\u0184\3"+
		"\2\2\2d\u0186\3\2\2\2f\u0190\3\2\2\2hi\7#\2\2i\3\3\2\2\2jk\7\36\2\2k\5"+
		"\3\2\2\2ln\7\3\2\2ml\3\2\2\2mn\3\2\2\2nq\3\2\2\2or\5\4\3\2pr\5\2\2\2q"+
		"o\3\2\2\2qp\3\2\2\2r\7\3\2\2\2st\t\2\2\2t\t\3\2\2\2uv\7!\2\2v\13\3\2\2"+
		"\2wx\7!\2\2x\r\3\2\2\2yz\7!\2\2z\17\3\2\2\2{|\7!\2\2|\21\3\2\2\2}~\7\4"+
		"\2\2~\177\5\24\13\2\177\u0080\7\5\2\2\u0080\23\3\2\2\2\u0081\u0086\5\26"+
		"\f\2\u0082\u0083\7\6\2\2\u0083\u0085\5\26\f\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u0091\5\b\5\2\u008a\u0091\5\n\6\2\u008b\u0091"+
		"\5\6\4\2\u008c\u008e\7\3\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\5*\26\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2"+
		"\2\2\u0090\u008b\3\2\2\2\u0090\u008d\3\2\2\2\u0091\27\3\2\2\2\u0092\u0095"+
		"\5\26\f\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\31\3\2\2\2\u0096\u0098\7\3\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009c\5\36\20\2\u009a\u009c\5 \21\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f"+
		"\5\34\17\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5"+
		"\7\7\2\2\u00a4\u00a6\7\37\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00b0\7\b\2\2\u00ad"+
		"\u00b1\5\30\r\2\u00ae\u00b1\5\24\13\2\u00af\u00b1\5\32\16\2\u00b0\u00ad"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3!\3\2\2\2\u00b4\u00b9\5\32\16\2\u00b5\u00b6\7\6\2"+
		"\2\u00b6\u00b8\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00c0\5\b\5\2\u00bd\u00c0\5&\24\2\u00be\u00c0\5(\25\2\u00bf\u00bc"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0%\3\2\2\2\u00c1"+
		"\u00c4\5\6\4\2\u00c2\u00c4\5\32\16\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7\23\2\2\u00c6\u00c9\5\6\4\2\u00c7"+
		"\u00c9\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\'\3\2\2"+
		"\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\7\t\2\2\u00cd)"+
		"\3\2\2\2\u00ce\u00d2\t\3\2\2\u00cf\u00d1\5,\27\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3+\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7\7\2\2\u00d6\u00d8\7\37\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"-\3\2\2\2\u00db\u00e0\7%\2\2\u00dc\u00e0\5:\36\2\u00dd\u00e0\5J&\2\u00de"+
		"\u00e0\5\\/\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2/\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9\7%\2\2\u00e5"+
		"\u00e9\5:\36\2\u00e6\u00e9\5J&\2\u00e7\u00e9\5\\/\2\u00e8\u00e4\3\2\2"+
		"\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\61\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\7\31\2\2\u00ee\u00f0\5\30\r\2\u00ef\u00ee\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2"+
		"\u00f3\7%\2\2\u00f3\63\3\2\2\2\u00f4\u00f5\7\35\2\2\u00f5\65\3\2\2\2\u00f6"+
		"\u00f7\5\62\32\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\5\64\33\2\u00f9\67\3"+
		"\2\2\2\u00fa\u0101\5\30\r\2\u00fb\u0101\5\"\22\2\u00fc\u00fd\5\30\r\2"+
		"\u00fd\u00fe\7\24\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0101\3\2\2\2\u0100\u00fa"+
		"\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u01019\3\2\2\2\u0102"+
		"\u0107\5> \2\u0103\u0107\5<\37\2\u0104\u0107\5@!\2\u0105\u0107\5H%\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107;\3\2\2\2\u0108\u0109\7\32\2\2\u0109\u010c\5\f\7\2\u010a\u010b"+
		"\7\6\2\2\u010b\u010d\5\20\t\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u0110\7\13\2\2\u010f\u0111\7&\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7%\2\2\u0113"+
		"=\3\2\2\2\u0114\u0115\7\32\2\2\u0115\u0118\5\f\7\2\u0116\u0117\7\6\2\2"+
		"\u0117\u0119\5\20\t\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\7\13\2\2\u011b\u011d\58\35\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7&\2\2\u011f\u0120"+
		"\7%\2\2\u0120?\3\2\2\2\u0121\u0122\7\32\2\2\u0122\u0125\5\f\7\2\u0123"+
		"\u0124\7\6\2\2\u0124\u0126\5\20\t\2\u0125\u0123\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\7\13\2\2\u0128\u012a\58\35\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\34"+
		"\2\2\u012c\u012d\7%\2\2\u012d\u012e\5.\30\2\u012e\u012f\5\64\33\2\u012f"+
		"A\3\2\2\2\u0130\u0133\5D#\2\u0131\u0133\5F$\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133C\3\2\2\2\u0134\u0135\5\16\b\2\u0135\u0136\5:\36\2"+
		"\u0136E\3\2\2\2\u0137\u0138\5\16\b\2\u0138\u0139\7\32\2\2\u0139\u013a"+
		"\7\13\2\2\u013aG\3\2\2\2\u013b\u013c\7\32\2\2\u013c\u013d\5$\23\2\u013d"+
		"\u013e\5:\36\2\u013eI\3\2\2\2\u013f\u0142\5L\'\2\u0140\u0142\5N(\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142K\3\2\2\2\u0143\u0144\7\33\2\2"+
		"\u0144\u0145\5\30\r\2\u0145\u0146\7&\2\2\u0146\u0147\7%\2\2\u0147M\3\2"+
		"\2\2\u0148\u0149\7\33\2\2\u0149\u014a\5P)\2\u014aO\3\2\2\2\u014b\u014c"+
		"\7\34\2\2\u014c\u014d\7%\2\2\u014d\u014e\5T+\2\u014e\u014f\5\64\33\2\u014f"+
		"Q\3\2\2\2\u0150\u0151\7\34\2\2\u0151\u0152\7%\2\2\u0152\u0153\5T+\2\u0153"+
		"\u0154\7\f\2\2\u0154S\3\2\2\2\u0155\u0158\5Z.\2\u0156\u0158\7%\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015aU\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e"+
		"\7\37\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160W\3\2\2\2\u0161\u0165\5\26\f\2\u0162\u0165\5"+
		"R*\2\u0163\u0165\5\22\n\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0163\3\2\2\2\u0165Y\3\2\2\2\u0166\u0167\5V,\2\u0167\u0168\7\r\2\2\u0168"+
		"\u0169\5X-\2\u0169\u016a\7\6\2\2\u016a\u016b\7%\2\2\u016b[\3\2\2\2\u016c"+
		"\u016f\5b\62\2\u016d\u016f\5^\60\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f]\3\2\2\2\u0170\u0174\7\26\2\2\u0171\u0175\5\30\r\2\u0172\u0175"+
		"\5\32\16\2\u0173\u0175\5*\26\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2"+
		"\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\27\2\2\u0177\u0178"+
		"\7\34\2\2\u0178\u0179\5`\61\2\u0179\u017a\5\64\33\2\u017a_\3\2\2\2\u017b"+
		"\u017e\7%\2\2\u017c\u017e\5B\"\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2"+
		"\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180a"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0185\5d\63\2\u0183\u0185\5f\64\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185c\3\2\2\2\u0186\u0189\7\25\2\2"+
		"\u0187\u018a\5$\23\2\u0188\u018a\5*\26\2\u0189\u0187\3\2\2\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7\27\2\2\u018c\u018d\7\34\2\2"+
		"\u018d\u018e\5.\30\2\u018e\u018f\5\64\33\2\u018fe\3\2\2\2\u0190\u0193"+
		"\7\25\2\2\u0191\u0194\5$\23\2\u0192\u0194\5*\26\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7\27\2\2\u0196\u0197"+
		"\7\34\2\2\u0197\u0198\5.\30\2\u0198\u0199\7\f\2\2\u0199\u019a\7\30\2\2"+
		"\u019a\u019b\7\34\2\2\u019b\u019c\5\60\31\2\u019c\u019d\5\64\33\2\u019d"+
		"g\3\2\2\2-mq\u0086\u008d\u0090\u0094\u0097\u009b\u00a0\u00a7\u00b0\u00b9"+
		"\u00bf\u00c3\u00c8\u00d2\u00d9\u00df\u00e1\u00e8\u00ea\u00ef\u0100\u0106"+
		"\u010c\u0110\u0118\u011c\u0125\u0129\u0132\u0141\u0157\u0159\u015f\u0164"+
		"\u016e\u0174\u017d\u017f\u0184\u0189\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}