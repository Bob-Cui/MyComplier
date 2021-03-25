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
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(LBBrac);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(43);
					match(T__0);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(RBBrac);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(LBBrac);
				setState(51);
				statlist(0);
				setState(52);
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
			setState(57);
			stat();
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statlist);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					stat();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expr(0);
				setState(67);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(69);
					typename();
					}
					break;
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(72);
					match(T__0);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(ID);
				setState(79);
				match(ASSIGN);
				setState(80);
				expr(0);
				setState(81);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(NUM);
				setState(84);
				match(ASSIGN);
				setState(85);
				expr(0);
				setState(86);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(88);
					typename();
					}
					break;
				}
				setState(91);
				match(ID);
				setState(92);
				numlist(0);
				setState(93);
				match(Semicolon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				forexpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				funtions();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				jump_stat();
				setState(98);
				match(Semicolon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				declare();
				setState(101);
				match(Semicolon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
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
		public TerminalNode ELSE() { return getToken(CBParser.ELSE, 0); }
		public List<TerminalNode> WS() { return getTokens(CBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CBParser.WS, i);
		}
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
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(IF);
				setState(107);
				match(LBrac);
				setState(108);
				expr(0);
				setState(109);
				match(RBrac);
				setState(110);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IF);
				setState(113);
				match(LBrac);
				setState(114);
				expr(0);
				setState(115);
				match(RBrac);
				setState(116);
				block();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(117);
					match(WS);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(123);
					match(T__0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(ELSE);
				setState(130);
				match(IF);
				setState(131);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(IF);
				setState(134);
				match(LBrac);
				setState(135);
				expr(0);
				setState(136);
				match(RBrac);
				setState(137);
				block();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(138);
					match(WS);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(144);
					match(T__0);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(ELSE);
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
		public TerminalNode WHILE() { return getToken(CBParser.WHILE, 0); }
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
			int _alt;
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(FOR);
				setState(156);
				match(LBrac);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(157);
					typename();
					}
					break;
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(160);
					match(T__0);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(ID);
				setState(167);
				match(ASSIGN);
				setState(168);
				expr(0);
				setState(169);
				match(Semicolon);
				setState(170);
				expr(0);
				setState(171);
				match(Semicolon);
				setState(172);
				autocCacu();
				setState(173);
				match(RBrac);
				setState(174);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(FOR);
				setState(177);
				match(LBrac);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(178);
					match(T__0);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(RBrac);
				setState(185);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(WHILE);
				setState(187);
				match(LBrac);
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						match(T__0);
						}
						} 
					}
					setState(193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(194);
				expr(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(195);
					match(T__0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(RBrac);
				setState(202);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ID);
				setState(209);
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
			setState(212);
			typename();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(213);
				match(T__0);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==MAIN || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			match(LBrac);
			setState(221);
			formals();
			setState(222);
			match(RBrac);
			setState(223);
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
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(225);
					match(T__0);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				formal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				formal();
				setState(233);
				match(COMMA);
				setState(234);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			typename();
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				match(T__0);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(244);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(247);
				mulexpr();
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						mulexpr();
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(258);
						match(LE);
						setState(259);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(GE);
						setState(262);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(GT);
						setState(265);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(267);
						match(LT);
						setState(268);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(274);
			match(ID);
			setState(275);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(278);
				match(LSB);
				setState(279);
				match(RSB);
				}
				break;
			case 2:
				{
				setState(280);
				match(LSB);
				setState(281);
				match(NUM);
				setState(282);
				match(RSB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NumlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_numlist);
					setState(285);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						{
						setState(286);
						match(LSB);
						setState(287);
						match(RSB);
						}
						}
						break;
					case 2:
						{
						{
						setState(288);
						match(LSB);
						setState(289);
						match(NUM);
						setState(290);
						match(RSB);
						}
						}
						break;
					}
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(298);
			atom();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(300);
					atom();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(LBrac);
				setState(307);
				expr(0);
				setState(308);
				match(RBrac);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				listype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				typename();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(316);
					match(T__0);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(ID);
				setState(323);
				numlist(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				typename();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(326);
					match(T__0);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
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
			setState(336);
			match(ID);
			setState(337);
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
			setState(355);
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
				setState(340);
				match(COMMA);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(341);
					match(T__0);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				match(ID);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(348);
					match(T__0);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
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
			setState(363);
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
				setState(358);
				match(VOID);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(FLOAT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(DOUBLE);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
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
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(RETURN);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						match(T__0);
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(374);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				match(RETURN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				match(RETURN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(377);
					match(T__0);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4"+
		"C\13\4\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\7\6\177\n\6\f\6\16\6\u0082"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091"+
		"\13\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\6\5\6\u009c\n\6"+
		"\3\7\3\7\3\7\5\7\u00a1\n\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b6\n\7\f\7\16\7"+
		"\u00b9\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c0\n\7\f\7\16\7\u00c3\13\7\3\7"+
		"\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\3\7\3\7\5\7\u00cf\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\u00d5\n\b\3\t\3\t\7\t\u00d9\n\t\f\t\16\t\u00dc\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\7\n\u00e5\n\n\f\n\16\n\u00e8\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ef\n\n\3\13\3\13\6\13\u00f3\n\13\r\13\16\13\u00f4\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f\u0100\13\f\5\f\u0102\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0110\n\f\f\f\16"+
		"\f\u0113\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0126\n\16\7\16\u0128\n\16\f\16\16"+
		"\16\u012b\13\16\3\17\3\17\3\17\7\17\u0130\n\17\f\17\16\17\u0133\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013c\n\20\3\21\3\21\7\21\u0140"+
		"\n\21\f\21\16\21\u0143\13\21\3\21\3\21\3\21\3\21\3\21\7\21\u014a\n\21"+
		"\f\21\16\21\u014d\13\21\3\21\3\21\5\21\u0151\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u0159\n\23\f\23\16\23\u015c\13\23\3\23\3\23\7\23\u0160"+
		"\n\23\f\23\16\23\u0163\13\23\3\23\5\23\u0166\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u016e\n\24\3\25\3\25\3\25\3\25\7\25\u0174\n\25\f\25\16"+
		"\25\u0177\13\25\3\25\3\25\3\25\3\25\7\25\u017d\n\25\f\25\16\25\u0180\13"+
		"\25\3\25\5\25\u0183\n\25\3\25\2\5\6\26\32\26\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(\2\5\4\2\61\61\67\67\3\2\20\21\3\2\16\17\2\u01af\2*"+
		"\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\bj\3\2\2\2\n\u009b\3\2\2\2\f\u00ce\3\2"+
		"\2\2\16\u00d4\3\2\2\2\20\u00d6\3\2\2\2\22\u00ee\3\2\2\2\24\u00f0\3\2\2"+
		"\2\26\u0101\3\2\2\2\30\u0114\3\2\2\2\32\u011d\3\2\2\2\34\u012c\3\2\2\2"+
		"\36\u013b\3\2\2\2 \u0150\3\2\2\2\"\u0152\3\2\2\2$\u0165\3\2\2\2&\u016d"+
		"\3\2\2\2(\u0182\3\2\2\2*+\5\6\4\2+\3\3\2\2\2,\60\7 \2\2-/\7\3\2\2.-\3"+
		"\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2"+
		"\2\639\7!\2\2\64\65\7 \2\2\65\66\5\6\4\2\66\67\7!\2\2\679\3\2\2\28,\3"+
		"\2\2\28\64\3\2\2\29\5\3\2\2\2:;\b\4\1\2;<\5\b\5\2<A\3\2\2\2=>\f\3\2\2"+
		">@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2"+
		"\2DE\5\26\f\2EF\7\32\2\2Fk\3\2\2\2GI\5&\24\2HG\3\2\2\2HI\3\2\2\2IM\3\2"+
		"\2\2JL\7\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2"+
		"\2\2PQ\7\67\2\2QR\7\22\2\2RS\5\26\f\2ST\7\32\2\2Tk\3\2\2\2UV\78\2\2VW"+
		"\7\22\2\2WX\5\26\f\2XY\7\32\2\2Yk\3\2\2\2Z\\\5&\24\2[Z\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]^\7\67\2\2^_\5\32\16\2_`\7\32\2\2`k\3\2\2\2ak\5\f\7\2"+
		"bk\5\20\t\2cd\5(\25\2de\7\32\2\2ek\3\2\2\2fg\5 \21\2gh\7\32\2\2hk\3\2"+
		"\2\2ik\5\n\6\2jD\3\2\2\2jH\3\2\2\2jU\3\2\2\2j[\3\2\2\2ja\3\2\2\2jb\3\2"+
		"\2\2jc\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\7&\2\2mn\7\36\2\2no\5"+
		"\26\f\2op\7\37\2\2pq\5\4\3\2q\u009c\3\2\2\2rs\7&\2\2st\7\36\2\2tu\5\26"+
		"\f\2uv\7\37\2\2vz\5\4\3\2wy\7\n\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\u0080\3\2\2\2|z\3\2\2\2}\177\7\3\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7&\2\2\u0085\u0086\5\4\3\2\u0086"+
		"\u009c\3\2\2\2\u0087\u0088\7&\2\2\u0088\u0089\7\36\2\2\u0089\u008a\5\26"+
		"\f\2\u008a\u008b\7\37\2\2\u008b\u008f\5\4\3\2\u008c\u008e\7\n\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0095\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\3\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\'\2\2\u0099"+
		"\u009a\5\4\3\2\u009a\u009c\3\2\2\2\u009bl\3\2\2\2\u009br\3\2\2\2\u009b"+
		"\u0087\3\2\2\2\u009c\13\3\2\2\2\u009d\u009e\7(\2\2\u009e\u00a0\7\36\2"+
		"\2\u009f\u00a1\5&\24\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5"+
		"\3\2\2\2\u00a2\u00a4\7\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5\26\f\2\u00ab"+
		"\u00ac\7\32\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\32\2\2\u00ae\u00af"+
		"\5\16\b\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00cf\3\2\2\2"+
		"\u00b2\u00b3\7(\2\2\u00b3\u00b7\7\36\2\2\u00b4\u00b6\7\3\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00cf\5"+
		"\4\3\2\u00bc\u00bd\7)\2\2\u00bd\u00c1\7\36\2\2\u00be\u00c0\7\3\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\5\26\f\2\u00c5"+
		"\u00c7\7\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7\37\2\2\u00cc\u00cd\5\4\3\2\u00cd\u00cf\3\2\2\2\u00ce\u009d\3"+
		"\2\2\2\u00ce\u00b2\3\2\2\2\u00ce\u00bc\3\2\2\2\u00cf\r\3\2\2\2\u00d0\u00d1"+
		"\7\67\2\2\u00d1\u00d5\7\4\2\2\u00d2\u00d3\7\67\2\2\u00d3\u00d5\7\5\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\17\3\2\2\2\u00d6\u00da"+
		"\5&\24\2\u00d7\u00d9\7\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\t\2\2\2\u00de\u00df\7\36\2\2\u00df\u00e0\5\22\n\2\u00e0"+
		"\u00e1\7\37\2\2\u00e1\u00e2\5\4\3\2\u00e2\21\3\2\2\2\u00e3\u00e5\7\3\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00ef\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ef\5\24\13\2"+
		"\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\5\22\n\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2"+
		"\2\2\u00ef\23\3\2\2\2\u00f0\u00f2\5&\24\2\u00f1\u00f3\7\3\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\7\67\2\2\u00f7\25\3\2\2\2\u00f8\u0102\b\f\1"+
		"\2\u00f9\u00fe\5\34\17\2\u00fa\u00fb\t\3\2\2\u00fb\u00fd\5\34\17\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00f9\3\2\2\2\u0102\u0111\3\2\2\2\u0103\u0104\f\6\2\2\u0104\u0105\7\24"+
		"\2\2\u0105\u0110\5\26\f\7\u0106\u0107\f\5\2\2\u0107\u0108\7\26\2\2\u0108"+
		"\u0110\5\26\f\6\u0109\u010a\f\4\2\2\u010a\u010b\7\25\2\2\u010b\u0110\5"+
		"\26\f\5\u010c\u010d\f\3\2\2\u010d\u010e\7\23\2\2\u010e\u0110\5\26\f\4"+
		"\u010f\u0103\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\27\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\67\2\2\u0115\u0116\5\32"+
		"\16\2\u0116\31\3\2\2\2\u0117\u0118\b\16\1\2\u0118\u0119\7\"\2\2\u0119"+
		"\u011e\7#\2\2\u011a\u011b\7\"\2\2\u011b\u011c\78\2\2\u011c\u011e\7#\2"+
		"\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0129\3\2\2\2\u011f\u0125"+
		"\f\3\2\2\u0120\u0121\7\"\2\2\u0121\u0126\7#\2\2\u0122\u0123\7\"\2\2\u0123"+
		"\u0124\78\2\2\u0124\u0126\7#\2\2\u0125\u0120\3\2\2\2\u0125\u0122\3\2\2"+
		"\2\u0126\u0128\3\2\2\2\u0127\u011f\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\33\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u0131\5\36\20\2\u012d\u012e\t\4\2\2\u012e\u0130\5\36\20\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\35\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\36\2\2\u0135\u0136\5\26"+
		"\f\2\u0136\u0137\7\37\2\2\u0137\u013c\3\2\2\2\u0138\u013c\5\30\r\2\u0139"+
		"\u013c\78\2\2\u013a\u013c\7\67\2\2\u013b\u0134\3\2\2\2\u013b\u0138\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\37\3\2\2\2\u013d\u0141"+
		"\5&\24\2\u013e\u0140\7\3\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0145\7\67\2\2\u0145\u0146\5\32\16\2\u0146\u0151\3\2\2\2\u0147"+
		"\u014b\5&\24\2\u0148\u014a\7\3\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\5\"\22\2\u014f\u0151\3\2\2\2\u0150\u013d\3"+
		"\2\2\2\u0150\u0147\3\2\2\2\u0151!\3\2\2\2\u0152\u0153\7\67\2\2\u0153\u0154"+
		"\5$\23\2\u0154#\3\2\2\2\u0155\u0166\3\2\2\2\u0156\u015a\7\35\2\2\u0157"+
		"\u0159\7\3\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0161\7\67\2\2\u015e\u0160\7\3\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0166\5$\23\2\u0165\u0155\3\2\2\2\u0165\u0156\3\2"+
		"\2\2\u0166%\3\2\2\2\u0167\u016e\3\2\2\2\u0168\u016e\7$\2\2\u0169\u016e"+
		"\7\63\2\2\u016a\u016e\7\62\2\2\u016b\u016e\7\64\2\2\u016c\u016e\7\65\2"+
		"\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\'\3\2\2\2\u016f"+
		"\u0183\7\6\2\2\u0170\u0183\7\7\2\2\u0171\u0175\7\60\2\2\u0172\u0174\7"+
		"\3\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0183\5\26"+
		"\f\2\u0179\u0183\7\60\2\2\u017a\u017e\7\60\2\2\u017b\u017d\7\3\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\78\2\2\u0182"+
		"\u016f\3\2\2\2\u0182\u0170\3\2\2\2\u0182\u0171\3\2\2\2\u0182\u0179\3\2"+
		"\2\2\u0182\u017a\3\2\2\2\u0183)\3\2\2\2,\608AHM[jz\u0080\u008f\u0095\u009b"+
		"\u00a0\u00a5\u00b7\u00c1\u00c8\u00ce\u00d4\u00da\u00e6\u00ee\u00f4\u00fe"+
		"\u0101\u010f\u0111\u011d\u0125\u0129\u0131\u013b\u0141\u014b\u0150\u015a"+
		"\u0161\u0165\u016d\u0175\u017e\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}