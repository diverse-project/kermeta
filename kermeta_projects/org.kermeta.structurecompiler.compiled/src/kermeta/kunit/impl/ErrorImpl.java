/**
 * <copyright>
 * </copyright>
 *
 * $Id: ErrorImpl.java,v 1.7 2008-10-29 08:29:09 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.ErrorKind;
import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.ErrorImpl#getError <em>Error</em>}</li>
 *   <li>{@link kermeta.kunit.impl.ErrorImpl#getException <em>Exception</em>}</li>
 *   <li>{@link kermeta.kunit.impl.ErrorImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorImpl extends ObjectImpl implements kermeta.kunit.Error {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected Fallible error;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected kermeta.exceptions.Exception exception;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorKind KIND_EDEFAULT = ErrorKind.SET_UP_ERROR;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ErrorKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fallible getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject) error;
			error = (Fallible) eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KunitPackage.ERROR__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fallible basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(Fallible newError) {
		Fallible oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.ERROR__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.exceptions.Exception getException() {
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject) exception;
			exception = (kermeta.exceptions.Exception) eResolveProxy(oldException);
			if (exception != oldException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KunitPackage.ERROR__EXCEPTION, oldException,
							exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.exceptions.Exception basicGetException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(kermeta.exceptions.Exception newException) {
		kermeta.exceptions.Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.ERROR__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ErrorKind newKind) {
		ErrorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.ERROR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.kunit.Error makeTearDown() {

		kermeta.kunit.Error result = null;

		this.setKind(kermeta.kunit.ErrorKind.getByName("tearDownError"));

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.kunit.Error makeSetUp() {

		kermeta.kunit.Error result = null;

		this.setKind(kermeta.kunit.ErrorKind.getByName("setUpError"));

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		java.lang.Boolean idIfCond_1000 = false;
		idIfCond_1000 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.equalsSwitcher(this.getKind(), kermeta.kunit.ErrorKind
						.getByName("testError"));

		if (idIfCond_1000) {

			result = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.toStringSwitcher(this.getError());
		} else {

			result = kermeta.standard.helper.StringWrapper
					.plus(
							org.kermeta.compil.runtime.helper.language.ObjectUtil
									.getMetaClassSwitcher(this.getError())
									.getterName(), ".");

			java.lang.Boolean idIfCond_1001 = false;
			idIfCond_1001 = org.kermeta.compil.runtime.helper.language.ObjectUtil
					.equalsSwitcher(this.getKind(), kermeta.kunit.ErrorKind
							.getByName("setUpError"));

			if (idIfCond_1001) {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"setUp()");
			} else {

				result = kermeta.standard.helper.StringWrapper.plus(result,
						"tearDown()");
			}

		}

		result = kermeta.standard.helper.StringWrapper
				.plus(kermeta.standard.helper.StringWrapper.plus(result,
						" raised "),
						org.kermeta.compil.runtime.helper.language.ObjectUtil
								.getMetaClassSwitcher(this.getException())
								.getterName());

		java.lang.Boolean idIfCond_1002 = false;
		idIfCond_1002 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getException().getMessage(), null);

		if (idIfCond_1002) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result,
							"\n    Caused by: "), this.getException()
							.getMessage());
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					"\n    (no message)");
		}

		java.lang.Boolean idIfCond_1003 = false;
		idIfCond_1003 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isNotEqualSwitcher(this.getException().getStackTrace(), null);

		if (idIfCond_1003) {

			result = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(result,
							"\n    Stack Trace:\n"), this.getException()
							.getStackTrace());
		} else {

			result = kermeta.standard.helper.StringWrapper.plus(result,
					"\n    (no stack trace)");
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.kunit.Error initFrom(Fallible error,
			kermeta.exceptions.Exception e) {

		kermeta.kunit.Error result = null;

		this.setError(error);

		this.setException(e);

		this.setKind(kermeta.kunit.ErrorKind.getByName("testError"));

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.ERROR__ERROR:
			if (resolve)
				return getError();
			return basicGetError();
		case KunitPackage.ERROR__EXCEPTION:
			if (resolve)
				return getException();
			return basicGetException();
		case KunitPackage.ERROR__KIND:
			return getKind();
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
		case KunitPackage.ERROR__ERROR:
			setError((Fallible) newValue);
			return;
		case KunitPackage.ERROR__EXCEPTION:
			setException((kermeta.exceptions.Exception) newValue);
			return;
		case KunitPackage.ERROR__KIND:
			setKind((ErrorKind) newValue);
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
		case KunitPackage.ERROR__ERROR:
			setError((Fallible) null);
			return;
		case KunitPackage.ERROR__EXCEPTION:
			setException((kermeta.exceptions.Exception) null);
			return;
		case KunitPackage.ERROR__KIND:
			setKind(KIND_EDEFAULT);
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
		case KunitPackage.ERROR__ERROR:
			return error != null;
		case KunitPackage.ERROR__EXCEPTION:
			return exception != null;
		case KunitPackage.ERROR__KIND:
			return kind != KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ErrorImpl
