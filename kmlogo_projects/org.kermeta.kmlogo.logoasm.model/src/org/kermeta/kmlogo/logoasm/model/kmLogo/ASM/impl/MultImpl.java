/*$Id : MultImpl.java v 1.3 May 8, 2010 9:38:47 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model
* File : 	MultImpl.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage;
import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultImpl extends BinaryExpImpl implements Mult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASMPackage.Literals.MULT;
	}

} //MultImpl
