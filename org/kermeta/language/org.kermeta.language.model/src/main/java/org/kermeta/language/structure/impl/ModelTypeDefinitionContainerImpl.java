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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.language.structure.ModelTypeDefinition;
import org.kermeta.language.structure.ModelTypeDefinitionContainer;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeDefinitionContainerImpl#getOwnedModelTypeDefinitions <em>Owned Model Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeDefinitionContainerImpl extends KermetaModelElementImpl implements ModelTypeDefinitionContainer {
	/**
	 * The cached value of the '{@link #getOwnedModelTypeDefinitions() <em>Owned Model Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelTypeDefinition> ownedModelTypeDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_DEFINITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelTypeDefinition> getOwnedModelTypeDefinitions() {
		if (ownedModelTypeDefinitions == null) {
			ownedModelTypeDefinitions = new EObjectContainmentEList<ModelTypeDefinition>(ModelTypeDefinition.class, this, StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS);
		}
		return ownedModelTypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS:
				return ((InternalEList<?>)getOwnedModelTypeDefinitions()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS:
				return getOwnedModelTypeDefinitions();
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
			case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
				getOwnedModelTypeDefinitions().addAll((Collection<? extends ModelTypeDefinition>)newValue);
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
			case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS:
				getOwnedModelTypeDefinitions().clear();
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
			case StructurePackage.MODEL_TYPE_DEFINITION_CONTAINER__OWNED_MODEL_TYPE_DEFINITIONS:
				return ownedModelTypeDefinitions != null && !ownedModelTypeDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeDefinitionContainerImpl
