/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtSimpleTypeImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.ReferenceTypeFilter;
import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtField;
import emf.spoon.reflect.declaration.CtPackage;
import emf.spoon.reflect.declaration.CtSimpleType;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getINNERTTYPE_SEPARATOR <em>INNERTTYPE SEPARATOR</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getActualClass <em>Actual Class</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getAllFields <em>All Fields</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getTopLevel <em>Top Level</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtSimpleTypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtSimpleTypeImpl extends CtNamedElementImpl implements CtSimpleType {
	/**
	 * The default value of the '{@link #getINNERTTYPE_SEPARATOR() <em>INNERTTYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINNERTTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected static final String INNERTTYPE_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getINNERTTYPE_SEPARATOR() <em>INNERTTYPE SEPARATOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINNERTTYPE_SEPARATOR()
	 * @generated
	 * @ordered
	 */
	protected String innerttypE_SEPARATOR = INNERTTYPE_SEPARATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields = null;

	/**
	 * The cached value of the '{@link #getNestedTypes() <em>Nested Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList nestedTypes = null;

	/**
	 * The default value of the '{@link #getActualClass() <em>Actual Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualClass()
	 * @generated
	 * @ordered
	 */
	protected static final Class ACTUAL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualClass() <em>Actual Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualClass()
	 * @generated
	 * @ordered
	 */
	protected Class actualClass = ACTUAL_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaringType() <em>Declaring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringType()
	 * @generated
	 * @ordered
	 */
	//protected CtSimpleType declaringType = null;

	/**
	 * The cached value of the '{@link #getAllFields() <em>All Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFields()
	 * @generated
	 * @ordered
	 */
	//protected EList allFields = null;

	/**
	 * The default value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TOP_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevel()
	 * @generated
	 * @ordered
	 */
	protected Boolean topLevel = TOP_LEVEL_EDEFAULT;



	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	//protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getINNERTTYPE_SEPARATOR() {
		return innerttypE_SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINNERTTYPE_SEPARATOR(String newINNERTTYPE_SEPARATOR) {
		String oldINNERTTYPE_SEPARATOR = innerttypE_SEPARATOR;
		innerttypE_SEPARATOR = newINNERTTYPE_SEPARATOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR, oldINNERTTYPE_SEPARATOR, innerttypE_SEPARATOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList(CtField.class, this, DeclarationPackage.CT_SIMPLE_TYPE__FIELDS, DeclarationPackage.CT_FIELD__DECLARING_TYPE);
		}
		return new EmfSet(fields);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getNestedTypes() {
		if (nestedTypes == null) {
			nestedTypes = new EObjectWithInverseResolvingEList(CtSimpleType.class, this, DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES, DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE);
		}
		return new EmfSet(nestedTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class getActualClass() {
		return actualClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSimpleType getDeclaringType() {
		if (parent instanceof CtSimpleType) {
			return (CtSimpleType) parent;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtSimpleType basicGetDeclaringType() {
		return this.getDeclaringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfSet getAllFields() {
		return getFields();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTopLevel() {
		return topLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage getPackage() {
		if (parent instanceof CtPackage) {
			return (CtPackage) parent;
		} else if (parent instanceof CtSimpleType) {
			return ((CtSimpleType) parent).getPackage();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtPackage basicGetPackage() {
		return this.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		if (getPackage() != null
				&& !getPackage().getSimpleName().equals(
						CtPackage.TOP_LEVEL_PACKAGE_NAME)) {
			return getPackage().getQualifiedName() + "." + getSimpleName();
		}
		return getSimpleName();
	}
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {

		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_SIMPLE_TYPE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_SIMPLE_TYPE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_SIMPLE_TYPE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_SIMPLE_TYPE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_SIMPLE_TYPE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_SIMPLE_TYPE__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_SIMPLE_TYPE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR:
				return getINNERTTYPE_SEPARATOR();
			case DeclarationPackage.CT_SIMPLE_TYPE__FIELDS:
				return getFields();
			case DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES:
				return getNestedTypes();
			case DeclarationPackage.CT_SIMPLE_TYPE__ACTUAL_CLASS:
				return getActualClass();
			case DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case DeclarationPackage.CT_SIMPLE_TYPE__ALL_FIELDS:
				return getAllFields();
			case DeclarationPackage.CT_SIMPLE_TYPE__TOP_LEVEL:
				return getTopLevel();
			case DeclarationPackage.CT_SIMPLE_TYPE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case DeclarationPackage.CT_SIMPLE_TYPE__QUALIFIED_NAME:
				return getQualifiedName();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeclarationPackage.CT_SIMPLE_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES:
				getNestedTypes().clear();
				getNestedTypes().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeclarationPackage.CT_SIMPLE_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR:
				setINNERTTYPE_SEPARATOR(INNERTTYPE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__FIELDS:
				getFields().clear();
				return;
			case DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES:
				getNestedTypes().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeclarationPackage.CT_SIMPLE_TYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_SIMPLE_TYPE__POSITION:
				return position != null;
			case DeclarationPackage.CT_SIMPLE_TYPE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_SIMPLE_TYPE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_SIMPLE_TYPE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_SIMPLE_TYPE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_SIMPLE_TYPE__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_SIMPLE_TYPE__INNERTTYPE_SEPARATOR:
				return INNERTTYPE_SEPARATOR_EDEFAULT == null ? innerttypE_SEPARATOR != null : !INNERTTYPE_SEPARATOR_EDEFAULT.equals(innerttypE_SEPARATOR);
			case DeclarationPackage.CT_SIMPLE_TYPE__FIELDS:
				return !getFields().isEmpty();
			case DeclarationPackage.CT_SIMPLE_TYPE__NESTED_TYPES:
				return !getNestedTypes().isEmpty();
			case DeclarationPackage.CT_SIMPLE_TYPE__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? actualClass != null : !ACTUAL_CLASS_EDEFAULT.equals(actualClass);
			case DeclarationPackage.CT_SIMPLE_TYPE__DECLARING_TYPE:
				return basicGetDeclaringType() != null;
			case DeclarationPackage.CT_SIMPLE_TYPE__ALL_FIELDS:
				return !getAllFields().isEmpty();
			case DeclarationPackage.CT_SIMPLE_TYPE__TOP_LEVEL:
				return TOP_LEVEL_EDEFAULT == null ? topLevel != null : !TOP_LEVEL_EDEFAULT.equals(topLevel);
			case DeclarationPackage.CT_SIMPLE_TYPE__PACKAGE:
				return basicGetPackage() != null;
			case DeclarationPackage.CT_SIMPLE_TYPE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (INNERTTYPE_SEPARATOR: ");
		result.append(innerttypE_SEPARATOR);
		result.append(", ActualClass: ");
		result.append(actualClass);
		result.append(", TopLevel: ");
		result.append(topLevel);
		result.append(')');
		return result.toString();
	}
	
	//TODO Depending of the context
	@Override
	public CtTypeReference getReference() {
		if (reference != null)
			return (CtTypeReference) reference;
		return null;
		/*else 
			return (CtTypeReference) getFactory().Type().createReference(this);*/
	}
	
	public Set<CtTypeReference<?>> getUsedTypes(boolean includeSamePackage) {
		Set<CtTypeReference<?>> typeRefs = new HashSet<CtTypeReference<?>>();
		for (CtTypeReference<?> typeRef : Query
				.getReferences(this, new ReferenceTypeFilter<CtTypeReference>(
						CtTypeReference.class))) {
			if (!(typeRef.isPrimitive()
					|| (typeRef instanceof CtArrayTypeReference)
					|| typeRef.toString()
							.equals(CtTypeReference.NULL_TYPE_NAME) || (typeRef
					.getPackage() != null && "java.lang".equals(typeRef
					.getPackage().toString())))
					&& !(!includeSamePackage && typeRef.getPackage().equals(
							this.getPackage().getReference()))) {
				typeRefs.add(typeRef);
			}
		}
		return typeRefs;
	}

} //CtSimpleTypeImpl