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
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getFinalState <em>Final State</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA/INRIA";

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.samples.fsm.State}.
	 * It is bidirectional and its opposite is '{@link fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getFSM_OwnedState()
	 * @see fr.irisa.triskell.kermeta.samples.fsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<State> getOwnedState();

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
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.samples.fsm.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.samples.fsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see fr.irisa.triskell.kermeta.samples.fsm.FsmPackage#getFSM_FinalState()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getFinalState();

} // FSM