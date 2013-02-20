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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Returns the Attributes, References, and derived Properties owned by
 * the ClassDefinition of this Class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Class#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Class#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ParameterizedType {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient derived reference that returns the Attributes, References, and derived Properties owned by
	 * the ClassDefinition of this Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClass_OwnedAttribute()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient derived reference that returns the Operations owned by the ClassDefinition of this Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClass_OwnedOperation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient derived reference that returns the Classes of which the ClassDefinition of this Class inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getClass_SuperClass()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a Boolean stating whether ClassDefinition of this Class is abstract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see org.kermeta.language.structure.StructurePackage#getClass_IsAbstract()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean" changeable="false" derived="true"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient derived attribute that returns the name of this Class calculated from the ClassDefinition and the optionnal type parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.kermeta.language.structure.StructurePackage#getClass_Name()
	 * @model dataType="org.kermeta.language.structure.String" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();


} // Class
