package innopolis.icc.toy.symbol;

/** what about packages at top level?  Maybe that is the default package
 *  so define one and add.
 */
public class GlobalScope extends BaseScope {
	public static final GlobalScope GLOBALS = new GlobalScope();

    private GlobalScope() { super(null); }
    public String getScopeName() { return "global"; }
}
