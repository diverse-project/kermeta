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
 * A representation of the model object '<em><b>Complex Enumeration Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ComplexEnumerationBinding#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexEnumerationBinding#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getComplexEnumerationBinding()
 * @model
 * @generated
 */
public interface ComplexEnumerationBinding extends EnumerationBinding {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexEnumerationBinding_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<Enumeration> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexEnumerationBinding_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Enumeration> getTargets();

} // ComplexEnumerationBinding
