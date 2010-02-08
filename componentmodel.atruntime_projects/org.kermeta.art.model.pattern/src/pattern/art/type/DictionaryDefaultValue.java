/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.type;

import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.type.DictionaryDefaultValue#getKey <em>Key</em>}</li>
 *   <li>{@link pattern.art.type.DictionaryDefaultValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.type.TypePackage#getDictionaryDefaultValue()
 * @model
 * @generated
 */
public interface DictionaryDefaultValue extends PObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see pattern.art.type.TypePackage#getDictionaryDefaultValue_Key()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link pattern.art.type.DictionaryDefaultValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

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
	 * @see pattern.art.type.TypePackage#getDictionaryDefaultValue_Value()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link pattern.art.type.DictionaryDefaultValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DictionaryDefaultValue
