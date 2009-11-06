/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.kunit.util;

import java.util.List;

import kermeta.kunit.AbstractFallible;
import kermeta.kunit.Assert;
import kermeta.kunit.AssertionFailedError;
import kermeta.kunit.Failure;
import kermeta.kunit.Fallible;
import kermeta.kunit.InvalidParameterException;
import kermeta.kunit.InvalidTestCaseNameException;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;
import kermeta.kunit.Test;
import kermeta.kunit.TestCase;
import kermeta.kunit.TestRunner;
import kermeta.kunit.TestSuite;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kermeta.kunit.KunitPackage
 * @generated
 */
public class KunitSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KunitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KunitSwitch() {
		if (modelPackage == null) {
			modelPackage = KunitPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case KunitPackage.FALLIBLE: {
			Fallible fallible = (Fallible) theEObject;
			T result = caseFallible(fallible);
			if (result == null)
				result = caseAbstractFallible(fallible);
			if (result == null)
				result = caseObject(fallible);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.TEST: {
			Test test = (Test) theEObject;
			T result = caseTest(test);
			if (result == null)
				result = caseObject(test);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.ABSTRACT_FALLIBLE: {
			AbstractFallible abstractFallible = (AbstractFallible) theEObject;
			T result = caseAbstractFallible(abstractFallible);
			if (result == null)
				result = caseObject(abstractFallible);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.ASSERTION_FAILED_ERROR: {
			AssertionFailedError assertionFailedError = (AssertionFailedError) theEObject;
			T result = caseAssertionFailedError(assertionFailedError);
			if (result == null)
				result = caseException(assertionFailedError);
			if (result == null)
				result = caseObject(assertionFailedError);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.ASSERT: {
			Assert assert_ = (Assert) theEObject;
			T result = caseAssert(assert_);
			if (result == null)
				result = caseAbstractFallible(assert_);
			if (result == null)
				result = caseObject(assert_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.INVALID_TEST_CASE_NAME_EXCEPTION: {
			InvalidTestCaseNameException invalidTestCaseNameException = (InvalidTestCaseNameException) theEObject;
			T result = caseInvalidTestCaseNameException(invalidTestCaseNameException);
			if (result == null)
				result = caseException(invalidTestCaseNameException);
			if (result == null)
				result = caseObject(invalidTestCaseNameException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.INVALID_PARAMETER_EXCEPTION: {
			InvalidParameterException invalidParameterException = (InvalidParameterException) theEObject;
			T result = caseInvalidParameterException(invalidParameterException);
			if (result == null)
				result = caseException(invalidParameterException);
			if (result == null)
				result = caseObject(invalidParameterException);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.LOG: {
			Log log = (Log) theEObject;
			T result = caseLog(log);
			if (result == null)
				result = caseObject(log);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.FAILURE: {
			Failure failure = (Failure) theEObject;
			T result = caseFailure(failure);
			if (result == null)
				result = caseObject(failure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.ERROR: {
			kermeta.kunit.Error error = (kermeta.kunit.Error) theEObject;
			T result = caseError(error);
			if (result == null)
				result = caseObject(error);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.TEST_SUITE: {
			TestSuite testSuite = (TestSuite) theEObject;
			T result = caseTestSuite(testSuite);
			if (result == null)
				result = caseTest(testSuite);
			if (result == null)
				result = caseObject(testSuite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.TEST_CASE: {
			TestCase testCase = (TestCase) theEObject;
			T result = caseTestCase(testCase);
			if (result == null)
				result = caseTest(testCase);
			if (result == null)
				result = caseFallible(testCase);
			if (result == null)
				result = caseAbstractFallible(testCase);
			if (result == null)
				result = caseObject(testCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case KunitPackage.TEST_RUNNER: {
			TestRunner testRunner = (TestRunner) theEObject;
			T result = caseTestRunner(testRunner);
			if (result == null)
				result = caseObject(testRunner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallible(Fallible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Fallible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Fallible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFallible(AbstractFallible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Failed Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Failed Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionFailedError(AssertionFailedError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssert(Assert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Test Case Name Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Test Case Name Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidTestCaseNameException(
			InvalidTestCaseNameException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Parameter Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidParameterException(InvalidParameterException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure(Failure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(kermeta.kunit.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuite(TestSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Runner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Runner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestRunner(TestRunner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(kermeta.language.structure.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(kermeta.exceptions.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //KunitSwitch
