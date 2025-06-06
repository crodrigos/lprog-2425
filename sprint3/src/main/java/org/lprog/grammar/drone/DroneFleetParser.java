// Generated from drone\DroneFleet.g4 by ANTLR 4.9.3
package org.lprog.grammar.drone;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DroneFleetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STATUS=14, IDENT=15, STRING=16, 
		INT=17, WS=18;
	public static final int
		RULE_fleet = 0, RULE_droneEntry = 1, RULE_atributos = 2, RULE_atributo = 3, 
		RULE_restrictionList = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"fleet", "droneEntry", "atributos", "atributo", "restrictionList"
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

	@Override
	public String getGrammarFileName() { return "DroneFleet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DroneFleetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FleetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DroneFleetParser.EOF, 0); }
		public List<DroneEntryContext> droneEntry() {
			return getRuleContexts(DroneEntryContext.class);
		}
		public DroneEntryContext droneEntry(int i) {
			return getRuleContext(DroneEntryContext.class,i);
		}
		public FleetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fleet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).enterFleet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).exitFleet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroneFleetVisitor ) return ((DroneFleetVisitor<? extends T>)visitor).visitFleet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FleetContext fleet() throws RecognitionException {
		FleetContext _localctx = new FleetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fleet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				droneEntry();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class DroneEntryContext extends ParserRuleContext {
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public DroneEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_droneEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).enterDroneEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).exitDroneEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroneFleetVisitor ) return ((DroneFleetVisitor<? extends T>)visitor).visitDroneEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DroneEntryContext droneEntry() throws RecognitionException {
		DroneEntryContext _localctx = new DroneEntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_droneEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__0);
			setState(18);
			match(T__1);
			setState(19);
			match(T__2);
			setState(20);
			atributos();
			setState(21);
			match(T__3);
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

	public static class AtributosContext extends ParserRuleContext {
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroneFleetVisitor ) return ((DroneFleetVisitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				atributo();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11))) != 0) );
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

	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DroneFleetParser.IDENT, 0); }
		public TerminalNode INT() { return getToken(DroneFleetParser.INT, 0); }
		public RestrictionListContext restrictionList() {
			return getRuleContext(RestrictionListContext.class,0);
		}
		public TerminalNode STATUS() { return getToken(DroneFleetParser.STATUS, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroneFleetVisitor ) return ((DroneFleetVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atributo);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__4);
				setState(29);
				match(T__1);
				setState(30);
				match(IDENT);
				setState(31);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__6);
				setState(33);
				match(T__1);
				setState(34);
				match(INT);
				setState(35);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__7);
				setState(37);
				match(T__1);
				setState(38);
				match(IDENT);
				setState(39);
				match(T__5);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__8);
				setState(41);
				match(T__1);
				setState(42);
				match(T__9);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(43);
					restrictionList();
					}
				}

				setState(46);
				match(T__10);
				setState(47);
				match(T__5);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__11);
				setState(49);
				match(T__1);
				setState(50);
				match(STATUS);
				setState(51);
				match(T__5);
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

	public static class RestrictionListContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(DroneFleetParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DroneFleetParser.STRING, i);
		}
		public RestrictionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).enterRestrictionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DroneFleetListener ) ((DroneFleetListener)listener).exitRestrictionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DroneFleetVisitor ) return ((DroneFleetVisitor<? extends T>)visitor).visitRestrictionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestrictionListContext restrictionList() throws RecognitionException {
		RestrictionListContext _localctx = new RestrictionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restrictionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(STRING);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(55);
				match(T__12);
				setState(56);
				match(STRING);
				}
				}
				setState(61);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24A\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\2\2\7\2\4\6\b\n"+
		"\2\2\2C\2\r\3\2\2\2\4\23\3\2\2\2\6\32\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2"+
		"\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\3\2\2\24\25\7\4\2\2\25"+
		"\26\7\5\2\2\26\27\5\6\4\2\27\30\7\6\2\2\30\5\3\2\2\2\31\33\5\b\5\2\32"+
		"\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36"+
		"\37\7\7\2\2\37 \7\4\2\2 !\7\21\2\2!\67\7\b\2\2\"#\7\t\2\2#$\7\4\2\2$%"+
		"\7\23\2\2%\67\7\b\2\2&\'\7\n\2\2\'(\7\4\2\2()\7\21\2\2)\67\7\b\2\2*+\7"+
		"\13\2\2+,\7\4\2\2,.\7\f\2\2-/\5\n\6\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2"+
		"\60\61\7\r\2\2\61\67\7\b\2\2\62\63\7\16\2\2\63\64\7\4\2\2\64\65\7\20\2"+
		"\2\65\67\7\b\2\2\66\36\3\2\2\2\66\"\3\2\2\2\66&\3\2\2\2\66*\3\2\2\2\66"+
		"\62\3\2\2\2\67\t\3\2\2\28=\7\22\2\29:\7\17\2\2:<\7\22\2\2;9\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?=\3\2\2\2\7\17\34.\66=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}