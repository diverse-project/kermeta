/**
 * $Id: SMPackageImpl.java,v 1.4 2008-01-09 14:12:57 cfaucher Exp $
 * Project : org.kermeta.simk
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 nov. 07
 * Authors : Cyril Faucher <cfaucher@irisa.fr> (first iteration)
 *
 * $Id: SMPackageImpl.java,v 1.4 2008-01-09 14:12:57 cfaucher Exp $
 */
package org.kermeta.simk.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.simk.SMClass;
import org.kermeta.simk.SMPackage;
import org.kermeta.simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.simk.impl.SMPackageImpl#getSMClass <em>SM Class</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMPackageImpl#getSubSMPackage <em>Sub SM Package</em>}</li>
 *   <li>{@link org.kermeta.simk.impl.SMPackageImpl#getParentSMPackage <em>Parent SM Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMPackageImpl extends SMNamedElementImpl implements SMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimkPackage.Literals.SM_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMClass getSMClass() {
		return (SMClass)eGet(SimkPackage.Literals.SM_PACKAGE__SM_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSMClass(SMClass newSMClass) {
		eSet(SimkPackage.Literals.SM_PACKAGE__SM_CLASS, newSMClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMPackage getSubSMPackage() {
		return (SMPackage)eGet(SimkPackage.Literals.SM_PACKAGE__SUB_SM_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSMPackage(SMPackage newSubSMPackage) {
		eSet(SimkPackage.Literals.SM_PACKAGE__SUB_SM_PACKAGE, newSubSMPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMPackage getParentSMPackage() {
		return (SMPackage)eGet(SimkPackage.Literals.SM_PACKAGE__PARENT_SM_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSMPackage(SMPackage newParentSMPackage) {
		eSet(SimkPackage.Literals.SM_PACKAGE__PARENT_SM_PACKAGE, newParentSMPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedNameRec(SMPackage element) {
		if (element == null) return "";
		if (element.getParentSMPackage() != null) {
			return getQualifiedNameRec( element.getParentSMPackage() ) + "." + element.getName();
		} else {
			return element.getName();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return getQualifiedNameRec(this);
	}

} //SMPackageImpl
