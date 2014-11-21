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
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends TOY_parserBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    public void enterCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx) {
        currentScope = globals;
    }

    public void enterMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitVar(CymbolParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            CheckSymbols.error(ctx.IDE().getSymbol(), "no such variable: " + name);
        }
        if ( var instanceof FunctionSymbol) {
            CheckSymbols.error(ctx.IDE().getSymbol(), name+" is not a variable");
        }
    }

    public void exitCall(CymbolParser.CallContext ctx) {
        // can only handle f(...) not expr(...)
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            CheckSymbols.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
            CheckSymbols.error(ctx.ID().getSymbol(), funcName+" is not a function");
        }
    }
}
