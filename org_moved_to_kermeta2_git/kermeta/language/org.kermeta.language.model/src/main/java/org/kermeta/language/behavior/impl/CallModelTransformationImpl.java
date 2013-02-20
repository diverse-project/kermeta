/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.behavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.behavior.CallModelTransformation;

import org.kermeta.language.structure.ModelTransformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.impl.CallModelTransformationImpl#getStaticTransformation <em>Static Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallModelTransformationImpl extends CallFeatureImpl implements CallModelTransformation {
	/**
	 * The cached value of the '{@link #getStaticTransformation() <em>Static Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticTransformation()
	 * @generated
	 * @ordered
	 */
	protected ModelTransformation staticTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallModelTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_MODEL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTransformation getStaticTransformation() {
		if (staticTransformation != null && staticTransformation.eIsProxy()) {
			InternalEObject oldStaticTransformation = (InternalEObject)staticTransformation;
			staticTransformation = (ModelTransformation)eResolveProxy(oldStaticTransformation);
			if (staticTransformation != oldStaticTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION, oldStaticTransformation, staticTransformation));
			}
		}
		return staticTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTransformation basicGetStaticTransformation() {
		return staticTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticTransformation(ModelTransformation newStaticTransformation) {
		ModelTransformation oldStaticTransformation = staticTransformation;
		staticTransformation = newStaticTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION, oldStaticTransformation, staticTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION:
				if (resolve) return getStaticTransformation();
				return basicGetStaticTransformation();
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
			case BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION:
				setStaticTransformation((ModelTransformation)newValue);
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
			case BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION:
				setStaticTransformation((ModelTransformation)null);
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
			case BehaviorPackage.CALL_MODEL_TRANSFORMATION__STATIC_TRANSFORMATION:
				return staticTransformation != null;
		}
		return super.eIsSet(featureID);
	}

} //CallModelTransformationImpl
