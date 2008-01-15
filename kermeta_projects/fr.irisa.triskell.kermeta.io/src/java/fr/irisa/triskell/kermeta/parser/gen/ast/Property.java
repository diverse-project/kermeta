package fr.irisa.triskell.kermeta.parser.gen.ast;

import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.core.ast.TokenInfo;

/**
 *
 * @generated by Gymnast from kermeta.ast on 15 janv. 2008 09:12:26
 */
public class Property extends ClassMemberDecl  {


	private PropertyKind _propertyKind;
	private ReadOnlyModifier _readOnlyModifier;
	private KermetaTokenNode _name;
	private KermetaTokenNode _colon;
	private TypeRef _typeRef;
	private KermetaTokenNode _hash;
	private KermetaTokenNode _oppositeName;
	private GetterBody _getterBody;
	private SetterBody _setterBody;

	public PropertyKind getPropertyKind() {
		return _propertyKind;
	}
	public ReadOnlyModifier getReadOnlyModifier() {
		return _readOnlyModifier;
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
	public KermetaTokenNode getHash() {
		return _hash;
	}
	public KermetaTokenNode getOppositeName() {
		return _oppositeName;
	}
	public GetterBody getGetterBody() {
		return _getterBody;
	}
	public SetterBody getSetterBody() {
		return _setterBody;
	}


	/**
	 * @return the number of children of this ASTNode
	 */
	public int getChildCount() {
		int count = 0;
		if (_propertyKind != null) count++;
		if (_readOnlyModifier != null) count++;
		if (_name != null) count++;
		if (_colon != null) count++;
		if (_typeRef != null) count++;
		if (_hash != null) count++;
		if (_oppositeName != null) count++;
		if (_getterBody != null) count++;
		if (_setterBody != null) count++;

		return count;
	}

	/**
	 * @param index the index of a child ASTNode to get
	 * @return the child ASTNode at the given index
	 * @throws IndexOutOfBoundsException when the index is out of bounds
	 */
	public ASTNode getChild(int index) {
		int count = -1;
		if ((_propertyKind != null) && (++count == index)) return _propertyKind;
		if ((_readOnlyModifier != null) && (++count == index)) return _readOnlyModifier;
		if ((_name != null) && (++count == index)) return _name;
		if ((_colon != null) && (++count == index)) return _colon;
		if ((_typeRef != null) && (++count == index)) return _typeRef;
		if ((_hash != null) && (++count == index)) return _hash;
		if ((_oppositeName != null) && (++count == index)) return _oppositeName;
		if ((_getterBody != null) && (++count == index)) return _getterBody;
		if ((_setterBody != null) && (++count == index)) return _setterBody;

		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Construct a new Property.
	 */
	public Property(
		PropertyKind propertyKind,
		ReadOnlyModifier readOnlyModifier,
		TokenInfo name,
		TokenInfo colon,
		TypeRef typeRef,
		TokenInfo hash,
		TokenInfo oppositeName,
		GetterBody getterBody,
		SetterBody setterBody
	) {
		super();

		if (propertyKind != null) {
			_propertyKind = propertyKind;
			if (_propertyKind._parent != null) throw new RuntimeException();
			_propertyKind._parent = this;
		}
		if (readOnlyModifier != null) {
			_readOnlyModifier = readOnlyModifier;
			if (_readOnlyModifier._parent != null) throw new RuntimeException();
			_readOnlyModifier._parent = this;
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
		if (hash != null) {
			_hash = new KermetaTokenNode(hash);
			if (_hash._parent != null) throw new RuntimeException();
			_hash._parent = this;
		}
		if (oppositeName != null) {
			_oppositeName = new KermetaTokenNode(oppositeName);
			if (_oppositeName._parent != null) throw new RuntimeException();
			_oppositeName._parent = this;
		}
		if (getterBody != null) {
			_getterBody = getterBody;
			if (_getterBody._parent != null) throw new RuntimeException();
			_getterBody._parent = this;
		}
		if (setterBody != null) {
			_setterBody = setterBody;
			if (_setterBody._parent != null) throw new RuntimeException();
			_setterBody._parent = this;
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
