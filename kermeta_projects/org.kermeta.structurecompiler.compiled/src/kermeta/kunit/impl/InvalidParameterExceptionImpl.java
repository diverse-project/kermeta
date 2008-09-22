/**
 * <copyright>
 * </copyright>
 *
 * $Id: InvalidParameterExceptionImpl.java,v 1.3 2008-09-22 14:46:09 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.exceptions.impl.ExceptionImpl;

import kermeta.kunit.InvalidParameterException;
import kermeta.kunit.KunitPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invalid Parameter Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InvalidParameterExceptionImpl extends ExceptionImpl implements
		InvalidParameterException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvalidParameterExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KunitPackage.Literals.INVALID_PARAMETER_EXCEPTION;
	}

} //InvalidParameterExceptionImpl
