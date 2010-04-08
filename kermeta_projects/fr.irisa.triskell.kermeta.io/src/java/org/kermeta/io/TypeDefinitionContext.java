/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.io;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to store a cache of the getContext on a given TypeDefinition
 * This getContext returns a structure showing all the aspects of this TypeDefinition and all inherited classes (including their respective aspects)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.TypeDefinitionContext#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.io.TypeDefinitionContext#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getTypeDefinitionContext()
 * @model
 * @generated
 */
public interface TypeDefinitionContext extends EObject {
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
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionContext_QualifiedName()
	 * @model dataType="fr.irisa.triskell.kermeta.language.structure.String"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionContext#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Map)
	 * @see org.kermeta.io.IoPackage#getTypeDefinitionContext_Context()
	 * @model transient="true"
	 * @generated
	 */
	Map<Integer, EList<TypeDefinition>> getContext();

	/**
	 * Sets the value of the '{@link org.kermeta.io.TypeDefinitionContext#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Map<Integer, EList<TypeDefinition>> value);

} // TypeDefinitionContext
