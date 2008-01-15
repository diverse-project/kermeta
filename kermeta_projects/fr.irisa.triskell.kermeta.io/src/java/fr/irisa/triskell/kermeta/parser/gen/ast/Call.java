package fr.irisa.triskell.kermeta.parser.gen.ast;

/**
 *
 * @generated by Gymnast from kermeta.ast on 15 janv. 2008 09:12:26
 */
public abstract class Call extends Postfix {
	/**
	 * Construct a new Call.
	 */
	public Call() {
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