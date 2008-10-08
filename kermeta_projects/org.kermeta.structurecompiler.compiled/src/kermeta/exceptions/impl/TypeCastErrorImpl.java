/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeCastErrorImpl.java,v 1.4 2008-10-08 14:37:20 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.TypeCastError;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cast Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeCastErrorImpl extends RuntimeErrorImpl implements
		TypeCastError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCastErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.TYPE_CAST_ERROR;
	}

} //TypeCastErrorImpl
