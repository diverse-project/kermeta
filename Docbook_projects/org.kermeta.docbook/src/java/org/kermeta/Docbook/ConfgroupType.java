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
 * A representation of the model object '<em><b>Confgroup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ConfgroupType#getConftitle <em>Conftitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ConfgroupType#getConfnum <em>Confnum</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ConfgroupType#getConfsponsor <em>Confsponsor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getConfgroupType()
 * @model extendedMetaData="name='confgroup_._type' kind='elementOnly'"
 * @generated
 */
public interface ConfgroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Conftitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conftitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conftitle</em>' attribute.
	 * @see #setConftitle(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getConfgroupType_Conftitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='element' name='conftitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConftitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ConfgroupType#getConftitle <em>Conftitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conftitle</em>' attribute.
	 * @see #getConftitle()
	 * @generated
	 */
	void setConftitle(String value);

	/**
	 * Returns the value of the '<em><b>Confnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confnum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confnum</em>' attribute.
	 * @see #setConfnum(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getConfgroupType_Confnum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='element' name='confnum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConfnum();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ConfgroupType#getConfnum <em>Confnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confnum</em>' attribute.
	 * @see #getConfnum()
	 * @generated
	 */
	void setConfnum(String value);

	/**
	 * Returns the value of the '<em><b>Confsponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confsponsor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confsponsor</em>' attribute.
	 * @see #setConfsponsor(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getConfgroupType_Confsponsor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='element' name='confsponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConfsponsor();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ConfgroupType#getConfsponsor <em>Confsponsor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confsponsor</em>' attribute.
	 * @see #getConfsponsor()
	 * @generated
	 */
	void setConfsponsor(String value);

} // ConfgroupType
