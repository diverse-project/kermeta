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
 * A representation of the model object '<em><b>Unresolved Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special type reference which is still unresolved.
 * The reference string is used to create a real Type that points to the correct TypeDefinition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UnresolvedType#getUsings <em>Usings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UnresolvedType#getGenerics <em>Generics</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UnresolvedType#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType()
 * @model
 * @generated
 */
public interface UnresolvedType extends Type, Unresolved {
	/**
	 * Returns the value of the '<em><b>Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the Type.
	 * The container of the UnresolvedType  is considered as the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Identifier</em>' attribute.
	 * @see #setTypeIdentifier(String)
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType_TypeIdentifier()
	 * @model dataType="org.kermeta.language.structure.String" required="true"
	 * @generated
	 */
	String getTypeIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UnresolvedType#getTypeIdentifier <em>Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Identifier</em>' attribute.
	 * @see #getTypeIdentifier()
	 * @generated
	 */
	void setTypeIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Using}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Using that can be used to complement the indentifer and resolve this UnresolvedType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType_Usings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Using> getUsings();

	/**
	 * Returns the value of the '<em><b>Generics</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUnresolvedType_Generics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getGenerics();

} // UnresolvedType
