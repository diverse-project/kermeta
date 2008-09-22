/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.3 2008-09-22 14:46:08 cfaucher Exp $
 */
package kermeta.kunit;

import kermeta.language.structure.ClassDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestSuite#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestSuite()
 * @model annotation="kermeta documentation='/**\r\n * A TestSuite is a structured collection of tests, using the\r\n * composite pattern, all tests are runnable and have a log\r\n * In addition a suite can be populated automatically from a\r\n * test case class with one test case object for each test\r\n * method in the class.\r\n *  You can make a suite and populate it manually like this:\r\n *\r\n *  var suite : TestSuite init TestSuite.new.\r\n *  suite.tests.add(t1)\r\n *\r\n *  Alternatively you can populate a suite automatically from\r\n *  a class that inherits TestCase and which has several methods\r\n *  called test:\r\n *\r\n *  var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\r\n \052/'"
 * @generated
 */
public interface TestSuite extends Test {
	/**
	 * Returns the value of the '<em><b>Tests</b></em>' reference list.
	 * The list contents are of type {@link kermeta.kunit.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' reference list.
	 * @see kermeta.kunit.KunitPackage#getTestSuite_Tests()
	 * @model annotation="kermeta documentation='/**\r\n\t * The collection of tests which will be ran as the suite\r\n\t \052/'"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * Add to this suite, a set of test cases of type c, one for each\r\n\t  * test method in class c. C must be a descendent of TestCase\r\n\t  \052/'"
	 *        annotation="kermeta.pre testCaseClassIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft205 = null;\n\n\tjava.lang.Boolean test_ft205 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_911 = false;\n\twhile( !idLoopCond_911 ) {\n\tidLoopCond_911 = kermeta.standard.helper.BooleanWrapper.or(it_ft205.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft205, false));\n\tif ( idLoopCond_911 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft205 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp205 = it_ft205.next();\n\n\tresult_lambda_ft205 = sc_lbdExp205.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft205 = kermeta.standard.helper.BooleanWrapper.or(test_ft205, result_lambda_ft205);\n}\n\t}\n}\n\n\n\tresult_ft205 = test_ft205;\n//EIft:exists\njava.lang.Boolean idIfCond_910 = false;\n\tidIfCond_910 = kermeta.standard.helper.BooleanWrapper.not(result_ft205);\n\n\tif( idIfCond_910 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft207 = null;\n\n\tkermeta.language.structure.Operation elem_ft207 = null;\n\n\tresult_ft207 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft207 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_913 = false;\n\twhile( !idLoopCond_913 ) {\n\tidLoopCond_913 = it_ft207.isOff();\n\tif ( idLoopCond_913 ) {\n\t} else {\n\n\telem_ft207 = it_ft207.next();\n\n\tjava.lang.Boolean idIfCond_914 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp207 = elem_ft207;\n\n\tjava.lang.Boolean idIfCond_915 = false;\n\tidIfCond_915 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp207.getName()), 4);\n\n\tif( idIfCond_915 ) {\n\n\tidIfCond_914 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp207.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_914 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_914 ) {\n\n\tresult_ft207.add(elem_ft207);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft206 = result_ft207.iterator();\n\tjava.lang.Boolean idLoopCond_912 = false;\n\twhile( !idLoopCond_912 ) {\n\tidLoopCond_912 = it_ft206.isOff();\n\tif ( idLoopCond_912 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp206 = it_ft206.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp206.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Run all the tests in the test suite\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft208 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_916 = false;\n\twhile( !idLoopCond_916 ) {\n\tidLoopCond_916 = it_ft208.isOff();\n\tif ( idLoopCond_916 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp208 = it_ft208.next();\n\n\tt_lbdExp208.setLogKermeta(this.getLog());\n\n\tt_lbdExp208.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * to be written #####################################################\r\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft210 = null;\n\n\tkermeta.language.structure.Operation elem_ft210 = null;\n\n\tresult_ft210 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft210 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_918 = false;\n\twhile( !idLoopCond_918 ) {\n\tidLoopCond_918 = it_ft210.isOff();\n\tif ( idLoopCond_918 ) {\n\t} else {\n\n\telem_ft210 = it_ft210.next();\n\n\tjava.lang.Boolean idIfCond_919 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp210 = elem_ft210;\n\n\tjava.lang.Boolean idIfCond_920 = false;\n\tidIfCond_920 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp210.getName()), 4);\n\n\tif( idIfCond_920 ) {\n\n\tidIfCond_919 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp210.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_919 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_919 ) {\n\n\tresult_ft210.add(elem_ft210);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft209 = result_ft210.iterator();\n\tjava.lang.Boolean idLoopCond_917 = false;\n\twhile( !idLoopCond_917 ) {\n\tidLoopCond_917 = it_ft209.isOff();\n\tif ( idLoopCond_917 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp209 = it_ft209.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp209.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
