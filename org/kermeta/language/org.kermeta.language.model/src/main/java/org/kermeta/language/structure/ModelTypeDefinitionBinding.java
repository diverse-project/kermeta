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
 * A representation of the model object '<em><b>Model Type Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getBoundModelTypeDefinition <em>Bound Model Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getTargetedTransformations <em>Targeted Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding()
 * @model
 * @generated
 */
public interface ModelTypeDefinitionBinding extends KermetaModelElement, ModelTypeDefinitionContainer {
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
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding_OwnedClassDefinitionBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDefinitionBinding> getOwnedClassDefinitionBindings();

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
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding_UsedAdaptationOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseAdaptationOperator> getUsedAdaptationOperators();

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
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding_OwnedEnumerationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationBinding> getOwnedEnumerationBindings();

	/**
	 * Returns the value of the '<em><b>Bound Model Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Model Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Model Type Definition</em>' reference.
	 * @see #setBoundModelTypeDefinition(ModelTypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding_BoundModelTypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	ModelTypeDefinition getBoundModelTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTypeDefinitionBinding#getBoundModelTypeDefinition <em>Bound Model Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Model Type Definition</em>' reference.
	 * @see #getBoundModelTypeDefinition()
	 * @generated
	 */
	void setBoundModelTypeDefinition(ModelTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Targeted Transformations</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Transformations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeted Transformations</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionBinding_TargetedTransformations()
	 * @model
	 * @generated
	 */
	EList<ModelTransformation> getTargetedTransformations();

} // ModelTypeDefinitionBinding
