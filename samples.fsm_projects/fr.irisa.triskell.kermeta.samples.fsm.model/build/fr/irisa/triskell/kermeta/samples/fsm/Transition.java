/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.samples.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA/INRIA";

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getTransition_Source()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getTransition_Target()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

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
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getTransition_Input()
	 * @model dataType="fr.irisa.triskell.kermeta.samples.fsm.String"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

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
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getTransition_Output()
	 * @model dataType="fr.irisa.triskell.kermeta.samples.fsm.String"
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

} // Transition