/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance;

import art.type.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.instance.DelegationBinding#getSource <em>Source</em>}</li>
 *   <li>{@link art.instance.DelegationBinding#getExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.instance.InstancePackage#getDelegationBinding()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta.inv wellFormedDelegationBinding=''"
 * @generated
 */
public interface DelegationBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see art.instance.InstancePackage#getDelegationBinding_Source()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link art.instance.DelegationBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' reference.
	 * @see #setExported(Port)
	 * @see art.instance.InstancePackage#getDelegationBinding_Exported()
	 * @model required="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	Port getExported();

	/**
	 * Sets the value of the '{@link art.instance.DelegationBinding#getExported <em>Exported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' reference.
	 * @see #getExported()
	 * @generated
	 */
	void setExported(Port value);

} // DelegationBinding
