/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtArrayTypeReferenceImpl.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect.reference.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.spoon.reflect.reference.CtArrayTypeReference;
import emf.spoon.reflect.reference.CtPackageReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.ReferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.impl.CtArrayTypeReferenceImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtArrayTypeReferenceImpl extends CtTypeReferenceImpl implements CtArrayTypeReference {
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference componentType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtArrayTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReferencePackage.Literals.CT_ARRAY_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (CtTypeReference)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(CtTypeReference newComponentType) {
		CtTypeReference oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE, oldComponentType, componentType));
	}

	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return getActualTypeArguments();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__SIMPLE_NAME:
				return getSimpleName();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ANNOTATIONS:
				return getAnnotations();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_CLASS:
				return getActualClass();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PRIMITIF:
				return getPrimitif();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__QUALIFIED_NAME:
				return getQualifiedName();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
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
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				getActualTypeArguments().addAll((Collection)newValue);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)newValue);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)newValue);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE:
				setComponentType((CtTypeReference)newValue);
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
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				getActualTypeArguments().clear();
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARING_TYPE:
				setDeclaringType((CtTypeReference)null);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PACKAGE:
				setPackage((CtPackageReference)null);
				return;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE:
				setComponentType((CtTypeReference)null);
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
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_TYPE_ARGUMENTS:
				return !getActualTypeArguments().isEmpty();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARATION:
				return declaration != null;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__DECLARING_TYPE:
				return declaringType != null;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PACKAGE:
				return package_ != null;
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__ACTUAL_CLASS:
				return ACTUAL_CLASS_EDEFAULT == null ? getActualClass() != null : !ACTUAL_CLASS_EDEFAULT.equals(getActualClass());
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__PRIMITIF:
				return PRIMITIF_EDEFAULT == null ? getPrimitif() != null : !PRIMITIF_EDEFAULT.equals(getPrimitif());
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case ReferencePackage.CT_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE:
				return componentType != null;
		}
		return eDynamicIsSet(featureID);
	}
} //CtArrayTypeReferenceImpl