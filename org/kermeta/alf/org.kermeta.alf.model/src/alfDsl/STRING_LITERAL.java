/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STRING LITERAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.STRING_LITERAL#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSTRING_LITERAL()
 * @model
 * @generated
 */
public interface STRING_LITERAL extends LITERAL {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see alfDsl.AlfDslPackage#getSTRING_LITERAL_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link alfDsl.STRING_LITERAL#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // STRING_LITERAL
