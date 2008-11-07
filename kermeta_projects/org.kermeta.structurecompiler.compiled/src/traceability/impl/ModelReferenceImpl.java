/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelReferenceImpl.java,v 1.8 2008-11-07 08:53:54 cfaucher Exp $
 */
package traceability.impl;

import ecore.EObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import traceability.ModelReference;
import traceability.TraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.ModelReferenceImpl#getRefObject <em>Ref Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelReferenceImpl extends ReferenceImpl implements ModelReference {
	/**
	 * The cached value of the '{@link #getRefObject() <em>Ref Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefObject()
	 * @generated
	 * @ordered
	 */
	protected EObject refObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.MODEL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRefObject() {
		if (refObject != null && refObject.eIsProxy()) {
			InternalEObject oldRefObject = (InternalEObject) refObject;
			refObject = (EObject) eResolveProxy(oldRefObject);
			if (refObject != oldRefObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT,
							oldRefObject, refObject));
			}
		}
		return refObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRefObject() {
		return refObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefObject(EObject newRefObject) {
		EObject oldRefObject = refObject;
		refObject = newRefObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT,
					oldRefObject, refObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT:
			if (resolve)
				return getRefObject();
			return basicGetRefObject();
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
		case TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT:
			setRefObject((EObject) newValue);
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
		case TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT:
			setRefObject((EObject) null);
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
		case TraceabilityPackage.MODEL_REFERENCE__REF_OBJECT:
			return refObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelReferenceImpl
