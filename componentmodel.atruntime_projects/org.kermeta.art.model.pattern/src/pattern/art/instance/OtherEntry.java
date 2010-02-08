/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.OtherEntry#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getOtherEntry()
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
	 * @see pattern.art.instance.InstancePackage#getOtherEntry_Key()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link pattern.art.instance.OtherEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // OtherEntry
