/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import pattern.art.type.AbstractPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.DelegationBinding#getSource <em>Source</em>}</li>
 *   <li>{@link pattern.art.instance.DelegationBinding#getExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getDelegationBinding()
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
	 * @see pattern.art.instance.InstancePackage#getDelegationBinding_Source()
	 * @model
	 * @generated
	 */
	AbstractPort getSource();

	/**
	 * Sets the value of the '{@link pattern.art.instance.DelegationBinding#getSource <em>Source</em>}' reference.
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
	 * @see pattern.art.instance.InstancePackage#getDelegationBinding_Exported()
	 * @model
	 * @generated
	 */
	AbstractPort getExported();

	/**
	 * Sets the value of the '{@link pattern.art.instance.DelegationBinding#getExported <em>Exported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' reference.
	 * @see #getExported()
	 * @generated
	 */
	void setExported(AbstractPort value);

} // DelegationBinding
