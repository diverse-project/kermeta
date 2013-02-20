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
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstraction for Parameterized types, namely, Class and ModelType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ParameterizedType#getVirtualTypeBinding <em>Virtual Type Binding</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ParameterizedType#getTypeParamBinding <em>Type Param Binding</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getParameterizedType()
 * @model abstract="true"
 * @generated
 */
public interface ParameterizedType extends Type {
	/**
	 * Returns the value of the '<em><b>Virtual Type Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Type Binding</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getParameterizedType_VirtualTypeBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeVariableBinding> getVirtualTypeBinding();

	/**
	 * Returns the value of the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bindings between type variables and provided types 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Param Binding</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getParameterizedType_TypeParamBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeVariableBinding> getTypeParamBinding();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the Type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(GenericTypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getParameterizedType_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	GenericTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.ParameterizedType#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(GenericTypeDefinition value);

} // ParameterizedType
