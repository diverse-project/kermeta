/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smartadapters.core.adaptations.AdaptationsPackage;
import org.smartadapters.core.adaptations.SetruntimeinstanceTransmissionBinding;

import org.smartadapters.core.impl.setAdaptationImpl;

import pattern.art.instance.ComponentInstance;
import pattern.art.instance.TransmissionBinding;

import pattern.art.type.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setruntimeinstance Transmission Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl#getTransmissionBindingToSet <em>Transmission Binding To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl#getRefclient <em>Refclient</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl#getRefserver <em>Refserver</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl#getRefserverInstance <em>Refserver Instance</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.impl.SetruntimeinstanceTransmissionBindingImpl#getRefId <em>Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetruntimeinstanceTransmissionBindingImpl extends setAdaptationImpl implements SetruntimeinstanceTransmissionBinding {
	/**
	 * The cached value of the '{@link #getTransmissionBindingToSet() <em>Transmission Binding To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionBindingToSet()
	 * @generated
	 * @ordered
	 */
	protected TransmissionBinding transmissionBindingToSet;

	/**
	 * The cached value of the '{@link #getRefclient() <em>Refclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefclient()
	 * @generated
	 * @ordered
	 */
	protected Port refclient;

	/**
	 * The cached value of the '{@link #getRefserver() <em>Refserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefserver()
	 * @generated
	 * @ordered
	 */
	protected Port refserver;

	/**
	 * The cached value of the '{@link #getRefserverInstance() <em>Refserver Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefserverInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance refserverInstance;

	/**
	 * The default value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected String refId = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetruntimeinstanceTransmissionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptationsPackage.Literals.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionBinding getTransmissionBindingToSet() {
		if (transmissionBindingToSet != null && transmissionBindingToSet.eIsProxy()) {
			InternalEObject oldTransmissionBindingToSet = (InternalEObject)transmissionBindingToSet;
			transmissionBindingToSet = (TransmissionBinding)eResolveProxy(oldTransmissionBindingToSet);
			if (transmissionBindingToSet != oldTransmissionBindingToSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET, oldTransmissionBindingToSet, transmissionBindingToSet));
			}
		}
		return transmissionBindingToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionBinding basicGetTransmissionBindingToSet() {
		return transmissionBindingToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionBindingToSet(TransmissionBinding newTransmissionBindingToSet) {
		TransmissionBinding oldTransmissionBindingToSet = transmissionBindingToSet;
		transmissionBindingToSet = newTransmissionBindingToSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET, oldTransmissionBindingToSet, transmissionBindingToSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRefclient() {
		if (refclient != null && refclient.eIsProxy()) {
			InternalEObject oldRefclient = (InternalEObject)refclient;
			refclient = (Port)eResolveProxy(oldRefclient);
			if (refclient != oldRefclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT, oldRefclient, refclient));
			}
		}
		return refclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRefclient() {
		return refclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefclient(Port newRefclient) {
		Port oldRefclient = refclient;
		refclient = newRefclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT, oldRefclient, refclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRefserver() {
		if (refserver != null && refserver.eIsProxy()) {
			InternalEObject oldRefserver = (InternalEObject)refserver;
			refserver = (Port)eResolveProxy(oldRefserver);
			if (refserver != oldRefserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER, oldRefserver, refserver));
			}
		}
		return refserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRefserver() {
		return refserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefserver(Port newRefserver) {
		Port oldRefserver = refserver;
		refserver = newRefserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER, oldRefserver, refserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getRefserverInstance() {
		if (refserverInstance != null && refserverInstance.eIsProxy()) {
			InternalEObject oldRefserverInstance = (InternalEObject)refserverInstance;
			refserverInstance = (ComponentInstance)eResolveProxy(oldRefserverInstance);
			if (refserverInstance != oldRefserverInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE, oldRefserverInstance, refserverInstance));
			}
		}
		return refserverInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetRefserverInstance() {
		return refserverInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefserverInstance(ComponentInstance newRefserverInstance) {
		ComponentInstance oldRefserverInstance = refserverInstance;
		refserverInstance = newRefserverInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE, oldRefserverInstance, refserverInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefId(String newRefId) {
		String oldRefId = refId;
		refId = newRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID, oldRefId, refId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET:
				if (resolve) return getTransmissionBindingToSet();
				return basicGetTransmissionBindingToSet();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT:
				if (resolve) return getRefclient();
				return basicGetRefclient();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER:
				if (resolve) return getRefserver();
				return basicGetRefserver();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE:
				if (resolve) return getRefserverInstance();
				return basicGetRefserverInstance();
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID:
				return getRefId();
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET:
				setTransmissionBindingToSet((TransmissionBinding)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT:
				setRefclient((Port)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER:
				setRefserver((Port)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE:
				setRefserverInstance((ComponentInstance)newValue);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID:
				setRefId((String)newValue);
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET:
				setTransmissionBindingToSet((TransmissionBinding)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT:
				setRefclient((Port)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER:
				setRefserver((Port)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE:
				setRefserverInstance((ComponentInstance)null);
				return;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID:
				setRefId(REF_ID_EDEFAULT);
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
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET:
				return transmissionBindingToSet != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT:
				return refclient != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER:
				return refserver != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE:
				return refserverInstance != null;
			case AdaptationsPackage.SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID:
				return REF_ID_EDEFAULT == null ? refId != null : !REF_ID_EDEFAULT.equals(refId);
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
		result.append(" (refId: ");
		result.append(refId);
		result.append(')');
		return result.toString();
	}

} //SetruntimeinstanceTransmissionBindingImpl
