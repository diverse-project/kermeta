package fr.irisa.triskell.kermeta.ast;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import antlr.Token;

/**
 *
 * @generated by Gymnast from kermeta.ast on 6 mai 2006 00:07:44
 */
public class TypeRef extends KermetaASTNode  {


	private CollectionType _collectionType;
	private Type _reftype;
	private Multiplicity _multiplicity;

	public CollectionType getCollectionType() {
		return _collectionType;
	}
	public Type getReftype() {
		return _reftype;
	}
	public Multiplicity getMultiplicity() {
		return _multiplicity;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_collectionType != null) count++;
		if (_reftype != null) count++;
		if (_multiplicity != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_collectionType != null) && (++count == index)) return _collectionType;
		if ((_reftype != null) && (++count == index)) return _reftype;
		if ((_multiplicity != null) && (++count == index)) return _multiplicity;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new TypeRef.
	 */
	public TypeRef(
		CollectionType collectionType,
		Type reftype,
		Multiplicity multiplicity
	) {
		super();

		if (collectionType != null) {
			_collectionType = collectionType;
			if (_collectionType._parent != null) throw new RuntimeException();
			_collectionType._parent = this;
		}
		if (reftype != null) {
			_reftype = reftype;
			if (_reftype._parent != null) throw new RuntimeException();
			_reftype._parent = this;
		}
		if (multiplicity != null) {
			_multiplicity = multiplicity;
			if (_multiplicity._parent != null) throw new RuntimeException();
			_multiplicity._parent = this;
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
