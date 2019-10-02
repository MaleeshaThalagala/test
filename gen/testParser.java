// Generated from /home/maleesha/Downloads/antlrtest/test.g4 by ANTLR 4.7.2
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
		NAME=1, INT=2, ID=3, SPACE=4, NEWLINE=5;
	public static final int
		RULE_firstName = 0, RULE_lastName = 1, RULE_addressline = 2, RULE_contact = 3, 
		RULE_fullname = 4, RULE_details = 5, RULE_list = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"firstName", "lastName", "addressline", "contact", "fullname", "details", 
			"list"
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
			null, "NAME", "INT", "ID", "SPACE", "NEWLINE"
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

	public static class FirstNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public FirstNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFirstName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFirstName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFirstName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstNameContext firstName() throws RecognitionException {
		FirstNameContext _localctx = new FirstNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_firstName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
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

	public static class LastNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public LastNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLastName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLastName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLastName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastNameContext lastName() throws RecognitionException {
		LastNameContext _localctx = new LastNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lastName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
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

	public static class AddresslineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAddressline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddresslineContext addressline() throws RecognitionException {
		AddresslineContext _localctx = new AddresslineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addressline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitContact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContactContext contact() throws RecognitionException {
		ContactContext _localctx = new ContactContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
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

	public static class FullnameContext extends ParserRuleContext {
		public FirstNameContext firstName() {
			return getRuleContext(FirstNameContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(testParser.SPACE, 0); }
		public LastNameContext lastName() {
			return getRuleContext(LastNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(testParser.NEWLINE, 0); }
		public FullnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFullname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFullname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFullname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullnameContext fullname() throws RecognitionException {
		FullnameContext _localctx = new FullnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fullname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			firstName();
			setState(23);
			match(SPACE);
			setState(24);
			lastName();
			setState(25);
			match(NEWLINE);
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
		public FullnameContext fullname() {
			return getRuleContext(FullnameContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public AddresslineContext addressline() {
			return getRuleContext(AddresslineContext.class,0);
		}
		public ContactContext contact() {
			return getRuleContext(ContactContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(testParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DetailsContext details() throws RecognitionException {
		DetailsContext _localctx = new DetailsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_details);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			fullname();
			setState(28);
			match(SPACE);
			setState(29);
			addressline();
			setState(30);
			match(SPACE);
			setState(31);
			contact();
			setState(32);
			match(SPACE);
			setState(33);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(35);
				details();
				}
				}
				setState(40);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\b\'\n\b"+
		"\f\b\16\b*\13\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2%\2\20\3\2\2\2\4\22\3\2"+
		"\2\2\6\24\3\2\2\2\b\26\3\2\2\2\n\30\3\2\2\2\f\35\3\2\2\2\16(\3\2\2\2\20"+
		"\21\7\3\2\2\21\3\3\2\2\2\22\23\7\3\2\2\23\5\3\2\2\2\24\25\7\5\2\2\25\7"+
		"\3\2\2\2\26\27\7\4\2\2\27\t\3\2\2\2\30\31\5\2\2\2\31\32\7\6\2\2\32\33"+
		"\5\4\3\2\33\34\7\7\2\2\34\13\3\2\2\2\35\36\5\n\6\2\36\37\7\6\2\2\37 \5"+
		"\6\4\2 !\7\6\2\2!\"\5\b\5\2\"#\7\6\2\2#$\7\7\2\2$\r\3\2\2\2%\'\5\f\7\2"+
		"&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\17\3\2\2\2*(\3\2\2\2\3(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}