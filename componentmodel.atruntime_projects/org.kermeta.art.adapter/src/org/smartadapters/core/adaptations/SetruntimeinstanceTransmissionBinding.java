/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations;

import org.smartadapters.core.setAdaptation;

import pattern.art.instance.ComponentInstance;
import pattern.art.instance.TransmissionBinding;

import pattern.art.type.AbstractPort;
import pattern.art.type.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntimeinstance Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding()
 * @model
 * @generated
 */
public interface SetruntimeinstanceTransmissionBinding extends setAdaptation {
	/**
	 * Returns the value of the '<em><b>Transmission Binding To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Binding To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Binding To Set</em>' reference.
	 * @see #setTransmissionBindingToSet(TransmissionBinding)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet()
	 * @model
	 * @generated
	 */
	TransmissionBinding getTransmissionBindingToSet();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Binding To Set</em>' reference.
	 * @see #getTransmissionBindingToSet()
	 * @generated
	 */
	void setTransmissionBindingToSet(TransmissionBinding value);

	/**
	 * Returns the value of the '<em><b>Refclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refclient</em>' reference.
	 * @see #setRefclient(AbstractPort)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_Refclient()
	 * @model
	 * @generated
	 */
	AbstractPort getRefclient();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refclient</em>' reference.
	 * @see #getRefclient()
	 * @generated
	 */
	void setRefclient(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>Refserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refserver</em>' reference.
	 * @see #setRefserver(AbstractPort)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_Refserver()
	 * @model
	 * @generated
	 */
	AbstractPort getRefserver();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refserver</em>' reference.
	 * @see #getRefserver()
	 * @generated
	 */
	void setRefserver(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>Refserver Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refserver Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refserver Instance</em>' reference.
	 * @see #setRefserverInstance(ComponentInstance)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_RefserverInstance()
	 * @model
	 * @generated
	 */
	ComponentInstance getRefserverInstance();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refserver Instance</em>' reference.
	 * @see #getRefserverInstance()
	 * @generated
	 */
	void setRefserverInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Id</em>' attribute.
	 * @see #setRefId(String)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_RefId()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getRefId();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Id</em>' attribute.
	 * @see #getRefId()
	 * @generated
	 */
	void setRefId(String value);

} // SetruntimeinstanceTransmissionBinding
