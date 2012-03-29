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

import org.kermeta.language.structure.ModelTypeBinding;
import org.kermeta.language.structure.ObjectTypeBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeBindingImpl#getObjectTypeBindings <em>Object Type Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelTypeBindingImpl extends KermetaModelElementImpl implements ModelTypeBinding {
	/**
	 * The cached value of the '{@link #getObjectTypeBindings() <em>Object Type Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTypeBinding> objectTypeBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeBinding> getObjectTypeBindings() {
		if (objectTypeBindings == null) {
			objectTypeBindings = new EObjectContainmentEList<ObjectTypeBinding>(ObjectTypeBinding.class, this, StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS);
		}
		return objectTypeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS:
				return ((InternalEList<?>)getObjectTypeBindings()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS:
				return getObjectTypeBindings();
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
			case StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS:
				getObjectTypeBindings().clear();
				getObjectTypeBindings().addAll((Collection<? extends ObjectTypeBinding>)newValue);
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
			case StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS:
				getObjectTypeBindings().clear();
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
			case StructurePackage.MODEL_TYPE_BINDING__OBJECT_TYPE_BINDINGS:
				return objectTypeBindings != null && !objectTypeBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeBindingImpl
