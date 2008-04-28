package fr.irisa.triskell.kermeta.parser.gen.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on 14 avr. 2008 10:29:17
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