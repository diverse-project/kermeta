package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 * Represents a token in the language grammar.
 * Can be subclassed to represent specific token subgroups.
 *
 * @generated by Gymnast from kermeta.ast on 21 avr. 2005 22:15:56
 */
public class KermetaTokenNode extends KermetaASTNode {

	/**
	 * @return the number of children of this ASTNode
	 */
	public final int getChildCount() {
		// token rules cannot have children!
		return 0;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public final ASTNode getChild(int index) {
		// token rules cannot have children!
		throw new IndexOutOfBoundsException();
	}

	/**
	 * Construct a new KermetaTokenNode
	 */
	public KermetaTokenNode(Token token) {
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
