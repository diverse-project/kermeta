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
 * A representation of the model object '<em><b>Component Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.ComponentTypeLibrary#getSubComponentTypes <em>Sub Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getComponentTypeLibrary()
 * @model
 * @generated
 */
public interface ComponentTypeLibrary extends DeployUnit {
	/**
	 * Returns the value of the '<em><b>Sub Component Types</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.art2.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component Types</em>' reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentTypeLibrary_SubComponentTypes()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getSubComponentTypes();

} // ComponentTypeLibrary
