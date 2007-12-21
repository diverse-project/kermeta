/**
 * $Id: SMClassImpl.java,v 1.3 2007-12-21 14:17:03 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMClassImpl.java,v 1.3 2007-12-21 14:17:03 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMPackage;
import org.kermeta.simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SMClassImpl#getSMPackage <em>SM Package</em>}</li>
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
	protected SMClassImpl() {
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
	public SMPackage getSMPackage() {
		return (SMPackage)eGet(SimkPackage.Literals.SM_CLASS__SM_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMPackage(SMPackage newSMPackage) {
		eSet(SimkPackage.Literals.SM_CLASS__SM_PACKAGE, newSMPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		if ( getSMPackage() != null ) {
			return getSMPackage().getQualifiedName() + "." + getName();
		}
		return getName();
	}

} //SMClassImpl
