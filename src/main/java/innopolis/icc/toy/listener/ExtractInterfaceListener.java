package innopolis.icc.toy.listener;

import innopolis.icc.toy.parser.TOY_parserBaseListener;
import innopolis.icc.toy.parser.TOY_parserParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

public class ExtractInterfaceListener  extends TOY_parserBaseListener{

    private final TOY_parserParser parser;

    public ExtractInterfaceListener(TOY_parserParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterMethodDeclaration(@NotNull TOY_parserParser.MethodDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String name = ctx.IDENTIFIER().getText();
        String type = tokens.getText(ctx.visibility());
        String args = tokens.getText(ctx.parameters());
        System.out.println(type+" " + name +args + ";" );
    }
}
