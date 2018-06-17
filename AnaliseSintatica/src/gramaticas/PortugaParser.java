// Generated from Portuga.g4 by ANTLR 4.7.1
package gramaticas;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, INT=36, CHAR=37, ID=38, TYID=39, 
		WS=40;
	public static final int
		RULE_program = 0, RULE_declList = 1, RULE_decl = 2, RULE_recordDec = 3, 
		RULE_functionDec = 4, RULE_body = 5, RULE_block = 6, RULE_varsSection = 7, 
		RULE_varDecList = 8, RULE_varDec = 9, RULE_commandList = 10, RULE_cmd = 11, 
		RULE_singlecmd = 12, RULE_stmt = 13, RULE_cexpr = 14, RULE_expr = 15, 
		RULE_variable = 16, RULE_indexes = 17, RULE_type = 18, RULE_paramList = 19;
	public static final String[] ruleNames = {
		"program", "declList", "decl", "recordDec", "functionDec", "body", "block", 
		"varsSection", "varDecList", "varDec", "commandList", "cmd", "singlecmd", 
		"stmt", "cexpr", "expr", "variable", "indexes", "type", "paramList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'registro'", "'{'", "'}'", "'('", "')'", "'vars :'", 
		"';'", "','", "'instancie'", "'escreva'", "'leia'", "'='", "'retorne'", 
		"'enquanto'", "'se'", "'senao'", "'&'", "'|'", "'=='", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'V'", "'F'", "'.'", "'['", "']'", "'Bool'", 
		"'Char'", "'Int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INT", "CHAR", "ID", "TYID", "WS"
	};
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
	public String getGrammarFileName() { return "Portuga.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public TerminalNode TYID() { return getToken(PortugaParser.TYID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__32:
			case T__33:
			case T__34:
			case TYID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declList();
				setState(41);
				match(T__0);
				setState(42);
				match(TYID);
				setState(43);
				body();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__0);
				setState(46);
				match(TYID);
				setState(47);
				body();
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

	public static class DeclListContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declList);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				decl();
				setState(51);
				declList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				decl();
				}
				break;
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

	public static class DeclContext extends ParserRuleContext {
		public FunctionDecContext functionDec() {
			return getRuleContext(FunctionDecContext.class,0);
		}
		public RecordDecContext recordDec() {
			return getRuleContext(RecordDecContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case TYID:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				functionDec();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				recordDec();
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

	public static class RecordDecContext extends ParserRuleContext {
		public TerminalNode TYID() { return getToken(PortugaParser.TYID, 0); }
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public RecordDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterRecordDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitRecordDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitRecordDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDecContext recordDec() throws RecognitionException {
		RecordDecContext _localctx = new RecordDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_recordDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			match(TYID);
			setState(62);
			match(T__2);
			setState(63);
			varDecList(0);
			setState(64);
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

	public static class FunctionDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugaParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public FunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitFunctionDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitFunctionDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecContext functionDec() throws RecognitionException {
		FunctionDecContext _localctx = new FunctionDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDec);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				type(0);
				setState(67);
				match(ID);
				setState(68);
				match(T__4);
				setState(69);
				match(T__5);
				setState(70);
				body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				type(0);
				setState(73);
				match(ID);
				setState(74);
				match(T__4);
				setState(75);
				varDecList(0);
				setState(76);
				match(T__5);
				setState(77);
				body();
				}
				break;
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
		public VarsSectionContext varsSection() {
			return getRuleContext(VarsSectionContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__2);
				setState(82);
				varsSection();
				setState(83);
				commandList(0);
				setState(84);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__2);
				setState(87);
				commandList(0);
				setState(88);
				match(T__3);
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__2);
			setState(93);
			commandList(0);
			setState(94);
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

	public static class VarsSectionContext extends ParserRuleContext {
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public VarsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterVarsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitVarsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitVarsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsSectionContext varsSection() throws RecognitionException {
		VarsSectionContext _localctx = new VarsSectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varsSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__6);
			setState(97);
			varDecList(0);
			setState(98);
			match(T__7);
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

	public static class VarDecListContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public VarDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterVarDecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitVarDecList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitVarDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecListContext varDecList() throws RecognitionException {
		return varDecList(0);
	}

	private VarDecListContext varDecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDecListContext _localctx = new VarDecListContext(_ctx, _parentState);
		VarDecListContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_varDecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			varDec();
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDecList);
					setState(103);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(104);
					match(T__8);
					setState(105);
					varDec();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugaParser.ID, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type(0);
			setState(112);
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

	public static class CommandListContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CommandListContext commandList() {
			return getRuleContext(CommandListContext.class,0);
		}
		public CommandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterCommandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitCommandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitCommandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandListContext commandList() throws RecognitionException {
		return commandList(0);
	}

	private CommandListContext commandList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommandListContext _localctx = new CommandListContext(_ctx, _parentState);
		CommandListContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_commandList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommandListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_commandList);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					cmd();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public SinglecmdContext singlecmd() {
			return getRuleContext(SinglecmdContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				singlecmd();
				setState(125);
				match(T__7);
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				stmt();
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

	public static class SinglecmdContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugaParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public SinglecmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterSinglecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitSinglecmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitSinglecmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglecmdContext singlecmd() throws RecognitionException {
		SinglecmdContext _localctx = new SinglecmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singlecmd);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__9);
				setState(131);
				variable(0);
				setState(132);
				cexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__10);
				setState(135);
				match(T__4);
				setState(136);
				cexpr(0);
				setState(137);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__11);
				setState(140);
				match(T__4);
				setState(141);
				variable(0);
				setState(142);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				variable(0);
				setState(145);
				match(T__12);
				setState(146);
				cexpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__4);
				setState(150);
				paramList();
				setState(151);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__4);
				setState(155);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(T__13);
				setState(157);
				cexpr(0);
				}
				break;
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

	public static class StmtContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__14);
				setState(161);
				match(T__4);
				setState(162);
				cexpr(0);
				setState(163);
				match(T__5);
				setState(164);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__15);
				setState(167);
				match(T__4);
				setState(168);
				cexpr(0);
				setState(169);
				match(T__5);
				setState(170);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__15);
				setState(173);
				match(T__4);
				setState(174);
				cexpr(0);
				setState(175);
				match(T__5);
				setState(176);
				block();
				setState(177);
				match(T__16);
				setState(178);
				block();
				}
				break;
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

	public static class CexprContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitCexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitCexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_cexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(183);
				expr(0);
				setState(184);
				((CexprContext)_localctx).op = match(T__19);
				setState(185);
				expr(0);
				}
				break;
			case 2:
				{
				setState(187);
				expr(0);
				setState(188);
				((CexprContext)_localctx).op = match(T__20);
				setState(189);
				expr(0);
				}
				break;
			case 3:
				{
				setState(191);
				expr(0);
				setState(192);
				((CexprContext)_localctx).op = match(T__21);
				setState(193);
				expr(0);
				}
				break;
			case 4:
				{
				setState(195);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						((CexprContext)_localctx).op = match(T__17);
						setState(200);
						cexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(202);
						((CexprContext)_localctx).op = match(T__18);
						setState(203);
						cexpr(6);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PortugaParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(PortugaParser.CHAR, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugaParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(210);
				match(INT);
				}
				break;
			case 2:
				{
				setState(211);
				match(T__27);
				}
				break;
			case 3:
				{
				setState(212);
				match(T__28);
				}
				break;
			case 4:
				{
				setState(213);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(214);
				match(T__4);
				setState(215);
				cexpr(0);
				setState(216);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__4);
				setState(220);
				paramList();
				setState(221);
				match(T__5);
				}
				break;
			case 7:
				{
				setState(223);
				match(ID);
				setState(224);
				match(T__4);
				setState(225);
				match(T__5);
				}
				break;
			case 8:
				{
				setState(226);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(230);
						match(T__22);
						setState(231);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(233);
						match(T__23);
						setState(234);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(236);
						match(T__24);
						setState(237);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						match(T__25);
						setState(240);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						match(T__26);
						setState(243);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugaParser.ID, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(250);
				match(ID);
				}
				break;
			case 2:
				{
				setState(251);
				match(ID);
				setState(252);
				indexes(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(255);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(256);
					match(T__29);
					setState(257);
					variable(2);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IndexesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		return indexes(0);
	}

	private IndexesContext indexes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IndexesContext _localctx = new IndexesContext(_ctx, _parentState);
		IndexesContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_indexes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			match(T__30);
			setState(265);
			expr(0);
			setState(266);
			match(T__31);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IndexesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_indexes);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(T__30);
					setState(270);
					expr(0);
					setState(271);
					match(T__31);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYID() { return getToken(PortugaParser.TYID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				{
				setState(279);
				match(T__32);
				}
				break;
			case T__33:
				{
				setState(280);
				match(T__33);
				}
				break;
			case TYID:
				{
				setState(281);
				match(TYID);
				}
				break;
			case T__34:
				{
				setState(282);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(285);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(286);
					match(T__30);
					setState(287);
					match(T__31);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugaListener ) ((PortugaListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugaVisitor ) return ((PortugaVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramList);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				variable(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				variable(0);
				setState(295);
				match(T__8);
				setState(296);
				paramList();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return varDecList_sempred((VarDecListContext)_localctx, predIndex);
		case 10:
			return commandList_sempred((CommandListContext)_localctx, predIndex);
		case 14:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return variable_sempred((VariableContext)_localctx, predIndex);
		case 17:
			return indexes_sempred((IndexesContext)_localctx, predIndex);
		case 18:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean varDecList_sempred(VarDecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean commandList_sempred(CommandListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean indexes_sempred(IndexesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00a1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c7"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cf\n\20\f\20\16\20\u00d2\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f7\n\21\f\21\16"+
		"\21\u00fa\13\21\3\22\3\22\3\22\3\22\5\22\u0100\n\22\3\22\3\22\3\22\7\22"+
		"\u0105\n\22\f\22\16\22\u0108\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0114\n\23\f\23\16\23\u0117\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3\24\7\24\u0123\n\24\f\24\16\24\u0126"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\5\25\u012d\n\25\3\25\2\t\22\26\36 \"$"+
		"&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0143\2\62\3\2"+
		"\2\2\48\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2"+
		"\2\20b\3\2\2\2\22f\3\2\2\2\24q\3\2\2\2\26t\3\2\2\2\30\u0082\3\2\2\2\32"+
		"\u00a0\3\2\2\2\34\u00b6\3\2\2\2\36\u00c6\3\2\2\2 \u00e5\3\2\2\2\"\u00ff"+
		"\3\2\2\2$\u0109\3\2\2\2&\u011d\3\2\2\2(\u012c\3\2\2\2*+\5\4\3\2+,\7\3"+
		"\2\2,-\7)\2\2-.\5\f\7\2.\63\3\2\2\2/\60\7\3\2\2\60\61\7)\2\2\61\63\5\f"+
		"\7\2\62*\3\2\2\2\62/\3\2\2\2\63\3\3\2\2\2\64\65\5\6\4\2\65\66\5\4\3\2"+
		"\669\3\2\2\2\679\5\6\4\28\64\3\2\2\28\67\3\2\2\29\5\3\2\2\2:=\5\n\6\2"+
		";=\5\b\5\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7\4\2\2?@\7)\2\2@A\7\5\2\2"+
		"AB\5\22\n\2BC\7\6\2\2C\t\3\2\2\2DE\5&\24\2EF\7(\2\2FG\7\7\2\2GH\7\b\2"+
		"\2HI\5\f\7\2IR\3\2\2\2JK\5&\24\2KL\7(\2\2LM\7\7\2\2MN\5\22\n\2NO\7\b\2"+
		"\2OP\5\f\7\2PR\3\2\2\2QD\3\2\2\2QJ\3\2\2\2R\13\3\2\2\2ST\7\5\2\2TU\5\20"+
		"\t\2UV\5\26\f\2VW\7\6\2\2W]\3\2\2\2XY\7\5\2\2YZ\5\26\f\2Z[\7\6\2\2[]\3"+
		"\2\2\2\\S\3\2\2\2\\X\3\2\2\2]\r\3\2\2\2^_\7\5\2\2_`\5\26\f\2`a\7\6\2\2"+
		"a\17\3\2\2\2bc\7\t\2\2cd\5\22\n\2de\7\n\2\2e\21\3\2\2\2fg\b\n\1\2gh\5"+
		"\24\13\2hn\3\2\2\2ij\f\4\2\2jk\7\13\2\2km\5\24\13\2li\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2o\23\3\2\2\2pn\3\2\2\2qr\5&\24\2rs\7(\2\2s\25\3"+
		"\2\2\2tu\b\f\1\2uv\5\30\r\2v{\3\2\2\2wx\f\4\2\2xz\5\30\r\2yw\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}{\3\2\2\2~\177\5\32\16\2\177"+
		"\u0080\7\n\2\2\u0080\u0083\3\2\2\2\u0081\u0083\5\34\17\2\u0082~\3\2\2"+
		"\2\u0082\u0081\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086"+
		"\5\"\22\2\u0086\u0087\5\36\20\2\u0087\u00a1\3\2\2\2\u0088\u0089\7\r\2"+
		"\2\u0089\u008a\7\7\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7\b\2\2\u008c"+
		"\u00a1\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u008f\7\7\2\2\u008f\u0090\5"+
		"\"\22\2\u0090\u0091\7\b\2\2\u0091\u00a1\3\2\2\2\u0092\u0093\5\"\22\2\u0093"+
		"\u0094\7\17\2\2\u0094\u0095\5\36\20\2\u0095\u00a1\3\2\2\2\u0096\u0097"+
		"\7(\2\2\u0097\u0098\7\7\2\2\u0098\u0099\5(\25\2\u0099\u009a\7\b\2\2\u009a"+
		"\u00a1\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7\7\2\2\u009d\u00a1\7\b"+
		"\2\2\u009e\u009f\7\20\2\2\u009f\u00a1\5\36\20\2\u00a0\u0084\3\2\2\2\u00a0"+
		"\u0088\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0096\3\2"+
		"\2\2\u00a0\u009b\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a3"+
		"\7\21\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7\b\2"+
		"\2\u00a6\u00a7\5\16\b\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\7\22\2\2\u00a9"+
		"\u00aa\7\7\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5"+
		"\16\b\2\u00ad\u00b7\3\2\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7\7\2\2\u00b0"+
		"\u00b1\5\36\20\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4"+
		"\7\23\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b7\3\2\2\2\u00b6\u00a2\3\2\2\2"+
		"\u00b6\u00a8\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00b9"+
		"\b\20\1\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\7\26\2\2\u00bb\u00bc\5 \21\2"+
		"\u00bc\u00c7\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\27\2\2\u00bf\u00c0"+
		"\5 \21\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\5 \21\2\u00c2\u00c3\7\30\2\2"+
		"\u00c3\u00c4\5 \21\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\5 \21\2\u00c6\u00b8"+
		"\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00d0\3\2\2\2\u00c8\u00c9\f\b\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cf\5"+
		"\36\20\t\u00cb\u00cc\f\7\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00cf\5\36\20"+
		"\b\u00ce\u00c8\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\b\21\1\2\u00d4\u00e6\7&\2\2\u00d5\u00e6\7\36\2\2\u00d6\u00e6\7"+
		"\37\2\2\u00d7\u00e6\7\'\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\36\20\2"+
		"\u00da\u00db\7\b\2\2\u00db\u00e6\3\2\2\2\u00dc\u00dd\7(\2\2\u00dd\u00de"+
		"\7\7\2\2\u00de\u00df\5(\25\2\u00df\u00e0\7\b\2\2\u00e0\u00e6\3\2\2\2\u00e1"+
		"\u00e2\7(\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e6\7\b\2\2\u00e4\u00e6\7(\2"+
		"\2\u00e5\u00d3\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00d7"+
		"\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00f8\3\2\2\2\u00e7\u00e8\f\17\2\2\u00e8\u00e9\7"+
		"\31\2\2\u00e9\u00f7\5 \21\20\u00ea\u00eb\f\16\2\2\u00eb\u00ec\7\32\2\2"+
		"\u00ec\u00f7\5 \21\17\u00ed\u00ee\f\r\2\2\u00ee\u00ef\7\33\2\2\u00ef\u00f7"+
		"\5 \21\16\u00f0\u00f1\f\f\2\2\u00f1\u00f2\7\34\2\2\u00f2\u00f7\5 \21\r"+
		"\u00f3\u00f4\f\13\2\2\u00f4\u00f5\7\35\2\2\u00f5\u00f7\5 \21\f\u00f6\u00e7"+
		"\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9!\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\b\22\1\2\u00fc\u0100"+
		"\7(\2\2\u00fd\u00fe\7(\2\2\u00fe\u0100\5$\23\2\u00ff\u00fb\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0106\3\2\2\2\u0101\u0102\f\3\2\2\u0102\u0103\7 "+
		"\2\2\u0103\u0105\5\"\22\4\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107#\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010a\b\23\1\2\u010a\u010b\7!\2\2\u010b\u010c\5 \21\2\u010c\u010d"+
		"\7\"\2\2\u010d\u0115\3\2\2\2\u010e\u010f\f\3\2\2\u010f\u0110\7!\2\2\u0110"+
		"\u0111\5 \21\2\u0111\u0112\7\"\2\2\u0112\u0114\3\2\2\2\u0113\u010e\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"%\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\b\24\1\2\u0119\u011e\7#\2\2"+
		"\u011a\u011e\7$\2\2\u011b\u011e\7)\2\2\u011c\u011e\7%\2\2\u011d\u0118"+
		"\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0124\3\2\2\2\u011f\u0120\f\3\2\2\u0120\u0121\7!\2\2\u0121\u0123\7\""+
		"\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\'\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012d\5\"\22"+
		"\2\u0128\u0129\5\"\22\2\u0129\u012a\7\13\2\2\u012a\u012b\5(\25\2\u012b"+
		"\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012d)\3\2\2\2"+
		"\30\628<Q\\n{\u0082\u00a0\u00b6\u00c6\u00ce\u00d0\u00e5\u00f6\u00f8\u00ff"+
		"\u0106\u0115\u011d\u0124\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}