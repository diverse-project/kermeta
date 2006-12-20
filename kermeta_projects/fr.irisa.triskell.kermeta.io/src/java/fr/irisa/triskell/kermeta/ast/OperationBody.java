package fr.irisa.triskell.kermeta.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on 20 d�c. 2006 11:43:08
 */
public abstract class OperationBody extends KermetaASTNode {
	/**
	 * Construct a new OperationBody.
	 */
	public OperationBody() {
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