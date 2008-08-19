/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertImpl.java,v 1.2 2008-08-19 13:23:02 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.Assert;
import kermeta.kunit.KunitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertImpl extends AbstractFallibleImpl implements Assert {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.ASSERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrue(Boolean condition) {

		java.lang.Boolean idIfCond_13 = false;
		idIfCond_13 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_13) {

			this.fail("assertTrue failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_14 = false;
		idIfCond_14 = condition;

		if (idIfCond_14) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fail(String msg) {

		kermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject("kermeta.kunit.AssertionFailedError"));

		exception.setMessage(msg);

		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					exception);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertEqual(String expected, String actual) {

		java.lang.Boolean idIfCond_15 = false;
		idIfCond_15 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.equals(expected,
						actual));

		if (idIfCond_15) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					kermeta.standard.helper.StringWrapper.plus(
							kermeta.standard.helper.StringWrapper.plus(
									kermeta.standard.helper.StringWrapper.plus(
											"assertEqual failed\nexpected\t:[",
											expected), "] != \nactual\t:["),
							actual), "]"));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalse(Boolean condition) {

		java.lang.Boolean idIfCond_16 = false;
		idIfCond_16 = condition;

		if (idIfCond_16) {

			this.fail("assertTrue number failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_17 = false;
		idIfCond_17 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_17) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _assert(Boolean condition) {

		java.lang.Boolean idIfCond_18 = false;
		idIfCond_18 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_18) {

			this.fail("assert failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_19 = false;
		idIfCond_19 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_19) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

} //AssertImpl
