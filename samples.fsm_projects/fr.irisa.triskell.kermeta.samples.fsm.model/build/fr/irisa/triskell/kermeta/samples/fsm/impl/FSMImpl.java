/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.samples.fsm.impl;

import fr.irisa.triskell.kermeta.samples.fsm.FSM;
import fr.irisa.triskell.kermeta.samples.fsm.FsmPackage;
import fr.irisa.triskell.kermeta.samples.fsm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.FSMImpl#getFinalState <em>Final State</em>}</li>
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
	protected EList ownedState = null;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState = null;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState = null;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList finalState = null;

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
	protected EClass eStaticClass() {
		return FsmPackage.eINSTANCE.getFSM();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList(State.class, this, FsmPackage.FSM__OWNED_STATE, FsmPackage.STATE__OWNING_FSM);
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
			State oldInitialState = initialState;
			initialState = (State)eResolveProxy((InternalEObject)initialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			State oldCurrentState = currentState;
			currentState = (State)eResolveProxy((InternalEObject)currentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList(State.class, this, FsmPackage.FSM__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case FsmPackage.FSM__OWNED_STATE:
					return ((InternalEList)getOwnedState()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case FsmPackage.FSM__OWNED_STATE:
					return ((InternalEList)getOwnedState()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case FsmPackage.FSM__OWNED_STATE:
				return getOwnedState();
			case FsmPackage.FSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case FsmPackage.FSM__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case FsmPackage.FSM__FINAL_STATE:
				return getFinalState();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case FsmPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection)newValue);
				return;
			case FsmPackage.FSM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case FsmPackage.FSM__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case FsmPackage.FSM__FINAL_STATE:
				getFinalState().clear();
				getFinalState().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case FsmPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				return;
			case FsmPackage.FSM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case FsmPackage.FSM__CURRENT_STATE:
				setCurrentState((State)null);
				return;
			case FsmPackage.FSM__FINAL_STATE:
				getFinalState().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case FsmPackage.FSM__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case FsmPackage.FSM__INITIAL_STATE:
				return initialState != null;
			case FsmPackage.FSM__CURRENT_STATE:
				return currentState != null;
			case FsmPackage.FSM__FINAL_STATE:
				return finalState != null && !finalState.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //FSMImpl
