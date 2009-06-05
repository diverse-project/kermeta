/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.PublisherType#getPublishername <em>Publishername</em>}</li>
 *   <li>{@link org.kermeta.Docbook.PublisherType#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getPublisherType()
 * @model extendedMetaData="name='publisher_._type' kind='elementOnly'"
 * @generated
 */
public interface PublisherType extends EObject {
	/**
	 * Returns the value of the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishername</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishername</em>' attribute.
	 * @see #setPublishername(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getPublisherType_Publishername()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='element' name='publishername' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublishername();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PublisherType#getPublishername <em>Publishername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishername</em>' attribute.
	 * @see #getPublishername()
	 * @generated
	 */
	void setPublishername(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPublisherType_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PublisherType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

} // PublisherType
