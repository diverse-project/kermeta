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
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type of a model, consisting of a set of included type definitions.
 * For historical reason, this is both a type and a TypeDefinition, mainly due to the fact that a ModelDefinition isn't a GenericTypeDefinition (maybe this should be discussed again ?)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelType#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends Type, TypeDefinition, TypeDefinitionContainer {

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelType_TypeDefinitions()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinitions();

} // ModelType
