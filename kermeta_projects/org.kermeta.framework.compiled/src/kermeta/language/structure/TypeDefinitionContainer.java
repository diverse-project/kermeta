/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionContainer.java,v 1.2 2008-08-19 13:22:57 cfaucher Exp $
 */
package kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.structure.TypeDefinitionContainer#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.structure.StructurePackage#getTypeDefinitionContainer()
 * @model abstract="true"
 *        annotation="kermeta documentation='Abstraction of the notion of containment for type definitions. Now, kermeta metamodel contains one container\nelement, that is Package. In a later release, ModelTypeDefinition will be the main container for type and\npackage definition.'"
 * @generated
 */
public interface TypeDefinitionContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type Definition</em>' containment reference list.
	 * @see kermeta.language.structure.StructurePackage#getTypeDefinitionContainer_OwnedTypeDefinition()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Contained TypeDefinitions'"
	 * @generated
	 */
	EList<TypeDefinition> getOwnedTypeDefinition();

} // TypeDefinitionContainer
