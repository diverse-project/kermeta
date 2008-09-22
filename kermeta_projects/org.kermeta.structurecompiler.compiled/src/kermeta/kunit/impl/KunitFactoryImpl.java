/**
 * <copyright>
 * </copyright>
 *
 * $Id: KunitFactoryImpl.java,v 1.3 2008-09-22 14:46:10 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.Assert;
import kermeta.kunit.AssertionFailedError;
import kermeta.kunit.ErrorKind;
import kermeta.kunit.Failure;
import kermeta.kunit.InvalidParameterException;
import kermeta.kunit.InvalidTestCaseNameException;
import kermeta.kunit.KunitFactory;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;
import kermeta.kunit.TestRunner;
import kermeta.kunit.TestSuite;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KunitFactoryImpl extends EFactoryImpl implements KunitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KunitFactory init() {
		try {
			KunitFactory theKunitFactory = (KunitFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.kermeta.org/kermeta/1_2_0//kermeta/kunit/kermeta_temp_uri");
			if (theKunitFactory != null) {
				return theKunitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KunitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KunitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case KunitPackage.ASSERTION_FAILED_ERROR:
			return createAssertionFailedError();
		case KunitPackage.ASSERT:
			return createAssert();
		case KunitPackage.INVALID_TEST_CASE_NAME_EXCEPTION:
			return createInvalidTestCaseNameException();
		case KunitPackage.INVALID_PARAMETER_EXCEPTION:
			return createInvalidParameterException();
		case KunitPackage.LOG:
			return createLog();
		case KunitPackage.FAILURE:
			return createFailure();
		case KunitPackage.ERROR:
			return createError();
		case KunitPackage.TEST_SUITE:
			return createTestSuite();
		case KunitPackage.TEST_RUNNER:
			return createTestRunner();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case KunitPackage.ERROR_KIND:
			return createErrorKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case KunitPackage.ERROR_KIND:
			return convertErrorKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionFailedError createAssertionFailedError() {
		AssertionFailedErrorImpl assertionFailedError = new AssertionFailedErrorImpl();
		return assertionFailedError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assert createAssert() {
		AssertImpl assert_ = new AssertImpl();
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidTestCaseNameException createInvalidTestCaseNameException() {
		InvalidTestCaseNameExceptionImpl invalidTestCaseNameException = new InvalidTestCaseNameExceptionImpl();
		return invalidTestCaseNameException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidParameterException createInvalidParameterException() {
		InvalidParameterExceptionImpl invalidParameterException = new InvalidParameterExceptionImpl();
		return invalidParameterException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kermeta.kunit.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuite createTestSuite() {
		TestSuiteImpl testSuite = new TestSuiteImpl();
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestRunner createTestRunner() {
		TestRunnerImpl testRunner = new TestRunnerImpl();
		return testRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorKind createErrorKindFromString(EDataType eDataType,
			String initialValue) {
		ErrorKind result = ErrorKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KunitPackage getKunitPackage() {
		return (KunitPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KunitPackage getPackage() {
		return KunitPackage.eINSTANCE;
	}

} //KunitFactoryImpl
