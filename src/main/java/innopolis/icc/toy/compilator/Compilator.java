package innopolis.icc.toy.compilator;

import innopolis.icc.toy.exceptions.ToyException;
import innopolis.icc.toy.listener.ExtractInterfaceListener;
import innopolis.icc.toy.parser.TOY_parserLexer;
import innopolis.icc.toy.parser.TOY_parserParser;
import innopolis.icc.toy.utils.PropertiesSingelton;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Properties;


public class Compilator implements ICompilator {
    private final static String EX_EXTENSION_KEY = "toy.compiler.exception",
                                LONG_LINE = "toy.compiler.longline",
                                EXTENSION = ".toy";
    private final static Properties messages = PropertiesSingelton.getInstance();


    public byte[] compile(String filePath) throws ToyException {
        ANTLRFileStream input = null;
        try {
            input = new ANTLRFileStream(filePath);
        } catch (IOException e) {
            throw new ToyException(e);
        }
        TOY_parserLexer lexer = new TOY_parserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOY_parserParser parser = new TOY_parserParser(tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        ExtractInterfaceListener extracter = new ExtractInterfaceListener(parser);
        walker.walk(extracter, tree);
        //tree.inspect(parser);
        //generateCode(root);  //ToDo write code generator
        return null;
    }

    public void doFile(File f) throws ToyException {

        // If this is a directory, walk each file/dir in that directory
        if (f.isDirectory()) {
            String files[] = f.list();
            for (int i = 0; i < files.length; i++) {
                doFile(new File(f, files[i]));
            }

        } // otherwise, if this is a java file, parse it!
        else if ((f.getName().length() < 5) ||
                !f.getName().substring(f.getName().length() - 4).equals(EXTENSION)) {
            System.err.println(messages.getProperty(LONG_LINE));
            throw new ToyException(String.format(messages.getProperty(EX_EXTENSION_KEY),f.getAbsoluteFile()));
        }
        compile(f.getAbsolutePath());
    }


    /**
     * @param tree
     */
    void semanticAnalysis(ParserRuleContext tree) {

    }

}
