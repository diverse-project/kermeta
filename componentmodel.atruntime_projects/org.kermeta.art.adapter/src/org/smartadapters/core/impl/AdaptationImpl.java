/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.smartadapters.core.Adaptation;
import org.smartadapters.core.Adapter;
import org.smartadapters.core.SmartAdapters4DiVAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smartadapters.core.impl.AdaptationImpl#getAdapter <em>Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdaptationImpl extends EObjectImpl implements Adaptation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartAdapters4DiVAPackage.Literals.ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter getAdapter() {
		if (eContainerFeatureID() != SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER) return null;
		return (Adapter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapter(Adapter newAdapter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdapter, SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapter(Adapter newAdapter) {
		if (newAdapter != eInternalContainer() || (eContainerFeatureID() != SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER && newAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdapter != null)
				msgs = ((InternalEObject)newAdapter).eInverseAdd(this, SmartAdapters4DiVAPackage.ADAPTER__ADAPT, Adapter.class, msgs);
			msgs = basicSetAdapter(newAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER, newAdapter, newAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdapter((Adapter)otherEnd, msgs);
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
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				return basicSetAdapter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				return eInternalContainer().eInverseRemove(this, SmartAdapters4DiVAPackage.ADAPTER__ADAPT, Adapter.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				return getAdapter();
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
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				setAdapter((Adapter)newValue);
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
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				setAdapter((Adapter)null);
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
			case SmartAdapters4DiVAPackage.ADAPTATION__ADAPTER:
				return getAdapter() != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptationImpl
