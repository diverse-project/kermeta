/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestCase.java,v 1.8 2008-11-07 08:53:45 cfaucher Exp $
 */
package kermeta.kunit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.kunit.TestCase#get__testMethodName <em>test Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.kunit.KunitPackage#getTestCase()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * A test case comprises one or more test methods plus\r\n * setUp and tearDown that build and destroy their test harness.\r\n * An instance of a subclass of TestCase should have its\r\n * testMethodName set to the name of one of its operations\r\n * which should be called whe the test is run. You can do this\r\n * yourself:\r\n *\r\n * var testCase : TestCase init MyTestCaseClass.new.setTestMethodName(\"testSomething\")\r\n *\r\n * Alternatively if your TestCase Class has many methods whose\r\n * name begins with \'test\' you can create a set of instaces already\r\n * set up with their testMethodName using the addAllTestCasesFrom\r\n * operation on TestSuite\r\n \052/'"
 * @generated
 */
public interface TestCase extends Test, Fallible {
	/**
	 * Returns the value of the '<em><b>test Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>test Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>test Method Name</em>' attribute.
	 * @see #set__testMethodName(String)
	 * @see kermeta.kunit.KunitPackage#getTestCase___testMethodName()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * the name of the method which corresponds to the test case in the test class\r\n\t \052/'"
	 * @generated
	 */
	String get__testMethodName();

	/**
	 * Sets the value of the '{@link kermeta.kunit.TestCase#get__testMethodName <em>test Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>test Method Name</em>' attribute.
	 * @see #get__testMethodName()
	 * @generated
	 */
	void set__testMethodName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * operation used when the TestCase is run from a java test runner, encapsulates the failures results\r\n\t * into an AssertionFailedError so the TestRunner can detect it\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tjava.lang.String msg = \"\";\n\n\tjava.lang.Boolean idIfCond_980 = false;\n\tidIfCond_980 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).empty());\n\n\tif( idIfCond_980 ) {\n\n\tmsg = \"Failures: \";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Failure> it_ft217 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Failure>convertAsOrderedSet(this.getLog().getFailures()).iterator();\n\tjava.lang.Boolean idLoopCond_981 = false;\n\twhile( !idLoopCond_981 ) {\n\tidLoopCond_981 = it_ft217.isOff();\n\tif ( idLoopCond_981 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Failure f_lbdExp217 = it_ft217.next();\n\n\tmsg = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(msg, \"\\n   \"), f_lbdExp217.toString());\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\tkermeta.kunit.AssertionFailedError exception = ((kermeta.kunit.AssertionFailedError) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.kunit.AssertionFailedError\"));\n\n\texception.setMessage(msg);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_982 = false;\n\tidIfCond_982 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).empty());\n\n\tif( idIfCond_982 ) {\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.kunit.Error> it_ft218 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.kunit.Error>convertAsOrderedSet(this.getLog().getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_983 = false;\n\twhile( !idLoopCond_983 ) {\n\tidLoopCond_983 = it_ft218.isOff();\n\tif ( idLoopCond_983 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.kunit.Error f_lbdExp218 = it_ft218.next();\n\n\tmsg = \"Errors: \";\n\n\tmsg = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(msg, \"\\n   \"), f_lbdExp218.toString());\n\n\tkermeta.exceptions.Exception exception = ((kermeta.exceptions.Exception) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.Exception\"));\n\n\texception.setMessage(msg);\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( exception );\n\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n}\n\n'"
	 * @generated
	 */
	void raiseIfHasFailures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * the things to be done before execution of the test method\r\n\t * (designed to be overwritten in real TestCase classes) \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void setUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="kermeta documentation='/**\r\n\t * accessor on the log\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Fallible'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.Log result = null;\n\n\tresult = this.getLog();\n\nreturn result;\n'"
	 * @generated
	 */
	Log getLog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Sets the name of the method from the concrete subclass of\r\n\t *  TestCase that should be executed when this TestCase instance\r\n\t * is run as a test.\r\n\t * Throws invalidTestCaseNameException if the given string is not\r\n\t * the name of a method in the test case\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.kunit.TestCase result = null;\n\n\tthis.set__testMethodName(name);\n\n\tresult = this;\n\nreturn result;\n'"
	 * @generated
	 */
	TestCase setTestMethodName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * accessor on the method name\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = this.get__testMethodName();\n\nreturn result;\n'"
	 * @generated
	 */
	String getTestMethodName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * overwrites the default method for more informative output\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getterName(), \".\"), this.getTestMethodName()), \"()\");\n\nreturn result;\n'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Execute the whole test case : SetUp, test method, TearDown\r\n\t * The assertions of the test method are computed\r\n\t \052/'"
	 *        annotation="kermeta superOperation='kermeta::kunit::Test'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.getLog().newAttempt();\n\n\t{\ntry {\n\tthis.setUp();\n\n\t{\ntry {\n\tkermeta.interpreter.DynamicExpression de = ((kermeta.interpreter.DynamicExpression) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.interpreter.DynamicExpression\"));\n\n\tde.initializeDefaults();\n\n\tde.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().<kermeta.language.structure.ClassDefinition>asTypeOrVoid(org.kermeta.compil.runtime.helper.language.ObjectUtil.getMetaClassSwitcher(this).getTypeDefinition()));\n\n\tde.parse(kermeta.standard.helper.StringWrapper.plus(\"self.\", this.getTestMethodName()));\n\n\tde.execute(this, ((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Object>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Object>\")));\n\n\t{\ntry {\n\tthis.tearDown();\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_1 ) {\nif( ex_switcher_1.getRealException() instanceof kermeta.exceptions.Exception ) {\nkermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_1.getRealException();\nthis.getLog().addTearDownError(this, e);\n}\n}\n}\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_2 ) {\nif( ex_switcher_2.getRealException() instanceof kermeta.kunit.AssertionFailedError ) {\nkermeta.kunit.AssertionFailedError afe = (kermeta.kunit.AssertionFailedError) ex_switcher_2.getRealException();\nthis.getLog().addFailure(this, kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(afe.getMessage(), \"\\nstack trace:\\n\"), afe.getStackTrace()));\n}if( ex_switcher_2.getRealException() instanceof kermeta.exceptions.Exception ) {\nkermeta.exceptions.Exception e1 = (kermeta.exceptions.Exception) ex_switcher_2.getRealException();\nthis.getLog().addTestError(this, e1);{\ntry {\n\tthis.tearDown();\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_3 ) {\nif( ex_switcher_3.getRealException() instanceof kermeta.exceptions.Exception ) {\nkermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_3.getRealException();\nthis.getLog().addTearDownError(this, e);\n}\n}\n}\n}\n}\n}\n} catch( org.kermeta.compil.runtime.helper.error.KRuntimeError ex_switcher_4 ) {\nif( ex_switcher_4.getRealException() instanceof kermeta.exceptions.Exception ) {\nkermeta.exceptions.Exception e = (kermeta.exceptions.Exception) ex_switcher_4.getRealException();\nthis.getLog().addSetUpError(this, e);\n}\n}\n}\n'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * the things to be done after execution of the test method\r\n\t * (designed to be overwritten in real TestCase classes) \r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void tearDown();

} // TestCase
