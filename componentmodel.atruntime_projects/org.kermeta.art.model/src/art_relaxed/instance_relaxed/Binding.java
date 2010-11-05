/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import art_relaxed.AspectModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.Binding#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.Binding#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getBinding()
 * @model abstract="true"
 * @generated
 */
public interface Binding extends AspectModelElement {
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
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getBinding_ServerInstance()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getServerInstance();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.Binding#getServerInstance <em>Server Instance</em>}' reference.
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
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getBinding_Id()
	 * @model dataType="art_relaxed.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.Binding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Binding
