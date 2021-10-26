package ru.gaidamaka.jvm.lang.antlr4;// Generated from bokl.g4 by ANTLR 4.3

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class boklLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Less=12, LessEqual=13, Greater=14, GreaterEqual=15, 
		NotEqual=16, Equal=17, LE=18, WS=19, GT=20, Int=21, String=22, Var=23, 
		Num=24, StringValue=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Less", "LessEqual", "Greater", "GreaterEqual", "NotEqual", 
		"Equal", "LE", "WS", "GT", "Int", "String", "Var", "Num", "StringValue"
	};


	public boklLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bokl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\6\24s\n\24\r\24\16\24t\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\7\30\u0086\n\30\f\30\16\30\u0089\13\30\3"+
		"\31\5\31\u008c\n\31\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\32\3\32\7"+
		"\32\u0095\n\32\f\32\16\32\u0098\13\32\3\32\3\32\3\u0096\2\33\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2\13\f\17\17\"\"\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\62;\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2"+
		"\2\2\5>\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17P\3\2\2"+
		"\2\21S\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33a\3"+
		"\2\2\2\35d\3\2\2\2\37f\3\2\2\2!i\3\2\2\2#l\3\2\2\2%o\3\2\2\2\'r\3\2\2"+
		"\2)v\3\2\2\2+x\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61\u008b\3\2\2\2\63\u0092"+
		"\3\2\2\2\65\66\7o\2\2\66\67\7c\2\2\678\7k\2\289\7p\2\29:\7H\2\2:;\7w\2"+
		"\2;<\7p\2\2<=\7e\2\2=\4\3\2\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2BC"+
		"\7v\2\2C\6\3\2\2\2DE\7*\2\2E\b\3\2\2\2FG\7+\2\2G\n\3\2\2\2HI\7}\2\2I\f"+
		"\3\2\2\2JK\7y\2\2KL\7j\2\2LM\7k\2\2MN\7n\2\2NO\7g\2\2O\16\3\2\2\2PQ\7"+
		"-\2\2QR\7-\2\2R\20\3\2\2\2ST\7\177\2\2T\22\3\2\2\2UV\7i\2\2VW\7q\2\2W"+
		"X\7v\2\2XY\7q\2\2Y\24\3\2\2\2Z[\7?\2\2[\26\3\2\2\2\\]\7k\2\2]^\7h\2\2"+
		"^\30\3\2\2\2_`\7>\2\2`\32\3\2\2\2ab\7>\2\2bc\7?\2\2c\34\3\2\2\2de\7@\2"+
		"\2e\36\3\2\2\2fg\7@\2\2gh\7?\2\2h \3\2\2\2ij\7#\2\2jk\7?\2\2k\"\3\2\2"+
		"\2lm\7?\2\2mn\7?\2\2n$\3\2\2\2op\7=\2\2p&\3\2\2\2qs\t\2\2\2rq\3\2\2\2"+
		"st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vw\7&\2\2w*\3\2\2\2xy\7k\2\2y"+
		"z\7p\2\2z{\7v\2\2{,\3\2\2\2|}\7u\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7"+
		"k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7i\2\2\u0082.\3\2\2\2\u0083\u0087"+
		"\t\3\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\60\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008c\7/\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\62\3\2\2\2\u0092\u0096\7$\2\2"+
		"\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7$\2\2\u009a\64\3\2\2\2\b\2t\u0087\u008b\u0090\u0096\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}