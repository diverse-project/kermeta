/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.9 2008-11-27 15:50:05 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n//PreConditions Checking\n{\nif( org.kermeta.compil.runtime.ExecutionContext.getInstance().mustBeChecked( \"pre__13634005__testCaseClassIsATestCase\" ) ) {\njava.lang.Boolean result_pre = false;\n\n\tresult_pre = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).contains(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\nif( !result_pre ) {\nkermeta.exceptions.ConstraintViolatedPre exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedPre();\nthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError(exp);\n}\n}\n}\n\t//BIft:exists\n\njava.lang.Boolean result_ft169 = null;\n\n\tjava.lang.Boolean test_ft169 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft169 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getterSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_757 = false;\n\twhile( !idLoopCond_757 ) {\n\tidLoopCond_757 = kermeta.standard.helper.BooleanWrapper.or(it_ft169.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(test_ft169, false));\n\tif ( idLoopCond_757 ) {\n\t} else {\n\njava.lang.Boolean result_lambda_ft169 = null;\n//BIle:func\nkermeta.language.structure.Class sc_lbdExp169 = it_ft169.next();\n\n\tresult_lambda_ft169 = sc_lbdExp169.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//EIle:func\n\n\ttest_ft169 = kermeta.standard.helper.BooleanWrapper.or(test_ft169, result_lambda_ft169);\n}\n\t}\n}\n\n\n\tresult_ft169 = test_ft169;\n//EIft:exists\njava.lang.Boolean idIfCond_756 = false;\n\tidIfCond_756 = kermeta.standard.helper.BooleanWrapper.not(result_ft169);\n\n\tif( idIfCond_756 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getterName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft171 = null;\n\n\tkermeta.language.structure.Operation elem_ft171 = null;\n\n\tresult_ft171 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft171 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getterOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_759 = false;\n\twhile( !idLoopCond_759 ) {\n\tidLoopCond_759 = it_ft171.isOff();\n\tif ( idLoopCond_759 ) {\n\t} else {\n\n\telem_ft171 = it_ft171.next();\n\n\tjava.lang.Boolean idIfCond_760 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp171 = elem_ft171;\n\n\tjava.lang.Boolean idIfCond_761 = false;\n\tidIfCond_761 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp171.getName()), 4);\n\n\tif( idIfCond_761 ) {\n\n\tidIfCond_760 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp171.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_760 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_760 ) {\n\n\tresult_ft171.add(elem_ft171);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft170 = result_ft171.iterator();\n\tjava.lang.Boolean idLoopCond_758 = false;\n\twhile( !idLoopCond_758 ) {\n\tidLoopCond_758 = it_ft170.isOff();\n\tif ( idLoopCond_758 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp170 = it_ft170.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.kunit.TestCase>asTypeOrVoid(testCaseClass._new());\n\n\ttestCase.setTestMethodName(o_lbdExp170.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft172 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_762 = false;\n\twhile( !idLoopCond_762 ) {\n\tidLoopCond_762 = it_ft172.isOff();\n\tif ( idLoopCond_762 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Test t_lbdExp172 = it_ft172.next();\n\n\tt_lbdExp172.setLogKermeta(this.getLog());\n\n\tt_lbdExp172.run();\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//BIft:select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft174 = null;\n\n\tkermeta.language.structure.Operation elem_ft174 = null;\n\n\tresult_ft174 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft174 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_764 = false;\n\twhile( !idLoopCond_764 ) {\n\tidLoopCond_764 = it_ft174.isOff();\n\tif ( idLoopCond_764 ) {\n\t} else {\n\n\telem_ft174 = it_ft174.next();\n\n\tjava.lang.Boolean idIfCond_765 = false;\n//BIle:selector\nkermeta.language.structure.Operation o_lbdExp174 = elem_ft174;\n\n\tjava.lang.Boolean idIfCond_766 = false;\n\tidIfCond_766 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o_lbdExp174.getName()), 4);\n\n\tif( idIfCond_766 ) {\n\n\tidIfCond_765 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o_lbdExp174.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_765 = false;\n}\n\n//EIle:selector\n\n\n\tif( idIfCond_765 ) {\n\n\tresult_ft174.add(elem_ft174);\n}\n\n}\n\t}\n}\n\n//EIft:select\n//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft173 = result_ft174.iterator();\n\tjava.lang.Boolean idLoopCond_763 = false;\n\twhile( !idLoopCond_763 ) {\n\tidLoopCond_763 = it_ft173.isOff();\n\tif ( idLoopCond_763 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.structure.Operation o_lbdExp173 = it_ft173.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.kunit.TestCase>asTypeOrVoid(testCaseClass._new());\n\n\ttestCase.setTestMethodName(o_lbdExp173.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
