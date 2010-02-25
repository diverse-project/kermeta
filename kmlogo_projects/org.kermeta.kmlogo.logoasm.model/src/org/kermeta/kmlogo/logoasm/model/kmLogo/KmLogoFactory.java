/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.kmlogo.logoasm.model.kmLogo.KmLogoPackage
 * @generated
 */
public interface KmLogoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmLogoFactory eINSTANCE = org.kermeta.kmlogo.logoasm.model.kmLogo.impl.KmLogoFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KmLogoPackage getKmLogoPackage();

} //KmLogoFactory
