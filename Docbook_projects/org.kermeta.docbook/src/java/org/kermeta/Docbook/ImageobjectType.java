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
 * A representation of the model object '<em><b>Imageobject Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ImageobjectType#getImagedata <em>Imagedata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getImageobjectType()
 * @model extendedMetaData="name='imageobject_._type' kind='elementOnly'"
 * @generated
 */
public interface ImageobjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Imagedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagedata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagedata</em>' containment reference.
	 * @see #setImagedata(ImagedataType)
	 * @see org.kermeta.Docbook.DocbookPackage#getImageobjectType_Imagedata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='imagedata' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagedataType getImagedata();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ImageobjectType#getImagedata <em>Imagedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagedata</em>' containment reference.
	 * @see #getImagedata()
	 * @generated
	 */
	void setImagedata(ImagedataType value);

} // ImageobjectType
