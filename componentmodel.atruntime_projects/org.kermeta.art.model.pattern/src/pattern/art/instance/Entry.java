/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.Entry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends PObject {
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
	 * @see pattern.art.instance.InstancePackage#getEntry_Value()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link pattern.art.instance.Entry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Entry
