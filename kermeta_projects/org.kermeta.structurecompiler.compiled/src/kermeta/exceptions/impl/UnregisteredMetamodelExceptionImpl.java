/**
 * <copyright>
 * </copyright>
 *
 * $Id: UnregisteredMetamodelExceptionImpl.java,v 1.7 2008-10-29 08:29:09 cfaucher Exp $
 */
package kermeta.exceptions.impl;

import kermeta.exceptions.ExceptionsPackage;
import kermeta.exceptions.UnregisteredMetamodelException;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unregistered Metamodel Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnregisteredMetamodelExceptionImpl extends ExceptionImpl implements
		UnregisteredMetamodelException {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredMetamodelExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExceptionsPackage.Literals.UNREGISTERED_METAMODEL_EXCEPTION;
	}

} //UnregisteredMetamodelExceptionImpl
