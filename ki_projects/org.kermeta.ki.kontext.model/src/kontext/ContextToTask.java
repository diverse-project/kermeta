/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kontext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context To Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kontext.ContextToTask#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see kontext.KontextPackage#getContextToTask()
 * @model
 * @generated
 */
public interface ContextToTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link kontext.ContextToTaskConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see kontext.KontextPackage#getContextToTask_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextToTaskConstraint> getConstraints();

} // ContextToTask
