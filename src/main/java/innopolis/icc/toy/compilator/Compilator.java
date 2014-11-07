package innopolis.icc.toy.compilator;

import innopolis.icc.toy.parser.TOY_parserLexer;
import innopolis.icc.toy.parser.TOY_parserParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;


public class Compilator implements ICompilator {

    public byte[] compile(String filePath) throws IOException {
        ANTLRFileStream input = new ANTLRFileStream(filePath);
        TOY_parserLexer lexer = new TOY_parserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOY_parserParser parser = new TOY_parserParser(tokens);
        parser.setBuildParseTree(true);
//            ParserRuleContext<Token> tree = parser.compilationUnit(); // parse
        ParserRuleContext tree = parser.compilationUnit();
        tree.inspect(parser);

        //generateCode(root);
        return null;
    }


    /**
     * @param tree
     */
    void semanticAnalysis(ParserRuleContext tree) {

    }

}
