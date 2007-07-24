package fr.irisa.triskell.kermeta.migrationv032_v040.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class UnaryExpression extends KermetaASTNode  {


	private UnaryOp _unaryOp;
	private PostfixExp _postfixExp;

	public UnaryOp getUnaryOp() {
		return _unaryOp;
	}
	public PostfixExp getPostfixExp() {
		return _postfixExp;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_unaryOp != null) count++;
		if (_postfixExp != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_unaryOp != null) && (++count == index)) return _unaryOp;
		if ((_postfixExp != null) && (++count == index)) return _postfixExp;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new UnaryExpression.
	 */
	public UnaryExpression(
		UnaryOp unaryOp,
		PostfixExp postfixExp
	) {
		super();

		if (unaryOp != null) {
			_unaryOp = unaryOp;
			if (_unaryOp._parent != null) throw new RuntimeException();
			_unaryOp._parent = this;
		}
		if (postfixExp != null) {
			_postfixExp = postfixExp;
			if (_postfixExp._parent != null) throw new RuntimeException();
			_postfixExp._parent = this;
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
