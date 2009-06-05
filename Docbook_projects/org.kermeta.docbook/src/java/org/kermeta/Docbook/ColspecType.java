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
 * A representation of the model object '<em><b>Colspec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ColspecType#getColname <em>Colname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ColspecType#getColwidth <em>Colwidth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getColspecType()
 * @model extendedMetaData="name='colspec_._type' kind='empty'"
 * @generated
 */
public interface ColspecType extends EObject {
	/**
	 * Returns the value of the '<em><b>Colname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colname</em>' attribute.
	 * @see #setColname(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getColspecType_Colname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='colname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ColspecType#getColname <em>Colname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colname</em>' attribute.
	 * @see #getColname()
	 * @generated
	 */
	void setColname(String value);

	/**
	 * Returns the value of the '<em><b>Colwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colwidth</em>' attribute.
	 * @see #setColwidth(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getColspecType_Colwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='colwidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColwidth();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ColspecType#getColwidth <em>Colwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colwidth</em>' attribute.
	 * @see #getColwidth()
	 * @generated
	 */
	void setColwidth(String value);

} // ColspecType
