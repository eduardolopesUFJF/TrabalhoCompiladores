// Generated from C:/temp/TrabalhoCompiladores/AnaliseSintatica/src/gramaticas\Portuga.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT=37, CHAR=38, ID=39, 
		TYID=40, WS=41;
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
		null, "'programa'", "'registro'", "'{'", "'}'", "'('", "')'", "'vars'", 
		"':'", "';'", "','", "'instancie'", "'escreva'", "'leia'", "'='", "'retorne'", 
		"'enquanto'", "'se'", "'senao'", "'&'", "'|'", "'=='", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'V'", "'F'", "'.'", "'['", "']'", "'Bool'", 
		"'Char'", "'Int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "CHAR", "ID", "TYID", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__33:
			case T__34:
			case T__35:
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
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
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
			match(T__7);
			setState(98);
			varDecList(0);
			setState(99);
			match(T__8);
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
			setState(102);
			varDec();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
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
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(T__9);
					setState(106);
					varDec();
					}
					} 
				}
				setState(111);
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
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			type(0);
			setState(113);
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
			setState(116);
			cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
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
					setState(118);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(119);
					cmd();
					}
					} 
				}
				setState(124);
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
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				singlecmd();
				setState(126);
				match(T__8);
				}
				break;
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
	}

	public final SinglecmdContext singlecmd() throws RecognitionException {
		SinglecmdContext _localctx = new SinglecmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singlecmd);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__10);
				setState(132);
				variable(0);
				setState(133);
				cexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__11);
				setState(136);
				match(T__4);
				setState(137);
				cexpr(0);
				setState(138);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__12);
				setState(141);
				match(T__4);
				setState(142);
				variable(0);
				setState(143);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				variable(0);
				setState(146);
				match(T__13);
				setState(147);
				cexpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(ID);
				setState(150);
				match(T__4);
				setState(151);
				paramList();
				setState(152);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__4);
				setState(156);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				match(T__14);
				setState(158);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__15);
				setState(162);
				match(T__4);
				setState(163);
				cexpr(0);
				setState(164);
				match(T__5);
				setState(165);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__16);
				setState(168);
				match(T__4);
				setState(169);
				cexpr(0);
				setState(170);
				match(T__5);
				setState(171);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__16);
				setState(174);
				match(T__4);
				setState(175);
				cexpr(0);
				setState(176);
				match(T__5);
				setState(177);
				block();
				setState(178);
				match(T__17);
				setState(179);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(184);
				expr(0);
				setState(185);
				((CexprContext)_localctx).op = match(T__20);
				setState(186);
				expr(0);
				}
				break;
			case 2:
				{
				setState(188);
				expr(0);
				setState(189);
				((CexprContext)_localctx).op = match(T__21);
				setState(190);
				expr(0);
				}
				break;
			case 3:
				{
				setState(192);
				expr(0);
				setState(193);
				((CexprContext)_localctx).op = match(T__22);
				setState(194);
				expr(0);
				}
				break;
			case 4:
				{
				setState(196);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						((CexprContext)_localctx).op = match(T__18);
						setState(201);
						cexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(202);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(203);
						((CexprContext)_localctx).op = match(T__19);
						setState(204);
						cexpr(6);
						}
						break;
					}
					} 
				}
				setState(209);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(211);
				match(INT);
				}
				break;
			case 2:
				{
				setState(212);
				match(T__28);
				}
				break;
			case 3:
				{
				setState(213);
				match(T__29);
				}
				break;
			case 4:
				{
				setState(214);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(215);
				match(T__4);
				setState(216);
				cexpr(0);
				setState(217);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__4);
				setState(221);
				paramList();
				setState(222);
				match(T__5);
				}
				break;
			case 7:
				{
				setState(224);
				match(ID);
				setState(225);
				match(T__4);
				setState(226);
				match(T__5);
				}
				break;
			case 8:
				{
				setState(227);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						match(T__23);
						setState(232);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						match(T__24);
						setState(235);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						match(T__25);
						setState(238);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						match(T__26);
						setState(241);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(243);
						match(T__27);
						setState(244);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(249);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(251);
				match(ID);
				}
				break;
			case 2:
				{
				setState(252);
				match(ID);
				setState(253);
				indexes(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
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
					setState(256);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(257);
					match(T__30);
					setState(258);
					variable(2);
					}
					} 
				}
				setState(263);
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
			setState(265);
			match(T__31);
			setState(266);
			expr(0);
			setState(267);
			match(T__32);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
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
					setState(269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(270);
					match(T__31);
					setState(271);
					expr(0);
					setState(272);
					match(T__32);
					}
					} 
				}
				setState(278);
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(280);
				match(T__33);
				}
				break;
			case T__34:
				{
				setState(281);
				match(T__34);
				}
				break;
			case TYID:
				{
				setState(282);
				match(TYID);
				}
				break;
			case T__35:
				{
				setState(283);
				match(T__35);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
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
					setState(286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(287);
					match(T__31);
					setState(288);
					match(T__32);
					}
					} 
				}
				setState(293);
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
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramList);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				variable(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				variable(0);
				setState(296);
				match(T__9);
				setState(297);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3\r\3\r\5\r\u0084\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00c8\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16"+
		"\21\u00fb\13\21\3\22\3\22\3\22\3\22\5\22\u0101\n\22\3\22\3\22\3\22\7\22"+
		"\u0106\n\22\f\22\16\22\u0109\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0115\n\23\f\23\16\23\u0118\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u011f\n\24\3\24\3\24\3\24\7\24\u0124\n\24\f\24\16\24\u0127"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\5\25\u012e\n\25\3\25\2\t\22\26\36 \"$"+
		"&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0144\2\62\3\2"+
		"\2\2\48\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2"+
		"\2\20b\3\2\2\2\22g\3\2\2\2\24r\3\2\2\2\26u\3\2\2\2\30\u0083\3\2\2\2\32"+
		"\u00a1\3\2\2\2\34\u00b7\3\2\2\2\36\u00c7\3\2\2\2 \u00e6\3\2\2\2\"\u0100"+
		"\3\2\2\2$\u010a\3\2\2\2&\u011e\3\2\2\2(\u012d\3\2\2\2*+\5\4\3\2+,\7\3"+
		"\2\2,-\7*\2\2-.\5\f\7\2.\63\3\2\2\2/\60\7\3\2\2\60\61\7*\2\2\61\63\5\f"+
		"\7\2\62*\3\2\2\2\62/\3\2\2\2\63\3\3\2\2\2\64\65\5\6\4\2\65\66\5\4\3\2"+
		"\669\3\2\2\2\679\5\6\4\28\64\3\2\2\28\67\3\2\2\29\5\3\2\2\2:=\5\n\6\2"+
		";=\5\b\5\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7\4\2\2?@\7*\2\2@A\7\5\2\2"+
		"AB\5\22\n\2BC\7\6\2\2C\t\3\2\2\2DE\5&\24\2EF\7)\2\2FG\7\7\2\2GH\7\b\2"+
		"\2HI\5\f\7\2IR\3\2\2\2JK\5&\24\2KL\7)\2\2LM\7\7\2\2MN\5\22\n\2NO\7\b\2"+
		"\2OP\5\f\7\2PR\3\2\2\2QD\3\2\2\2QJ\3\2\2\2R\13\3\2\2\2ST\7\5\2\2TU\5\20"+
		"\t\2UV\5\26\f\2VW\7\6\2\2W]\3\2\2\2XY\7\5\2\2YZ\5\26\f\2Z[\7\6\2\2[]\3"+
		"\2\2\2\\S\3\2\2\2\\X\3\2\2\2]\r\3\2\2\2^_\7\5\2\2_`\5\26\f\2`a\7\6\2\2"+
		"a\17\3\2\2\2bc\7\t\2\2cd\7\n\2\2de\5\22\n\2ef\7\13\2\2f\21\3\2\2\2gh\b"+
		"\n\1\2hi\5\24\13\2io\3\2\2\2jk\f\4\2\2kl\7\f\2\2ln\5\24\13\2mj\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qo\3\2\2\2rs\5&\24\2st\7)\2"+
		"\2t\25\3\2\2\2uv\b\f\1\2vw\5\30\r\2w|\3\2\2\2xy\f\4\2\2y{\5\30\r\2zx\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|\3\2\2\2\177\u0080\5"+
		"\32\16\2\u0080\u0081\7\13\2\2\u0081\u0084\3\2\2\2\u0082\u0084\5\34\17"+
		"\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086"+
		"\7\r\2\2\u0086\u0087\5\"\22\2\u0087\u0088\5\36\20\2\u0088\u00a2\3\2\2"+
		"\2\u0089\u008a\7\16\2\2\u008a\u008b\7\7\2\2\u008b\u008c\5\36\20\2\u008c"+
		"\u008d\7\b\2\2\u008d\u00a2\3\2\2\2\u008e\u008f\7\17\2\2\u008f\u0090\7"+
		"\7\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7\b\2\2\u0092\u00a2\3\2\2\2\u0093"+
		"\u0094\5\"\22\2\u0094\u0095\7\20\2\2\u0095\u0096\5\36\20\2\u0096\u00a2"+
		"\3\2\2\2\u0097\u0098\7)\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5(\25\2\u009a"+
		"\u009b\7\b\2\2\u009b\u00a2\3\2\2\2\u009c\u009d\7)\2\2\u009d\u009e\7\7"+
		"\2\2\u009e\u00a2\7\b\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\5\36\20\2\u00a1"+
		"\u0085\3\2\2\2\u00a1\u0089\3\2\2\2\u00a1\u008e\3\2\2\2\u00a1\u0093\3\2"+
		"\2\2\u00a1\u0097\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\33\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\5\36"+
		"\20\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00b8\3\2\2\2\u00a9"+
		"\u00aa\7\23\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad"+
		"\7\b\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\7\23\2\2"+
		"\u00b0\u00b1\7\7\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4"+
		"\5\16\b\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b8\3\2\2"+
		"\2\u00b7\u00a3\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00af\3\2\2\2\u00b8\35"+
		"\3\2\2\2\u00b9\u00ba\b\20\1\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\27\2\2"+
		"\u00bc\u00bd\5 \21\2\u00bd\u00c8\3\2\2\2\u00be\u00bf\5 \21\2\u00bf\u00c0"+
		"\7\30\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3\5 \21\2"+
		"\u00c3\u00c4\7\31\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8"+
		"\5 \21\2\u00c7\u00b9\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\f\b\2\2\u00ca\u00cb\7\25"+
		"\2\2\u00cb\u00d0\5\36\20\t\u00cc\u00cd\f\7\2\2\u00cd\u00ce\7\26\2\2\u00ce"+
		"\u00d0\5\36\20\b\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\37\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\b\21\1\2\u00d5\u00e7\7\'\2\2\u00d6\u00e7\7"+
		"\37\2\2\u00d7\u00e7\7 \2\2\u00d8\u00e7\7(\2\2\u00d9\u00da\7\7\2\2\u00da"+
		"\u00db\5\36\20\2\u00db\u00dc\7\b\2\2\u00dc\u00e7\3\2\2\2\u00dd\u00de\7"+
		")\2\2\u00de\u00df\7\7\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\u00e7\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e7\7\b"+
		"\2\2\u00e5\u00e7\7)\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00d6\3\2\2\2\u00e6"+
		"\u00d7\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00dd\3\2"+
		"\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f9\3\2\2\2\u00e8"+
		"\u00e9\f\17\2\2\u00e9\u00ea\7\32\2\2\u00ea\u00f8\5 \21\20\u00eb\u00ec"+
		"\f\16\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00f8\5 \21\17\u00ee\u00ef\f\r\2"+
		"\2\u00ef\u00f0\7\34\2\2\u00f0\u00f8\5 \21\16\u00f1\u00f2\f\f\2\2\u00f2"+
		"\u00f3\7\35\2\2\u00f3\u00f8\5 \21\r\u00f4\u00f5\f\13\2\2\u00f5\u00f6\7"+
		"\36\2\2\u00f6\u00f8\5 \21\f\u00f7\u00e8\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\b\22\1\2\u00fd\u0101\7)\2\2\u00fe\u00ff\7)\2\2\u00ff"+
		"\u0101\5$\23\2\u0100\u00fc\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0107\3\2"+
		"\2\2\u0102\u0103\f\3\2\2\u0103\u0104\7!\2\2\u0104\u0106\5\"\22\4\u0105"+
		"\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108#\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b\23\1\2\u010b\u010c"+
		"\7\"\2\2\u010c\u010d\5 \21\2\u010d\u010e\7#\2\2\u010e\u0116\3\2\2\2\u010f"+
		"\u0110\f\3\2\2\u0110\u0111\7\"\2\2\u0111\u0112\5 \21\2\u0112\u0113\7#"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117%\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0119\u011a\b\24\1\2\u011a\u011f\7$\2\2\u011b\u011f\7%\2\2\u011c\u011f"+
		"\7*\2\2\u011d\u011f\7&\2\2\u011e\u0119\3\2\2\2\u011e\u011b\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u0121\f\3"+
		"\2\2\u0121\u0122\7\"\2\2\u0122\u0124\7#\2\2\u0123\u0120\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\'\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0128\u012e\5\"\22\2\u0129\u012a\5\"\22\2\u012a\u012b"+
		"\7\f\2\2\u012b\u012c\5(\25\2\u012c\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012e)\3\2\2\2\30\628<Q\\o|\u0083\u00a1\u00b7\u00c7\u00cf"+
		"\u00d1\u00e6\u00f7\u00f9\u0100\u0107\u0116\u011e\u0125\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}