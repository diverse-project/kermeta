/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UnresolvedMetamodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedMetamodelImpl#getOwnedModelingUnits <em>Owned Modeling Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedMetamodelImpl extends ModelingUnitImpl implements UnresolvedMetamodel {
	/**
	 * The cached value of the '{@link #getOwnedModelingUnits() <em>Owned Modeling Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingUnit> ownedModelingUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingUnit> getOwnedModelingUnits() {
		if (ownedModelingUnits == null) {
			ownedModelingUnits = new EObjectContainmentEList<ModelingUnit>(ModelingUnit.class, this, StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS);
		}
		return ownedModelingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS:
				return ((InternalEList<?>)getOwnedModelingUnits()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS:
				return getOwnedModelingUnits();
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
			case StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS:
				getOwnedModelingUnits().clear();
				getOwnedModelingUnits().addAll((Collection<? extends ModelingUnit>)newValue);
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
			case StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS:
				getOwnedModelingUnits().clear();
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
			case StructurePackage.UNRESOLVED_METAMODEL__OWNED_MODELING_UNITS:
				return ownedModelingUnits != null && !ownedModelingUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnresolvedMetamodelImpl
