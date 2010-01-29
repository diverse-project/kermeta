/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.ki.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.ki.task.TaskModel#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.kermeta.ki.task.TaskModel#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.ki.task.TaskPackage#getTaskModel()
 * @model
 * @generated
 */
public interface TaskModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Arnaud Blouin - INRIA, Centre Rennes, Triskell Team, France";

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.ki.task.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.kermeta.ki.task.TaskPackage#getTaskModel_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operator> getOperations();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.ki.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.kermeta.ki.task.TaskPackage#getTaskModel_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // TaskModel
