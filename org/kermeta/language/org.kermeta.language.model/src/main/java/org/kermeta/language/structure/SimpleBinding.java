/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.SimpleBinding#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.SimpleBinding#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getSimpleBinding()
 * @model
 * @generated
 */
public interface SimpleBinding extends ModelTypeBinding {
	/**
	 * Returns the value of the '<em><b>Owned Class Definition Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.SimpleClassDefinitionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Class Definition Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Class Definition Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleBinding_OwnedClassDefinitionBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleClassDefinitionBinding> getOwnedClassDefinitionBindings();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.SimpleEnumerationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Enumeration Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Enumeration Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getSimpleBinding_OwnedEnumerationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleEnumerationBinding> getOwnedEnumerationBindings();

} // SimpleBinding
