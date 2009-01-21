/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.10 2009-01-21 09:16:00 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__28119__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft194 = null;\n\n\tjava.lang.Boolean test_ft194 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft194 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_914 = false;\n\twhile( !idLoopCond_914 ) {\n\tidLoopCond_914 = kermeta.standard.helper.BooleanWrapper.or(it_ft194.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft194, false));\n\tif ( idLoopCond_914 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft194 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp194 = it_ft194.next();\n\n\tresult_lambda_ft194 = sc_lbdExp194.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft194 = kermeta.standard.helper.BooleanWrapper.or(test_ft194, result_lambda_ft194);\n}\n\t}\n}\n\n\n\tresult_ft194 = test_ft194;\n//EIft:exists\njava.lang.Boolean idIfCond_913 = false;\n\tidIfCond_913 = kermeta.standard.helper.BooleanWrapper.not(result_ft194);\n\n\tif( idIfCond_913 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getInvalidParameterException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft196 = null;\n\n\tkermeta.language.structure.Operation elem_ft196 = null;\n\n\tresult_ft196 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft196 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_916 = false;\n\twhile( !idLoopCond_916 ) {\n\tidLoopCond_916 = it_ft196.isOff();\n\tif ( idLoopCond_916 ) {\n\t} else {\n\n\telem_ft196 = it_ft196.next();\n\n\tjava.lang.Boolean idIfCond_917 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp196 = elem_ft196;\n\n\tjava.lang.Boolean idIfCond_918 = false;\n\tidIfCond_918 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp196.getName()), 4);\n\n\tif( idIfCond_918 ) {\n\n\tidIfCond_917 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp196.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_917 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_917 ) {\n\n\tresult_ft196.add(elem_ft196);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft195 = result_ft196.iterator();\n\tjava.lang.Boolean idLoopCond_915 = false;\n\twhile( !idLoopCond_915 ) {\n\tidLoopCond_915 = it_ft195.isOff();\n\tif ( idLoopCond_915 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp195 = it_ft195.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp195.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft197 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_919 = false;\n\twhile( !idLoopCond_919 ) {\n\tidLoopCond_919 = it_ft197.isOff();\n\tif ( idLoopCond_919 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp197 = it_ft197.next();\n\n\tt_lbdExp197.setLogKermeta(this.getLog());\n\n\tt_lbdExp197.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft199 = null;\n\n\tkermeta.language.structure.Operation elem_ft199 = null;\n\n\tresult_ft199 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft199 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_921 = false;\n\twhile( !idLoopCond_921 ) {\n\tidLoopCond_921 = it_ft199.isOff();\n\tif ( idLoopCond_921 ) {\n\t} else {\n\n\telem_ft199 = it_ft199.next();\n\n\tjava.lang.Boolean idIfCond_922 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp199 = elem_ft199;\n\n\tjava.lang.Boolean idIfCond_923 = false;\n\tidIfCond_923 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp199.getName()), 4);\n\n\tif( idIfCond_923 ) {\n\n\tidIfCond_922 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp199.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_922 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_922 ) {\n\n\tresult_ft199.add(elem_ft199);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft198 = result_ft199.iterator();\n\tjava.lang.Boolean idLoopCond_920 = false;\n\twhile( !idLoopCond_920 ) {\n\tidLoopCond_920 = it_ft198.isOff();\n\tif ( idLoopCond_920 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp198 = it_ft198.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp198.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
