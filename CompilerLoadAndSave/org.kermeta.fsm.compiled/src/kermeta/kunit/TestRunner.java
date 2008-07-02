/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TestRunner.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
 */
package kermeta.kunit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestRunner#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestRunner()
 * @model annotation="kermeta documentation='/**\r\n * Create and use a test runner to run one or more tests and print the failure log. E.g.:\r\n * do\r\n *\t     var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\r\n *\t     var runner : TestRunner init TestRunner.new\r\n *\t     runner.run(suite)\r\n *\t     runner.printLogs\r\n * end\r\n *\r\n * Where InterestingTestCaseSet is a subclass of TestCase and contains several test... methods\r\n \052/'"
 * @generated
 */
public interface TestRunner extends kermeta.language.structure.Object
{
  /**
   * Returns the value of the '<em><b>Log</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Log</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' containment reference.
   * @see #setLog(Log)
   * @see kermeta.kunit.KunitPackage#getTestRunner_Log()
   * @model containment="true"
   * @generated
   */
  Log getLog();

  /**
   * Sets the value of the '{@link kermeta.kunit.TestRunner#getLog <em>Log</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log</em>' containment reference.
   * @see #getLog()
   * @generated
   */
  void setLog(Log value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * Use this to run a test case or a test suite.\r\n\t * If you want to run all the test.... methods in a TestCase class,\r\n\t *  you can populate a suite with TestSuite.addAllTestCasesFrom\r\n\t \052/'"
   *        annotation="kermeta.pre testNotVoid=''"
   *        annotation="kermeta.post logNotVoid=''"
   * @generated
   */
  void runTest(Test test);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model ordered="false"
   *        annotation="kermeta documentation='/**\r\n\t * Prints the log or errors and failures from a test run.\r\n\t * Run some tests first.\r\n\t \052/'"
   * @generated
   */
  kermeta.standard.Void printTestResult();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t  * For backwards compatibility with old kunit, this takes a test case class\r\n\t  * and creates the necessary suite, and runs it. DEPRECATED\r\n\t  \052/'"
   *        annotation="kermeta.pre cIsATestCase=''"
   * @generated
   */
  void run(kermeta.language.structure.Class testCaseClass);

} // TestRunner
