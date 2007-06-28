package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 28 juin 2007 17:24:33
 */
public class Tag extends Annotation  {


	private KermetaTokenNode _at;
	private QualifiedID _name;
	private KermetaTokenNode _val;

	public KermetaTokenNode getAt() {
		return _at;
	}
	public QualifiedID getName() {
		return _name;
	}
	public KermetaTokenNode getVal() {
		return _val;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_at != null) count++;
		if (_name != null) count++;
		if (_val != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_at != null) && (++count == index)) return _at;
		if ((_name != null) && (++count == index)) return _name;
		if ((_val != null) && (++count == index)) return _val;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Tag.
	 */
	public Tag(
		Token at,
		QualifiedID name,
		Token val
	) {
		super();

		if (at != null) {
			_at = new KermetaTokenNode(at);
			if (_at._parent != null) throw new RuntimeException();
			_at._parent = this;
		}
		if (name != null) {
			_name = name;
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (val != null) {
			_val = new KermetaTokenNode(val);
			if (_val._parent != null) throw new RuntimeException();
			_val._parent = this;
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
