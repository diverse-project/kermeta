/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeReferenceImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.impl;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;

import fr.irisa.triskell.kermeta.language.structure.Type;

import fr.irisa.triskell.kermeta.language.structure.impl.MultiplicityElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeReferenceImpl extends MultiplicityElementImpl implements TypeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BehaviorPackage.eINSTANCE.getTypeReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BehaviorPackage.TYPE_REFERENCE__TAG:
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
				case BehaviorPackage.TYPE_REFERENCE__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE:
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
			case BehaviorPackage.TYPE_REFERENCE__TAG:
				return getTag();
			case BehaviorPackage.TYPE_REFERENCE__NAME:
				return getName();
			case BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE:
				return getContainedType();
			case BehaviorPackage.TYPE_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case BehaviorPackage.TYPE_REFERENCE__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case BehaviorPackage.TYPE_REFERENCE__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case BehaviorPackage.TYPE_REFERENCE__LOWER:
				return new Integer(getLower());
			case BehaviorPackage.TYPE_REFERENCE__UPPER:
				return new Integer(getUpper());
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
			case BehaviorPackage.TYPE_REFERENCE__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case BehaviorPackage.TYPE_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case BehaviorPackage.TYPE_REFERENCE__TYPE:
				setType((Type)newValue);
				return;
			case BehaviorPackage.TYPE_REFERENCE__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case BehaviorPackage.TYPE_REFERENCE__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case BehaviorPackage.TYPE_REFERENCE__LOWER:
				setLower(((Integer)newValue).intValue());
				return;
			case BehaviorPackage.TYPE_REFERENCE__UPPER:
				setUpper(((Integer)newValue).intValue());
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
			case BehaviorPackage.TYPE_REFERENCE__TAG:
				getTag().clear();
				return;
			case BehaviorPackage.TYPE_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case BehaviorPackage.TYPE_REFERENCE__TYPE:
				setType((Type)null);
				return;
			case BehaviorPackage.TYPE_REFERENCE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case BehaviorPackage.TYPE_REFERENCE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case BehaviorPackage.TYPE_REFERENCE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case BehaviorPackage.TYPE_REFERENCE__UPPER:
				setUpper(UPPER_EDEFAULT);
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
			case BehaviorPackage.TYPE_REFERENCE__TAG:
				return tag != null && !tag.isEmpty();
			case BehaviorPackage.TYPE_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.TYPE_REFERENCE__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case BehaviorPackage.TYPE_REFERENCE__TYPE:
				return type != null;
			case BehaviorPackage.TYPE_REFERENCE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case BehaviorPackage.TYPE_REFERENCE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case BehaviorPackage.TYPE_REFERENCE__LOWER:
				return lower != LOWER_EDEFAULT;
			case BehaviorPackage.TYPE_REFERENCE__UPPER:
				return upper != UPPER_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

} //TypeReferenceImpl
