/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.Channel;
import org.kermeta.art2.MBinding;
import org.kermeta.art2.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBinding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.MBindingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.MBindingImpl#getHub <em>Hub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MBindingImpl extends EObjectImpl implements MBinding {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getHub() <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHub()
	 * @generated
	 * @ordered
	 */
	protected Channel hub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.MBINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.MBINDING__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.MBINDING__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getHub() {
		if (hub != null && hub.eIsProxy()) {
			InternalEObject oldHub = (InternalEObject)hub;
			hub = (Channel)eResolveProxy(oldHub);
			if (hub != oldHub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.MBINDING__HUB, oldHub, hub));
			}
		}
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetHub() {
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHub(Channel newHub) {
		Channel oldHub = hub;
		hub = newHub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.MBINDING__HUB, oldHub, hub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.MBINDING__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case Art2Package.MBINDING__HUB:
				if (resolve) return getHub();
				return basicGetHub();
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
			case Art2Package.MBINDING__PORT:
				setPort((Port)newValue);
				return;
			case Art2Package.MBINDING__HUB:
				setHub((Channel)newValue);
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
			case Art2Package.MBINDING__PORT:
				setPort((Port)null);
				return;
			case Art2Package.MBINDING__HUB:
				setHub((Channel)null);
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
			case Art2Package.MBINDING__PORT:
				return port != null;
			case Art2Package.MBINDING__HUB:
				return hub != null;
		}
		return super.eIsSet(featureID);
	}

} //MBindingImpl
