// Generated from org/lprog/grammar/mission/Mission.g4 by ANTLR 4.9.3
package org.lprog.grammar.mission;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MissionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		MISSION=10, DATE=11, MODEL=12, POINT=13, WS=14;
	public static final int
		RULE_file = 0, RULE_mission = 1, RULE_missionEnd = 2, RULE_body = 3, RULE_keyValuePair = 4, 
		RULE_list = 5, RULE_listBody = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "mission", "missionEnd", "body", "keyValuePair", "list", "listBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "';'", "'STT'", "'MD'", "'STP'", "'deliveries'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "MISSION", 
			"DATE", "MODEL", "POINT", "WS"
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
	public String getGrammarFileName() { return "Mission.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MissionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MissionParser.EOF, 0); }
		public List<MissionContext> mission() {
			return getRuleContexts(MissionContext.class);
		}
		public MissionContext mission(int i) {
			return getRuleContext(MissionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MISSION) {
				{
				{
				setState(14);
				mission();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class MissionContext extends ParserRuleContext {
		public TerminalNode MISSION() { return getToken(MissionParser.MISSION, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MissionEndContext missionEnd() {
			return getRuleContext(MissionEndContext.class,0);
		}
		public MissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterMission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitMission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitMission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissionContext mission() throws RecognitionException {
		MissionContext _localctx = new MissionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(MISSION);
			setState(23);
			match(T__0);
			setState(24);
			match(T__1);
			setState(25);
			body();
			setState(26);
			missionEnd();
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

	public static class MissionEndContext extends ParserRuleContext {
		public MissionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missionEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterMissionEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitMissionEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitMissionEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissionEndContext missionEnd() throws RecognitionException {
		MissionEndContext _localctx = new MissionEndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_missionEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__2);
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

	public static class BodyContext extends ParserRuleContext {
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(30);
				keyValuePair();
				setState(31);
				match(T__3);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
	 
		public KeyValuePairContext() { }
		public void copyFrom(KeyValuePairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModelContext extends KeyValuePairContext {
		public TerminalNode MODEL() { return getToken(MissionParser.MODEL, 0); }
		public ModelContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaringTimeContext extends KeyValuePairContext {
		public TerminalNode DATE() { return getToken(MissionParser.DATE, 0); }
		public StaringTimeContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterStaringTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitStaringTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitStaringTime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListOfDeliveriesContext extends KeyValuePairContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListOfDeliveriesContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterListOfDeliveries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitListOfDeliveries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitListOfDeliveries(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartingPointContext extends KeyValuePairContext {
		public TerminalNode POINT() { return getToken(MissionParser.POINT, 0); }
		public StartingPointContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterStartingPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitStartingPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitStartingPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyValuePair);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new StaringTimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__4);
				setState(39);
				match(T__0);
				setState(40);
				match(DATE);
				}
				break;
			case T__5:
				_localctx = new ModelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__5);
				setState(42);
				match(T__0);
				setState(43);
				match(MODEL);
				}
				break;
			case T__6:
				_localctx = new StartingPointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__6);
				setState(45);
				match(T__0);
				setState(46);
				match(POINT);
				}
				break;
			case T__7:
				_localctx = new ListOfDeliveriesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__7);
				setState(48);
				match(T__0);
				setState(49);
				list();
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

	public static class ListContext extends ParserRuleContext {
		public ListBodyContext listBody() {
			return getRuleContext(ListBodyContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
			setState(53);
			listBody();
			setState(54);
			match(T__2);
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

	public static class ListBodyContext extends ParserRuleContext {
		public List<TerminalNode> POINT() { return getTokens(MissionParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(MissionParser.POINT, i);
		}
		public ListBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterListBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitListBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitListBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBodyContext listBody() throws RecognitionException {
		ListBodyContext _localctx = new ListBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(56);
				match(T__8);
				setState(57);
				match(POINT);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5$\n\5\f\5"+
		"\16\5\'\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\65\n"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\2\2@\2\23\3\2\2\2\4\30\3\2\2\2\6\36\3\2\2\2\b%\3\2\2\2\n\64\3"+
		"\2\2\2\f\66\3\2\2\2\16>\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2"+
		"\2\3\27\3\3\2\2\2\30\31\7\f\2\2\31\32\7\3\2\2\32\33\7\4\2\2\33\34\5\b"+
		"\5\2\34\35\5\6\4\2\35\5\3\2\2\2\36\37\7\5\2\2\37\7\3\2\2\2 !\5\n\6\2!"+
		"\"\7\6\2\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\t\3\2"+
		"\2\2\'%\3\2\2\2()\7\7\2\2)*\7\3\2\2*\65\7\r\2\2+,\7\b\2\2,-\7\3\2\2-\65"+
		"\7\16\2\2./\7\t\2\2/\60\7\3\2\2\60\65\7\17\2\2\61\62\7\n\2\2\62\63\7\3"+
		"\2\2\63\65\5\f\7\2\64(\3\2\2\2\64+\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\65"+
		"\13\3\2\2\2\66\67\7\4\2\2\678\5\16\b\289\7\5\2\29\r\3\2\2\2:;\7\13\2\2"+
		";=\7\17\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\17\3\2\2\2@>\3\2"+
		"\2\2\6\23%\64>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}