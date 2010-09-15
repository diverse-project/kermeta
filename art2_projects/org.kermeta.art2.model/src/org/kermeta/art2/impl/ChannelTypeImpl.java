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
import org.kermeta.art2.ChannelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ChannelTypeImpl#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ChannelTypeImpl#getStopMethod <em>Stop Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelTypeImpl extends TypeDefinitionImpl implements ChannelType {
	/**
	 * The default value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String START_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMethod() <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMethod()
	 * @generated
	 * @ordered
	 */
	protected String startMethod = START_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopMethod() <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopMethod()
	 * @generated
	 * @ordered
	 */
	protected String stopMethod = STOP_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartMethod() {
		return startMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartMethod(String newStartMethod) {
		String oldStartMethod = startMethod;
		startMethod = newStartMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.CHANNEL_TYPE__START_METHOD, oldStartMethod, startMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopMethod() {
		return stopMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopMethod(String newStopMethod) {
		String oldStopMethod = stopMethod;
		stopMethod = newStopMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.CHANNEL_TYPE__STOP_METHOD, oldStopMethod, stopMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.CHANNEL_TYPE__START_METHOD:
				return getStartMethod();
			case Art2Package.CHANNEL_TYPE__STOP_METHOD:
				return getStopMethod();
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
			case Art2Package.CHANNEL_TYPE__START_METHOD:
				setStartMethod((String)newValue);
				return;
			case Art2Package.CHANNEL_TYPE__STOP_METHOD:
				setStopMethod((String)newValue);
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
			case Art2Package.CHANNEL_TYPE__START_METHOD:
				setStartMethod(START_METHOD_EDEFAULT);
				return;
			case Art2Package.CHANNEL_TYPE__STOP_METHOD:
				setStopMethod(STOP_METHOD_EDEFAULT);
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
			case Art2Package.CHANNEL_TYPE__START_METHOD:
				return START_METHOD_EDEFAULT == null ? startMethod != null : !START_METHOD_EDEFAULT.equals(startMethod);
			case Art2Package.CHANNEL_TYPE__STOP_METHOD:
				return STOP_METHOD_EDEFAULT == null ? stopMethod != null : !STOP_METHOD_EDEFAULT.equals(stopMethod);
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
		result.append(" (startMethod: ");
		result.append(startMethod);
		result.append(", stopMethod: ");
		result.append(stopMethod);
		result.append(')');
		return result.toString();
	}

} //ChannelTypeImpl
