package innopolis.icc.toy.symbol;

import innopolis.icc.toy.parser.TOY_parserParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** Represents all possible type trees like simple int, int[10],
 *  list<string>, and func<(int):float>[10].
 *
 *  Used only in expressions, not in function definitions, for example.
 *  Class and function definitions get their info stored in XSymbol objects.
 */
public class Type {
	public static final Type INVALID = new Type(null);
	public static final int BOOLEAN = TOY_parserParser.BOOLEAN;
	public static final int INT = TOY_parserParser.INT;
	public static final int REAL = TOY_parserParser.REAL;


	public static final int NIL = TOY_parserParser.NIL;

	public static final Type _object = new Type(new TerminalNodeImpl(new CommonToken(TOY_parserParser.IDENTIFIER, "Object")));
	public static final Type _boolean = new Type(new TerminalNodeImpl(new CommonToken(BOOLEAN, "boolean")));
	public static final Type _int = new Type(new TerminalNodeImpl(new CommonToken(INT, "int")));
	public static final Type _double = new Type(new TerminalNodeImpl(new CommonToken(REAL, "real")));

	public static final Type _nil = new Type(new TerminalNodeImpl(new CommonToken(NIL, "nil")));

	public final ParseTree tree;

	/** Result types for most binary(boolean) operations (arithmetic and relational) on built in types */
	public static final Map<Long, Integer> resultTypes = new HashMap<Long, Integer>();

	/*
	expression
	locals [Type exprType]
		:   primary												# PrimaryExpr
	    |   expression '.' ID									# FieldAccessExpr
	    |   type '.' 'class'									# ClassPtrExpr
	    |   expression '[' expression ']'						# ArrayIndexExpr
	    |	'len' '(' expression ')'							# LenExpr
	    |	'xor' '(' expression ')'							# BitXorExpr
	    |   expression '(' argExprList? ')' lambda?				# CallExpr
	    |   '-' expression										# NegateExpr
	    |   ('~'|'!') expression								# NotExpr
	    |   expression ('*'|'/'|'%') expression					# MultExpr
	    |   expression ('+'|'-') expression						# AddExpr
	    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression	# ShiftExpr
	    |   expression ('<=' | '>=' | '>' | '<') expression		# CmpExpr
		|   expression 'instanceof' type						# InstanceOfExpr
		|   expression ('==' | '!=' | 'is') expression			# EqExpr
		|   expression '&' expression							# BitAndExpr
		|   expression '^' expression							# ExpExpr
		|   expression '|' expression							# BitOrExpr
		|	expression ':' expression 							# RangeExpr
		|   expression 'and' expression							# AndExpr
		|   expression 'or' expression							# OrExpr
		|   expression 'in' expression							# InExpr
		|   expression '?' expression ':' expression			# TernaryIfExpr
		|	expression pipeOperator	expression					# PipeExpr
	    ;
	 */
	static {
		// make a table to handle lots of kinds of expressions, but not all
		Set<Integer> arithmeticOps = new HashSet<Integer>() {{
			add(TOY_parserParser.PLUS);
			add(TOY_parserParser.MINUS);
			add(TOY_parserParser.MULTIPLY);
			add(TOY_parserParser.DIVIDE);
		}};
		Set<Integer> relationalOps = new HashSet<Integer>() {{
			add(TOY_parserParser.LESS);
			add(TOY_parserParser.GREATER);
			add(TOY_parserParser.EQUAL);
			add(TOY_parserParser.NOT_EQUAL);
			add(TOY_parserParser.AND);
			add(TOY_parserParser.OR);
		}};
		Set<Integer> arithmeticTypes = new HashSet<Integer>() {{
			add(INT);
			add(REAL);
		}};
		for (int op : arithmeticOps) {
			for (int type : arithmeticTypes) {
				resultTypes.put(opkey(type, op, type), type);
			}
		}

		for (int op : relationalOps) {
			for (int type : arithmeticTypes) {
				resultTypes.put(opkey(type, op, type), BOOLEAN);
			}
		}
	}

	public Type(ParseTree tree) { this.tree = tree; }

	@Override
	public String toString() {
		return tree.getText();
	}

    /** operation key */
	public static long opkey(int left, int op, int right) {
		return ((long)left) << 32 | ((long)op) << 16 | right;
	}

	public static Type resultType(Type left, int opTokenType, Type right) {
		return INVALID;
	}

	public static Type promoteFromTo(Type from, int opTokenType, Type to) {
		return INVALID;
	}

	public static Type canAssignTo(Type from, Type to) {
		return INVALID;
	}
}
