/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestCaseImpl.java,v 1.4 2008-10-08 14:37:23 cfaucher Exp $
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
	public void raiseIfHasFailures() {

		java.lang.String msg = "";

		java.lang.Boolean idIfCond_989 = false;
		idIfCond_989 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).empty());

		if (idIfCond_989) {

			msg = "Failures: ";

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Failure> it_ft223 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Failure> convertAsOrderedSet(
								this.getLog().getFailures()).iterator();
				java.lang.Boolean idLoopCond_990 = false;
				while (!idLoopCond_990) {
					idLoopCond_990 = it_ft223.isOff();
					if (idLoopCond_990) {
					} else {

						//BIle:func
						kermeta.kunit.Failure f_lbdExp223 = it_ft223.next();

						msg = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(msg,
										"\n   "), f_lbdExp223.toString());
						//EIle:func

					}
				}
			}

			//EIft:each

			kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
					.newObject("kermeta.kunit.AssertionFailedError"));

			exception.setMessage(msg);

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						exception);

		}

		java.lang.Boolean idIfCond_991 = false;
		idIfCond_991 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).empty());

		if (idIfCond_991) {

			//BIft:each

			{

				kermeta.standard.Iterator<kermeta.kunit.Error> it_ft224 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.kunit.Error> convertAsOrderedSet(
								this.getLog().getErrors()).iterator();
				java.lang.Boolean idLoopCond_992 = false;
				while (!idLoopCond_992) {
					idLoopCond_992 = it_ft224.isOff();
					if (idLoopCond_992) {
					} else {

						//BIle:func
						kermeta.kunit.Error f_lbdExp224 = it_ft224.next();

						msg = "Errors: ";

						msg = kermeta.standard.helper.StringWrapper.plus(
								kermeta.standard.helper.StringWrapper.plus(msg,
										"\n   "), f_lbdExp224.toString());

						kermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.exceptions.Exception"));

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
	public void setUp() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log getLog() {

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
																.getMetaClass(
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

		this.getLog().newAttempt();

		{
			try {
				this.setUp();

				{
					try {
						kermeta.interpreter.DynamicExpression de = ((kermeta.interpreter.DynamicExpression) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject("kermeta.interpreter.DynamicExpression"));

						de.initializeDefaults();

						de
								.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil
										.getMetaClass(this).getTypeDefinition());

						de.parse(kermeta.standard.helper.StringWrapper.plus(
								"self.", this.getTestMethodName()));

						de
								.execute(
										this,
										((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil
												.newObject("kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Object>")));

						{
							try {
								this.tearDown();
							} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1) {
								if (ex_switcher_1.getRealException() instanceof kermeta.exceptions.Exception) {
									kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_1
											.getRealException();
									this.getLog().addTearDownError(this, e);
								}
							}
						}
					} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2) {
						if (ex_switcher_2.getRealException() instanceof kermeta.kunit.AssertionFailedError) {
							kermeta.kunit.AssertionFailedError afe = (kermeta.kunit.AssertionFailedError) ex_switcher_2
									.getRealException();
							this
									.getLog()
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
							kermeta.exceptions.Exception e1 = (kermeta.exceptions.Exception) ex_switcher_2
									.getRealException();
							this.getLog().addTestError(this, e1);
							{
								try {
									this.tearDown();
								} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_3) {
									if (ex_switcher_3.getRealException() instanceof kermeta.exceptions.Exception) {
										kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_3
												.getRealException();
										this.getLog().addTearDownError(this, e);
									}
								}
							}
						}
					}
				}
			} catch (org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_4) {
				if (ex_switcher_4.getRealException() instanceof kermeta.exceptions.Exception) {
					kermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_4
							.getRealException();
					this.getLog().addSetUpError(this, e);
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

		java.lang.Boolean idIfCond_966 = false;
		idIfCond_966 = this.mustStop();

		if (idIfCond_966) {

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

		java.lang.Boolean idIfCond_967 = false;
		idIfCond_967 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_967) {

			java.lang.String msg = kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							"assertion number ",
							kermeta.standard.helper.IntegerWrapper
									.toString(number)), " failed");

			java.lang.Boolean idIfCond_968 = false;
			idIfCond_968 = this.mustStop();

			if (idIfCond_968) {

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

		java.lang.Boolean idIfCond_969 = false;
		idIfCond_969 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(this.getRank());

		if (idIfCond_969) {

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

		java.lang.Boolean idIfCond_970 = false;
		idIfCond_970 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_970) {

			java.lang.String realMsg = kermeta.standard.helper.StringWrapper
					.plus(kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									"assertion number ",
									kermeta.standard.helper.IntegerWrapper
											.toString(number)), " failed: "),
							msg);

			java.lang.Boolean idIfCond_971 = false;
			idIfCond_971 = this.mustStop();

			if (idIfCond_971) {

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

		java.lang.Boolean idIfCond_972 = false;
		idIfCond_972 = org.kermeta.compil.runtime.helper.language.ObjectUtil
				.isVoid(this.getStopOnFailure());

		if (idIfCond_972) {

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
			java.lang.Boolean idLoopCond_955 = false;
			while (!idLoopCond_955) {
				idLoopCond_955 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.StringWrapper.size(s));
				if (idLoopCond_955) {
				} else {

					java.lang.String c = kermeta.standard.helper.CharacterWrapper
							.toString(kermeta.standard.helper.StringWrapper
									.elementAt(s, i));

					java.lang.Boolean idIfCond_956 = false;
					idIfCond_956 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.indexOf(" \n\t", c), 0);

					if (idIfCond_956) {

						java.lang.Boolean idIfCond_957 = false;
						idIfCond_957 = kermeta.standard.helper.BooleanWrapper
								.not(white);

						if (idIfCond_957) {

							white = true;

							result = kermeta.standard.helper.StringWrapper
									.plus(result, " ");
						}

					} else {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, c);

						java.lang.Boolean idIfCond_958 = false;
						idIfCond_958 = white;

						if (idIfCond_958) {

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
