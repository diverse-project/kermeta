package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 8, 2005 4:48:33 PM
 */
public class SetterBody extends KermetaASTNode  {

	public static final String KW_SETTER = "setter";
	public static final String KW_IS = "is";

	private KermetaTokenNode _setter_KW;
	private KermetaTokenNode _is_KW;
	private FExpression _setterbody;

	public KermetaTokenNode getSetter_KW() {
		return _setter_KW;
	}
	public KermetaTokenNode getIs_KW() {
		return _is_KW;
	}
	public FExpression getSetterbody() {
		return _setterbody;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_setter_KW != null) count++;
		if (_is_KW != null) count++;
		if (_setterbody != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_setter_KW != null) && (++count == index)) return _setter_KW;
		if ((_is_KW != null) && (++count == index)) return _is_KW;
		if ((_setterbody != null) && (++count == index)) return _setterbody;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new SetterBody.
	 */
	public SetterBody(
		Token setter_KW,
		Token is_KW,
		FExpression setterbody
	) {
		super();

		if (setter_KW != null) {
			_setter_KW = new KermetaTokenNode(setter_KW);
			if (_setter_KW._parent != null) throw new RuntimeException();
			_setter_KW._parent = this;
		}
		if (is_KW != null) {
			_is_KW = new KermetaTokenNode(is_KW);
			if (_is_KW._parent != null) throw new RuntimeException();
			_is_KW._parent = this;
		}
		if (setterbody != null) {
			_setterbody = setterbody;
			if (_setterbody._parent != null) throw new RuntimeException();
			_setterbody._parent = this;
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
