/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.TransmissionBinding;

import art_relaxed.type_relaxed.AbstractPort;

import smartadapters4ART.SetAdaptation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntimeinstance Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding()
 * @model
 * @generated
 */
public interface SetruntimeinstanceTransmissionBinding extends SetAdaptation {
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet()
	 * @model
	 * @generated
	 */
	TransmissionBinding getTransmissionBindingToSet();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_Refclient()
	 * @model
	 * @generated
	 */
	AbstractPort getRefclient();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefclient <em>Refclient</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_Refserver()
	 * @model
	 * @generated
	 */
	AbstractPort getRefserver();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserver <em>Refserver</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_RefserverInstance()
	 * @model
	 * @generated
	 */
	ComponentInstance getRefserverInstance();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefserverInstance <em>Refserver Instance</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceTransmissionBinding_RefId()
	 * @model dataType="smartadapters4ART.String"
	 * @generated
	 */
	String getRefId();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding#getRefId <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Id</em>' attribute.
	 * @see #getRefId()
	 * @generated
	 */
	void setRefId(String value);

} // SetruntimeinstanceTransmissionBinding
