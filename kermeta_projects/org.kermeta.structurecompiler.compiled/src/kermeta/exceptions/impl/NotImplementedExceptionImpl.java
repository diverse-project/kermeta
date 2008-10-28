/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotImplementedExceptionImpl.java,v 1.6 2008-10-28 13:18:08 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.NotImplementedException;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Implemented Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotImplementedExceptionImpl extends RuntimeErrorImpl implements
		NotImplementedException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImplementedExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.NOT_IMPLEMENTED_EXCEPTION;
	}

} //NotImplementedExceptionImpl
