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
 * A representation of the model object '<em><b>Virtual Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To be written
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.VirtualType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.VirtualType#getModelTypeVariable <em>Model Type Variable</em>}</li>
 *   <li>{@link org.kermeta.language.structure.VirtualType#getTypeParamBinding <em>Type Param Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getVirtualType()
 * @model
 * @generated
 */
public interface VirtualType extends ObjectTypeVariable {
	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(ModelElementTypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getVirtualType_TypeDefinition()
	 * @model required="true"
	 * @generated
	 */
	ModelElementTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.VirtualType#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(ModelElementTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Model Type Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Type Variable</em>' reference.
	 * @see #setModelTypeVariable(ModelTypeVariable)
	 * @see org.kermeta.language.structure.StructurePackage#getVirtualType_ModelTypeVariable()
	 * @see org.kermeta.language.structure.ModelTypeVariable#getVirtualType
	 * @model opposite="virtualType" required="true"
	 * @generated
	 */
	ModelTypeVariable getModelTypeVariable();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.VirtualType#getModelTypeVariable <em>Model Type Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type Variable</em>' reference.
	 * @see #getModelTypeVariable()
	 * @generated
	 */
	void setModelTypeVariable(ModelTypeVariable value);

	/**
	 * Returns the value of the '<em><b>Type Param Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeVariableBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Param Binding</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getVirtualType_TypeParamBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeVariableBinding> getTypeParamBinding();

} // VirtualType
