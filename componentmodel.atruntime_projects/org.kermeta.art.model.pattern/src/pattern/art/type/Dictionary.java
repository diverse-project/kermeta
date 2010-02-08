/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.type;

import org.eclipse.emf.common.util.EList;

import pattern.art.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.type.Dictionary#getValueType <em>Value Type</em>}</li>
 *   <li>{@link pattern.art.type.Dictionary#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.type.TypePackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends Attribute {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(DataType)
	 * @see pattern.art.type.TypePackage#getDictionary_ValueType()
	 * @model
	 * @generated
	 */
	DataType getValueType();

	/**
	 * Sets the value of the '{@link pattern.art.type.Dictionary#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(DataType value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.type.DictionaryDefaultValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see pattern.art.type.TypePackage#getDictionary_Keys()
	 * @model containment="true"
	 * @generated
	 */
	EList<DictionaryDefaultValue> getKeys();

} // Dictionary
