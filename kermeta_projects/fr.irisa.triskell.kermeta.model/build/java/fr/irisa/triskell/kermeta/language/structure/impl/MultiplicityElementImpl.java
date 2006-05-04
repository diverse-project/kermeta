/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiplicityElementImpl.java,v 1.1 2006-05-04 15:40:07 jmottu Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.MultiplicityElementImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.MultiplicityElementImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.MultiplicityElementImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.MultiplicityElementImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityElementImpl extends TypedElementImpl implements MultiplicityElement {
	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return StructurePackage.eINSTANCE.getMultiplicityElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MULTIPLICITY_ELEMENT__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MULTIPLICITY_ELEMENT__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
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
				case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
					return ((InternalEList)getTag()).basicRemove(otherEnd, msgs);
				case StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE:
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
			case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
				return getTag();
			case StructurePackage.MULTIPLICITY_ELEMENT__NAME:
				return getName();
			case StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE:
				return getContainedType();
			case StructurePackage.MULTIPLICITY_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				return new Integer(getLower());
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
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
			case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
				getTag().clear();
				getTag().addAll((Collection)newValue);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE:
				getContainedType().clear();
				getContainedType().addAll((Collection)newValue);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__TYPE:
				setType((Type)newValue);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				setLower(((Integer)newValue).intValue());
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
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
			case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
				getTag().clear();
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE:
				getContainedType().clear();
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__TYPE:
				setType((Type)null);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
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
			case StructurePackage.MULTIPLICITY_ELEMENT__TAG:
				return tag != null && !tag.isEmpty();
			case StructurePackage.MULTIPLICITY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.MULTIPLICITY_ELEMENT__CONTAINED_TYPE:
				return containedType != null && !containedType.isEmpty();
			case StructurePackage.MULTIPLICITY_ELEMENT__TYPE:
				return type != null;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StructurePackage.MULTIPLICITY_ELEMENT__LOWER:
				return lower != LOWER_EDEFAULT;
			case StructurePackage.MULTIPLICITY_ELEMENT__UPPER:
				return upper != UPPER_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(')');
		return result.toString();
	}

} //MultiplicityElementImpl
