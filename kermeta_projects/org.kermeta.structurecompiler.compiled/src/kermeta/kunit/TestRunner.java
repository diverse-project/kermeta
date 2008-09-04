/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestRunner.java,v 1.1 2008-09-04 15:40:30 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n * Create and use a test runner to run one or more tests and print the failure log. E.g.:\n * do\n *\t     var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n *\t     var runner : TestRunner init TestRunner.new\n *\t     runner.run(suite)\n *\t     runner.printLogs\n * end\n *\n * Where InterestingTestCaseSet is a subclass of TestCase and contains several test... methods\n \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Where to register the failures and errors\n\t \052/'"
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
	 * @model annotation="kermeta documentation='/**\n\t * Use this to run a test case or a test suite.\n\t * If you want to run all the test.... methods in a TestCase class,\n\t *  you can populate a suite with TestSuite.addAllTestCasesFrom\n\t \052/'"
	 *        annotation="kermeta.pre testNotVoid=''"
	 *        annotation="kermeta.post logNotVoid=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Log\")));\n\n\ttest.setLogKermeta(this.getLog());\n\n\ttest.run();\n'"
	 * @generated
	 */
	void runTest(Test test);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Prints the log or errors and failures from a test run.\n\t * Run some tests first.\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\n---------------------------------------------  TEST RESULTS-----------------------------------------------\\n\");\n\n\tjava.lang.Boolean idIfCond_744 = false;\n\tidIfCond_744 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).empty());\n\n\tif( idIfCond_744 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\nFailures: \");\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Failure> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).iterator();\n\tjava.lang.Boolean idLoopCond_745 = false;\n\twhile( !idLoopCond_745 ) {\n\tidLoopCond_745 = it_ft160.isOff();\n\tif ( idLoopCond_745 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.kunit.Failure f = it_ft160.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", f.toString()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_746 = false;\n\tidIfCond_746 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).empty());\n\n\tif( idIfCond_746 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\nErrors: \");\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_747 = false;\n\twhile( !idLoopCond_747 ) {\n\tidLoopCond_747 = it_ft161.isOff();\n\tif ( idLoopCond_747 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.kunit.Error e = it_ft161.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e.toString()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_748 = false;\n\tidIfCond_748 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).empty());\n\n\tif( idIfCond_748 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\nErrors from setUp or tearDown : \");\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft162 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_749 = false;\n\twhile( !idLoopCond_749 ) {\n\tidLoopCond_749 = it_ft162.isOff();\n\tif ( idLoopCond_749 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.kunit.Error e = it_ft162.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e.toString()));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\n Summary: \");\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of launched tests : \", kermeta.standard.helper.IntegerWrapper.toString(this.getLog().getRuntests())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of failures : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors in setUp or tearDown: \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.writeln(\"\\n-------------------------------------------------------------------------------------------------------------------------------\\n\");\n'"
	 * @generated
	 */
	void printTestResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * For backwards compatibility with old kunit, this takes a test case class\n\t  * and creates the necessary suite, and runs it. DEPRECATED\n\t  \052/'"
	 *        annotation="kermeta.pre cIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.TestSuite\")).addAllTestCasesFrom(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"testCaseClass\")));\n'"
	 * @generated
	 */
	void run(kermeta.language.structure.Class testCaseClass);

} // TestRunner
