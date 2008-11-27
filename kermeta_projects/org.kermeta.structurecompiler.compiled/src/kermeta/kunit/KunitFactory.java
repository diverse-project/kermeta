/**
 * <copyright>
 * </copyright>
 *
 * $Id: KunitFactory.java,v 1.9 2008-11-27 15:50:05 cfaucher Exp $
 */
package kermeta.kunit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.kunit.KunitPackage
 * @generated
 */
public interface KunitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KunitFactory eINSTANCE = kermeta.kunit.impl.KunitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assertion Failed Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Failed Error</em>'.
	 * @generated
	 */
	AssertionFailedError createAssertionFailedError();

	/**
	 * Returns a new object of class '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert</em>'.
	 * @generated
	 */
	Assert createAssert();

	/**
	 * Returns a new object of class '<em>Invalid Test Case Name Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Test Case Name Exception</em>'.
	 * @generated
	 */
	InvalidTestCaseNameException createInvalidTestCaseNameException();

	/**
	 * Returns a new object of class '<em>Invalid Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Parameter Exception</em>'.
	 * @generated
	 */
	InvalidParameterException createInvalidParameterException();

	/**
	 * Returns a new object of class '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log</em>'.
	 * @generated
	 */
	Log createLog();

	/**
	 * Returns a new object of class '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure</em>'.
	 * @generated
	 */
	Failure createFailure();

	/**
	 * Returns a new object of class '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error</em>'.
	 * @generated
	 */
	kermeta.kunit.Error createError();

	/**
	 * Returns a new object of class '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite</em>'.
	 * @generated
	 */
	TestSuite createTestSuite();

	/**
	 * Returns a new object of class '<em>Test Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Runner</em>'.
	 * @generated
	 */
	TestRunner createTestRunner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KunitPackage getKunitPackage();

} //KunitFactory
