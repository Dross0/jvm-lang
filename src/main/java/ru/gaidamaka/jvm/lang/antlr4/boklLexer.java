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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		Less=10, LessEqual=11, Greater=12, GreaterEqual=13, NotEqual=14, Equal=15, 
		LE=16, WS=17, NL=18, GT=19, Goto=20, Int=21, String=22, Print=23, Var=24, 
		Num=25, StringValue=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "NotEqual", "Equal", "LE", 
		"WS", "NL", "GT", "Goto", "Int", "String", "Print", "Var", "Num", "StringValue", 
		"Esc", "StringSub"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\6\22n\n\22\r\22\16"+
		"\22o\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\7\31\u008e\n\31\f\31\16\31\u0091\13\31\3\32\5\32\u0094\n\32\3\32"+
		"\6\32\u0097\n\32\r\32\16\32\u0098\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\5\34\u00a3\n\34\3\35\3\35\7\35\u00a7\n\35\f\35\16\35\u00aa\13\35\3"+
		"\u00a8\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\29\2\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\u00af\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3;\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2"+
		"\tH\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2"+
		"\25Z\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2\37g\3\2"+
		"\2\2!j\3\2\2\2#m\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2\2+z\3\2\2\2-~\3"+
		"\2\2\2/\u0085\3\2\2\2\61\u008b\3\2\2\2\63\u0093\3\2\2\2\65\u009a\3\2\2"+
		"\2\67\u00a2\3\2\2\29\u00a8\3\2\2\2;<\7o\2\2<=\7c\2\2=>\7k\2\2>?\7p\2\2"+
		"?@\7H\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2C\4\3\2\2\2DE\7*\2\2E\6\3\2\2\2FG"+
		"\7+\2\2G\b\3\2\2\2HI\7}\2\2I\n\3\2\2\2JK\7y\2\2KL\7j\2\2LM\7k\2\2MN\7"+
		"n\2\2NO\7g\2\2O\f\3\2\2\2PQ\7-\2\2QR\7-\2\2R\16\3\2\2\2ST\7\177\2\2T\20"+
		"\3\2\2\2UV\7?\2\2V\22\3\2\2\2WX\7k\2\2XY\7h\2\2Y\24\3\2\2\2Z[\7>\2\2["+
		"\26\3\2\2\2\\]\7>\2\2]^\7?\2\2^\30\3\2\2\2_`\7@\2\2`\32\3\2\2\2ab\7@\2"+
		"\2bc\7?\2\2c\34\3\2\2\2de\7#\2\2ef\7?\2\2f\36\3\2\2\2gh\7?\2\2hi\7?\2"+
		"\2i \3\2\2\2jk\7=\2\2k\"\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p$\3\2\2\2qr\7\f\2\2r&\3\2\2\2st\7&\2\2t(\3\2\2\2uv\7i\2\2"+
		"vw\7q\2\2wx\7v\2\2xy\7q\2\2y*\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2},\3\2"+
		"\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2"+
		"\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084.\3\2\2\2\u0085\u0086\7"+
		"r\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7v\2\2\u008a\60\3\2\2\2\u008b\u008f\t\3\2\2\u008c\u008e\t\4\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\62\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7/\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\t\5\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\64\3\2\2\2\u009a\u009b\7$\2\2\u009b\u009c\59\35\2\u009c\u009d"+
		"\7$\2\2\u009d\66\3\2\2\2\u009e\u009f\7^\2\2\u009f\u00a3\7$\2\2\u00a0\u00a1"+
		"\7^\2\2\u00a1\u00a3\7^\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"8\3\2\2\2\u00a4\u00a7\5\67\34\2\u00a5\u00a7\13\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9:\3\2\2\2\u00aa\u00a8\3\2\2\2\n\2o\u008f\u0093\u0098\u00a2"+
		"\u00a6\u00a8\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}