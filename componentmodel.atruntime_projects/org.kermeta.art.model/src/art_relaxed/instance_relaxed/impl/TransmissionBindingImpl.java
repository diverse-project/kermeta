/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed.impl;

import art_relaxed.instance_relaxed.Instance_relaxedPackage;
import art_relaxed.instance_relaxed.TransmissionBinding;

import art_relaxed.type_relaxed.AbstractPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.impl.TransmissionBindingImpl#getClient <em>Client</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.impl.TransmissionBindingImpl#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransmissionBindingImpl extends BindingImpl implements TransmissionBinding {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected AbstractPort client;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected AbstractPort server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Instance_relaxedPackage.Literals.TRANSMISSION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (AbstractPort)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(AbstractPort newClient) {
		AbstractPort oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (AbstractPort)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(AbstractPort newServer) {
		AbstractPort oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
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
			case Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT:
				setClient((AbstractPort)newValue);
				return;
			case Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER:
				setServer((AbstractPort)newValue);
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
			case Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT:
				setClient((AbstractPort)null);
				return;
			case Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER:
				setServer((AbstractPort)null);
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
			case Instance_relaxedPackage.TRANSMISSION_BINDING__CLIENT:
				return client != null;
			case Instance_relaxedPackage.TRANSMISSION_BINDING__SERVER:
				return server != null;
		}
		return super.eIsSet(featureID);
	}

} //TransmissionBindingImpl
