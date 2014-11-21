package innopolis.icc.toy.listener;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import innopolis.icc.toy.parser.TOY_parserBaseListener;
import innopolis.icc.toy.parser.TOY_parserParser;
import innopolis.icc.toy.symbol.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefPhase extends TOY_parserBaseListener {
    public static final Logger logger = LoggerFactory.getLogger(DefPhase.class);
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope


    @Override
    public void enterCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx) {
        globals = GlobalScope.GLOBALS;
        currentScope = globals;
    }

    public void exitCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx) {
        logger.debug(globals.toString());
    }

    @Override
    public void enterMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int typeTokenType = ctx.methodType().start.getType();  //ToDo why start
        Symbol.Type type = CheckSymbols.getType(typeTokenType);  //ToDo do CheckSymbols semantic ant understand what for

        // push new scope by making new one that points to enclosing scope
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function); // Define function in current scope
        saveScope(ctx, function);      // Push: set function's parent to current
        currentScope = function;       // Current scope is now function scope
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    public void exitMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        logger.debug(currentScope.toString());
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    @Override
    public void enterBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        logger.debug(currentScope.toString());
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }



    @Override
    public void exitParameter(@NotNull TOY_parserParser.ParameterContext ctx) {
        defineVar(ctx.type(), ctx.IDENTIFIER().getSymbol());
    }

    void defineVar(TOY_parserParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }
}
