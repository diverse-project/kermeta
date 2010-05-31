/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link patternframework.PModel#getContent <em>Content</em>}</li>
 *   <li>{@link patternframework.PModel#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see patternframework.PatternframeworkPackage#getPModel()
 * @model
 * @generated
 */
public interface PModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link patternframework.PObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see patternframework.PatternframeworkPackage#getPModel_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<PObject> getContent();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link patternframework.PRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see patternframework.PatternframeworkPackage#getPModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<PRole> getRoles();

} // PModel
