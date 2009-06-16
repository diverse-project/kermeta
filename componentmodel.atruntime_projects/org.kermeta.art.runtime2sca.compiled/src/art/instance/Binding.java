/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance;

import art.AddElement;
import art.RemoveElement;
import art.UpdateElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.Binding#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link art.instance.Binding#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getBinding()
 * @model abstract="true"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv wellFormedBinding=''"
 * @generated
 */
public interface Binding extends AddElement, RemoveElement, UpdateElement {
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
	 * @see art.instance.InstancePackage#getBinding_ServerInstance()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	ComponentInstance getServerInstance();

	/**
	 * Sets the value of the '{@link art.instance.Binding#getServerInstance <em>Server Instance</em>}' reference.
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
	 * @see art.instance.InstancePackage#getBinding_Id()
	 * @model dataType="art.String"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link art.instance.Binding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Binding
