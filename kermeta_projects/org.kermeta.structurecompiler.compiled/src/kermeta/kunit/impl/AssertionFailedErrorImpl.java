/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssertionFailedErrorImpl.java,v 1.6 2008-10-28 13:18:09 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.exceptions.impl.ExceptionImpl;

import kermeta.kunit.AssertionFailedError;
import kermeta.kunit.KunitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion Failed Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssertionFailedErrorImpl extends ExceptionImpl implements
		AssertionFailedError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionFailedErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.ASSERTION_FAILED_ERROR;
	}

} //AssertionFailedErrorImpl
