// Generated from org/lprog/grammar/drone/DroneFleet.g4 by ANTLR 4.9.3
package org.lprog.grammar.drone;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DroneFleetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STATUS=14, IDENT=15, STRING=16, 
		INT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "STATUS", "IDENT", "STRING", "INT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'drone'", "':'", "'{'", "'}'", "'SN'", "';'", "'TV'", "'MD'", 
			"'RT'", "'['", "']'", "'EA'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STATUS", "IDENT", "STRING", "INT", "WS"
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


	public DroneFleetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DroneFleet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17_\n\17\3\20\3\20\7\20"+
		"c\n\20\f\20\16\20f\13\20\3\21\3\21\7\21j\n\21\f\21\16\21m\13\21\3\21\3"+
		"\21\3\22\6\22r\n\22\r\22\16\22s\3\23\6\23w\n\23\r\23\16\23x\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\7\5\2C\\aac|\7\2//\62;C\\aac|\5\2\f\f\17"+
		"\17$$\3\2\62;\5\2\13\f\17\17\"\"\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5-"+
		"\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\66\3\2\2\2\178\3\2\2"+
		"\2\21;\3\2\2\2\23>\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33H\3\2"+
		"\2\2\35^\3\2\2\2\37`\3\2\2\2!g\3\2\2\2#q\3\2\2\2%v\3\2\2\2\'(\7f\2\2("+
		")\7t\2\2)*\7q\2\2*+\7p\2\2+,\7g\2\2,\4\3\2\2\2-.\7<\2\2.\6\3\2\2\2/\60"+
		"\7}\2\2\60\b\3\2\2\2\61\62\7\177\2\2\62\n\3\2\2\2\63\64\7U\2\2\64\65\7"+
		"P\2\2\65\f\3\2\2\2\66\67\7=\2\2\67\16\3\2\2\289\7V\2\29:\7X\2\2:\20\3"+
		"\2\2\2;<\7O\2\2<=\7F\2\2=\22\3\2\2\2>?\7T\2\2?@\7V\2\2@\24\3\2\2\2AB\7"+
		"]\2\2B\26\3\2\2\2CD\7_\2\2D\30\3\2\2\2EF\7G\2\2FG\7C\2\2G\32\3\2\2\2H"+
		"I\7.\2\2I\34\3\2\2\2JK\7H\2\2KL\7N\2\2LM\7[\2\2M_\7P\2\2NO\7K\2\2OP\7"+
		"F\2\2PQ\7N\2\2Q_\7G\2\2RS\7E\2\2ST\7J\2\2TU\7T\2\2U_\7I\2\2VW\7O\2\2W"+
		"X\7P\2\2XY\7V\2\2Y_\7E\2\2Z[\7W\2\2[\\\7P\2\2\\]\7C\2\2]_\7X\2\2^J\3\2"+
		"\2\2^N\3\2\2\2^R\3\2\2\2^V\3\2\2\2^Z\3\2\2\2_\36\3\2\2\2`d\t\2\2\2ac\t"+
		"\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e \3\2\2\2fd\3\2\2\2gk\7"+
		"$\2\2hj\n\4\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3"+
		"\2\2\2no\7$\2\2o\"\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2t$\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3"+
		"\2\2\2z{\b\23\2\2{&\3\2\2\2\t\2^bdksx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}