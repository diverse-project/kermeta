/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radius</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.Radius#getFocusedClasses <em>Focused Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kompren.slicing.SlicingPackage#getRadius()
 * @model
 * @generated
 */
public interface Radius extends EObject {
	/**
	 * Returns the value of the '<em><b>Focused Classes</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.kompren.slicing.SlicedClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focused Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focused Classes</em>' reference list.
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getRadius_FocusedClasses()
	 * @model
	 * @generated
	 */
	EList<SlicedClass> getFocusedClasses();

} // Radius
