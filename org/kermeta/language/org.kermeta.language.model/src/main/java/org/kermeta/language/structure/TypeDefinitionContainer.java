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
 * A representation of the model object '<em><b>Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstraction of the notion of containment for type definitions. Now, kermeta metamodel contains one container
 * element, that is Package. In a later release, ModelTypeDefinition will be the main container for type and
 * package definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.TypeDefinitionContainer#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinitionContainer()
 * @model
 * @generated
 */
public interface TypeDefinitionContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained TypeDefinitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type Definition</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinitionContainer_OwnedTypeDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TypeDefinition> getOwnedTypeDefinition();

} // TypeDefinitionContainer
