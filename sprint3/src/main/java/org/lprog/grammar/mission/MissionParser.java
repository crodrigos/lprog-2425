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
		T__9=10, MISSION=11, ID=12, DATE=13, DRONE=14, POINT=15, WS=16;
	public static final int
		RULE_mission = 0, RULE_body = 1, RULE_keyValuePair = 2, RULE_list = 3, 
		RULE_listBody = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"mission", "body", "keyValuePair", "list", "listBody"
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

	public static class MissionContext extends ParserRuleContext {
		public TerminalNode MISSION() { return getToken(MissionParser.MISSION, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MissionParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(MISSION);
			setState(11);
			match(T__0);
			setState(12);
			match(T__1);
			setState(13);
			body();
			setState(14);
			match(T__2);
			setState(15);
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
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(17);
				keyValuePair();
				setState(18);
				match(T__3);
				}
				}
				setState(24);
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
	public static class MissionIDContext extends KeyValuePairContext {
		public TerminalNode ID() { return getToken(MissionParser.ID, 0); }
		public MissionIDContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterMissionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitMissionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitMissionID(this);
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
	public static class DroneSerialNumberContext extends KeyValuePairContext {
		public TerminalNode DRONE() { return getToken(MissionParser.DRONE, 0); }
		public DroneSerialNumberContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).enterDroneSerialNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissionListener ) ((MissionListener)listener).exitDroneSerialNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissionVisitor ) return ((MissionVisitor<? extends T>)visitor).visitDroneSerialNumber(this);
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
		enterRule(_localctx, 4, RULE_keyValuePair);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new MissionIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__4);
				setState(26);
				match(T__0);
				setState(27);
				match(ID);
				}
				break;
			case T__5:
				_localctx = new StaringTimeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T__5);
				setState(29);
				match(T__0);
				setState(30);
				match(DATE);
				}
				break;
			case T__6:
				_localctx = new DroneSerialNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(T__6);
				setState(32);
				match(T__0);
				setState(33);
				match(DRONE);
				}
				break;
			case T__7:
				_localctx = new StartingPointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(T__7);
				setState(35);
				match(T__0);
				setState(36);
				match(POINT);
				}
				break;
			case T__8:
				_localctx = new ListOfDeliveriesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(T__8);
				setState(38);
				match(T__0);
				setState(39);
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
		enterRule(_localctx, 6, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			listBody();
			setState(44);
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
		enterRule(_localctx, 8, RULE_listBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(46);
				match(T__9);
				setState(47);
				match(POINT);
				}
				}
				setState(52);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\228\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"\27\n\3\f\3\16\3\32\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6\63\n\6\f\6\16\6\66"+
		"\13\6\3\6\2\2\7\2\4\6\b\n\2\2\28\2\f\3\2\2\2\4\30\3\2\2\2\6*\3\2\2\2\b"+
		",\3\2\2\2\n\64\3\2\2\2\f\r\7\r\2\2\r\16\7\3\2\2\16\17\7\4\2\2\17\20\5"+
		"\4\3\2\20\21\7\5\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\5\6\4\2\24\25\7"+
		"\6\2\2\25\27\3\2\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\5\3\2\2\2\32\30\3\2\2\2\33\34\7\7\2\2\34\35\7\3\2\2\35+\7\16"+
		"\2\2\36\37\7\b\2\2\37 \7\3\2\2 +\7\17\2\2!\"\7\t\2\2\"#\7\3\2\2#+\7\20"+
		"\2\2$%\7\n\2\2%&\7\3\2\2&+\7\21\2\2\'(\7\13\2\2()\7\3\2\2)+\5\b\5\2*\33"+
		"\3\2\2\2*\36\3\2\2\2*!\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+\7\3\2\2\2,-\7\4\2"+
		"\2-.\5\n\6\2./\7\5\2\2/\t\3\2\2\2\60\61\7\f\2\2\61\63\7\21\2\2\62\60\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3"+
		"\2\2\2\5\30*\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}