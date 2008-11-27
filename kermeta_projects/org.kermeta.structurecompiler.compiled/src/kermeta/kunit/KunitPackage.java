/**
 * <copyright>
 * </copyright>
 *
 * $Id: KunitPackage.java,v 1.9 2008-11-27 15:50:05 cfaucher Exp $
 */
package kermeta.kunit;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kermeta.kunit.KunitFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/kunit'"
 *        annotation="kermeta documentation='/**\n * main features of the famous Unit test tool for Kermeta language\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/kunit_package.png\"/>\n \052/'"
 *        annotation="kermeta documentation='/**\n * Contains the implementation of a unit test tool. This is a clone of\n * JUnit architecture.\n * Reference : http://junit.sourceforge.net/doc/cookstour/cookstour.htm\n *\n * Usage example of kunit can be found in fr.irisa.triskell.kermeta.samples project.\n *\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/kunit_package.png\"/>\n \052/'"
 * @generated
 */
public interface KunitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kunit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/kunit/kermeta_temp_uri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KunitPackage eINSTANCE = kermeta.kunit.impl.KunitPackageImpl.init();

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.AbstractFallibleImpl <em>Abstract Fallible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.AbstractFallibleImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getAbstractFallible()
	 * @generated
	 */
	int ABSTRACT_FALLIBLE = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>Abstract Fallible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FALLIBLE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.AssertionFailedErrorImpl <em>Assertion Failed Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.AssertionFailedErrorImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getAssertionFailedError()
	 * @generated
	 */
	int ASSERTION_FAILED_ERROR = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__FILE = ExceptionsPackage.EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__TAG = ExceptionsPackage.EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__FILE_NAME = ExceptionsPackage.EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__LINE_NUMBER = ExceptionsPackage.EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__OID = ExceptionsPackage.EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__INTERNAL_CONTAINING_RESOURCE = ExceptionsPackage.EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Assertion Failed Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FAILED_ERROR_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.AssertImpl <em>Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.AssertImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getAssert()
	 * @generated
	 */
	int ASSERT = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__FILE = ABSTRACT_FALLIBLE__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__TAG = ABSTRACT_FALLIBLE__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__FILE_NAME = ABSTRACT_FALLIBLE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__LINE_NUMBER = ABSTRACT_FALLIBLE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__OWNED_TAGS = ABSTRACT_FALLIBLE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__OID = ABSTRACT_FALLIBLE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__INTERNAL_CONTAINING_RESOURCE = ABSTRACT_FALLIBLE__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The number of structural features of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FEATURE_COUNT = ABSTRACT_FALLIBLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.InvalidTestCaseNameExceptionImpl <em>Invalid Test Case Name Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.InvalidTestCaseNameExceptionImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getInvalidTestCaseNameException()
	 * @generated
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__FILE = ExceptionsPackage.EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__TAG = ExceptionsPackage.EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__FILE_NAME = ExceptionsPackage.EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__LINE_NUMBER = ExceptionsPackage.EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__OID = ExceptionsPackage.EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = ExceptionsPackage.EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Invalid Test Case Name Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TEST_CASE_NAME_EXCEPTION_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.InvalidParameterExceptionImpl <em>Invalid Parameter Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.InvalidParameterExceptionImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getInvalidParameterException()
	 * @generated
	 */
	int INVALID_PARAMETER_EXCEPTION = 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__FILE = ExceptionsPackage.EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__TAG = ExceptionsPackage.EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__FILE_NAME = ExceptionsPackage.EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__LINE_NUMBER = ExceptionsPackage.EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__OID = ExceptionsPackage.EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = ExceptionsPackage.EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Invalid Parameter Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMETER_EXCEPTION_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.FallibleImpl <em>Fallible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.FallibleImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getFallible()
	 * @generated
	 */
	int FALLIBLE = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__FILE = ABSTRACT_FALLIBLE__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__TAG = ABSTRACT_FALLIBLE__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__FILE_NAME = ABSTRACT_FALLIBLE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__LINE_NUMBER = ABSTRACT_FALLIBLE__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__OWNED_TAGS = ABSTRACT_FALLIBLE__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__OID = ABSTRACT_FALLIBLE__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__INTERNAL_CONTAINING_RESOURCE = ABSTRACT_FALLIBLE__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Stop On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__STOP_ON_FAILURE = ABSTRACT_FALLIBLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE__RANK = ABSTRACT_FALLIBLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fallible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLIBLE_FEATURE_COUNT = ABSTRACT_FALLIBLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.LogImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 6;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__FAILURES = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__ERRORS = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runtests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__RUNTESTS = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Harness Errors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__HARNESS_ERRORS = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.FailureImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 7;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__MESSAGE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FAILURE = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.ErrorImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 8;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ERROR = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXCEPTION = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__KIND = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.TestImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 9;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LOG = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.TestSuiteImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 10;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__FILE = TEST__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TAG = TEST__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__FILE_NAME = TEST__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__LINE_NUMBER = TEST__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__OWNED_TAGS = TEST__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__OID = TEST__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__INTERNAL_CONTAINING_RESOURCE = TEST__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__LOG = TEST__LOG;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TESTS = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.TestCaseImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 11;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__FILE = TEST__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TAG = TEST__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__FILE_NAME = TEST__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__LINE_NUMBER = TEST__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OWNED_TAGS = TEST__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OID = TEST__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__INTERNAL_CONTAINING_RESOURCE = TEST__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__LOG = TEST__LOG;

	/**
	 * The feature id for the '<em><b>Stop On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__STOP_ON_FAILURE = TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__RANK = TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>test Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_METHOD_NAME = TEST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = TEST_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kermeta.kunit.impl.TestRunnerImpl <em>Test Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.impl.TestRunnerImpl
	 * @see kermeta.kunit.impl.KunitPackageImpl#getTestRunner()
	 * @generated
	 */
	int TEST_RUNNER = 12;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER__LOG = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNER_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.kunit.ErrorKind <em>Error Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.kunit.ErrorKind
	 * @see kermeta.kunit.impl.KunitPackageImpl#getErrorKind()
	 * @generated
	 */
	int ERROR_KIND = 13;

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.AbstractFallible <em>Abstract Fallible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Fallible</em>'.
	 * @see kermeta.kunit.AbstractFallible
	 * @generated
	 */
	EClass getAbstractFallible();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.AssertionFailedError <em>Assertion Failed Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Failed Error</em>'.
	 * @see kermeta.kunit.AssertionFailedError
	 * @generated
	 */
	EClass getAssertionFailedError();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert</em>'.
	 * @see kermeta.kunit.Assert
	 * @generated
	 */
	EClass getAssert();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.InvalidTestCaseNameException <em>Invalid Test Case Name Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Test Case Name Exception</em>'.
	 * @see kermeta.kunit.InvalidTestCaseNameException
	 * @generated
	 */
	EClass getInvalidTestCaseNameException();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.InvalidParameterException <em>Invalid Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Parameter Exception</em>'.
	 * @see kermeta.kunit.InvalidParameterException
	 * @generated
	 */
	EClass getInvalidParameterException();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Fallible <em>Fallible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallible</em>'.
	 * @see kermeta.kunit.Fallible
	 * @generated
	 */
	EClass getFallible();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.Fallible#getStopOnFailure <em>Stop On Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop On Failure</em>'.
	 * @see kermeta.kunit.Fallible#getStopOnFailure()
	 * @see #getFallible()
	 * @generated
	 */
	EAttribute getFallible_StopOnFailure();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.Fallible#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see kermeta.kunit.Fallible#getRank()
	 * @see #getFallible()
	 * @generated
	 */
	EAttribute getFallible_Rank();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see kermeta.kunit.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the reference list '{@link kermeta.kunit.Log#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failures</em>'.
	 * @see kermeta.kunit.Log#getFailures()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Failures();

	/**
	 * Returns the meta object for the reference list '{@link kermeta.kunit.Log#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Errors</em>'.
	 * @see kermeta.kunit.Log#getErrors()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Errors();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.Log#getRuntests <em>Runtests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtests</em>'.
	 * @see kermeta.kunit.Log#getRuntests()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Runtests();

	/**
	 * Returns the meta object for the reference list '{@link kermeta.kunit.Log#getHarnessErrors <em>Harness Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Harness Errors</em>'.
	 * @see kermeta.kunit.Log#getHarnessErrors()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_HarnessErrors();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see kermeta.kunit.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.Failure#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see kermeta.kunit.Failure#getMessage()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_Message();

	/**
	 * Returns the meta object for the reference '{@link kermeta.kunit.Failure#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see kermeta.kunit.Failure#getFailure()
	 * @see #getFailure()
	 * @generated
	 */
	EReference getFailure_Failure();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see kermeta.kunit.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the reference '{@link kermeta.kunit.Error#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error</em>'.
	 * @see kermeta.kunit.Error#getError()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_Error();

	/**
	 * Returns the meta object for the reference '{@link kermeta.kunit.Error#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see kermeta.kunit.Error#getException()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_Exception();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.Error#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see kermeta.kunit.Error#getKind()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Kind();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see kermeta.kunit.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference '{@link kermeta.kunit.Test#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log</em>'.
	 * @see kermeta.kunit.Test#getLog()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Log();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see kermeta.kunit.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the reference list '{@link kermeta.kunit.TestSuite#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tests</em>'.
	 * @see kermeta.kunit.TestSuite#getTests()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_Tests();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see kermeta.kunit.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.kunit.TestCase#get__testMethodName <em>test Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>test Method Name</em>'.
	 * @see kermeta.kunit.TestCase#get__testMethodName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase___testMethodName();

	/**
	 * Returns the meta object for class '{@link kermeta.kunit.TestRunner <em>Test Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runner</em>'.
	 * @see kermeta.kunit.TestRunner
	 * @generated
	 */
	EClass getTestRunner();

	/**
	 * Returns the meta object for the containment reference '{@link kermeta.kunit.TestRunner#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log</em>'.
	 * @see kermeta.kunit.TestRunner#getLog()
	 * @see #getTestRunner()
	 * @generated
	 */
	EReference getTestRunner_Log();

	/**
	 * Returns the meta object for enum '{@link kermeta.kunit.ErrorKind <em>Error Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Kind</em>'.
	 * @see kermeta.kunit.ErrorKind
	 * @generated
	 */
	EEnum getErrorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KunitFactory getKunitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.AbstractFallibleImpl <em>Abstract Fallible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.AbstractFallibleImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getAbstractFallible()
		 * @generated
		 */
		EClass ABSTRACT_FALLIBLE = eINSTANCE.getAbstractFallible();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.AssertionFailedErrorImpl <em>Assertion Failed Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.AssertionFailedErrorImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getAssertionFailedError()
		 * @generated
		 */
		EClass ASSERTION_FAILED_ERROR = eINSTANCE.getAssertionFailedError();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.AssertImpl <em>Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.AssertImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getAssert()
		 * @generated
		 */
		EClass ASSERT = eINSTANCE.getAssert();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.InvalidTestCaseNameExceptionImpl <em>Invalid Test Case Name Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.InvalidTestCaseNameExceptionImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getInvalidTestCaseNameException()
		 * @generated
		 */
		EClass INVALID_TEST_CASE_NAME_EXCEPTION = eINSTANCE
				.getInvalidTestCaseNameException();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.InvalidParameterExceptionImpl <em>Invalid Parameter Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.InvalidParameterExceptionImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getInvalidParameterException()
		 * @generated
		 */
		EClass INVALID_PARAMETER_EXCEPTION = eINSTANCE
				.getInvalidParameterException();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.FallibleImpl <em>Fallible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.FallibleImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getFallible()
		 * @generated
		 */
		EClass FALLIBLE = eINSTANCE.getFallible();

		/**
		 * The meta object literal for the '<em><b>Stop On Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLIBLE__STOP_ON_FAILURE = eINSTANCE
				.getFallible_StopOnFailure();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLIBLE__RANK = eINSTANCE.getFallible_Rank();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.LogImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__FAILURES = eINSTANCE.getLog_Failures();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__ERRORS = eINSTANCE.getLog_Errors();

		/**
		 * The meta object literal for the '<em><b>Runtests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__RUNTESTS = eINSTANCE.getLog_Runtests();

		/**
		 * The meta object literal for the '<em><b>Harness Errors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__HARNESS_ERRORS = eINSTANCE.getLog_HarnessErrors();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.FailureImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__MESSAGE = eINSTANCE.getFailure_Message();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE__FAILURE = eINSTANCE.getFailure_Failure();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.ErrorImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__ERROR = eINSTANCE.getError_Error();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__EXCEPTION = eINSTANCE.getError_Exception();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__KIND = eINSTANCE.getError_Kind();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.TestImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__LOG = eINSTANCE.getTest_Log();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.TestSuiteImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TESTS = eINSTANCE.getTestSuite_Tests();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.TestCaseImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>test Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TEST_METHOD_NAME = eINSTANCE
				.getTestCase___testMethodName();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.impl.TestRunnerImpl <em>Test Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.impl.TestRunnerImpl
		 * @see kermeta.kunit.impl.KunitPackageImpl#getTestRunner()
		 * @generated
		 */
		EClass TEST_RUNNER = eINSTANCE.getTestRunner();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RUNNER__LOG = eINSTANCE.getTestRunner_Log();

		/**
		 * The meta object literal for the '{@link kermeta.kunit.ErrorKind <em>Error Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.kunit.ErrorKind
		 * @see kermeta.kunit.impl.KunitPackageImpl#getErrorKind()
		 * @generated
		 */
		EEnum ERROR_KIND = eINSTANCE.getErrorKind();

	}

} //KunitPackage
