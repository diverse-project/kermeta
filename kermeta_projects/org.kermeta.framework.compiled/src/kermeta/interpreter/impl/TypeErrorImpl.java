/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeErrorImpl.java,v 1.2 2008-08-19 13:23:00 cfaucher Exp $
 */
package kermeta.interpreter.impl;

import kermeta.interpreter.InterpreterPackage;
import kermeta.interpreter.TypeError;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeErrorImpl extends KermetaErrorImpl implements TypeError {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterpreterPackage.Literals.TYPE_ERROR;
	}

} //TypeErrorImpl
