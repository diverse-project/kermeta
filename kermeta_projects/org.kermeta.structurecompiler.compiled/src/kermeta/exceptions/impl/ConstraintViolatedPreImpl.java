/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: ConstraintViolatedPreImpl.java,v 1.11 2009-02-10 17:51:43 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ConstraintViolatedPre;
import kermeta.exceptions.ExceptionsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Violated Pre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstraintViolatedPreImpl extends ConstraintViolatedExceptionImpl
		implements ConstraintViolatedPre {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintViolatedPreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.CONSTRAINT_VIOLATED_PRE;
	}

} //ConstraintViolatedPreImpl
