/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Channel;

import org.kermeta.art2adaptation.Art2adaptationPackage;
import org.kermeta.art2adaptation.FragmentBindingAdaptation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Binding Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.kermeta.art2adaptation.impl.FragmentBindingAdaptationImpl#getTargetNodeName <em>Target Node Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentBindingAdaptationImpl extends AdaptationPrimitiveImpl implements FragmentBindingAdaptation {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Channel ref;

	/**
	 * The default value of the '{@link #getTargetNodeName() <em>Target Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNodeName() <em>Target Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeName()
	 * @generated
	 * @ordered
	 */
	protected String targetNodeName = TARGET_NODE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentBindingAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2adaptationPackage.Literals.FRAGMENT_BINDING_ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Channel)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Channel newRef) {
		Channel oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNodeName() {
		return targetNodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodeName(String newTargetNodeName) {
		String oldTargetNodeName = targetNodeName;
		targetNodeName = newTargetNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME, oldTargetNodeName, targetNodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME:
				return getTargetNodeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF:
				setRef((Channel)newValue);
				return;
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME:
				setTargetNodeName((String)newValue);
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
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF:
				setRef((Channel)null);
				return;
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME:
				setTargetNodeName(TARGET_NODE_NAME_EDEFAULT);
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
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__REF:
				return ref != null;
			case Art2adaptationPackage.FRAGMENT_BINDING_ADAPTATION__TARGET_NODE_NAME:
				return TARGET_NODE_NAME_EDEFAULT == null ? targetNodeName != null : !TARGET_NODE_NAME_EDEFAULT.equals(targetNodeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetNodeName: ");
		result.append(targetNodeName);
		result.append(')');
		return result.toString();
	}

} //FragmentBindingAdaptationImpl
