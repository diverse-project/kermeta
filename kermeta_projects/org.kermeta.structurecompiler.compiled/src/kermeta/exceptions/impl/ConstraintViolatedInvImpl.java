/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ConstraintViolatedInvImpl.java,v 1.12 2009-02-23 15:26:38 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ConstraintViolatedInv;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Violated Inv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstraintViolatedInvImpl extends ConstraintViolatedExceptionImpl
		implements ConstraintViolatedInv {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintViolatedInvImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CONSTRAINT_VIOLATED_INV;
	}

} //ConstraintViolatedInvImpl
