package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 juil. 2008 12:04:11
 */
public class FIntegerLiteral extends FLiteral  {


	private KermetaTokenNode _int_literal;

	public KermetaTokenNode getInt_literal() {
		return _int_literal;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_int_literal != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_int_literal != null) && (++count == index)) return _int_literal;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FIntegerLiteral.
	 */
	public FIntegerLiteral(
		TokenInfo int_literal
	) {
		super();

		if (int_literal != null) {
			_int_literal = new KermetaTokenNode(int_literal);
			if (_int_literal._parent != null) throw new RuntimeException();
			_int_literal._parent = this;
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
