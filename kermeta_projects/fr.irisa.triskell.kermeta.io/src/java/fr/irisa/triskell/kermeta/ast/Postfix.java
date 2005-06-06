package fr.irisa.triskell.kermeta.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 6, 2005 12:12:52 PM
 */
public abstract class Postfix extends KermetaASTNode {
	/**
	 * Construct a new Postfix.
	 */
	public Postfix() {
		super();
	}

	/**
	 * This method overrides the superclass <code>acceptImpl</code> providing
	 * the same implementation.  Here <code>this</code> refers to this specific node
	 * class, so the <code>beginVisit</code> and <code>endVisit</code> methods
	 * specific to this type in the visitor will be invoked.
	 */
	public void acceptImpl(KermetaASTNodeVisitor visitor) {
		boolean visitChildren = visitor.beginVisit(this);
		if (visitChildren) visitChildren(visitor);
		visitor.endVisit(this);
	}

}