/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Transition.java,v 1.1 2008-07-02 09:13:34 ftanguy Exp $
 */
package fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link fsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fsm.Transition#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see fsm.FsmPackage#getTransition_Input()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link fsm.Transition#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' container reference.
   * @see #setSource(State)
   * @see fsm.FsmPackage#getTransition_Source()
   * @see fsm.State#getOutgoingTransition
   * @model opposite="outgoingTransition" required="true" transient="false"
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link fsm.Transition#getSource <em>Source</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' container reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link fsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see fsm.FsmPackage#getTransition_Target()
   * @see fsm.State#getIncomingTransition
   * @model opposite="incomingTransition" required="true"
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link fsm.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see fsm.FsmPackage#getTransition_Output()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link fsm.Transition#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta isAbstract='true'"
   * @generated
   */
  String fire();

} // Transition
