/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;

import art_relaxed.AspectModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getKey <em>Key</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getDictionaryDefaultValue()
 * @model
 * @generated
 */
public interface DictionaryDefaultValue extends AspectModelElement {
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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getDictionaryDefaultValue_Key()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getKey <em>Key</em>}' attribute.
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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getDictionaryDefaultValue_Value()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DictionaryDefaultValue
