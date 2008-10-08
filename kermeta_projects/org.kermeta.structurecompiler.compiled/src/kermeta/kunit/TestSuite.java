/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.4 2008-10-08 14:37:46 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft217 = null;\n\n\tjava.lang.Boolean test_ft217 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_979 = false;\n\twhile( !idLoopCond_979 ) {\n\tidLoopCond_979 = kermeta.standard.helper.BooleanWrapper.or(it_ft217.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft217, false));\n\tif ( idLoopCond_979 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft217 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp217 = it_ft217.next();\n\n\tresult_lambda_ft217 = sc_lbdExp217.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft217 = kermeta.standard.helper.BooleanWrapper.or(test_ft217, result_lambda_ft217);\n}\n\t}\n}\n\n\n\tresult_ft217 = test_ft217;\n//EIft:exists\njava.lang.Boolean idIfCond_978 = false;\n\tidIfCond_978 = kermeta.standard.helper.BooleanWrapper.not(result_ft217);\n\n\tif( idIfCond_978 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft219 = null;\n\n\tkermeta.language.structure.Operation elem_ft219 = null;\n\n\tresult_ft219 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft219 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_981 = false;\n\twhile( !idLoopCond_981 ) {\n\tidLoopCond_981 = it_ft219.isOff();\n\tif ( idLoopCond_981 ) {\n\t} else {\n\n\telem_ft219 = it_ft219.next();\n\n\tjava.lang.Boolean idIfCond_982 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp219 = elem_ft219;\n\n\tjava.lang.Boolean idIfCond_983 = false;\n\tidIfCond_983 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp219.getName()), 4);\n\n\tif( idIfCond_983 ) {\n\n\tidIfCond_982 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp219.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_982 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_982 ) {\n\n\tresult_ft219.add(elem_ft219);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft218 = result_ft219.iterator();\n\tjava.lang.Boolean idLoopCond_980 = false;\n\twhile( !idLoopCond_980 ) {\n\tidLoopCond_980 = it_ft218.isOff();\n\tif ( idLoopCond_980 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp218 = it_ft218.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp218.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Run all the tests in the test suite\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft220 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_984 = false;\n\twhile( !idLoopCond_984 ) {\n\tidLoopCond_984 = it_ft220.isOff();\n\tif ( idLoopCond_984 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp220 = it_ft220.next();\n\n\tt_lbdExp220.setLogKermeta(this.getLog());\n\n\tt_lbdExp220.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * to be written #####################################################\r\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft222 = null;\n\n\tkermeta.language.structure.Operation elem_ft222 = null;\n\n\tresult_ft222 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft222 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_986 = false;\n\twhile( !idLoopCond_986 ) {\n\tidLoopCond_986 = it_ft222.isOff();\n\tif ( idLoopCond_986 ) {\n\t} else {\n\n\telem_ft222 = it_ft222.next();\n\n\tjava.lang.Boolean idIfCond_987 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp222 = elem_ft222;\n\n\tjava.lang.Boolean idIfCond_988 = false;\n\tidIfCond_988 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp222.getName()), 4);\n\n\tif( idIfCond_988 ) {\n\n\tidIfCond_987 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp222.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_987 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_987 ) {\n\n\tresult_ft222.add(elem_ft222);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft221 = result_ft222.iterator();\n\tjava.lang.Boolean idLoopCond_985 = false;\n\twhile( !idLoopCond_985 ) {\n\tidLoopCond_985 = it_ft221.isOff();\n\tif ( idLoopCond_985 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp221 = it_ft221.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp221.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
