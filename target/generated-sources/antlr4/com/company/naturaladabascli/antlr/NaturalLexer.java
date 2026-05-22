// Generated from com/company/naturaladabascli/antlr/NaturalLexer.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NaturalLexer extends Lexer {
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
		COMMENTS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NL", "LINE_COMMENT", "END_FIND", "END_IF", "END_DEFINE", "END_DECIDE", 
			"END_TRANSACTION", "BACKOUT_TRANSACTION", "DEFINE", "DATA", "LOCAL", 
			"GLOBAL", "PARAMETER", "VIEW", "OF", "FIND", "READ", "GET", "HISTOGRAM", 
			"WITH", "STORE", "UPDATE", "DELETE", "CALLNAT", "PERFORM", "INCLUDE", 
			"IF", "ELSE", "DECIDE", "COMPUTE", "MOVE", "ASSIGN", "REINPUT", "INPUT", 
			"WRITE", "DISPLAY", "ON", "VALUE", "ESCAPE", "END", "STAR", "COMMA", 
			"DOT", "COLON", "LPAREN", "RPAREN", "EQ", "STRING", "INT", "ID", "OTHER"
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


	public NaturalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NaturalLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01c2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\6\2m\n\2\r\2\16\2n\3\2\3\2\3\3\6\3t\n\3\r\3\16\3u"+
		"\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c5\n\n\r\n\16\n"+
		"\u00c6\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\7\62\u01ae\n\62\f\62\16\62\u01b1\13\62\3\62\3\62\3\63\6\63\u01b6"+
		"\n\63\r\63\16\63\u01b7\3\64\3\64\7\64\u01bc\n\64\f\64\16\64\u01bf\13\64"+
		"\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66\3\2\b\4\2\13\13\"\"\4\2\f\f\17\17\3\2))\3\2\62;\5\2%%C\\c|\7"+
		"\2//\62;C\\aac|\2\u01ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\3l\3\2\2\2\5s\3\2\2\2\7w\3\2\2\2\t\u0080\3\2\2\2\13\u0089\3\2\2\2\r"+
		"\u0090\3\2\2\2\17\u009b\3\2\2\2\21\u00a6\3\2\2\2\23\u00bb\3\2\2\2\25\u00d4"+
		"\3\2\2\2\27\u00db\3\2\2\2\31\u00e0\3\2\2\2\33\u00e6\3\2\2\2\35\u00ed\3"+
		"\2\2\2\37\u00f7\3\2\2\2!\u00fc\3\2\2\2#\u00ff\3\2\2\2%\u0104\3\2\2\2\'"+
		"\u0109\3\2\2\2)\u010d\3\2\2\2+\u0117\3\2\2\2-\u011c\3\2\2\2/\u0122\3\2"+
		"\2\2\61\u0129\3\2\2\2\63\u0130\3\2\2\2\65\u0138\3\2\2\2\67\u0140\3\2\2"+
		"\29\u0148\3\2\2\2;\u014b\3\2\2\2=\u0150\3\2\2\2?\u0157\3\2\2\2A\u015f"+
		"\3\2\2\2C\u0164\3\2\2\2E\u016b\3\2\2\2G\u0173\3\2\2\2I\u0179\3\2\2\2K"+
		"\u017f\3\2\2\2M\u0187\3\2\2\2O\u018a\3\2\2\2Q\u0190\3\2\2\2S\u0197\3\2"+
		"\2\2U\u019b\3\2\2\2W\u019d\3\2\2\2Y\u019f\3\2\2\2[\u01a1\3\2\2\2]\u01a3"+
		"\3\2\2\2_\u01a5\3\2\2\2a\u01a7\3\2\2\2c\u01a9\3\2\2\2e\u01b5\3\2\2\2g"+
		"\u01b9\3\2\2\2i\u01c0\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2op\3\2\2\2pq\b\2\2\2q\4\3\2\2\2rt\t\3\2\2sr\3\2\2\2tu\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\6\3\2\2\2w{\7#\2\2xz\n\3\2\2yx\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\4\2\2\177\b\3\2\2\2"+
		"\u0080\u0081\7G\2\2\u0081\u0082\7P\2\2\u0082\u0083\7F\2\2\u0083\u0084"+
		"\7/\2\2\u0084\u0085\7H\2\2\u0085\u0086\7K\2\2\u0086\u0087\7P\2\2\u0087"+
		"\u0088\7F\2\2\u0088\n\3\2\2\2\u0089\u008a\7G\2\2\u008a\u008b\7P\2\2\u008b"+
		"\u008c\7F\2\2\u008c\u008d\7/\2\2\u008d\u008e\7K\2\2\u008e\u008f\7H\2\2"+
		"\u008f\f\3\2\2\2\u0090\u0091\7G\2\2\u0091\u0092\7P\2\2\u0092\u0093\7F"+
		"\2\2\u0093\u0094\7/\2\2\u0094\u0095\7F\2\2\u0095\u0096\7G\2\2\u0096\u0097"+
		"\7H\2\2\u0097\u0098\7K\2\2\u0098\u0099\7P\2\2\u0099\u009a\7G\2\2\u009a"+
		"\16\3\2\2\2\u009b\u009c\7G\2\2\u009c\u009d\7P\2\2\u009d\u009e\7F\2\2\u009e"+
		"\u009f\7/\2\2\u009f\u00a0\7F\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7E\2\2"+
		"\u00a2\u00a3\7K\2\2\u00a3\u00a4\7F\2\2\u00a4\u00a5\7G\2\2\u00a5\20\3\2"+
		"\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7F\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7V"+
		"\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4"+
		"\7U\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7V\2\2\u00b7"+
		"\u00b8\7K\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba\7P\2\2\u00ba\22\3\2\2\2\u00bb"+
		"\u00bc\7D\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7M\2\2"+
		"\u00bf\u00c0\7Q\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7V"+
		"\2\2\u00c9\u00ca\7T\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd"+
		"\7U\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7E\2\2\u00cf\u00d0\7V\2\2\u00d0"+
		"\u00d1\7K\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7P\2\2\u00d3\24\3\2\2\2\u00d4"+
		"\u00d5\7F\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7H\2\2\u00d7\u00d8\7K\2\2"+
		"\u00d8\u00d9\7P\2\2\u00d9\u00da\7G\2\2\u00da\26\3\2\2\2\u00db\u00dc\7"+
		"F\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7C\2\2\u00df\30"+
		"\3\2\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7E\2\2\u00e3"+
		"\u00e4\7C\2\2\u00e4\u00e5\7N\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\7I\2\2\u00e7"+
		"\u00e8\7N\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7D\2\2\u00ea\u00eb\7C\2\2"+
		"\u00eb\u00ec\7N\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\7R\2\2\u00ee\u00ef\7"+
		"C\2\2\u00ef\u00f0\7T\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7O\2\2\u00f2\u00f3"+
		"\7G\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7T\2\2\u00f6"+
		"\36\3\2\2\2\u00f7\u00f8\7X\2\2\u00f8\u00f9\7K\2\2\u00f9\u00fa\7G\2\2\u00fa"+
		"\u00fb\7Y\2\2\u00fb \3\2\2\2\u00fc\u00fd\7Q\2\2\u00fd\u00fe\7H\2\2\u00fe"+
		"\"\3\2\2\2\u00ff\u0100\7H\2\2\u0100\u0101\7K\2\2\u0101\u0102\7P\2\2\u0102"+
		"\u0103\7F\2\2\u0103$\3\2\2\2\u0104\u0105\7T\2\2\u0105\u0106\7G\2\2\u0106"+
		"\u0107\7C\2\2\u0107\u0108\7F\2\2\u0108&\3\2\2\2\u0109\u010a\7I\2\2\u010a"+
		"\u010b\7G\2\2\u010b\u010c\7V\2\2\u010c(\3\2\2\2\u010d\u010e\7J\2\2\u010e"+
		"\u010f\7K\2\2\u010f\u0110\7U\2\2\u0110\u0111\7V\2\2\u0111\u0112\7Q\2\2"+
		"\u0112\u0113\7I\2\2\u0113\u0114\7T\2\2\u0114\u0115\7C\2\2\u0115\u0116"+
		"\7O\2\2\u0116*\3\2\2\2\u0117\u0118\7Y\2\2\u0118\u0119\7K\2\2\u0119\u011a"+
		"\7V\2\2\u011a\u011b\7J\2\2\u011b,\3\2\2\2\u011c\u011d\7U\2\2\u011d\u011e"+
		"\7V\2\2\u011e\u011f\7Q\2\2\u011f\u0120\7T\2\2\u0120\u0121\7G\2\2\u0121"+
		".\3\2\2\2\u0122\u0123\7W\2\2\u0123\u0124\7R\2\2\u0124\u0125\7F\2\2\u0125"+
		"\u0126\7C\2\2\u0126\u0127\7V\2\2\u0127\u0128\7G\2\2\u0128\60\3\2\2\2\u0129"+
		"\u012a\7F\2\2\u012a\u012b\7G\2\2\u012b\u012c\7N\2\2\u012c\u012d\7G\2\2"+
		"\u012d\u012e\7V\2\2\u012e\u012f\7G\2\2\u012f\62\3\2\2\2\u0130\u0131\7"+
		"E\2\2\u0131\u0132\7C\2\2\u0132\u0133\7N\2\2\u0133\u0134\7N\2\2\u0134\u0135"+
		"\7P\2\2\u0135\u0136\7C\2\2\u0136\u0137\7V\2\2\u0137\64\3\2\2\2\u0138\u0139"+
		"\7R\2\2\u0139\u013a\7G\2\2\u013a\u013b\7T\2\2\u013b\u013c\7H\2\2\u013c"+
		"\u013d\7Q\2\2\u013d\u013e\7T\2\2\u013e\u013f\7O\2\2\u013f\66\3\2\2\2\u0140"+
		"\u0141\7K\2\2\u0141\u0142\7P\2\2\u0142\u0143\7E\2\2\u0143\u0144\7N\2\2"+
		"\u0144\u0145\7W\2\2\u0145\u0146\7F\2\2\u0146\u0147\7G\2\2\u01478\3\2\2"+
		"\2\u0148\u0149\7K\2\2\u0149\u014a\7H\2\2\u014a:\3\2\2\2\u014b\u014c\7"+
		"G\2\2\u014c\u014d\7N\2\2\u014d\u014e\7U\2\2\u014e\u014f\7G\2\2\u014f<"+
		"\3\2\2\2\u0150\u0151\7F\2\2\u0151\u0152\7G\2\2\u0152\u0153\7E\2\2\u0153"+
		"\u0154\7K\2\2\u0154\u0155\7F\2\2\u0155\u0156\7G\2\2\u0156>\3\2\2\2\u0157"+
		"\u0158\7E\2\2\u0158\u0159\7Q\2\2\u0159\u015a\7O\2\2\u015a\u015b\7R\2\2"+
		"\u015b\u015c\7W\2\2\u015c\u015d\7V\2\2\u015d\u015e\7G\2\2\u015e@\3\2\2"+
		"\2\u015f\u0160\7O\2\2\u0160\u0161\7Q\2\2\u0161\u0162\7X\2\2\u0162\u0163"+
		"\7G\2\2\u0163B\3\2\2\2\u0164\u0165\7C\2\2\u0165\u0166\7U\2\2\u0166\u0167"+
		"\7U\2\2\u0167\u0168\7K\2\2\u0168\u0169\7I\2\2\u0169\u016a\7P\2\2\u016a"+
		"D\3\2\2\2\u016b\u016c\7T\2\2\u016c\u016d\7G\2\2\u016d\u016e\7K\2\2\u016e"+
		"\u016f\7P\2\2\u016f\u0170\7R\2\2\u0170\u0171\7W\2\2\u0171\u0172\7V\2\2"+
		"\u0172F\3\2\2\2\u0173\u0174\7K\2\2\u0174\u0175\7P\2\2\u0175\u0176\7R\2"+
		"\2\u0176\u0177\7W\2\2\u0177\u0178\7V\2\2\u0178H\3\2\2\2\u0179\u017a\7"+
		"Y\2\2\u017a\u017b\7T\2\2\u017b\u017c\7K\2\2\u017c\u017d\7V\2\2\u017d\u017e"+
		"\7G\2\2\u017eJ\3\2\2\2\u017f\u0180\7F\2\2\u0180\u0181\7K\2\2\u0181\u0182"+
		"\7U\2\2\u0182\u0183\7R\2\2\u0183\u0184\7N\2\2\u0184\u0185\7C\2\2\u0185"+
		"\u0186\7[\2\2\u0186L\3\2\2\2\u0187\u0188\7Q\2\2\u0188\u0189\7P\2\2\u0189"+
		"N\3\2\2\2\u018a\u018b\7X\2\2\u018b\u018c\7C\2\2\u018c\u018d\7N\2\2\u018d"+
		"\u018e\7W\2\2\u018e\u018f\7G\2\2\u018fP\3\2\2\2\u0190\u0191\7G\2\2\u0191"+
		"\u0192\7U\2\2\u0192\u0193\7E\2\2\u0193\u0194\7C\2\2\u0194\u0195\7R\2\2"+
		"\u0195\u0196\7G\2\2\u0196R\3\2\2\2\u0197\u0198\7G\2\2\u0198\u0199\7P\2"+
		"\2\u0199\u019a\7F\2\2\u019aT\3\2\2\2\u019b\u019c\7,\2\2\u019cV\3\2\2\2"+
		"\u019d\u019e\7.\2\2\u019eX\3\2\2\2\u019f\u01a0\7\60\2\2\u01a0Z\3\2\2\2"+
		"\u01a1\u01a2\7<\2\2\u01a2\\\3\2\2\2\u01a3\u01a4\7*\2\2\u01a4^\3\2\2\2"+
		"\u01a5\u01a6\7+\2\2\u01a6`\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8b\3\2\2\2\u01a9"+
		"\u01af\7)\2\2\u01aa\u01ae\n\4\2\2\u01ab\u01ac\7)\2\2\u01ac\u01ae\7)\2"+
		"\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\7)\2\2\u01b3d\3\2\2\2\u01b4\u01b6\t\5\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8f\3\2\2\2"+
		"\u01b9\u01bd\t\6\2\2\u01ba\u01bc\t\7\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01beh\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\13\2\2\2\u01c1j\3\2\2\2\f\2nu{\u00ad\u00c6"+
		"\u01ad\u01af\u01b7\u01bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}