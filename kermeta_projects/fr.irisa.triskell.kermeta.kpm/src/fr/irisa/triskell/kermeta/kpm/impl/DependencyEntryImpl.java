/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyEntryImpl.java,v 1.2 2007-04-24 12:39:38 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.DependencyEntry;
import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.RuleType;
import fr.irisa.triskell.kermeta.kpm.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyEntryImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyEntryImpl extends EObjectImpl implements DependencyEntry {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type = null;

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
	protected DependencyEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return KpmPackage.Literals.DEPENDENCY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (RuleType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.DEPENDENCY_ENTRY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RuleType newType) {
		RuleType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY_ENTRY__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.DEPENDENCY_ENTRY__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.DEPENDENCY_ENTRY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.DEPENDENCY_ENTRY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case KpmPackage.DEPENDENCY_ENTRY__UNIT:
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
			case KpmPackage.DEPENDENCY_ENTRY__TYPE:
				setType((RuleType)newValue);
				return;
			case KpmPackage.DEPENDENCY_ENTRY__UNIT:
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
			case KpmPackage.DEPENDENCY_ENTRY__TYPE:
				setType((RuleType)null);
				return;
			case KpmPackage.DEPENDENCY_ENTRY__UNIT:
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
			case KpmPackage.DEPENDENCY_ENTRY__TYPE:
				return type != null;
			case KpmPackage.DEPENDENCY_ENTRY__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //DependencyEntryImpl