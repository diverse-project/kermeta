/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fsm.impl;

import fsm.FSM;
import fsm.FsmDemoPackage;
import fsm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fsm.impl.FSMImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getFinalState <em>Final State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FSMImpl extends EObjectImpl implements FSM {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedState;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> finalState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmDemoPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList<State>(State.class, this, FsmDemoPackage.FSM__OWNED_STATE, FsmDemoPackage.STATE__OWNING_FSM);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmDemoPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmDemoPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList<State>(State.class, this, FsmDemoPackage.FSM__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedState()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				return getOwnedState();
			case FsmDemoPackage.FSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case FsmDemoPackage.FSM__FINAL_STATE:
				return getFinalState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends State>)newValue);
				return;
			case FsmDemoPackage.FSM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case FsmDemoPackage.FSM__FINAL_STATE:
				getFinalState().clear();
				getFinalState().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				return;
			case FsmDemoPackage.FSM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case FsmDemoPackage.FSM__FINAL_STATE:
				getFinalState().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmDemoPackage.FSM__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case FsmDemoPackage.FSM__INITIAL_STATE:
				return initialState != null;
			case FsmDemoPackage.FSM__FINAL_STATE:
				return finalState != null && !finalState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FSMImpl
