package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 28 juin 2007 17:24:33
 */
public class Precondition extends Assertion  {

	public static final String KW_PRE = "pre";
	public static final String KW_IS = "is";

	private KermetaTokenNode _pre_KW;
	private KermetaTokenNode _name;
	private KermetaTokenNode _is_KW;
	private FExpression _body;

	public KermetaTokenNode getPre_KW() {
		return _pre_KW;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getIs_KW() {
		return _is_KW;
	}
	public FExpression getBody() {
		return _body;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_pre_KW != null) count++;
		if (_name != null) count++;
		if (_is_KW != null) count++;
		if (_body != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_pre_KW != null) && (++count == index)) return _pre_KW;
		if ((_name != null) && (++count == index)) return _name;
		if ((_is_KW != null) && (++count == index)) return _is_KW;
		if ((_body != null) && (++count == index)) return _body;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Precondition.
	 */
	public Precondition(
		Token pre_KW,
		Token name,
		Token is_KW,
		FExpression body
	) {
		super();

		if (pre_KW != null) {
			_pre_KW = new KermetaTokenNode(pre_KW);
			if (_pre_KW._parent != null) throw new RuntimeException();
			_pre_KW._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (is_KW != null) {
			_is_KW = new KermetaTokenNode(is_KW);
			if (_is_KW._parent != null) throw new RuntimeException();
			_is_KW._parent = this;
		}
		if (body != null) {
			_body = body;
			if (_body._parent != null) throw new RuntimeException();
			_body._parent = this;
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
