package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 22 f�vr. 2005 00:18:28
 */
public class EnumLiteral extends KermetaASTNode  {


	private Annotations _leadingAnnotations;
	private KermetaTokenNode _name;
	private KermetaTokenNode _semi;

	public Annotations getLeadingAnnotations() {
		return _leadingAnnotations;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getSemi() {
		return _semi;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_leadingAnnotations != null) count++;
		if (_name != null) count++;
		if (_semi != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_leadingAnnotations != null) && (++count == index)) return _leadingAnnotations;
		if ((_name != null) && (++count == index)) return _name;
		if ((_semi != null) && (++count == index)) return _semi;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new EnumLiteral.
	 */
	public EnumLiteral(
		Annotations leadingAnnotations,
		Token name,
		Token semi
	) {
		super();

		if (leadingAnnotations != null) {
			_leadingAnnotations = leadingAnnotations;
			if (_leadingAnnotations._parent != null) throw new RuntimeException();
			_leadingAnnotations._parent = this;
		}
		if (name != null) {
			_name = new KermetaTokenNode(name);
			if (_name._parent != null) throw new RuntimeException();
			_name._parent = this;
		}
		if (semi != null) {
			_semi = new KermetaTokenNode(semi);
			if (_semi._parent != null) throw new RuntimeException();
			_semi._parent = this;
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
