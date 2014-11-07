package innopolis.icc.toy.semantic;

import java.util.HashSet;

/***
 *
 */
class Scope extends HashSet<String> {

    final Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }

    boolean inScope(String varName) {
        return parent == null && super.contains(varName);
    }
}