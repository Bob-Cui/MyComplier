package MyAntlr;// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, NOTHING=2, WS=3, COMMENT1=4, COMMENT2=5, PRE=6, MUL=7, DIV=8, 
		ADD=9, SUB=10, ASSIGN=11, LT=12, LE=13, GT=14, GE=15, Semicolon=16, Colon=17, 
		Point=18, COMMA=19, LBrac=20, RBrac=21, LBBrac=22, RBBrac=23, LSB=24, 
		RSB=25, STRUCT=26, IF=27, ELSE=28, FOR=29, WHILE=30, DO=31, SWITCH=32, 
		CASE=33, TRUE=34, FALSE=35, NEW=36, RETURN=37, INT=38, FLOAT=39, DOUBLE=40, 
		LONG=41, CHAR=42, ID=43, NUM=44, FLOAT_NUM=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "NOTHING", "WS", "COMMENT1", "COMMENT2", "PRE", "MUL", "DIV", 
			"ADD", "SUB", "ASSIGN", "LT", "LE", "GT", "GE", "Semicolon", "Colon", 
			"Point", "COMMA", "LBrac", "RBrac", "LBBrac", "RBBrac", "LSB", "RSB", 
			"STRUCT", "IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "TRUE", 
			"FALSE", "NEW", "RETURN", "INT", "FLOAT", "DOUBLE", "LONG", "CHAR", "ID", 
			"NUM", "FLOAT_NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", 
			"'='", "'<'", "'<='", "'>'", "'>='", "';'", "':'", "'.'", "','", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'struct'", "'if'", "'else'", "'for'", 
			"'while'", "'do'", "'switch'", "'case'", "'true'", "'false'", "'new'", 
			"'return'", "'int'", "'float'", "'double'", "'long'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "NOTHING", "WS", "COMMENT1", "COMMENT2", "PRE", "MUL", 
			"DIV", "ADD", "SUB", "ASSIGN", "LT", "LE", "GT", "GE", "Semicolon", "Colon", 
			"Point", "COMMA", "LBrac", "RBrac", "LBBrac", "RBBrac", "LSB", "RSB", 
			"STRUCT", "IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "TRUE", 
			"FALSE", "NEW", "RETURN", "INT", "FLOAT", "DOUBLE", "LONG", "CHAR", "ID", 
			"NUM", "FLOAT_NUM"
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


	public CBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CB.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\5\2_\n\2\3\2\3\2\3\2\3\2\3\3\6\3f\n\3\r\3\16\3g\3"+
		"\3\3\3\3\4\6\4m\n\4\r\4\16\4n\3\4\3\4\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16"+
		"\5z\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088"+
		"\13\6\3\6\3\6\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3,\6,\u0117\n,\r,\16,\u0118\3-\6-\u011c\n-\r-\16"+
		"-\u011d\3.\6.\u0121\n.\r.\16.\u0122\3.\3.\6.\u0127\n.\r.\16.\u0128\3."+
		"\3.\5.\u012d\n.\3.\6.\u0130\n.\r.\16.\u0131\3.\7.\u0135\n.\f.\16.\u0138"+
		"\13.\5x\u0086\u008f\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\4\2\13\f"+
		"\16\17\4\2C\\c|\3\2\62;\3\2gg\3\2//\3\2\63;\2\u0145\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\3^\3\2\2\2\5e\3\2\2\2\7l\3\2\2\2\tr\3\2\2\2\13"+
		"\u0080\3\2\2\2\r\u008b\3\2\2\2\17\u0094\3\2\2\2\21\u0096\3\2\2\2\23\u0098"+
		"\3\2\2\2\25\u009a\3\2\2\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3"+
		"\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!\u00a8\3\2\2\2#\u00aa\3\2\2\2"+
		"%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3"+
		"\2\2\2/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2"+
		"\2\67\u00c3\3\2\2\29\u00c6\3\2\2\2;\u00cb\3\2\2\2=\u00cf\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00d8\3\2\2\2C\u00df\3\2\2\2E\u00e4\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f3\3\2\2\2M\u00fa\3\2\2\2O\u00fe\3\2\2\2Q\u0104\3\2"+
		"\2\2S\u010b\3\2\2\2U\u0110\3\2\2\2W\u0116\3\2\2\2Y\u011b\3\2\2\2[\u0120"+
		"\3\2\2\2]_\7\17\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\f\2\2ab\3\2\2\2"+
		"bc\b\2\2\2c\4\3\2\2\2df\7\"\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ij\b\3\2\2j\6\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\b\4\2\2q\b\3\2\2\2rs\7\61\2\2st\7,\2\2tx\3"+
		"\2\2\2uw\13\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx"+
		"\3\2\2\2{|\7,\2\2|}\7\61\2\2}~\3\2\2\2~\177\b\5\3\2\177\n\3\2\2\2\u0080"+
		"\u0081\7\61\2\2\u0081\u0082\7\61\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13"+
		"\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\6"+
		"\3\2\u008a\f\3\2\2\2\u008b\u008f\7%\2\2\u008c\u008e\13\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\7\4\2\u0093\16\3\2\2"+
		"\2\u0094\u0095\7,\2\2\u0095\20\3\2\2\2\u0096\u0097\7\61\2\2\u0097\22\3"+
		"\2\2\2\u0098\u0099\7-\2\2\u0099\24\3\2\2\2\u009a\u009b\7/\2\2\u009b\26"+
		"\3\2\2\2\u009c\u009d\7?\2\2\u009d\30\3\2\2\2\u009e\u009f\7>\2\2\u009f"+
		"\32\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\34\3\2\2\2\u00a3"+
		"\u00a4\7@\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab"+
		"$\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad&\3\2\2\2\u00ae\u00af\7.\2\2\u00af"+
		"(\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3,"+
		"\3\2\2\2\u00b4\u00b5\7}\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7"+
		"\60\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7_\2\2\u00bb"+
		"\64\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\66\3\2\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c58\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca:\3\2\2\2\u00cb"+
		"\u00cc\7h\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce<\3\2\2\2\u00cf"+
		"\u00d0\7y\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2"+
		"\2\u00d7@\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7"+
		"k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7j\2\2\u00deB"+
		"\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7g\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7c\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2"+
		"\u00eeH\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7y\2"+
		"\2\u00f2J\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7"+
		"v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2\u00f9L"+
		"\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"N\3\2\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7v\2\2\u0103P\3\2\2\2\u0104\u0105\7f\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7w\2\2\u0107\u0108\7d\2\2\u0108\u0109\7n\2\2"+
		"\u0109\u010a\7g\2\2\u010aR\3\2\2\2\u010b\u010c\7n\2\2\u010c\u010d\7q\2"+
		"\2\u010d\u010e\7p\2\2\u010e\u010f\7i\2\2\u010fT\3\2\2\2\u0110\u0111\7"+
		"e\2\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2\2\u0114V"+
		"\3\2\2\2\u0115\u0117\t\3\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119X\3\2\2\2\u011a\u011c\t\4\2\2"+
		"\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011eZ\3\2\2\2\u011f\u0121\t\4\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\13\2\2\2\u0125\u0127\t\4\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\t\5\2\2\u012b\u012d\t\6\2\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\t\7\2\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0136\3\2\2\2\u0133\u0135\t\4\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\\\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\20\2^gnx\u0086\u008f\u0118\u011d\u0122\u0128\u012c\u0131\u0136"+
		"\5\b\2\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}