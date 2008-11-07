/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertImpl.java,v 1.8 2008-11-07 08:52:29 cfaucher Exp $
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

		java.lang.Boolean idIfCond_994 = false;
		idIfCond_994 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_994) {

			this.fail("assertTrue failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_995 = false;
		idIfCond_995 = condition;

		if (idIfCond_995) {

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

		java.lang.Boolean idIfCond_996 = false;
		idIfCond_996 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.equals(expected,
						actual));

		if (idIfCond_996) {

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

		java.lang.Boolean idIfCond_997 = false;
		idIfCond_997 = condition;

		if (idIfCond_997) {

			this.fail("assertTrue number failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_998 = false;
		idIfCond_998 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_998) {

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

		java.lang.Boolean idIfCond_999 = false;
		idIfCond_999 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_999) {

			this.fail("assert failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_1000 = false;
		idIfCond_1000 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_1000) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

} //AssertImpl
