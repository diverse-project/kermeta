/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assert.java,v 1.2 2008-08-19 13:22:55 cfaucher Exp $
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
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_13 = false;\n\tidIfCond_13 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_13 ) {\n\n\tthis.fail(\"assertTrue failed\");\n}\n\n'"
	 * @generated
	 */
	void assertTrue(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_14 = false;\n\tidIfCond_14 = condition;\n\n\tif( idIfCond_14 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
	 * @generated
	 */
	void assertFalseWithMsg(Boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** raise a AssertionViolatedException with the provided message \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tkermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.AssertionFailedError\"));\n\n\texception.setMessage(msg);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n'"
	 * @generated
	 */
	void fail(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.JavaString" actualDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** Will fail if the two strings are not identical \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_15 = false;\n\tidIfCond_15 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.equals(expected, actual));\n\n\tif( idIfCond_15 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"assertEqual failed\\nexpected\\t:[\", expected), \"] != \\nactual\\t:[\"), actual), \"]\"));\n}\n\n'"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_16 = false;\n\tidIfCond_16 = condition;\n\n\tif( idIfCond_16 ) {\n\n\tthis.fail(\"assertTrue number failed\");\n}\n\n'"
	 * @generated
	 */
	void assertFalse(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_17 = false;\n\tidIfCond_17 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_17 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
	 * @generated
	 */
	void assertTrueWithMsg(Boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** Fails if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_18 = false;\n\tidIfCond_18 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_18 ) {\n\n\tthis.fail(\"assert failed\");\n}\n\n'"
	 * @generated
	 */
	void _assert(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_19 = false;\n\tidIfCond_19 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_19 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
	 * @generated
	 */
	void assertWithMsg(Boolean condition, String msg);

} // Assert
