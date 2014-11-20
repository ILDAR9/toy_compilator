package innopolis.icc.toy;

import innopolis.icc.toy.compilator.Compilator;
import innopolis.icc.toy.compilator.ICompilator;
import innopolis.icc.toy.exceptions.ToyException;
import innopolis.icc.toy.utils.DataUtils;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
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
            for (int i = 0; i < args.length; i++) {
                compiler.doFile(new File(args[i]));
            }
        } catch (ToyException e) {
            logger.error("", e);
        }
    }

}
