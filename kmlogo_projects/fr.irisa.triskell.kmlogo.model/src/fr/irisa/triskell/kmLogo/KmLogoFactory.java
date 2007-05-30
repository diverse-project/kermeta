/**
 * <copyright>
 * </copyright>
 *
 * $Id: KmLogoFactory.java,v 1.1 2007-05-30 13:23:35 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kmLogo.KmLogoPackage
 * @generated
 */
public interface KmLogoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmLogoFactory eINSTANCE = fr.irisa.triskell.kmLogo.impl.KmLogoFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KmLogoPackage getKmLogoPackage();

} //KmLogoFactory
