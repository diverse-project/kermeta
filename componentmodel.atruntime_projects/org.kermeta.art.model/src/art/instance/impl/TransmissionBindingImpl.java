/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import art.instance.InstancePackage;
import art.instance.TransmissionBinding;
import art.type.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.instance.impl.TransmissionBindingImpl#getClient <em>Client</em>}</li>
 *   <li>{@link art.instance.impl.TransmissionBindingImpl#getServer <em>Server</em>}</li>
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
	protected Port client;
	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Port server;

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
		return InstancePackage.Literals.TRANSMISSION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Port)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.TRANSMISSION_BINDING__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Port newClient) {
		Port oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRANSMISSION_BINDING__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Port)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.TRANSMISSION_BINDING__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Port newServer) {
		Port oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRANSMISSION_BINDING__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.TRANSMISSION_BINDING__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case InstancePackage.TRANSMISSION_BINDING__SERVER:
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
			case InstancePackage.TRANSMISSION_BINDING__CLIENT:
				setClient((Port)newValue);
				return;
			case InstancePackage.TRANSMISSION_BINDING__SERVER:
				setServer((Port)newValue);
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
			case InstancePackage.TRANSMISSION_BINDING__CLIENT:
				setClient((Port)null);
				return;
			case InstancePackage.TRANSMISSION_BINDING__SERVER:
				setServer((Port)null);
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
			case InstancePackage.TRANSMISSION_BINDING__CLIENT:
				return client != null;
			case InstancePackage.TRANSMISSION_BINDING__SERVER:
				return server != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	public String getClientName() {
		return getClient().getName();
	}

	/**
	 * @generated NOT
	 */
	public String getServerName() {
		return getServer().getName();
	}

} //TransmissionBindingImpl
