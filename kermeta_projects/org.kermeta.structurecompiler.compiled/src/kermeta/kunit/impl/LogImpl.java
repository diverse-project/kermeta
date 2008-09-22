/**
 * <copyright>
 * </copyright>
 *
 * $Id: LogImpl.java,v 1.3 2008-09-22 14:46:10 cfaucher Exp $
 */
package kermeta.kunit.impl;

import java.util.Collection;

import kermeta.kunit.Failure;
import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.LogImpl#getFailures <em>Failures</em>}</li>
 *   <li>{@link kermeta.kunit.impl.LogImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link kermeta.kunit.impl.LogImpl#getRuntests <em>Runtests</em>}</li>
 *   <li>{@link kermeta.kunit.impl.LogImpl#getHarnessErrors <em>Harness Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogImpl extends ObjectImpl implements Log {
	/**
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failures;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.kunit.Error> errors;

	/**
	 * The default value of the '{@link #getRuntests() <em>Runtests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntests()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RUNTESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntests() <em>Runtests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntests()
	 * @generated
	 * @ordered
	 */
	protected Integer runtests = RUNTESTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHarnessErrors() <em>Harness Errors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarnessErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<kermeta.kunit.Error> harnessErrors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectResolvingEList<Failure>(Failure.class, this,
					KunitPackage.LOG__FAILURES);
		}
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.kunit.Error> getErrors() {
		if (errors == null) {
			errors = new EObjectResolvingEList<kermeta.kunit.Error>(
					kermeta.kunit.Error.class, this, KunitPackage.LOG__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRuntests() {
		return runtests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntests(Integer newRuntests) {
		Integer oldRuntests = runtests;
		runtests = newRuntests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.LOG__RUNTESTS, oldRuntests, runtests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<kermeta.kunit.Error> getHarnessErrors() {
		if (harnessErrors == null) {
			harnessErrors = new EObjectResolvingEList<kermeta.kunit.Error>(
					kermeta.kunit.Error.class, this,
					KunitPackage.LOG__HARNESS_ERRORS);
		}
		return harnessErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSetUpError(Fallible test, kermeta.exceptions.Exception e) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.kunit.Error> convertAsOrderedSet(
						this.getHarnessErrors())
				.add(
						((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.kunit.Error")).initFrom(
								test, e).makeSetUp());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTestError(Fallible test, kermeta.exceptions.Exception e) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.kunit.Error> convertAsOrderedSet(this.getErrors())
				.add(
						((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.kunit.Error")).initFrom(
								test, e));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFailure(Fallible test, String msg) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.kunit.Failure> convertAsOrderedSet(this.getFailures())
				.add(
						((kermeta.kunit.Failure) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.kunit.Failure")).initFrom(
								test, msg));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTearDownError(Fallible test, kermeta.exceptions.Exception e) {

		org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
				.<kermeta.kunit.Error> convertAsOrderedSet(
						this.getHarnessErrors())
				.add(
						((kermeta.kunit.Error) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.kunit.Error")).initFrom(
								test, e).makeTearDown());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void newAttempt() {

		java.lang.Boolean idIfCond_905 = false;
		idIfCond_905 = kermeta.standard.helper.IntegerWrapper.equals(this
				.getRuntests(), null);

		if (idIfCond_905) {

			this.setRuntests(0);
		}

		this.setRuntests(kermeta.standard.helper.IntegerWrapper.plus(1, this
				.getRuntests()));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.LOG__FAILURES:
			return getFailures();
		case KunitPackage.LOG__ERRORS:
			return getErrors();
		case KunitPackage.LOG__RUNTESTS:
			return getRuntests();
		case KunitPackage.LOG__HARNESS_ERRORS:
			return getHarnessErrors();
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
		case KunitPackage.LOG__FAILURES:
			getFailures().clear();
			getFailures().addAll((Collection<? extends Failure>) newValue);
			return;
		case KunitPackage.LOG__ERRORS:
			getErrors().clear();
			getErrors().addAll(
					(Collection<? extends kermeta.kunit.Error>) newValue);
			return;
		case KunitPackage.LOG__RUNTESTS:
			setRuntests((Integer) newValue);
			return;
		case KunitPackage.LOG__HARNESS_ERRORS:
			getHarnessErrors().clear();
			getHarnessErrors().addAll(
					(Collection<? extends kermeta.kunit.Error>) newValue);
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
		case KunitPackage.LOG__FAILURES:
			getFailures().clear();
			return;
		case KunitPackage.LOG__ERRORS:
			getErrors().clear();
			return;
		case KunitPackage.LOG__RUNTESTS:
			setRuntests(RUNTESTS_EDEFAULT);
			return;
		case KunitPackage.LOG__HARNESS_ERRORS:
			getHarnessErrors().clear();
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
		case KunitPackage.LOG__FAILURES:
			return failures != null && !failures.isEmpty();
		case KunitPackage.LOG__ERRORS:
			return errors != null && !errors.isEmpty();
		case KunitPackage.LOG__RUNTESTS:
			return RUNTESTS_EDEFAULT == null ? runtests != null
					: !RUNTESTS_EDEFAULT.equals(runtests);
		case KunitPackage.LOG__HARNESS_ERRORS:
			return harnessErrors != null && !harnessErrors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (runtests: ");
		result.append(runtests);
		result.append(')');
		return result.toString();
	}

} //LogImpl
