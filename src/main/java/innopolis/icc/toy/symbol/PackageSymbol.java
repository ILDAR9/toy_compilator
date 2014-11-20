package innopolis.icc.toy.symbol;

public class PackageSymbol extends ScopedSymbol {
	public PackageSymbol(Scope enclosingScope, String name) {
		super(name, enclosingScope);
	}
}
