/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaUnitRequireImpl.java,v 1.3 2008-04-28 11:50:12 ftanguy Exp $
 */
package org.kermeta.io.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.kermeta.io.IoPackage;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;

import fr.irisa.triskell.kermeta.language.structure.Require;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Unit Require</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitRequireImpl#getKermetaUnit <em>Kermeta Unit</em>}</li>
 *   <li>{@link org.kermeta.io.impl.KermetaUnitRequireImpl#getRequire <em>Require</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaUnitRequireImpl extends EObjectImpl implements KermetaUnitRequire {
	/**
	 * The cached value of the '{@link #getKermetaUnit() <em>Kermeta Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKermetaUnit()
	 * @generated
	 * @ordered
	 */
	protected KermetaUnit kermetaUnit;

	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected Require require;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KermetaUnitRequireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.KERMETA_UNIT_REQUIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnit getKermetaUnit() {
		if (kermetaUnit != null && kermetaUnit.eIsProxy()) {
			InternalEObject oldKermetaUnit = (InternalEObject)kermetaUnit;
			kermetaUnit = (KermetaUnit)eResolveProxy(oldKermetaUnit);
			if (kermetaUnit != oldKermetaUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT, oldKermetaUnit, kermetaUnit));
			}
		}
		return kermetaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaUnit basicGetKermetaUnit() {
		return kermetaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKermetaUnit(KermetaUnit newKermetaUnit) {
		KermetaUnit oldKermetaUnit = kermetaUnit;
		kermetaUnit = newKermetaUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT, oldKermetaUnit, kermetaUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require getRequire() {
		if (require != null && require.eIsProxy()) {
			InternalEObject oldRequire = (InternalEObject)require;
			require = (Require)eResolveProxy(oldRequire);
			if (require != oldRequire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE, oldRequire, require));
			}
		}
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require basicGetRequire() {
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequire(Require newRequire) {
		Require oldRequire = require;
		require = newRequire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE, oldRequire, require));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT:
				if (resolve) return getKermetaUnit();
				return basicGetKermetaUnit();
			case IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE:
				if (resolve) return getRequire();
				return basicGetRequire();
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
			case IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT:
				setKermetaUnit((KermetaUnit)newValue);
				return;
			case IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE:
				setRequire((Require)newValue);
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
			case IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT:
				setKermetaUnit((KermetaUnit)null);
				return;
			case IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE:
				setRequire((Require)null);
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
			case IoPackage.KERMETA_UNIT_REQUIRE__KERMETA_UNIT:
				return kermetaUnit != null;
			case IoPackage.KERMETA_UNIT_REQUIRE__REQUIRE:
				return require != null;
		}
		return super.eIsSet(featureID);
	}

} //KermetaUnitRequireImpl
