/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assert.java,v 1.1 2008-07-02 09:43:56 ftanguy Exp $
 */
package kermeta.kunit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.kunit.KunitPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends AbstractFallible {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertTrue(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" msgDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertFalseWithMsg(boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** raise a AssertionViolatedException with the provided message \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void fail(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.String" actualDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** Will fail if the two strings are not identical \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertFalse(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" msgDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertTrueWithMsg(boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta documentation='/** Fails if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void _assert(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" msgDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 * @generated
	 */
	void assertWithMsg(boolean condition, String msg);

} // Assert
