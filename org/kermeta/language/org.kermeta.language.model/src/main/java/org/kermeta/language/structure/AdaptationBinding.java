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
 * A representation of the model object '<em><b>Adaptation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.AdaptationBinding#getTarget <em>Target</em>}</li>
 *   <li>{@link org.kermeta.language.structure.AdaptationBinding#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding()
 * @model
 * @generated
 */
public interface AdaptationBinding extends ObjectTypeBinding {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding_Target()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getAdaptationBinding_Source()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getSource();

} // AdaptationBinding
