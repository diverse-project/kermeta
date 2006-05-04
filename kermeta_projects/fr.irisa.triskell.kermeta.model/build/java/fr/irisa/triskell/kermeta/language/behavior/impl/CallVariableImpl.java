/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariableImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;

import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CallVariableImpl extends CallExpressionImpl implements CallVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getCallVariable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.CALL_VARIABLE__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.CALL_VARIABLE__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.CALL_VARIABLE__PARAMETERS:
					return ((InternalEList)getParameters()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.CALL_VARIABLE__TAG:
				return getTag();
			case BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
			case BehaviorPackage.CALL_VARIABLE__PARAMETERS:
				return getParameters();
			case BehaviorPackage.CALL_VARIABLE__NAME:
				return getName();
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS:
				return getStaticTypeVariableBindings();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.CALL_VARIABLE__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE:
				setStaticType((Type)newValue);
				return;
			case BehaviorPackage.CALL_VARIABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection)newValue);
				return;
			case BehaviorPackage.CALL_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				getStaticTypeVariableBindings().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.CALL_VARIABLE__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE:
				setStaticType((Type)null);
				return;
			case BehaviorPackage.CALL_VARIABLE__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.CALL_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS:
				getStaticTypeVariableBindings().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BehaviorPackage.CALL_VARIABLE__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.CALL_VARIABLE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE:
				return staticType != null;
			case BehaviorPackage.CALL_VARIABLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.CALL_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.CALL_VARIABLE__STATIC_TYPE_VARIABLE_BINDINGS:
				return staticTypeVariableBindings != null && !staticTypeVariableBindings.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //CallVariableImpl
