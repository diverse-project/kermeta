/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractClassInstantiationErrorImpl.java,v 1.10 2009-01-21 09:15:49 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.AbstractClassInstantiationError;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Class Instantiation Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbstractClassInstantiationErrorImpl extends RuntimeErrorImpl
		implements AbstractClassInstantiationError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractClassInstantiationErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.ABSTRACT_CLASS_INSTANTIATION_ERROR;
	}

} //AbstractClassInstantiationErrorImpl
