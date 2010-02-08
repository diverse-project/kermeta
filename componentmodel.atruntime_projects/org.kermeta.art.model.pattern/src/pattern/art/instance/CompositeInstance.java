/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}</li>
 *   <li>{@link pattern.art.instance.CompositeInstance#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getCompositeInstance()
 * @model
 * @generated
 */
public interface CompositeInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Sub Component</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.instance.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link pattern.art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component</em>' containment reference list.
	 * @see pattern.art.instance.InstancePackage#getCompositeInstance_SubComponent()
	 * @see pattern.art.instance.ComponentInstance#getSuperComponent
	 * @model opposite="superComponent" containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getSubComponent();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.instance.DelegationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' containment reference list.
	 * @see pattern.art.instance.InstancePackage#getCompositeInstance_Delegation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationBinding> getDelegation();

} // CompositeInstance
