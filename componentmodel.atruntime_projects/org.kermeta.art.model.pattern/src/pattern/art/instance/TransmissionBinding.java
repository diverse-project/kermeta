/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import pattern.art.type.AbstractPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.TransmissionBinding#getClient <em>Client</em>}</li>
 *   <li>{@link pattern.art.instance.TransmissionBinding#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getTransmissionBinding()
 * @model
 * @generated
 */
public interface TransmissionBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(AbstractPort)
	 * @see pattern.art.instance.InstancePackage#getTransmissionBinding_Client()
	 * @model
	 * @generated
	 */
	AbstractPort getClient();

	/**
	 * Sets the value of the '{@link pattern.art.instance.TransmissionBinding#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(AbstractPort)
	 * @see pattern.art.instance.InstancePackage#getTransmissionBinding_Server()
	 * @model
	 * @generated
	 */
	AbstractPort getServer();

	/**
	 * Sets the value of the '{@link pattern.art.instance.TransmissionBinding#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(AbstractPort value);

} // TransmissionBinding
