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
 * A representation of the model object '<em><b>Mediaobject Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.MediaobjectType#getImageobject <em>Imageobject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getMediaobjectType()
 * @model extendedMetaData="name='mediaobject_._type' kind='elementOnly'"
 * @generated
 */
public interface MediaobjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Imageobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imageobject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageobject</em>' containment reference.
	 * @see #setImageobject(ImageobjectType)
	 * @see org.kermeta.Docbook.DocbookPackage#getMediaobjectType_Imageobject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imageobject' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageobjectType getImageobject();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.MediaobjectType#getImageobject <em>Imageobject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imageobject</em>' containment reference.
	 * @see #getImageobject()
	 * @generated
	 */
	void setImageobject(ImageobjectType value);

} // MediaobjectType
