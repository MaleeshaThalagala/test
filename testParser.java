// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAME=1, ADRESS=2, INT=3, SPACE=4, NEWLINE=5, GENDER=6;
	public static final int
		RULE_fullName = 0, RULE_contact = 1, RULE_addressline = 2, RULE_gender = 3, 
		RULE_details = 4, RULE_list = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"fullName", "contact", "addressline", "gender", "details", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "' '", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAME", "ADRESS", "INT", "SPACE", "NEWLINE", "GENDER"
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FullNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public FullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFullName(this);
		}
	}

	public final FullNameContext fullName() throws RecognitionException {
		FullNameContext _localctx = new FullNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fullName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NAME);
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

	public static class ContactContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(testParser.INT, 0); }
		public ContactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterContact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitContact(this);
		}
	}

	public final ContactContext contact() throws RecognitionException {
		ContactContext _localctx = new ContactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(INT);
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

	public static class AddresslineContext extends ParserRuleContext {
		public TerminalNode ADRESS() { return getToken(testParser.ADRESS, 0); }
		public AddresslineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAddressline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAddressline(this);
		}
	}

	public final AddresslineContext addressline() throws RecognitionException {
		AddresslineContext _localctx = new AddresslineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addressline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(ADRESS);
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

	public static class GenderContext extends ParserRuleContext {
		public TerminalNode GENDER() { return getToken(testParser.GENDER, 0); }
		public GenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterGender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitGender(this);
		}
	}

	public final GenderContext gender() throws RecognitionException {
		GenderContext _localctx = new GenderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(GENDER);
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

	public static class DetailsContext extends ParserRuleContext {
		public FullNameContext fullName() {
			return getRuleContext(FullNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(testParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(testParser.NEWLINE, i);
		}
		public AddresslineContext addressline() {
			return getRuleContext(AddresslineContext.class,0);
		}
		public ContactContext contact() {
			return getRuleContext(ContactContext.class,0);
		}
		public GenderContext gender() {
			return getRuleContext(GenderContext.class,0);
		}
		public DetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_details; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDetails(this);
		}
	}

	public final DetailsContext details() throws RecognitionException {
		DetailsContext _localctx = new DetailsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_details);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			fullName();
			setState(21);
			match(NEWLINE);
			setState(22);
			addressline();
			setState(23);
			match(NEWLINE);
			setState(24);
			contact();
			setState(25);
			match(NEWLINE);
			setState(26);
			gender();
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
		public List<DetailsContext> details() {
			return getRuleContexts(DetailsContext.class);
		}
		public DetailsContext details(int i) {
			return getRuleContext(DetailsContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(28);
				details();
				}
				}
				setState(33);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7 \n\7\f\7\16\7#\13\7\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\2\2\37\2\16\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b\24\3\2\2\2"+
		"\n\26\3\2\2\2\f!\3\2\2\2\16\17\7\3\2\2\17\3\3\2\2\2\20\21\7\5\2\2\21\5"+
		"\3\2\2\2\22\23\7\4\2\2\23\7\3\2\2\2\24\25\7\b\2\2\25\t\3\2\2\2\26\27\5"+
		"\2\2\2\27\30\7\7\2\2\30\31\5\6\4\2\31\32\7\7\2\2\32\33\5\4\3\2\33\34\7"+
		"\7\2\2\34\35\5\b\5\2\35\13\3\2\2\2\36 \5\n\6\2\37\36\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"\r\3\2\2\2#!\3\2\2\2\3!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}