package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 22 f�vr. 2005 00:18:28
 */
public class PostfixExp extends KermetaASTNode  {


	private PrimitiveExpression _target;
	private Postfixlst _postfixlst;

	public PrimitiveExpression getTarget() {
		return _target;
	}
	public Postfixlst getPostfixlst() {
		return _postfixlst;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_target != null) count++;
		if (_postfixlst != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_target != null) && (++count == index)) return _target;
		if ((_postfixlst != null) && (++count == index)) return _postfixlst;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new PostfixExp.
	 */
	public PostfixExp(
		PrimitiveExpression target,
		Postfixlst postfixlst
	) {
		super();

		if (target != null) {
			_target = target;
			if (_target._parent != null) throw new RuntimeException();
			_target._parent = this;
		}
		if (postfixlst != null) {
			_postfixlst = postfixlst;
			if (_postfixlst._parent != null) throw new RuntimeException();
			_postfixlst._parent = this;
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
