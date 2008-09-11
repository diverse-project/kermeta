/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertImpl.java,v 1.2 2008-09-11 12:34:39 cfaucher Exp $
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

		java.lang.Boolean idIfCond_804 = false;
		idIfCond_804 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_804) {

			this.fail("assertTrue failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalseWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_805 = false;
		idIfCond_805 = condition;

		if (idIfCond_805) {

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

		java.lang.Boolean idIfCond_806 = false;
		idIfCond_806 = kermeta.standard.helper.BooleanWrapper
				.not(kermeta.standard.helper.StringWrapper.equals(expected,
						actual));

		if (idIfCond_806) {

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

		java.lang.Boolean idIfCond_807 = false;
		idIfCond_807 = condition;

		if (idIfCond_807) {

			this.fail("assertTrue number failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_808 = false;
		idIfCond_808 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_808) {

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

		java.lang.Boolean idIfCond_809 = false;
		idIfCond_809 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_809) {

			this.fail("assert failed");
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertWithMsg(Boolean condition, String msg) {

		java.lang.Boolean idIfCond_810 = false;
		idIfCond_810 = kermeta.standard.helper.BooleanWrapper.not(condition);

		if (idIfCond_810) {

			this.fail(kermeta.standard.helper.StringWrapper.plus(
					"assertTrueWithMsg failed : ", msg));
		}

	}

} //AssertImpl
