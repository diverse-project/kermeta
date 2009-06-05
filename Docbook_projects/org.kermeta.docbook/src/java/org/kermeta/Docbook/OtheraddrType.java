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
 * A representation of the model object '<em><b>Otheraddr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.OtheraddrType#getUlink <em>Ulink</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getOtheraddrType()
 * @model extendedMetaData="name='otheraddr_._type' kind='elementOnly'"
 * @generated
 */
public interface OtheraddrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ulink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ulink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ulink</em>' containment reference.
	 * @see #setUlink(UlinkType)
	 * @see org.kermeta.Docbook.DocbookPackage#getOtheraddrType_Ulink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ulink' namespace='##targetNamespace'"
	 * @generated
	 */
	UlinkType getUlink();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.OtheraddrType#getUlink <em>Ulink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ulink</em>' containment reference.
	 * @see #getUlink()
	 * @generated
	 */
	void setUlink(UlinkType value);

} // OtheraddrType
