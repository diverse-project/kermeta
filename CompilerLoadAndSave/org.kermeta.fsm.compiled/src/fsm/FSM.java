/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FSM.java,v 1.1 2008-07-02 09:13:34 ftanguy Exp $
 */
package fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.FSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fsm.FSM#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fsm.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fsm.FSM#getFinalState <em>Final State</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
   * The list contents are of type {@link fsm.State}.
   * It is bidirectional and its opposite is '{@link fsm.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned State</em>' containment reference list.
   * @see fsm.FsmPackage#getFSM_OwnedState()
   * @see fsm.State#getOwningFSM
   * @model opposite="owningFSM" containment="true"
   * @generated
   */
  EList<State> getOwnedState();

  /**
   * Returns the value of the '<em><b>Current State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current State</em>' reference.
   * @see #setCurrentState(State)
   * @see fsm.FsmPackage#getFSM_CurrentState()
   * @model
   * @generated
   */
  State getCurrentState();

  /**
   * Sets the value of the '{@link fsm.FSM#getCurrentState <em>Current State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current State</em>' reference.
   * @see #getCurrentState()
   * @generated
   */
  void setCurrentState(State value);

  /**
   * Returns the value of the '<em><b>Initial State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial State</em>' reference.
   * @see #setInitialState(State)
   * @see fsm.FsmPackage#getFSM_InitialState()
   * @model required="true"
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link fsm.FSM#getInitialState <em>Initial State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>Final State</b></em>' reference list.
   * The list contents are of type {@link fsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final State</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final State</em>' reference list.
   * @see fsm.FsmPackage#getFSM_FinalState()
   * @model required="true"
   * @generated
   */
  EList<State> getFinalState();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  void reset();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   * @generated
   */
  void run();

} // FSM
