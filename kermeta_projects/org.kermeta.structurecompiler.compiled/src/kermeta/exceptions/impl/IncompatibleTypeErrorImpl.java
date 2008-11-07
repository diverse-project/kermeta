/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncompatibleTypeErrorImpl.java,v 1.8 2008-11-07 08:52:25 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.IncompatibleTypeError;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incompatible Type Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IncompatibleTypeErrorImpl extends RuntimeErrorImpl implements
		IncompatibleTypeError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncompatibleTypeErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.INCOMPATIBLE_TYPE_ERROR;
	}

} //IncompatibleTypeErrorImpl
