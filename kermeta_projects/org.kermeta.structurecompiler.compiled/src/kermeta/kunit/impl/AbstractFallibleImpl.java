/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractFallibleImpl.java,v 1.8 2008-11-07 08:52:29 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.AbstractFallible;
import kermeta.kunit.KunitPackage;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Fallible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFallibleImpl extends ObjectImpl implements
		AbstractFallible {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFallibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.ABSTRACT_FALLIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrue(Boolean condition) {

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
			java.lang.Boolean idLoopCond_990 = false;
			while (!idLoopCond_990) {
				idLoopCond_990 = kermeta.standard.helper.IntegerWrapper.equals(
						i, kermeta.standard.helper.StringWrapper.size(s));
				if (idLoopCond_990) {
				} else {

					java.lang.String c = kermeta.standard.helper.CharacterWrapper
							.toString(kermeta.standard.helper.StringWrapper
									.elementAt(s, i));

					java.lang.Boolean idIfCond_991 = false;
					idIfCond_991 = kermeta.standard.helper.IntegerWrapper
							.isGreaterOrEqual(
									kermeta.standard.helper.StringWrapper
											.indexOf(" \n\t", c), 0);

					if (idIfCond_991) {

						java.lang.Boolean idIfCond_992 = false;
						idIfCond_992 = kermeta.standard.helper.BooleanWrapper
								.not(white);

						if (idIfCond_992) {

							white = true;

							result = kermeta.standard.helper.StringWrapper
									.plus(result, " ");
						}

					} else {

						result = kermeta.standard.helper.StringWrapper.plus(
								result, c);

						java.lang.Boolean idIfCond_993 = false;
						idIfCond_993 = white;

						if (idIfCond_993) {

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
	public void assertFalseWithMsg(Boolean condition, String message) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fail(String msg) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertEqual(String expected, String actual) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertFalse(Boolean condition) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assertTrueWithMsg(Boolean condition, String message) {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void _assert(Boolean condition) {

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
	public void assertWithMsg(Boolean condition, String msg) {

	}

} //AbstractFallibleImpl
