/**
 * INRIA - Triskell Team
 *
 * $Id$
 */
package org.kermeta.ki.kontext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.kermeta.ki.kontext.ContextToTask;
import org.kermeta.ki.kontext.ContextToTaskConstraint;
import org.kermeta.ki.kontext.Expression;
import org.kermeta.ki.kontext.KontextFactory;
import org.kermeta.ki.kontext.KontextPackage;
import org.kermeta.ki.task.TaskPackage;
import org.kermeta.ki.task.impl.TaskPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KontextPackageImpl extends EPackageImpl implements KontextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "INRIA - Triskell Team";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextToTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextToTaskConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.ki.kontext.KontextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KontextPackageImpl() {
		super(eNS_URI, KontextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KontextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KontextPackage init() {
		if (isInited) return (KontextPackage)EPackage.Registry.INSTANCE.getEPackage(KontextPackage.eNS_URI);

		// Obtain or create and register package
		KontextPackageImpl theKontextPackage = (KontextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KontextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KontextPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);

		// Create package meta-data objects
		theKontextPackage.createPackageContents();
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theKontextPackage.initializePackageContents();
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKontextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KontextPackage.eNS_URI, theKontextPackage);
		return theKontextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextToTask() {
		return contextToTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextToTask_Constraints() {
		return (EReference)contextToTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextToTaskConstraint() {
		return contextToTaskConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextToTaskConstraint_Exp() {
		return (EReference)contextToTaskConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextToTaskConstraint_Name() {
		return (EAttribute)contextToTaskConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextToTaskConstraint_Classes() {
		return (EReference)contextToTaskConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextToTaskConstraint_Tasks() {
		return (EReference)contextToTaskConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Text() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KontextFactory getKontextFactory() {
		return (KontextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contextToTaskEClass = createEClass(CONTEXT_TO_TASK);
		createEReference(contextToTaskEClass, CONTEXT_TO_TASK__CONSTRAINTS);

		contextToTaskConstraintEClass = createEClass(CONTEXT_TO_TASK_CONSTRAINT);
		createEReference(contextToTaskConstraintEClass, CONTEXT_TO_TASK_CONSTRAINT__EXP);
		createEAttribute(contextToTaskConstraintEClass, CONTEXT_TO_TASK_CONSTRAINT__NAME);
		createEReference(contextToTaskConstraintEClass, CONTEXT_TO_TASK_CONSTRAINT__CLASSES);
		createEReference(contextToTaskConstraintEClass, CONTEXT_TO_TASK_CONSTRAINT__TASKS);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TaskPackage theTaskPackage = (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(contextToTaskEClass, ContextToTask.class, "ContextToTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextToTask_Constraints(), this.getContextToTaskConstraint(), null, "constraints", null, 0, -1, ContextToTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextToTaskConstraintEClass, ContextToTaskConstraint.class, "ContextToTaskConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextToTaskConstraint_Exp(), this.getExpression(), null, "exp", null, 0, 1, ContextToTaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextToTaskConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextToTaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextToTaskConstraint_Classes(), ecorePackage.getEClass(), null, "classes", null, 1, -1, ContextToTaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextToTaskConstraint_Tasks(), theTaskPackage.getTask(), null, "tasks", null, 1, -1, ContextToTaskConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Text(), ecorePackage.getEString(), "text", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KontextPackageImpl
