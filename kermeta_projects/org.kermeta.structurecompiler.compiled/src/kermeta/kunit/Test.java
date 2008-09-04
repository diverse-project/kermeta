/**
 * <copyright>
 * </copyright>
 *
 * $Id: Test.java,v 1.1 2008-09-04 15:40:30 cfaucher Exp $
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.Test#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTest()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\n * The abstact notion of a test which is runnable and which has a log\n * in which it can keep note of failures\n \052/'"
 * @generated
 */
public interface Test extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' reference.
	 * @see #setLog(Log)
	 * @see kermeta.kunit.KunitPackage#getTest_Log()
	 * @model annotation="kermeta documentation='/**\n     * where failures and errors will be put \n     \052/'"
	 * @generated
	 */
	Log getLog();

	/**
	 * Sets the value of the '{@link kermeta.kunit.Test#getLog <em>Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(Log value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Initializes the log where failures and errors will be put\n\t \052/'"
	 *        annotation="kermeta EMF_renameAs='setLogKermeta'"
	 *        annotation="kermeta.pre paramNotVoid=''"
	 *        annotation="kermeta.post logNotVoid=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLog(log);\n'"
	 * @generated
	 */
	void setLogKermeta(Log log);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta isAbstract='true'"
	 *        annotation="kermeta documentation='/**\n\t * Execute the test and verify its assertions\n\t \052/'"
	 *        annotation="kermeta.pre logNotVoid=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * called when run by the java testrunner\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Log result = null;\n\n\tthis.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Log\")));\n\n\tresult = this.getLog();\n\nreturn result;\n'"
	 * @generated
	 */
	Log initLog();

} // Test
