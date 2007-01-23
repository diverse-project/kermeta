package fr.irisa.triskell.kermeta.migrationv032_v040.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 13 sept. 2006 18:24:48
 */
public class FRaiseException extends PrimitiveExpression  {

	public static final String KW_RAISE = "raise";

	private KermetaTokenNode _raise_KW;
	private FExpression _fExpression;

	public KermetaTokenNode getRaise_KW() {
		return _raise_KW;
	}
	public FExpression getFExpression() {
		return _fExpression;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_raise_KW != null) count++;
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
		if ((_raise_KW != null) && (++count == index)) return _raise_KW;
		if ((_fExpression != null) && (++count == index)) return _fExpression;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FRaiseException.
	 */
	public FRaiseException(
		Token raise_KW,
		FExpression fExpression
	) {
		super();

		if (raise_KW != null) {
			_raise_KW = new KermetaTokenNode(raise_KW);
			if (_raise_KW._parent != null) throw new RuntimeException();
			_raise_KW._parent = this;
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
