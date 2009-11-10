/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import art.type.BasicAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.ValuedAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link art.instance.ValuedAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getValuedAttribute()
 * @model
 * @generated
 */
public interface ValuedAttribute extends AttributeInstance {
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
	 * @see art.instance.InstancePackage#getValuedAttribute_Value()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link art.instance.ValuedAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(BasicAttribute)
	 * @see art.instance.InstancePackage#getValuedAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	BasicAttribute getAttribute();

	/**
	 * Sets the value of the '{@link art.instance.ValuedAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(BasicAttribute value);

} // ValuedAttribute
