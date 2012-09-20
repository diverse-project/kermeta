/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.NamedElement;
import org.kermeta.language.structure.Require;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelingUnitImpl#getOwnedMetamodels <em>Owned Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingUnitImpl extends EObjectImpl implements ModelingUnit {
	/**
	 * The cached value of the '{@link #getOwnedMetamodels() <em>Owned Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> ownedMetamodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODELING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getOwnedMetamodels() {
		if (ownedMetamodels == null) {
			ownedMetamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, StructurePackage.MODELING_UNIT__OWNED_METAMODELS);
		}
		return ownedMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODELING_UNIT__OWNED_METAMODELS:
				return ((InternalEList<?>)getOwnedMetamodels()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODELING_UNIT__OWNED_METAMODELS:
				return getOwnedMetamodels();
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
			case StructurePackage.MODELING_UNIT__OWNED_METAMODELS:
				getOwnedMetamodels().clear();
				getOwnedMetamodels().addAll((Collection<? extends Metamodel>)newValue);
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
			case StructurePackage.MODELING_UNIT__OWNED_METAMODELS:
				getOwnedMetamodels().clear();
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
			case StructurePackage.MODELING_UNIT__OWNED_METAMODELS:
				return ownedMetamodels != null && !ownedMetamodels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingUnitImpl
