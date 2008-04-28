/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefinitionCacheEntry.java,v 1.3 2008-04-28 11:50:15 ftanguy Exp $
 */
package org.kermeta.io;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition Cache Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.TypeDefinitionCacheEntry#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.io.TypeDefinitionCacheEntry#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getTypeDefinitionCacheEntry()
 * @model
 * @generated
 */
public interface TypeDefinitionCacheEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionCacheEntry_QualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionCacheEntry#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(TypeDefinition)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionCacheEntry_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionCacheEntry#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(TypeDefinition value);

} // TypeDefinitionCacheEntry
