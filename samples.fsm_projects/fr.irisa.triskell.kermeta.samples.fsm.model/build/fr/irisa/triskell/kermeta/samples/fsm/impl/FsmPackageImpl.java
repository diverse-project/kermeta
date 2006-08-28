/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.samples.fsm.impl;

import fr.irisa.triskell.kermeta.samples.fsm.FSMException;
import fr.irisa.triskell.kermeta.samples.fsm.FsmFactory;
import fr.irisa.triskell.kermeta.samples.fsm.FsmPackage;
import fr.irisa.triskell.kermeta.samples.fsm.NoInitialStateException;
import fr.irisa.triskell.kermeta.samples.fsm.NoTransition;
import fr.irisa.triskell.kermeta.samples.fsm.NonDeterminism;
import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.Transition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmPackageImpl extends EPackageImpl implements FsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonDeterminismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noInitialStateExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

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
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmPackageImpl() {
		super(eNS_URI, FsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FsmPackage init() {
		if (isInited) return (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);

		// Obtain or create and register package
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FsmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFsmPackage.createPackageContents();

		// Initialize created meta-data
		theFsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmPackage.freeze();

		return theFsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSM() {
		return fsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_OwnedState() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_InitialState() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_CurrentState() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSM_FinalState() {
		return (EReference)fsmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OwningFSM() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutgoingTransition() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IncomingTransition() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Input() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Output() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMException() {
		return fsmExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonDeterminism() {
		return nonDeterminismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoTransition() {
		return noTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoInitialStateException() {
		return noInitialStateExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmFactory getFsmFactory() {
		return (FsmFactory)getEFactoryInstance();
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
		fsmEClass = createEClass(FSM);
		createEReference(fsmEClass, FSM__OWNED_STATE);
		createEReference(fsmEClass, FSM__INITIAL_STATE);
		createEReference(fsmEClass, FSM__CURRENT_STATE);
		createEReference(fsmEClass, FSM__FINAL_STATE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OWNING_FSM);
		createEAttribute(stateEClass, STATE__NAME);
		createEReference(stateEClass, STATE__OUTGOING_TRANSITION);
		createEReference(stateEClass, STATE__INCOMING_TRANSITION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__INPUT);
		createEAttribute(transitionEClass, TRANSITION__OUTPUT);

		fsmExceptionEClass = createEClass(FSM_EXCEPTION);

		nonDeterminismEClass = createEClass(NON_DETERMINISM);

		noTransitionEClass = createEClass(NO_TRANSITION);

		noInitialStateExceptionEClass = createEClass(NO_INITIAL_STATE_EXCEPTION);

		// Create data types
		stringEDataType = createEDataType(STRING);
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

		// Add supertypes to classes
		nonDeterminismEClass.getESuperTypes().add(this.getFSMException());
		noTransitionEClass.getESuperTypes().add(this.getFSMException());
		noInitialStateExceptionEClass.getESuperTypes().add(this.getFSMException());

		// Initialize classes and features; add operations and parameters
		initEClass(fsmEClass, fr.irisa.triskell.kermeta.samples.fsm.FSM.class, "FSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFSM_OwnedState(), this.getState(), this.getState_OwningFSM(), "ownedState", null, 0, -1, fr.irisa.triskell.kermeta.samples.fsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_InitialState(), this.getState(), null, "initialState", null, 1, 1, fr.irisa.triskell.kermeta.samples.fsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_CurrentState(), this.getState(), null, "currentState", null, 0, 1, fr.irisa.triskell.kermeta.samples.fsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFSM_FinalState(), this.getState(), null, "finalState", null, 1, -1, fr.irisa.triskell.kermeta.samples.fsm.FSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fsmEClass, null, "run");

		addEOperation(fsmEClass, null, "reset");

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_OwningFSM(), this.getFSM(), this.getFSM_OwnedState(), "owningFSM", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), this.getString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OutgoingTransition(), this.getTransition(), this.getTransition_Source(), "outgoingTransition", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_IncomingTransition(), this.getTransition(), this.getTransition_Target(), "incomingTransition", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(stateEClass, this.getString(), "step", 0, 1);
		addEParameter(op, this.getString(), "c", 0, 1);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), this.getState_OutgoingTransition(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), this.getState_IncomingTransition(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Input(), this.getString(), "input", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Output(), this.getString(), "output", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(transitionEClass, this.getString(), "fire", 0, 1);

		initEClass(fsmExceptionEClass, FSMException.class, "FSMException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonDeterminismEClass, NonDeterminism.class, "NonDeterminism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noTransitionEClass, NoTransition.class, "NoTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noInitialStateExceptionEClass, NoInitialStateException.class, "NoInitialStateException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.topcased.org/uuid
		createUuidAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.topcased.org/uuid</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUuidAnnotations() {
		String source = "http://www.topcased.org/uuid";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "uuid", "11491501337930"
		   });		
		addAnnotation
		  (fsmEClass, 
		   source, 
		   new String[] {
			 "uuid", "11491501338091"
		   });		
		addAnnotation
		  (getFSM_OwnedState(), 
		   source, 
		   new String[] {
			 "uuid", "11491501338094"
		   });		
		addAnnotation
		  (getFSM_InitialState(), 
		   source, 
		   new String[] {
			 "uuid", "11491501338095"
		   });		
		addAnnotation
		  (getFSM_CurrentState(), 
		   source, 
		   new String[] {
			 "uuid", "11491501338096"
		   });		
		addAnnotation
		  (getFSM_FinalState(), 
		   source, 
		   new String[] {
			 "uuid", "11491501338097"
		   });		
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "uuid", "11491501338098"
		   });		
		addAnnotation
		  ((EOperation)stateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "uuid", "11491501338099"
		   });		
		addAnnotation
		  ((EParameter)((EOperation)stateEClass.getEOperations().get(0)).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "uuid", "114915013380910"
		   });		
		addAnnotation
		  (getState_OwningFSM(), 
		   source, 
		   new String[] {
			 "uuid", "114915013380911"
		   });		
		addAnnotation
		  (getState_Name(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382412"
		   });		
		addAnnotation
		  (getState_OutgoingTransition(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382413"
		   });		
		addAnnotation
		  (getState_IncomingTransition(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382414"
		   });		
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "uuid", "114915013382415"
		   });		
		addAnnotation
		  ((EOperation)transitionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "uuid", "114915013382416"
		   });		
		addAnnotation
		  (getTransition_Source(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382417"
		   });		
		addAnnotation
		  (getTransition_Target(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382418"
		   });		
		addAnnotation
		  (getTransition_Input(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382419"
		   });		
		addAnnotation
		  (getTransition_Output(), 
		   source, 
		   new String[] {
			 "uuid", "114915013382420"
		   });		
		addAnnotation
		  (fsmExceptionEClass, 
		   source, 
		   new String[] {
			 "uuid", "114915013382421"
		   });		
		addAnnotation
		  (nonDeterminismEClass, 
		   source, 
		   new String[] {
			 "uuid", "114915013382422"
		   });		
		addAnnotation
		  (noTransitionEClass, 
		   source, 
		   new String[] {
			 "uuid", "114915013382423"
		   });		
		addAnnotation
		  (noInitialStateExceptionEClass, 
		   source, 
		   new String[] {
			 "uuid", "114915013382424"
		   });		
		addAnnotation
		  (stringEDataType, 
		   source, 
		   new String[] {
			 "uuid", "114915013384025"
		   });
	}

} //FsmPackageImpl
