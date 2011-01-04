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
import org.kermeta.language.behavior.CallOperation;

import org.kermeta.language.structure.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.behavior.impl.CallOperationImpl#getStaticOperation <em>Static Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallOperationImpl extends CallFeatureImpl implements CallOperation {
	/**
	 * The cached value of the '{@link #getStaticOperation() <em>Static Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation staticOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CALL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getStaticOperation() {
		if (staticOperation != null && staticOperation.eIsProxy()) {
			InternalEObject oldStaticOperation = (InternalEObject)staticOperation;
			staticOperation = (Operation)eResolveProxy(oldStaticOperation);
			if (staticOperation != oldStaticOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_OPERATION__STATIC_OPERATION, oldStaticOperation, staticOperation));
			}
		}
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetStaticOperation() {
		return staticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticOperation(Operation newStaticOperation) {
		Operation oldStaticOperation = staticOperation;
		staticOperation = newStaticOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_OPERATION__STATIC_OPERATION, oldStaticOperation, staticOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.CALL_OPERATION__STATIC_OPERATION:
				if (resolve) return getStaticOperation();
				return basicGetStaticOperation();
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
			case BehaviorPackage.CALL_OPERATION__STATIC_OPERATION:
				setStaticOperation((Operation)newValue);
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
			case BehaviorPackage.CALL_OPERATION__STATIC_OPERATION:
				setStaticOperation((Operation)null);
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
			case BehaviorPackage.CALL_OPERATION__STATIC_OPERATION:
				return staticOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //CallOperationImpl
