/**
 * $Id: SIMKModelImpl.java,v 1.5 2008-07-23 15:17:23 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SIMKModelImpl.java,v 1.5 2008-07-23 15:17:23 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.simk.FunctionType;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SimkPackage;
import org.kermeta.simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIMK Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SIMKModelImpl#getSMContexts <em>SM Contexts</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SIMKModelImpl#getStaticMethods <em>Static Methods</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SIMKModelImpl#getFunctionTypes <em>Function Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SIMKModelImpl extends SMNamedElementImpl implements SIMKModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIMKModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SIMK_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SMContext> getSMContexts() {
		return (EList<SMContext>)eGet(SimkPackage.Literals.SIMK_MODEL__SM_CONTEXTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StaticMethod> getStaticMethods() {
		return (EList<StaticMethod>)eGet(SimkPackage.Literals.SIMK_MODEL__STATIC_METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FunctionType> getFunctionTypes() {
		return (EList<FunctionType>)eGet(SimkPackage.Literals.SIMK_MODEL__FUNCTION_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextId() {
		return getStaticMethods().size()+1;
	}

} //SIMKModelImpl
