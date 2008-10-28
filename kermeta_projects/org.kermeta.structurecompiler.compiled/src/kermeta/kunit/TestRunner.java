/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestRunner.java,v 1.7 2008-10-28 13:18:20 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__6557170__testNotVoid\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test, null);\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\tthis.setLog(((kermeta.kunit.Log) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.Log\")));\n\n\ttest.setLogKermeta(this.getLog());\n\n\ttest.run();\n\n//PostConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"post__6557176__logNotVoid\" ) ) {\njava.lang.Boolean result_post = false;\n\n\tresult_post = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getLog(), null);\nif( !result_post ) {\nkermeta.exceptions.ConstraintViolatedPost exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPost();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}'"
	 * @generated
	 */
	void runTest(Test test);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Prints the log or errors and failures from a test run.\r\n\t * Run some tests first.\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n---------------------------------------------  TEST RESULTS-----------------------------------------------\\n\");\n\n\tjava.lang.Boolean idIfCond_876 = false;\n\tidIfCond_876 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).empty());\n\n\tif( idIfCond_876 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nFailures: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Failure> it_ft193 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).iterator();\n\tjava.lang.Boolean idLoopCond_877 = false;\n\twhile( !idLoopCond_877 ) {\n\tidLoopCond_877 = it_ft193.isOff();\n\tif ( idLoopCond_877 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Failure f_lbdExp193 = it_ft193.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", f_lbdExp193.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_878 = false;\n\tidIfCond_878 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).empty());\n\n\tif( idIfCond_878 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors: \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_879 = false;\n\twhile( !idLoopCond_879 ) {\n\tidLoopCond_879 = it_ft194.isOff();\n\tif ( idLoopCond_879 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp194 = it_ft194.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp194.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\tjava.lang.Boolean idIfCond_880 = false;\n\tidIfCond_880 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).empty());\n\n\tif( idIfCond_880 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\nErrors from setUp or tearDown : \");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft195 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_881 = false;\n\twhile( !idLoopCond_881 ) {\n\tidLoopCond_881 = it_ft195.isOff();\n\tif ( idLoopCond_881 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error e_lbdExp195 = it_ft195.next();\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"\\n   \", e_lbdExp195.toString()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n Summary: \");\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of launched tests : \", kermeta.standard.helper.IntegerWrapper.toString(this.getLog().getRuntests())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of failures : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors : \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(kermeta.standard.helper.StringWrapper.plus(\"   Number of errors in setUp or tearDown: \", kermeta.standard.helper.IntegerWrapper.toString(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getHarnessErrors()).size())));\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"\\n-------------------------------------------------------------------------------------------------------------------------------\\n\");\n'"
	 * @generated
	 */
	void printTestResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * For backwards compatibility with old kunit, this takes a test case class\r\n\t  * and creates the necessary suite, and runs it. DEPRECATED\r\n\t  \052/'"
	 *        annotation="kermeta.pre cIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__6557381__cIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\tthis.runTest(((kermeta.kunit.TestSuite) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.TestSuite\")).addAllTestCasesFrom(testCaseClass));\n'"
	 * @generated
	 */
	void run(kermeta.language.structure.Class testCaseClass);

} // TestRunner
