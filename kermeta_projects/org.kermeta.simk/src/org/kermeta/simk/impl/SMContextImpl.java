/**
 * $Id: SMContextImpl.java,v 1.5 2008-08-26 09:14:29 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMContextImpl.java,v 1.5 2008-08-26 09:14:29 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SimkPackage;
import org.kermeta.simk.StaticMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SMContextImpl#getStaticMethods <em>Static Methods</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMContextImpl#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMContextImpl#getQualifiedNameFinalPackage <em>Qualified Name Final Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMContextImpl extends EObjectImpl implements SMContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StaticMethod> getStaticMethods() {
		return (EList<StaticMethod>)eGet(SimkPackage.Literals.SM_CONTEXT__STATIC_METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClass getSMClass() {
		return (SMClass)eGet(SimkPackage.Literals.SM_CONTEXT__SM_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMClass(SMClass newSMClass) {
		eSet(SimkPackage.Literals.SM_CONTEXT__SM_CLASS, newSMClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedNameFinalPackage() {
		return (String)eGet(SimkPackage.Literals.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedNameFinalPackage(String newQualifiedNameFinalPackage) {
		eSet(SimkPackage.Literals.SM_CONTEXT__QUALIFIED_NAME_FINAL_PACKAGE, newQualifiedNameFinalPackage);
	}

} //SMContextImpl
