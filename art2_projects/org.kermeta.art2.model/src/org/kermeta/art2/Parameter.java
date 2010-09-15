/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypedElement)
	 * @see org.kermeta.art2.Art2Package#getParameter_Type()
	 * @model
	 * @generated
	 */
	TypedElement getType();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypedElement value);

} // Parameter
