package fr.irisa.triskell.kermeta.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on 30 nov. 2006 16:33:53
 */
public abstract class FLiteral extends PrimitiveExpression {
	/**
	 * Construct a new FLiteral.
	 */
	public FLiteral() {
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