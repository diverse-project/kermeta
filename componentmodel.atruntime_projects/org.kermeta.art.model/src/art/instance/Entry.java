/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.Entry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends EObject {
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
	 * @see art.instance.InstancePackage#getEntry_Value()
	 * @model dataType="art.String" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link art.instance.Entry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Entry
