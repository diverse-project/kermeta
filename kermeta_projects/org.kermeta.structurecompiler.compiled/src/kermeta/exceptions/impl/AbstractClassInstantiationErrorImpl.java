/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: AbstractClassInstantiationErrorImpl.java,v 1.11 2009-02-10 17:51:43 cfaucher Exp $
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
