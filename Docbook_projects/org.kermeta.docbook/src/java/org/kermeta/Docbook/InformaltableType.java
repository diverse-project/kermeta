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
 * A representation of the model object '<em><b>Informaltable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.InformaltableType#getTgroup <em>Tgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getInformaltableType()
 * @model extendedMetaData="name='informaltable_._type' kind='elementOnly'"
 * @generated
 */
public interface InformaltableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgroup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgroup</em>' containment reference.
	 * @see #setTgroup(TgroupType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInformaltableType_Tgroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	TgroupType getTgroup();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InformaltableType#getTgroup <em>Tgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgroup</em>' containment reference.
	 * @see #getTgroup()
	 * @generated
	 */
	void setTgroup(TgroupType value);

} // InformaltableType
