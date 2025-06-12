// Generated from org/lprog/grammar/mission/Mission.g4 by ANTLR 4.9.3
package org.lprog.grammar.mission;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MissionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MISSION=11, ID=12, DATE=13, DRONE=14, POINT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "MISSION", "ID", "DATE", "DRONE", "POINT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "';'", "'ID'", "'STT'", "'SN'", "'STP'", "'deliveries'", 
			"','", "'mission'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MISSION", 
			"ID", "DATE", "DRONE", "POINT", "WS"
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


	public MissionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mission.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			DATE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void DATE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			4
			break;
		case 1:
			2
			break;
		case 2:
			2
			break;
		case 3:
			2
			break;
		case 4:
			2
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rP\n\r\r\r\16\rQ\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17d\n\17"+
		"\r\17\16\17e\3\17\3\17\6\17j\n\17\r\17\16\17k\3\20\3\20\6\20p\n\20\r\20"+
		"\16\20q\3\20\3\20\6\20v\n\20\r\20\16\20w\3\20\3\20\6\20|\n\20\r\20\16"+
		"\20}\3\20\3\20\3\21\6\21\u0083\n\21\r\21\16\21\u0084\3\21\3\21\2\2\22"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22\3\2\6\4\2\62;C\\\3\2\62;\3\2C\\\5\2\13\f\17\17\"\"\2\u008e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2"+
		"\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r.\3\2\2\2\17\62\3"+
		"\2\2\2\21\65\3\2\2\2\239\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31O\3\2\2\2\33"+
		"S\3\2\2\2\35c\3\2\2\2\37m\3\2\2\2!\u0082\3\2\2\2#$\7<\2\2$\4\3\2\2\2%"+
		"&\7}\2\2&\6\3\2\2\2\'(\7\177\2\2(\b\3\2\2\2)*\7=\2\2*\n\3\2\2\2+,\7K\2"+
		"\2,-\7F\2\2-\f\3\2\2\2./\7U\2\2/\60\7V\2\2\60\61\7V\2\2\61\16\3\2\2\2"+
		"\62\63\7U\2\2\63\64\7P\2\2\64\20\3\2\2\2\65\66\7U\2\2\66\67\7V\2\2\67"+
		"8\7R\2\28\22\3\2\2\29:\7f\2\2:;\7g\2\2;<\7n\2\2<=\7k\2\2=>\7x\2\2>?\7"+
		"g\2\2?@\7t\2\2@A\7k\2\2AB\7g\2\2BC\7u\2\2C\24\3\2\2\2DE\7.\2\2E\26\3\2"+
		"\2\2FG\7o\2\2GH\7k\2\2HI\7u\2\2IJ\7u\2\2JK\7k\2\2KL\7q\2\2LM\7p\2\2M\30"+
		"\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\32\3\2\2\2"+
		"ST\t\3\2\2TU\b\16\2\2UV\7/\2\2VW\t\3\2\2WX\b\16\3\2XY\7/\2\2YZ\t\3\2\2"+
		"Z[\b\16\4\2[\\\7.\2\2\\]\t\3\2\2]^\b\16\5\2^_\7<\2\2_`\t\3\2\2`a\b\16"+
		"\6\2a\34\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gi\7/\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\36"+
		"\3\2\2\2mo\7*\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs"+
		"\3\2\2\2su\7.\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy"+
		"\3\2\2\2y{\7.\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7+\2\2\u0080 \3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\21\7\2\u0087\"\3\2\2\2\n\2Qekqw}\u0084\b"+
		"\3\16\2\3\16\3\3\16\4\3\16\5\3\16\6\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}