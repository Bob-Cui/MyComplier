// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CBParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_statlist = 2, RULE_stat = 3, RULE_ifexpr = 4, 
		RULE_forexpr = 5, RULE_autocCacu = 6, RULE_funtions = 7, RULE_formals = 8, 
		RULE_formal = 9, RULE_expr = 10, RULE_listype = 11, RULE_numlist = 12, 
		RULE_mulexpr = 13, RULE_atom = 14, RULE_declare = 15, RULE_idlist = 16, 
		RULE_idlist2 = 17, RULE_typename = 18, RULE_jump_stat = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "statlist", "stat", "ifexpr", "forexpr", "autocCacu", 
			"funtions", "formals", "formal", "expr", "listype", "numlist", "mulexpr", 
			"atom", "declare", "idlist", "idlist2", "typename", "jump_stat"
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

	@Override
	public String getGrammarFileName() { return "CB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			statlist(0);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBBrac() { return getToken(CBParser.LBBrac, 0); }
		public TerminalNode RBBrac() { return getToken(CBParser.RBBrac, 0); }
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(LBBrac);
				setState(43);
				match(RBBrac);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(LBBrac);
				setState(45);
				statlist(0);
				setState(46);
				match(RBBrac);
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

	public static class StatlistContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitStatlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitStatlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatlistContext statlist() throws RecognitionException {
		return statlist(0);
	}

	private StatlistContext statlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatlistContext _localctx = new StatlistContext(_ctx, _parentState);
		StatlistContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_statlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			stat();
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statlist);
					setState(53);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(54);
					stat();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CBParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(CBParser.Semicolon, 0); }
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CBParser.ASSIGN, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CBParser.NUM, 0); }
		public NumlistContext numlist() {
			return getRuleContext(NumlistContext.class,0);
		}
		public ForexprContext forexpr() {
			return getRuleContext(ForexprContext.class,0);
		}
		public FuntionsContext funtions() {
			return getRuleContext(FuntionsContext.class,0);
		}
		public Jump_statContext jump_stat() {
			return getRuleContext(Jump_statContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				expr(0);
				setState(62);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(64);
					typename();
					}
					break;
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(67);
					match(T__0);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(ID);
				setState(74);
				match(ASSIGN);
				setState(75);
				expr(0);
				setState(76);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(NUM);
				setState(79);
				match(ASSIGN);
				setState(80);
				expr(0);
				setState(81);
				match(Semicolon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(83);
					typename();
					}
					break;
				}
				setState(86);
				match(ID);
				setState(87);
				numlist(0);
				setState(88);
				match(Semicolon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				forexpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				funtions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				jump_stat();
				setState(93);
				match(Semicolon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				declare();
				setState(96);
				match(Semicolon);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				ifexpr();
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

	public static class IfexprContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CBParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CBParser.IF, i);
		}
		public TerminalNode LBrac() { return getToken(CBParser.LBrac, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBrac() { return getToken(CBParser.RBrac, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(CBParser.Semicolon, 0); }
		public TerminalNode ELSE() { return getToken(CBParser.ELSE, 0); }
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterIfexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitIfexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifexpr);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(IF);
				setState(102);
				match(LBrac);
				setState(103);
				expr(0);
				setState(104);
				match(RBrac);
				setState(105);
				block();
				setState(106);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IF);
				setState(109);
				match(LBrac);
				setState(110);
				expr(0);
				setState(111);
				match(RBrac);
				setState(112);
				block();
				setState(113);
				match(ELSE);
				setState(114);
				match(IF);
				setState(115);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(IF);
				setState(118);
				match(LBrac);
				setState(119);
				expr(0);
				setState(120);
				match(RBrac);
				setState(121);
				block();
				setState(122);
				match(ELSE);
				setState(123);
				block();
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

	public static class ForexprContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CBParser.FOR, 0); }
		public TerminalNode LBrac() { return getToken(CBParser.LBrac, 0); }
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CBParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(CBParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(CBParser.Semicolon, i);
		}
		public AutocCacuContext autocCacu() {
			return getRuleContext(AutocCacuContext.class,0);
		}
		public TerminalNode RBrac() { return getToken(CBParser.RBrac, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public ForexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterForexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitForexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitForexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForexprContext forexpr() throws RecognitionException {
		ForexprContext _localctx = new ForexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forexpr);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(FOR);
				setState(128);
				match(LBrac);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(129);
					typename();
					}
					break;
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(ID);
				setState(139);
				match(ASSIGN);
				setState(140);
				expr(0);
				setState(141);
				match(Semicolon);
				setState(142);
				expr(0);
				setState(143);
				match(Semicolon);
				setState(144);
				autocCacu();
				setState(145);
				match(RBrac);
				setState(146);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(FOR);
				setState(149);
				match(LBrac);
				setState(150);
				match(RBrac);
				setState(151);
				block();
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

	public static class AutocCacuContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public AutocCacuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autocCacu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterAutocCacu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitAutocCacu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitAutocCacu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutocCacuContext autocCacu() throws RecognitionException {
		AutocCacuContext _localctx = new AutocCacuContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_autocCacu);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
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

	public static class FuntionsContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode LBrac() { return getToken(CBParser.LBrac, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public TerminalNode RBrac() { return getToken(CBParser.RBrac, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public TerminalNode MAIN() { return getToken(CBParser.MAIN, 0); }
		public FuntionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterFuntions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitFuntions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitFuntions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionsContext funtions() throws RecognitionException {
		FuntionsContext _localctx = new FuntionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funtions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			typename();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(161);
				match(T__0);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==MAIN || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(LBrac);
			setState(169);
			formals();
			setState(170);
			match(RBrac);
			setState(171);
			block();
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

	public static class FormalsContext extends ParserRuleContext {
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CBParser.COMMA, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitFormals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formals);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				formal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				formal();
				setState(176);
				match(COMMA);
				setState(177);
				formals();
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

	public static class FormalContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			typename();
			setState(182);
			match(ID);
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
		public List<MulexprContext> mulexpr() {
			return getRuleContexts(MulexprContext.class);
		}
		public MulexprContext mulexpr(int i) {
			return getRuleContext(MulexprContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(CBParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CBParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CBParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CBParser.SUB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(CBParser.LE, 0); }
		public TerminalNode GE() { return getToken(CBParser.GE, 0); }
		public TerminalNode GT() { return getToken(CBParser.GT, 0); }
		public TerminalNode LT() { return getToken(CBParser.LT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(185);
				mulexpr();
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						mulexpr();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(LE);
						setState(197);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(GE);
						setState(200);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(GT);
						setState(203);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						match(LT);
						setState(206);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ListypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public NumlistContext numlist() {
			return getRuleContext(NumlistContext.class,0);
		}
		public ListypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterListype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitListype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitListype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListypeContext listype() throws RecognitionException {
		ListypeContext _localctx = new ListypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			numlist(0);
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

	public static class NumlistContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(CBParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(CBParser.RSB, 0); }
		public TerminalNode NUM() { return getToken(CBParser.NUM, 0); }
		public NumlistContext numlist() {
			return getRuleContext(NumlistContext.class,0);
		}
		public NumlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterNumlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitNumlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitNumlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumlistContext numlist() throws RecognitionException {
		return numlist(0);
	}

	private NumlistContext numlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumlistContext _localctx = new NumlistContext(_ctx, _parentState);
		NumlistContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_numlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(216);
				match(LSB);
				setState(217);
				match(RSB);
				}
				break;
			case 2:
				{
				setState(218);
				match(LSB);
				setState(219);
				match(NUM);
				setState(220);
				match(RSB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_numlist);
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						{
						setState(224);
						match(LSB);
						setState(225);
						match(RSB);
						}
						}
						break;
					case 2:
						{
						{
						setState(226);
						match(LSB);
						setState(227);
						match(NUM);
						setState(228);
						match(RSB);
						}
						}
						break;
					}
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class MulexprContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(CBParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CBParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CBParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CBParser.DIV, i);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitMulexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitMulexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		MulexprContext _localctx = new MulexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mulexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			atom();
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(238);
					atom();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LBrac() { return getToken(CBParser.LBrac, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBrac() { return getToken(CBParser.RBrac, 0); }
		public ListypeContext listype() {
			return getRuleContext(ListypeContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CBParser.NUM, 0); }
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(LBrac);
				setState(245);
				expr(0);
				setState(246);
				match(RBrac);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				listype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(ID);
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

	public static class DeclareContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public NumlistContext numlist() {
			return getRuleContext(NumlistContext.class,0);
		}
		public IdlistContext idlist() {
			return getRuleContext(IdlistContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				typename();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(254);
					match(T__0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(ID);
				setState(261);
				numlist(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				typename();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(264);
					match(T__0);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				idlist();
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

	public static class IdlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public Idlist2Context idlist2() {
			return getRuleContext(Idlist2Context.class,0);
		}
		public IdlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterIdlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitIdlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitIdlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdlistContext idlist() throws RecognitionException {
		IdlistContext _localctx = new IdlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			setState(275);
			idlist2();
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

	public static class Idlist2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(CBParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(CBParser.ID, 0); }
		public Idlist2Context idlist2() {
			return getRuleContext(Idlist2Context.class,0);
		}
		public Idlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterIdlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitIdlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitIdlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idlist2Context idlist2() throws RecognitionException {
		Idlist2Context _localctx = new Idlist2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_idlist2);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(COMMA);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(279);
					match(T__0);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(ID);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(286);
					match(T__0);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				idlist2();
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

	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CBParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(CBParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CBParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CBParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(CBParser.LONG, 0); }
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typename);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case MAIN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(FLOAT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(LONG);
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

	public static class Jump_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CBParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CBParser.NUM, 0); }
		public Jump_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).enterJump_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CBListener ) ((CBListener)listener).exitJump_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CBVisitor ) return ((CBVisitor<? extends T>)visitor).visitJump_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statContext jump_stat() throws RecognitionException {
		Jump_statContext _localctx = new Jump_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jump_stat);
		int _la;
		try {
			int _alt;
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(RETURN);
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(T__0);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(312);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(RETURN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(RETURN);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(315);
					match(T__0);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return statlist_sempred((StatlistContext)_localctx, predIndex);
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return numlist_sempred((NumlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statlist_sempred(StatlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean numlist_sempred(NumlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0147\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5D\n\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\3\b\5\b\u00a1\n"+
		"\b\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7"+
		"\f\u00bf\n\f\f\f\16\f\u00c2\13\f\5\f\u00c4\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d2\n\f\f\f\16\f\u00d5\13\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e8\n\16\7\16\u00ea\n\16\f\16\16\16\u00ed\13\16\3\17\3\17"+
		"\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\7\21\u0102\n\21\f\21\16\21\u0105"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21"+
		"\3\21\3\21\5\21\u0113\n\21\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u011b\n"+
		"\23\f\23\16\23\u011e\13\23\3\23\3\23\7\23\u0122\n\23\f\23\16\23\u0125"+
		"\13\23\3\23\5\23\u0128\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0130\n"+
		"\24\3\25\3\25\3\25\3\25\7\25\u0136\n\25\f\25\16\25\u0139\13\25\3\25\3"+
		"\25\3\25\3\25\7\25\u013f\n\25\f\25\16\25\u0142\13\25\3\25\5\25\u0145\n"+
		"\25\3\25\2\5\6\26\32\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\5\4\2\61\61\67\67\3\2\20\21\3\2\16\17\2\u0167\2*\3\2\2\2\4\62\3\2\2\2"+
		"\6\64\3\2\2\2\be\3\2\2\2\n\177\3\2\2\2\f\u009a\3\2\2\2\16\u00a0\3\2\2"+
		"\2\20\u00a2\3\2\2\2\22\u00b5\3\2\2\2\24\u00b7\3\2\2\2\26\u00c3\3\2\2\2"+
		"\30\u00d6\3\2\2\2\32\u00df\3\2\2\2\34\u00ee\3\2\2\2\36\u00fd\3\2\2\2 "+
		"\u0112\3\2\2\2\"\u0114\3\2\2\2$\u0127\3\2\2\2&\u012f\3\2\2\2(\u0144\3"+
		"\2\2\2*+\5\6\4\2+\3\3\2\2\2,-\7 \2\2-\63\7!\2\2./\7 \2\2/\60\5\6\4\2\60"+
		"\61\7!\2\2\61\63\3\2\2\2\62,\3\2\2\2\62.\3\2\2\2\63\5\3\2\2\2\64\65\b"+
		"\4\1\2\65\66\5\b\5\2\66;\3\2\2\2\678\f\3\2\28:\5\b\5\29\67\3\2\2\2:=\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>f\7\b\2\2?@\5\26\f\2@"+
		"A\7\32\2\2Af\3\2\2\2BD\5&\24\2CB\3\2\2\2CD\3\2\2\2DH\3\2\2\2EG\7\3\2\2"+
		"FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\67\2"+
		"\2LM\7\22\2\2MN\5\26\f\2NO\7\32\2\2Of\3\2\2\2PQ\78\2\2QR\7\22\2\2RS\5"+
		"\26\f\2ST\7\32\2\2Tf\3\2\2\2UW\5&\24\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2X"+
		"Y\7\67\2\2YZ\5\32\16\2Z[\7\32\2\2[f\3\2\2\2\\f\5\f\7\2]f\5\20\t\2^_\5"+
		"(\25\2_`\7\32\2\2`f\3\2\2\2ab\5 \21\2bc\7\32\2\2cf\3\2\2\2df\5\n\6\2e"+
		">\3\2\2\2e?\3\2\2\2eC\3\2\2\2eP\3\2\2\2eV\3\2\2\2e\\\3\2\2\2e]\3\2\2\2"+
		"e^\3\2\2\2ea\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\7&\2\2hi\7\36\2\2ij\5\26\f"+
		"\2jk\7\37\2\2kl\5\4\3\2lm\7\32\2\2m\u0080\3\2\2\2no\7&\2\2op\7\36\2\2"+
		"pq\5\26\f\2qr\7\37\2\2rs\5\4\3\2st\7\'\2\2tu\7&\2\2uv\5\4\3\2v\u0080\3"+
		"\2\2\2wx\7&\2\2xy\7\36\2\2yz\5\26\f\2z{\7\37\2\2{|\5\4\3\2|}\7\'\2\2}"+
		"~\5\4\3\2~\u0080\3\2\2\2\177g\3\2\2\2\177n\3\2\2\2\177w\3\2\2\2\u0080"+
		"\13\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0084\7\36\2\2\u0083\u0085\5&\24"+
		"\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086\u0088"+
		"\7\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\67"+
		"\2\2\u008d\u008e\7\22\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\32\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\u0092\7\32\2\2\u0092\u0093\5\16\b\2\u0093\u0094"+
		"\7\37\2\2\u0094\u0095\5\4\3\2\u0095\u009b\3\2\2\2\u0096\u0097\7(\2\2\u0097"+
		"\u0098\7\36\2\2\u0098\u0099\7\37\2\2\u0099\u009b\5\4\3\2\u009a\u0081\3"+
		"\2\2\2\u009a\u0096\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\7\67\2\2\u009d"+
		"\u00a1\7\4\2\2\u009e\u009f\7\67\2\2\u009f\u00a1\7\5\2\2\u00a0\u009c\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a6\5&\24\2\u00a3"+
		"\u00a5\7\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\t\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7"+
		"\37\2\2\u00ad\u00ae\5\4\3\2\u00ae\21\3\2\2\2\u00af\u00b6\3\2\2\2\u00b0"+
		"\u00b6\5\24\13\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00b6\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2"+
		"\u00b5\u00b1\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8\5&\24\2\u00b8\u00b9"+
		"\7\67\2\2\u00b9\25\3\2\2\2\u00ba\u00c4\b\f\1\2\u00bb\u00c0\5\34\17\2\u00bc"+
		"\u00bd\t\3\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4\u00d3\3\2"+
		"\2\2\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00d2\5\26\f\7\u00c8"+
		"\u00c9\f\5\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00d2\5\26\f\6\u00cb\u00cc\f"+
		"\4\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00d2\5\26\f\5\u00ce\u00cf\f\3\2\2\u00cf"+
		"\u00d0\7\23\2\2\u00d0\u00d2\5\26\f\4\u00d1\u00c5\3\2\2\2\u00d1\u00c8\3"+
		"\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00d7\7\67\2\2\u00d7\u00d8\5\32\16\2\u00d8\31\3\2\2\2\u00d9\u00da"+
		"\b\16\1\2\u00da\u00db\7\"\2\2\u00db\u00e0\7#\2\2\u00dc\u00dd\7\"\2\2\u00dd"+
		"\u00de\78\2\2\u00de\u00e0\7#\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2"+
		"\2\u00e0\u00eb\3\2\2\2\u00e1\u00e7\f\3\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e8"+
		"\7#\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\78\2\2\u00e6\u00e8\7#\2\2\u00e7"+
		"\u00e2\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\33\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\5\36\20\2\u00ef\u00f0\t\4"+
		"\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\5\26\f\2\u00f8\u00f9\7\37\2\2\u00f9"+
		"\u00fe\3\2\2\2\u00fa\u00fe\5\30\r\2\u00fb\u00fe\78\2\2\u00fc\u00fe\7\67"+
		"\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\37\3\2\2\2\u00ff\u0103\5&\24\2\u0100\u0102\7\3\2"+
		"\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\67\2\2"+
		"\u0107\u0108\5\32\16\2\u0108\u0113\3\2\2\2\u0109\u010d\5&\24\2\u010a\u010c"+
		"\7\3\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5\""+
		"\22\2\u0111\u0113\3\2\2\2\u0112\u00ff\3\2\2\2\u0112\u0109\3\2\2\2\u0113"+
		"!\3\2\2\2\u0114\u0115\7\67\2\2\u0115\u0116\5$\23\2\u0116#\3\2\2\2\u0117"+
		"\u0128\3\2\2\2\u0118\u011c\7\35\2\2\u0119\u011b\7\3\2\2\u011a\u0119\3"+
		"\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7\67\2\2\u0120\u0122\7"+
		"\3\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\5$"+
		"\23\2\u0127\u0117\3\2\2\2\u0127\u0118\3\2\2\2\u0128%\3\2\2\2\u0129\u0130"+
		"\3\2\2\2\u012a\u0130\7$\2\2\u012b\u0130\7\63\2\2\u012c\u0130\7\62\2\2"+
		"\u012d\u0130\7\64\2\2\u012e\u0130\7\65\2\2\u012f\u0129\3\2\2\2\u012f\u012a"+
		"\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\'\3\2\2\2\u0131\u0145\7\6\2\2\u0132\u0145\7\7\2\2"+
		"\u0133\u0137\7\60\2\2\u0134\u0136\7\3\2\2\u0135\u0134\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u0145\5\26\f\2\u013b\u0145\7\60\2\2\u013c\u0140\7"+
		"\60\2\2\u013d\u013f\7\3\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0145\78\2\2\u0144\u0131\3\2\2\2\u0144\u0132\3\2\2\2\u0144"+
		"\u0133\3\2\2\2\u0144\u013b\3\2\2\2\u0144\u013c\3\2\2\2\u0145)\3\2\2\2"+
		"\"\62;CHVe\177\u0084\u0089\u009a\u00a0\u00a6\u00b5\u00c0\u00c3\u00d1\u00d3"+
		"\u00df\u00e7\u00eb\u00f3\u00fd\u0103\u010d\u0112\u011c\u0123\u0127\u012f"+
		"\u0137\u0140\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}