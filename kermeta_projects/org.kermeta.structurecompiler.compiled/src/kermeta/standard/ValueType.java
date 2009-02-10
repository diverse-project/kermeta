/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ValueType.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.ValueType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getValueType()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * The abstract class ValueType does not contain any feature.\r\n * However, any instance of a sub-class of ValueType will be passed by value \r\n * instead of by reference for any other objects.\r\n * that means that each time you := such object it will call the clone function associated to it (Not implemented yet except for Integer, String and boolean!!!)\r\n * \r\n \052/'"
 *        annotation="kermeta EMF_needProperty='name=value javaClass=java.lang.String'"
 * @generated
 */
public interface ValueType extends kermeta.language.structure.Object {
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
	 * @see kermeta.standard.StandardPackage#getValueType_Value()
	 * @model dataType="kermeta.standard.KermetaProperty_ValueType_value"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.standard.ValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ValueType
