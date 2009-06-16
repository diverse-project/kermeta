/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.type;

import art.instance.DelegationBinding;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.CompositeType#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link art.type.CompositeType#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getCompositeType()
 * @model annotation="kermeta ecore='true'"
 * @generated
 */
public interface CompositeType extends ComponentType {
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
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<DelegationBinding> getDelegation();

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
	 * @model annotation="kermeta ecore='true'"
	 * @generated
	 */
	EList<CompositeType> getSubTypes();

} // CompositeType
