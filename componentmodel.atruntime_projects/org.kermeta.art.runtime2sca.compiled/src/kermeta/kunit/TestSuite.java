/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__3362103__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft83 = null;\n\n\tjava.lang.Boolean test_ft83 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_360 = false;\n\twhile( !idLoopCond_360 ) {\n\tidLoopCond_360 = kermeta.standard.helper.BooleanWrapper.or(it_ft83.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft83, false));\n\tif ( idLoopCond_360 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft83 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp83 = it_ft83.next();\n\n\tresult_lambda_ft83 = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(sc_lbdExp83, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft83 = kermeta.standard.helper.BooleanWrapper.or(test_ft83, result_lambda_ft83);\n}\n\t}\n}\n\n\n\tresult_ft83 = test_ft83;\n//EIft:exists\njava.lang.Boolean idIfCond_359 = false;\n\tidIfCond_359 = kermeta.standard.helper.BooleanWrapper.not(result_ft83);\n\n\tif( idIfCond_359 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getInvalidParameterException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft85 = null;\n\n\tkermeta.language.structure.Operation elem_ft85 = null;\n\n\tresult_ft85 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft85 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_362 = false;\n\twhile( !idLoopCond_362 ) {\n\tidLoopCond_362 = it_ft85.isOff();\n\tif ( idLoopCond_362 ) {\n\t} else {\n\n\telem_ft85 = it_ft85.next();\n\n\tjava.lang.Boolean idIfCond_363 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp85 = elem_ft85;\n\n\tjava.lang.Boolean idIfCond_364 = false;\n\tidIfCond_364 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp85.getName()), 4);\n\n\tif( idIfCond_364 ) {\n\n\tidIfCond_363 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp85.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_363 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_363 ) {\n\n\tresult_ft85.add(elem_ft85);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft84 = result_ft85.iterator();\n\tjava.lang.Boolean idLoopCond_361 = false;\n\twhile( !idLoopCond_361 ) {\n\tidLoopCond_361 = it_ft84.isOff();\n\tif ( idLoopCond_361 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp84 = it_ft84.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp84.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_365 = false;\n\twhile( !idLoopCond_365 ) {\n\tidLoopCond_365 = it_ft86.isOff();\n\tif ( idLoopCond_365 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp86 = it_ft86.next();\n\n\tt_lbdExp86.setLogEMF_renameAs(this.getLog());\n\n\tt_lbdExp86.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft88 = null;\n\n\tkermeta.language.structure.Operation elem_ft88 = null;\n\n\tresult_ft88 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_367 = false;\n\twhile( !idLoopCond_367 ) {\n\tidLoopCond_367 = it_ft88.isOff();\n\tif ( idLoopCond_367 ) {\n\t} else {\n\n\telem_ft88 = it_ft88.next();\n\n\tjava.lang.Boolean idIfCond_368 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp88 = elem_ft88;\n\n\tjava.lang.Boolean idIfCond_369 = false;\n\tidIfCond_369 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp88.getName()), 4);\n\n\tif( idIfCond_369 ) {\n\n\tidIfCond_368 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp88.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_368 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_368 ) {\n\n\tresult_ft88.add(elem_ft88);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft87 = result_ft88.iterator();\n\tjava.lang.Boolean idLoopCond_366 = false;\n\twhile( !idLoopCond_366 ) {\n\tidLoopCond_366 = it_ft87.isOff();\n\tif ( idLoopCond_366 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp87 = it_ft87.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp87.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
