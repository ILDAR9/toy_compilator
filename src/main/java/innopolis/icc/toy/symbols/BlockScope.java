package innopolis.icc.toy.symbols;

public class BlockScope extends BaseScope {
    public BlockScope(Scope enclosingScope) { super(enclosingScope); }
    public String getScopeName() { return "local"; }
}
