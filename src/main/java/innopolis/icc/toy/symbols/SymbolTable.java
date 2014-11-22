package innopolis.icc.toy.symbols;

import static innopolis.icc.toy.symbols.GlobalScope.GLOBALS;

public class SymbolTable {
	public ClassSymbol objectRoot;

    public SymbolTable() { initTypeSystem(); }

    protected void initTypeSystem() {

		objectRoot = new ClassSymbol(null, "Object", null);
		GLOBALS.define(objectRoot);

		GLOBALS.define(new BuiltInTypeSymbol("boolean"));
		GLOBALS.define(new BuiltInTypeSymbol("int"));
		GLOBALS.define(new BuiltInTypeSymbol("real"));

	}

    /** 'this' and 'super' need to know about enclosing class */
    public static ClassSymbol getEnclosingClass(Scope s) {
        while ( s!=null ) { // walk upwards from s looking for a class
            if ( s instanceof ClassSymbol ) return (ClassSymbol)s;
            s = s.getParentScope();
        }
        return null;
    }

    public String toString() { return GLOBALS.toString(); }
}
