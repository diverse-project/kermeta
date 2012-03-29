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
 * A representation of the model object '<em><b>Partial Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.PartialBinding#getWithRespectTo <em>With Respect To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getPartialBinding()
 * @model abstract="true"
 * @generated
 */
public interface PartialBinding extends ModelTypeBinding {
	/**
	 * Returns the value of the '<em><b>With Respect To</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.language.structure.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Respect To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Respect To</em>' reference list.
	 * @see org.kermeta.language.structure.StructurePackage#getPartialBinding_WithRespectTo()
	 * @model
	 * @generated
	 */
	EList<Operation> getWithRespectTo();

} // PartialBinding
