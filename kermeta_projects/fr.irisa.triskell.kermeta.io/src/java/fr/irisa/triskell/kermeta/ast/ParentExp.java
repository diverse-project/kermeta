package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Mar 9, 2005 4:39:28 PM
 */
public class ParentExp extends PrimitiveExpression  {


	private KermetaTokenNode _lparen;
	private FExpression _fExpression;
	private KermetaTokenNode _rparen;

	public KermetaTokenNode getLparen() {
		return _lparen;
	}
	public FExpression getFExpression() {
		return _fExpression;
	}
	public KermetaTokenNode getRparen() {
		return _rparen;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_lparen != null) count++;
		if (_fExpression != null) count++;
		if (_rparen != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_lparen != null) && (++count == index)) return _lparen;
		if ((_fExpression != null) && (++count == index)) return _fExpression;
		if ((_rparen != null) && (++count == index)) return _rparen;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new ParentExp.
	 */
	public ParentExp(
		Token lparen,
		FExpression fExpression,
		Token rparen
	) {
		super();

		if (lparen != null) {
			_lparen = new KermetaTokenNode(lparen);
			if (_lparen._parent != null) throw new RuntimeException();
			_lparen._parent = this;
		}
		if (fExpression != null) {
			_fExpression = fExpression;
			if (_fExpression._parent != null) throw new RuntimeException();
			_fExpression._parent = this;
		}
		if (rparen != null) {
			_rparen = new KermetaTokenNode(rparen);
			if (_rparen._parent != null) throw new RuntimeException();
			_rparen._parent = this;
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
