/**
 * <copyright>
 * </copyright>
 *
 * $Id: String.java,v 1.1 2008-10-28 13:18:15 cfaucher Exp $
 */
package kermeta.standard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.String#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getString()
 * @model
 * @generated
 */
public interface String extends ValueType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(java.lang.String)
	 * @see kermeta.standard.StandardPackage#getString_Value()
	 * @model dataType="kermeta.standard.KermetaProperty_String_value"
	 * @generated
	 */
	java.lang.String getValue();

	/**
	 * Sets the value of the '{@link kermeta.standard.String#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(java.lang.String value);

} // String
