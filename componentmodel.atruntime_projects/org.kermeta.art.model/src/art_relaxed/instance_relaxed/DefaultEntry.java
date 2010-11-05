/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import art_relaxed.type_relaxed.DictionaryDefaultValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.DefaultEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getDefaultEntry()
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
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getDefaultEntry_Key()
	 * @model required="true"
	 * @generated
	 */
	DictionaryDefaultValue getKey();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.DefaultEntry#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(DictionaryDefaultValue value);

} // DefaultEntry
