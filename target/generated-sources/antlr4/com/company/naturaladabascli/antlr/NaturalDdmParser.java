// Generated from com/company/naturaladabascli/antlr/NaturalDdmParser.g4 by ANTLR 4.9.3
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
public class NaturalDdmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NL=2, LINE_COMMENT=3, DDM=4, FIELD=5, DBID=6, FNR=7, COMMA=8, STAR=9, 
		TYPE_CHAR=10, INT=11, ID=12, OTHER=13;
	public static final int
		RULE_ddmFile = 0, RULE_fileLine = 1, RULE_ddmHeader = 2, RULE_metaLine = 3, 
		RULE_fieldLine = 4, RULE_typeSpec = 5, RULE_descriptor = 6, RULE_unknownLine = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"ddmFile", "fileLine", "ddmHeader", "metaLine", "fieldLine", "typeSpec", 
			"descriptor", "unknownLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'DDM'", "'FIELD'", "'DBID'", "'FNR'", "','", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NL", "LINE_COMMENT", "DDM", "FIELD", "DBID", "FNR", "COMMA", 
			"STAR", "TYPE_CHAR", "INT", "ID", "OTHER"
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
	public String getGrammarFileName() { return "NaturalDdmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NaturalDdmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DdmFileContext extends ParserRuleContext {
		public DdmHeaderContext ddmHeader() {
			return getRuleContext(DdmHeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NaturalDdmParser.EOF, 0); }
		public List<FileLineContext> fileLine() {
			return getRuleContexts(FileLineContext.class);
		}
		public FileLineContext fileLine(int i) {
			return getRuleContext(FileLineContext.class,i);
		}
		public DdmFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddmFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterDdmFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitDdmFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitDdmFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdmFileContext ddmFile() throws RecognitionException {
		DdmFileContext _localctx = new DdmFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ddmFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			ddmHeader();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << NL) | (1L << LINE_COMMENT) | (1L << FIELD) | (1L << DBID) | (1L << FNR) | (1L << COMMA) | (1L << STAR) | (1L << TYPE_CHAR) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(17);
				fileLine();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(EOF);
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

	public static class FileLineContext extends ParserRuleContext {
		public MetaLineContext metaLine() {
			return getRuleContext(MetaLineContext.class,0);
		}
		public FieldLineContext fieldLine() {
			return getRuleContext(FieldLineContext.class,0);
		}
		public UnknownLineContext unknownLine() {
			return getRuleContext(UnknownLineContext.class,0);
		}
		public FileLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterFileLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitFileLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitFileLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileLineContext fileLine() throws RecognitionException {
		FileLineContext _localctx = new FileLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileLine);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DBID:
			case FNR:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				metaLine();
				}
				break;
			case FIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				fieldLine();
				}
				break;
			case WS:
			case NL:
			case LINE_COMMENT:
			case COMMA:
			case STAR:
			case TYPE_CHAR:
			case INT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
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

	public static class DdmHeaderContext extends ParserRuleContext {
		public TerminalNode DDM() { return getToken(NaturalDdmParser.DDM, 0); }
		public TerminalNode ID() { return getToken(NaturalDdmParser.ID, 0); }
		public TerminalNode NL() { return getToken(NaturalDdmParser.NL, 0); }
		public DdmHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddmHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterDdmHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitDdmHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitDdmHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdmHeaderContext ddmHeader() throws RecognitionException {
		DdmHeaderContext _localctx = new DdmHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddmHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(DDM);
			setState(31);
			match(ID);
			setState(32);
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

	public static class MetaLineContext extends ParserRuleContext {
		public TerminalNode DBID() { return getToken(NaturalDdmParser.DBID, 0); }
		public TerminalNode INT() { return getToken(NaturalDdmParser.INT, 0); }
		public TerminalNode NL() { return getToken(NaturalDdmParser.NL, 0); }
		public TerminalNode FNR() { return getToken(NaturalDdmParser.FNR, 0); }
		public MetaLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterMetaLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitMetaLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitMetaLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaLineContext metaLine() throws RecognitionException {
		MetaLineContext _localctx = new MetaLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metaLine);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DBID:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(DBID);
				setState(35);
				match(INT);
				setState(36);
				match(NL);
				}
				break;
			case FNR:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(FNR);
				setState(38);
				match(INT);
				setState(39);
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

	public static class FieldLineContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(NaturalDdmParser.FIELD, 0); }
		public TerminalNode ID() { return getToken(NaturalDdmParser.ID, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode NL() { return getToken(NaturalDdmParser.NL, 0); }
		public DescriptorContext descriptor() {
			return getRuleContext(DescriptorContext.class,0);
		}
		public FieldLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterFieldLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitFieldLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitFieldLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLineContext fieldLine() throws RecognitionException {
		FieldLineContext _localctx = new FieldLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FIELD);
			setState(43);
			match(ID);
			setState(44);
			typeSpec();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==ID) {
				{
				setState(45);
				descriptor();
				}
			}

			setState(48);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode TYPE_CHAR() { return getToken(NaturalDdmParser.TYPE_CHAR, 0); }
		public List<TerminalNode> INT() { return getTokens(NaturalDdmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(NaturalDdmParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(NaturalDdmParser.COMMA, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitTypeSpec(this);
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
			setState(50);
			match(TYPE_CHAR);
			setState(51);
			match(INT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(52);
				match(COMMA);
				setState(53);
				match(INT);
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

	public static class DescriptorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(NaturalDdmParser.STAR, 0); }
		public TerminalNode ID() { return getToken(NaturalDdmParser.ID, 0); }
		public DescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptorContext descriptor() throws RecognitionException {
		DescriptorContext _localctx = new DescriptorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnknownLineContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(NaturalDdmParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NaturalDdmParser.NL, i);
		}
		public List<TerminalNode> DDM() { return getTokens(NaturalDdmParser.DDM); }
		public TerminalNode DDM(int i) {
			return getToken(NaturalDdmParser.DDM, i);
		}
		public List<TerminalNode> FIELD() { return getTokens(NaturalDdmParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(NaturalDdmParser.FIELD, i);
		}
		public List<TerminalNode> DBID() { return getTokens(NaturalDdmParser.DBID); }
		public TerminalNode DBID(int i) {
			return getToken(NaturalDdmParser.DBID, i);
		}
		public List<TerminalNode> FNR() { return getTokens(NaturalDdmParser.FNR); }
		public TerminalNode FNR(int i) {
			return getToken(NaturalDdmParser.FNR, i);
		}
		public UnknownLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).enterUnknownLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NaturalDdmParserListener ) ((NaturalDdmParserListener)listener).exitUnknownLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalDdmParserVisitor ) return ((NaturalDdmParserVisitor<? extends T>)visitor).visitUnknownLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownLineContext unknownLine() throws RecognitionException {
		UnknownLineContext _localctx = new UnknownLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unknownLine);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
			case LINE_COMMENT:
			case COMMA:
			case STAR:
			case TYPE_CHAR:
			case INT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << DDM) | (1L << FIELD) | (1L << DBID) | (1L << FNR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << LINE_COMMENT) | (1L << COMMA) | (1L << STAR) | (1L << TYPE_CHAR) | (1L << INT) | (1L << ID) | (1L << OTHER))) != 0) );
				setState(63);
				match(NL);
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\79\n\7\3\b\3\b\3\t\6\t>\n\t\r\t\16\t?\3\t\3\t\5\tD\n\t\3\t"+
		"\2\2\n\2\4\6\b\n\f\16\20\2\4\4\2\13\13\16\16\4\2\4\4\6\t\2E\2\22\3\2\2"+
		"\2\4\36\3\2\2\2\6 \3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f\64\3\2\2\2\16:\3\2"+
		"\2\2\20C\3\2\2\2\22\26\5\6\4\2\23\25\5\4\3\2\24\23\3\2\2\2\25\30\3\2\2"+
		"\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2"+
		"\3\32\3\3\2\2\2\33\37\5\b\5\2\34\37\5\n\6\2\35\37\5\20\t\2\36\33\3\2\2"+
		"\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\6\2\2!\"\7\16\2\2\"#\7"+
		"\4\2\2#\7\3\2\2\2$%\7\b\2\2%&\7\r\2\2&+\7\4\2\2\'(\7\t\2\2()\7\r\2\2)"+
		"+\7\4\2\2*$\3\2\2\2*\'\3\2\2\2+\t\3\2\2\2,-\7\7\2\2-.\7\16\2\2.\60\5\f"+
		"\7\2/\61\5\16\b\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\4\2"+
		"\2\63\13\3\2\2\2\64\65\7\f\2\2\658\7\r\2\2\66\67\7\n\2\2\679\7\r\2\28"+
		"\66\3\2\2\289\3\2\2\29\r\3\2\2\2:;\t\2\2\2;\17\3\2\2\2<>\n\3\2\2=<\3\2"+
		"\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AD\7\4\2\2BD\7\4\2\2C=\3\2"+
		"\2\2CB\3\2\2\2D\21\3\2\2\2\t\26\36*\608?C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}