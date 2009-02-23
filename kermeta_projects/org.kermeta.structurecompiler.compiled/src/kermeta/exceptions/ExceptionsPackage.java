/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ExceptionsPackage.java,v 1.12 2009-02-23 15:26:43 cfaucher Exp $
 */
package kermeta.exceptions;

import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see kermeta.exceptions.ExceptionsFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/kermeta/1_2_0//kermeta/exceptions'"
 *        annotation="kermeta documentation='/** \r\n * Contains the definition of a Kermeta exception and a few basic exceptions.\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/exceptions_package.png\"/>\r\n \052/'"
 * @generated
 */
public interface ExceptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exceptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kermeta/1_2_0//kermeta/exceptions/kermeta_temp_uri";

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
	ExceptionsPackage eINSTANCE = kermeta.exceptions.impl.ExceptionsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__FILE = StructurePackage.OBJECT__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__TAG = StructurePackage.OBJECT__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__FILE_NAME = StructurePackage.OBJECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__LINE_NUMBER = StructurePackage.OBJECT__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__OWNED_TAGS = StructurePackage.OBJECT__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__OID = StructurePackage.OBJECT__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__INTERNAL_CONTAINING_RESOURCE = StructurePackage.OBJECT__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__MESSAGE = StructurePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NESTED_EXCEPTION = StructurePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__STACK_TRACE = StructurePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = StructurePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.RuntimeErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getRuntimeError()
	 * @generated
	 */
	int RUNTIME_ERROR = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR__EXPRESSION = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ERROR_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.CallOnVoidTargetImpl <em>Call On Void Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.CallOnVoidTargetImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getCallOnVoidTarget()
	 * @generated
	 */
	int CALL_ON_VOID_TARGET = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Call On Void Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ON_VOID_TARGET_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.TypeCastErrorImpl <em>Type Cast Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.TypeCastErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getTypeCastError()
	 * @generated
	 */
	int TYPE_CAST_ERROR = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Type Cast Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CAST_ERROR_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.NotImplementedExceptionImpl <em>Not Implemented Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.NotImplementedExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getNotImplementedException()
	 * @generated
	 */
	int NOT_IMPLEMENTED_EXCEPTION = 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Not Implemented Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IMPLEMENTED_EXCEPTION_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.UpperBoundReachedErrorImpl <em>Upper Bound Reached Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.UpperBoundReachedErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getUpperBoundReachedError()
	 * @generated
	 */
	int UPPER_BOUND_REACHED_ERROR = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Upper Bound Reached Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_REACHED_ERROR_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.AbstractClassInstantiationErrorImpl <em>Abstract Class Instantiation Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.AbstractClassInstantiationErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getAbstractClassInstantiationError()
	 * @generated
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR = 6;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Abstract Class Instantiation Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_INSTANTIATION_ERROR_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.IncompatibleTypeErrorImpl <em>Incompatible Type Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.IncompatibleTypeErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIncompatibleTypeError()
	 * @generated
	 */
	int INCOMPATIBLE_TYPE_ERROR = 7;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__FILE = RUNTIME_ERROR__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__TAG = RUNTIME_ERROR__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__FILE_NAME = RUNTIME_ERROR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__LINE_NUMBER = RUNTIME_ERROR__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__OWNED_TAGS = RUNTIME_ERROR__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__OID = RUNTIME_ERROR__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__INTERNAL_CONTAINING_RESOURCE = RUNTIME_ERROR__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__MESSAGE = RUNTIME_ERROR__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__NESTED_EXCEPTION = RUNTIME_ERROR__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__STACK_TRACE = RUNTIME_ERROR__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR__EXPRESSION = RUNTIME_ERROR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Incompatible Type Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMPATIBLE_TYPE_ERROR_FEATURE_COUNT = RUNTIME_ERROR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.DivisionByZeroImpl <em>Division By Zero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.DivisionByZeroImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getDivisionByZero()
	 * @generated
	 */
	int DIVISION_BY_ZERO = 8;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Division By Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_BY_ZERO_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.OverflowErrorImpl <em>Overflow Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.OverflowErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getOverflowError()
	 * @generated
	 */
	int OVERFLOW_ERROR = 9;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Overflow Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_ERROR_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.VoidOperandErrorImpl <em>Void Operand Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.VoidOperandErrorImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getVoidOperandError()
	 * @generated
	 */
	int VOID_OPERAND_ERROR = 10;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Void Operand Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERAND_ERROR_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.StringIndexOutOfBoundImpl <em>String Index Out Of Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.StringIndexOutOfBoundImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getStringIndexOutOfBound()
	 * @generated
	 */
	int STRING_INDEX_OUT_OF_BOUND = 11;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>String Index Out Of Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_INDEX_OUT_OF_BOUND_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.StringFormatExceptionImpl <em>String Format Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.StringFormatExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getStringFormatException()
	 * @generated
	 */
	int STRING_FORMAT_EXCEPTION = 12;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>String Format Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FORMAT_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.IndexOutOfBoundImpl <em>Index Out Of Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.IndexOutOfBoundImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIndexOutOfBound()
	 * @generated
	 */
	int INDEX_OUT_OF_BOUND = 13;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Index Out Of Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OUT_OF_BOUND_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.EmptyCollectionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getEmptyCollection()
	 * @generated
	 */
	int EMPTY_COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Empty Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.IteratorIsOffImpl <em>Iterator Is Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.IteratorIsOffImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIteratorIsOff()
	 * @generated
	 */
	int ITERATOR_IS_OFF = 15;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Iterator Is Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_IS_OFF_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.IOExceptionImpl <em>IO Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.IOExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 16;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>IO Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.FileNotFoundExceptionImpl <em>File Not Found Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.FileNotFoundExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getFileNotFoundException()
	 * @generated
	 */
	int FILE_NOT_FOUND_EXCEPTION = 17;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__FILE = IO_EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__TAG = IO_EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__FILE_NAME = IO_EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__LINE_NUMBER = IO_EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__OWNED_TAGS = IO_EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__OID = IO_EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = IO_EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__MESSAGE = IO_EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__NESTED_EXCEPTION = IO_EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION__STACK_TRACE = IO_EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>File Not Found Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_FOUND_EXCEPTION_FEATURE_COUNT = IO_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ConstraintViolatedExceptionImpl <em>Constraint Violated Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ConstraintViolatedExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedException()
	 * @generated
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION = 18;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Constraint Applied To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT = EXCEPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Violated Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ConstraintViolatedPreImpl <em>Constraint Violated Pre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ConstraintViolatedPreImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedPre()
	 * @generated
	 */
	int CONSTRAINT_VIOLATED_PRE = 19;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__FILE = CONSTRAINT_VIOLATED_EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__TAG = CONSTRAINT_VIOLATED_EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__FILE_NAME = CONSTRAINT_VIOLATED_EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__LINE_NUMBER = CONSTRAINT_VIOLATED_EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__OWNED_TAGS = CONSTRAINT_VIOLATED_EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__OID = CONSTRAINT_VIOLATED_EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__INTERNAL_CONTAINING_RESOURCE = CONSTRAINT_VIOLATED_EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__MESSAGE = CONSTRAINT_VIOLATED_EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__NESTED_EXCEPTION = CONSTRAINT_VIOLATED_EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__STACK_TRACE = CONSTRAINT_VIOLATED_EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Constraint Applied To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__CONSTRAINT_APPLIED_TO = CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE__FAILED_CONSTRAINT = CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Constraint Violated Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_PRE_FEATURE_COUNT = CONSTRAINT_VIOLATED_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ConstraintViolatedPostImpl <em>Constraint Violated Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ConstraintViolatedPostImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedPost()
	 * @generated
	 */
	int CONSTRAINT_VIOLATED_POST = 20;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__FILE = CONSTRAINT_VIOLATED_EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__TAG = CONSTRAINT_VIOLATED_EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__FILE_NAME = CONSTRAINT_VIOLATED_EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__LINE_NUMBER = CONSTRAINT_VIOLATED_EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__OWNED_TAGS = CONSTRAINT_VIOLATED_EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__OID = CONSTRAINT_VIOLATED_EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__INTERNAL_CONTAINING_RESOURCE = CONSTRAINT_VIOLATED_EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__MESSAGE = CONSTRAINT_VIOLATED_EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__NESTED_EXCEPTION = CONSTRAINT_VIOLATED_EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__STACK_TRACE = CONSTRAINT_VIOLATED_EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Constraint Applied To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__CONSTRAINT_APPLIED_TO = CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST__FAILED_CONSTRAINT = CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Constraint Violated Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_POST_FEATURE_COUNT = CONSTRAINT_VIOLATED_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ConstraintViolatedInvImpl <em>Constraint Violated Inv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ConstraintViolatedInvImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedInv()
	 * @generated
	 */
	int CONSTRAINT_VIOLATED_INV = 21;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__FILE = CONSTRAINT_VIOLATED_EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__TAG = CONSTRAINT_VIOLATED_EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__FILE_NAME = CONSTRAINT_VIOLATED_EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__LINE_NUMBER = CONSTRAINT_VIOLATED_EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__OWNED_TAGS = CONSTRAINT_VIOLATED_EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__OID = CONSTRAINT_VIOLATED_EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__INTERNAL_CONTAINING_RESOURCE = CONSTRAINT_VIOLATED_EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__MESSAGE = CONSTRAINT_VIOLATED_EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__NESTED_EXCEPTION = CONSTRAINT_VIOLATED_EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__STACK_TRACE = CONSTRAINT_VIOLATED_EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Constraint Applied To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__CONSTRAINT_APPLIED_TO = CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO;

	/**
	 * The feature id for the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV__FAILED_CONSTRAINT = CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Constraint Violated Inv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VIOLATED_INV_FEATURE_COUNT = CONSTRAINT_VIOLATED_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ResourceLoadExceptionImpl <em>Resource Load Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ResourceLoadExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceLoadException()
	 * @generated
	 */
	int RESOURCE_LOAD_EXCEPTION = 22;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Resource Load Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOAD_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ResourceSaveExceptionImpl <em>Resource Save Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ResourceSaveExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceSaveException()
	 * @generated
	 */
	int RESOURCE_SAVE_EXCEPTION = 23;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Failed While Saving</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Save Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SAVE_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ResourceMixedLevelsExceptionImpl <em>Resource Mixed Levels Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ResourceMixedLevelsExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceMixedLevelsException()
	 * @generated
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION = 24;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__FILE = RESOURCE_SAVE_EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__TAG = RESOURCE_SAVE_EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__FILE_NAME = RESOURCE_SAVE_EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__LINE_NUMBER = RESOURCE_SAVE_EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__OWNED_TAGS = RESOURCE_SAVE_EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__OID = RESOURCE_SAVE_EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = RESOURCE_SAVE_EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__MESSAGE = RESOURCE_SAVE_EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__NESTED_EXCEPTION = RESOURCE_SAVE_EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__STACK_TRACE = RESOURCE_SAVE_EXCEPTION__STACK_TRACE;

	/**
	 * The feature id for the '<em><b>Failed While Saving</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION__FAILED_WHILE_SAVING = RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING;

	/**
	 * The number of structural features of the '<em>Resource Mixed Levels Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MIXED_LEVELS_EXCEPTION_FEATURE_COUNT = RESOURCE_SAVE_EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ResourceCreateExceptionImpl <em>Resource Create Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ResourceCreateExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceCreateException()
	 * @generated
	 */
	int RESOURCE_CREATE_EXCEPTION = 25;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Resource Create Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CREATE_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.ResourceUnconformityExceptionImpl <em>Resource Unconformity Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.ResourceUnconformityExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceUnconformityException()
	 * @generated
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION = 26;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Resource Unconformity Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UNCONFORMITY_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.UnregisteredMetamodelExceptionImpl <em>Unregistered Metamodel Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.UnregisteredMetamodelExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getUnregisteredMetamodelException()
	 * @generated
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION = 27;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Unregistered Metamodel Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_METAMODEL_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link kermeta.exceptions.impl.DynamicExpressionExceptionImpl <em>Dynamic Expression Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kermeta.exceptions.impl.DynamicExpressionExceptionImpl
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getDynamicExpressionException()
	 * @generated
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION = 28;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__FILE = EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__TAG = EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__FILE_NAME = EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__LINE_NUMBER = EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__OWNED_TAGS = EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__OID = EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__MESSAGE = EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__NESTED_EXCEPTION = EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION__STACK_TRACE = EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Dynamic Expression Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_EXPRESSION_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>KRuntime Error</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.compil.runtime.helper.error.KRuntimeError
	 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getKRuntimeError()
	 * @generated
	 */
	int KRUNTIME_ERROR = 29;

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see kermeta.exceptions.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.exceptions.Exception#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see kermeta.exceptions.Exception#getMessage()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Message();

	/**
	 * Returns the meta object for the containment reference '{@link kermeta.exceptions.Exception#getNestedException <em>Nested Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested Exception</em>'.
	 * @see kermeta.exceptions.Exception#getNestedException()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_NestedException();

	/**
	 * Returns the meta object for the attribute '{@link kermeta.exceptions.Exception#getStackTrace <em>Stack Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Trace</em>'.
	 * @see kermeta.exceptions.Exception#getStackTrace()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_StackTrace();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.RuntimeError <em>Runtime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Error</em>'.
	 * @see kermeta.exceptions.RuntimeError
	 * @generated
	 */
	EClass getRuntimeError();

	/**
	 * Returns the meta object for the containment reference '{@link kermeta.exceptions.RuntimeError#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see kermeta.exceptions.RuntimeError#getExpression()
	 * @see #getRuntimeError()
	 * @generated
	 */
	EReference getRuntimeError_Expression();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.CallOnVoidTarget <em>Call On Void Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call On Void Target</em>'.
	 * @see kermeta.exceptions.CallOnVoidTarget
	 * @generated
	 */
	EClass getCallOnVoidTarget();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.TypeCastError <em>Type Cast Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Cast Error</em>'.
	 * @see kermeta.exceptions.TypeCastError
	 * @generated
	 */
	EClass getTypeCastError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.NotImplementedException <em>Not Implemented Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Implemented Exception</em>'.
	 * @see kermeta.exceptions.NotImplementedException
	 * @generated
	 */
	EClass getNotImplementedException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.UpperBoundReachedError <em>Upper Bound Reached Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Bound Reached Error</em>'.
	 * @see kermeta.exceptions.UpperBoundReachedError
	 * @generated
	 */
	EClass getUpperBoundReachedError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.AbstractClassInstantiationError <em>Abstract Class Instantiation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Class Instantiation Error</em>'.
	 * @see kermeta.exceptions.AbstractClassInstantiationError
	 * @generated
	 */
	EClass getAbstractClassInstantiationError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.IncompatibleTypeError <em>Incompatible Type Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incompatible Type Error</em>'.
	 * @see kermeta.exceptions.IncompatibleTypeError
	 * @generated
	 */
	EClass getIncompatibleTypeError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.DivisionByZero <em>Division By Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division By Zero</em>'.
	 * @see kermeta.exceptions.DivisionByZero
	 * @generated
	 */
	EClass getDivisionByZero();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.OverflowError <em>Overflow Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overflow Error</em>'.
	 * @see kermeta.exceptions.OverflowError
	 * @generated
	 */
	EClass getOverflowError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.VoidOperandError <em>Void Operand Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Operand Error</em>'.
	 * @see kermeta.exceptions.VoidOperandError
	 * @generated
	 */
	EClass getVoidOperandError();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.StringIndexOutOfBound <em>String Index Out Of Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Index Out Of Bound</em>'.
	 * @see kermeta.exceptions.StringIndexOutOfBound
	 * @generated
	 */
	EClass getStringIndexOutOfBound();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.StringFormatException <em>String Format Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Format Exception</em>'.
	 * @see kermeta.exceptions.StringFormatException
	 * @generated
	 */
	EClass getStringFormatException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.IndexOutOfBound <em>Index Out Of Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Out Of Bound</em>'.
	 * @see kermeta.exceptions.IndexOutOfBound
	 * @generated
	 */
	EClass getIndexOutOfBound();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.EmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Collection</em>'.
	 * @see kermeta.exceptions.EmptyCollection
	 * @generated
	 */
	EClass getEmptyCollection();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.IteratorIsOff <em>Iterator Is Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Is Off</em>'.
	 * @see kermeta.exceptions.IteratorIsOff
	 * @generated
	 */
	EClass getIteratorIsOff();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Exception</em>'.
	 * @see kermeta.exceptions.IOException
	 * @generated
	 */
	EClass getIOException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.FileNotFoundException <em>File Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Not Found Exception</em>'.
	 * @see kermeta.exceptions.FileNotFoundException
	 * @generated
	 */
	EClass getFileNotFoundException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ConstraintViolatedException <em>Constraint Violated Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Violated Exception</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedException
	 * @generated
	 */
	EClass getConstraintViolatedException();

	/**
	 * Returns the meta object for the reference '{@link kermeta.exceptions.ConstraintViolatedException#getConstraintAppliedTo <em>Constraint Applied To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint Applied To</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedException#getConstraintAppliedTo()
	 * @see #getConstraintViolatedException()
	 * @generated
	 */
	EReference getConstraintViolatedException_ConstraintAppliedTo();

	/**
	 * Returns the meta object for the reference '{@link kermeta.exceptions.ConstraintViolatedException#getFailedConstraint <em>Failed Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed Constraint</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedException#getFailedConstraint()
	 * @see #getConstraintViolatedException()
	 * @generated
	 */
	EReference getConstraintViolatedException_FailedConstraint();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ConstraintViolatedPre <em>Constraint Violated Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Violated Pre</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedPre
	 * @generated
	 */
	EClass getConstraintViolatedPre();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ConstraintViolatedPost <em>Constraint Violated Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Violated Post</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedPost
	 * @generated
	 */
	EClass getConstraintViolatedPost();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ConstraintViolatedInv <em>Constraint Violated Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Violated Inv</em>'.
	 * @see kermeta.exceptions.ConstraintViolatedInv
	 * @generated
	 */
	EClass getConstraintViolatedInv();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ResourceLoadException <em>Resource Load Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Load Exception</em>'.
	 * @see kermeta.exceptions.ResourceLoadException
	 * @generated
	 */
	EClass getResourceLoadException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ResourceSaveException <em>Resource Save Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Save Exception</em>'.
	 * @see kermeta.exceptions.ResourceSaveException
	 * @generated
	 */
	EClass getResourceSaveException();

	/**
	 * Returns the meta object for the reference '{@link kermeta.exceptions.ResourceSaveException#getFailedWhileSaving <em>Failed While Saving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed While Saving</em>'.
	 * @see kermeta.exceptions.ResourceSaveException#getFailedWhileSaving()
	 * @see #getResourceSaveException()
	 * @generated
	 */
	EReference getResourceSaveException_FailedWhileSaving();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ResourceMixedLevelsException <em>Resource Mixed Levels Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Mixed Levels Exception</em>'.
	 * @see kermeta.exceptions.ResourceMixedLevelsException
	 * @generated
	 */
	EClass getResourceMixedLevelsException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ResourceCreateException <em>Resource Create Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Create Exception</em>'.
	 * @see kermeta.exceptions.ResourceCreateException
	 * @generated
	 */
	EClass getResourceCreateException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.ResourceUnconformityException <em>Resource Unconformity Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Unconformity Exception</em>'.
	 * @see kermeta.exceptions.ResourceUnconformityException
	 * @generated
	 */
	EClass getResourceUnconformityException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.UnregisteredMetamodelException <em>Unregistered Metamodel Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unregistered Metamodel Exception</em>'.
	 * @see kermeta.exceptions.UnregisteredMetamodelException
	 * @generated
	 */
	EClass getUnregisteredMetamodelException();

	/**
	 * Returns the meta object for class '{@link kermeta.exceptions.DynamicExpressionException <em>Dynamic Expression Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Expression Exception</em>'.
	 * @see kermeta.exceptions.DynamicExpressionException
	 * @generated
	 */
	EClass getDynamicExpressionException();

	/**
	 * Returns the meta object for data type '{@link org.kermeta.compil.runtime.helper.error.KRuntimeError <em>KRuntime Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>KRuntime Error</em>'.
	 * @see org.kermeta.compil.runtime.helper.error.KRuntimeError
	 * @model instanceClass="org.kermeta.compil.runtime.helper.error.KRuntimeError" serializeable="false"
	 * @generated
	 */
	EDataType getKRuntimeError();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExceptionsFactory getExceptionsFactory();

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
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__MESSAGE = eINSTANCE.getException_Message();

		/**
		 * The meta object literal for the '<em><b>Nested Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__NESTED_EXCEPTION = eINSTANCE
				.getException_NestedException();

		/**
		 * The meta object literal for the '<em><b>Stack Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__STACK_TRACE = eINSTANCE.getException_StackTrace();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.RuntimeErrorImpl <em>Runtime Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.RuntimeErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getRuntimeError()
		 * @generated
		 */
		EClass RUNTIME_ERROR = eINSTANCE.getRuntimeError();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ERROR__EXPRESSION = eINSTANCE
				.getRuntimeError_Expression();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.CallOnVoidTargetImpl <em>Call On Void Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.CallOnVoidTargetImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getCallOnVoidTarget()
		 * @generated
		 */
		EClass CALL_ON_VOID_TARGET = eINSTANCE.getCallOnVoidTarget();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.TypeCastErrorImpl <em>Type Cast Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.TypeCastErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getTypeCastError()
		 * @generated
		 */
		EClass TYPE_CAST_ERROR = eINSTANCE.getTypeCastError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.NotImplementedExceptionImpl <em>Not Implemented Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.NotImplementedExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getNotImplementedException()
		 * @generated
		 */
		EClass NOT_IMPLEMENTED_EXCEPTION = eINSTANCE
				.getNotImplementedException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.UpperBoundReachedErrorImpl <em>Upper Bound Reached Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.UpperBoundReachedErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getUpperBoundReachedError()
		 * @generated
		 */
		EClass UPPER_BOUND_REACHED_ERROR = eINSTANCE
				.getUpperBoundReachedError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.AbstractClassInstantiationErrorImpl <em>Abstract Class Instantiation Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.AbstractClassInstantiationErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getAbstractClassInstantiationError()
		 * @generated
		 */
		EClass ABSTRACT_CLASS_INSTANTIATION_ERROR = eINSTANCE
				.getAbstractClassInstantiationError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.IncompatibleTypeErrorImpl <em>Incompatible Type Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.IncompatibleTypeErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIncompatibleTypeError()
		 * @generated
		 */
		EClass INCOMPATIBLE_TYPE_ERROR = eINSTANCE.getIncompatibleTypeError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.DivisionByZeroImpl <em>Division By Zero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.DivisionByZeroImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getDivisionByZero()
		 * @generated
		 */
		EClass DIVISION_BY_ZERO = eINSTANCE.getDivisionByZero();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.OverflowErrorImpl <em>Overflow Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.OverflowErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getOverflowError()
		 * @generated
		 */
		EClass OVERFLOW_ERROR = eINSTANCE.getOverflowError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.VoidOperandErrorImpl <em>Void Operand Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.VoidOperandErrorImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getVoidOperandError()
		 * @generated
		 */
		EClass VOID_OPERAND_ERROR = eINSTANCE.getVoidOperandError();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.StringIndexOutOfBoundImpl <em>String Index Out Of Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.StringIndexOutOfBoundImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getStringIndexOutOfBound()
		 * @generated
		 */
		EClass STRING_INDEX_OUT_OF_BOUND = eINSTANCE.getStringIndexOutOfBound();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.StringFormatExceptionImpl <em>String Format Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.StringFormatExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getStringFormatException()
		 * @generated
		 */
		EClass STRING_FORMAT_EXCEPTION = eINSTANCE.getStringFormatException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.IndexOutOfBoundImpl <em>Index Out Of Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.IndexOutOfBoundImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIndexOutOfBound()
		 * @generated
		 */
		EClass INDEX_OUT_OF_BOUND = eINSTANCE.getIndexOutOfBound();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.EmptyCollectionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getEmptyCollection()
		 * @generated
		 */
		EClass EMPTY_COLLECTION = eINSTANCE.getEmptyCollection();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.IteratorIsOffImpl <em>Iterator Is Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.IteratorIsOffImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIteratorIsOff()
		 * @generated
		 */
		EClass ITERATOR_IS_OFF = eINSTANCE.getIteratorIsOff();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.IOExceptionImpl <em>IO Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.IOExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getIOException()
		 * @generated
		 */
		EClass IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.FileNotFoundExceptionImpl <em>File Not Found Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.FileNotFoundExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getFileNotFoundException()
		 * @generated
		 */
		EClass FILE_NOT_FOUND_EXCEPTION = eINSTANCE.getFileNotFoundException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ConstraintViolatedExceptionImpl <em>Constraint Violated Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ConstraintViolatedExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedException()
		 * @generated
		 */
		EClass CONSTRAINT_VIOLATED_EXCEPTION = eINSTANCE
				.getConstraintViolatedException();

		/**
		 * The meta object literal for the '<em><b>Constraint Applied To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_VIOLATED_EXCEPTION__CONSTRAINT_APPLIED_TO = eINSTANCE
				.getConstraintViolatedException_ConstraintAppliedTo();

		/**
		 * The meta object literal for the '<em><b>Failed Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_VIOLATED_EXCEPTION__FAILED_CONSTRAINT = eINSTANCE
				.getConstraintViolatedException_FailedConstraint();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ConstraintViolatedPreImpl <em>Constraint Violated Pre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ConstraintViolatedPreImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedPre()
		 * @generated
		 */
		EClass CONSTRAINT_VIOLATED_PRE = eINSTANCE.getConstraintViolatedPre();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ConstraintViolatedPostImpl <em>Constraint Violated Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ConstraintViolatedPostImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedPost()
		 * @generated
		 */
		EClass CONSTRAINT_VIOLATED_POST = eINSTANCE.getConstraintViolatedPost();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ConstraintViolatedInvImpl <em>Constraint Violated Inv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ConstraintViolatedInvImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getConstraintViolatedInv()
		 * @generated
		 */
		EClass CONSTRAINT_VIOLATED_INV = eINSTANCE.getConstraintViolatedInv();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ResourceLoadExceptionImpl <em>Resource Load Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ResourceLoadExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceLoadException()
		 * @generated
		 */
		EClass RESOURCE_LOAD_EXCEPTION = eINSTANCE.getResourceLoadException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ResourceSaveExceptionImpl <em>Resource Save Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ResourceSaveExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceSaveException()
		 * @generated
		 */
		EClass RESOURCE_SAVE_EXCEPTION = eINSTANCE.getResourceSaveException();

		/**
		 * The meta object literal for the '<em><b>Failed While Saving</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SAVE_EXCEPTION__FAILED_WHILE_SAVING = eINSTANCE
				.getResourceSaveException_FailedWhileSaving();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ResourceMixedLevelsExceptionImpl <em>Resource Mixed Levels Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ResourceMixedLevelsExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceMixedLevelsException()
		 * @generated
		 */
		EClass RESOURCE_MIXED_LEVELS_EXCEPTION = eINSTANCE
				.getResourceMixedLevelsException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ResourceCreateExceptionImpl <em>Resource Create Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ResourceCreateExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceCreateException()
		 * @generated
		 */
		EClass RESOURCE_CREATE_EXCEPTION = eINSTANCE
				.getResourceCreateException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.ResourceUnconformityExceptionImpl <em>Resource Unconformity Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.ResourceUnconformityExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getResourceUnconformityException()
		 * @generated
		 */
		EClass RESOURCE_UNCONFORMITY_EXCEPTION = eINSTANCE
				.getResourceUnconformityException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.UnregisteredMetamodelExceptionImpl <em>Unregistered Metamodel Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.UnregisteredMetamodelExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getUnregisteredMetamodelException()
		 * @generated
		 */
		EClass UNREGISTERED_METAMODEL_EXCEPTION = eINSTANCE
				.getUnregisteredMetamodelException();

		/**
		 * The meta object literal for the '{@link kermeta.exceptions.impl.DynamicExpressionExceptionImpl <em>Dynamic Expression Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kermeta.exceptions.impl.DynamicExpressionExceptionImpl
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getDynamicExpressionException()
		 * @generated
		 */
		EClass DYNAMIC_EXPRESSION_EXCEPTION = eINSTANCE
				.getDynamicExpressionException();

		/**
		 * The meta object literal for the '<em>KRuntime Error</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.compil.runtime.helper.error.KRuntimeError
		 * @see kermeta.exceptions.impl.ExceptionsPackageImpl#getKRuntimeError()
		 * @generated
		 */
		EDataType KRUNTIME_ERROR = eINSTANCE.getKRuntimeError();

	}

} //ExceptionsPackage
