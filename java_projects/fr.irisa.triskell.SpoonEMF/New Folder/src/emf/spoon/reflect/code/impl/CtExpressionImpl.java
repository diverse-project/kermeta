/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtExpressionImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spoon.reflect.declaration.CtTypedElement;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.impl.CtExpressionImpl#getTypeCasts <em>Type Casts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtExpressionImpl extends CtCodeElementImpl implements CtExpression {
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
	 * The cached value of the '{@link #getTypeCasts() <em>Type Casts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCasts()
	 * @generated
	 * @ordered
	 */
	protected EList typeCasts = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_EXPRESSION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTypeCasts() {
		if (typeCasts == null) {
			typeCasts = new EObjectResolvingEList(CtTypeReference.class, this, CodePackage.CT_EXPRESSION__TYPE_CASTS);
		}
		return typeCasts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_EXPRESSION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_EXPRESSION__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_EXPRESSION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_EXPRESSION__TYPE_CASTS:
				return getTypeCasts();
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
			case CodePackage.CT_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_EXPRESSION__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_EXPRESSION__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_EXPRESSION__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_EXPRESSION__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_EXPRESSION__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
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
			case CodePackage.CT_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_EXPRESSION__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_EXPRESSION__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_EXPRESSION__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_EXPRESSION__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_EXPRESSION__TYPE_CASTS:
				getTypeCasts().clear();
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
			case CodePackage.CT_EXPRESSION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_EXPRESSION__POSITION:
				return position != null;
			case CodePackage.CT_EXPRESSION__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_EXPRESSION__PARENT:
				return parent != null;
			case CodePackage.CT_EXPRESSION__TYPE:
				return type != null;
			case CodePackage.CT_EXPRESSION__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
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
				case CodePackage.CT_EXPRESSION__TYPE: return DeclarationPackage.CT_TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtExpression.class) {
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
				case DeclarationPackage.CT_TYPED_ELEMENT__TYPE: return CodePackage.CT_EXPRESSION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	public String getSignature() {
		// TODO Auto-generated method stub
		return null;
	}

} //CtExpressionImpl