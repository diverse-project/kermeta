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
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.AbstractType#getPara <em>Para</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getAbstractType()
 * @model extendedMetaData="name='abstract_._type' kind='elementOnly'"
 * @generated
 */
public interface AbstractType extends EObject {
	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference.
	 * @see #setPara(ParaType)
	 * @see org.kermeta.Docbook.DocbookPackage#getAbstractType_Para()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	ParaType getPara();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.AbstractType#getPara <em>Para</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Para</em>' containment reference.
	 * @see #getPara()
	 * @generated
	 */
	void setPara(ParaType value);

} // AbstractType
