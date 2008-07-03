/**
 * <copyright>
 * </copyright>
 *
 * $Id: KruntimeconfigurationFactory.java,v 1.1 2008-07-03 15:20:45 ftanguy Exp $
 */
package org.kermeta.kruntimeconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.kruntimeconfiguration.KruntimeconfigurationPackage
 * @generated
 */
public interface KruntimeconfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KruntimeconfigurationFactory eINSTANCE = org.kermeta.kruntimeconfiguration.impl.KruntimeconfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KruntimeconfigurationPackage getKruntimeconfigurationPackage();

} //KruntimeconfigurationFactory
