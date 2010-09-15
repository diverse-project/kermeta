/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.TypeLibrary#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getTypeLibrary()
 * @model
 * @generated
 */
public interface TypeLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Types</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getTypeLibrary_SubTypes()
	 * @model
	 * @generated
	 */
	EList<TypeDefinition> getSubTypes();

} // TypeLibrary
