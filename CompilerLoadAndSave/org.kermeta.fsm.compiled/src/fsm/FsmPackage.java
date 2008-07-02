/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FsmPackage.java,v 1.1 2008-07-02 09:13:34 ftanguy Exp $
 */
package fsm;

import kermeta.language.structure.StructurePackage;

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
 * @see fsm.FsmFactory
 * @model kind="package"
 * @generated
 */
public interface FsmPackage extends EPackage
{
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
  String eNS_URI = "http://www.kermeta.org/fsm/kermeta_temp_uri";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FsmPackage eINSTANCE = fsm.impl.FsmPackageImpl.init();

  /**
   * The meta object id for the '{@link fsm.impl.FSMImpl <em>FSM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.FSMImpl
   * @see fsm.impl.FsmPackageImpl#getFSM()
   * @generated
   */
  int FSM = 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__OWNED_STATE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Current State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__CURRENT_STATE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__INITIAL_STATE = StructurePackage.OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Final State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM__FINAL_STATE = StructurePackage.OBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>FSM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fsm.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.StateImpl
   * @see fsm.impl.FsmPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OWNING_FSM = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INCOMING_TRANSITION = StructurePackage.OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outgoing Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITION = StructurePackage.OBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fsm.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.TransitionImpl
   * @see fsm.impl.FsmPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__INPUT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = StructurePackage.OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OUTPUT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fsm.impl.FSMExceptionImpl <em>FSM Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.FSMExceptionImpl
   * @see fsm.impl.FsmPackageImpl#getFSMException()
   * @generated
   */
  int FSM_EXCEPTION = 3;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_EXCEPTION__TAG = StructurePackage.OBJECT__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_EXCEPTION__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

  /**
   * The number of structural features of the '<em>FSM Exception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FSM_EXCEPTION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fsm.impl.NonDeterminismImpl <em>Non Determinism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.NonDeterminismImpl
   * @see fsm.impl.FsmPackageImpl#getNonDeterminism()
   * @generated
   */
  int NON_DETERMINISM = 4;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_DETERMINISM__TAG = FSM_EXCEPTION__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_DETERMINISM__OWNED_TAGS = FSM_EXCEPTION__OWNED_TAGS;

  /**
   * The number of structural features of the '<em>Non Determinism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_DETERMINISM_FEATURE_COUNT = FSM_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fsm.impl.NoTransitionImpl <em>No Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.NoTransitionImpl
   * @see fsm.impl.FsmPackageImpl#getNoTransition()
   * @generated
   */
  int NO_TRANSITION = 5;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_TRANSITION__TAG = FSM_EXCEPTION__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_TRANSITION__OWNED_TAGS = FSM_EXCEPTION__OWNED_TAGS;

  /**
   * The number of structural features of the '<em>No Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_TRANSITION_FEATURE_COUNT = FSM_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fsm.impl.NoInitialStateExceptionImpl <em>No Initial State Exception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fsm.impl.NoInitialStateExceptionImpl
   * @see fsm.impl.FsmPackageImpl#getNoInitialStateException()
   * @generated
   */
  int NO_INITIAL_STATE_EXCEPTION = 6;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_INITIAL_STATE_EXCEPTION__TAG = FSM_EXCEPTION__TAG;

  /**
   * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_INITIAL_STATE_EXCEPTION__OWNED_TAGS = FSM_EXCEPTION__OWNED_TAGS;

  /**
   * The number of structural features of the '<em>No Initial State Exception</em>' class.
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
   * @see java.lang.Object
   * @see fsm.impl.FsmPackageImpl#getString()
   * @generated
   */
  int STRING = 7;


  /**
   * Returns the meta object for class '{@link fsm.FSM <em>FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FSM</em>'.
   * @see fsm.FSM
   * @generated
   */
  EClass getFSM();

  /**
   * Returns the meta object for the containment reference list '{@link fsm.FSM#getOwnedState <em>Owned State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned State</em>'.
   * @see fsm.FSM#getOwnedState()
   * @see #getFSM()
   * @generated
   */
  EReference getFSM_OwnedState();

  /**
   * Returns the meta object for the reference '{@link fsm.FSM#getCurrentState <em>Current State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Current State</em>'.
   * @see fsm.FSM#getCurrentState()
   * @see #getFSM()
   * @generated
   */
  EReference getFSM_CurrentState();

  /**
   * Returns the meta object for the reference '{@link fsm.FSM#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial State</em>'.
   * @see fsm.FSM#getInitialState()
   * @see #getFSM()
   * @generated
   */
  EReference getFSM_InitialState();

  /**
   * Returns the meta object for the reference list '{@link fsm.FSM#getFinalState <em>Final State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Final State</em>'.
   * @see fsm.FSM#getFinalState()
   * @see #getFSM()
   * @generated
   */
  EReference getFSM_FinalState();

  /**
   * Returns the meta object for class '{@link fsm.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see fsm.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link fsm.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fsm.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the container reference '{@link fsm.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning FSM</em>'.
   * @see fsm.State#getOwningFSM()
   * @see #getState()
   * @generated
   */
  EReference getState_OwningFSM();

  /**
   * Returns the meta object for the reference list '{@link fsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Transition</em>'.
   * @see fsm.State#getIncomingTransition()
   * @see #getState()
   * @generated
   */
  EReference getState_IncomingTransition();

  /**
   * Returns the meta object for the containment reference list '{@link fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transition</em>'.
   * @see fsm.State#getOutgoingTransition()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransition();

  /**
   * Returns the meta object for class '{@link fsm.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fsm.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link fsm.Transition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see fsm.Transition#getInput()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Input();

  /**
   * Returns the meta object for the container reference '{@link fsm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Source</em>'.
   * @see fsm.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the reference '{@link fsm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see fsm.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the attribute '{@link fsm.Transition#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see fsm.Transition#getOutput()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Output();

  /**
   * Returns the meta object for class '{@link fsm.FSMException <em>FSM Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FSM Exception</em>'.
   * @see fsm.FSMException
   * @generated
   */
  EClass getFSMException();

  /**
   * Returns the meta object for class '{@link fsm.NonDeterminism <em>Non Determinism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Determinism</em>'.
   * @see fsm.NonDeterminism
   * @generated
   */
  EClass getNonDeterminism();

  /**
   * Returns the meta object for class '{@link fsm.NoTransition <em>No Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Transition</em>'.
   * @see fsm.NoTransition
   * @generated
   */
  EClass getNoTransition();

  /**
   * Returns the meta object for class '{@link fsm.NoInitialStateException <em>No Initial State Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Initial State Exception</em>'.
   * @see fsm.NoInitialStateException
   * @generated
   */
  EClass getNoInitialStateException();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>String</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   *        annotation="kermeta alias='kermeta::standard::String'"
   *        annotation="kermeta EMF_EDataType_instanceClassName='java.lang.String'"
   *        annotation="kermeta EMF_EDataType_isSerializable='true'"
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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fsm.impl.FSMImpl <em>FSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.FSMImpl
     * @see fsm.impl.FsmPackageImpl#getFSM()
     * @generated
     */
    EClass FSM = eINSTANCE.getFSM();

    /**
     * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM__OWNED_STATE = eINSTANCE.getFSM_OwnedState();

    /**
     * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM__CURRENT_STATE = eINSTANCE.getFSM_CurrentState();

    /**
     * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM__INITIAL_STATE = eINSTANCE.getFSM_InitialState();

    /**
     * The meta object literal for the '<em><b>Final State</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FSM__FINAL_STATE = eINSTANCE.getFSM_FinalState();

    /**
     * The meta object literal for the '{@link fsm.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.StateImpl
     * @see fsm.impl.FsmPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

    /**
     * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INCOMING_TRANSITION = eINSTANCE.getState_IncomingTransition();

    /**
     * The meta object literal for the '<em><b>Outgoing Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITION = eINSTANCE.getState_OutgoingTransition();

    /**
     * The meta object literal for the '{@link fsm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.TransitionImpl
     * @see fsm.impl.FsmPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

    /**
     * The meta object literal for the '{@link fsm.impl.FSMExceptionImpl <em>FSM Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.FSMExceptionImpl
     * @see fsm.impl.FsmPackageImpl#getFSMException()
     * @generated
     */
    EClass FSM_EXCEPTION = eINSTANCE.getFSMException();

    /**
     * The meta object literal for the '{@link fsm.impl.NonDeterminismImpl <em>Non Determinism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.NonDeterminismImpl
     * @see fsm.impl.FsmPackageImpl#getNonDeterminism()
     * @generated
     */
    EClass NON_DETERMINISM = eINSTANCE.getNonDeterminism();

    /**
     * The meta object literal for the '{@link fsm.impl.NoTransitionImpl <em>No Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.NoTransitionImpl
     * @see fsm.impl.FsmPackageImpl#getNoTransition()
     * @generated
     */
    EClass NO_TRANSITION = eINSTANCE.getNoTransition();

    /**
     * The meta object literal for the '{@link fsm.impl.NoInitialStateExceptionImpl <em>No Initial State Exception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fsm.impl.NoInitialStateExceptionImpl
     * @see fsm.impl.FsmPackageImpl#getNoInitialStateException()
     * @generated
     */
    EClass NO_INITIAL_STATE_EXCEPTION = eINSTANCE.getNoInitialStateException();

    /**
     * The meta object literal for the '<em>String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see fsm.impl.FsmPackageImpl#getString()
     * @generated
     */
    EDataType STRING = eINSTANCE.getString();

  }

} //FsmPackage
