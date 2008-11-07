/**
 * <copyright>
 * </copyright>
 *
 * $Id: Integer.java,v 1.3 2008-11-07 08:53:23 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.Integer#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getInteger()
 * @model
 * @generated
 */
public interface Integer extends ValueType {
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
	 * @see kermeta.standard.StandardPackage#getInteger_Value()
	 * @model dataType="kermeta.standard.KermetaProperty_Integer_value"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.standard.Integer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Integer
