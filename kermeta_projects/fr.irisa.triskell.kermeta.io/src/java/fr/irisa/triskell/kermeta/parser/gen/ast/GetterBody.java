package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 15 janv. 2008 09:12:26
 */
public class GetterBody extends KermetaASTNode  {

	public static final String KW_GETTER = "getter";
	public static final String KW_IS = "is";

	private KermetaTokenNode _getter_KW;
	private KermetaTokenNode _is_KW;
	private FExpression _getterbody;

	public KermetaTokenNode getGetter_KW() {
		return _getter_KW;
	}
	public KermetaTokenNode getIs_KW() {
		return _is_KW;
	}
	public FExpression getGetterbody() {
		return _getterbody;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_getter_KW != null) count++;
		if (_is_KW != null) count++;
		if (_getterbody != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_getter_KW != null) && (++count == index)) return _getter_KW;
		if ((_is_KW != null) && (++count == index)) return _is_KW;
		if ((_getterbody != null) && (++count == index)) return _getterbody;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new GetterBody.
	 */
	public GetterBody(
		TokenInfo getter_KW,
		TokenInfo is_KW,
		FExpression getterbody
	) {
		super();

		if (getter_KW != null) {
			_getter_KW = new KermetaTokenNode(getter_KW);
			if (_getter_KW._parent != null) throw new RuntimeException();
			_getter_KW._parent = this;
		}
		if (is_KW != null) {
			_is_KW = new KermetaTokenNode(is_KW);
			if (_is_KW._parent != null) throw new RuntimeException();
			_is_KW._parent = this;
		}
		if (getterbody != null) {
			_getterbody = getterbody;
			if (_getterbody._parent != null) throw new RuntimeException();
			_getterbody._parent = this;
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
