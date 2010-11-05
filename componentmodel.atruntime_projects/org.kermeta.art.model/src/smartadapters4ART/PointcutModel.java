/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART;

import art_relaxed.AspectModelElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.PointcutModel#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.Smartadapters4ARTPackage#getPointcutModel()
 * @model
 * @generated
 */
public interface PointcutModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.AspectModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see smartadapters4ART.Smartadapters4ARTPackage#getPointcutModel_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<AspectModelElement> getContent();

} // PointcutModel
