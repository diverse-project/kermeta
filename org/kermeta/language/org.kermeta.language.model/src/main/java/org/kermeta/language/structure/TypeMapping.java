/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.TypeMapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeMapping#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.kermeta.language.structure.TypeMapping#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getTypeMapping()
 * @model
 * @generated
 */
public interface TypeMapping extends org.kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(EObject)
	 * @see org.kermeta.language.structure.StructurePackage#getTypeMapping_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EObject getMapping();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.TypeMapping#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(Type)
	 * @see org.kermeta.language.structure.StructurePackage#getTypeMapping_TargetType()
	 * @model required="true"
	 * @generated
	 */
	Type getTargetType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.TypeMapping#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(Type value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.TypeDefinition#getTypeMappings <em>Type Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' container reference.
	 * @see #setSourceType(TypeDefinition)
	 * @see org.kermeta.language.structure.StructurePackage#getTypeMapping_SourceType()
	 * @see org.kermeta.language.structure.TypeDefinition#getTypeMappings
	 * @model opposite="typeMappings" required="true" transient="false"
	 * @generated
	 */
	TypeDefinition getSourceType();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.TypeMapping#getSourceType <em>Source Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' container reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(TypeDefinition value);

} // TypeMapping
