/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.samples.fsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/fr.irisa.triskell.kermeta.samples.fsm/src/metamodels/fsm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_STATE = 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CURRENT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__FINAL_STATE = 3;

	/**
	 * The number of structural features of the the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITION = 3;

	/**
	 * The number of structural features of the the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.TransitionImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 3;

	/**
	 * The number of structural features of the the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMExceptionImpl <em>FSM Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FSMExceptionImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getFSMException()
	 * @generated
	 */
	int FSM_EXCEPTION = 3;

	/**
	 * The number of structural features of the the '<em>FSM Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.NonDeterminismImpl <em>Non Determinism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.NonDeterminismImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getNonDeterminism()
	 * @generated
	 */
	int NON_DETERMINISM = 4;

	/**
	 * The number of structural features of the the '<em>Non Determinism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_DETERMINISM_FEATURE_COUNT = FSM_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.NoTransitionImpl <em>No Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.NoTransitionImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getNoTransition()
	 * @generated
	 */
	int NO_TRANSITION = 5;

	/**
	 * The number of structural features of the the '<em>No Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_TRANSITION_FEATURE_COUNT = FSM_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.samples.fsm.impl.NoInitialStateExceptionImpl <em>No Initial State Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.NoInitialStateExceptionImpl
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getNoInitialStateException()
	 * @generated
	 */
	int NO_INITIAL_STATE_EXCEPTION = 6;

	/**
	 * The number of structural features of the the '<em>No Initial State Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_INITIAL_STATE_EXCEPTION_FEATURE_COUNT = FSM_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.irisa.triskell.kermeta.samples.fsm.impl.FsmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 7;


	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM#getOwnedState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM#getInitialState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_InitialState();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM#getCurrentState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_CurrentState();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final State</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM#getFinalState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_FinalState();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transition</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getOutgoingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getIncomingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransition();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.FSMException <em>FSM Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM Exception</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSMException
	 * @generated
	 */
	EClass getFSMException();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.NonDeterminism <em>Non Determinism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Determinism</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.NonDeterminism
	 * @generated
	 */
	EClass getNonDeterminism();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.NoTransition <em>No Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Transition</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.NoTransition
	 * @generated
	 */
	EClass getNoTransition();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.samples.fsm.NoInitialStateException <em>No Initial State Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Initial State Exception</em>'.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.NoInitialStateException
	 * @generated
	 */
	EClass getNoInitialStateException();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="http://www.topcased.org/uuid uuid='114915013384025'" 
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

} //FsmPackage
