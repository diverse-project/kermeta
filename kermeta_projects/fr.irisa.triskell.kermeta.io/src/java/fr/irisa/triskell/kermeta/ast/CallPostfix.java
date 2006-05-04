package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 4 mai 2006 16:17:25
 */
public class CallPostfix extends Postfix  {


	private KermetaTokenNode _dot;
	private KermetaTokenNode _name;

	public KermetaTokenNode getDot() {
		return _dot;
	}
	public KermetaTokenNode getName() {
		return _name;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_dot != null) count++;
		if (_name != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_dot != null) && (++count == index)) return _dot;
		if ((_name != null) && (++count == index)) return _name;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new CallPostfix.
	 */
	public CallPostfix(
		Token dot,
		Token name
	) {
		super();

		if (dot != null) {
			_dot = new KermetaTokenNode(dot);
			if (_dot._parent != null) throw new RuntimeException();
			_dot._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
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
