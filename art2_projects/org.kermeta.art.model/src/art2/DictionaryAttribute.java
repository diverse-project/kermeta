/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.DictionaryAttribute#getType <em>Type</em>}</li>
 *   <li>{@link art2.DictionaryAttribute#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getDictionaryAttribute()
 * @model
 * @generated
 */
public interface DictionaryAttribute extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypedElement)
	 * @see art2.Art2Package#getDictionaryAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	TypedElement getType();

	/**
	 * Sets the value of the '{@link art2.DictionaryAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypedElement value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see art2.Art2Package#getDictionaryAttribute_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link art2.DictionaryAttribute#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // DictionaryAttribute
