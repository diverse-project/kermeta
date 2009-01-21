/**
 * <copyright>
 * </copyright>
 *
 * $Id: Character.java,v 1.5 2009-01-21 09:15:57 cfaucher Exp $
 */
package kermeta.standard;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.standard.Character#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.standard.StandardPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends ValueType {
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
	 * @see kermeta.standard.StandardPackage#getCharacter_Value()
	 * @model dataType="kermeta.standard.KermetaProperty_Character_value"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.standard.Character#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Character
