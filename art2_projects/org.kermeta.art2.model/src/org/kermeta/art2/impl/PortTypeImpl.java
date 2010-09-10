/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.PortTypeImpl#isSynchrone <em>Synchrone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortTypeImpl extends TypeDefinitionImpl implements PortType {
	/**
	 * The default value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchrone() <em>Synchrone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchrone()
	 * @generated
	 * @ordered
	 */
	protected boolean synchrone = SYNCHRONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchrone() {
		return synchrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchrone(boolean newSynchrone) {
		boolean oldSynchrone = synchrone;
		synchrone = newSynchrone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.PORT_TYPE__SYNCHRONE, oldSynchrone, synchrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.PORT_TYPE__SYNCHRONE:
				return isSynchrone();
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
			case Art2Package.PORT_TYPE__SYNCHRONE:
				setSynchrone((Boolean)newValue);
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
			case Art2Package.PORT_TYPE__SYNCHRONE:
				setSynchrone(SYNCHRONE_EDEFAULT);
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
			case Art2Package.PORT_TYPE__SYNCHRONE:
				return synchrone != SYNCHRONE_EDEFAULT;
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
		result.append(" (synchrone: ");
		result.append(synchrone);
		result.append(')');
		return result.toString();
	}

} //PortTypeImpl
