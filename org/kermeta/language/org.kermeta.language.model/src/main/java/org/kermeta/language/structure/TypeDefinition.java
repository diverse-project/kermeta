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
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This boolean allows to tell if this Type definition is an aspect or not
 * If it is an aspect, then at runtime, its definition will be merged with the definition of another
 * TypeDefinition that has exactly the same qualified name
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeDefinition#getIsAspect <em>Is Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends NamedElement, TypeContainer {
	/**
	 * Returns the value of the '<em><b>Is Aspect</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aspect</em>' attribute.
	 * @see #setIsAspect(Boolean)
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_IsAspect()
	 * @model default="false" dataType="org.kermeta.language.structure.Boolean"
	 * @generated
	 */
	Boolean getIsAspect();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.TypeDefinition#getIsAspect <em>Is Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aspect</em>' attribute.
	 * @see #getIsAspect()
	 * @generated
	 */
	void setIsAspect(Boolean value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes from which this ClassDefinition inherits.
	 * TODO after discussion this link seems not correctly named : a better name would be "extends" especially because it can be used in model type and enumeration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_SuperType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> getSuperType();

	/**
	 * Returns the value of the '<em><b>Type Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeMapping}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.TypeMapping#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These mappings define how we can substitute the target Type with this TypeDefinition 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Mappings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getTypeDefinition_TypeMappings()
	 * @see org.kermeta.language.structure.TypeMapping#getSourceType
	 * @model opposite="sourceType" containment="true"
	 * @generated
	 */
	EList<TypeMapping> getTypeMappings();

} // TypeDefinition
