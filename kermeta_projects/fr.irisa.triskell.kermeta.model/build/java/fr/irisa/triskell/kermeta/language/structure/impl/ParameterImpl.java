/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MultiplicityElementImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID != StructurePackage.PARAMETER__OPERATION) return null;
		return (Operation)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eContainer || (eContainerFeatureID != StructurePackage.PARAMETER__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, StructurePackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOperation, StructurePackage.PARAMETER__OPERATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PARAMETER__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.PARAMETER__TAG:
					return ((InternalEList)getTag()).basicAdd(otherEnd, msgs);
				case StructurePackage.PARAMETER__OPERATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, StructurePackage.PARAMETER__OPERATION, msgs);
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
				case StructurePackage.PARAMETER__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case StructurePackage.PARAMETER__CONTAINED_TYPE:
					return ((InternalEList)getContainedType()).basicRemove(otherEnd, msgs);
				case StructurePackage.PARAMETER__OPERATION:
					return eBasicSetContainer(null, StructurePackage.PARAMETER__OPERATION, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case StructurePackage.PARAMETER__OPERATION:
					return eContainer.eInverseRemove(this, StructurePackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case StructurePackage.PARAMETER__TAG:
				return getTag();
			case StructurePackage.PARAMETER__NAME:
				return getName();
			case StructurePackage.PARAMETER__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case StructurePackage.PARAMETER__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PARAMETER__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.PARAMETER__LOWER:
				return new Integer(getLower());
			case StructurePackage.PARAMETER__UPPER:
				return new Integer(getUpper());
			case StructurePackage.PARAMETER__OPERATION:
				return getOperation();
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
			case StructurePackage.PARAMETER__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case StructurePackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.PARAMETER__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case StructurePackage.PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case StructurePackage.PARAMETER__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PARAMETER__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.PARAMETER__LOWER:
				setLower(((Integer)newValue).intValue());
				return;
			case StructurePackage.PARAMETER__UPPER:
				setUpper(((Integer)newValue).intValue());
				return;
			case StructurePackage.PARAMETER__OPERATION:
				setOperation((Operation)newValue);
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
			case StructurePackage.PARAMETER__TAG:
				getTag().clear();
				return;
			case StructurePackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.PARAMETER__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.PARAMETER__TYPE:
				setType((Type)null);
				return;
			case StructurePackage.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case StructurePackage.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StructurePackage.PARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case StructurePackage.PARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case StructurePackage.PARAMETER__OPERATION:
				setOperation((Operation)null);
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
			case StructurePackage.PARAMETER__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.PARAMETER__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.PARAMETER__TYPE:
				return type != null;
			case StructurePackage.PARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case StructurePackage.PARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StructurePackage.PARAMETER__LOWER:
				return lower != LOWER_EDEFAULT;
			case StructurePackage.PARAMETER__UPPER:
				return upper != UPPER_EDEFAULT;
			case StructurePackage.PARAMETER__OPERATION:
				return getOperation() != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ParameterImpl
