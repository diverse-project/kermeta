/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.5 2008-10-16 13:18:04 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft228 = null;\n\n\tjava.lang.Boolean test_ft228 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft228 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_1024 = false;\n\twhile( !idLoopCond_1024 ) {\n\tidLoopCond_1024 = kermeta.standard.helper.BooleanWrapper.or(it_ft228.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft228, false));\n\tif ( idLoopCond_1024 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft228 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp228 = it_ft228.next();\n\n\tresult_lambda_ft228 = sc_lbdExp228.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft228 = kermeta.standard.helper.BooleanWrapper.or(test_ft228, result_lambda_ft228);\n}\n\t}\n}\n\n\n\tresult_ft228 = test_ft228;\n//EIft:exists\njava.lang.Boolean idIfCond_1023 = false;\n\tidIfCond_1023 = kermeta.standard.helper.BooleanWrapper.not(result_ft228);\n\n\tif( idIfCond_1023 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft230 = null;\n\n\tkermeta.language.structure.Operation elem_ft230 = null;\n\n\tresult_ft230 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft230 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_1026 = false;\n\twhile( !idLoopCond_1026 ) {\n\tidLoopCond_1026 = it_ft230.isOff();\n\tif ( idLoopCond_1026 ) {\n\t} else {\n\n\telem_ft230 = it_ft230.next();\n\n\tjava.lang.Boolean idIfCond_1027 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp230 = elem_ft230;\n\n\tjava.lang.Boolean idIfCond_1028 = false;\n\tidIfCond_1028 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp230.getName()), 4);\n\n\tif( idIfCond_1028 ) {\n\n\tidIfCond_1027 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp230.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_1027 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_1027 ) {\n\n\tresult_ft230.add(elem_ft230);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft229 = result_ft230.iterator();\n\tjava.lang.Boolean idLoopCond_1025 = false;\n\twhile( !idLoopCond_1025 ) {\n\tidLoopCond_1025 = it_ft229.isOff();\n\tif ( idLoopCond_1025 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp229 = it_ft229.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp229.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Run all the tests in the test suite\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft231 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_1029 = false;\n\twhile( !idLoopCond_1029 ) {\n\tidLoopCond_1029 = it_ft231.isOff();\n\tif ( idLoopCond_1029 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp231 = it_ft231.next();\n\n\tt_lbdExp231.setLogKermeta(this.getLog());\n\n\tt_lbdExp231.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * to be written #####################################################\r\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft233 = null;\n\n\tkermeta.language.structure.Operation elem_ft233 = null;\n\n\tresult_ft233 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft233 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_1031 = false;\n\twhile( !idLoopCond_1031 ) {\n\tidLoopCond_1031 = it_ft233.isOff();\n\tif ( idLoopCond_1031 ) {\n\t} else {\n\n\telem_ft233 = it_ft233.next();\n\n\tjava.lang.Boolean idIfCond_1032 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp233 = elem_ft233;\n\n\tjava.lang.Boolean idIfCond_1033 = false;\n\tidIfCond_1033 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp233.getName()), 4);\n\n\tif( idIfCond_1033 ) {\n\n\tidIfCond_1032 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp233.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_1032 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_1032 ) {\n\n\tresult_ft233.add(elem_ft233);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft232 = result_ft233.iterator();\n\tjava.lang.Boolean idLoopCond_1030 = false;\n\twhile( !idLoopCond_1030 ) {\n\tidLoopCond_1030 = it_ft232.isOff();\n\tif ( idLoopCond_1030 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp232 = it_ft232.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp232.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
