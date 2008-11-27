/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractFallible.java,v 1.9 2008-11-27 15:50:05 cfaucher Exp $
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Fallible</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see kermeta.kunit.KunitPackage#getAbstractFallible()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * to be written ############################\n \052/'"
 * @generated
 */
public interface AbstractFallible extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is not satisfied \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertTrue(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" sDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** \n\t ** reduces all runs of white-space to a single space character\n\t *\052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean white = false;\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_733 = false;\n\twhile( !idLoopCond_733 ) {\n\tidLoopCond_733 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.StringWrapper.size(s));\n\tif ( idLoopCond_733 ) {\n\t} else {\n\n\tjava.lang.String c = kermeta.standard.helper.CharacterWrapper.toString(kermeta.standard.helper.StringWrapper.elementAt(s, i));\n\n\tjava.lang.Boolean idIfCond_734 = false;\n\tidIfCond_734 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.indexOf(\" \\n\\t\", c), 0);\n\n\tif( idIfCond_734 ) {\n\n\tjava.lang.Boolean idIfCond_735 = false;\n\tidIfCond_735 = kermeta.standard.helper.BooleanWrapper.not(white);\n\n\tif( idIfCond_735 ) {\n\n\twhite = true;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \" \");\n}\n\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, c);\n\n\tjava.lang.Boolean idIfCond_736 = false;\n\tidIfCond_736 = white;\n\n\tif( idIfCond_736 ) {\n\n\twhite = false;\n}\n\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String distil(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" messageDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n     * process the given condition and react with the given message\n     * if it is satisfied\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertFalseWithMsg(Boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** to be used if a failure reaction is needed \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void fail(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.JavaString" actualDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the two given string and react if they are not equal \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is satisfied \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertFalse(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" messageDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n     * process the given condition and react with the given message\n     * if it is not satisfied\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertTrueWithMsg(Boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is not satisfied \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void _assert(Boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.JavaString" actualDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n   * Log a failure if the two strings are not identical modulo-white-space\n   \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\texpected = this.distil(expected);\n\n\tactual = this.distil(actual);\n\n\tthis.assertWithMsg(kermeta.standard.helper.StringWrapper.equals(expected, actual), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\nexpected\\t:[\", expected), \"] != \\nactual  \\t:[\"), actual), \"]\"));\n'"
	 * @generated
	 */
	void assertSimilar(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.JavaBoolean" msgDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n     * process the given condition and react with the given message\n     * if it is not satisfied\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void assertWithMsg(Boolean condition, String msg);

} // AbstractFallible
