package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 8 juil. 2008 12:04:11
 */
public class Param extends KermetaASTNode  {


	private Annotations _annotations;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;

	public Annotations getAnnotations() {
		return _annotations;
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


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_annotations != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_annotations != null) && (++count == index)) return _annotations;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Param.
	 */
	public Param(
		Annotations annotations,
		TokenInfo name,
		TokenInfo colon,
		TypeRef typeRef
	) {
		super();

		if (annotations != null) {
			_annotations = annotations;
			if (_annotations._parent != null) throw new RuntimeException();
			_annotations._parent = this;
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
