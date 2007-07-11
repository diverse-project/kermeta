/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.KmPackage
 * @generated
 */
public interface KmFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmFactory eINSTANCE = fr.irisa.triskell.kermeta.impl.KmFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KmPackage getKmPackage();

} //KmFactory
