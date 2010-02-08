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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.Binding#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link pattern.art.instance.Binding#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends PObject {
	/**
	 * Returns the value of the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Instance</em>' reference.
	 * @see #setServerInstance(ComponentInstance)
	 * @see pattern.art.instance.InstancePackage#getBinding_ServerInstance()
	 * @model
	 * @generated
	 */
	ComponentInstance getServerInstance();

	/**
	 * Sets the value of the '{@link pattern.art.instance.Binding#getServerInstance <em>Server Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Instance</em>' reference.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pattern.art.instance.InstancePackage#getBinding_Id()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pattern.art.instance.Binding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Binding
