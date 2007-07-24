package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;

/**
 *
 * @generated by Gymnast from kermeta.ast on 4 juil. 2007 09:11:46
 */
public class RelationalExpression extends KermetaASTNode  {


	private AdditiveExpression _left;
	private RelationalOp _relationalOp;
	private AdditiveExpression _right;

	public AdditiveExpression getLeft() {
		return _left;
	}
	public RelationalOp getRelationalOp() {
		return _relationalOp;
	}
	public AdditiveExpression getRight() {
		return _right;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_left != null) count++;
		if (_relationalOp != null) count++;
		if (_right != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_left != null) && (++count == index)) return _left;
		if ((_relationalOp != null) && (++count == index)) return _relationalOp;
		if ((_right != null) && (++count == index)) return _right;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new RelationalExpression.
	 */
	public RelationalExpression(
		AdditiveExpression left,
		RelationalOp relationalOp,
		AdditiveExpression right
	) {
		super();

		if (left != null) {
			_left = left;
			if (_left._parent != null) throw new RuntimeException();
			_left._parent = this;
		}
		if (relationalOp != null) {
			_relationalOp = relationalOp;
			if (_relationalOp._parent != null) throw new RuntimeException();
			_relationalOp._parent = this;
		}
		if (right != null) {
			_right = right;
			if (_right._parent != null) throw new RuntimeException();
			_right._parent = this;
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
