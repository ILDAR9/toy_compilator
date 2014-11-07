package innopolis.icc.toy;

import innopolis.icc.toy.compilator.Compilator;
import innopolis.icc.toy.compilator.ICompilator;
import innopolis.icc.toy.utils.DataUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Compilator start point
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //check for empty and null
        if (DataUtils.isEmpty(args[0])) {
            logger.warn("No input file");
        }
        try {
            ICompilator compiler = new Compilator();
            compiler.compile(args[0]);

        } catch (IOException e) {
            logger.error("", e);
            e.printStackTrace();
        }


//            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
//            TOY_parserListener extractor = new TOY_parserBaseListener(parser);
//            walker.walk(extractor, tree); // initiate walk of tree with listener


    }

}
