/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Adaptation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.UseAdaptationOperator#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UseAdaptationOperator#getOwnedUnresolved <em>Owned Unresolved</em>}</li>
 *   <li>{@link org.kermeta.language.structure.UseAdaptationOperator#getUsedOperator <em>Used Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getUseAdaptationOperator()
 * @model
 * @generated
 */
public interface UseAdaptationOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.KermetaModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this element must instance of Operation, Property ClassDefinition, Enumeration of EnumLiteral
	 * TODO : should we create a common super class for them ?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUseAdaptationOperator_Parameters()
	 * @model
	 * @generated
	 */
	EList<KermetaModelElement> getParameters();

	/**
	 * Returns the value of the '<em><b>Owned Unresolved</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Unresolved}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Unresolved</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Unresolved</em>' containment reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getUseAdaptationOperator_OwnedUnresolved()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unresolved> getOwnedUnresolved();

	/**
	 * Returns the value of the '<em><b>Used Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Operator</em>' reference.
	 * @see #setUsedOperator(AdaptationOperator)
	 * @see org.kermeta.language.structure.StructurePackage#getUseAdaptationOperator_UsedOperator()
	 * @model required="true"
	 * @generated
	 */
	AdaptationOperator getUsedOperator();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.UseAdaptationOperator#getUsedOperator <em>Used Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Operator</em>' reference.
	 * @see #getUsedOperator()
	 * @generated
	 */
	void setUsedOperator(AdaptationOperator value);

} // UseAdaptationOperator
