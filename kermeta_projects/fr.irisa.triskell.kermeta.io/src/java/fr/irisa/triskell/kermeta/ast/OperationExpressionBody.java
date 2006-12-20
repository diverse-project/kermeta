package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 20 d�c. 2006 11:43:08
 */
public class OperationExpressionBody extends OperationBody  {


	private Annotations _bodyAnnotations;
	private FExpression _fExpression;

	public Annotations getBodyAnnotations() {
		return _bodyAnnotations;
	}
	public FExpression getFExpression() {
		return _fExpression;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_bodyAnnotations != null) count++;
		if (_fExpression != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_bodyAnnotations != null) && (++count == index)) return _bodyAnnotations;
		if ((_fExpression != null) && (++count == index)) return _fExpression;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new OperationExpressionBody.
	 */
	public OperationExpressionBody(
		Annotations bodyAnnotations,
		FExpression fExpression
	) {
		super();

		if (bodyAnnotations != null) {
			_bodyAnnotations = bodyAnnotations;
			if (_bodyAnnotations._parent != null) throw new RuntimeException();
			_bodyAnnotations._parent = this;
		}
		if (fExpression != null) {
			_fExpression = fExpression;
			if (_fExpression._parent != null) throw new RuntimeException();
			_fExpression._parent = this;
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
