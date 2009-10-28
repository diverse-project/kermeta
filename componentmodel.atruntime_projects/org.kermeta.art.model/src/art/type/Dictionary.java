/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import art.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.Dictionary#getKeyType <em>Key Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends Attribute {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(DataType)
	 * @see art.type.TypePackage#getDictionary_KeyType()
	 * @model required="true"
	 * @generated
	 */
	DataType getKeyType();

	/**
	 * Sets the value of the '{@link art.type.Dictionary#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(DataType value);

} // Dictionary
