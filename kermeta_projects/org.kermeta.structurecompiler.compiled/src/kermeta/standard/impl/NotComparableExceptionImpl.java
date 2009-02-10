/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: NotComparableExceptionImpl.java,v 1.11 2009-02-10 17:51:51 cfaucher Exp $
 */
package kermeta.standard.impl;

import kermeta.exceptions.impl.ExceptionImpl;

import kermeta.standard.NotComparableException;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Comparable Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotComparableExceptionImpl extends ExceptionImpl implements
		NotComparableException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotComparableExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.NOT_COMPARABLE_EXCEPTION;
	}

} //NotComparableExceptionImpl
