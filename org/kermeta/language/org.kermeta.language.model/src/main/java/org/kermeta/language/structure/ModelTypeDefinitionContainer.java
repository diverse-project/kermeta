/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ModelTypeDefinitionContainer#getOwnedModelTypeDefinitions <em>Owned Model Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionContainer()
 * @model
 * @generated
 */
public interface ModelTypeDefinitionContainer extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Owned Model Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ModelTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Type Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Type Definitions</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getModelTypeDefinitionContainer_OwnedModelTypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelTypeDefinition> getOwnedModelTypeDefinitions();

} // ModelTypeDefinitionContainer
