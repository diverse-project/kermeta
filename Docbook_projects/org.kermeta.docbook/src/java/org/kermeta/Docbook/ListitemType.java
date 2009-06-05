/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listitem Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ListitemType#getItemizedlist <em>Itemizedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ListitemType#getPara <em>Para</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getListitemType()
 * @model extendedMetaData="name='listitem_._type' kind='elementOnly'"
 * @generated
 */
public interface ListitemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Itemizedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemizedlist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #setItemizedlist(ItemizedlistType)
	 * @see org.kermeta.Docbook.DocbookPackage#getListitemType_Itemizedlist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemizedlist' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemizedlistType getItemizedlist();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ListitemType#getItemizedlist <em>Itemizedlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemizedlist</em>' containment reference.
	 * @see #getItemizedlist()
	 * @generated
	 */
	void setItemizedlist(ItemizedlistType value);

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getListitemType_Para()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParaType> getPara();

} // ListitemType
