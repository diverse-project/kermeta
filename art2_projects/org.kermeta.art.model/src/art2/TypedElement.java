/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.TypedElement#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see art2.Art2Package#getTypedElement_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link art2.TypedElement#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // TypedElement
