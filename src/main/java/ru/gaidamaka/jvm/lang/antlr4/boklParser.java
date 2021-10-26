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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Less=12, LessEqual=13, Greater=14, GreaterEqual=15, 
		NotEqual=16, Equal=17, LE=18, WS=19, GT=20, Int=21, String=22, Var=23, 
		Num=24, StringValue=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'mainFunc'", "'print'", "'('", "')'", "'{'", "'while'", 
		"'++'", "'}'", "'goto'", "'='", "'if'", "'<'", "'<='", "'>'", "'>='", 
		"'!='", "'=='", "';'", "WS", "'$'", "'int'", "'string'", "Var", "Num", 
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
			setState(46);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(45); match(WS);
				}
			}

			setState(48); match(LE);
			setState(50);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(49); match(WS);
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
			setState(52);
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
			setState(54); match(Int);
			setState(55); match(WS);
			setState(56); match(Var);
			setState(58);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57); match(WS);
				}
			}

			setState(60); match(T__1);
			setState(62);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(61); match(WS);
				}
			}

			setState(64); intRValue();
			setState(66);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(65); match(WS);
				}
			}

			setState(68); match(LE);
			setState(70);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(69); match(WS);
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
			setState(72); match(Var);
			setState(74);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(73); match(WS);
				}
			}

			setState(76); match(T__1);
			setState(78);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77); match(WS);
				}
			}

			setState(80); intRValue();
			setState(82);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81); match(WS);
				}
			}

			setState(84); match(LE);
			setState(86);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85); match(WS);
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
			setState(88); intRValue();
			setState(90);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89); match(WS);
				}
			}

			setState(92); compareOperation();
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93); match(WS);
				}
			}

			setState(96); intRValue();
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(97); match(WS);
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
			setState(100);
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
			setState(102); match(String);
			setState(103); match(WS);
			setState(104); match(Var);
			setState(105); match(WS);
			setState(106); match(T__1);
			setState(107); match(WS);
			setState(108); strRValue();
			setState(110);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109); match(WS);
				}
			}

			setState(112); match(LE);
			setState(114);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113); match(WS);
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
			setState(116); match(Var);
			setState(118);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(117); match(WS);
				}
			}

			setState(120); match(T__1);
			setState(122);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(121); match(WS);
				}
			}

			setState(124); strRValue();
			setState(126);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(125); match(WS);
				}
			}

			setState(128); match(LE);
			setState(130);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(129); match(WS);
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
			setState(132); strRValue();
			setState(134);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(133); match(WS);
				}
			}

			setState(136); compareOperation();
			setState(138);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137); match(WS);
				}
			}

			setState(140); strRValue();
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(141); match(WS);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(boklParser.WS, i);
		}
		public CompareIntContext compareInt() {
			return getRuleContext(CompareIntContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
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
			setState(144); match(T__8);
			setState(146);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(145); match(WS);
				}
			}

			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(148); compareInt();
				}
				break;

			case 2:
				{
				setState(149); compareStr();
				}
				break;
			}
			setState(153);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(152); match(WS);
				}
			}

			setState(155); match(T__7);
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(156); match(WS);
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
			setState(159); match(T__0);
			setState(160); match(WS);
			{
			setState(161); condition();
			}
			setState(162); codeBlock();
			setState(164);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(163); match(WS);
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
			setState(166); match(T__9);
			setState(168);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167); match(WS);
				}
			}

			setState(170); match(T__8);
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << Num) | (1L << StringValue))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(173);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(172); match(WS);
				}
			}

			setState(175); match(T__7);
			setState(177);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(176); match(WS);
				}
			}

			setState(179); match(LE);
			setState(181);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(180); match(WS);
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
			setState(183); match(T__2);
			setState(184); match(WS);
			setState(185); match(Var);
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
			setState(193); match(Var);
			setState(194); match(T__4);
			setState(196);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(195); match(WS);
				}
			}

			setState(198); match(LE);
			setState(200);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(199); match(WS);
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
		public List<TerminalNode> WS() { return getTokens(boklParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(202); match(T__5);
			setState(204);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(203); match(WS);
				}
			}

			{
			setState(206); condition();
			}
			setState(208);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(207); match(WS);
				}
			}

			setState(210); codeBlock();
			setState(212);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(211); match(WS);
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
			setState(214); match(GT);
			setState(216);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(215); match(WS);
				}
			}

			setState(218); match(Var);
			setState(220);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(219); match(WS);
				}
			}

			setState(222); match(LE);
			setState(224);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(223); match(WS);
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
			setState(249);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); match(T__6);
				setState(228);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(227); match(WS);
					}
				}

				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__9 - -1)) | (1L << (T__6 - -1)) | (1L << (T__5 - -1)) | (1L << (T__2 - -1)) | (1L << (T__0 - -1)) | (1L << (GT - -1)) | (1L << (Int - -1)) | (1L << (String - -1)) | (1L << (Var - -1)))) != 0)) {
					{
					setState(242);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(230); gotoLabel();
						}
						break;

					case 2:
						{
						setState(231); gotoOperation();
						}
						break;

					case 3:
						{
						setState(232); varDeclaration();
						}
						break;

					case 4:
						{
						setState(233); intVarDeclaration();
						}
						break;

					case 5:
						{
						setState(234); intVarAssign();
						}
						break;

					case 6:
						{
						setState(235); strVarDeclaration();
						}
						break;

					case 7:
						{
						setState(236); strVarAssign();
						}
						break;

					case 8:
						{
						setState(237); ifStatement();
						}
						break;

					case 9:
						{
						setState(238); whileLoop();
						}
						break;

					case 10:
						{
						setState(239); codeBlock();
						}
						break;

					case 11:
						{
						setState(240); increment();
						}
						break;

					case 12:
						{
						setState(241); print();
						}
						break;
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247); match(T__3);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(EOF);
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
			setState(252);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(251); match(WS);
				}
			}

			setState(254); match(T__10);
			setState(256);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(255); match(WS);
				}
			}

			setState(258); codeBlock();
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
			setState(260);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0109\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\5\5A\n\5\3\5"+
		"\3\5\5\5E\n\5\3\5\3\5\5\5I\n\5\3\6\3\6\5\6M\n\6\3\6\3\6\5\6Q\n\6\3\6\3"+
		"\6\5\6U\n\6\3\6\3\6\5\6Y\n\6\3\7\3\7\5\7]\n\7\3\7\3\7\5\7a\n\7\3\7\3\7"+
		"\5\7e\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\t\3\t\5\t"+
		"u\n\t\3\n\3\n\5\ny\n\n\3\n\3\n\5\n}\n\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n"+
		"\5\n\u0085\n\n\3\13\3\13\5\13\u0089\n\13\3\13\3\13\5\13\u008d\n\13\3\13"+
		"\3\13\5\13\u0091\n\13\3\f\3\f\5\f\u0095\n\f\3\f\3\f\5\f\u0099\n\f\3\f"+
		"\5\f\u009c\n\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a7\n\r"+
		"\3\16\3\16\5\16\u00ab\n\16\3\16\3\16\3\16\5\16\u00b0\n\16\3\16\3\16\5"+
		"\16\u00b4\n\16\3\16\3\16\5\16\u00b8\n\16\3\17\3\17\3\17\3\17\5\17\u00be"+
		"\n\17\3\17\3\17\5\17\u00c2\n\17\3\20\3\20\3\20\5\20\u00c7\n\20\3\20\3"+
		"\20\5\20\u00cb\n\20\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\5\21\u00d3\n\21"+
		"\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\5\22\u00db\n\22\3\22\3\22\5\22\u00df"+
		"\n\22\3\22\3\22\5\22\u00e3\n\22\3\23\3\23\5\23\u00e7\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f5\n\23\f\23"+
		"\16\23\u00f8\13\23\3\23\3\23\5\23\u00fc\n\23\3\24\5\24\u00ff\n\24\3\24"+
		"\3\24\5\24\u0103\n\24\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\7\3\2\27\30\3\2\31\32\4\2\31\31\33\33\3"+
		"\2\31\33\3\2\16\23\u012d\2*\3\2\2\2\4,\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2"+
		"\nJ\3\2\2\2\fZ\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22v\3\2\2\2\24\u0086\3"+
		"\2\2\2\26\u0092\3\2\2\2\30\u00a1\3\2\2\2\32\u00a8\3\2\2\2\34\u00b9\3\2"+
		"\2\2\36\u00c3\3\2\2\2 \u00cc\3\2\2\2\"\u00d8\3\2\2\2$\u00fb\3\2\2\2&\u00fe"+
		"\3\2\2\2(\u0106\3\2\2\2*+\t\2\2\2+\3\3\2\2\2,-\5\2\2\2-.\7\25\2\2.\60"+
		"\7\31\2\2/\61\7\25\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64\7"+
		"\24\2\2\63\65\7\25\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\67"+
		"\t\3\2\2\67\7\3\2\2\289\7\27\2\29:\7\25\2\2:<\7\31\2\2;=\7\25\2\2<;\3"+
		"\2\2\2<=\3\2\2\2=>\3\2\2\2>@\7\f\2\2?A\7\25\2\2@?\3\2\2\2@A\3\2\2\2AB"+
		"\3\2\2\2BD\5\6\4\2CE\7\25\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\7\24\2\2"+
		"GI\7\25\2\2HG\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JL\7\31\2\2KM\7\25\2\2LK\3\2"+
		"\2\2LM\3\2\2\2MN\3\2\2\2NP\7\f\2\2OQ\7\25\2\2PO\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RT\5\6\4\2SU\7\25\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\24\2\2W"+
		"Y\7\25\2\2XW\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2Z\\\5\6\4\2[]\7\25\2\2\\[\3"+
		"\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5(\25\2_a\7\25\2\2`_\3\2\2\2`a\3\2\2\2a"+
		"b\3\2\2\2bd\5\6\4\2ce\7\25\2\2dc\3\2\2\2de\3\2\2\2e\r\3\2\2\2fg\t\4\2"+
		"\2g\17\3\2\2\2hi\7\30\2\2ij\7\25\2\2jk\7\31\2\2kl\7\25\2\2lm\7\f\2\2m"+
		"n\7\25\2\2np\5\16\b\2oq\7\25\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\24"+
		"\2\2su\7\25\2\2ts\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vx\7\31\2\2wy\7\25\2\2"+
		"xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\f\2\2{}\7\25\2\2|{\3\2\2\2|}\3\2\2"+
		"\2}~\3\2\2\2~\u0080\5\16\b\2\177\u0081\7\25\2\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7\24\2\2\u0083\u0085\7"+
		"\25\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086"+
		"\u0088\5\16\b\2\u0087\u0089\7\25\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\5(\25\2\u008b\u008d\7\25\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\5\16"+
		"\b\2\u008f\u0091\7\25\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\25\3\2\2\2\u0092\u0094\7\5\2\2\u0093\u0095\7\25\2\2\u0094\u0093\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0099\5\f\7\2\u0097\u0099"+
		"\5\24\13\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009b\3\2\2\2"+
		"\u009a\u009c\7\25\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\7\6\2\2\u009e\u00a0\7\25\2\2\u009f\u009e\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3"+
		"\7\25\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a6\5$\23\2\u00a5\u00a7\7\25\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00aa"+
		"\7\4\2\2\u00a9\u00ab\7\25\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00af\t\5\2\2\u00ae\u00b0"+
		"\7\25\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b3\7\6\2\2\u00b2\u00b4\7\25\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\24\2\2\u00b6\u00b8\7\25\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00ba"+
		"\7\13\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bd\7\31\2\2\u00bc\u00be\7\25\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\7\24\2\2\u00c0\u00c2\7\25\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\35\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c6\7\t\2\2\u00c5\u00c7"+
		"\7\25\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00ca\7\24\2\2\u00c9\u00cb\7\25\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00ce\7\b\2\2\u00cd\u00cf\7\25\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\5\26"+
		"\f\2\u00d1\u00d3\7\25\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\5$\23\2\u00d5\u00d7\7\25\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00da\7\26\2\2\u00d9\u00db"+
		"\7\25\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00de\7\31\2\2\u00dd\u00df\7\25\2\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\7\24\2\2\u00e1\u00e3\7\25\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3#\3\2\2\2\u00e4\u00e6\7"+
		"\7\2\2\u00e5\u00e7\7\25\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00f6\3\2\2\2\u00e8\u00f5\5\"\22\2\u00e9\u00f5\5\34\17\2\u00ea\u00f5"+
		"\5\4\3\2\u00eb\u00f5\5\b\5\2\u00ec\u00f5\5\n\6\2\u00ed\u00f5\5\20\t\2"+
		"\u00ee\u00f5\5\22\n\2\u00ef\u00f5\5\30\r\2\u00f0\u00f5\5 \21\2\u00f1\u00f5"+
		"\5$\23\2\u00f2\u00f5\5\36\20\2\u00f3\u00f5\5\32\16\2\u00f4\u00e8\3\2\2"+
		"\2\u00f4\u00e9\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec"+
		"\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\7\n\2\2\u00fa\u00fc\7\2"+
		"\2\3\u00fb\u00e4\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00ff"+
		"\7\25\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0102\7\3\2\2\u0101\u0103\7\25\2\2\u0102\u0101\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\5$\23\2\u0105\'\3\2\2\2\u0106"+
		"\u0107\t\6\2\2\u0107)\3\2\2\2\61\60\64<@DHLPTX\\`dptx|\u0080\u0084\u0088"+
		"\u008c\u0090\u0094\u0098\u009b\u009f\u00a6\u00aa\u00af\u00b3\u00b7\u00bd"+
		"\u00c1\u00c6\u00ca\u00ce\u00d2\u00d6\u00da\u00de\u00e2\u00e6\u00f4\u00f6"+
		"\u00fb\u00fe\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}