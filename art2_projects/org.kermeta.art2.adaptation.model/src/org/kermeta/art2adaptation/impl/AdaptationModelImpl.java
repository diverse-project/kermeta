/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.art2adaptation.AdaptationModel;
import org.kermeta.art2adaptation.AdaptationPrimitive;
import org.kermeta.art2adaptation.Art2adaptationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.impl.AdaptationModelImpl#getAdaptations <em>Adaptations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptationModelImpl extends EObjectImpl implements AdaptationModel {
	/**
	 * The cached value of the '{@link #getAdaptations() <em>Adaptations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptations()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationPrimitive> adaptations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2adaptationPackage.Literals.ADAPTATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationPrimitive> getAdaptations() {
		if (adaptations == null) {
			adaptations = new EObjectContainmentEList<AdaptationPrimitive>(AdaptationPrimitive.class, this, Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS);
		}
		return adaptations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS:
				return ((InternalEList<?>)getAdaptations()).basicRemove(otherEnd, msgs);
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
			case Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS:
				return getAdaptations();
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
			case Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS:
				getAdaptations().clear();
				getAdaptations().addAll((Collection<? extends AdaptationPrimitive>)newValue);
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
			case Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS:
				getAdaptations().clear();
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
			case Art2adaptationPackage.ADAPTATION_MODEL__ADAPTATIONS:
				return adaptations != null && !adaptations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptationModelImpl
