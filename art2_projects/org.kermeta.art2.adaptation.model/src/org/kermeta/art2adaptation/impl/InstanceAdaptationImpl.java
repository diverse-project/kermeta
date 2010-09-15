/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Instance;

import org.kermeta.art2adaptation.Art2adaptationPackage;
import org.kermeta.art2adaptation.InstanceAdaptation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2adaptation.impl.InstanceAdaptationImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceAdaptationImpl extends AdaptationPrimitiveImpl implements InstanceAdaptation {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Instance ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2adaptationPackage.Literals.INSTANCE_ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Instance)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2adaptationPackage.INSTANCE_ADAPTATION__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Instance newRef) {
		Instance oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2adaptationPackage.INSTANCE_ADAPTATION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2adaptationPackage.INSTANCE_ADAPTATION__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case Art2adaptationPackage.INSTANCE_ADAPTATION__REF:
				setRef((Instance)newValue);
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
			case Art2adaptationPackage.INSTANCE_ADAPTATION__REF:
				setRef((Instance)null);
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
			case Art2adaptationPackage.INSTANCE_ADAPTATION__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceAdaptationImpl
