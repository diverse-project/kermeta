/*$Id : MinusImpl.java v 1.3 May 8, 2010 9:38:47 AM hrambelo Exp $
* Project : org.kermeta.kmlogo.logoasm.model
* File : 	MinusImpl.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1 2010
* ----------------------------------------------------------------------------
* Creation date : May 8, 2010
* Authors : Haja RAMBELONTSALAMA
*/
package org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ASMPackage;
import org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinusImpl extends BinaryExpImpl implements Minus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASMPackage.Literals.MINUS;
	}

} //MinusImpl
