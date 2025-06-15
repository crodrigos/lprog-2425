// Generated from org/lprog/grammar/model/Model.g4 by ANTLR 4.9.3
package org.lprog.grammar.model;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MODEL=9, 
		NUMBER=10, ALPHANUMERIC=11, STRING=12, WS=13, COLON=14, SEMI=15, COMMA=16, 
		LBRACE=17, RBRACE=18, LBRACK=19, RBRACK=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "MODEL", 
			"NUMBER", "ALPHANUMERIC", "STRING", "WS", "COLON", "SEMI", "COMMA", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NM'", "'CC'", "'AT'", "'VC'", "'VS'", "'VD'", "'SS'", "'LO'", 
			null, null, null, null, null, "':'", "';'", "','", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MODEL", "NUMBER", 
			"ALPHANUMERIC", "STRING", "WS", "COLON", "SEMI", "COMMA", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK"
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


	public ModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\13\6\13Q\n\13\r\13\16\13R\3\f\3"+
		"\f\7\fW\n\f\f\f\16\fZ\13\f\3\r\3\r\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\r"+
		"\3\r\3\16\6\16h\n\16\r\16\16\16i\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\17\17$$//\5\2"+
		"\13\f\17\17\"\"\2\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5.\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17=\3"+
		"\2\2\2\21@\3\2\2\2\23M\3\2\2\2\25P\3\2\2\2\27T\3\2\2\2\31[\3\2\2\2\33"+
		"g\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'w\3\2"+
		"\2\2)y\3\2\2\2+,\7P\2\2,-\7O\2\2-\4\3\2\2\2./\7E\2\2/\60\7E\2\2\60\6\3"+
		"\2\2\2\61\62\7C\2\2\62\63\7V\2\2\63\b\3\2\2\2\64\65\7X\2\2\65\66\7E\2"+
		"\2\66\n\3\2\2\2\678\7X\2\289\7U\2\29\f\3\2\2\2:;\7X\2\2;<\7F\2\2<\16\3"+
		"\2\2\2=>\7U\2\2>?\7U\2\2?\20\3\2\2\2@A\7N\2\2AB\7Q\2\2B\22\3\2\2\2CD\7"+
		"O\2\2DE\7q\2\2EF\7f\2\2FG\7g\2\2GN\7n\2\2HI\7o\2\2IJ\7q\2\2JK\7f\2\2K"+
		"L\7g\2\2LN\7n\2\2MC\3\2\2\2MH\3\2\2\2N\24\3\2\2\2OQ\t\2\2\2PO\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\26\3\2\2\2TX\t\3\2\2UW\t\4\2\2VU\3\2\2"+
		"\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2ZX\3\2\2\2[a\7$\2\2\\`\n\5"+
		"\2\2]^\7$\2\2^`\7$\2\2_\\\3\2\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bd\3\2\2\2ca\3\2\2\2de\7$\2\2e\32\3\2\2\2fh\t\6\2\2gf\3\2\2\2hi\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\16\2\2l\34\3\2\2\2mn\7<\2\2n"+
		"\36\3\2\2\2op\7=\2\2p \3\2\2\2qr\7.\2\2r\"\3\2\2\2st\7}\2\2t$\3\2\2\2"+
		"uv\7\177\2\2v&\3\2\2\2wx\7]\2\2x(\3\2\2\2yz\7_\2\2z*\3\2\2\2\t\2MRX_a"+
		"i\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}