/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.BasicDefaultValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getBasicDefaultValue()
 * @model
 * @generated
 */
public interface BasicDefaultValue extends DefaultValue {
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
	 * @see art.type.TypePackage#getBasicDefaultValue_Value()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link art.type.BasicDefaultValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // BasicDefaultValue
