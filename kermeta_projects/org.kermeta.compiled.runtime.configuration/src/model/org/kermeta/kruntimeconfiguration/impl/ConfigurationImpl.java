/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConfigurationImpl.java,v 1.2 2008-07-23 12:37:36 ftanguy Exp $
 */
package org.kermeta.kruntimeconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.kruntimeconfiguration.Configuration;
import org.kermeta.kruntimeconfiguration.Entry;
import org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage;
import org.kermeta.kruntimeconfiguration.Persistence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kruntimeconfiguration.impl.ConfigurationImpl#getPersistenceEntries <em>Persistence Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getPersistenceEntries() <em>Persistence Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Persistence> persistenceEntries;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KruntimeconfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Persistence> getPersistenceEntries() {
		if (persistenceEntries == null) {
			persistenceEntries = new EObjectContainmentEList<Persistence>(Persistence.class, this, KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES);
		}
		return persistenceEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES:
				return ((InternalEList<?>)getPersistenceEntries()).basicRemove(otherEnd, msgs);
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
			case KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES:
				return getPersistenceEntries();
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
			case KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES:
				getPersistenceEntries().clear();
				getPersistenceEntries().addAll((Collection<? extends Persistence>)newValue);
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
			case KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES:
				getPersistenceEntries().clear();
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
			case KruntimeconfigurationPackage.CONFIGURATION__PERSISTENCE_ENTRIES:
				return persistenceEntries != null && !persistenceEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
