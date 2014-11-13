// Generated from C:/Users/user/Documents/IdeaProjects/toy_compilator/src/main/antlr4/innopolis/icc/toy/parser\TOY_parser.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TOY_parserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, IDENTIFIER=3, IMPORT=4, SEMICOLON=5, PUBLIC=6, CLASS=7, 
		EXTENDS=8, LBRACE=9, RBRACE=10, PRIVATE=11, STATIC=12, LPAREN=13, RPAREN=14, 
		COMMA=15, VOID=16, ASSIGN=17, LBRACKET=18, RBRACKET=19, DOT=20, IF=21, 
		ELSE=22, WHILE=23, LOOP=24, RETURN=25, PRINT=26, LESS=27, GREATER=28, 
		EQUAL=29, NOT_EQUAL=30, PLUS=31, MINUS=32, MULTIPLY=33, DIVIDE=34, NUMBER=35, 
		NULL=36, NEW=37, INT=38, REAL=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "'*'", "IDENTIFIER", "IMPORT", "SEMICOLON", "PUBLIC", 
		"CLASS", "EXTENDS", "LBRACE", "RBRACE", "PRIVATE", "STATIC", "LPAREN", 
		"RPAREN", "COMMA", "VOID", "ASSIGN", "LBRACKET", "RBRACKET", "DOT", "IF", 
		"ELSE", "WHILE", "LOOP", "RETURN", "PRINT", "LESS", "GREATER", "EQUAL", 
		"NOT_EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NUMBER", "NULL", 
		"NEW", "INT", "REAL"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_qualifiedName = 1, RULE_imports = 2, RULE_importDeclaration = 3, 
		RULE_classDeclarations = 4, RULE_classDeclaration = 5, RULE_extension = 6, 
		RULE_classBody = 7, RULE_classMembers = 8, RULE_classMember = 9, RULE_fieldDeclaration = 10, 
		RULE_visibility = 11, RULE_staticness = 12, RULE_methodDeclaration = 13, 
		RULE_parameters = 14, RULE_parameterList = 15, RULE_parameter = 16, RULE_methodType = 17, 
		RULE_body = 18, RULE_localDeclarations = 19, RULE_localDeclaration = 20, 
		RULE_statements = 21, RULE_statement = 22, RULE_assignment = 23, RULE_leftPart = 24, 
		RULE_compoundName = 25, RULE_ifStatement = 26, RULE_whileStatement = 27, 
		RULE_returnStatement = 28, RULE_callStatement = 29, RULE_argumentList = 30, 
		RULE_printStatement = 31, RULE_block = 32, RULE_relation = 33, RULE_relationalOperator = 34, 
		RULE_expression = 35, RULE_addSign = 36, RULE_terms = 37, RULE_term = 38, 
		RULE_factors = 39, RULE_multSign = 40, RULE_factor = 41, RULE_newType = 42, 
		RULE_type = 43, RULE_arrayTail = 44;
	public static final String[] ruleNames = {
		"compilationUnit", "qualifiedName", "imports", "importDeclaration", "classDeclarations", 
		"classDeclaration", "extension", "classBody", "classMembers", "classMember", 
		"fieldDeclaration", "visibility", "staticness", "methodDeclaration", "parameters", 
		"parameterList", "parameter", "methodType", "body", "localDeclarations", 
		"localDeclaration", "statements", "statement", "assignment", "leftPart", 
		"compoundName", "ifStatement", "whileStatement", "returnStatement", "callStatement", 
		"argumentList", "printStatement", "block", "relation", "relationalOperator", 
		"expression", "addSign", "terms", "term", "factors", "multSign", "factor", 
		"newType", "type", "arrayTail"
	};

	@Override
	public String getGrammarFileName() { return "TOY_parser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TOY_parserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ClassDeclarationsContext classDeclarations() {
			return getRuleContext(ClassDeclarationsContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); imports();
			setState(91); classDeclarations();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TOY_parserParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TOY_parserParser.IDENTIFIER); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94); match(T__1);
					setState(95); match(IDENTIFIER);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ImportsContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(101); importDeclaration();
				}
				}
				setState(106);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(TOY_parserParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(IMPORT);
			setState(108); qualifiedName();
			setState(111);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(109); match(T__1);
				setState(110); match(T__0);
				}
			}

			setState(113); match(SEMICOLON);
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

	public static class ClassDeclarationsContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterClassDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitClassDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitClassDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationsContext classDeclarations() throws RecognitionException {
		ClassDeclarationsContext _localctx = new ClassDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); classDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(TOY_parserParser.PUBLIC, 0); }
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CompoundNameContext compoundName() {
			return getRuleContext(CompoundNameContext.class,0);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(TOY_parserParser.CLASS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(PUBLIC);
			setState(118); match(CLASS);
			setState(119); compoundName(0);
			setState(120); extension();
			setState(121); match(SEMICOLON);
			setState(122); classBody();
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

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS() { return getToken(TOY_parserParser.EXTENDS, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extension);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case EXTENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(EXTENDS);
				setState(126); match(IDENTIFIER);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(TOY_parserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TOY_parserParser.RBRACE, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(LBRACE);
				setState(130); match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(LBRACE);
				setState(132); classMembers(0);
				setState(133); match(RBRACE);
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

	public static class ClassMembersContext extends ParserRuleContext {
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
		}
		public ClassMemberContext classMember() {
			return getRuleContext(ClassMemberContext.class,0);
		}
		public ClassMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterClassMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitClassMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitClassMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMembersContext classMembers() throws RecognitionException {
		return classMembers(0);
	}

	private ClassMembersContext classMembers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassMembersContext _localctx = new ClassMembersContext(_ctx, _parentState);
		ClassMembersContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_classMembers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138); classMember();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassMembersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classMembers);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141); classMember();
					}
					} 
				}
				setState(146);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); fieldDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StaticnessContext staticness() {
			return getRuleContext(StaticnessContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); visibility();
			setState(150); staticness();
			setState(151); type();
			setState(152); match(IDENTIFIER);
			setState(153); match(SEMICOLON);
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(TOY_parserParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(TOY_parserParser.PRIVATE, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_visibility);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STATIC:
			case VOID:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(PRIVATE);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(PUBLIC);
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

	public static class StaticnessContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(TOY_parserParser.STATIC, 0); }
		public StaticnessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterStaticness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitStaticness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitStaticness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticnessContext staticness() throws RecognitionException {
		StaticnessContext _localctx = new StaticnessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_staticness);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case VOID:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(STATIC);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StaticnessContext staticness() {
			return getRuleContext(StaticnessContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); visibility();
			setState(165); staticness();
			setState(166); methodType();
			setState(167); match(IDENTIFIER);
			setState(168); parameters();
			setState(169); body();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(TOY_parserParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(TOY_parserParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(LPAREN);
				setState(172); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(LPAREN);
				setState(174); parameterList(0);
				setState(175); match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TOY_parserParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180); parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(182);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(183); match(COMMA);
					setState(184); parameter();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); type();
			setState(191); match(IDENTIFIER);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(TOY_parserParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodType);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(VOID);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TOY_parserParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LocalDeclarationsContext localDeclarations() {
			return getRuleContext(LocalDeclarationsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TOY_parserParser.RBRACE, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(LBRACE);
			setState(198); localDeclarations(0);
			setState(199); statements(0);
			setState(200); match(RBRACE);
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

	public static class LocalDeclarationsContext extends ParserRuleContext {
		public LocalDeclarationsContext localDeclarations() {
			return getRuleContext(LocalDeclarationsContext.class,0);
		}
		public LocalDeclarationContext localDeclaration() {
			return getRuleContext(LocalDeclarationContext.class,0);
		}
		public LocalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterLocalDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitLocalDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitLocalDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationsContext localDeclarations() throws RecognitionException {
		return localDeclarations(0);
	}

	private LocalDeclarationsContext localDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocalDeclarationsContext _localctx = new LocalDeclarationsContext(_ctx, _parentState);
		LocalDeclarationsContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_localDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203); localDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_localDeclarations);
					setState(205);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(206); localDeclaration();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class LocalDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); type();
			setState(213); match(IDENTIFIER);
			setState(214); match(SEMICOLON);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(220); statement();
					}
					} 
				}
				setState(225);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229); returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230); callStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231); printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232); block();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(TOY_parserParser.ASSIGN, 0); }
		public LeftPartContext leftPart() {
			return getRuleContext(LeftPartContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); leftPart();
			setState(236); match(ASSIGN);
			setState(237); expression();
			setState(238); match(SEMICOLON);
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

	public static class LeftPartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompoundNameContext compoundName() {
			return getRuleContext(CompoundNameContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(TOY_parserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TOY_parserParser.RBRACKET, 0); }
		public LeftPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterLeftPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitLeftPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitLeftPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftPartContext leftPart() throws RecognitionException {
		LeftPartContext _localctx = new LeftPartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leftPart);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); compoundName(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); compoundName(0);
				setState(242); match(LBRACKET);
				setState(243); expression();
				setState(244); match(RBRACKET);
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

	public static class CompoundNameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(TOY_parserParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public CompoundNameContext compoundName() {
			return getRuleContext(CompoundNameContext.class,0);
		}
		public CompoundNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterCompoundName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitCompoundName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitCompoundName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundNameContext compoundName() throws RecognitionException {
		return compoundName(0);
	}

	private CompoundNameContext compoundName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompoundNameContext _localctx = new CompoundNameContext(_ctx, _parentState);
		CompoundNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_compoundName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249); match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compoundName);
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252); match(DOT);
					setState(253); match(IDENTIFIER);
					}
					} 
				}
				setState(258);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(TOY_parserParser.IF, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(TOY_parserParser.ELSE, 0); }
		public TerminalNode RPAREN() { return getToken(TOY_parserParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(TOY_parserParser.LPAREN, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); match(IF);
				setState(260); match(LPAREN);
				setState(261); relation();
				setState(262); match(RPAREN);
				setState(263); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); match(IF);
				setState(266); match(LPAREN);
				setState(267); relation();
				setState(268); match(RPAREN);
				setState(269); statement();
				setState(270); match(ELSE);
				setState(271); statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TOY_parserParser.WHILE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(TOY_parserParser.LOOP, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(WHILE);
			setState(276); relation();
			setState(277); match(LOOP);
			setState(278); statement();
			setState(279); match(SEMICOLON);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(TOY_parserParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(RETURN);
				setState(282); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); match(RETURN);
				setState(284); expression();
				setState(285); match(SEMICOLON);
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

	public static class CallStatementContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(TOY_parserParser.RPAREN, 0); }
		public CompoundNameContext compoundName() {
			return getRuleContext(CompoundNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TOY_parserParser.LPAREN, 0); }
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_callStatement);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); compoundName(0);
				setState(290); match(LPAREN);
				setState(291); match(RPAREN);
				setState(292); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); compoundName(0);
				setState(295); match(LPAREN);
				setState(296); argumentList(0);
				setState(297); match(RPAREN);
				setState(298); match(SEMICOLON);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TOY_parserParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		return argumentList(0);
	}

	private ArgumentListContext argumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, _parentState);
		ArgumentListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_argumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303); expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
					setState(305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(306); match(COMMA);
					setState(307); expression();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TOY_parserParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(TOY_parserParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(PRINT);
			setState(314); expression();
			setState(315); match(SEMICOLON);
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
		public TerminalNode LBRACE() { return getToken(TOY_parserParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TOY_parserParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(LBRACE);
				setState(318); match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(LBRACE);
				setState(320); statements(0);
				setState(321); match(RBRACE);
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

	public static class RelationContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relation);
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); expression();
				setState(327); relationalOperator();
				setState(328); expression();
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(TOY_parserParser.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(TOY_parserParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(TOY_parserParser.GREATER, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(TOY_parserParser.NOT_EQUAL, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddSignContext addSign() {
			return getRuleContext(AddSignContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case NULL:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); term();
				setState(335); terms();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(337); addSign();
				setState(338); term();
				setState(339); terms();
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

	public static class AddSignContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(TOY_parserParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TOY_parserParser.PLUS, 0); }
		public AddSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterAddSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitAddSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitAddSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSignContext addSign() throws RecognitionException {
		AddSignContext _localctx = new AddSignContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_addSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddSignContext addSign() {
			return getRuleContext(AddSignContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_terms);
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); addSign();
				setState(347); term();
				setState(348); terms();
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

	public static class TermContext extends ParserRuleContext {
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); factor();
			setState(353); factors();
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

	public static class FactorsContext extends ParserRuleContext {
		public MultSignContext multSign() {
			return getRuleContext(MultSignContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterFactors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitFactors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitFactors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_factors);
		try {
			setState(360);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); multSign();
				setState(357); factor();
				setState(358); factors();
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

	public static class MultSignContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(TOY_parserParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(TOY_parserParser.DIVIDE, 0); }
		public MultSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterMultSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitMultSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitMultSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultSignContext multSign() throws RecognitionException {
		MultSignContext _localctx = new MultSignContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(TOY_parserParser.NEW, 0); }
		public NewTypeContext newType() {
			return getRuleContext(NewTypeContext.class,0);
		}
		public LeftPartContext leftPart() {
			return getRuleContext(LeftPartContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(TOY_parserParser.NUMBER, 0); }
		public TerminalNode LBRACKET() { return getToken(TOY_parserParser.LBRACKET, 0); }
		public TerminalNode NULL() { return getToken(TOY_parserParser.NULL, 0); }
		public TerminalNode RBRACKET() { return getToken(TOY_parserParser.RBRACKET, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factor);
		try {
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); leftPart();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366); match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367); match(NEW);
				setState(368); newType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369); match(NEW);
				setState(370); newType();
				setState(371); match(LBRACKET);
				setState(372); expression();
				setState(373); match(RBRACKET);
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

	public static class NewTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TOY_parserParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TerminalNode REAL() { return getToken(TOY_parserParser.REAL, 0); }
		public NewTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitNewType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitNewType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeContext newType() throws RecognitionException {
		NewTypeContext _localctx = new NewTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_newType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TOY_parserParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TOY_parserParser.IDENTIFIER, 0); }
		public TerminalNode REAL() { return getToken(TOY_parserParser.REAL, 0); }
		public ArrayTailContext arrayTail() {
			return getRuleContext(ArrayTailContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(385);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(379); match(INT);
				setState(380); arrayTail();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(REAL);
				setState(382); arrayTail();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(383); match(IDENTIFIER);
				setState(384); arrayTail();
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

	public static class ArrayTailContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TOY_parserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TOY_parserParser.RBRACKET, 0); }
		public ArrayTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).enterArrayTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TOY_parserListener ) ((TOY_parserListener)listener).exitArrayTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TOY_parserVisitor ) return ((TOY_parserVisitor<? extends T>)visitor).visitArrayTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTailContext arrayTail() throws RecognitionException {
		ArrayTailContext _localctx = new ArrayTailContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayTail);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); match(LBRACKET);
				setState(389); match(RBRACKET);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return classMembers_sempred((ClassMembersContext)_localctx, predIndex);
		case 15: return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 19: return localDeclarations_sempred((LocalDeclarationsContext)_localctx, predIndex);
		case 21: return statements_sempred((StatementsContext)_localctx, predIndex);
		case 25: return compoundName_sempred((CompoundNameContext)_localctx, predIndex);
		case 30: return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean localDeclarations_sempred(LocalDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compoundName_sempred(CompoundNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classMembers_sempred(ClassMembersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3\4\7"+
		"\4i\n\4\f\4\16\4l\13\4\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16"+
		"\5\16\u00a5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bc\n"+
		"\21\f\21\16\21\u00bf\13\21\3\22\3\22\3\22\3\23\3\23\5\23\u00c6\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00d2\n\25\f\25"+
		"\16\25\u00d5\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00e0"+
		"\n\27\f\27\16\27\u00e3\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ec"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0101\n\33\f\33\16\33\u0104\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0114\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0122\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u012f\n\37\3 \3 \3 \3 \3 \3 \7 \u0137\n \f \16 \u013a"+
		"\13 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0146\n\"\3#\3#\3#\3#\3#"+
		"\5#\u014d\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u0158\n%\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0161\n\'\3(\3(\3(\3)\3)\3)\3)\3)\5)\u016b\n)\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u017a\n+\3,\3,\3-\3-\3-\3-\3-\3-\5-\u0184"+
		"\n-\3.\3.\3.\5.\u0189\n.\3.\2\b\22 (,\64>/\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\6\3\2\35 \3\2!\""+
		"\3\2#$\4\2\5\5()\u0183\2\\\3\2\2\2\4_\3\2\2\2\6j\3\2\2\2\bm\3\2\2\2\n"+
		"u\3\2\2\2\fw\3\2\2\2\16\u0081\3\2\2\2\20\u0089\3\2\2\2\22\u008b\3\2\2"+
		"\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u00a0\3\2\2\2\32\u00a4\3\2\2\2"+
		"\34\u00a6\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"\u00c0\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00c7\3\2\2\2(\u00cc\3\2\2\2*\u00d6\3\2\2\2,\u00da\3\2\2\2."+
		"\u00eb\3\2\2\2\60\u00ed\3\2\2\2\62\u00f8\3\2\2\2\64\u00fa\3\2\2\2\66\u0113"+
		"\3\2\2\28\u0115\3\2\2\2:\u0121\3\2\2\2<\u012e\3\2\2\2>\u0130\3\2\2\2@"+
		"\u013b\3\2\2\2B\u0145\3\2\2\2D\u014c\3\2\2\2F\u014e\3\2\2\2H\u0157\3\2"+
		"\2\2J\u0159\3\2\2\2L\u0160\3\2\2\2N\u0162\3\2\2\2P\u016a\3\2\2\2R\u016c"+
		"\3\2\2\2T\u0179\3\2\2\2V\u017b\3\2\2\2X\u0183\3\2\2\2Z\u0188\3\2\2\2\\"+
		"]\5\6\4\2]^\5\n\6\2^\3\3\2\2\2_d\7\5\2\2`a\7\3\2\2ac\7\5\2\2b`\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\5\3\2\2\2fd\3\2\2\2gi\5\b\5\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\7\3\2\2\2lj\3\2\2\2mn\7\6\2\2nq\5\4"+
		"\3\2op\7\3\2\2pr\7\4\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\7\2\2t\t\3"+
		"\2\2\2uv\5\f\7\2v\13\3\2\2\2wx\7\b\2\2xy\7\t\2\2yz\5\64\33\2z{\5\16\b"+
		"\2{|\7\7\2\2|}\5\20\t\2}\r\3\2\2\2~\u0082\3\2\2\2\177\u0080\7\n\2\2\u0080"+
		"\u0082\7\5\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\7\13\2\2\u0084\u008a\7\f\2\2\u0085\u0086\7\13\2\2\u0086\u0087\5"+
		"\22\n\2\u0087\u0088\7\f\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\b\n\1\2\u008c\u008d\5\24\13"+
		"\2\u008d\u0092\3\2\2\2\u008e\u008f\f\3\2\2\u008f\u0091\5\24\13\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\26\f\2\u0096\25"+
		"\3\2\2\2\u0097\u0098\5\30\r\2\u0098\u0099\5\32\16\2\u0099\u009a\5X-\2"+
		"\u009a\u009b\7\5\2\2\u009b\u009c\7\7\2\2\u009c\27\3\2\2\2\u009d\u00a1"+
		"\3\2\2\2\u009e\u00a1\7\r\2\2\u009f\u00a1\7\b\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00a5\3\2\2"+
		"\2\u00a3\u00a5\7\16\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\33\3\2\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\5$"+
		"\23\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\5&\24\2\u00ac"+
		"\35\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b4\7\20\2\2\u00af\u00b0\7\17"+
		"\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\20\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\b\21\1"+
		"\2\u00b6\u00b7\5\"\22\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\f\3\2\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bc\5\"\22\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be!\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\5X-\2\u00c1\u00c2\7\5\2\2\u00c2#\3\2\2\2\u00c3\u00c6"+
		"\5X-\2\u00c4\u00c6\7\22\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"%\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\5,\27\2"+
		"\u00ca\u00cb\7\f\2\2\u00cb\'\3\2\2\2\u00cc\u00cd\b\25\1\2\u00cd\u00ce"+
		"\5*\26\2\u00ce\u00d3\3\2\2\2\u00cf\u00d0\f\3\2\2\u00d0\u00d2\5*\26\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4)\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\5X-\2\u00d7\u00d8"+
		"\7\5\2\2\u00d8\u00d9\7\7\2\2\u00d9+\3\2\2\2\u00da\u00db\b\27\1\2\u00db"+
		"\u00dc\5.\30\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\f\3\2\2\u00de\u00e0\5."+
		"\30\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2-\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00ec\5\60\31"+
		"\2\u00e5\u00ec\5\66\34\2\u00e6\u00ec\58\35\2\u00e7\u00ec\5:\36\2\u00e8"+
		"\u00ec\5<\37\2\u00e9\u00ec\5@!\2\u00ea\u00ec\5B\"\2\u00eb\u00e4\3\2\2"+
		"\2\u00eb\u00e5\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec/\3\2\2\2\u00ed"+
		"\u00ee\5\62\32\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\5H%\2\u00f0\u00f1\7"+
		"\7\2\2\u00f1\61\3\2\2\2\u00f2\u00f9\5\64\33\2\u00f3\u00f4\5\64\33\2\u00f4"+
		"\u00f5\7\24\2\2\u00f5\u00f6\5H%\2\u00f6\u00f7\7\25\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\63\3\2\2\2\u00fa\u00fb"+
		"\b\33\1\2\u00fb\u00fc\7\5\2\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\f\3\2\2"+
		"\u00fe\u00ff\7\26\2\2\u00ff\u0101\7\5\2\2\u0100\u00fd\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\65\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7\27\2\2\u0106\u0107\7\17\2\2\u0107\u0108\5"+
		"D#\2\u0108\u0109\7\20\2\2\u0109\u010a\5.\30\2\u010a\u0114\3\2\2\2\u010b"+
		"\u010c\7\27\2\2\u010c\u010d\7\17\2\2\u010d\u010e\5D#\2\u010e\u010f\7\20"+
		"\2\2\u010f\u0110\5.\30\2\u0110\u0111\7\30\2\2\u0111\u0112\5.\30\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u010b\3\2\2\2\u0114\67\3\2\2"+
		"\2\u0115\u0116\7\31\2\2\u0116\u0117\5D#\2\u0117\u0118\7\32\2\2\u0118\u0119"+
		"\5.\30\2\u0119\u011a\7\7\2\2\u011a9\3\2\2\2\u011b\u011c\7\33\2\2\u011c"+
		"\u0122\7\7\2\2\u011d\u011e\7\33\2\2\u011e\u011f\5H%\2\u011f\u0120\7\7"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		";\3\2\2\2\u0123\u0124\5\64\33\2\u0124\u0125\7\17\2\2\u0125\u0126\7\20"+
		"\2\2\u0126\u0127\7\7\2\2\u0127\u012f\3\2\2\2\u0128\u0129\5\64\33\2\u0129"+
		"\u012a\7\17\2\2\u012a\u012b\5> \2\u012b\u012c\7\20\2\2\u012c\u012d\7\7"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0128\3\2\2\2\u012f"+
		"=\3\2\2\2\u0130\u0131\b \1\2\u0131\u0132\5H%\2\u0132\u0138\3\2\2\2\u0133"+
		"\u0134\f\3\2\2\u0134\u0135\7\21\2\2\u0135\u0137\5H%\2\u0136\u0133\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"?\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\34\2\2\u013c\u013d\5H%\2\u013d"+
		"\u013e\7\7\2\2\u013eA\3\2\2\2\u013f\u0140\7\13\2\2\u0140\u0146\7\f\2\2"+
		"\u0141\u0142\7\13\2\2\u0142\u0143\5,\27\2\u0143\u0144\7\f\2\2\u0144\u0146"+
		"\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0141\3\2\2\2\u0146C\3\2\2\2\u0147"+
		"\u014d\5H%\2\u0148\u0149\5H%\2\u0149\u014a\5F$\2\u014a\u014b\5H%\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014dE\3\2\2\2"+
		"\u014e\u014f\t\2\2\2\u014fG\3\2\2\2\u0150\u0151\5N(\2\u0151\u0152\5L\'"+
		"\2\u0152\u0158\3\2\2\2\u0153\u0154\5J&\2\u0154\u0155\5N(\2\u0155\u0156"+
		"\5L\'\2\u0156\u0158\3\2\2\2\u0157\u0150\3\2\2\2\u0157\u0153\3\2\2\2\u0158"+
		"I\3\2\2\2\u0159\u015a\t\3\2\2\u015aK\3\2\2\2\u015b\u0161\3\2\2\2\u015c"+
		"\u015d\5J&\2\u015d\u015e\5N(\2\u015e\u015f\5L\'\2\u015f\u0161\3\2\2\2"+
		"\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0161M\3\2\2\2\u0162\u0163\5"+
		"T+\2\u0163\u0164\5P)\2\u0164O\3\2\2\2\u0165\u016b\3\2\2\2\u0166\u0167"+
		"\5R*\2\u0167\u0168\5T+\2\u0168\u0169\5P)\2\u0169\u016b\3\2\2\2\u016a\u0165"+
		"\3\2\2\2\u016a\u0166\3\2\2\2\u016bQ\3\2\2\2\u016c\u016d\t\4\2\2\u016d"+
		"S\3\2\2\2\u016e\u017a\7%\2\2\u016f\u017a\5\62\32\2\u0170\u017a\7&\2\2"+
		"\u0171\u0172\7\'\2\2\u0172\u017a\5V,\2\u0173\u0174\7\'\2\2\u0174\u0175"+
		"\5V,\2\u0175\u0176\7\24\2\2\u0176\u0177\5H%\2\u0177\u0178\7\25\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u016f\3\2\2\2\u0179\u0170\3\2"+
		"\2\2\u0179\u0171\3\2\2\2\u0179\u0173\3\2\2\2\u017aU\3\2\2\2\u017b\u017c"+
		"\t\5\2\2\u017cW\3\2\2\2\u017d\u017e\7(\2\2\u017e\u0184\5Z.\2\u017f\u0180"+
		"\7)\2\2\u0180\u0184\5Z.\2\u0181\u0182\7\5\2\2\u0182\u0184\5Z.\2\u0183"+
		"\u017d\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0181\3\2\2\2\u0184Y\3\2\2\2"+
		"\u0185\u0189\3\2\2\2\u0186\u0187\7\24\2\2\u0187\u0189\7\25\2\2\u0188\u0185"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0189[\3\2\2\2\36djq\u0081\u0089\u0092\u00a0"+
		"\u00a4\u00b3\u00bd\u00c5\u00d3\u00e1\u00eb\u00f8\u0102\u0113\u0121\u012e"+
		"\u0138\u0145\u014c\u0157\u0160\u016a\u0179\u0183\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}