/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestKeyImpl.java,v 1.1 2007-04-04 13:43:55 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest.impl;

import fr.irisa.triskell.kermeta.extension.Interest;

import fr.irisa.triskell.kermeta.kpm.Unit;

import fr.irisa.triskell.kermeta.kpm.interest.InterestKey;
import fr.irisa.triskell.kermeta.kpm.interest.InterestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl#getDeclaringObject <em>Declaring Object</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.interest.impl.InterestKeyImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterestKeyImpl extends EObjectImpl implements InterestKey {
	/**
	 * The default value of the '{@link #getDeclaringObject() <em>Declaring Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringObject()
	 * @generated
	 * @ordered
	 */
	protected static final Interest DECLARING_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaringObject() <em>Declaring Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringObject()
	 * @generated
	 * @ordered
	 */
	protected Interest declaringObject = DECLARING_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterestKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InterestPackage.Literals.INTEREST_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interest getDeclaringObject() {
		return declaringObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringObject(Interest newDeclaringObject) {
		Interest oldDeclaringObject = declaringObject;
		declaringObject = newDeclaringObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterestPackage.INTEREST_KEY__DECLARING_OBJECT, oldDeclaringObject, declaringObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterestPackage.INTEREST_KEY__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterestPackage.INTEREST_KEY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterestPackage.INTEREST_KEY__DECLARING_OBJECT:
				return getDeclaringObject();
			case InterestPackage.INTEREST_KEY__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InterestPackage.INTEREST_KEY__DECLARING_OBJECT:
				setDeclaringObject((Interest)newValue);
				return;
			case InterestPackage.INTEREST_KEY__UNIT:
				setUnit((Unit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case InterestPackage.INTEREST_KEY__DECLARING_OBJECT:
				setDeclaringObject(DECLARING_OBJECT_EDEFAULT);
				return;
			case InterestPackage.INTEREST_KEY__UNIT:
				setUnit((Unit)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InterestPackage.INTEREST_KEY__DECLARING_OBJECT:
				return DECLARING_OBJECT_EDEFAULT == null ? declaringObject != null : !DECLARING_OBJECT_EDEFAULT.equals(declaringObject);
			case InterestPackage.INTEREST_KEY__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (declaringObject: ");
		result.append(declaringObject);
		result.append(')');
		return result.toString();
	}

} //InterestKeyImpl