package fr.irisa.triskell.kermeta.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on Aug 2, 2005 3:32:10 PM
 */
public abstract class CompUnit extends KermetaASTNode {
	/**
	 * Construct a new CompUnit.
	 */
	public CompUnit() {
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