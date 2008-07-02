/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: State.java,v 1.1 2008-07-02 09:13:34 ftanguy Exp $
 */
package fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fsm.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends kermeta.language.structure.Object
{
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
   * @see fsm.FsmPackage#getState_Name()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fsm.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link fsm.FSM#getOwnedState <em>Owned State</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning FSM</em>' container reference.
   * @see #setOwningFSM(FSM)
   * @see fsm.FsmPackage#getState_OwningFSM()
   * @see fsm.FSM#getOwnedState
   * @model opposite="ownedState" required="true" transient="false"
   * @generated
   */
  FSM getOwningFSM();

  /**
   * Sets the value of the '{@link fsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning FSM</em>' container reference.
   * @see #getOwningFSM()
   * @generated
   */
  void setOwningFSM(FSM value);

  /**
   * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
   * The list contents are of type {@link fsm.Transition}.
   * It is bidirectional and its opposite is '{@link fsm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Transition</em>' reference list.
   * @see fsm.FsmPackage#getState_IncomingTransition()
   * @see fsm.Transition#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Transition> getIncomingTransition();

  /**
   * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
   * The list contents are of type {@link fsm.Transition}.
   * It is bidirectional and its opposite is '{@link fsm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
   * @see fsm.FsmPackage#getState_OutgoingTransition()
   * @see fsm.Transition#getSource
   * @model opposite="source" containment="true"
   * @generated
   */
  EList<Transition> getOutgoingTransition();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String" cDataType="kermeta.standard.String"
   *        annotation="kermeta isAbstract='true'"
   * @generated
   */
  String step(String c);

} // State
