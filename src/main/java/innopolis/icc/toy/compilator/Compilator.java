package innopolis.icc.toy.compilator;

import innopolis.icc.toy.exceptions.ToyException;
import innopolis.icc.toy.listener.DefPhase;
import innopolis.icc.toy.parser.TOY_parserLexer;
import innopolis.icc.toy.parser.TOY_parserParser;
import innopolis.icc.toy.utils.PropertiesSingelton;
import innopolis.icc.toy.utils.Utils;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.objectweb.asm.ClassWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;


public class Compilator implements ICompilator {
    private static final Logger logger = LoggerFactory.getLogger(Compilator.class);
    private final static String EX_EXTENSION_KEY = "toy.compiler.exception",
            LONG_LINE = "toy.compiler.longline",
            EXTENSION = ".toy",
            BYTE_CODE_EXTENSION = ".class";
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
//        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
        // create next phase and feed symbol table info from def to ref phase
//        RefPhase ref = new RefPhase(def.globals, def.scopes);
//        walker.walk(ref, tree);
        tree.inspect(parser);
        semanticAnalysis(tree);
        return generateCode(tree);  //ToDo write code generator

//        return null;
    }

    private void semanticAnalysis(ParserRuleContext root) {
       /* TableBuilder tableBuilder = new TableBuilder();
        root.semanticAnalysePhase1(tableBuilder);

        UnitSymbolTable unitSymbolTable = tableBuilder.buildRootTable();
        showSymbolTable(unitSymbolTable, 0);

        root.semanticAnalysePhase2(unitSymbolTable);*/
    }

    private boolean isToyFile(String fileName) {
        boolean res = (fileName.length() >= 5) && fileName.substring(fileName.length() - 4).equals(EXTENSION);
        return res;
    }

    public void doFile(File file) throws ToyException {

        // If this is a directory, walk each file/dir in that directory
        if (file.isDirectory()) {
            File files[] = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return isToyFile(name);
                }
            });
            for (File f : files) {
                doFile(f);
            }

        } // otherwise, if this is not a toy file
        String filePath = file.getAbsolutePath();
        if (!isToyFile(filePath)) {
            logger.error(messages.getProperty(LONG_LINE));
            throw new ToyException(String.format(messages.getProperty(EX_EXTENSION_KEY), file.getAbsoluteFile()));
        }
        //do parse and code generating

        compile(filePath);

        //ToDo code generation output
        /*
        try (FileOutputStream out = new FileOutputStream(Utils.replaceFileSuffix(filePath, BYTE_CODE_EXTENSION))) {
            byte[] byteCode = compile(filePath);
            out.write(byteCode);
        } catch (IOException e) {
            throw new ToyException("Creating class file interrupted", e);
        }
        */
    }

    private byte[] generateCode(ParserRuleContext root) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

//        root.generateCode(cw);

//        cw.visit(V1_5, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE,
//                "pkg/Comparable", null, "java/lang/Object",
//                new String[] { "pkg/Mesurable" });

//        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "LESS", "I",
//                null, new Integer(-1)).visitEnd();
//        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "EQUAL", "I",
//                null, new Integer(0)).visitEnd();
//        cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "GREATER", "I",
//                null, new Integer(1)).visitEnd();
//        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo",
//                "(Ljava/lang/Object;)I", null, null).visitEnd();

        cw.visitEnd();
        return cw.toByteArray();
    }

    //   private void showSymbolTable(SymbolTable symbolTable, int level) {
        /*if (symbolTable != null) {
            printOffset(level);
            System.out.println("[ " + symbolTable.toString() + " ]");

            Map<SymbolTable.SymbolKey,TableEntry> symbols = symbolTable.getSymbols();
            for (SymbolTable.SymbolKey symbolKey : symbols.keySet()) {
                printOffset(level);
                System.out.println(symbolKey.getSymbol() + ": " + symbols.get(symbolKey).type);
            }

            Map<String, SymbolTable> subTables = symbolTable.getSubTables();
            for (String key : subTables.keySet()) {
                printOffset(level);
                System.out.println(key + ":");

                showSymbolTable(subTables.get(key), level+1);
            }
        }*//*if (symbolTable != null) {
            printOffset(level);
            System.out.println("[ " + symbolTable.toString() + " ]");

            Map<SymbolTable.SymbolKey,TableEntry> symbols = symbolTable.getSymbols();
            for (SymbolTable.SymbolKey symbolKey : symbols.keySet()) {
                printOffset(level);
                System.out.println(symbolKey.getSymbol() + ": " + symbols.get(symbolKey).type);
            }

            Map<String, SymbolTable> subTables = symbolTable.getSubTables();
            for (String key : subTables.keySet()) {
                printOffset(level);
                System.out.println(key + ":");

                showSymbolTable(subTables.get(key), level+1);
            }
        }*/
    //   }

    private void printOffset(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
    }

}
