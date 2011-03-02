/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.orgPackage
 * @generated
 */
public interface orgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	orgFactory eINSTANCE = org.impl.orgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Class</em>'.
	 * @generated
	 */
	DummyClass createDummyClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	orgPackage getorgPackage();

} //orgFactory
