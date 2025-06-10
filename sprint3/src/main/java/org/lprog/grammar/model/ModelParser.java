// Generated from org/lprog/grammar/model/Model.g4 by ANTLR 4.9.3
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
		RULE_file = 0, RULE_model = 1, RULE_structureBody = 2, RULE_keyValuePair = 3, 
		RULE_list = 4, RULE_listBody = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "model", "structureBody", "keyValuePair", "list", "listBody", 
			"value"
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public List<ModelContext> model() {
			return getRuleContexts(ModelContext.class);
		}
		public ModelContext model(int i) {
			return getRuleContext(ModelContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitFile(this);
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
			while (_la==MODEL) {
				{
				{
				setState(14);
				model();
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

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(ModelParser.MODEL, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(ModelParser.LBRACE, 0); }
		public StructureBodyContext structureBody() {
			return getRuleContext(StructureBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ModelParser.RBRACE, 0); }
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
		enterRule(_localctx, 2, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(MODEL);
			setState(23);
			match(COLON);
			setState(24);
			match(LBRACE);
			setState(25);
			structureBody();
			setState(26);
			match(RBRACE);
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
		enterRule(_localctx, 4, RULE_structureBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(28);
				keyValuePair();
				setState(29);
				match(SEMI);
				}
				}
				setState(35);
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
		enterRule(_localctx, 6, RULE_keyValuePair);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NameFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(COLON);
				setState(38);
				match(ALPHANUMERIC);
				}
				break;
			case T__1:
				_localctx = new CargoCapacityFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__1);
				setState(40);
				match(COLON);
				setState(41);
				match(NUMBER);
				}
				break;
			case T__2:
				_localctx = new AutonomyFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__2);
				setState(43);
				match(COLON);
				setState(44);
				match(NUMBER);
				}
				break;
			case T__3:
				_localctx = new CruisingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(T__3);
				setState(46);
				match(COLON);
				setState(47);
				match(NUMBER);
				}
				break;
			case T__4:
				_localctx = new LiftingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__4);
				setState(49);
				match(COLON);
				setState(50);
				match(NUMBER);
				}
				break;
			case T__5:
				_localctx = new LandingVelocityFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(T__5);
				setState(52);
				match(COLON);
				setState(53);
				match(NUMBER);
				}
				break;
			case T__6:
				_localctx = new SensorsFieldContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__6);
				setState(55);
				match(COLON);
				setState(56);
				list();
				}
				break;
			case T__7:
				_localctx = new LimitationsFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(COLON);
				setState(59);
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
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBRACK);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHANUMERIC || _la==STRING) {
				{
				setState(63);
				listBody();
				}
			}

			setState(66);
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
		enterRule(_localctx, 10, RULE_listBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			value();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				value();
				}
				}
				setState(75);
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
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\5\6C\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3"+
		"\3\2\r\16\2T\2\23\3\2\2\2\4\30\3\2\2\2\6#\3\2\2\2\b>\3\2\2\2\n@\3\2\2"+
		"\2\fF\3\2\2\2\16N\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27"+
		"\3\3\2\2\2\30\31\7\13\2\2\31\32\7\20\2\2\32\33\7\23\2\2\33\34\5\6\4\2"+
		"\34\35\7\24\2\2\35\5\3\2\2\2\36\37\5\b\5\2\37 \7\21\2\2 \"\3\2\2\2!\36"+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%#\3\2\2\2&\'\7\3\2"+
		"\2\'(\7\20\2\2(?\7\r\2\2)*\7\4\2\2*+\7\20\2\2+?\7\f\2\2,-\7\5\2\2-.\7"+
		"\20\2\2.?\7\f\2\2/\60\7\6\2\2\60\61\7\20\2\2\61?\7\f\2\2\62\63\7\7\2\2"+
		"\63\64\7\20\2\2\64?\7\f\2\2\65\66\7\b\2\2\66\67\7\20\2\2\67?\7\f\2\28"+
		"9\7\t\2\29:\7\20\2\2:?\5\n\6\2;<\7\n\2\2<=\7\20\2\2=?\5\n\6\2>&\3\2\2"+
		"\2>)\3\2\2\2>,\3\2\2\2>/\3\2\2\2>\62\3\2\2\2>\65\3\2\2\2>8\3\2\2\2>;\3"+
		"\2\2\2?\t\3\2\2\2@B\7\25\2\2AC\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2D"+
		"E\7\26\2\2E\13\3\2\2\2FK\5\16\b\2GH\7\22\2\2HJ\5\16\b\2IG\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2NO\t\2\2\2O\17\3\2\2\2"+
		"\7\23#>BK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}