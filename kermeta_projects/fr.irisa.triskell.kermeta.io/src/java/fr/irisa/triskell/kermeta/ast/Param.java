package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 22 f�vr. 2005 00:18:28
 */
public class Param extends KermetaASTNode  {


	private Annotations _leadingAnnotations;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;
	private Annotations _trailingAnnotations;

	public Annotations getLeadingAnnotations() {
		return _leadingAnnotations;
	}
	public KermetaTokenNode getName() {
		return _name;
	}
	public KermetaTokenNode getColon() {
		return _colon;
	}
	public TypeRef getTypeRef() {
		return _typeRef;
	}
	public Annotations getTrailingAnnotations() {
		return _trailingAnnotations;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_leadingAnnotations != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;
		if (_trailingAnnotations != null) count++;

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
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;
		if ((_trailingAnnotations != null) && (++count == index)) return _trailingAnnotations;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Param.
	 */
	public Param(
		Annotations leadingAnnotations,
		Token name,
		Token colon,
		TypeRef typeRef,
		Annotations trailingAnnotations
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
		if (colon != null) {
			_colon = new KermetaTokenNode(colon);
			if (_colon._parent != null) throw new RuntimeException();
			_colon._parent = this;
		}
		if (typeRef != null) {
			_typeRef = typeRef;
			if (_typeRef._parent != null) throw new RuntimeException();
			_typeRef._parent = this;
		}
		if (trailingAnnotations != null) {
			_trailingAnnotations = trailingAnnotations;
			if (_trailingAnnotations._parent != null) throw new RuntimeException();
			_trailingAnnotations._parent = this;
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
