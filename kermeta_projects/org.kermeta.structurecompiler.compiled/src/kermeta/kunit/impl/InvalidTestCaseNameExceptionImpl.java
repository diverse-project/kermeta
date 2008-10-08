/**
 * <copyright>
 * </copyright>
 *
 * $Id: InvalidTestCaseNameExceptionImpl.java,v 1.4 2008-10-08 14:37:23 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.exceptions.impl.ExceptionImpl;

import kermeta.kunit.InvalidTestCaseNameException;
import kermeta.kunit.KunitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invalid Test Case Name Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InvalidTestCaseNameExceptionImpl extends ExceptionImpl implements
		InvalidTestCaseNameException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvalidTestCaseNameExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.INVALID_TEST_CASE_NAME_EXCEPTION;
	}

} //InvalidTestCaseNameExceptionImpl
