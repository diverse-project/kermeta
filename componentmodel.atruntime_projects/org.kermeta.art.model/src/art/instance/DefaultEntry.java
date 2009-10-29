/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import art.type.DictionaryDefaultValue;
import art.type.DefaultValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.DefaultEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getDefaultEntry()
 * @model
 * @generated
 */
public interface DefaultEntry extends Entry {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(DictionaryDefaultValue)
	 * @see art.instance.InstancePackage#getDefaultEntry_Key()
	 * @model required="true"
	 * @generated
	 */
	DictionaryDefaultValue getKey();

	/**
	 * Sets the value of the '{@link art.instance.DefaultEntry#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(DictionaryDefaultValue value);

} // DefaultEntry
