/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: AssertionFailedErrorImpl.java,v 1.12 2009-02-23 15:26:38 cfaucher Exp $
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
