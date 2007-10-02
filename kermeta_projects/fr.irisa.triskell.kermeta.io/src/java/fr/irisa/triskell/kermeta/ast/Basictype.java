package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 2 oct. 2007 13:10:02
 */
public class Basictype extends Type  {


	private QualifiedID _name;
	private KermetaTokenNode _lt;
	private Typelst _params;
	private KermetaTokenNode _gt;

	public QualifiedID getName() {
		return _name;
	}
	public KermetaTokenNode getLt() {
		return _lt;
	}
	public Typelst getParams() {
		return _params;
	}
	public KermetaTokenNode getGt() {
		return _gt;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_name != null) count++;
		if (_lt != null) count++;
		if (_params != null) count++;
		if (_gt != null) count++;

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
		if ((_lt != null) && (++count == index)) return _lt;
		if ((_params != null) && (++count == index)) return _params;
		if ((_gt != null) && (++count == index)) return _gt;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Basictype.
	 */
	public Basictype(
		QualifiedID name,
		Token lt,
		Typelst params,
		Token gt
	) {
		super();

		if (name != null) {
			_name = name;
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (lt != null) {
			_lt = new KermetaTokenNode(lt);
			if (_lt._parent != null) throw new RuntimeException();
			_lt._parent = this;
		}
		if (params != null) {
			_params = params;
			if (_params._parent != null) throw new RuntimeException();
			_params._parent = this;
		}
		if (gt != null) {
			_gt = new KermetaTokenNode(gt);
			if (_gt._parent != null) throw new RuntimeException();
			_gt._parent = this;
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
