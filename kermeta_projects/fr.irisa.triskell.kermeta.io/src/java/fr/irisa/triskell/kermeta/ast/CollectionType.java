package fr.irisa.triskell.kermeta.ast;

import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 ao�t 2006 14:30:59
 */
public class CollectionType extends KermetaTokenNode {

	public static final String KW_BAG = "bag";
	public static final String KW_SET = "set";
	public static final String KW_SEQ = "seq";
	public static final String KW_OSET = "oset";

	
	/**
	 * Construct a new CollectionType.
	 */
	public CollectionType(Token token) {
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