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
 * A representation of the model object '<em><b>Complex Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.ComplexPropertyBinding#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.ComplexPropertyBinding#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getComplexPropertyBinding()
 * @model
 * @generated
 */
public interface ComplexPropertyBinding extends PropertyBinding {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexPropertyBinding_Sources()
	 * @model required="true"
	 * @generated
	 */
	EList<Property> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getComplexPropertyBinding_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<Property> getTargets();

} // ComplexPropertyBinding
