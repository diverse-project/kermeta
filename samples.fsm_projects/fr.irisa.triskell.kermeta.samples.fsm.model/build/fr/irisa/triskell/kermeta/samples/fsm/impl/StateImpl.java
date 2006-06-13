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
import fr.irisa.triskell.kermeta.samples.fsm.Transition;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.samples.fsm.impl.StateImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList outgoingTransition = null;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList incomingTransition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FsmPackage.eINSTANCE.getState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOwningFSM() {
		if (eContainerFeatureID != FsmPackage.STATE__OWNING_FSM) return null;
		return (FSM)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFSM(FSM newOwningFSM) {
		if (newOwningFSM != eContainer || (eContainerFeatureID != FsmPackage.STATE__OWNING_FSM && newOwningFSM != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFSM))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFSM != null)
				msgs = ((InternalEObject)newOwningFSM).eInverseAdd(this, FsmPackage.FSM__OWNED_STATE, FSM.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newOwningFSM, FsmPackage.STATE__OWNING_FSM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__OWNING_FSM, newOwningFSM, newOwningFSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectContainmentWithInverseEList(Transition.class, this, FsmPackage.STATE__OUTGOING_TRANSITION, FsmPackage.TRANSITION__SOURCE);
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList(Transition.class, this, FsmPackage.STATE__INCOMING_TRANSITION, FsmPackage.TRANSITION__TARGET);
		}
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String step(String c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case FsmPackage.STATE__OWNING_FSM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, FsmPackage.STATE__OWNING_FSM, msgs);
				case FsmPackage.STATE__OUTGOING_TRANSITION:
					return ((InternalEList)getOutgoingTransition()).basicAdd(otherEnd, msgs);
				case FsmPackage.STATE__INCOMING_TRANSITION:
					return ((InternalEList)getIncomingTransition()).basicAdd(otherEnd, msgs);
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
				case FsmPackage.STATE__OWNING_FSM:
					return eBasicSetContainer(null, FsmPackage.STATE__OWNING_FSM, msgs);
				case FsmPackage.STATE__OUTGOING_TRANSITION:
					return ((InternalEList)getOutgoingTransition()).basicRemove(otherEnd, msgs);
				case FsmPackage.STATE__INCOMING_TRANSITION:
					return ((InternalEList)getIncomingTransition()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case FsmPackage.STATE__OWNING_FSM:
					return eContainer.eInverseRemove(this, FsmPackage.FSM__OWNED_STATE, FSM.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case FsmPackage.STATE__OWNING_FSM:
				return getOwningFSM();
			case FsmPackage.STATE__NAME:
				return getName();
			case FsmPackage.STATE__OUTGOING_TRANSITION:
				return getOutgoingTransition();
			case FsmPackage.STATE__INCOMING_TRANSITION:
				return getIncomingTransition();
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
			case FsmPackage.STATE__OWNING_FSM:
				setOwningFSM((FSM)newValue);
				return;
			case FsmPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case FsmPackage.STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				getOutgoingTransition().addAll((Collection)newValue);
				return;
			case FsmPackage.STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				getIncomingTransition().addAll((Collection)newValue);
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
			case FsmPackage.STATE__OWNING_FSM:
				setOwningFSM((FSM)null);
				return;
			case FsmPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FsmPackage.STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				return;
			case FsmPackage.STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
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
			case FsmPackage.STATE__OWNING_FSM:
				return getOwningFSM() != null;
			case FsmPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FsmPackage.STATE__OUTGOING_TRANSITION:
				return outgoingTransition != null && !outgoingTransition.isEmpty();
			case FsmPackage.STATE__INCOMING_TRANSITION:
				return incomingTransition != null && !incomingTransition.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
