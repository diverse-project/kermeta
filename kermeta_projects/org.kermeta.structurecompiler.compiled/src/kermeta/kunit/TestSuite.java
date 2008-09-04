/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestSuite.java,v 1.1 2008-09-04 15:40:30 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestSuite result = null;\n\n\t//Beginning of the Inlining of the function type: exists\n\njava.lang.Boolean result_ft152 = null;\n\n\tjava.lang.Boolean test_ft152 = false;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Class> it_ft152 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Class>convertAsOrderedSet(testCaseClass.getSuperClass()).iterator();\n\tjava.lang.Boolean idLoopCond_730 = false;\n\twhile( !idLoopCond_730 ) {\n\tidLoopCond_730 = kermeta.standard.helper.BooleanWrapper.or(it_ft152.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(test_ft152, false));\n\tif ( idLoopCond_730 ) {\n\t} else {\n\njava.lang.Boolean result_lambda = null;\n//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Class sc = it_ft152.next();\n\n\tresult_lambda = sc.equals(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.kunit.TestCase\"));\n//End of the Inlining of the lambda expression: func\n\n\ttest_ft152 = kermeta.standard.helper.BooleanWrapper.or(test_ft152, result_lambda);\n}\n\t}\n}\n\n\n\tresult_ft152 = test_ft152;\n//End of the Inlining of the function type: exists\njava.lang.Boolean idIfCond_729 = false;\n\tidIfCond_729 = kermeta.standard.helper.BooleanWrapper.not(result_ft152);\n\n\tif( idIfCond_729 ) {\n\n\tkermeta.exceptions.Exception e = ((kermeta.kunit.InvalidParameterException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.InvalidParameterException\"));\n\n\te.setMessage(kermeta.standard.helper.StringWrapper.plus(\"Cannot build a suite from class: \", testCaseClass.getName()));\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft154 = null;\n\n\tkermeta.language.structure.Operation elem_ft154 = null;\n\n\tresult_ft154 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft154 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(testCaseClass.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_732 = false;\n\twhile( !idLoopCond_732 ) {\n\tidLoopCond_732 = it_ft154.isOff();\n\tif ( idLoopCond_732 ) {\n\t} else {\n\n\telem_ft154 = it_ft154.next();\n\n\tjava.lang.Boolean idIfCond_733 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Operation o = elem_ft154;\n\n\tjava.lang.Boolean idIfCond_734 = false;\n\tidIfCond_734 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o.getName()), 4);\n\n\tif( idIfCond_734 ) {\n\n\tidIfCond_733 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_733 = false;\n}\n\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_733 ) {\n\n\tresult_ft154.add(elem_ft154);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\n//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft153 = result_ft154.iterator();\n\tjava.lang.Boolean idLoopCond_731 = false;\n\twhile( !idLoopCond_731 ) {\n\tidLoopCond_731 = it_ft153.isOff();\n\tif ( idLoopCond_731 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Operation o = it_ft153.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestSuite addAllTestCasesFrom(kermeta.language.structure.Class testCaseClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/** \n\t * Run all the tests in the test suite\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Test> it_ft155 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).iterator();\n\tjava.lang.Boolean idLoopCond_735 = false;\n\twhile( !idLoopCond_735 ) {\n\tidLoopCond_735 = it_ft155.isOff();\n\tif ( idLoopCond_735 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.kunit.Test t = it_ft155.next();\n\n\tt.setLogKermeta(this.getLog());\n\n\tt.run();\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t  * to be written #####################################################\n\t  \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t//Beginning of the Inlining of the function type: select\n\nkermeta.standard.Sequence<kermeta.language.structure.Operation> result_ft157 = null;\n\n\tkermeta.language.structure.Operation elem_ft157 = null;\n\n\tresult_ft157 = ((kermeta.standard.Sequence<kermeta.language.structure.Operation>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Sequence<kermeta.language.structure.Operation>\"));\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft157 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(anAspect.getOwnedOperation()).iterator();\n\tjava.lang.Boolean idLoopCond_737 = false;\n\twhile( !idLoopCond_737 ) {\n\tidLoopCond_737 = it_ft157.isOff();\n\tif ( idLoopCond_737 ) {\n\t} else {\n\n\telem_ft157 = it_ft157.next();\n\n\tjava.lang.Boolean idIfCond_738 = false;\n//Beginning of the Inlining of the lambda expression: selector\nkermeta.language.structure.Operation o = elem_ft157;\n\n\tjava.lang.Boolean idIfCond_739 = false;\n\tidIfCond_739 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(kermeta.standard.helper.StringWrapper.size(o.getName()), 4);\n\n\tif( idIfCond_739 ) {\n\n\tidIfCond_738 = kermeta.standard.helper.StringWrapper.equals(kermeta.standard.helper.StringWrapper.substring(o.getName(), 0, 4), \"test\");\n}\n else {\n\n\tidIfCond_738 = false;\n}\n\n//End of the Inlining of the lambda expression: selector\n\n\n\tif( idIfCond_738 ) {\n\n\tresult_ft157.add(elem_ft157);\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: select\n//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft156 = result_ft157.iterator();\n\tjava.lang.Boolean idLoopCond_736 = false;\n\twhile( !idLoopCond_736 ) {\n\tidLoopCond_736 = it_ft156.isOff();\n\tif ( idLoopCond_736 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.structure.Operation o = it_ft156.next();\n\n\tkermeta.kunit.TestCase testCase = null;\n\n\ttestCase = (kermeta.kunit.TestCase) testCaseClass._new();\n\n\ttestCase.setTestMethodName(o.getName());\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Test>convertAsOrderedSet(this.getTests()).add(testCase);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n'"
	 * @generated
	 */
	void addAllTestCasesFromAspects(
			kermeta.language.structure.Class testCaseClass,
			ClassDefinition anAspect);

} // TestSuite
