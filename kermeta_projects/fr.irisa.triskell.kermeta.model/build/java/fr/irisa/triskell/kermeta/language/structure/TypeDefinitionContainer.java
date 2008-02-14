/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionContainer.java,v 1.5 2008-02-14 07:13:01 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer#getOwnedTypeDefinition <em>Owned Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinitionContainer()
 * @model abstract="true"
 *        annotation="GenModel documentation='/** \n * Abstraction of the notion of containment for type definitions. Now, kermeta metamodel contains one container\n * element, that is Package. In a later release, ModelTypeDefinition will be the main container for type and\n * package definition.\n \052/'"
 * @generated
 */
public interface TypeDefinitionContainer extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Owned Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type Definition</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#getTypeDefinitionContainer_OwnedTypeDefinition()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="GenModel documentation='/**\n * Contained TypeDefinitions\n \052/'"
	 * @generated
	 */
	EList<TypeDefinition> getOwnedTypeDefinition();

} // TypeDefinitionContainer