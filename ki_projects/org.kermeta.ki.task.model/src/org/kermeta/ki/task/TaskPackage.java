/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.ki.task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.ki.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Arnaud Blouin - INRIA, Centre Rennes, Triskell Team, France";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/ki/task";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = org.kermeta.ki.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.TaskImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUBTASKS = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.UserImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__OPERATION = TASK__OPERATION;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.AbstractImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__OPERATION = TASK__OPERATION;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.InteractionImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OPERATION = TASK__OPERATION;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.ApplicationImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__OPERATION = TASK__OPERATION;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.OperatorImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SRC = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.TaskModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.TaskModelImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getTaskModel()
	 * @generated
	 */
	int TASK_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL__TASKS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.EnablingImpl <em>Enabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.EnablingImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getEnabling()
	 * @generated
	 */
	int ENABLING = 7;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Enabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.desactivationImpl <em>desactivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.desactivationImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getdesactivation()
	 * @generated
	 */
	int DESACTIVATION = 8;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESACTIVATION__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESACTIVATION__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>desactivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESACTIVATION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.EnablingWithInformationImpl <em>Enabling With Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.EnablingWithInformationImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getEnablingWithInformation()
	 * @generated
	 */
	int ENABLING_WITH_INFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Enabling With Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLING_WITH_INFORMATION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.InterleavingImpl <em>Interleaving</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.InterleavingImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getInterleaving()
	 * @generated
	 */
	int INTERLEAVING = 10;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Interleaving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.SynchronizationImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 11;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.FiniteIterationImpl <em>Finite Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.FiniteIterationImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getFiniteIteration()
	 * @generated
	 */
	int FINITE_ITERATION = 12;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ITERATION__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ITERATION__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Finite Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_ITERATION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.impl.RecursionImpl <em>Recursion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.impl.RecursionImpl
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getRecursion()
	 * @generated
	 */
	int RECURSION = 13;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSION__SRC = OPERATOR__SRC;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSION__TARGET = OPERATOR__TARGET;

	/**
	 * The number of structural features of the '<em>Recursion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.task.UnaryOperation <em>Unary Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.task.UnaryOperation
	 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 14;


	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.kermeta.ki.task.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.ki.task.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.ki.task.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.ki.task.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.kermeta.ki.task.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.ki.task.Task#getSubtasks <em>Subtasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtasks</em>'.
	 * @see org.kermeta.ki.task.Task#getSubtasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Subtasks();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.ki.task.Task#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.kermeta.ki.task.Task#getOperation()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Operation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.kermeta.ki.task.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see org.kermeta.ki.task.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.kermeta.ki.task.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.kermeta.ki.task.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.kermeta.ki.task.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.ki.task.Operator#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.kermeta.ki.task.Operator#getSrc()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Src();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.ki.task.Operator#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.kermeta.ki.task.Operator#getTarget()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.TaskModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.kermeta.ki.task.TaskModel
	 * @generated
	 */
	EClass getTaskModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.ki.task.TaskModel#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.kermeta.ki.task.TaskModel#getOperations()
	 * @see #getTaskModel()
	 * @generated
	 */
	EReference getTaskModel_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.ki.task.TaskModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.kermeta.ki.task.TaskModel#getTasks()
	 * @see #getTaskModel()
	 * @generated
	 */
	EReference getTaskModel_Tasks();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Enabling <em>Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling</em>'.
	 * @see org.kermeta.ki.task.Enabling
	 * @generated
	 */
	EClass getEnabling();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.desactivation <em>desactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>desactivation</em>'.
	 * @see org.kermeta.ki.task.desactivation
	 * @generated
	 */
	EClass getdesactivation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.EnablingWithInformation <em>Enabling With Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabling With Information</em>'.
	 * @see org.kermeta.ki.task.EnablingWithInformation
	 * @generated
	 */
	EClass getEnablingWithInformation();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Interleaving <em>Interleaving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interleaving</em>'.
	 * @see org.kermeta.ki.task.Interleaving
	 * @generated
	 */
	EClass getInterleaving();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see org.kermeta.ki.task.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.FiniteIteration <em>Finite Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Iteration</em>'.
	 * @see org.kermeta.ki.task.FiniteIteration
	 * @generated
	 */
	EClass getFiniteIteration();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.task.Recursion <em>Recursion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursion</em>'.
	 * @see org.kermeta.ki.task.Recursion
	 * @generated
	 */
	EClass getRecursion();

	/**
	 * Returns the meta object for enum '{@link org.kermeta.ki.task.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operation</em>'.
	 * @see org.kermeta.ki.task.UnaryOperation
	 * @generated
	 */
	EEnum getUnaryOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.TaskImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Subtasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUBTASKS = eINSTANCE.getTask_Subtasks();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__OPERATION = eINSTANCE.getTask_Operation();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.UserImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.AbstractImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.InteractionImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.ApplicationImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.OperatorImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__SRC = eINSTANCE.getOperator_Src();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__TARGET = eINSTANCE.getOperator_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.TaskModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.TaskModelImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getTaskModel()
		 * @generated
		 */
		EClass TASK_MODEL = eINSTANCE.getTaskModel();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MODEL__OPERATIONS = eINSTANCE.getTaskModel_Operations();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MODEL__TASKS = eINSTANCE.getTaskModel_Tasks();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.EnablingImpl <em>Enabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.EnablingImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getEnabling()
		 * @generated
		 */
		EClass ENABLING = eINSTANCE.getEnabling();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.desactivationImpl <em>desactivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.desactivationImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getdesactivation()
		 * @generated
		 */
		EClass DESACTIVATION = eINSTANCE.getdesactivation();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.EnablingWithInformationImpl <em>Enabling With Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.EnablingWithInformationImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getEnablingWithInformation()
		 * @generated
		 */
		EClass ENABLING_WITH_INFORMATION = eINSTANCE.getEnablingWithInformation();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.InterleavingImpl <em>Interleaving</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.InterleavingImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getInterleaving()
		 * @generated
		 */
		EClass INTERLEAVING = eINSTANCE.getInterleaving();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.SynchronizationImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.FiniteIterationImpl <em>Finite Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.FiniteIterationImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getFiniteIteration()
		 * @generated
		 */
		EClass FINITE_ITERATION = eINSTANCE.getFiniteIteration();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.impl.RecursionImpl <em>Recursion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.impl.RecursionImpl
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getRecursion()
		 * @generated
		 */
		EClass RECURSION = eINSTANCE.getRecursion();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.task.UnaryOperation <em>Unary Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.task.UnaryOperation
		 * @see org.kermeta.ki.task.impl.TaskPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EEnum UNARY_OPERATION = eINSTANCE.getUnaryOperation();

	}

} //TaskPackage
