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
 * A representation of the model object '<em><b>Metamodel Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.MetamodelBinding#getBoundMetamodel <em>Bound Metamodel</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MetamodelBinding#getOwnedClassDefinitionBindings <em>Owned Class Definition Bindings</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MetamodelBinding#getUsedAdaptationOperators <em>Used Adaptation Operators</em>}</li>
 *   <li>{@link org.kermeta.language.structure.MetamodelBinding#getOwnedEnumerationBindings <em>Owned Enumeration Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getMetamodelBinding()
 * @model
 * @generated
 */
public interface MetamodelBinding extends KermetaModelElement {
	/**
	 * Returns the value of the '<em><b>Bound Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Metamodel</em>' reference.
	 * @see #setBoundMetamodel(ResolvedMetamodel)
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodelBinding_BoundMetamodel()
	 * @model required="true"
	 * @generated
	 */
	ResolvedMetamodel getBoundMetamodel();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.MetamodelBinding#getBoundMetamodel <em>Bound Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Metamodel</em>' reference.
	 * @see #getBoundMetamodel()
	 * @generated
	 */
	void setBoundMetamodel(ResolvedMetamodel value);

	/**
	 * Returns the value of the '<em><b>Owned Class Definition Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.ClassDefinitionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Class Definition Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Class Definition Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodelBinding_OwnedClassDefinitionBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDefinitionBinding> getOwnedClassDefinitionBindings();

	/**
	 * Returns the value of the '<em><b>Used Adaptation Operators</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.UseAdaptationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Adaptation Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Adaptation Operators</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodelBinding_UsedAdaptationOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseAdaptationOperator> getUsedAdaptationOperators();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.EnumerationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Enumeration Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Enumeration Bindings</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getMetamodelBinding_OwnedEnumerationBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationBinding> getOwnedEnumerationBindings();

} // MetamodelBinding
