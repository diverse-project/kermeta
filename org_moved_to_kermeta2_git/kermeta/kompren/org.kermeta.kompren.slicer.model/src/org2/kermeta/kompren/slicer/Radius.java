/**
 * INRIA/IRISA
 * Triskell Team
 */
package org2.kermeta.kompren.slicer;

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
 *   <li>{@link org2.kermeta.kompren.slicer.Radius#getFocusedClasses <em>Focused Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org2.kermeta.kompren.slicer.SlicerPackage#getRadius()
 * @model
 * @generated
 */
public interface Radius extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA/IRISA\nTriskell Team";

	/**
	 * Returns the value of the '<em><b>Focused Classes</b></em>' reference list.
	 * The list contents are of type {@link org2.kermeta.kompren.slicer.SlicedClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focused Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focused Classes</em>' reference list.
	 * @see org2.kermeta.kompren.slicer.SlicerPackage#getRadius_FocusedClasses()
	 * @model
	 * @generated
	 */
	EList<SlicedClass> getFocusedClasses();

} // Radius
