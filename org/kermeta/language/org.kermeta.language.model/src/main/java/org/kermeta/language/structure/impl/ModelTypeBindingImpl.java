/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.kermeta.language.structure.ModelType;
import org.kermeta.language.structure.ModelTypeBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ModelTypeBindingImpl#getBoundModelType <em>Bound Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelTypeBindingImpl extends KermetaModelElementImpl implements ModelTypeBinding {
	/**
	 * The cached value of the '{@link #getBoundModelType() <em>Bound Model Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundModelType()
	 * @generated
	 * @ordered
	 */
	protected ModelType boundModelType;
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
	public ModelType getBoundModelType() {
		if (boundModelType != null && boundModelType.eIsProxy()) {
			InternalEObject oldBoundModelType = (InternalEObject)boundModelType;
			boundModelType = (ModelType)eResolveProxy(oldBoundModelType);
			if (boundModelType != oldBoundModelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE, oldBoundModelType, boundModelType));
			}
		}
		return boundModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType basicGetBoundModelType() {
		return boundModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundModelType(ModelType newBoundModelType) {
		ModelType oldBoundModelType = boundModelType;
		boundModelType = newBoundModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE, oldBoundModelType, boundModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE:
				if (resolve) return getBoundModelType();
				return basicGetBoundModelType();
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
			case StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE:
				setBoundModelType((ModelType)newValue);
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
			case StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE:
				setBoundModelType((ModelType)null);
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
			case StructurePackage.MODEL_TYPE_BINDING__BOUND_MODEL_TYPE:
				return boundModelType != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeBindingImpl
