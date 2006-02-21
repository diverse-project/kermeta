package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 17-Feb-2006 19:15:11
 */
public class Functype extends Type  {


	private KermetaTokenNode _lt;
	private Type _left;
	private KermetaTokenNode _minus_gt;
	private Type _right;
	private KermetaTokenNode _gt;

	public KermetaTokenNode getLt() {
		return _lt;
	}
	public Type getLeft() {
		return _left;
	}
	public KermetaTokenNode getMinus_gt() {
		return _minus_gt;
	}
	public Type getRight() {
		return _right;
	}
	public KermetaTokenNode getGt() {
		return _gt;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_lt != null) count++;
		if (_left != null) count++;
		if (_minus_gt != null) count++;
		if (_right != null) count++;
		if (_gt != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_lt != null) && (++count == index)) return _lt;
		if ((_left != null) && (++count == index)) return _left;
		if ((_minus_gt != null) && (++count == index)) return _minus_gt;
		if ((_right != null) && (++count == index)) return _right;
		if ((_gt != null) && (++count == index)) return _gt;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Functype.
	 */
	public Functype(
		Token lt,
		Type left,
		Token minus_gt,
		Type right,
		Token gt
	) {
		super();

		if (lt != null) {
			_lt = new KermetaTokenNode(lt);
			if (_lt._parent != null) throw new RuntimeException();
			_lt._parent = this;
		}
		if (left != null) {
			_left = left;
			if (_left._parent != null) throw new RuntimeException();
			_left._parent = this;
		}
		if (minus_gt != null) {
			_minus_gt = new KermetaTokenNode(minus_gt);
			if (_minus_gt._parent != null) throw new RuntimeException();
			_minus_gt._parent = this;
		}
		if (right != null) {
			_right = right;
			if (_right._parent != null) throw new RuntimeException();
			_right._parent = this;
		}
		if (gt != null) {
			_gt = new KermetaTokenNode(gt);
			if (_gt._parent != null) throw new RuntimeException();
			_gt._parent = this;
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
