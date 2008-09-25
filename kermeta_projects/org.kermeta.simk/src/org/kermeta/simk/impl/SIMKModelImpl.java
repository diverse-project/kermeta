/**
 * $Id: SIMKModelImpl.java,v 1.7 2008-09-25 08:50:46 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SIMKModelImpl.java,v 1.7 2008-09-25 08:50:46 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.simk.FunctionType;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMMethod;
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
 *   <li>{@link org.kermeta.simk.impl.SIMKModelImpl#getSMMethods <em>SM Methods</em>}</li>
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
	public EList<SMMethod> getSMMethods() {
		return (EList<SMMethod>)eGet(SimkPackage.Literals.SIMK_MODEL__SM_METHODS, true);
	}

} //SIMKModelImpl
