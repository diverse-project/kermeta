/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.samples.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA/INRIA";

	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getState_OwningFSM()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FSM#getOwnedState
	 * @model opposite="ownedState" required="true"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

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
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getState_Name()
	 * @model dataType="fr.irisa.triskell.kermeta.samples.fsm.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.samples.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getState_OutgoingTransition()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getSource
	 * @model type="fr.irisa.triskell.kermeta.samples.fsm.Transition" opposite="source" containment="true"
	 * @generated
	 */
	EList getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.samples.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getState_IncomingTransition()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.Transition#getTarget
	 * @model type="fr.irisa.triskell.kermeta.samples.fsm.Transition" opposite="target"
	 * @generated
	 */
	EList getIncomingTransition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.irisa.triskell.kermeta.samples.fsm.String" cDataType="fr.irisa.triskell.kermeta.samples.fsm.String"
	 * @generated
	 */
	String step(String c);

} // State