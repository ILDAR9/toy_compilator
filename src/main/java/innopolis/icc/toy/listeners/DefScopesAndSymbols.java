package innopolis.icc.toy.listeners;

import innopolis.icc.toy.parser.TOY_parserBaseListener;

import innopolis.icc.toy.parser.TOY_parserParser;
import innopolis.icc.toy.symbols.*;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static innopolis.icc.toy.symbols.GlobalScope.GLOBALS;

/**
 * Create scope tree and def symbols in Scopes
 * <p/>
 * Scopes are: package, class, interface, enum, function, block
 * Symbol defs are: package, class, interface, enum, function, arg, field, var, val
 */
public class DefScopesAndSymbols extends TOY_parserBaseListener {
    private static final Logger logger = LoggerFactory.getLogger(DefScopesAndSymbols.class);

    //	public Tool tool;
    public ParseTree tree;
    public Parser parser;

    public Scope currentScope = GLOBALS;  // start out in global scope

    public DefScopesAndSymbols(ParseTree tree, Parser parser) {
        this.tree = tree;
        this.parser = parser;
    }

    // DEFINE SCOPES
    @Override
    public void exitCompilationUnit(@NotNull TOY_parserParser.CompilationUnitContext ctx) {
        if (currentScope != GLOBALS) {
            exitScope(); // pop package scope (if any)
        }
        BaseScope.dump(currentScope);
    }

    @Override
    public void enterClassDeclaration(@NotNull TOY_parserParser.ClassDeclarationContext ctx) {
        // ToDo extensions
        ClassSymbol s = new ClassSymbol(currentScope, ctx.qualifiedName().getText(), null);
        currentScope.define(s);
        ctx.scope = s; // record scope in parse tree
        enterScope(s);
    }

    @Override
    public void exitClassDeclaration(@NotNull TOY_parserParser.ClassDeclarationContext ctx) {
        logger.debug(currentScope.toString());
        exitScope();
    }

    @Override
    public void enterMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        TOY_parserParser.ParametersContext argList =
                (TOY_parserParser.ParametersContext) XPath.findAll(ctx, "//parameters", parser).iterator().next();
        List<Arg> args = new ArrayList<Arg>();
        int intType;
        Type type;
        if (argList.parameterList() != null) {
            for (TOY_parserParser.ParameterContext a : argList.parameterList().parameter()) {
                String name = a.IDENTIFIER().getText();
                intType = a.coreType().start.getType();
                type = CheckSymbols.getType(intType);
                args.add(new Arg(name, type, null));  //ToDo decide about default parameter declaration
            }
        }

        String name = ctx.IDENTIFIER().getText();
        int typeTokenType = ctx.methodType().start.getType();
        Type retType = CheckSymbols.getType(typeTokenType);

        // push new scope by making new one that points to enclosing scope
        FunctionSymbol s = new FunctionSymbol(currentScope, name, args, retType);
        currentScope.define(s); // Define function in current scope
        ctx.scope = s; // record scope in parse tree
        enterScope(s);      // Push: set function's parent to current
        currentScope = s;       // Current scope is now function scope

    }

    @Override
    public void exitMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        logger.debug(currentScope.toString());
        exitScope();
    }

    @Override
    public void enterBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        BlockScope s = new BlockScope(currentScope);
        ctx.scope = s; // record scope in parse tree
        enterScope(s);
    }

    @Override
    public void exitBlock(@NotNull TOY_parserParser.BlockContext ctx) {
        logger.debug(currentScope.toString());
        exitScope();
    }

    /**
     * change currentScope
     */
    public void enterScope(Scope s) {
        currentScope = s;
    }

    public void exitScope() {
        if (currentScope != null) {
            currentScope = currentScope.getEnclosingScope();
        }
    }

    // DEFINE SYMBOLS

    /**
     * definition of variables without declaration
     */
    @Override
    public void enterLocalDeclaration(@NotNull TOY_parserParser.LocalDeclarationContext ctx) {
        Type type = CheckSymbols.getType(ctx.coreType().start.getType());
        for (TerminalNode id : ctx.IDENTIFIER()) {
            if (currentScope.resolve(id.getSymbol().getText()) != null) {
                logger.warn("Syntax error: already defined.  " +  ctx.getText());
                CheckSymbols.error(id.getSymbol(),"already defined");
            } else {
                VariableSymbol s = new VariableSymbol(currentScope, id.getSymbol().getText(), type);
//                logger.debug("variable declared: " + s);
                currentScope.define(s);
            }
        }
    }

}
