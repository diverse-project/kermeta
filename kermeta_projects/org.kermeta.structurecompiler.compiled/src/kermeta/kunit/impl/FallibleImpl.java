/**
 * <copyright>
 * </copyright>
 *
 * $Id: FallibleImpl.java,v 1.5 2008-10-16 13:17:31 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fallible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.FallibleImpl#getStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.impl.FallibleImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FallibleImpl extends AbstractFallibleImpl implements
		Fallible {
	/**
	 * The default value of the '{@link #getStopOnFailure() <em>Stop On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOnFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STOP_ON_FAILURE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getStopOnFailure() <em>Stop On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOnFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean stopOnFailure = STOP_ON_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected Integer rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FallibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.FALLIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStopOnFailure() {
		return stopOnFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopOnFailure(Boolean newStopOnFailure) {
		Boolean oldStopOnFailure = stopOnFailure;
		stopOnFailure = newStopOnFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.FALLIBLE__STOP_ON_FAILURE, oldStopOnFailure,
					stopOnFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(Integer newRank) {
		Integer oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.FALLIBLE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrue(Boolean condition) {

		this._assert(condition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log getLogKermeta() {
		kermeta.kunit.Log result = null;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String message) {

		this.assertWithMsg(kermeta.standard.helper.BooleanWrapper
				.not(condition), message);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fail(String msg) {

		java.lang.Boolean idIfCond_1011 = false;
		idIfCond_1011 = this.mustStop();

		if (idIfCond_1011) {

			kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.kunit.AssertionFailedError"));

			exception.setMessage(kermeta.standard.helper.StringWrapper.plus(
					"explicit failure: ", msg));

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						exception);

		} else {

			this.getLogKermeta().addFailure(
					this,
					kermeta.standard.helper.StringWrapper.plus(
							"explicit failure: ", msg));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertEqual(String expected, String actual) {

		this.assertWithMsg(kermeta.standard.helper.StringWrapper.equals(
				expected, actual), kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\nexpected\t:[", expected),
								"] != \nactual\t:["), actual), "]"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalse(Boolean condition) {

		this._assert(kermeta.standard.helper.BooleanWrapper.not(condition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String message) {

		this.assertWithMsg(condition, message);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _assert(Boolean condition) {

		java.lang.Integer number = this.number();

		java.lang.Boolean idIfCond_1012 = false;
		idIfCond_1012 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_1012) {

			java.lang.String msg = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							"assertion number ",
							kermeta.standard.helper.IntegerWrapper
									.toString(number)), " failed");

			java.lang.Boolean idIfCond_1013 = false;
			idIfCond_1013 = this.mustStop();

			if (idIfCond_1013) {

				kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.AssertionFailedError"));

				exception.setMessage(msg);

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exception);

			} else {

				this.getLogKermeta().addFailure(this, msg);
			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer number() {

		java.lang.Integer result = null;

		java.lang.Boolean idIfCond_1014 = false;
		idIfCond_1014 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(this.getRank());

		if (idIfCond_1014) {

			this.setRank(0);
		}

		this.setRank(kermeta.standard.helper.IntegerWrapper.plus(
				this.getRank(), 1));

		result = this.getRank();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Integer number = this.number();

		java.lang.Boolean idIfCond_1015 = false;
		idIfCond_1015 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_1015) {

			java.lang.String realMsg = kermeta.standard.helper.StringWrapper
					.plus(kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									"assertion number ",
									kermeta.standard.helper.IntegerWrapper
											.toString(number)), " failed: "),
							msg);

			java.lang.Boolean idIfCond_1016 = false;
			idIfCond_1016 = this.mustStop();

			if (idIfCond_1016) {

				kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.kunit.AssertionFailedError"));

				exception.setMessage(realMsg);

				if (true)
					throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
							exception);

			} else {

				this.getLogKermeta().addFailure(this, realMsg);
			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean mustStop() {

		java.lang.Boolean result = null;

		java.lang.Boolean idIfCond_1017 = false;
		idIfCond_1017 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(this.getStopOnFailure());

		if (idIfCond_1017) {

			this.setStopOnFailure(true);
		}

		result = this.getStopOnFailure();

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
		case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
			return getStopOnFailure();
		case KunitPackage.FALLIBLE__RANK:
			return getRank();
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
		case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
			setStopOnFailure((Boolean) newValue);
			return;
		case KunitPackage.FALLIBLE__RANK:
			setRank((Integer) newValue);
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
		case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
			setStopOnFailure(STOP_ON_FAILURE_EDEFAULT);
			return;
		case KunitPackage.FALLIBLE__RANK:
			setRank(RANK_EDEFAULT);
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
		case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
			return STOP_ON_FAILURE_EDEFAULT == null ? stopOnFailure != null
					: !STOP_ON_FAILURE_EDEFAULT.equals(stopOnFailure);
		case KunitPackage.FALLIBLE__RANK:
			return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT
					.equals(rank);
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
		result.append(" (stopOnFailure: ");
		result.append(stopOnFailure);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //FallibleImpl
