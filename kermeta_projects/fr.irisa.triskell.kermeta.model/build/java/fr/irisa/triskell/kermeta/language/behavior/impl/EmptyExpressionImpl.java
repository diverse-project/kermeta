/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmptyExpressionImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;

import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmptyExpressionImpl extends ExpressionImpl implements EmptyExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getEmptyExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.EMPTY_EXPRESSION__TAG:
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
				case BehaviorPackage.EMPTY_EXPRESSION__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.EMPTY_EXPRESSION__TAG:
				return getTag();
			case BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE:
				if (resolve) return getStaticType();
				return basicGetStaticType();
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
			case BehaviorPackage.EMPTY_EXPRESSION__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE:
				setStaticType((Type)newValue);
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
			case BehaviorPackage.EMPTY_EXPRESSION__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE:
				setStaticType((Type)null);
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
			case BehaviorPackage.EMPTY_EXPRESSION__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.EMPTY_EXPRESSION__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.EMPTY_EXPRESSION__STATIC_TYPE:
				return staticType != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //EmptyExpressionImpl
