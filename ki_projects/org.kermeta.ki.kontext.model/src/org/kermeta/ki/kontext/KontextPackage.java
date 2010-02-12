/**
 * INRIA - Triskell Team
 *
 * $Id$
 */
package org.kermeta.ki.kontext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.kermeta.ki.kontext.KontextFactory
 * @model kind="package"
 * @generated
 */
public interface KontextPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "INRIA - Triskell Team";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kontext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/ki/kontext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kontext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KontextPackage eINSTANCE = org.kermeta.ki.kontext.impl.KontextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.ki.kontext.impl.ContextToTaskImpl <em>Context To Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.kontext.impl.ContextToTaskImpl
	 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getContextToTask()
	 * @generated
	 */
	int CONTEXT_TO_TASK = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Context To Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.kontext.impl.ContextToTaskConstraintImpl <em>Context To Task Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.kontext.impl.ContextToTaskConstraintImpl
	 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getContextToTaskConstraint()
	 * @generated
	 */
	int CONTEXT_TO_TASK_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_CONSTRAINT__EXP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_CONSTRAINT__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_CONSTRAINT__TASKS = 3;

	/**
	 * The number of structural features of the '<em>Context To Task Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_TO_TASK_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.ki.kontext.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.ki.kontext.impl.ExpressionImpl
	 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.kontext.ContextToTask <em>Context To Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context To Task</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTask
	 * @generated
	 */
	EClass getContextToTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.ki.kontext.ContextToTask#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTask#getConstraints()
	 * @see #getContextToTask()
	 * @generated
	 */
	EReference getContextToTask_Constraints();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.kontext.ContextToTaskConstraint <em>Context To Task Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context To Task Constraint</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTaskConstraint
	 * @generated
	 */
	EClass getContextToTaskConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.ki.kontext.ContextToTaskConstraint#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTaskConstraint#getExp()
	 * @see #getContextToTaskConstraint()
	 * @generated
	 */
	EReference getContextToTaskConstraint_Exp();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.ki.kontext.ContextToTaskConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTaskConstraint#getName()
	 * @see #getContextToTaskConstraint()
	 * @generated
	 */
	EAttribute getContextToTaskConstraint_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.ki.kontext.ContextToTaskConstraint#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTaskConstraint#getClasses()
	 * @see #getContextToTaskConstraint()
	 * @generated
	 */
	EReference getContextToTaskConstraint_Classes();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.ki.kontext.ContextToTaskConstraint#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see org.kermeta.ki.kontext.ContextToTaskConstraint#getTasks()
	 * @see #getContextToTaskConstraint()
	 * @generated
	 */
	EReference getContextToTaskConstraint_Tasks();

	/**
	 * Returns the meta object for class '{@link org.kermeta.ki.kontext.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.kermeta.ki.kontext.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.ki.kontext.Expression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.kermeta.ki.kontext.Expression#getText()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KontextFactory getKontextFactory();

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
		 * The meta object literal for the '{@link org.kermeta.ki.kontext.impl.ContextToTaskImpl <em>Context To Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.kontext.impl.ContextToTaskImpl
		 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getContextToTask()
		 * @generated
		 */
		EClass CONTEXT_TO_TASK = eINSTANCE.getContextToTask();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TO_TASK__CONSTRAINTS = eINSTANCE.getContextToTask_Constraints();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.kontext.impl.ContextToTaskConstraintImpl <em>Context To Task Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.kontext.impl.ContextToTaskConstraintImpl
		 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getContextToTaskConstraint()
		 * @generated
		 */
		EClass CONTEXT_TO_TASK_CONSTRAINT = eINSTANCE.getContextToTaskConstraint();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TO_TASK_CONSTRAINT__EXP = eINSTANCE.getContextToTaskConstraint_Exp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_TO_TASK_CONSTRAINT__NAME = eINSTANCE.getContextToTaskConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TO_TASK_CONSTRAINT__CLASSES = eINSTANCE.getContextToTaskConstraint_Classes();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_TO_TASK_CONSTRAINT__TASKS = eINSTANCE.getContextToTaskConstraint_Tasks();

		/**
		 * The meta object literal for the '{@link org.kermeta.ki.kontext.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.ki.kontext.impl.ExpressionImpl
		 * @see org.kermeta.ki.kontext.impl.KontextPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TEXT = eINSTANCE.getExpression_Text();

	}

} //KontextPackage
