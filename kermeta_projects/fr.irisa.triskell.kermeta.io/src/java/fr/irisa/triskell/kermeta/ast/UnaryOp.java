package fr.irisa.triskell.kermeta.ast;

import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 9, 2005 11:04:11 AM
 */
public class UnaryOp extends KermetaTokenNode {

	public static final String KW_NOT = "not";

	
	/**
	 * Construct a new UnaryOp.
	 */
	public UnaryOp(Token token) {
		super(token);
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