/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.implem.impl;

import art.implem.ImplemPackage;
import art.implem.OSGiPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Gi Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.implem.impl.OSGiPortImpl#getServiceId <em>Service Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSGiPortImpl extends PortImplementationImpl implements OSGiPort {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSGiPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplemPackage.Literals.OS_GI_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ImplemPackage.OS_GI_PORT__SERVICE_ID, oldServiceId,
					serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImplemPackage.OS_GI_PORT__SERVICE_ID:
			return getServiceId();
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
		case ImplemPackage.OS_GI_PORT__SERVICE_ID:
			setServiceId((String) newValue);
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
		case ImplemPackage.OS_GI_PORT__SERVICE_ID:
			setServiceId(SERVICE_ID_EDEFAULT);
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
		case ImplemPackage.OS_GI_PORT__SERVICE_ID:
			return SERVICE_ID_EDEFAULT == null ? serviceId != null
					: !SERVICE_ID_EDEFAULT.equals(serviceId);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(')');
		return result.toString();
	}

} //OSGiPortImpl
