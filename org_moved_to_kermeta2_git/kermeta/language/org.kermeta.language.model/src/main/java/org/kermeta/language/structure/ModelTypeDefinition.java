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
 * A representation of the model object '<em><b>Model Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinition#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinition#getOwnedBindings <em>Owned Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinition#getOwnedTransformations <em>Owned Transformations</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinition#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinition()
 * @model
 * @generated
 */
public interface ModelTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(Metamodel)
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinition_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ModelTypeDefinition#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Owned Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelTypeDefinitionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinition_OwnedBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelTypeDefinitionBinding> getOwnedBindings();

	/**
	 * Returns the value of the '<em><b>Owned Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelTransformation}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ModelTransformation#getOwningModelTypeDefinition <em>Owning Model Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transformations</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinition_OwnedTransformations()
	 * @see org.kermeta.language.structure.ModelTransformation#getOwningModelTypeDefinition
	 * @model opposite="owningModelTypeDefinition" containment="true"
	 * @generated
	 */
	EList<ModelTransformation> getOwnedTransformations();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelElementTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinition_TypeDefinitions()
	 * @model
	 * @generated
	 */
	EList<ModelElementTypeDefinition> getTypeDefinitions();

} // ModelTypeDefinition
