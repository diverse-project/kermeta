/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assert.java,v 1.8 2008-11-07 08:53:45 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_994 = false;\n\tidIfCond_994 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_994 ) {\n\n\tthis.fail(\"assertTrue failed\");\n}\n\n'"
	 * @generated
	 */
	void assertTrue(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_995 = false;\n\tidIfCond_995 = condition;\n\n\tif( idIfCond_995 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_996 = false;\n\tidIfCond_996 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.equals(expected, actual));\n\n\tif( idIfCond_996 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"assertEqual failed\\nexpected\\t:[\", expected), \"] != \\nactual\\t:[\"), actual), \"]\"));\n}\n\n'"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** will fail if condition is true \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_997 = false;\n\tidIfCond_997 = condition;\n\n\tif( idIfCond_997 ) {\n\n\tthis.fail(\"assertTrue number failed\");\n}\n\n'"
	 * @generated
	 */
	void assertFalse(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_998 = false;\n\tidIfCond_998 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_998 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
	 * @generated
	 */
	void assertTrueWithMsg(Boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/** Fails if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_999 = false;\n\tidIfCond_999 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_999 ) {\n\n\tthis.fail(\"assert failed\");\n}\n\n'"
	 * @generated
	 */
	void _assert(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** will fail if condition is false \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1000 = false;\n\tidIfCond_1000 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_1000 ) {\n\n\tthis.fail(kermeta.standard.helper.StringWrapper.plus(\"assertTrueWithMsg failed : \", msg));\n}\n\n'"
	 * @generated
	 */
	void assertWithMsg(Boolean condition, String msg);

} // Assert
