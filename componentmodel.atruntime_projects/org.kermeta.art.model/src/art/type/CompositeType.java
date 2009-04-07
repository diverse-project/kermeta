/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import org.eclipse.emf.common.util.EList;

import art.instance.DelegationBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.CompositeType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link art.type.CompositeType#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends ComponentType {
	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link art.type.CompositeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see art.type.TypePackage#getCompositeType_SubTypes()
	 * @model
	 * @generated
	 */
	EList<CompositeType> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link art.instance.DelegationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' containment reference list.
	 * @see art.type.TypePackage#getCompositeType_Delegation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationBinding> getDelegation();

} // CompositeType
