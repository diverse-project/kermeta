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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.ki.task.Task#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.ki.task.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link org.kermeta.ki.task.Task#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link org.kermeta.ki.task.Task#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.ki.task.TaskPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Arnaud Blouin - INRIA, Centre Rennes, Triskell Team, France";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.kermeta.ki.task.TaskPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.ki.task.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.kermeta.ki.task.TaskPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.kermeta.ki.task.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Subtasks</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.ki.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtasks</em>' reference list.
	 * @see org.kermeta.ki.task.TaskPackage#getTask_Subtasks()
	 * @model
	 * @generated
	 */
	EList<Task> getSubtasks();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.ki.task.UnaryOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.kermeta.ki.task.UnaryOperation
	 * @see #setOperation(UnaryOperation)
	 * @see org.kermeta.ki.task.TaskPackage#getTask_Operation()
	 * @model
	 * @generated
	 */
	UnaryOperation getOperation();

	/**
	 * Sets the value of the '{@link org.kermeta.ki.task.Task#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.kermeta.ki.task.UnaryOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(UnaryOperation value);

} // Task
