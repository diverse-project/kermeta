/**
 * $Id: SMClassImpl.java,v 1.7 2008-08-26 09:14:29 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMClassImpl.java,v 1.7 2008-08-26 09:14:29 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMContext;
import org.kermeta.simk.SMUsage;
import org.kermeta.simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SMClassImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMClassImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMClassImpl extends SMNamedElementImpl implements SMClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SMUsage getUsages() {
		return (SMUsage)eGet(SimkPackage.Literals.SM_CLASS__USAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsages(SMUsage newUsages) {
		eSet(SimkPackage.Literals.SM_CLASS__USAGES, newUsages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMContext getContext() {
		return (SMContext)eGet(SimkPackage.Literals.SM_CLASS__CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(SMContext newContext) {
		eSet(SimkPackage.Literals.SM_CLASS__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		String qn_finalPackage = getContext().getQualifiedNameFinalPackage();
		if ( ! qn_finalPackage.equals("") ) {
			return qn_finalPackage + "." + getName();
		}
		return getName();
	}

} //SMClassImpl
