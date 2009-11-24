/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.kpm.impl;

import fr.irisa.triskell.kermeta.kpm.KpmPackage;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.Usage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UsageImpl#getUsedUnit <em>Used Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UsageImpl#getUserUnit <em>User Unit</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.impl.UsageImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageImpl extends EObjectImpl implements Usage {
	/**
	 * The cached value of the '{@link #getUsedUnit() <em>Used Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit usedUnit;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KpmPackage.Literals.USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUsedUnit() {
		if (usedUnit != null && usedUnit.eIsProxy()) {
			InternalEObject oldUsedUnit = (InternalEObject)usedUnit;
			usedUnit = (Unit)eResolveProxy(oldUsedUnit);
			if (usedUnit != oldUsedUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpmPackage.USAGE__USED_UNIT, oldUsedUnit, usedUnit));
			}
		}
		return usedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUsedUnit() {
		return usedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedUnit(Unit newUsedUnit, NotificationChain msgs) {
		Unit oldUsedUnit = usedUnit;
		usedUnit = newUsedUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KpmPackage.USAGE__USED_UNIT, oldUsedUnit, newUsedUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedUnit(Unit newUsedUnit) {
		if (newUsedUnit != usedUnit) {
			NotificationChain msgs = null;
			if (usedUnit != null)
				msgs = ((InternalEObject)usedUnit).eInverseRemove(this, KpmPackage.UNIT__USED_BY, Unit.class, msgs);
			if (newUsedUnit != null)
				msgs = ((InternalEObject)newUsedUnit).eInverseAdd(this, KpmPackage.UNIT__USED_BY, Unit.class, msgs);
			msgs = basicSetUsedUnit(newUsedUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.USAGE__USED_UNIT, newUsedUnit, newUsedUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUserUnit() {
		if (eContainerFeatureID() != KpmPackage.USAGE__USER_UNIT) return null;
		return (Unit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserUnit(Unit newUserUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUserUnit, KpmPackage.USAGE__USER_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserUnit(Unit newUserUnit) {
		if (newUserUnit != eInternalContainer() || (eContainerFeatureID() != KpmPackage.USAGE__USER_UNIT && newUserUnit != null)) {
			if (EcoreUtil.isAncestor(this, newUserUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUserUnit != null)
				msgs = ((InternalEObject)newUserUnit).eInverseAdd(this, KpmPackage.UNIT__USED_USAGES, Unit.class, msgs);
			msgs = basicSetUserUnit(newUserUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.USAGE__USER_UNIT, newUserUnit, newUserUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KpmPackage.USAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				if (usedUnit != null)
					msgs = ((InternalEObject)usedUnit).eInverseRemove(this, KpmPackage.UNIT__USED_BY, Unit.class, msgs);
				return basicSetUsedUnit((Unit)otherEnd, msgs);
			case KpmPackage.USAGE__USER_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUserUnit((Unit)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				return basicSetUsedUnit(null, msgs);
			case KpmPackage.USAGE__USER_UNIT:
				return basicSetUserUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KpmPackage.USAGE__USER_UNIT:
				return eInternalContainer().eInverseRemove(this, KpmPackage.UNIT__USED_USAGES, Unit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				if (resolve) return getUsedUnit();
				return basicGetUsedUnit();
			case KpmPackage.USAGE__USER_UNIT:
				return getUserUnit();
			case KpmPackage.USAGE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				setUsedUnit((Unit)newValue);
				return;
			case KpmPackage.USAGE__USER_UNIT:
				setUserUnit((Unit)newValue);
				return;
			case KpmPackage.USAGE__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				setUsedUnit((Unit)null);
				return;
			case KpmPackage.USAGE__USER_UNIT:
				setUserUnit((Unit)null);
				return;
			case KpmPackage.USAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KpmPackage.USAGE__USED_UNIT:
				return usedUnit != null;
			case KpmPackage.USAGE__USER_UNIT:
				return getUserUnit() != null;
			case KpmPackage.USAGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //UsageImpl
