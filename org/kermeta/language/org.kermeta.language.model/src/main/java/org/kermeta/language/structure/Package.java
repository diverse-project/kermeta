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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Package in kermeta. Each kermeta model must have a root package. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link org.kermeta.language.structure.Package#getOwnedAdaptationOperators <em>Owned Adaptation Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, TypeDefinitionContainer {
	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Package}.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nested Packages contained by the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getPackage_NestedPackage()
	 * @see org.kermeta.language.structure.Package#getNestingPackage
	 * @model opposite="nestingPackage" containment="true"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.language.structure.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Owning Package, if any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nesting Package</em>' container reference.
	 * @see #setNestingPackage(Package)
	 * @see org.kermeta.language.structure.StructurePackage#getPackage_NestingPackage()
	 * @see org.kermeta.language.structure.Package#getNestedPackage
	 * @model opposite="nestedPackage"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Package#getNestingPackage <em>Nesting Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' container reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uri of the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.kermeta.language.structure.StructurePackage#getPackage_Uri()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Owned Adaptation Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.AdaptationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Adaptation Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Adaptation Operators</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getPackage_OwnedAdaptationOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptationOperator> getOwnedAdaptationOperators();

} // Package
