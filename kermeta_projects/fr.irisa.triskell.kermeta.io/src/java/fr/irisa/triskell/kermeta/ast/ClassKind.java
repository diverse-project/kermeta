package fr.irisa.triskell.kermeta.ast;

import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 4 mai 2006 16:17:25
 */
public class ClassKind extends KermetaTokenNode {

	public static final String KW_CLASS = "class";

	
	/**
	 * Construct a new ClassKind.
	 */
	public ClassKind(Token token) {
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