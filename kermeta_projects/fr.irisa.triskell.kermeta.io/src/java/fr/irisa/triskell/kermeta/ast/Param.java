package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on Mar 9, 2005 4:39:28 PM
 */
public class Param extends KermetaASTNode  {


	private Annotations _preAnnotations;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;
	private Annotations _postAnnotations;

	public Annotations getPreAnnotations() {
		return _preAnnotations;
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
	public Annotations getPostAnnotations() {
		return _postAnnotations;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_preAnnotations != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;
		if (_postAnnotations != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_preAnnotations != null) && (++count == index)) return _preAnnotations;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;
		if ((_postAnnotations != null) && (++count == index)) return _postAnnotations;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Param.
	 */
	public Param(
		Annotations preAnnotations,
		Token name,
		Token colon,
		TypeRef typeRef,
		Annotations postAnnotations
	) {
		super();

		if (preAnnotations != null) {
			_preAnnotations = preAnnotations;
			if (_preAnnotations._parent != null) throw new RuntimeException();
			_preAnnotations._parent = this;
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
		if (postAnnotations != null) {
			_postAnnotations = postAnnotations;
			if (_postAnnotations._parent != null) throw new RuntimeException();
			_postAnnotations._parent = this;
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
