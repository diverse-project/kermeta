package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 22 f�vr. 2005 00:18:28
 */
public class FSuperCall extends PrimitiveExpression  {

	public static final String KW_SUPER = "super";

	private KermetaTokenNode _super_KW;

	public KermetaTokenNode getSuper_KW() {
		return _super_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_super_KW != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_super_KW != null) && (++count == index)) return _super_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new FSuperCall.
	 */
	public FSuperCall(
		Token super_KW
	) {
		super();

		if (super_KW != null) {
			_super_KW = new KermetaTokenNode(super_KW);
			if (_super_KW._parent != null) throw new RuntimeException();
			_super_KW._parent = this;
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
