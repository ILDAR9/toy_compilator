package innopolis.icc.toy.symbols;

import innopolis.icc.toy.parser.TOY_parserParser;
import org.antlr.v4.runtime.Token;

public class CheckSymbols {

    public static Type getType(int tokenType) {
        switch ( tokenType ) {
            case Type.VOID :  return Type._void;
            case Type.INT :   return Type._int;
            case Type.REAL : return Type._real;
            case Type.BOOLEAN : return Type._boolean;
            case Type.NIL : return Type._nil;
            case Type.ID  : return Type._object;
        }
        return Type._invalid;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }

}
