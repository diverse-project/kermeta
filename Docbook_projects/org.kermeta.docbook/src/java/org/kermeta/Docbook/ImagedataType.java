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
 * A representation of the model object '<em><b>Imagedata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ImagedataType#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ImagedataType#getFileref <em>Fileref</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ImagedataType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getImagedataType()
 * @model extendedMetaData="name='imagedata_._type' kind='empty'"
 * @generated
 */
public interface ImagedataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getImagedataType_Depth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='depth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepth();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ImagedataType#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(String value);

	/**
	 * Returns the value of the '<em><b>Fileref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fileref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileref</em>' attribute.
	 * @see #setFileref(Object)
	 * @see org.kermeta.Docbook.DocbookPackage#getImagedataType_Fileref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='fileref' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFileref();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ImagedataType#getFileref <em>Fileref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileref</em>' attribute.
	 * @see #getFileref()
	 * @generated
	 */
	void setFileref(Object value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getImagedataType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ImagedataType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // ImagedataType
