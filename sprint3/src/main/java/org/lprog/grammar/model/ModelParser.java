// Generated from model/Model.g4 by ANTLR 4.9.3
package model;

    package org.lprog.grammar.model;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MODEL=9, 
		NUMBER=10, ALPHANUMERIC=11, STRING=12, WS=13, COLON=14, SEMI=15, COMMA=16, 
		LBRACE=17, RBRACE=18, LBRACK=19, RBRACK=20;
	public static final int
		RULE_model = 0, RULE_structureBody = 1, RULE_keyValuePair = 2, RULE_list = 3, 
		RULE_listBody = 4, RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "structureBody", "keyValuePair", "list", "listBody", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NM'", "'CC'", "'AT'", "'VC'", "'VS'", "'VD'", "'SS'", "'LO'", 
			"'Model'", null, null, null, null, "':'", "';'", "','", "'{'", "'}'", 
			"'['", "']'"
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

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(ModelParser.MODEL, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(ModelParser.LBRACE, 0); }
		public StructureBodyContext structureBody() {
			return getRuleContext(StructureBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ModelParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(MODEL);
			setState(13);
			match(COLON);
			setState(14);
			match(LBRACE);
			setState(15);
			structureBody();
			setState(16);
			match(RBRACE);
			setState(17);
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

	public static class StructureBodyContext extends ParserRuleContext {
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ModelParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ModelParser.SEMI, i);
		}
		public StructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitStructureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitStructureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureBodyContext structureBody() throws RecognitionException {
		StructureBodyContext _localctx = new StructureBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structureBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(19);
				keyValuePair();
				setState(20);
				match(SEMI);
				}
				}
				setState(26);
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
	public static class SensorsFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SensorsFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSensorsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSensorsField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSensorsField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LimitationsFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LimitationsFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLimitationsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLimitationsField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLimitationsField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiftingVelocityFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ModelParser.NUMBER, 0); }
		public LiftingVelocityFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLiftingVelocityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLiftingVelocityField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLiftingVelocityField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LandingVelocityFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ModelParser.NUMBER, 0); }
		public LandingVelocityFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLandingVelocityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLandingVelocityField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLandingVelocityField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CruisingVelocityFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ModelParser.NUMBER, 0); }
		public CruisingVelocityFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterCruisingVelocityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitCruisingVelocityField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCruisingVelocityField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(ModelParser.ALPHANUMERIC, 0); }
		public NameFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterNameField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitNameField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNameField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AutonomyFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ModelParser.NUMBER, 0); }
		public AutonomyFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterAutonomyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitAutonomyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAutonomyField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CargoCapacityFieldContext extends KeyValuePairContext {
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(ModelParser.NUMBER, 0); }
		public CargoCapacityFieldContext(KeyValuePairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterCargoCapacityField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitCargoCapacityField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCargoCapacityField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keyValuePair);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NameFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__0);
				setState(28);
				match(COLON);
				setState(29);
				match(ALPHANUMERIC);
				}
				break;
			case T__1:
				_localctx = new CargoCapacityFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__1);
				setState(31);
				match(COLON);
				setState(32);
				match(NUMBER);
				}
				break;
			case T__2:
				_localctx = new AutonomyFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__2);
				setState(34);
				match(COLON);
				setState(35);
				match(NUMBER);
				}
				break;
			case T__3:
				_localctx = new CruisingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(T__3);
				setState(37);
				match(COLON);
				setState(38);
				match(NUMBER);
				}
				break;
			case T__4:
				_localctx = new LiftingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(T__4);
				setState(40);
				match(COLON);
				setState(41);
				match(NUMBER);
				}
				break;
			case T__5:
				_localctx = new LandingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				match(T__5);
				setState(43);
				match(COLON);
				setState(44);
				match(NUMBER);
				}
				break;
			case T__6:
				_localctx = new SensorsFieldContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				match(T__6);
				setState(46);
				match(COLON);
				setState(47);
				list();
				}
				break;
			case T__7:
				_localctx = new LimitationsFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(T__7);
				setState(49);
				match(COLON);
				setState(50);
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
		public TerminalNode LBRACK() { return getToken(ModelParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ModelParser.RBRACK, 0); }
		public ListBodyContext listBody() {
			return getRuleContext(ListBodyContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LBRACK);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHANUMERIC || _la==STRING) {
				{
				setState(54);
				listBody();
				}
			}

			setState(57);
			match(RBRACK);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ModelParser.COMMA, i);
		}
		public ListBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterListBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitListBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListBody(this);
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
			setState(59);
			value();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				value();
				}
				}
				setState(66);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(ModelParser.ALPHANUMERIC, 0); }
		public TerminalNode STRING() { return getToken(ModelParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==ALPHANUMERIC || _la==STRING) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n\4"+
		"\3\5\3\5\5\5:\n\5\3\5\3\5\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3\7\3\7"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\r\16\2K\2\16\3\2\2\2\4\32\3\2\2\2\6\65"+
		"\3\2\2\2\b\67\3\2\2\2\n=\3\2\2\2\fE\3\2\2\2\16\17\7\13\2\2\17\20\7\20"+
		"\2\2\20\21\7\23\2\2\21\22\5\4\3\2\22\23\7\24\2\2\23\24\7\2\2\3\24\3\3"+
		"\2\2\2\25\26\5\6\4\2\26\27\7\21\2\2\27\31\3\2\2\2\30\25\3\2\2\2\31\34"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36"+
		"\7\3\2\2\36\37\7\20\2\2\37\66\7\r\2\2 !\7\4\2\2!\"\7\20\2\2\"\66\7\f\2"+
		"\2#$\7\5\2\2$%\7\20\2\2%\66\7\f\2\2&\'\7\6\2\2\'(\7\20\2\2(\66\7\f\2\2"+
		")*\7\7\2\2*+\7\20\2\2+\66\7\f\2\2,-\7\b\2\2-.\7\20\2\2.\66\7\f\2\2/\60"+
		"\7\t\2\2\60\61\7\20\2\2\61\66\5\b\5\2\62\63\7\n\2\2\63\64\7\20\2\2\64"+
		"\66\5\b\5\2\65\35\3\2\2\2\65 \3\2\2\2\65#\3\2\2\2\65&\3\2\2\2\65)\3\2"+
		"\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\7\3\2\2\2\679\7\25\2\28"+
		":\5\n\6\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\26\2\2<\t\3\2\2\2=B\5\f\7"+
		"\2>?\7\22\2\2?A\5\f\7\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\13\3"+
		"\2\2\2DB\3\2\2\2EF\t\2\2\2F\r\3\2\2\2\6\32\659B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}