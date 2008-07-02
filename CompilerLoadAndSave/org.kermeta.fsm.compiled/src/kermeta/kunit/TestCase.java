/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TestCase.java,v 1.1 2008-07-02 09:13:32 ftanguy Exp $
 */
package kermeta.kunit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestCase#get__testMethodName <em>test Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestCase()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * A test case comprises one or more test methods plus\r\n * setUp and tearDown that build and destroy their test harness.\r\n * An instance of a subclass of TestCase should have its\r\n * testMethodName set to the name of one of its operations\r\n * which should be called whe the test is run. You can do this\r\n * yourself:\r\n *\r\n * var testCase : TestCase init MyTestCaseClass.new.setTestMethodName(\"testSomething\")\r\n *\r\n * Alternatively if your TestCase Class has many methods whose\r\n * name begins with \'test\' you can create a set of instaces already\r\n * set up with their testMethodName using the addAllTestCasesFrom\r\n * operation on TestSuite\r\n \052/'"
 * @generated
 */
public interface TestCase extends Test, Fallible
{
  /**
   * Returns the value of the '<em><b>test Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>test Method Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>test Method Name</em>' attribute.
   * @see #set__testMethodName(String)
   * @see kermeta.kunit.KunitPackage#getTestCase___testMethodName()
   * @model dataType="kermeta.standard.String"
   * @generated
   */
  String get__testMethodName();

  /**
   * Sets the value of the '{@link kermeta.kunit.TestCase#get__testMethodName <em>test Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>test Method Name</em>' attribute.
   * @see #get__testMethodName()
   * @generated
   */
  void set__testMethodName(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * operation used when the TestCase is run from a java test runner, encapsulates the failures results\r\n\t * into an AssertionFailedError so the TestRunner can detect it\r\n\t \052/'"
   * @generated
   */
  void raiseIfHasFailures();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * the things to be done before execution of the test method\r\n\t * (designed to be overwritten in real TestCase classes) \r\n\t \052/'"
   * @generated
   */
  void setUp();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="kermeta documentation='/**\r\n\t * accessor on the log\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::Fallible'"
   * @generated
   */
  Log getLog();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model nameDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Sets the name of the method from the concrete subclass of\r\n\t *  TestCase that should be executed when this TestCase instance\r\n\t * is run as a test.\r\n\t * Throws invalidTestCaseNameException if the given string is not\r\n\t * the name of a method in the test case\r\n\t \052/'"
   * @generated
   */
  TestCase setTestMethodName(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * accessor on the method name\r\n\t \052/'"
   * @generated
   */
  String getTestMethodName();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * overwrites the default method for more informative output\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
   * @generated
   */
  String toString();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model ordered="false"
   *        annotation="kermeta documentation='/**\r\n\t * Execute the whole test case : SetUp, test method, TearDown\r\n\t * The assertions of the test method are computed\r\n\t \052/'"
   *        annotation="kermeta superOperation='kermeta::kunit::Test'"
   * @generated
   */
  void run();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="kermeta documentation='/**\r\n\t * the things to be done after execution of the test method\r\n\t * (designed to be overwritten in real TestCase classes) \r\n\t \052/'"
   * @generated
   */
  void tearDown();

} // TestCase
