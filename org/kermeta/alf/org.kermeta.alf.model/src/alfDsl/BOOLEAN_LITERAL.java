/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOOLEAN LITERAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.BOOLEAN_LITERAL#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getBOOLEAN_LITERAL()
 * @model
 * @generated
 */
public interface BOOLEAN_LITERAL extends LITERAL {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link alfDsl.BooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see alfDsl.BooleanValue
	 * @see #setValue(BooleanValue)
	 * @see alfDsl.AlfDslPackage#getBOOLEAN_LITERAL_Value()
	 * @model
	 * @generated
	 */
	BooleanValue getValue();

	/**
	 * Sets the value of the '{@link alfDsl.BOOLEAN_LITERAL#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see alfDsl.BooleanValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BooleanValue value);

} // BOOLEAN_LITERAL
