package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Mar 2, 2005 6:06:49 PM
 */
public class FStringLiteral extends FLiteral  {


	private KermetaTokenNode _string_literal;

	public KermetaTokenNode getString_literal() {
		return _string_literal;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_string_literal != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_string_literal != null) && (++count == index)) return _string_literal;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FStringLiteral.
	 */
	public FStringLiteral(
		Token string_literal
	) {
		super();

		if (string_literal != null) {
			_string_literal = new KermetaTokenNode(string_literal);
			if (_string_literal._parent != null) throw new RuntimeException();
			_string_literal._parent = this;
		}

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
