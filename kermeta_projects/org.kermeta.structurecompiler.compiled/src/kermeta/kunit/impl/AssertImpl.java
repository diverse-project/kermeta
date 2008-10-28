/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertImpl.java,v 1.6 2008-10-28 13:18:09 cfaucher Exp $
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

		java.lang.Boolean idIfCond_886 = false;
		idIfCond_886 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_886) {

			this.fail("assertTrue failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_887 = false;
		idIfCond_887 = condition;

		if (idIfCond_887) {

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

		java.lang.Boolean idIfCond_888 = false;
		idIfCond_888 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.equals(expected,
						actual));

		if (idIfCond_888) {

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

		java.lang.Boolean idIfCond_889 = false;
		idIfCond_889 = condition;

		if (idIfCond_889) {

			this.fail("assertTrue number failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_890 = false;
		idIfCond_890 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_890) {

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

		java.lang.Boolean idIfCond_891 = false;
		idIfCond_891 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_891) {

			this.fail("assert failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_892 = false;
		idIfCond_892 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_892) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

} //AssertImpl
