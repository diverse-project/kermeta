/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import art.type.AbstractPort;
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
 * @model
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
	 * @see #setSource(AbstractPort)
	 * @see art.instance.InstancePackage#getDelegationBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	AbstractPort getSource();

	/**
	 * Sets the value of the '{@link art.instance.DelegationBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' reference.
	 * @see #setExported(AbstractPort)
	 * @see art.instance.InstancePackage#getDelegationBinding_Exported()
	 * @model required="true"
	 * @generated
	 */
	AbstractPort getExported();

	/**
	 * Sets the value of the '{@link art.instance.DelegationBinding#getExported <em>Exported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' reference.
	 * @see #getExported()
	 * @generated
	 */
	void setExported(AbstractPort value);

} // DelegationBinding
