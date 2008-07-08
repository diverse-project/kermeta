package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 juil. 2008 12:04:11
 */
public class LogicalOp extends KermetaTokenNode {

	public static final String KW_AND = "and";
	public static final String KW_OR = "or";

	
	/**
	 * Construct a new LogicalOp.
	 */
	public LogicalOp(TokenInfo tokenInfo) {
		super(tokenInfo);
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