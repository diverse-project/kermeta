/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.CompositeInstance#getSubComponent <em>Sub Component</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.CompositeInstance#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getCompositeInstance()
 * @model
 * @generated
 */
public interface CompositeInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Sub Component</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component</em>' containment reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getCompositeInstance_SubComponent()
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent
	 * @model opposite="superComponent" containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getSubComponent();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.DelegationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' containment reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getCompositeInstance_Delegation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationBinding> getDelegation();

} // CompositeInstance
