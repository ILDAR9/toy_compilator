package innopolis.icc.toy.symbols;

/** Represents a variable definition (name,type) in symbol table */
public class VariableSymbol extends BaseSymbol {
	public boolean isConstant;
	public VariableSymbol(Scope scope, String name, Type type) { super(scope, name, type); }
}
