package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Jun 9, 2005 11:04:11 AM
 */
public class TypeVarDecl extends KermetaASTNode  {


	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private Type _supertype;

	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public Type getSupertype() {
		return _supertype;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_supertype != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_supertype != null) && (++count == index)) return _supertype;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new TypeVarDecl.
	 */
	public TypeVarDecl(
		Token name,
		Token colon,
		Type supertype
	) {
		super();

		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (colon != null) {
			_colon = new KermetaTokenNode(colon);
			if (_colon._parent != null) throw new RuntimeException();
			_colon._parent = this;
		}
		if (supertype != null) {
			_supertype = supertype;
			if (_supertype._parent != null) throw new RuntimeException();
			_supertype._parent = this;
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
