/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestRunner.java,v 1.5 2008-10-09 08:50:26 cfaucher Exp $
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
public interface TestRunner extends kermeta.language.structure.Object {
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
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='/**\r\n\t * Where to register the failures and errors\r\n\t \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Log\")));\n\n\ttest.setLogKermeta(this.getLog());\n\n\ttest.run();\n'"
	 * @generated
	 */
	void runTest(Test test);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Prints the log or errors and failures from a test run.\r\n\t * Run some tests first.\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n---------------------------------------------  TEST RESULTS-----------------------------------------------\\n\");\n\n\tjava.lang.Boolean idIfCond_993 = false;\n\tidIfCond_993 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).empty());\n\n\tif( idIfCond_993 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nFailures: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Failure> it_ft225 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).iterator();\n\tjava.lang.Boolean idLoopCond_994 = false;\n\twhile( !idLoopCond_994 ) {\n\tidLoopCond_994 = it_ft225.isOff();\n\tif ( idLoopCond_994 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Failure f_lbdExp225 = it_ft225.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", f_lbdExp225.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_995 = false;\n\tidIfCond_995 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).empty());\n\n\tif( idIfCond_995 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft226 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_996 = false;\n\twhile( !idLoopCond_996 ) {\n\tidLoopCond_996 = it_ft226.isOff();\n\tif ( idLoopCond_996 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp226 = it_ft226.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp226.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_997 = false;\n\tidIfCond_997 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).empty());\n\n\tif( idIfCond_997 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors from setUp or tearDown : \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft227 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_998 = false;\n\twhile( !idLoopCond_998 ) {\n\tidLoopCond_998 = it_ft227.isOff();\n\tif ( idLoopCond_998 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp227 = it_ft227.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp227.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n Summary: \");\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of launched tests : \", kermeta.standard.helper.IntegerWrapper.toString(this.getLog().getRuntests())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of failures : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors in setUp or tearDown: \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n-------------------------------------------------------------------------------------------------------------------------------\\n\");\n'"
	 * @generated
	 */
	void printTestResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * For backwards compatibility with old kunit, this takes a test case class\r\n\t  * and creates the necessary suite, and runs it. DEPRECATED\r\n\t  \052/'"
	 *        annotation="kermeta.pre cIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.TestSuite\")).addAllTestCasesFrom(testCaseClass));\n'"
	 * @generated
	 */
	void run(kermeta.language.structure.Class testCaseClass);

} // TestRunner
