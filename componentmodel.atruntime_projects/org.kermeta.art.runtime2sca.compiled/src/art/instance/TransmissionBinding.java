/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance;

import art.type.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.TransmissionBinding#getServer <em>Server</em>}</li>
 *   <li>{@link art.instance.TransmissionBinding#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getTransmissionBinding()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv wellFormedTransmissionBinding=''"
 * @generated
 */
public interface TransmissionBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Port)
	 * @see art.instance.InstancePackage#getTransmissionBinding_Server()
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	Port getServer();

	/**
	 * Sets the value of the '{@link art.instance.TransmissionBinding#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Port value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Port)
	 * @see art.instance.InstancePackage#getTransmissionBinding_Client()
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	Port getClient();

	/**
	 * Sets the value of the '{@link art.instance.TransmissionBinding#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Port value);

} // TransmissionBinding
