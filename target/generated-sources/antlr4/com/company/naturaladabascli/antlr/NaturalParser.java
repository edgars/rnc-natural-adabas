// Generated from com/company/naturaladabascli/antlr/NaturalParser.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NaturalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NL=2, LINE_COMMENT=3, END_FIND=4, END_IF=5, END_DEFINE=6, END_DECIDE=7, 
		END_TRANSACTION=8, BACKOUT_TRANSACTION=9, DEFINE=10, DATA=11, LOCAL=12, 
		GLOBAL=13, PARAMETER=14, VIEW=15, OF=16, FIND=17, READ=18, GET=19, HISTOGRAM=20, 
		WITH=21, STORE=22, UPDATE=23, DELETE=24, CALLNAT=25, PERFORM=26, INCLUDE=27, 
		IF=28, ELSE=29, DECIDE=30, COMPUTE=31, MOVE=32, ASSIGN=33, REINPUT=34, 
		INPUT=35, WRITE=36, DISPLAY=37, ON=38, VALUE=39, ESCAPE=40, END=41, STAR=42, 
		COMMA=43, DOT=44, COLON=45, LPAREN=46, RPAREN=47, EQ=48, STRING=49, INT=50, 
		ID=51, OTHER=52;
	public static final int
		RULE_program = 0, RULE_programElement = 1, RULE_defineData = 2, RULE_dataLine = 3, 
		RULE_defineLine = 4, RULE_typeSpec = 5, RULE_findStatement = 6, RULE_readLikeStatement = 7, 
		RULE_histogramStatement = 8, RULE_storeStatement = 9, RULE_updateStatement = 10, 
		RULE_deleteStatement = 11, RULE_endTransactionStatement = 12, RULE_backoutTransactionStatement = 13, 
		RULE_callnatStatement = 14, RULE_callArgList = 15, RULE_performStatement = 16, 
		RULE_includeStatement = 17, RULE_computeStatement = 18, RULE_moveStatement = 19, 
		RULE_assignStatement = 20, RULE_writeStatement = 21, RULE_displayStatement = 22, 
		RULE_reinputStatement = 23, RULE_inputStatement = 24, RULE_ifStatement = 25, 
		RULE_decideStatement = 26, RULE_decideBranch = 27, RULE_blockContent = 28, 
		RULE_expr = 29, RULE_unknownStatement = 30, RULE_unknownLine = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programElement", "defineData", "dataLine", "defineLine", 
			"typeSpec", "findStatement", "readLikeStatement", "histogramStatement", 
			"storeStatement", "updateStatement", "deleteStatement", "endTransactionStatement", 
			"backoutTransactionStatement", "callnatStatement", "callArgList", "performStatement", 
			"includeStatement", "computeStatement", "moveStatement", "assignStatement", 
			"writeStatement", "displayStatement", "reinputStatement", "inputStatement", 
			"ifStatement", "decideStatement", "decideBranch", "blockContent", "expr", 
			"unknownStatement", "unknownLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'END-FIND'", "'END-IF'", "'END-DEFINE'", "'END-DECIDE'", 
			null, null, "'DEFINE'", "'DATA'", "'LOCAL'", "'GLOBAL'", "'PARAMETER'", 
			"'VIEW'", "'OF'", "'FIND'", "'READ'", "'GET'", "'HISTOGRAM'", "'WITH'", 
			"'STORE'", "'UPDATE'", "'DELETE'", "'CALLNAT'", "'PERFORM'", "'INCLUDE'", 
			"'IF'", "'ELSE'", "'DECIDE'", "'COMPUTE'", "'MOVE'", "'ASSIGN'", "'REINPUT'", 
			"'INPUT'", "'WRITE'", "'DISPLAY'", "'ON'", "'VALUE'", "'ESCAPE'", "'END'", 
			"'*'", "','", "'.'", "':'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NL", "LINE_COMMENT", "END_FIND", "END_IF", "END_DEFINE", 
			"END_DECIDE", "END_TRANSACTION", "BACKOUT_TRANSACTION", "DEFINE", "DATA", 
			"LOCAL", "GLOBAL", "PARAMETER", "VIEW", "OF", "FIND", "READ", "GET", 
			"HISTOGRAM", "WITH", "STORE", "UPDATE", "DELETE", "CALLNAT", "PERFORM", 
			"INCLUDE", "IF", "ELSE", "DECIDE", "COMPUTE", "MOVE", "ASSIGN", "REINPUT", 
			"INPUT", "WRITE", "DISPLAY", "ON", "VALUE", "ESCAPE", "END", "STAR", 
			"COMMA", "DOT", "COLON", "LPAREN", "RPAREN", "EQ", "STRING", "INT", "ID", 
			"OTHER"
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
	public String getGrammarFileName() { return "NaturalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NaturalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(NaturalParser.END, 0); }
		public TerminalNode EOF() { return getToken(NaturalParser.EOF, 0); }
		public List<ProgramElementContext> programElement() {
			return getRuleContexts(ProgramElementContext.class);
		}
		public ProgramElementContext programElement(int i) {
			return getRuleContext(ProgramElementContext.class,i);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << END_TRANSACTION) | (1L << BACKOUT_TRANSACTION) | (1L << DEFINE) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << FIND) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
					{
					{
					setState(64);
					programElement();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(END);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(71);
					match(NL);
					}
				}

				setState(74);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << END_TRANSACTION) | (1L << BACKOUT_TRANSACTION) | (1L << DEFINE) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << FIND) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
					{
					{
					setState(75);
					programElement();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(EOF);
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

	public static class ProgramElementContext extends ParserRuleContext {
		public DefineDataContext defineData() {
			return getRuleContext(DefineDataContext.class,0);
		}
		public FindStatementContext findStatement() {
			return getRuleContext(FindStatementContext.class,0);
		}
		public ReadLikeStatementContext readLikeStatement() {
			return getRuleContext(ReadLikeStatementContext.class,0);
		}
		public HistogramStatementContext histogramStatement() {
			return getRuleContext(HistogramStatementContext.class,0);
		}
		public StoreStatementContext storeStatement() {
			return getRuleContext(StoreStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public EndTransactionStatementContext endTransactionStatement() {
			return getRuleContext(EndTransactionStatementContext.class,0);
		}
		public BackoutTransactionStatementContext backoutTransactionStatement() {
			return getRuleContext(BackoutTransactionStatementContext.class,0);
		}
		public CallnatStatementContext callnatStatement() {
			return getRuleContext(CallnatStatementContext.class,0);
		}
		public PerformStatementContext performStatement() {
			return getRuleContext(PerformStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public ComputeStatementContext computeStatement() {
			return getRuleContext(ComputeStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DecideStatementContext decideStatement() {
			return getRuleContext(DecideStatementContext.class,0);
		}
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ReinputStatementContext reinputStatement() {
			return getRuleContext(ReinputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public UnknownStatementContext unknownStatement() {
			return getRuleContext(UnknownStatementContext.class,0);
		}
		public ProgramElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterProgramElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitProgramElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitProgramElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramElementContext programElement() throws RecognitionException {
		ProgramElementContext _localctx = new ProgramElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programElement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				defineData();
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				findStatement();
				}
				break;
			case READ:
			case GET:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				readLikeStatement();
				}
				break;
			case HISTOGRAM:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				histogramStatement();
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				storeStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				deleteStatement();
				}
				break;
			case END_TRANSACTION:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				endTransactionStatement();
				}
				break;
			case BACKOUT_TRANSACTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				backoutTransactionStatement();
				}
				break;
			case CALLNAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				callnatStatement();
				}
				break;
			case PERFORM:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				performStatement();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				includeStatement();
				}
				break;
			case COMPUTE:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				computeStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				ifStatement();
				}
				break;
			case DECIDE:
				enterOuterAlt(_localctx, 15);
				{
				setState(98);
				decideStatement();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 16);
				{
				setState(99);
				moveStatement();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 17);
				{
				setState(100);
				assignStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 18);
				{
				setState(101);
				writeStatement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 19);
				{
				setState(102);
				displayStatement();
				}
				break;
			case REINPUT:
				enterOuterAlt(_localctx, 20);
				{
				setState(103);
				reinputStatement();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 21);
				{
				setState(104);
				inputStatement();
				}
				break;
			case WS:
			case NL:
			case LINE_COMMENT:
			case DATA:
			case LOCAL:
			case GLOBAL:
			case PARAMETER:
			case VIEW:
			case OF:
			case WITH:
			case ON:
			case VALUE:
			case ESCAPE:
			case STAR:
			case COMMA:
			case DOT:
			case COLON:
			case LPAREN:
			case RPAREN:
			case EQ:
			case STRING:
			case INT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 22);
				{
				setState(105);
				unknownStatement();
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

	public static class DefineDataContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(NaturalParser.DEFINE, 0); }
		public TerminalNode DATA() { return getToken(NaturalParser.DATA, 0); }
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public TerminalNode END_DEFINE() { return getToken(NaturalParser.END_DEFINE, 0); }
		public List<DataLineContext> dataLine() {
			return getRuleContexts(DataLineContext.class);
		}
		public DataLineContext dataLine(int i) {
			return getRuleContext(DataLineContext.class,i);
		}
		public TerminalNode LOCAL() { return getToken(NaturalParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(NaturalParser.GLOBAL, 0); }
		public TerminalNode PARAMETER() { return getToken(NaturalParser.PARAMETER, 0); }
		public DefineDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDefineData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDefineData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDefineData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineDataContext defineData() throws RecognitionException {
		DefineDataContext _localctx = new DefineDataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defineData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DEFINE);
			setState(109);
			match(DATA);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER))) != 0)) {
				{
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(113);
			match(NL);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << WITH) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(114);
				dataLine();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(END_DEFINE);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(121);
				match(NL);
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

	public static class DataLineContext extends ParserRuleContext {
		public DefineLineContext defineLine() {
			return getRuleContext(DefineLineContext.class,0);
		}
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public DataLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDataLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDataLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDataLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataLineContext dataLine() throws RecognitionException {
		DataLineContext _localctx = new DataLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataLine);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				defineLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				unknownLine();
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

	public static class DefineLineContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NaturalParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(NaturalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NaturalParser.ID, i);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public TerminalNode VIEW() { return getToken(NaturalParser.VIEW, 0); }
		public TerminalNode OF() { return getToken(NaturalParser.OF, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public DefineLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDefineLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDefineLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDefineLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineLineContext defineLine() throws RecognitionException {
		DefineLineContext _localctx = new DefineLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defineLine);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(INT);
				setState(129);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIEW) {
					{
					setState(130);
					match(VIEW);
					setState(131);
					match(OF);
					setState(132);
					match(ID);
					}
				}

				setState(135);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(INT);
				setState(137);
				match(ID);
				setState(138);
				typeSpec();
				setState(139);
				match(NL);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NaturalParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(NaturalParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(NaturalParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(NaturalParser.INT, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LPAREN);
			setState(144);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(145);
				match(COMMA);
				setState(146);
				match(INT);
				}
			}

			setState(149);
			match(RPAREN);
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

	public static class FindStatementContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(NaturalParser.FIND, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public TerminalNode END_FIND() { return getToken(NaturalParser.END_FIND, 0); }
		public TerminalNode WITH() { return getToken(NaturalParser.WITH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContentContext> blockContent() {
			return getRuleContexts(BlockContentContext.class);
		}
		public BlockContentContext blockContent(int i) {
			return getRuleContext(BlockContentContext.class,i);
		}
		public FindStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterFindStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitFindStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitFindStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindStatementContext findStatement() throws RecognitionException {
		FindStatementContext _localctx = new FindStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_findStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(FIND);
			setState(152);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(153);
				match(WITH);
				setState(154);
				expr();
				}
			}

			setState(157);
			match(NL);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(158);
				blockContent();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(END_FIND);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(165);
				match(NL);
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

	public static class ReadLikeStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public TerminalNode READ() { return getToken(NaturalParser.READ, 0); }
		public TerminalNode GET() { return getToken(NaturalParser.GET, 0); }
		public TerminalNode WITH() { return getToken(NaturalParser.WITH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadLikeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readLikeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterReadLikeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitReadLikeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitReadLikeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadLikeStatementContext readLikeStatement() throws RecognitionException {
		ReadLikeStatementContext _localctx = new ReadLikeStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readLikeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==GET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(170);
				match(WITH);
				setState(171);
				expr();
				}
			}

			setState(174);
			match(NL);
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

	public static class HistogramStatementContext extends ParserRuleContext {
		public TerminalNode HISTOGRAM() { return getToken(NaturalParser.HISTOGRAM, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public TerminalNode WITH() { return getToken(NaturalParser.WITH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HistogramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_histogramStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterHistogramStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitHistogramStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitHistogramStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistogramStatementContext histogramStatement() throws RecognitionException {
		HistogramStatementContext _localctx = new HistogramStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_histogramStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(HISTOGRAM);
			setState(177);
			match(ID);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(178);
				match(WITH);
				setState(179);
				expr();
				}
			}

			setState(182);
			match(NL);
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

	public static class StoreStatementContext extends ParserRuleContext {
		public TerminalNode STORE() { return getToken(NaturalParser.STORE, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public StoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitStoreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitStoreStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreStatementContext storeStatement() throws RecognitionException {
		StoreStatementContext _localctx = new StoreStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_storeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(STORE);
			setState(185);
			match(ID);
			setState(186);
			match(NL);
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

	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(NaturalParser.UPDATE, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(UPDATE);
			setState(189);
			match(NL);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(NaturalParser.DELETE, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DELETE);
			setState(192);
			match(NL);
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

	public static class EndTransactionStatementContext extends ParserRuleContext {
		public TerminalNode END_TRANSACTION() { return getToken(NaturalParser.END_TRANSACTION, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public EndTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTransactionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterEndTransactionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitEndTransactionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitEndTransactionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTransactionStatementContext endTransactionStatement() throws RecognitionException {
		EndTransactionStatementContext _localctx = new EndTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endTransactionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(END_TRANSACTION);
			setState(195);
			match(NL);
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

	public static class BackoutTransactionStatementContext extends ParserRuleContext {
		public TerminalNode BACKOUT_TRANSACTION() { return getToken(NaturalParser.BACKOUT_TRANSACTION, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public BackoutTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backoutTransactionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterBackoutTransactionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitBackoutTransactionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitBackoutTransactionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackoutTransactionStatementContext backoutTransactionStatement() throws RecognitionException {
		BackoutTransactionStatementContext _localctx = new BackoutTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_backoutTransactionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(BACKOUT_TRANSACTION);
			setState(198);
			match(NL);
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

	public static class CallnatStatementContext extends ParserRuleContext {
		public TerminalNode CALLNAT() { return getToken(NaturalParser.CALLNAT, 0); }
		public TerminalNode STRING() { return getToken(NaturalParser.STRING, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public CallArgListContext callArgList() {
			return getRuleContext(CallArgListContext.class,0);
		}
		public CallnatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callnatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterCallnatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitCallnatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitCallnatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallnatStatementContext callnatStatement() throws RecognitionException {
		CallnatStatementContext _localctx = new CallnatStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callnatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CALLNAT);
			setState(201);
			match(STRING);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				setState(202);
				callArgList();
				}
			}

			setState(205);
			match(NL);
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

	public static class CallArgListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NaturalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NaturalParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(NaturalParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(NaturalParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(NaturalParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(NaturalParser.INT, i);
		}
		public List<TerminalNode> OTHER() { return getTokens(NaturalParser.OTHER); }
		public TerminalNode OTHER(int i) {
			return getToken(NaturalParser.OTHER, i);
		}
		public List<TerminalNode> STAR() { return getTokens(NaturalParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NaturalParser.STAR, i);
		}
		public List<TerminalNode> EQ() { return getTokens(NaturalParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(NaturalParser.EQ, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NaturalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NaturalParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(NaturalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NaturalParser.DOT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NaturalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NaturalParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NaturalParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NaturalParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NaturalParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NaturalParser.RPAREN, i);
		}
		public CallArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterCallArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitCallArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitCallArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgListContext callArgList() throws RecognitionException {
		CallArgListContext _localctx = new CallArgListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0) );
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

	public static class PerformStatementContext extends ParserRuleContext {
		public TerminalNode PERFORM() { return getToken(NaturalParser.PERFORM, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public PerformStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterPerformStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitPerformStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitPerformStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformStatementContext performStatement() throws RecognitionException {
		PerformStatementContext _localctx = new PerformStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_performStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PERFORM);
			setState(213);
			match(ID);
			setState(214);
			match(NL);
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

	public static class IncludeStatementContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(NaturalParser.INCLUDE, 0); }
		public TerminalNode ID() { return getToken(NaturalParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(INCLUDE);
			setState(217);
			match(ID);
			setState(218);
			match(NL);
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

	public static class ComputeStatementContext extends ParserRuleContext {
		public TerminalNode COMPUTE() { return getToken(NaturalParser.COMPUTE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public ComputeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterComputeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitComputeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitComputeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeStatementContext computeStatement() throws RecognitionException {
		ComputeStatementContext _localctx = new ComputeStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_computeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(COMPUTE);
			setState(221);
			expr();
			setState(222);
			match(NL);
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

	public static class MoveStatementContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(NaturalParser.MOVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterMoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitMoveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitMoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_moveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(MOVE);
			setState(225);
			expr();
			setState(226);
			match(NL);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NaturalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ASSIGN);
			setState(229);
			expr();
			setState(230);
			match(NL);
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

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(NaturalParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WRITE);
			setState(233);
			expr();
			setState(234);
			match(NL);
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(NaturalParser.DISPLAY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(DISPLAY);
			setState(237);
			expr();
			setState(238);
			match(NL);
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

	public static class ReinputStatementContext extends ParserRuleContext {
		public TerminalNode REINPUT() { return getToken(NaturalParser.REINPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public ReinputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reinputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterReinputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitReinputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitReinputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReinputStatementContext reinputStatement() throws RecognitionException {
		ReinputStatementContext _localctx = new ReinputStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_reinputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(REINPUT);
			setState(241);
			expr();
			setState(242);
			match(NL);
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

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(NaturalParser.INPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(INPUT);
			setState(245);
			expr();
			setState(246);
			match(NL);
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
		public TerminalNode IF() { return getToken(NaturalParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public TerminalNode END_IF() { return getToken(NaturalParser.END_IF, 0); }
		public List<BlockContentContext> blockContent() {
			return getRuleContexts(BlockContentContext.class);
		}
		public BlockContentContext blockContent(int i) {
			return getRuleContext(BlockContentContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NaturalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IF);
			setState(249);
			expr();
			setState(250);
			match(NL);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(251);
				blockContent();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(257);
				match(ELSE);
				setState(258);
				match(NL);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
					{
					{
					setState(259);
					blockContent();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
			match(END_IF);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(268);
				match(NL);
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

	public static class DecideStatementContext extends ParserRuleContext {
		public TerminalNode DECIDE() { return getToken(NaturalParser.DECIDE, 0); }
		public TerminalNode ON() { return getToken(NaturalParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public TerminalNode END_DECIDE() { return getToken(NaturalParser.END_DECIDE, 0); }
		public List<DecideBranchContext> decideBranch() {
			return getRuleContexts(DecideBranchContext.class);
		}
		public DecideBranchContext decideBranch(int i) {
			return getRuleContext(DecideBranchContext.class,i);
		}
		public DecideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDecideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDecideStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDecideStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecideStatementContext decideStatement() throws RecognitionException {
		DecideStatementContext _localctx = new DecideStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decideStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(DECIDE);
			setState(272);
			match(ON);
			setState(273);
			expr();
			setState(274);
			match(NL);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << WITH) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(275);
				decideBranch();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(END_DECIDE);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(282);
				match(NL);
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

	public static class DecideBranchContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(NaturalParser.VALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalParser.NL, 0); }
		public List<BlockContentContext> blockContent() {
			return getRuleContexts(BlockContentContext.class);
		}
		public BlockContentContext blockContent(int i) {
			return getRuleContext(BlockContentContext.class,i);
		}
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public DecideBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decideBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterDecideBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitDecideBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitDecideBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecideBranchContext decideBranch() throws RecognitionException {
		DecideBranchContext _localctx = new DecideBranchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_decideBranch);
		try {
			int _alt;
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(VALUE);
				setState(286);
				expr();
				setState(287);
				match(NL);
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						blockContent();
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				unknownLine();
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

	public static class BlockContentContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ComputeStatementContext computeStatement() {
			return getRuleContext(ComputeStatementContext.class,0);
		}
		public CallnatStatementContext callnatStatement() {
			return getRuleContext(CallnatStatementContext.class,0);
		}
		public PerformStatementContext performStatement() {
			return getRuleContext(PerformStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public ReinputStatementContext reinputStatement() {
			return getRuleContext(ReinputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ReadLikeStatementContext readLikeStatement() {
			return getRuleContext(ReadLikeStatementContext.class,0);
		}
		public HistogramStatementContext histogramStatement() {
			return getRuleContext(HistogramStatementContext.class,0);
		}
		public StoreStatementContext storeStatement() {
			return getRuleContext(StoreStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public DecideStatementContext decideStatement() {
			return getRuleContext(DecideStatementContext.class,0);
		}
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public BlockContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterBlockContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitBlockContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitBlockContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContentContext blockContent() throws RecognitionException {
		BlockContentContext _localctx = new BlockContentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blockContent);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				ifStatement();
				}
				break;
			case COMPUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				computeStatement();
				}
				break;
			case CALLNAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				callnatStatement();
				}
				break;
			case PERFORM:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				performStatement();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				includeStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				writeStatement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				displayStatement();
				}
				break;
			case REINPUT:
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				reinputStatement();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				inputStatement();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				moveStatement();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(307);
				assignStatement();
				}
				break;
			case READ:
			case GET:
				enterOuterAlt(_localctx, 12);
				{
				setState(308);
				readLikeStatement();
				}
				break;
			case HISTOGRAM:
				enterOuterAlt(_localctx, 13);
				{
				setState(309);
				histogramStatement();
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 14);
				{
				setState(310);
				storeStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 15);
				{
				setState(311);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 16);
				{
				setState(312);
				deleteStatement();
				}
				break;
			case DECIDE:
				enterOuterAlt(_localctx, 17);
				{
				setState(313);
				decideStatement();
				}
				break;
			case WS:
			case NL:
			case LINE_COMMENT:
			case DATA:
			case LOCAL:
			case GLOBAL:
			case PARAMETER:
			case VIEW:
			case OF:
			case WITH:
			case ON:
			case VALUE:
			case ESCAPE:
			case STAR:
			case COMMA:
			case DOT:
			case COLON:
			case LPAREN:
			case RPAREN:
			case EQ:
			case STRING:
			case INT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 18);
				{
				setState(314);
				unknownLine();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public List<TerminalNode> END_IF() { return getTokens(NaturalParser.END_IF); }
		public TerminalNode END_IF(int i) {
			return getToken(NaturalParser.END_IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(NaturalParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NaturalParser.ELSE, i);
		}
		public List<TerminalNode> END_FIND() { return getTokens(NaturalParser.END_FIND); }
		public TerminalNode END_FIND(int i) {
			return getToken(NaturalParser.END_FIND, i);
		}
		public List<TerminalNode> END_DEFINE() { return getTokens(NaturalParser.END_DEFINE); }
		public TerminalNode END_DEFINE(int i) {
			return getToken(NaturalParser.END_DEFINE, i);
		}
		public List<TerminalNode> END_DECIDE() { return getTokens(NaturalParser.END_DECIDE); }
		public TerminalNode END_DECIDE(int i) {
			return getToken(NaturalParser.END_DECIDE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << END_FIND) | (1L << END_IF) | (1L << END_DEFINE) | (1L << END_DECIDE) | (1L << ELSE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << LINE_COMMENT) | (1L << END_TRANSACTION) | (1L << BACKOUT_TRANSACTION) | (1L << DEFINE) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << FIND) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << WITH) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << END) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0) );
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

	public static class UnknownStatementContext extends ParserRuleContext {
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public UnknownStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterUnknownStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitUnknownStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitUnknownStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownStatementContext unknownStatement() throws RecognitionException {
		UnknownStatementContext _localctx = new UnknownStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unknownStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			unknownLine();
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

	public static class UnknownLineContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(NaturalParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalParser.NL, i);
		}
		public List<TerminalNode> DEFINE() { return getTokens(NaturalParser.DEFINE); }
		public TerminalNode DEFINE(int i) {
			return getToken(NaturalParser.DEFINE, i);
		}
		public List<TerminalNode> FIND() { return getTokens(NaturalParser.FIND); }
		public TerminalNode FIND(int i) {
			return getToken(NaturalParser.FIND, i);
		}
		public List<TerminalNode> READ() { return getTokens(NaturalParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(NaturalParser.READ, i);
		}
		public List<TerminalNode> GET() { return getTokens(NaturalParser.GET); }
		public TerminalNode GET(int i) {
			return getToken(NaturalParser.GET, i);
		}
		public List<TerminalNode> HISTOGRAM() { return getTokens(NaturalParser.HISTOGRAM); }
		public TerminalNode HISTOGRAM(int i) {
			return getToken(NaturalParser.HISTOGRAM, i);
		}
		public List<TerminalNode> STORE() { return getTokens(NaturalParser.STORE); }
		public TerminalNode STORE(int i) {
			return getToken(NaturalParser.STORE, i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(NaturalParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(NaturalParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(NaturalParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(NaturalParser.DELETE, i);
		}
		public List<TerminalNode> IF() { return getTokens(NaturalParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(NaturalParser.IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(NaturalParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NaturalParser.ELSE, i);
		}
		public List<TerminalNode> END_IF() { return getTokens(NaturalParser.END_IF); }
		public TerminalNode END_IF(int i) {
			return getToken(NaturalParser.END_IF, i);
		}
		public List<TerminalNode> END_FIND() { return getTokens(NaturalParser.END_FIND); }
		public TerminalNode END_FIND(int i) {
			return getToken(NaturalParser.END_FIND, i);
		}
		public List<TerminalNode> END_DEFINE() { return getTokens(NaturalParser.END_DEFINE); }
		public TerminalNode END_DEFINE(int i) {
			return getToken(NaturalParser.END_DEFINE, i);
		}
		public List<TerminalNode> CALLNAT() { return getTokens(NaturalParser.CALLNAT); }
		public TerminalNode CALLNAT(int i) {
			return getToken(NaturalParser.CALLNAT, i);
		}
		public List<TerminalNode> PERFORM() { return getTokens(NaturalParser.PERFORM); }
		public TerminalNode PERFORM(int i) {
			return getToken(NaturalParser.PERFORM, i);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(NaturalParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(NaturalParser.INCLUDE, i);
		}
		public List<TerminalNode> COMPUTE() { return getTokens(NaturalParser.COMPUTE); }
		public TerminalNode COMPUTE(int i) {
			return getToken(NaturalParser.COMPUTE, i);
		}
		public List<TerminalNode> MOVE() { return getTokens(NaturalParser.MOVE); }
		public TerminalNode MOVE(int i) {
			return getToken(NaturalParser.MOVE, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(NaturalParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(NaturalParser.ASSIGN, i);
		}
		public List<TerminalNode> REINPUT() { return getTokens(NaturalParser.REINPUT); }
		public TerminalNode REINPUT(int i) {
			return getToken(NaturalParser.REINPUT, i);
		}
		public List<TerminalNode> INPUT() { return getTokens(NaturalParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(NaturalParser.INPUT, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(NaturalParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(NaturalParser.WRITE, i);
		}
		public List<TerminalNode> DISPLAY() { return getTokens(NaturalParser.DISPLAY); }
		public TerminalNode DISPLAY(int i) {
			return getToken(NaturalParser.DISPLAY, i);
		}
		public List<TerminalNode> DECIDE() { return getTokens(NaturalParser.DECIDE); }
		public TerminalNode DECIDE(int i) {
			return getToken(NaturalParser.DECIDE, i);
		}
		public List<TerminalNode> END_DECIDE() { return getTokens(NaturalParser.END_DECIDE); }
		public TerminalNode END_DECIDE(int i) {
			return getToken(NaturalParser.END_DECIDE, i);
		}
		public List<TerminalNode> END() { return getTokens(NaturalParser.END); }
		public TerminalNode END(int i) {
			return getToken(NaturalParser.END, i);
		}
		public List<TerminalNode> END_TRANSACTION() { return getTokens(NaturalParser.END_TRANSACTION); }
		public TerminalNode END_TRANSACTION(int i) {
			return getToken(NaturalParser.END_TRANSACTION, i);
		}
		public List<TerminalNode> BACKOUT_TRANSACTION() { return getTokens(NaturalParser.BACKOUT_TRANSACTION); }
		public TerminalNode BACKOUT_TRANSACTION(int i) {
			return getToken(NaturalParser.BACKOUT_TRANSACTION, i);
		}
		public UnknownLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).enterUnknownLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalParserListener ) ((NaturalParserListener)listener).exitUnknownLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalParserVisitor ) return ((NaturalParserVisitor<? extends T>)visitor).visitUnknownLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownLineContext unknownLine() throws RecognitionException {
		UnknownLineContext _localctx = new UnknownLineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unknownLine);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
			case LINE_COMMENT:
			case DATA:
			case LOCAL:
			case GLOBAL:
			case PARAMETER:
			case VIEW:
			case OF:
			case WITH:
			case ON:
			case VALUE:
			case ESCAPE:
			case STAR:
			case COMMA:
			case DOT:
			case COLON:
			case LPAREN:
			case RPAREN:
			case EQ:
			case STRING:
			case INT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(324);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << END_FIND) | (1L << END_IF) | (1L << END_DEFINE) | (1L << END_DECIDE) | (1L << END_TRANSACTION) | (1L << BACKOUT_TRANSACTION) | (1L << DEFINE) | (1L << FIND) | (1L << READ) | (1L << GET) | (1L << HISTOGRAM) | (1L << STORE) | (1L << UPDATE) | (1L << DELETE) | (1L << CALLNAT) | (1L << PERFORM) | (1L << INCLUDE) | (1L << IF) | (1L << ELSE) | (1L << DECIDE) | (1L << COMPUTE) | (1L << MOVE) | (1L << ASSIGN) | (1L << REINPUT) | (1L << INPUT) | (1L << WRITE) | (1L << DISPLAY) | (1L << END))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << LINE_COMMENT) | (1L << DATA) | (1L << LOCAL) | (1L << GLOBAL) | (1L << PARAMETER) | (1L << VIEW) | (1L << OF) | (1L << WITH) | (1L << ON) | (1L << VALUE) | (1L << ESCAPE) | (1L << STAR) | (1L << COMMA) | (1L << DOT) | (1L << COLON) | (1L << LPAREN) | (1L << RPAREN) | (1L << EQ) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0) );
				setState(329);
				match(NL);
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(NL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\5\2K\n\2\3\2\3\2\7\2O\n\2\f\2"+
		"\16\2R\13\2\3\2\5\2U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\4\5\4r\n"+
		"\4\3\4\3\4\7\4v\n\4\f\4\16\4y\13\4\3\4\3\4\5\4}\n\4\3\5\3\5\5\5\u0081"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u009e\n"+
		"\b\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\5\b\u00a9\n\b\3\t"+
		"\3\t\3\t\3\t\5\t\u00af\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00ce\n\20\3\20\3\20\3\21\6\21\u00d3\n\21\r"+
		"\21\16\21\u00d4\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\7\33\u00ff\n\33\f\33\16\33\u0102\13\33\3\33\3\33\3\33\7\33\u0107"+
		"\n\33\f\33\16\33\u010a\13\33\5\33\u010c\n\33\3\33\3\33\5\33\u0110\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u0117\n\34\f\34\16\34\u011a\13\34\3\34"+
		"\3\34\5\34\u011e\n\34\3\35\3\35\3\35\3\35\7\35\u0124\n\35\f\35\16\35\u0127"+
		"\13\35\3\35\5\35\u012a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013e\n\36\3\37"+
		"\6\37\u0141\n\37\r\37\16\37\u0142\3 \3 \3!\6!\u0148\n!\r!\16!\u0149\3"+
		"!\3!\5!\u014e\n!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@\2\7\3\2\16\20\3\2\24\25\3\2,\66\5\2\4\4\6\t\37\37"+
		"\7\2\4\4\6\f\23\26\30\'++\2\u0172\2T\3\2\2\2\4l\3\2\2\2\6n\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u008f\3\2\2\2\f\u0091\3\2\2\2\16\u0099\3\2\2\2\20\u00aa\3\2"+
		"\2\2\22\u00b2\3\2\2\2\24\u00ba\3\2\2\2\26\u00be\3\2\2\2\30\u00c1\3\2\2"+
		"\2\32\u00c4\3\2\2\2\34\u00c7\3\2\2\2\36\u00ca\3\2\2\2 \u00d2\3\2\2\2\""+
		"\u00d6\3\2\2\2$\u00da\3\2\2\2&\u00de\3\2\2\2(\u00e2\3\2\2\2*\u00e6\3\2"+
		"\2\2,\u00ea\3\2\2\2.\u00ee\3\2\2\2\60\u00f2\3\2\2\2\62\u00f6\3\2\2\2\64"+
		"\u00fa\3\2\2\2\66\u0111\3\2\2\28\u0129\3\2\2\2:\u013d\3\2\2\2<\u0140\3"+
		"\2\2\2>\u0144\3\2\2\2@\u014d\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HJ\7+\2\2IK\7\4\2\2JI\3\2\2\2JK\3"+
		"\2\2\2KL\3\2\2\2LU\7\2\2\3MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2QS\3\2\2\2RP\3\2\2\2SU\7\2\2\3TE\3\2\2\2TP\3\2\2\2U\3\3\2\2\2Vm"+
		"\5\6\4\2Wm\5\16\b\2Xm\5\20\t\2Ym\5\22\n\2Zm\5\24\13\2[m\5\26\f\2\\m\5"+
		"\30\r\2]m\5\32\16\2^m\5\34\17\2_m\5\36\20\2`m\5\"\22\2am\5$\23\2bm\5&"+
		"\24\2cm\5\64\33\2dm\5\66\34\2em\5(\25\2fm\5*\26\2gm\5,\27\2hm\5.\30\2"+
		"im\5\60\31\2jm\5\62\32\2km\5> \2lV\3\2\2\2lW\3\2\2\2lX\3\2\2\2lY\3\2\2"+
		"\2lZ\3\2\2\2l[\3\2\2\2l\\\3\2\2\2l]\3\2\2\2l^\3\2\2\2l_\3\2\2\2l`\3\2"+
		"\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg\3\2"+
		"\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\5\3\2\2\2no\7\f\2\2oq\7"+
		"\r\2\2pr\t\2\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\7\4\2\2tv\5\b\5\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z|\7\b\2\2{}\7"+
		"\4\2\2|{\3\2\2\2|}\3\2\2\2}\7\3\2\2\2~\u0081\5\n\6\2\177\u0081\5@!\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7\64\2\2\u0083"+
		"\u0087\7\65\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7\22\2\2\u0086\u0088"+
		"\7\65\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u0090\7\4\2\2\u008a\u008b\7\64\2\2\u008b\u008c\7\65\2\2\u008c\u008d"+
		"\5\f\7\2\u008d\u008e\7\4\2\2\u008e\u0090\3\2\2\2\u008f\u0082\3\2\2\2\u008f"+
		"\u008a\3\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7\60\2\2\u0092\u0095\7\65"+
		"\2\2\u0093\u0094\7-\2\2\u0094\u0096\7\64\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\61\2\2\u0098\r\3\2\2"+
		"\2\u0099\u009a\7\23\2\2\u009a\u009d\7\65\2\2\u009b\u009c\7\27\2\2\u009c"+
		"\u009e\5<\37\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a3\7\4\2\2\u00a0\u00a2\5:\36\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7\6\2\2\u00a7\u00a9\7\4\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\t\3\2"+
		"\2\u00ab\u00ae\7\65\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00af\5<\37\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\4"+
		"\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b6\7\65\2\2\u00b4"+
		"\u00b5\7\27\2\2\u00b5\u00b7\5<\37\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\23\3\2\2\2\u00ba"+
		"\u00bb\7\30\2\2\u00bb\u00bc\7\65\2\2\u00bc\u00bd\7\4\2\2\u00bd\25\3\2"+
		"\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\7\4\2\2\u00c0\27\3\2\2\2\u00c1\u00c2"+
		"\7\32\2\2\u00c2\u00c3\7\4\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\7\4\2"+
		"\2\u00c9\35\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cd\7\63\2\2\u00cc\u00ce"+
		"\5 \21\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\37\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5!"+
		"\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8\7\65\2\2\u00d8\u00d9\7\4\2\2"+
		"\u00d9#\3\2\2\2\u00da\u00db\7\35\2\2\u00db\u00dc\7\65\2\2\u00dc\u00dd"+
		"\7\4\2\2\u00dd%\3\2\2\2\u00de\u00df\7!\2\2\u00df\u00e0\5<\37\2\u00e0\u00e1"+
		"\7\4\2\2\u00e1\'\3\2\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\5<\37\2\u00e4"+
		"\u00e5\7\4\2\2\u00e5)\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8\5<\37\2\u00e8"+
		"\u00e9\7\4\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\5<\37\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed-\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef\u00f0\5<\37\2"+
		"\u00f0\u00f1\7\4\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f4\5<"+
		"\37\2\u00f4\u00f5\7\4\2\2\u00f5\61\3\2\2\2\u00f6\u00f7\7%\2\2\u00f7\u00f8"+
		"\5<\37\2\u00f8\u00f9\7\4\2\2\u00f9\63\3\2\2\2\u00fa\u00fb\7\36\2\2\u00fb"+
		"\u00fc\5<\37\2\u00fc\u0100\7\4\2\2\u00fd\u00ff\5:\36\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u010b\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\37\2\2\u0104\u0108\7"+
		"\4\2\2\u0105\u0107\5:\36\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u0103\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\7\7\2\2\u010e\u0110\7\4\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\65\3\2\2\2\u0111\u0112\7 \2\2\u0112\u0113\7(\2\2\u0113\u0114"+
		"\5<\37\2\u0114\u0118\7\4\2\2\u0115\u0117\58\35\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011d\7\t\2\2\u011c\u011e\7\4\2\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\67\3\2\2\2\u011f\u0120\7)\2\2"+
		"\u0120\u0121\5<\37\2\u0121\u0125\7\4\2\2\u0122\u0124\5:\36\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u012a\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\5@!\2\u0129\u011f\3\2\2"+
		"\2\u0129\u0128\3\2\2\2\u012a9\3\2\2\2\u012b\u013e\5\64\33\2\u012c\u013e"+
		"\5&\24\2\u012d\u013e\5\36\20\2\u012e\u013e\5\"\22\2\u012f\u013e\5$\23"+
		"\2\u0130\u013e\5,\27\2\u0131\u013e\5.\30\2\u0132\u013e\5\60\31\2\u0133"+
		"\u013e\5\62\32\2\u0134\u013e\5(\25\2\u0135\u013e\5*\26\2\u0136\u013e\5"+
		"\20\t\2\u0137\u013e\5\22\n\2\u0138\u013e\5\24\13\2\u0139\u013e\5\26\f"+
		"\2\u013a\u013e\5\30\r\2\u013b\u013e\5\66\34\2\u013c\u013e\5@!\2\u013d"+
		"\u012b\3\2\2\2\u013d\u012c\3\2\2\2\u013d\u012d\3\2\2\2\u013d\u012e\3\2"+
		"\2\2\u013d\u012f\3\2\2\2\u013d\u0130\3\2\2\2\u013d\u0131\3\2\2\2\u013d"+
		"\u0132\3\2\2\2\u013d\u0133\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u0135\3\2"+
		"\2\2\u013d\u0136\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2"+
		"\2\2\u013e;\3\2\2\2\u013f\u0141\n\5\2\2\u0140\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143=\3\2\2\2\u0144"+
		"\u0145\5@!\2\u0145?\3\2\2\2\u0146\u0148\n\6\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014e\7\4\2\2\u014c\u014e\7\4\2\2\u014d\u0147\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014eA\3\2\2\2!EJPTlqw|\u0080\u0087\u008f\u0095\u009d\u00a3"+
		"\u00a8\u00ae\u00b6\u00cd\u00d4\u0100\u0108\u010b\u010f\u0118\u011d\u0125"+
		"\u0129\u013d\u0142\u0149\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}