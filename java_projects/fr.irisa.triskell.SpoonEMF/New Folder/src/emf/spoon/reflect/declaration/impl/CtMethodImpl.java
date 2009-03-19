/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtMethodImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.code.CtBlock;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtMethod;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtMethodImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract  class CtMethodImpl extends CtExecutableImpl implements CtMethod {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CtTypeReference type = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CtTypeReference)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_METHOD__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtTypeReference basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CtTypeReference newType) {
		CtTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_METHOD__TYPE, oldType, type));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_METHOD__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_METHOD__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_METHOD__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_METHOD__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_METHOD__FORMAL_TYPE_PARAMETERS:
				return getFormalTypeParameters();
			case DeclarationPackage.CT_METHOD__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_METHOD__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_METHOD__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_METHOD__EXECUTABLE_SEPARATOR:
				return getEXECUTABLE_SEPARATOR();
			case DeclarationPackage.CT_METHOD__PARAMETERS:
				return getParameters();
			case DeclarationPackage.CT_METHOD__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case DeclarationPackage.CT_METHOD__THROWN_TYPES:
				return getThrownTypes();
			case DeclarationPackage.CT_METHOD__DECLARING_TYPE:
				if (resolve) return getDeclaringType();
				return basicGetDeclaringType();
			case DeclarationPackage.CT_METHOD__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case DeclarationPackage.CT_METHOD__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_METHOD__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_METHOD__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_METHOD__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_METHOD__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				getFormalTypeParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_METHOD__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_METHOD__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_METHOD__EXECUTABLE_SEPARATOR:
				setEXECUTABLE_SEPARATOR((String)newValue);
				return;
			case DeclarationPackage.CT_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_METHOD__BODY:
				setBody((CtBlock)newValue);
				return;
			case DeclarationPackage.CT_METHOD__THROWN_TYPES:
				getThrownTypes().clear();
				getThrownTypes().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_METHOD__TYPE:
				setType((CtTypeReference)newValue);
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
			case DeclarationPackage.CT_METHOD__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_METHOD__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_METHOD__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_METHOD__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_METHOD__FORMAL_TYPE_PARAMETERS:
				getFormalTypeParameters().clear();
				return;
			case DeclarationPackage.CT_METHOD__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_METHOD__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_METHOD__EXECUTABLE_SEPARATOR:
				setEXECUTABLE_SEPARATOR(EXECUTABLE_SEPARATOR_EDEFAULT);
				return;
			case DeclarationPackage.CT_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case DeclarationPackage.CT_METHOD__BODY:
				setBody((CtBlock)null);
				return;
			case DeclarationPackage.CT_METHOD__THROWN_TYPES:
				getThrownTypes().clear();
				return;
			case DeclarationPackage.CT_METHOD__TYPE:
				setType((CtTypeReference)null);
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
			case DeclarationPackage.CT_METHOD__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_METHOD__POSITION:
				return position != null;
			case DeclarationPackage.CT_METHOD__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_METHOD__PARENT:
				return parent != null;
			case DeclarationPackage.CT_METHOD__FORMAL_TYPE_PARAMETERS:
				return formalTypeParameters != null && !formalTypeParameters.isEmpty();
			case DeclarationPackage.CT_METHOD__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_METHOD__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_METHOD__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_METHOD__EXECUTABLE_SEPARATOR:
				return EXECUTABLE_SEPARATOR_EDEFAULT == null ? executablE_SEPARATOR != null : !EXECUTABLE_SEPARATOR_EDEFAULT.equals(executablE_SEPARATOR);
			case DeclarationPackage.CT_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DeclarationPackage.CT_METHOD__BODY:
				return body != null;
			case DeclarationPackage.CT_METHOD__THROWN_TYPES:
				return thrownTypes != null && !thrownTypes.isEmpty();
			case DeclarationPackage.CT_METHOD__DECLARING_TYPE:
				return basicGetDeclaringType() != null;
			case DeclarationPackage.CT_METHOD__TYPE:
				return type != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtTypedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtTypedElement.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.CT_METHOD__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtMethod.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == CtTypedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.declaration.CtTypedElement.class) {
			switch (baseFeatureID) {
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return DeclarationPackage.CT_METHOD__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtMethod.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
} //CtMethodImpl