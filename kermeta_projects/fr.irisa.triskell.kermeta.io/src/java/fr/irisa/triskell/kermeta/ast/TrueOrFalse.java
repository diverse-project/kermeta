package fr.irisa.triskell.kermeta.ast;

import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 16 f�vr. 2005 12:47:25
 */
public class TrueOrFalse extends KermetaTokenNode {

	public static final String KW_TRUE = "true";
	public static final String KW_FALSE = "false";

	
	/**
	 * Construct a new TrueOrFalse.
	 */
	public TrueOrFalse(Token token) {
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