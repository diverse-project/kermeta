/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TestCaseImpl.java,v 1.12 2009-02-23 15:26:38 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.AbstractFallible;
import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;
import kermeta.kunit.TestCase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#getStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#get__testMethodName <em>test Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestCaseImpl extends TestImpl implements TestCase {
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
	 * The default value of the '{@link #get__testMethodName() <em>test Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__testMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String _TEST_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__testMethodName() <em>test Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__testMethodName()
	 * @generated
	 * @ordered
	 */
	protected String __testMethodName = _TEST_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.TEST_CASE;
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
					KunitPackage.TEST_CASE__STOP_ON_FAILURE, oldStopOnFailure,
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
					KunitPackage.TEST_CASE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get__testMethodName() {
		return __testMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__testMethodName(String new__testMethodName) {
		String old__testMethodName = __testMethodName;
		__testMethodName = new__testMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KunitPackage.TEST_CASE__TEST_METHOD_NAME,
					old__testMethodName, __testMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUp() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void raiseIfHasFailures() {

		java.lang.String msg = "";

		java.lang.Boolean idIfCond_976 = false;
		idIfCond_976 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).empty());

		if (idIfCond_976) {

			msg = "Failures: ";

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Failure> it_ft209 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).iterator();
				java.lang.Boolean idLoopCond_977 = false;
				while (!idLoopCond_977) {
					idLoopCond_977 = it_ft209.isOff();
					if (idLoopCond_977) {
					} else {

						//BIle:func
						kermeta.kunit.Failure f_lbdExp209 = it_ft209.next();

						msg = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(msg,
										"\n   "), f_lbdExp209.toString());
						//EIle:func

					}
				}
			}

			//EIft:each

			kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.kunit.KunitPackage.eINSTANCE
							.getAssertionFailedError()));

			exception.setMessage(msg);

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						exception);

		}

		java.lang.Boolean idIfCond_978 = false;
		idIfCond_978 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).empty());

		if (idIfCond_978) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).iterator();
				java.lang.Boolean idLoopCond_979 = false;
				while (!idLoopCond_979) {
					idLoopCond_979 = it_ft210.isOff();
					if (idLoopCond_979) {
					} else {

						//BIle:func
						kermeta.kunit.Error f_lbdExp210 = it_ft210.next();

						msg = "Errors: ";

						msg = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(msg,
										"\n   "), f_lbdExp210.toString());

						kermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getException()));

						exception.setMessage(msg);

						if (true)
							throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
									exception);

						//EIle:func

					}
				}
			}

			//EIft:each

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log getLogEMF_renameAs() {

		kermeta.kunit.Log result = null;

		result = this.getLog();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase setTestMethodName(String name) {

		kermeta.kunit.TestCase result = null;

		this.set__testMethodName(name);

		result = this;

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestMethodName() {

		java.lang.String result = null;

		result = this.get__testMethodName();

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {

		java.lang.String result = null;

		result = kermeta.standard.helper.StringWrapper
				.plus(
						kermeta.standard.helper.StringWrapper
								.plus(
										kermeta.standard.helper.StringWrapper
												.plus(
														org.kermeta.compil.runtime.helper.language.ObjectUtil
																.getMetaClassSwitcher(
																		this)
																.getterName(),
														"."), this
												.getTestMethodName()), "()");

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {

		this.getLogEMF_renameAs().newAttempt();

		{
			try {
				this.setUp();

				{
					try {
						kermeta.interpreter.DynamicExpression de = ((kermeta.interpreter.DynamicExpression) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.interpreter.InterpreterPackage.eINSTANCE
										.getDynamicExpression()));

						de.initializeDefaults();

						de
								.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.asTypeOrVoid(
												org.kermeta.compil.runtime.helper.language.ObjectUtil
														.getMetaClassSwitcher(
																this)
														.getTypeDefinition(),
												"kermeta.language.structure.ClassDefinition"));

						de.parse(kermeta.standard.helper.StringWrapper.plus(
								"self.", this.getTestMethodName()));

						de
								.execute(
										this,
										((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject(kermeta.utils.UtilsPackage.eINSTANCE
														.getHashtable())));

						{
							try {
								this.tearDown();
							} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1) {
								boolean caught_1 = false;
								if (ex_switcher_1.getRealException() instanceof kermeta.exceptions.Exception) {
									caught_1 = true;
									kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_1
											.getRealException();
									this.getLogEMF_renameAs().addTearDownError(
											this, e);
								}
								if (!caught_1) {
									throw ex_switcher_1;
								}

							}
						}
					} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2) {
						boolean caught_2 = false;
						if (ex_switcher_2.getRealException() instanceof kermeta.kunit.AssertionFailedError) {
							caught_2 = true;
							kermeta.kunit.AssertionFailedError afe = (kermeta.kunit.AssertionFailedError) ex_switcher_2
									.getRealException();
							this
									.getLogEMF_renameAs()
									.addFailure(
											this,
											kermeta.standard.helper.StringWrapper
													.plus(
															kermeta.standard.helper.StringWrapper
																	.plus(
																			afe
																					.getMessage(),
																			"\nstack trace:\n"),
															afe.getStackTrace()));
						}
						if (ex_switcher_2.getRealException() instanceof kermeta.exceptions.Exception) {
							caught_2 = true;
							kermeta.exceptions.Exception e1 = (kermeta.exceptions.Exception) ex_switcher_2
									.getRealException();
							this.getLogEMF_renameAs().addTestError(this, e1);
							{
								try {
									this.tearDown();
								} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_3) {
									boolean caught_3 = false;
									if (ex_switcher_3.getRealException() instanceof kermeta.exceptions.Exception) {
										caught_3 = true;
										kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_3
												.getRealException();
										this.getLogEMF_renameAs()
												.addTearDownError(this, e);
									}
									if (!caught_3) {
										throw ex_switcher_3;
									}

								}
							}
						}
						if (!caught_2) {
							throw ex_switcher_2;
						}

					}
				}
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_4) {
				boolean caught_4 = false;
				if (ex_switcher_4.getRealException() instanceof kermeta.exceptions.Exception) {
					caught_4 = true;
					kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_4
							.getRealException();
					this.getLogEMF_renameAs().addSetUpError(this, e);
				}
				if (!caught_4) {
					throw ex_switcher_4;
				}

			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void tearDown() {

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

		java.lang.Boolean idIfCond_942 = false;
		idIfCond_942 = this.mustStop();

		if (idIfCond_942) {

			kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject(kermeta.kunit.KunitPackage.eINSTANCE
							.getAssertionFailedError()));

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

		java.lang.Boolean idIfCond_943 = false;
		idIfCond_943 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_943) {

			java.lang.String msg = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							"assertion number ",
							kermeta.standard.helper.IntegerWrapper
									.toString(number)), " failed");

			java.lang.Boolean idIfCond_944 = false;
			idIfCond_944 = this.mustStop();

			if (idIfCond_944) {

				kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.kunit.KunitPackage.eINSTANCE
								.getAssertionFailedError()));

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

		java.lang.Boolean idIfCond_945 = false;
		idIfCond_945 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getRank());

		if (idIfCond_945) {

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

		java.lang.Boolean idIfCond_946 = false;
		idIfCond_946 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_946) {

			java.lang.String realMsg = kermeta.standard.helper.StringWrapper
					.plus(kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									"assertion number ",
									kermeta.standard.helper.IntegerWrapper
											.toString(number)), " failed: "),
							msg);

			java.lang.Boolean idIfCond_947 = false;
			idIfCond_947 = this.mustStop();

			if (idIfCond_947) {

				kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject(kermeta.kunit.KunitPackage.eINSTANCE
								.getAssertionFailedError()));

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

		java.lang.Boolean idIfCond_948 = false;
		idIfCond_948 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoidSwitcher(this.getStopOnFailure());

		if (idIfCond_948) {

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
	public String distil(String s) {

		java.lang.String result = null;

		result = "";

		java.lang.Boolean white = false;

		{

			java.lang.Integer i = 0;
			java.lang.Boolean idLoopCond_949 = false;
			while (!idLoopCond_949) {
				idLoopCond_949 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.StringWrapper.size(s));
				if (idLoopCond_949) {
				} else {

					java.lang.String c = kermeta.standard.helper.CharacterWrapper
							.toString(kermeta.standard.helper.StringWrapper
									.elementAt(s, i));

					java.lang.Boolean idIfCond_950 = false;
					idIfCond_950 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.indexOf(" \n\t", c), 0);

					if (idIfCond_950) {

						java.lang.Boolean idIfCond_951 = false;
						idIfCond_951 = kermeta.standard.helper.BooleanWrapper
								.not(white);

						if (idIfCond_951) {

							white = true;

							result = kermeta.standard.helper.StringWrapper
									.plus(result, " ");
						}

					} else {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, c);

						java.lang.Boolean idIfCond_952 = false;
						idIfCond_952 = white;

						if (idIfCond_952) {

							white = false;
						}

					}

					i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
				}
			}
		}

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertSimilar(String expected, String actual) {

		expected = this.distil(expected);

		actual = this.distil(actual);

		this.assertWithMsg(kermeta.standard.helper.StringWrapper.equals(
				expected, actual), kermeta.standard.helper.StringWrapper.plus(
				kermeta.standard.helper.StringWrapper.plus(
						kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(
										"\nexpected\t:[", expected),
								"] != \nactual  \t:["), actual), "]"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
			return getStopOnFailure();
		case KunitPackage.TEST_CASE__RANK:
			return getRank();
		case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
			return get__testMethodName();
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
		case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
			setStopOnFailure((Boolean) newValue);
			return;
		case KunitPackage.TEST_CASE__RANK:
			setRank((Integer) newValue);
			return;
		case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
			set__testMethodName((String) newValue);
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
		case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
			setStopOnFailure(STOP_ON_FAILURE_EDEFAULT);
			return;
		case KunitPackage.TEST_CASE__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
			set__testMethodName(_TEST_METHOD_NAME_EDEFAULT);
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
		case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
			return STOP_ON_FAILURE_EDEFAULT == null ? stopOnFailure != null
					: !STOP_ON_FAILURE_EDEFAULT.equals(stopOnFailure);
		case KunitPackage.TEST_CASE__RANK:
			return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT
					.equals(rank);
		case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
			return _TEST_METHOD_NAME_EDEFAULT == null ? __testMethodName != null
					: !_TEST_METHOD_NAME_EDEFAULT.equals(__testMethodName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractFallible.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Fallible.class) {
			switch (derivedFeatureID) {
			case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
				return KunitPackage.FALLIBLE__STOP_ON_FAILURE;
			case KunitPackage.TEST_CASE__RANK:
				return KunitPackage.FALLIBLE__RANK;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractFallible.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Fallible.class) {
			switch (baseFeatureID) {
			case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
				return KunitPackage.TEST_CASE__STOP_ON_FAILURE;
			case KunitPackage.FALLIBLE__RANK:
				return KunitPackage.TEST_CASE__RANK;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TestCaseImpl
