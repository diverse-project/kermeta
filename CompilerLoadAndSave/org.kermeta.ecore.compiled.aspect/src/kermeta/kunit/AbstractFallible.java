/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractFallible.java,v 1.1 2008-07-02 09:43:56 ftanguy Exp $
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
 *        annotation="kermeta documentation='/**\r\n * to be written ############################\r\n \052/'"
 * @generated
 */
public interface AbstractFallible extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is not satisfied \052/'"
	 * @generated
	 */
	void assertTrue(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.String" sDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/** \r\n\t ** reduces all runs of white-space to a single space character\r\n\t *\052/'"
	 * @generated
	 */
	String distil(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" messageDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n     * process the given condition and react with the given message\r\n     * if it is satisfied\r\n     \052/'"
	 * @generated
	 */
	void assertFalseWithMsg(boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** to be used if a failure reaction is needed \052/'"
	 * @generated
	 */
	void fail(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.String" actualDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the two given string and react if they are not equal \052/'"
	 * @generated
	 */
	void assertEqual(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is satisfied \052/'"
	 * @generated
	 */
	void assertFalse(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" messageDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n     * process the given condition and react with the given message\r\n     * if it is not satisfied\r\n     \052/'"
	 * @generated
	 */
	void assertTrueWithMsg(boolean condition, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/** process the given condition and react if it is not satisfied \052/'"
	 * @generated
	 */
	void _assert(boolean condition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expectedDataType="kermeta.standard.String" actualDataType="kermeta.standard.String"
	 *        annotation="kermeta documentation='/**\r\n   * Log a failure if the two strings are not identical modulo-white-space\r\n   \052/'"
	 * @generated
	 */
	void assertSimilar(String expected, String actual);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionDataType="kermeta.standard.Boolean" msgDataType="kermeta.standard.String"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\r\n     * process the given condition and react with the given message\r\n     * if it is not satisfied\r\n     \052/'"
	 * @generated
	 */
	void assertWithMsg(boolean condition, String msg);

} // AbstractFallible
