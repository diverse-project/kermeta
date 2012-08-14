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
 * A representation of the model object '<em><b>Enum Literalbinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.EnumLiteralbinding#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.EnumLiteralbinding#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getEnumLiteralbinding()
 * @model
 * @generated
 */
public interface EnumLiteralbinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getEnumLiteralbinding_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getEnumLiteralbinding_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getTargets();

} // EnumLiteralbinding
