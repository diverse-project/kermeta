/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.BasicAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getBasicAttribute()
 * @model
 * @generated
 */
public interface BasicAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getBasicAttribute_DefaultValue()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.BasicAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // BasicAttribute
