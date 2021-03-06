package MyAntlr;// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NEWLINE=6, NOTHING=7, WS=8, COMMENT1=9, 
		COMMENT2=10, PRE=11, MUL=12, DIV=13, ADD=14, SUB=15, ASSIGN=16, LT=17, 
		LE=18, GT=19, GE=20, AND=21, OR=22, XOR=23, Semicolon=24, Colon=25, Point=26, 
		COMMA=27, LBrac=28, RBrac=29, LBBrac=30, RBBrac=31, LSB=32, RSB=33, VOID=34, 
		STRUCT=35, IF=36, ELSE=37, FOR=38, WHILE=39, DO=40, SWITCH=41, CASE=42, 
		TRUE=43, FALSE=44, NEW=45, RETURN=46, MAIN=47, INT=48, FLOAT=49, DOUBLE=50, 
		LONG=51, CHAR=52, ID=53, NUM=54, REAL_NUM=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NEWLINE", "NOTHING", "WS", "COMMENT1", 
			"COMMENT2", "PRE", "MUL", "DIV", "ADD", "SUB", "ASSIGN", "LT", "LE", 
			"GT", "GE", "AND", "OR", "XOR", "Semicolon", "Colon", "Point", "COMMA", 
			"LBrac", "RBrac", "LBBrac", "RBBrac", "LSB", "RSB", "VOID", "STRUCT", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "TRUE", "FALSE", 
			"NEW", "RETURN", "MAIN", "INT", "FLOAT", "DOUBLE", "LONG", "CHAR", "ID", 
			"NUM", "REAL_NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'++'", "'--'", "'continue'", "'break'", null, null, null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'", "'='", "'<'", "'<='", "'>'", 
			"'>='", "'&&'", "'||'", "'^'", "';'", "':'", "'.'", "','", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'void'", "'struct'", "'if'", "'else'", "'for'", 
			"'while'", "'do'", "'switch'", "'case'", "'true'", "'false'", "'new'", 
			"'return'", "'main'", "'int'", "'float'", "'double'", "'long'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NEWLINE", "NOTHING", "WS", "COMMENT1", 
			"COMMENT2", "PRE", "MUL", "DIV", "ADD", "SUB", "ASSIGN", "LT", "LE", 
			"GT", "GE", "AND", "OR", "XOR", "Semicolon", "Colon", "Point", "COMMA", 
			"LBrac", "RBrac", "LBBrac", "RBBrac", "LSB", "RSB", "VOID", "STRUCT", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "TRUE", "FALSE", 
			"NEW", "RETURN", "MAIN", "INT", "FLOAT", "DOUBLE", "LONG", "CHAR", "ID", 
			"NUM", "REAL_NUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7"+
		"\u008a\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\t\u0095\n\t\r\t\16\t"+
		"\u0096\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u00b8\n\f\f\f\16\f\u00bb\13\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u0156"+
		"\n\66\f\66\16\66\u0159\13\66\3\67\6\67\u015c\n\67\r\67\16\67\u015d\38"+
		"\38\38\38\5\u00a0\u00ae\u00b9\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\6\4\2\13\f\16\17\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\2\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\t"+
		"y\3\2\2\2\13\u0082\3\2\2\2\r\u0089\3\2\2\2\17\u008f\3\2\2\2\21\u0094\3"+
		"\2\2\2\23\u009a\3\2\2\2\25\u00a8\3\2\2\2\27\u00b5\3\2\2\2\31\u00c0\3\2"+
		"\2\2\33\u00c2\3\2\2\2\35\u00c4\3\2\2\2\37\u00c6\3\2\2\2!\u00c8\3\2\2\2"+
		"#\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d4\3"+
		"\2\2\2-\u00d7\3\2\2\2/\u00da\3\2\2\2\61\u00dc\3\2\2\2\63\u00de\3\2\2\2"+
		"\65\u00e0\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e6\3\2\2\2=\u00e8"+
		"\3\2\2\2?\u00ea\3\2\2\2A\u00ec\3\2\2\2C\u00ee\3\2\2\2E\u00f0\3\2\2\2G"+
		"\u00f5\3\2\2\2I\u00fc\3\2\2\2K\u00ff\3\2\2\2M\u0104\3\2\2\2O\u0108\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0111\3\2\2\2U\u0118\3\2\2\2W\u011d\3\2\2\2Y\u0122"+
		"\3\2\2\2[\u0128\3\2\2\2]\u012c\3\2\2\2_\u0133\3\2\2\2a\u0138\3\2\2\2c"+
		"\u013c\3\2\2\2e\u0142\3\2\2\2g\u0149\3\2\2\2i\u014e\3\2\2\2k\u0153\3\2"+
		"\2\2m\u015b\3\2\2\2o\u015f\3\2\2\2qr\7\"\2\2r\4\3\2\2\2st\7-\2\2tu\7-"+
		"\2\2u\6\3\2\2\2vw\7/\2\2wx\7/\2\2x\b\3\2\2\2yz\7e\2\2z{\7q\2\2{|\7p\2"+
		"\2|}\7v\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7w\2\2\u0080\u0081\7g\2\2\u0081"+
		"\n\3\2\2\2\u0082\u0083\7d\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7m\2\2\u0087\f\3\2\2\2\u0088\u008a\7\17\2\2"+
		"\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7\f\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\7\2\2\u008e\16\3\2\2\2\u008f"+
		"\u0090\7\"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\b\2\2\u0092\20\3\2\2"+
		"\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\t\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2\u009c\u00a0\3\2\2"+
		"\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\n\3\2\u00a7\24\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\b\13\3\2\u00b4\26\3\2\2\2\u00b5\u00b9\7%\2\2\u00b6\u00b8\13\2\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\b\f\4\2\u00bf\30\3\2\2\2\u00c0\u00c1\7,\2\2"+
		"\u00c1\32\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7"+
		"-\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7"+
		"?\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7"+
		">\2\2\u00cd\u00ce\7?\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0(\3\2"+
		"\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7?\2\2\u00d3*\3\2\2\2\u00d4\u00d5"+
		"\7(\2\2\u00d5\u00d6\7(\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9"+
		"\7~\2\2\u00d9.\3\2\2\2\u00da\u00db\7`\2\2\u00db\60\3\2\2\2\u00dc\u00dd"+
		"\7=\2\2\u00dd\62\3\2\2\2\u00de\u00df\7<\2\2\u00df\64\3\2\2\2\u00e0\u00e1"+
		"\7\60\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7.\2\2\u00e38\3\2\2\2\u00e4\u00e5"+
		"\7*\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7"+
		"}\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7\177\2\2\u00eb@\3\2\2\2\u00ec\u00ed"+
		"\7]\2\2\u00edB\3\2\2\2\u00ee\u00ef\7_\2\2\u00efD\3\2\2\2\u00f0\u00f1\7"+
		"x\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7f\2\2\u00f4F"+
		"\3\2\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7v\2\2\u00fbH\3\2\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7h\2\2\u00feJ\3\2\2\2\u00ff\u0100\7g\2\2\u0100"+
		"\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103L\3\2\2\2\u0104"+
		"\u0105\7h\2\2\u0105\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107N\3\2\2\2\u0108"+
		"\u0109\7y\2\2\u0109\u010a\7j\2\2\u010a\u010b\7k\2\2\u010b\u010c\7n\2\2"+
		"\u010c\u010d\7g\2\2\u010dP\3\2\2\2\u010e\u010f\7f\2\2\u010f\u0110\7q\2"+
		"\2\u0110R\3\2\2\2\u0111\u0112\7u\2\2\u0112\u0113\7y\2\2\u0113\u0114\7"+
		"k\2\2\u0114\u0115\7v\2\2\u0115\u0116\7e\2\2\u0116\u0117\7j\2\2\u0117T"+
		"\3\2\2\2\u0118\u0119\7e\2\2\u0119\u011a\7c\2\2\u011a\u011b\7u\2\2\u011b"+
		"\u011c\7g\2\2\u011cV\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f"+
		"\u0120\7w\2\2\u0120\u0121\7g\2\2\u0121X\3\2\2\2\u0122\u0123\7h\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2"+
		"\u0127Z\3\2\2\2\u0128\u0129\7p\2\2\u0129\u012a\7g\2\2\u012a\u012b\7y\2"+
		"\2\u012b\\\3\2\2\2\u012c\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7"+
		"v\2\2\u012f\u0130\7w\2\2\u0130\u0131\7t\2\2\u0131\u0132\7p\2\2\u0132^"+
		"\3\2\2\2\u0133\u0134\7o\2\2\u0134\u0135\7c\2\2\u0135\u0136\7k\2\2\u0136"+
		"\u0137\7p\2\2\u0137`\3\2\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7v\2\2\u013bb\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e\7n\2\2\u013e"+
		"\u013f\7q\2\2\u013f\u0140\7c\2\2\u0140\u0141\7v\2\2\u0141d\3\2\2\2\u0142"+
		"\u0143\7f\2\2\u0143\u0144\7q\2\2\u0144\u0145\7w\2\2\u0145\u0146\7d\2\2"+
		"\u0146\u0147\7n\2\2\u0147\u0148\7g\2\2\u0148f\3\2\2\2\u0149\u014a\7n\2"+
		"\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2\u014c\u014d\7i\2\2\u014dh\3\2"+
		"\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2\u0150\u0151\7c\2\2\u0151\u0152"+
		"\7t\2\2\u0152j\3\2\2\2\u0153\u0157\t\3\2\2\u0154\u0156\t\4\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"l\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\t\5\2\2\u015b\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015en\3"+
		"\2\2\2\u015f\u0160\5m\67\2\u0160\u0161\5\65\33\2\u0161\u0162\5m\67\2\u0162"+
		"p\3\2\2\2\n\2\u0089\u0096\u00a0\u00ae\u00b9\u0157\u015d\5\b\2\2\2\4\2"+
		"\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}