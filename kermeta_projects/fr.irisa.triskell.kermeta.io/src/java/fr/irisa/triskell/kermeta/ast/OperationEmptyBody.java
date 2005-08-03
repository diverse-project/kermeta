package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Aug 2, 2005 3:32:10 PM
 */
public class OperationEmptyBody extends OperationBody  {

	public static final String KW_ABSTRACT = "abstract";

	private KermetaTokenNode _abstract_KW;

	public KermetaTokenNode getAbstract_KW() {
		return _abstract_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_abstract_KW != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_abstract_KW != null) && (++count == index)) return _abstract_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new OperationEmptyBody.
	 */
	public OperationEmptyBody(
		Token abstract_KW
	) {
		super();

		if (abstract_KW != null) {
			_abstract_KW = new KermetaTokenNode(abstract_KW);
			if (_abstract_KW._parent != null) throw new RuntimeException();
			_abstract_KW._parent = this;
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
