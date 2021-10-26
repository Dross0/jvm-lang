package ru.gaidamaka.jvm.lang.antlr4;// Generated from bokl.g4 by ANTLR 4.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class boklParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		Less=10, LessEqual=11, Greater=12, GreaterEqual=13, NotEqual=14, Equal=15, 
		LE=16, WS=17, NL=18, GT=19, Goto=20, Int=21, String=22, Print=23, Var=24, 
		Num=25, StringValue=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'mainFunc'", "'('", "')'", "'{'", "'while'", "'++'", "'}'", 
		"'='", "'if'", "'<'", "'<='", "'>'", "'>='", "'!='", "'=='", "';'", "WS", 
		"'\n'", "'$'", "'goto'", "'int'", "'string'", "'print'", "Var", "Num", 
		"StringValue"
	};
	public static final int
		RULE_type = 0, RULE_varDeclaration = 1, RULE_intRValue = 2, RULE_intVarDeclaration = 3, 
		RULE_intVarAssign = 4, RULE_compareInt = 5, RULE_strRValue = 6, RULE_strVarDeclaration = 7, 
		RULE_strVarAssign = 8, RULE_compareStr = 9, RULE_condition = 10, RULE_ifStatement = 11, 
		RULE_print = 12, RULE_gotoOperation = 13, RULE_increment = 14, RULE_whileLoop = 15, 
		RULE_gotoLabel = 16, RULE_codeBlock = 17, RULE_script = 18, RULE_compareOperation = 19;
	public static final String[] ruleNames = {
		"type", "varDeclaration", "intRValue", "intVarDeclaration", "intVarAssign", 
		"compareInt", "strRValue", "strVarDeclaration", "strVarAssign", "compareStr", 
		"condition", "ifStatement", "print", "gotoOperation", "increment", "whileLoop", 
		"gotoLabel", "codeBlock", "script", "compareOperation"
	};

	@Override
	public String getGrammarFileName() { return "bokl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public boklParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(boklParser.String, 0); }
		public TerminalNode Int() { return getToken(boklParser.Int, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); type();
			setState(43); match(WS);
			setState(44); match(Var);
			setState(45); match(LE);
			setState(47);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(46); match(WS);
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

	public static class IntRValueContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(boklParser.Num, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public IntRValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intRValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterIntRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitIntRValue(this);
		}
	}

	public final IntRValueContext intRValue() throws RecognitionException {
		IntRValueContext _localctx = new IntRValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intRValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IntVarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public IntRValueContext intRValue() {
			return getRuleContext(IntRValueContext.class,0);
		}
		public TerminalNode Int() { return getToken(boklParser.Int, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public IntVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterIntVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitIntVarDeclaration(this);
		}
	}

	public final IntVarDeclarationContext intVarDeclaration() throws RecognitionException {
		IntVarDeclarationContext _localctx = new IntVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(Int);
			setState(52); match(WS);
			setState(53); match(Var);
			setState(55);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(54); match(WS);
				}
			}

			setState(57); match(T__1);
			setState(59);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(58); match(WS);
				}
			}

			setState(61); intRValue();
			setState(63);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(62); match(WS);
				}
			}

			setState(65); match(LE);
			setState(67);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(66); match(WS);
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

	public static class IntVarAssignContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public IntRValueContext intRValue() {
			return getRuleContext(IntRValueContext.class,0);
		}
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public IntVarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVarAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterIntVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitIntVarAssign(this);
		}
	}

	public final IntVarAssignContext intVarAssign() throws RecognitionException {
		IntVarAssignContext _localctx = new IntVarAssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intVarAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(Var);
			setState(71);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(70); match(WS);
				}
			}

			setState(73); match(T__1);
			setState(75);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(74); match(WS);
				}
			}

			setState(77); intRValue();
			setState(79);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(78); match(WS);
				}
			}

			setState(81); match(LE);
			setState(83);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(82); match(WS);
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

	public static class CompareIntContext extends ParserRuleContext {
		public IntRValueContext intRValue(int i) {
			return getRuleContext(IntRValueContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public List<IntRValueContext> intRValue() {
			return getRuleContexts(IntRValueContext.class);
		}
		public CompareOperationContext compareOperation() {
			return getRuleContext(CompareOperationContext.class,0);
		}
		public CompareIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterCompareInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitCompareInt(this);
		}
	}

	public final CompareIntContext compareInt() throws RecognitionException {
		CompareIntContext _localctx = new CompareIntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compareInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); intRValue();
			setState(87);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(86); match(WS);
				}
			}

			setState(89); compareOperation();
			setState(91);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(90); match(WS);
				}
			}

			setState(93); intRValue();
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(94); match(WS);
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

	public static class StrRValueContext extends ParserRuleContext {
		public TerminalNode StringValue() { return getToken(boklParser.StringValue, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public StrRValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strRValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterStrRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitStrRValue(this);
		}
	}

	public final StrRValueContext strRValue() throws RecognitionException {
		StrRValueContext _localctx = new StrRValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_strRValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==StringValue) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StrVarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode String() { return getToken(boklParser.String, 0); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public StrRValueContext strRValue() {
			return getRuleContext(StrRValueContext.class,0);
		}
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public StrVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterStrVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitStrVarDeclaration(this);
		}
	}

	public final StrVarDeclarationContext strVarDeclaration() throws RecognitionException {
		StrVarDeclarationContext _localctx = new StrVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_strVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(String);
			setState(100); match(WS);
			setState(101); match(Var);
			setState(102); match(WS);
			setState(103); match(T__1);
			setState(104); match(WS);
			setState(105); strRValue();
			setState(107);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(106); match(WS);
				}
			}

			setState(109); match(LE);
			setState(111);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(110); match(WS);
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

	public static class StrVarAssignContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public StrRValueContext strRValue() {
			return getRuleContext(StrRValueContext.class,0);
		}
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public StrVarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strVarAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterStrVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitStrVarAssign(this);
		}
	}

	public final StrVarAssignContext strVarAssign() throws RecognitionException {
		StrVarAssignContext _localctx = new StrVarAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_strVarAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(Var);
			setState(115);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(114); match(WS);
				}
			}

			setState(117); match(T__1);
			setState(119);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(118); match(WS);
				}
			}

			setState(121); strRValue();
			setState(123);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(122); match(WS);
				}
			}

			setState(125); match(LE);
			setState(127);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(126); match(WS);
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

	public static class CompareStrContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public StrRValueContext strRValue(int i) {
			return getRuleContext(StrRValueContext.class,i);
		}
		public List<StrRValueContext> strRValue() {
			return getRuleContexts(StrRValueContext.class);
		}
		public CompareOperationContext compareOperation() {
			return getRuleContext(CompareOperationContext.class,0);
		}
		public CompareStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterCompareStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitCompareStr(this);
		}
	}

	public final CompareStrContext compareStr() throws RecognitionException {
		CompareStrContext _localctx = new CompareStrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); strRValue();
			setState(131);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(130); match(WS);
				}
			}

			setState(133); compareOperation();
			setState(135);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(134); match(WS);
				}
			}

			setState(137); strRValue();
			setState(139);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(138); match(WS);
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

	public static class ConditionContext extends ParserRuleContext {
		public CompareIntContext compareInt() {
			return getRuleContext(CompareIntContext.class,0);
		}
		public TerminalNode WS() { return getToken(boklParser.WS, 0); }
		public CompareStrContext compareStr() {
			return getRuleContext(CompareStrContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__7);
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(142); compareInt();
				}
				break;

			case 2:
				{
				setState(143); compareStr();
				}
				break;
			}
			setState(146); match(T__6);
			setState(148);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(147); match(WS);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__0);
			setState(151); match(WS);
			{
			setState(152); condition();
			}
			setState(153); codeBlock();
			setState(155);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(154); match(WS);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode Print() { return getToken(boklParser.Print, 0); }
		public TerminalNode Num() { return getToken(boklParser.Num, 0); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public TerminalNode StringValue() { return getToken(boklParser.StringValue, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(Print);
			setState(159);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(158); match(WS);
				}
			}

			setState(161); match(T__7);
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << Num) | (1L << StringValue))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(164);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(163); match(WS);
				}
			}

			setState(166); match(T__6);
			setState(168);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167); match(WS);
				}
			}

			setState(170); match(LE);
			setState(172);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(171); match(WS);
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

	public static class GotoOperationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public TerminalNode Goto() { return getToken(boklParser.Goto, 0); }
		public GotoOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterGotoOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitGotoOperation(this);
		}
	}

	public final GotoOperationContext gotoOperation() throws RecognitionException {
		GotoOperationContext _localctx = new GotoOperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_gotoOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(Goto);
			setState(175); match(WS);
			setState(176); match(Var);
			setState(178);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(177); match(WS);
				}
			}

			setState(180); match(LE);
			setState(182);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(181); match(WS);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(Var);
			setState(185); match(T__3);
			setState(187);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(186); match(WS);
				}
			}

			setState(189); match(LE);
			setState(191);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(190); match(WS);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public CompareIntContext compareInt() {
			return getRuleContext(CompareIntContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(T__4);
			setState(195);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(194); match(WS);
				}
			}

			setState(197); match(T__7);
			setState(199);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(198); match(WS);
				}
			}

			setState(201); compareInt();
			setState(203);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(202); match(WS);
				}
			}

			setState(205); match(T__6);
			setState(207);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(206); match(WS);
				}
			}

			setState(209); codeBlock();
			setState(211);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(210); match(WS);
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

	public static class GotoLabelContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public TerminalNode GT() { return getToken(boklParser.GT, 0); }
		public TerminalNode LE() { return getToken(boklParser.LE, 0); }
		public TerminalNode Var() { return getToken(boklParser.Var, 0); }
		public GotoLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterGotoLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitGotoLabel(this);
		}
	}

	public final GotoLabelContext gotoLabel() throws RecognitionException {
		GotoLabelContext _localctx = new GotoLabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gotoLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(GT);
			setState(215);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(214); match(WS);
				}
			}

			setState(217); match(Var);
			setState(219);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(218); match(WS);
				}
			}

			setState(221); match(LE);
			setState(223);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(222); match(WS);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public GotoLabelContext gotoLabel(int i) {
			return getRuleContext(GotoLabelContext.class,i);
		}
		public List<GotoOperationContext> gotoOperation() {
			return getRuleContexts(GotoOperationContext.class);
		}
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public GotoOperationContext gotoOperation(int i) {
			return getRuleContext(GotoOperationContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public List<StrVarAssignContext> strVarAssign() {
			return getRuleContexts(StrVarAssignContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode EOF() { return getToken(boklParser.EOF, 0); }
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
		}
		public IntVarDeclarationContext intVarDeclaration(int i) {
			return getRuleContext(IntVarDeclarationContext.class,i);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<IntVarAssignContext> intVarAssign() {
			return getRuleContexts(IntVarAssignContext.class);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public List<IntVarDeclarationContext> intVarDeclaration() {
			return getRuleContexts(IntVarDeclarationContext.class);
		}
		public List<GotoLabelContext> gotoLabel() {
			return getRuleContexts(GotoLabelContext.class);
		}
		public StrVarDeclarationContext strVarDeclaration(int i) {
			return getRuleContext(StrVarDeclarationContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public TerminalNode WS() { return getToken(boklParser.WS, 0); }
		public IntVarAssignContext intVarAssign(int i) {
			return getRuleContext(IntVarAssignContext.class,i);
		}
		public StrVarAssignContext strVarAssign(int i) {
			return getRuleContext(StrVarAssignContext.class,i);
		}
		public List<StrVarDeclarationContext> strVarDeclaration() {
			return getRuleContexts(StrVarDeclarationContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_codeBlock);
		int _la;
		try {
			setState(248);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(T__5);
				setState(227);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(226); match(WS);
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__5 - -1)) | (1L << (T__4 - -1)) | (1L << (T__0 - -1)) | (1L << (GT - -1)) | (1L << (Goto - -1)) | (1L << (Int - -1)) | (1L << (String - -1)) | (1L << (Print - -1)) | (1L << (Var - -1)))) != 0)) {
					{
					setState(241);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(229); gotoLabel();
						}
						break;

					case 2:
						{
						setState(230); gotoOperation();
						}
						break;

					case 3:
						{
						setState(231); varDeclaration();
						}
						break;

					case 4:
						{
						setState(232); intVarDeclaration();
						}
						break;

					case 5:
						{
						setState(233); intVarAssign();
						}
						break;

					case 6:
						{
						setState(234); strVarDeclaration();
						}
						break;

					case 7:
						{
						setState(235); strVarAssign();
						}
						break;

					case 8:
						{
						setState(236); ifStatement();
						}
						break;

					case 9:
						{
						setState(237); whileLoop();
						}
						break;

					case 10:
						{
						setState(238); codeBlock();
						}
						break;

					case 11:
						{
						setState(239); increment();
						}
						break;

					case 12:
						{
						setState(240); print();
						}
						break;
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246); match(T__2);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); match(EOF);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(250); match(WS);
				}
			}

			setState(253); match(T__8);
			setState(255);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(254); match(WS);
				}
			}

			setState(257); codeBlock();
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

	public static class CompareOperationContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(boklParser.Less, 0); }
		public TerminalNode Greater() { return getToken(boklParser.Greater, 0); }
		public TerminalNode NotEqual() { return getToken(boklParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(boklParser.LessEqual, 0); }
		public TerminalNode Equal() { return getToken(boklParser.Equal, 0); }
		public TerminalNode GreaterEqual() { return getToken(boklParser.GreaterEqual, 0); }
		public CompareOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).enterCompareOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof boklListener) ((boklListener)listener).exitCompareOperation(this);
		}
	}

	public final CompareOperationContext compareOperation() throws RecognitionException {
		CompareOperationContext _localctx = new CompareOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compareOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << NotEqual) | (1L << Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0108\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\5\5>\n\5\3\5\3\5\5\5B\n\5\3"+
		"\5\3\5\5\5F\n\5\3\6\3\6\5\6J\n\6\3\6\3\6\5\6N\n\6\3\6\3\6\5\6R\n\6\3\6"+
		"\3\6\5\6V\n\6\3\7\3\7\5\7Z\n\7\3\7\3\7\5\7^\n\7\3\7\3\7\5\7b\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\5\tr\n\t\3\n\3\n\5"+
		"\nv\n\n\3\n\3\n\5\nz\n\n\3\n\3\n\5\n~\n\n\3\n\3\n\5\n\u0082\n\n\3\13\3"+
		"\13\5\13\u0086\n\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\5\13\u008e\n\13"+
		"\3\f\3\f\3\f\5\f\u0093\n\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u009e\n\r\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\16\5\16\u00a7\n\16"+
		"\3\16\3\16\5\16\u00ab\n\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00b5\n\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\5\20\u00be"+
		"\n\20\3\20\3\20\5\20\u00c2\n\20\3\21\3\21\5\21\u00c6\n\21\3\21\3\21\5"+
		"\21\u00ca\n\21\3\21\3\21\5\21\u00ce\n\21\3\21\3\21\5\21\u00d2\n\21\3\21"+
		"\3\21\5\21\u00d6\n\21\3\22\3\22\5\22\u00da\n\22\3\22\3\22\5\22\u00de\n"+
		"\22\3\22\3\22\5\22\u00e2\n\22\3\23\3\23\5\23\u00e6\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f4\n\23\f\23\16"+
		"\23\u00f7\13\23\3\23\3\23\5\23\u00fb\n\23\3\24\5\24\u00fe\n\24\3\24\3"+
		"\24\5\24\u0102\n\24\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\7\3\2\27\30\3\2\32\33\4\2\32\32\34\34\3"+
		"\2\32\34\3\2\f\21\u012b\2*\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2"+
		"\2\nG\3\2\2\2\fW\3\2\2\2\16c\3\2\2\2\20e\3\2\2\2\22s\3\2\2\2\24\u0083"+
		"\3\2\2\2\26\u008f\3\2\2\2\30\u0098\3\2\2\2\32\u009f\3\2\2\2\34\u00b0\3"+
		"\2\2\2\36\u00ba\3\2\2\2 \u00c3\3\2\2\2\"\u00d7\3\2\2\2$\u00fa\3\2\2\2"+
		"&\u00fd\3\2\2\2(\u0105\3\2\2\2*+\t\2\2\2+\3\3\2\2\2,-\5\2\2\2-.\7\23\2"+
		"\2./\7\32\2\2/\61\7\22\2\2\60\62\7\23\2\2\61\60\3\2\2\2\61\62\3\2\2\2"+
		"\62\5\3\2\2\2\63\64\t\3\2\2\64\7\3\2\2\2\65\66\7\27\2\2\66\67\7\23\2\2"+
		"\679\7\32\2\28:\7\23\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\n\2\2<>\7\23"+
		"\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\5\6\4\2@B\7\23\2\2A@\3\2\2\2AB\3"+
		"\2\2\2BC\3\2\2\2CE\7\22\2\2DF\7\23\2\2ED\3\2\2\2EF\3\2\2\2F\t\3\2\2\2"+
		"GI\7\32\2\2HJ\7\23\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\n\2\2LN\7\23"+
		"\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\5\6\4\2PR\7\23\2\2QP\3\2\2\2QR\3"+
		"\2\2\2RS\3\2\2\2SU\7\22\2\2TV\7\23\2\2UT\3\2\2\2UV\3\2\2\2V\13\3\2\2\2"+
		"WY\5\6\4\2XZ\7\23\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\5(\25\2\\^\7\23"+
		"\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\5\6\4\2`b\7\23\2\2a`\3\2\2\2ab\3"+
		"\2\2\2b\r\3\2\2\2cd\t\4\2\2d\17\3\2\2\2ef\7\30\2\2fg\7\23\2\2gh\7\32\2"+
		"\2hi\7\23\2\2ij\7\n\2\2jk\7\23\2\2km\5\16\b\2ln\7\23\2\2ml\3\2\2\2mn\3"+
		"\2\2\2no\3\2\2\2oq\7\22\2\2pr\7\23\2\2qp\3\2\2\2qr\3\2\2\2r\21\3\2\2\2"+
		"su\7\32\2\2tv\7\23\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\n\2\2xz\7\23"+
		"\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\5\16\b\2|~\7\23\2\2}|\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0081\7\22\2\2\u0080\u0082\7\23\2\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0085\5\16\b\2\u0084"+
		"\u0086\7\23\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0089\5(\25\2\u0088\u008a\7\23\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5\16\b\2\u008c\u008e\7"+
		"\23\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\25\3\2\2\2\u008f"+
		"\u0092\7\4\2\2\u0090\u0093\5\f\7\2\u0091\u0093\5\24\13\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\5\2\2\u0095"+
		"\u0097\7\23\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2"+
		"\2\u0098\u0099\7\13\2\2\u0099\u009a\7\23\2\2\u009a\u009b\5\26\f\2\u009b"+
		"\u009d\5$\23\2\u009c\u009e\7\23\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\31\3\2\2\2\u009f\u00a1\7\31\2\2\u00a0\u00a2\7\23\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\4"+
		"\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a7\7\23\2\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\5\2\2\u00a9\u00ab\7\23"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\7\22\2\2\u00ad\u00af\7\23\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\7\23\2\2\u00b2"+
		"\u00b4\7\32\2\2\u00b3\u00b5\7\23\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\7\22\2\2\u00b7\u00b9\7\23\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\32\2"+
		"\2\u00bb\u00bd\7\b\2\2\u00bc\u00be\7\23\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\22\2\2\u00c0\u00c2\7"+
		"\23\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\37\3\2\2\2\u00c3"+
		"\u00c5\7\7\2\2\u00c4\u00c6\7\23\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7\4\2\2\u00c8\u00ca\7\23\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\5\f"+
		"\7\2\u00cc\u00ce\7\23\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\7\5\2\2\u00d0\u00d2\7\23\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\5$\23\2\u00d4"+
		"\u00d6\7\23\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6!\3\2\2\2"+
		"\u00d7\u00d9\7\25\2\2\u00d8\u00da\7\23\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\7\32\2\2\u00dc\u00de\7\23\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\7\22\2\2\u00e0\u00e2\7\23\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2#\3\2\2\2\u00e3\u00e5\7\6\2\2\u00e4\u00e6\7\23\2\2\u00e5\u00e4\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f5\3\2\2\2\u00e7\u00f4\5\"\22\2\u00e8"+
		"\u00f4\5\34\17\2\u00e9\u00f4\5\4\3\2\u00ea\u00f4\5\b\5\2\u00eb\u00f4\5"+
		"\n\6\2\u00ec\u00f4\5\20\t\2\u00ed\u00f4\5\22\n\2\u00ee\u00f4\5\30\r\2"+
		"\u00ef\u00f4\5 \21\2\u00f0\u00f4\5$\23\2\u00f1\u00f4\5\36\20\2\u00f2\u00f4"+
		"\5\32\16\2\u00f3\u00e7\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2\2\2"+
		"\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed"+
		"\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\7\t\2\2\u00f9\u00fb\7\2\2\3\u00fa\u00e3\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb%\3\2\2\2\u00fc\u00fe\7\23\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\7\3\2\2\u0100\u0102\7\23\2\2"+
		"\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\5$\23\2\u0104\'\3\2\2\2\u0105\u0106\t\6\2\2\u0106)\3\2\2\2\60\619=AE"+
		"IMQUY]amquy}\u0081\u0085\u0089\u008d\u0092\u0096\u009d\u00a1\u00a6\u00aa"+
		"\u00ae\u00b4\u00b8\u00bd\u00c1\u00c5\u00c9\u00cd\u00d1\u00d5\u00d9\u00dd"+
		"\u00e1\u00e5\u00f3\u00f5\u00fa\u00fd\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}