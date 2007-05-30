package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 05-Apr-2007 17:00:45
 */
public class VoidType extends Type  {

	public static final String KW_VOID = "Void";

	private KermetaTokenNode _Void_KW;

	public KermetaTokenNode getVoid_KW() {
		return _Void_KW;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_Void_KW != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_Void_KW != null) && (++count == index)) return _Void_KW;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new VoidType.
	 */
	public VoidType(
		Token Void_KW
	) {
		super();

		if (Void_KW != null) {
			_Void_KW = new KermetaTokenNode(Void_KW);
			if (_Void_KW._parent != null) throw new RuntimeException();
			_Void_KW._parent = this;
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
