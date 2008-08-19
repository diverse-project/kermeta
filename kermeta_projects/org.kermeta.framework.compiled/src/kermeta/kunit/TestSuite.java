/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.2 2008-08-19 13:22:55 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//Beginning of the Inlining of the function type: exists\n\njava.lang.Boolean result_ft1 = null;\n\n\tjava.lang.Boolean test_ft1 = false;\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft1 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_33 = false;\n\twhile( !idLoopCond_33 ) {\n\tidLoopCond_33 = kermeta.standard.helper.BooleanWrapper.or(it_ft1.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft1, false));;\n\tif ( idLoopCond_33 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Class sc = it_ft1.next();\n\n\tresult_lambda = sc.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//End of the Inlining of the lambda expression: func\n\n\ttest_ft1 = kermeta.standard.helper.BooleanWrapper.or(test_ft1, result_lambda);\n}\n\t}\n\n\tresult_ft1 = test_ft1;\n//End of the Inlining of the function type: exists\njava.lang.Boolean idIfCond_32 = false;\n\tidIfCond_32 = kermeta.standard.helper.BooleanWrapper.not(result_ft1);\n\n\tif( idIfCond_32 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft3 = null;\n\n\tkermeta.language.structure.Operation elem_ft3 = null;\n\n\tresult_ft3 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft3 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(testCaseClass.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_35 = false;\n\twhile( !idLoopCond_35 ) {\n\tidLoopCond_35 = it_ft3.isOff();;\n\tif ( idLoopCond_35 ) {\n\t} else {\n\n\telem_ft3 = it_ft3.next();\n\n\tjava.lang.Boolean idIfCond_36 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Operation o = elem_ft3;\n\n\tjava.lang.Boolean idIfCond_37 = false;\n\tidIfCond_37 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o.getName()), 4);\n\n\tif( idIfCond_37 ) {\n\n\tidIfCond_36 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_36 = false;\n}\n\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_36 ) {\n\n\tresult_ft3.add(elem_ft3);\n}\n\n}\n\t}\n//End of the Inlining of the function type: select\n//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft2 = result_ft3.iterator();\n\tjava.lang.Boolean idLoopCond_34 = false;\n\twhile( !idLoopCond_34 ) {\n\tidLoopCond_34 = it_ft2.isOff();;\n\tif ( idLoopCond_34 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Operation o = it_ft2.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Run all the tests in the test suite\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft4 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_38 = false;\n\twhile( !idLoopCond_38 ) {\n\tidLoopCond_38 = it_ft4.isOff();;\n\tif ( idLoopCond_38 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.kunit.Test t = it_ft4.next();\n\n\tt.setLogKermeta(this.getLog());\n\n\tt.run();\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * to be written #####################################################\r\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft6 = null;\n\n\tkermeta.language.structure.Operation elem_ft6 = null;\n\n\tresult_ft6 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft6 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_40 = false;\n\twhile( !idLoopCond_40 ) {\n\tidLoopCond_40 = it_ft6.isOff();;\n\tif ( idLoopCond_40 ) {\n\t} else {\n\n\telem_ft6 = it_ft6.next();\n\n\tjava.lang.Boolean idIfCond_41 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Operation o = elem_ft6;\n\n\tjava.lang.Boolean idIfCond_42 = false;\n\tidIfCond_42 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o.getName()), 4);\n\n\tif( idIfCond_42 ) {\n\n\tidIfCond_41 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_41 = false;\n}\n\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_41 ) {\n\n\tresult_ft6.add(elem_ft6);\n}\n\n}\n\t}\n//End of the Inlining of the function type: select\n//Beginning of the Inlining of the function type: each\n\n\t\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft5 = result_ft6.iterator();\n\tjava.lang.Boolean idLoopCond_39 = false;\n\twhile( !idLoopCond_39 ) {\n\tidLoopCond_39 = it_ft5.isOff();;\n\tif ( idLoopCond_39 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Operation o = it_ft5.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
