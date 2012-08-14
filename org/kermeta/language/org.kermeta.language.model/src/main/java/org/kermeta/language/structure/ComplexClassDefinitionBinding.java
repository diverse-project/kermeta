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
 * A representation of the model object '<em><b>Complex Class Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ComplexClassDefinitionBinding#getOwnedPropertyBindings <em>Owned Property Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexClassDefinitionBinding#getOwnedOperationBindings <em>Owned Operation Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexClassDefinitionBinding#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexClassDefinitionBinding#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getComplexClassDefinitionBinding()
 * @model
 * @generated
 */
public interface ComplexClassDefinitionBinding extends ClassDefinitionBinding {
	/**
	 * Returns the value of the '<em><b>Owned Property Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.PropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexClassDefinitionBinding_OwnedPropertyBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyBinding> getOwnedPropertyBindings();

	/**
	 * Returns the value of the '<em><b>Owned Operation Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.OperationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexClassDefinitionBinding_OwnedOperationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationBinding> getOwnedOperationBindings();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexClassDefinitionBinding_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<ClassDefinition> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ClassDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexClassDefinitionBinding_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<ClassDefinition> getTargets();

} // ComplexClassDefinitionBinding
