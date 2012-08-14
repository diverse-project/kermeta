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
 * A representation of the model object '<em><b>Adaptation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.AdaptationBinding#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.AdaptationBinding#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.AdaptationBinding#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding()
 * @model
 * @generated
 */
public interface AdaptationBinding extends ModelTypeBinding {
	/**
	 * Returns the value of the '<em><b>Owned Class Definition Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ClassDefinitionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Class Definition Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Class Definition Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding_OwnedClassDefinitionBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDefinitionBinding> getOwnedClassDefinitionBindings();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.EnumerationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Enumeration Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Enumeration Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding_OwnedEnumerationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationBinding> getOwnedEnumerationBindings();

	/**
	 * Returns the value of the '<em><b>Used Adaptation Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.UseAdaptationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Adaptation Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Adaptation Operators</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding_UsedAdaptationOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseAdaptationOperator> getUsedAdaptationOperators();

} // AdaptationBinding
