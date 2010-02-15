/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement, NamedElement {
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
	 * @see art2.Art2Package#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	TypedElement getType();

	/**
	 * Sets the value of the '{@link art2.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypedElement value);

} // Parameter
