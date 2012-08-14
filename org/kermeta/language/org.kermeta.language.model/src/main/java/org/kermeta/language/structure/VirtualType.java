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
 *   <li>{@link org.kermeta.language.structure.VirtualType#getClassDefinition <em>Class Definition</em>}</li>
 *   <li>{@link org.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}</li>
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
	 * Returns the value of the '<em><b>Class Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Definition</em>' reference.
	 * @see #setClassDefinition(ClassDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getVirtualType_ClassDefinition()
	 * @model required="true"
	 * @generated
	 */
	ClassDefinition getClassDefinition();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.VirtualType#getClassDefinition <em>Class Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Definition</em>' reference.
	 * @see #getClassDefinition()
	 * @generated
	 */
	void setClassDefinition(ClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.ModelTypeVariable#getVirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be written
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Type</em>' reference.
	 * @see #setModelType(ModelTypeVariable)
	 * @see org.kermeta.language.structure.StructurePackage#getVirtualType_ModelType()
	 * @see org.kermeta.language.structure.ModelTypeVariable#getVirtualType
	 * @model opposite="virtualType" required="true"
	 * @generated
	 */
	ModelTypeVariable getModelType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.VirtualType#getModelType <em>Model Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' reference.
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelTypeVariable value);

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
