/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtVariableImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.declaration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.CtVariable;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.impl.CtVariableImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract  class CtVariableImpl extends CtNamedElementImpl implements CtVariable {
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
	 * The cached value of the '{@link #getDefaultExpression() <em>Default Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExpression()
	 * @generated
	 * @ordered
	 */
	protected CtExpression defaultExpression = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CT_VARIABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression getDefaultExpression() {
		if (defaultExpression != null && defaultExpression.eIsProxy()) {
			InternalEObject oldDefaultExpression = (InternalEObject)defaultExpression;
			defaultExpression = (CtExpression)eResolveProxy(oldDefaultExpression);
			if (defaultExpression != oldDefaultExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION, oldDefaultExpression, defaultExpression));
			}
		}
		return defaultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtExpression basicGetDefaultExpression() {
		return defaultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExpression(CtExpression newDefaultExpression) {
		CtExpression oldDefaultExpression = defaultExpression;
		defaultExpression = newDefaultExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION, oldDefaultExpression, defaultExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationPackage.CT_VARIABLE__ANNOTATIONS:
				return getAnnotations();
			case DeclarationPackage.CT_VARIABLE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case DeclarationPackage.CT_VARIABLE__DOC_COMMENT:
				return getDocComment();
			case DeclarationPackage.CT_VARIABLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case DeclarationPackage.CT_VARIABLE__MODIFIERS:
				return getModifiers();
			case DeclarationPackage.CT_VARIABLE__SIMPLE_NAME:
				return getSimpleName();
			case DeclarationPackage.CT_VARIABLE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case DeclarationPackage.CT_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION:
				if (resolve) return getDefaultExpression();
				return basicGetDefaultExpression();
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
			case DeclarationPackage.CT_VARIABLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__PARENT:
				setParent((CtElement)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION:
				setDefaultExpression((CtExpression)newValue);
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
			case DeclarationPackage.CT_VARIABLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DeclarationPackage.CT_VARIABLE__POSITION:
				setPosition((SourcePosition)null);
				return;
			case DeclarationPackage.CT_VARIABLE__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case DeclarationPackage.CT_VARIABLE__PARENT:
				setParent((CtElement)null);
				return;
			case DeclarationPackage.CT_VARIABLE__MODIFIERS:
				getModifiers().clear();
				return;
			case DeclarationPackage.CT_VARIABLE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case DeclarationPackage.CT_VARIABLE__TYPE:
				setType((CtTypeReference)null);
				return;
			case DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION:
				setDefaultExpression((CtExpression)null);
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
			case DeclarationPackage.CT_VARIABLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case DeclarationPackage.CT_VARIABLE__POSITION:
				return position != null;
			case DeclarationPackage.CT_VARIABLE__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case DeclarationPackage.CT_VARIABLE__PARENT:
				return parent != null;
			case DeclarationPackage.CT_VARIABLE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case DeclarationPackage.CT_VARIABLE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case DeclarationPackage.CT_VARIABLE__REFERENCE:
				return reference != null;
			case DeclarationPackage.CT_VARIABLE__TYPE:
				return type != null;
			case DeclarationPackage.CT_VARIABLE__DEFAULT_EXPRESSION:
				return defaultExpression != null;
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
				case DeclarationPackage.CT_VARIABLE__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtVariable.class) {
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
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return DeclarationPackage.CT_VARIABLE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.declaration.CtVariable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	public CtVariableReference getReference(){
		return (CtVariableReference) super.getReference();
	}

} //CtVariableImpl