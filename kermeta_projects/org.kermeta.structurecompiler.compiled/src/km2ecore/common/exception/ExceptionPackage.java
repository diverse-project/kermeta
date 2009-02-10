/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ExceptionPackage.java,v 1.11 2009-02-10 17:51:50 cfaucher Exp $
 */
package km2ecore.common.exception;

import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see km2ecore.common.exception.ExceptionFactory
 * @model kind="package"
 *        annotation="kermeta ecoreUri='http://www.kermeta.org/km2ecore/common/exception'"
 * @generated
 */
public interface ExceptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exception";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/km2ecore/common/exception/kermeta_temp_uri";

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
	ExceptionPackage eINSTANCE = km2ecore.common.exception.impl.ExceptionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link km2ecore.common.exception.impl.UndefinedUriEPackageExceptionImpl <em>Undefined Uri EPackage Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.common.exception.impl.UndefinedUriEPackageExceptionImpl
	 * @see km2ecore.common.exception.impl.ExceptionPackageImpl#getUndefinedUriEPackageException()
	 * @generated
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__TAG = ExceptionsPackage.EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__FILE = ExceptionsPackage.EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__FILE_NAME = ExceptionsPackage.EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__LINE_NUMBER = ExceptionsPackage.EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__OID = ExceptionsPackage.EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = ExceptionsPackage.EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Undefined Uri EPackage Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_URI_EPACKAGE_EXCEPTION_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link km2ecore.common.exception.impl.UndefinedValueTypeInstanceClassNameExceptionImpl <em>Undefined Value Type Instance Class Name Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see km2ecore.common.exception.impl.UndefinedValueTypeInstanceClassNameExceptionImpl
	 * @see km2ecore.common.exception.impl.ExceptionPackageImpl#getUndefinedValueTypeInstanceClassNameException()
	 * @generated
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__TAG = ExceptionsPackage.EXCEPTION__TAG;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__FILE = ExceptionsPackage.EXCEPTION__FILE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__FILE_NAME = ExceptionsPackage.EXCEPTION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__LINE_NUMBER = ExceptionsPackage.EXCEPTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__OWNED_TAGS = ExceptionsPackage.EXCEPTION__OWNED_TAGS;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__OID = ExceptionsPackage.EXCEPTION__OID;

	/**
	 * The feature id for the '<em><b>Internal Containing Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__INTERNAL_CONTAINING_RESOURCE = ExceptionsPackage.EXCEPTION__INTERNAL_CONTAINING_RESOURCE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__MESSAGE = ExceptionsPackage.EXCEPTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__NESTED_EXCEPTION = ExceptionsPackage.EXCEPTION__NESTED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION__STACK_TRACE = ExceptionsPackage.EXCEPTION__STACK_TRACE;

	/**
	 * The number of structural features of the '<em>Undefined Value Type Instance Class Name Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION_FEATURE_COUNT = ExceptionsPackage.EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link km2ecore.common.exception.UndefinedUriEPackageException <em>Undefined Uri EPackage Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Uri EPackage Exception</em>'.
	 * @see km2ecore.common.exception.UndefinedUriEPackageException
	 * @generated
	 */
	EClass getUndefinedUriEPackageException();

	/**
	 * Returns the meta object for class '{@link km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException <em>Undefined Value Type Instance Class Name Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Value Type Instance Class Name Exception</em>'.
	 * @see km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException
	 * @generated
	 */
	EClass getUndefinedValueTypeInstanceClassNameException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExceptionFactory getExceptionFactory();

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
		 * The meta object literal for the '{@link km2ecore.common.exception.impl.UndefinedUriEPackageExceptionImpl <em>Undefined Uri EPackage Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.common.exception.impl.UndefinedUriEPackageExceptionImpl
		 * @see km2ecore.common.exception.impl.ExceptionPackageImpl#getUndefinedUriEPackageException()
		 * @generated
		 */
		EClass UNDEFINED_URI_EPACKAGE_EXCEPTION = eINSTANCE
				.getUndefinedUriEPackageException();

		/**
		 * The meta object literal for the '{@link km2ecore.common.exception.impl.UndefinedValueTypeInstanceClassNameExceptionImpl <em>Undefined Value Type Instance Class Name Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see km2ecore.common.exception.impl.UndefinedValueTypeInstanceClassNameExceptionImpl
		 * @see km2ecore.common.exception.impl.ExceptionPackageImpl#getUndefinedValueTypeInstanceClassNameException()
		 * @generated
		 */
		EClass UNDEFINED_VALUE_TYPE_INSTANCE_CLASS_NAME_EXCEPTION = eINSTANCE
				.getUndefinedValueTypeInstanceClassNameException();

	}

} //ExceptionPackage
