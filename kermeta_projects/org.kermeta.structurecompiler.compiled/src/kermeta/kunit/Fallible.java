/**
 * <copyright>
 * </copyright>
 *
 * $Id: Fallible.java,v 1.5 2008-10-16 13:18:04 cfaucher Exp $
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fallible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Fallible#getStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.Fallible#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getFallible()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This is represents the aspect of tests that they may go wrong.\r\n * it defines the ability to define the conditions for success\r\n * (assertions) and the mechanism for recording that those \r\n * conditions have not been met.\r\n \052/'"
 * @generated
 */
public interface Fallible extends AbstractFallible {
	/**
	 * Returns the value of the '<em><b>Stop On Failure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop On Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop On Failure</em>' attribute.
	 * @see #setStopOnFailure(Boolean)
	 * @see kermeta.kunit.KunitPackage#getFallible_StopOnFailure()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n   * Set this attribute to false if you wish your test to not stop if the assert fails.\r\n   * note : if set to false, the count of failures/errors may be bigger that the number of executed test operations\r\n   \052/'"
	 * @generated
	 */
	Boolean getStopOnFailure();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Fallible#getStopOnFailure <em>Stop On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop On Failure</em>' attribute.
	 * @see #getStopOnFailure()
	 * @generated
	 */
	void setStopOnFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(Integer)
	 * @see kermeta.kunit.KunitPackage#getFallible_Rank()
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n   * counter of assertions in the test method\r\n   \052/'"
	 * @generated
	 */
	Integer getRank();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Fallible#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis._assert(condition);\n'"
	 * @generated
	 */
	void assertTrue(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n   * where failures will be put \r\n   \052/'"
	 *        annotation="kermeta EMF_renameAs='getLogKermeta'"
	 *        annotation="kermeta.post logDefined=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='kermeta.kunit.Log result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	Log getLogKermeta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" messageDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is true\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.assertWithMsg(kermeta.standard.helper.BooleanWrapper.not(condition), message);\n'"
	 * @generated
	 */
	void assertFalseWithMsg(Boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure \r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Boolean idIfCond_1011 = false;\n\tidIfCond_1011 = this.mustStop();\n\n\tif( idIfCond_1011 ) {\n\n\tkermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.AssertionFailedError\"));\n\n\texception.setMessage(kermeta.standard.helper.StringWrapper.plus(\"explicit failure: \", msg));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n else {\n\n\tthis.getLogKermeta().addFailure(this, kermeta.standard.helper.StringWrapper.plus(\"explicit failure: \", msg));\n}\n\n'"
	 * @generated
	 */
	void fail(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.JavaString" actualDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if the two strings are not identical\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.assertWithMsg(kermeta.standard.helper.StringWrapper.equals(expected, actual), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\nexpected\\t:[\", expected), \"] != \\nactual\\t:[\"), actual), \"]\"));\n'"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is true\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis._assert(kermeta.standard.helper.BooleanWrapper.not(condition));\n'"
	 * @generated
	 */
	void assertFalse(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" messageDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.assertWithMsg(condition, message);\n'"
	 * @generated
	 */
	void assertTrueWithMsg(Boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Integer number = this.number();\n\n\tjava.lang.Boolean idIfCond_1012 = false;\n\tidIfCond_1012 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_1012 ) {\n\n\tjava.lang.String msg = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"assertion number \", kermeta.standard.helper.IntegerWrapper.toString(number)), \" failed\");\n\n\tjava.lang.Boolean idIfCond_1013 = false;\n\tidIfCond_1013 = this.mustStop();\n\n\tif( idIfCond_1013 ) {\n\n\tkermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.AssertionFailedError\"));\n\n\texception.setMessage(msg);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n else {\n\n\tthis.getLogKermeta().addFailure(this, msg);\n}\n\n}\n\n'"
	 * @generated
	 */
	void _assert(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaInteger"
	 *        annotation="kermeta documentation='/**\r\n   * current order position of counter of assertions\r\n   \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Integer result = null;\n\n\tjava.lang.Boolean idIfCond_1014 = false;\n\tidIfCond_1014 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getRank());\n\n\tif( idIfCond_1014 ) {\n\n\tthis.setRank(0);\n}\n\n\n\tthis.setRank(kermeta.standard.helper.IntegerWrapper.plus(this.getRank(), 1));\n\n\tresult = this.getRank();\n\nreturn result;\n'"
	 * @generated
	 */
	Integer number();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if condition is false\r\n   \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::AbstractFallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.Integer number = this.number();\n\n\tjava.lang.Boolean idIfCond_1015 = false;\n\tidIfCond_1015 = kermeta.standard.helper.BooleanWrapper.not(condition);\n\n\tif( idIfCond_1015 ) {\n\n\tjava.lang.String realMsg = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"assertion number \", kermeta.standard.helper.IntegerWrapper.toString(number)), \" failed: \"), msg);\n\n\tjava.lang.Boolean idIfCond_1016 = false;\n\tidIfCond_1016 = this.mustStop();\n\n\tif( idIfCond_1016 ) {\n\n\tkermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.AssertionFailedError\"));\n\n\texception.setMessage(realMsg);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n else {\n\n\tthis.getLogKermeta().addFailure(this, realMsg);\n}\n\n}\n\n'"
	 * @generated
	 */
	void assertWithMsg(Boolean condition, String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tjava.lang.Boolean idIfCond_1017 = false;\n\tidIfCond_1017 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getStopOnFailure());\n\n\tif( idIfCond_1017 ) {\n\n\tthis.setStopOnFailure(true);\n}\n\n\n\tresult = this.getStopOnFailure();\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustStop();

} // Fallible
