// Generated from dev.dakoda.antlr/Choice.g4 by ANTLR 4.7
package dev.dakoda.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChoiceLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "WS", "TRUE", "FALSE", "ROOT_KEY", "HERE_KEY", "BOOLEAN_OPERATOR", 
		"THEN", "IF_PREFIX", "SWITCH_PREFIX", "SELECTOR_SUFFIX", "ELSE", "ROOT_START", 
		"BRANCH_START", "VAR_START", "NEST_START", "NEST_END", "INTEGER", "TEXT_CHARACTER_RESTRICTED", 
		"TEXT_CHARACTER", "STRING", "CHAR", "FLOAT", "WHITESPACE", "NEWLINE", 
		"STATEMENT_END", "EMPTY_STRING", "METHOD"
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


	public ChoiceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Choice.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u008a\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\7\35\u00bf\n\35\f\35\16\35\u00c2\13\35\5\35\u00c4"+
		"\n\35\3\36\3\36\5\36\u00c8\n\36\3\37\3\37\3\37\5\37\u00cd\n\37\3 \3 \3"+
		" \6 \u00d2\n \r \16 \u00d3\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u00dd\n\"\f\"\16"+
		"\"\u00e0\13\"\5\"\u00e2\n\"\3\"\3\"\3\"\7\"\u00e7\n\"\f\"\16\"\u00ea\13"+
		"\"\5\"\u00ec\n\"\3#\3#\3$\5$\u00f1\n$\3$\3$\5$\u00f5\n$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\6\'\u00fe\n\'\r\'\16\'\u00ff\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\t"+
		"\5\2\13\13\17\17\"\"\3\2\62;\3\2\63;\f\2\"#%\')\61<<>>@B^^``}\u0080\u00a5"+
		"\u00a5\3\2C|\3\2\62\62\4\2\13\13\"\"\2\u0113\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3"+
		"\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31"+
		"f\3\2\2\2\33j\3\2\2\2\35o\3\2\2\2\37u\3\2\2\2!z\3\2\2\2#\u0089\3\2\2\2"+
		"%\u008b\3\2\2\2\'\u0093\3\2\2\2)\u0098\3\2\2\2+\u00a1\3\2\2\2-\u00a5\3"+
		"\2\2\2/\u00ad\3\2\2\2\61\u00b0\3\2\2\2\63\u00b3\3\2\2\2\65\u00b6\3\2\2"+
		"\2\67\u00b8\3\2\2\29\u00c3\3\2\2\2;\u00c7\3\2\2\2=\u00cc\3\2\2\2?\u00ce"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00e1\3\2\2\2E\u00ed\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f6\3\2\2\2K\u00f8\3\2\2\2M\u00fb\3\2\2\2OP\7/\2\2P\4\3\2\2\2QR\7]"+
		"\2\2R\6\3\2\2\2ST\7_\2\2T\b\3\2\2\2UV\7.\2\2V\n\3\2\2\2WX\7\60\2\2X\f"+
		"\3\2\2\2YZ\7*\2\2Z\16\3\2\2\2[\\\7+\2\2\\\20\3\2\2\2]^\7#\2\2^_\7*\2\2"+
		"_\22\3\2\2\2`a\7\u0080\2\2a\24\3\2\2\2bc\7\177\2\2c\26\3\2\2\2de\7<\2"+
		"\2e\30\3\2\2\2fg\t\2\2\2gh\3\2\2\2hi\b\r\2\2i\32\3\2\2\2jk\7v\2\2kl\7"+
		"t\2\2lm\7w\2\2mn\7g\2\2n\34\3\2\2\2op\7h\2\2pq\7c\2\2qr\7n\2\2rs\7u\2"+
		"\2st\7g\2\2t\36\3\2\2\2uv\7t\2\2vw\7q\2\2wx\7q\2\2xy\7v\2\2y \3\2\2\2"+
		"z{\7j\2\2{|\7g\2\2|}\7t\2\2}~\7g\2\2~\"\3\2\2\2\177\u008a\7@\2\2\u0080"+
		"\u0081\7@\2\2\u0081\u008a\7?\2\2\u0082\u008a\7>\2\2\u0083\u0084\7>\2\2"+
		"\u0084\u008a\7?\2\2\u0085\u0086\7?\2\2\u0086\u008a\7?\2\2\u0087\u0088"+
		"\7#\2\2\u0088\u008a\7?\2\2\u0089\177\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a$\3\2\2\2\u008b\u008c\7/\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2\u0090\u0091\7/\2\2\u0091"+
		"\u0092\7@\2\2\u0092&\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7*\2\2\u0097(\3\2\2\2\u0098\u0099\7/\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7y\2\2\u009b\u009c\7k\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7*\2\2\u00a0*\3\2\2"+
		"\2\u00a1\u00a2\7+\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a4\7@\2\2\u00a4,\3\2"+
		"\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\7@\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7@\2\2\u00af\60\3\2\2\2\u00b0"+
		"\u00b1\7/\2\2\u00b1\u00b2\7@\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7\u0080"+
		"\2\2\u00b4\u00b5\7@\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7}\2\2\u00b7\66\3"+
		"\2\2\2\u00b8\u00b9\7\177\2\2\u00b9\u00ba\7=\2\2\u00ba8\3\2\2\2\u00bb\u00c4"+
		"\t\3\2\2\u00bc\u00c0\t\4\2\2\u00bd\u00bf\t\3\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c4"+
		":\3\2\2\2\u00c5\u00c8\5A!\2\u00c6\u00c8\59\35\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8<\3\2\2\2\u00c9\u00cd\5A!\2\u00ca\u00cd\59\35\2\u00cb"+
		"\u00cd\t\5\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd>\3\2\2\2\u00ce\u00d1\7$\2\2\u00cf\u00d2\5=\37\2\u00d0\u00d2"+
		"\7=\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7$"+
		"\2\2\u00d6@\3\2\2\2\u00d7\u00d8\t\6\2\2\u00d8B\3\2\2\2\u00d9\u00e2\t\7"+
		"\2\2\u00da\u00de\t\4\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2"+
		"\u00eb\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e8\59\35\2\u00e5\u00e7\t"+
		"\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ecD\3\2\2\2\u00ed\u00ee\t\b\2\2\u00eeF\3\2"+
		"\2\2\u00ef\u00f1\7\17\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f5\7\f\2\2\u00f3\u00f5\7\17\2\2\u00f4\u00f0\3"+
		"\2\2\2\u00f4\u00f3\3\2\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7=\2\2\u00f7J\3"+
		"\2\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\7$\2\2\u00faL\3\2\2\2\u00fb\u00fd"+
		"\7%\2\2\u00fc\u00fe\5;\36\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100N\3\2\2\2\21\2\u0089\u00c0\u00c3"+
		"\u00c7\u00cc\u00d1\u00d3\u00de\u00e1\u00e8\u00eb\u00f0\u00f4\u00ff\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}