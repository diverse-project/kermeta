/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.2 2008-09-11 12:34:48 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\n * A TestSuite is a structured collection of tests, using the\n * composite pattern, all tests are runnable and have a log\n * In addition a suite can be populated automatically from a\n * test case class with one test case object for each test\n * method in the class.\n *  You can make a suite and populate it manually like this:\n *\n *  var suite : TestSuite init TestSuite.new.\n *  suite.tests.add(t1)\n *\n *  Alternatively you can populate a suite automatically from\n *  a class that inherits TestCase and which has several methods\n *  called test:\n *\n *  var suite : TestSuite init TestSuite.new.addAllTestCasesFrom(InterestingTestCaseSet)\n \052/'"
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
	 * @model annotation="kermeta documentation='/**\n\t * The collection of tests which will be ran as the suite\n\t \052/'"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * Add to this suite, a set of test cases of type c, one for each\n\t  * test method in class c. C must be a descendent of TestCase\n\t  \052/'"
	 *        annotation="kermeta.pre testCaseClassIsATestCase=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//BIft:exists\n\njava.lang.Boolean result_ft158 = null;\n\n\tjava.lang.Boolean test_ft158 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft158 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_824 = false;\n\twhile( !idLoopCond_824 ) {\n\tidLoopCond_824 = kermeta.standard.helper.BooleanWrapper.or(it_ft158.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft158, false));\n\tif ( idLoopCond_824 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp158 = it_ft158.next();\n\n\tresult_lambda = sc_lbdExp158.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft158 = kermeta.standard.helper.BooleanWrapper.or(test_ft158, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft158 = test_ft158;\n//EIft:exists\njava.lang.Boolean idIfCond_823 = false;\n\tidIfCond_823 = kermeta.standard.helper.BooleanWrapper.not(result_ft158);\n\n\tif( idIfCond_823 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft160 = null;\n\n\tkermeta.language.structure.Operation elem_ft160 = null;\n\n\tresult_ft160 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft160 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_826 = false;\n\twhile( !idLoopCond_826 ) {\n\tidLoopCond_826 = it_ft160.isOff();\n\tif ( idLoopCond_826 ) {\n\t} else {\n\n\telem_ft160 = it_ft160.next();\n\n\tjava.lang.Boolean idIfCond_827 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp160 = elem_ft160;\n\n\tjava.lang.Boolean idIfCond_828 = false;\n\tidIfCond_828 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp160.getName()), 4);\n\n\tif( idIfCond_828 ) {\n\n\tidIfCond_827 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp160.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_827 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_827 ) {\n\n\tresult_ft160.add(elem_ft160);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft159 = result_ft160.iterator();\n\tjava.lang.Boolean idLoopCond_825 = false;\n\twhile( !idLoopCond_825 ) {\n\tidLoopCond_825 = it_ft159.isOff();\n\tif ( idLoopCond_825 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp159 = it_ft159.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp159.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft161 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_829 = false;\n\twhile( !idLoopCond_829 ) {\n\tidLoopCond_829 = it_ft161.isOff();\n\tif ( idLoopCond_829 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp161 = it_ft161.next();\n\n\tt_lbdExp161.setLogKermeta(this.getLog());\n\n\tt_lbdExp161.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft163 = null;\n\n\tkermeta.language.structure.Operation elem_ft163 = null;\n\n\tresult_ft163 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft163 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_831 = false;\n\twhile( !idLoopCond_831 ) {\n\tidLoopCond_831 = it_ft163.isOff();\n\tif ( idLoopCond_831 ) {\n\t} else {\n\n\telem_ft163 = it_ft163.next();\n\n\tjava.lang.Boolean idIfCond_832 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp163 = elem_ft163;\n\n\tjava.lang.Boolean idIfCond_833 = false;\n\tidIfCond_833 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp163.getName()), 4);\n\n\tif( idIfCond_833 ) {\n\n\tidIfCond_832 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp163.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_832 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_832 ) {\n\n\tresult_ft163.add(elem_ft163);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft162 = result_ft163.iterator();\n\tjava.lang.Boolean idLoopCond_830 = false;\n\twhile( !idLoopCond_830 ) {\n\tidLoopCond_830 = it_ft162.isOff();\n\tif ( idLoopCond_830 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp162 = it_ft162.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o_lbdExp162.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
