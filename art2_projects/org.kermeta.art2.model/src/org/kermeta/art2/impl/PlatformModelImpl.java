/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.NodeNetwork;
import org.kermeta.art2.PlatformModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.PlatformModelImpl#getNodeNetworks <em>Node Networks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformModelImpl extends EObjectImpl implements PlatformModel {
	/**
	 * The cached value of the '{@link #getNodeNetworks() <em>Node Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeNetwork> nodeNetworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.PLATFORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeNetwork> getNodeNetworks() {
		if (nodeNetworks == null) {
			nodeNetworks = new EObjectContainmentEList<NodeNetwork>(NodeNetwork.class, this, Art2Package.PLATFORM_MODEL__NODE_NETWORKS);
		}
		return nodeNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.PLATFORM_MODEL__NODE_NETWORKS:
				return ((InternalEList<?>)getNodeNetworks()).basicRemove(otherEnd, msgs);
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
			case Art2Package.PLATFORM_MODEL__NODE_NETWORKS:
				return getNodeNetworks();
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
			case Art2Package.PLATFORM_MODEL__NODE_NETWORKS:
				getNodeNetworks().clear();
				getNodeNetworks().addAll((Collection<? extends NodeNetwork>)newValue);
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
			case Art2Package.PLATFORM_MODEL__NODE_NETWORKS:
				getNodeNetworks().clear();
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
			case Art2Package.PLATFORM_MODEL__NODE_NETWORKS:
				return nodeNetworks != null && !nodeNetworks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformModelImpl
