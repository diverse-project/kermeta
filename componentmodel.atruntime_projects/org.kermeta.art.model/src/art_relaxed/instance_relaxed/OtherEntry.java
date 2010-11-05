/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.OtherEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getOtherEntry()
 * @model
 * @generated
 */
public interface OtherEntry extends Entry {
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
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getOtherEntry_Key()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.OtherEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // OtherEntry
