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
 * A representation of the model object '<em><b>Itemizedlist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ItemizedlistType#getListitem <em>Listitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getItemizedlistType()
 * @model extendedMetaData="name='itemizedlist_._type' kind='elementOnly'"
 * @generated
 */
public interface ItemizedlistType extends EObject {
	/**
	 * Returns the value of the '<em><b>Listitem</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ListitemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listitem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitem</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getItemizedlistType_Listitem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listitem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ListitemType> getListitem();

} // ItemizedlistType
