/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceSaveExceptionImpl.java,v 1.9 2008-11-27 15:49:48 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.ResourceSaveException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Save Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.exceptions.impl.ResourceSaveExceptionImpl#getFailedWhileSaving <em>Failed While Saving</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceSaveExceptionImpl extends ExceptionImpl implements
		ResourceSaveException {
	/**
	 * The cached value of the '{@link #getFailedWhileSaving() <em>Failed While Saving</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedWhileSaving()
	 * @generated
	 * @ordered
	 */
	protected kermeta.language.structure.Object failedWhileSaving;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSaveExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.RESOURCE_SAVE_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object getFailedWhileSaving() {
		if (failedWhileSaving != null && failedWhileSaving.eIsProxy()) {
			InternalEObject oldFailedWhileSaving = (InternalEObject) failedWhileSaving;
			failedWhileSaving = (kermeta.language.structure.Object) eResolveProxy(oldFailedWhileSaving);
			if (failedWhileSaving != oldFailedWhileSaving) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING,
							oldFailedWhileSaving, failedWhileSaving));
			}
		}
		return failedWhileSaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.language.structure.Object basicGetFailedWhileSaving() {
		return failedWhileSaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedWhileSaving(
			kermeta.language.structure.Object newFailedWhileSaving) {
		kermeta.language.structure.Object oldFailedWhileSaving = failedWhileSaving;
		failedWhileSaving = newFailedWhileSaving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING,
					oldFailedWhileSaving, failedWhileSaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING:
			if (resolve)
				return getFailedWhileSaving();
			return basicGetFailedWhileSaving();
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
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING:
			setFailedWhileSaving((kermeta.language.structure.Object) newValue);
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
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING:
			setFailedWhileSaving((kermeta.language.structure.Object) null);
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
		case ExceptionsPackage.RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING:
			return failedWhileSaving != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceSaveExceptionImpl
