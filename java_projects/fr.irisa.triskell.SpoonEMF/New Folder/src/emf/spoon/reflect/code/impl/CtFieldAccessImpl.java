/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtFieldAccessImpl.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spoon.reflect.code.CtVariableAccess;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.CtExpression;
import emf.spoon.reflect.code.CtFieldAccess;
import emf.spoon.reflect.declaration.CtElement;
import emf.spoon.reflect.declaration.SourcePosition;
import emf.spoon.reflect.reference.CtFieldReference;
import emf.spoon.reflect.reference.CtTypeReference;
import emf.spoon.reflect.reference.CtVariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ct Field Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.impl.CtFieldAccessImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CtFieldAccessImpl extends CtTargetedExpressionImpl implements CtFieldAccess {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected CtVariableReference variable = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtFieldAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodePackage.Literals.CT_FIELD_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtFieldReference getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (CtVariableReference)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CT_FIELD_ACCESS__VARIABLE, oldVariable, variable));
			}
		}
		return (CtFieldReference) variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtVariableReference basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(CtVariableReference newVariable) {
		CtVariableReference oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CT_FIELD_ACCESS__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CT_FIELD_ACCESS__ANNOTATIONS:
				return getAnnotations();
			case CodePackage.CT_FIELD_ACCESS__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CodePackage.CT_FIELD_ACCESS__DOC_COMMENT:
				return getDocComment();
			case CodePackage.CT_FIELD_ACCESS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CodePackage.CT_FIELD_ACCESS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.CT_FIELD_ACCESS__TYPE_CASTS:
				return getTypeCasts();
			case CodePackage.CT_FIELD_ACCESS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CodePackage.CT_FIELD_ACCESS__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case CodePackage.CT_FIELD_ACCESS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__POSITION:
				setPosition((SourcePosition)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__DOC_COMMENT:
				setDocComment((String)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__PARENT:
				setParent((CtElement)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__TYPE:
				setType((CtTypeReference)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__TYPE_CASTS:
				getTypeCasts().clear();
				getTypeCasts().addAll((Collection)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__TARGET:
				setTarget((CtExpression)newValue);
				return;
			case CodePackage.CT_FIELD_ACCESS__VARIABLE:
				setVariable((CtVariableReference)newValue);
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
			case CodePackage.CT_FIELD_ACCESS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CodePackage.CT_FIELD_ACCESS__POSITION:
				setPosition((SourcePosition)null);
				return;
			case CodePackage.CT_FIELD_ACCESS__DOC_COMMENT:
				setDocComment(DOC_COMMENT_EDEFAULT);
				return;
			case CodePackage.CT_FIELD_ACCESS__PARENT:
				setParent((CtElement)null);
				return;
			case CodePackage.CT_FIELD_ACCESS__TYPE:
				setType((CtTypeReference)null);
				return;
			case CodePackage.CT_FIELD_ACCESS__TYPE_CASTS:
				getTypeCasts().clear();
				return;
			case CodePackage.CT_FIELD_ACCESS__TARGET:
				setTarget((CtExpression)null);
				return;
			case CodePackage.CT_FIELD_ACCESS__VARIABLE:
				setVariable((CtVariableReference)null);
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
			case CodePackage.CT_FIELD_ACCESS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CodePackage.CT_FIELD_ACCESS__POSITION:
				return position != null;
			case CodePackage.CT_FIELD_ACCESS__DOC_COMMENT:
				return DOC_COMMENT_EDEFAULT == null ? docComment != null : !DOC_COMMENT_EDEFAULT.equals(docComment);
			case CodePackage.CT_FIELD_ACCESS__PARENT:
				return parent != null;
			case CodePackage.CT_FIELD_ACCESS__TYPE:
				return type != null;
			case CodePackage.CT_FIELD_ACCESS__TYPE_CASTS:
				return typeCasts != null && !typeCasts.isEmpty();
			case CodePackage.CT_FIELD_ACCESS__TARGET:
				return target != null;
			case CodePackage.CT_FIELD_ACCESS__VARIABLE:
				return variable != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CtVariableAccess.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtVariableAccess.class) {
			switch (derivedFeatureID) {
				case CodePackage.CT_FIELD_ACCESS__VARIABLE: return CodePackage.CT_VARIABLE_ACCESS__VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtFieldAccess.class) {
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
		if (baseClass == CtVariableAccess.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == emf.spoon.reflect.code.CtVariableAccess.class) {
			switch (baseFeatureID) {
				case CodePackage.CT_VARIABLE_ACCESS__VARIABLE: return CodePackage.CT_FIELD_ACCESS__VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == spoon.reflect.code.CtFieldAccess.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CtFieldAccessImpl