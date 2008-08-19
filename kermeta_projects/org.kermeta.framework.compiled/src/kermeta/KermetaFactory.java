/**
 * <copyright>
 * </copyright>
 *
 * $Id: KermetaFactory.java,v 1.2 2008-08-19 13:23:06 cfaucher Exp $
 */
package kermeta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.KermetaPackage
 * @generated
 */
public interface KermetaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KermetaFactory eINSTANCE = kermeta.impl.KermetaFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KermetaPackage getKermetaPackage();

} //KermetaFactory
