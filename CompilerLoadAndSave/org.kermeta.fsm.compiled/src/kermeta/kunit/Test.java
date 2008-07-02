/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: Test.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
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
 *        annotation="kermeta documentation='/**\r\n * The abstact notion of a test which is runnable and which has a log\r\n * in which it can keep note of failures\r\n \052/'"
 * @generated
 */
public interface Test extends kermeta.language.structure.Object
{
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
   * @model
   * @generated
   */
  Log getLog();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Initializes the log where failures and errors will be put\r\n\t \052/'"
   *        annotation="kermeta.pre paramNotVoid=''"
   *        annotation="kermeta.post logNotVoid=''"
   * @generated
   */
  void setLog(Log log);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta isAbstract='true'"
   *        annotation="kermeta documentation='/**\r\n\t * Execute the test and verify its assertions\r\n\t \052/'"
   *        annotation="kermeta.pre logNotVoid=''"
   * @generated
   */
  void run();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * called when run by the java testrunner\r\n\t \052/'"
   * @generated
   */
  Log initLog();

} // Test
