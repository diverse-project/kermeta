/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: TestSuite.java,v 1.12 2009-02-23 15:26:50 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__30663__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft203 = null;\n\n\tjava.lang.Boolean test_ft203 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft203 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_966 = false;\n\twhile( !idLoopCond_966 ) {\n\tidLoopCond_966 = kermeta.standard.helper.BooleanWrapper.or(it_ft203.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft203, false));\n\tif ( idLoopCond_966 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft203 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp203 = it_ft203.next();\n\n\tresult_lambda_ft203 = org.kermeta.compil.runtime.helper.language.ClassUtil.equalsSwitcher(sc_lbdExp203, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft203 = kermeta.standard.helper.BooleanWrapper.or(test_ft203, result_lambda_ft203);\n}\n\t}\n}\n\n\n\tresult_ft203 = test_ft203;\n//EIft:exists\njava.lang.Boolean idIfCond_965 = false;\n\tidIfCond_965 = kermeta.standard.helper.BooleanWrapper.not(result_ft203);\n\n\tif( idIfCond_965 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.kunit.KunitPackage.eINSTANCE.getInvalidParameterException()));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft205 = null;\n\n\tkermeta.language.structure.Operation elem_ft205 = null;\n\n\tresult_ft205 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_968 = false;\n\twhile( !idLoopCond_968 ) {\n\tidLoopCond_968 = it_ft205.isOff();\n\tif ( idLoopCond_968 ) {\n\t} else {\n\n\telem_ft205 = it_ft205.next();\n\n\tjava.lang.Boolean idIfCond_969 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp205 = elem_ft205;\n\n\tjava.lang.Boolean idIfCond_970 = false;\n\tidIfCond_970 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp205.getName()), 4);\n\n\tif( idIfCond_970 ) {\n\n\tidIfCond_969 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp205.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_969 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_969 ) {\n\n\tresult_ft205.add(elem_ft205);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft204 = result_ft205.iterator();\n\tjava.lang.Boolean idLoopCond_967 = false;\n\twhile( !idLoopCond_967 ) {\n\tidLoopCond_967 = it_ft204.isOff();\n\tif ( idLoopCond_967 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp204 = it_ft204.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp204.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \r\n\t * Run all the tests in the test suite\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft206 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_971 = false;\n\twhile( !idLoopCond_971 ) {\n\tidLoopCond_971 = it_ft206.isOff();\n\tif ( idLoopCond_971 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp206 = it_ft206.next();\n\n\tt_lbdExp206.setLogEMF_renameAs(this.getLog());\n\n\tt_lbdExp206.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t  * to be written #####################################################\r\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft208 = null;\n\n\tkermeta.language.structure.Operation elem_ft208 = null;\n\n\tresult_ft208 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.standard.StandardPackage.eINSTANCE.getSequence()));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft208 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_973 = false;\n\twhile( !idLoopCond_973 ) {\n\tidLoopCond_973 = it_ft208.isOff();\n\tif ( idLoopCond_973 ) {\n\t} else {\n\n\telem_ft208 = it_ft208.next();\n\n\tjava.lang.Boolean idIfCond_974 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp208 = elem_ft208;\n\n\tjava.lang.Boolean idIfCond_975 = false;\n\tidIfCond_975 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp208.getName()), 4);\n\n\tif( idIfCond_975 ) {\n\n\tidIfCond_974 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp208.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_974 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_974 ) {\n\n\tresult_ft208.add(elem_ft208);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft207 = result_ft208.iterator();\n\tjava.lang.Boolean idLoopCond_972 = false;\n\twhile( !idLoopCond_972 ) {\n\tidLoopCond_972 = it_ft207.isOff();\n\tif ( idLoopCond_972 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp207 = it_ft207.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(testCaseClass._new(), \"kermeta.kunit.TestCase\");\n\n\ttestCase.setTestMethodName(o_lbdExp207.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
