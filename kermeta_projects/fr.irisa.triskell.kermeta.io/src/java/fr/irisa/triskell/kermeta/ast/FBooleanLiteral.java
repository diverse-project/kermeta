package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 6, 2005 12:12:52 PM
 */
public class FBooleanLiteral extends FLiteral  {


	private TrueOrFalse _trueOrFalse;

	public TrueOrFalse getTrueOrFalse() {
		return _trueOrFalse;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_trueOrFalse != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_trueOrFalse != null) && (++count == index)) return _trueOrFalse;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FBooleanLiteral.
	 */
	public FBooleanLiteral(
		TrueOrFalse trueOrFalse
	) {
		super();

		if (trueOrFalse != null) {
			_trueOrFalse = trueOrFalse;
			if (_trueOrFalse._parent != null) throw new RuntimeException();
			_trueOrFalse._parent = this;
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
