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
 * A representation of the model object '<em><b>Unresolved Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedTypeDefinition#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UnresolvedTypeDefinition#getTypeDefinitionIdentifier <em>Type Definition Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedTypeDefinition()
 * @model
 * @generated
 */
public interface UnresolvedTypeDefinition extends Unresolved, TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Using that can be used to complement the indentifer and resolve this UnresolvedType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedTypeDefinition_Usings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Type Definition Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the Type.
	 * The container of the UnresolvedType  is considered as the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition Identifier</em>' attribute.
	 * @see #setTypeDefinitionIdentifier(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedTypeDefinition_TypeDefinitionIdentifier()
	 * @model dataType="org.kermeta.language.structure.String" required="true"
	 * @generated
	 */
	String getTypeDefinitionIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedTypeDefinition#getTypeDefinitionIdentifier <em>Type Definition Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition Identifier</em>' attribute.
	 * @see #getTypeDefinitionIdentifier()
	 * @generated
	 */
	void setTypeDefinitionIdentifier(String value);

} // UnresolvedTypeDefinition
