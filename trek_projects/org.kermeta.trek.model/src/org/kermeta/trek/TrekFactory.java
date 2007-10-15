/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekFactory.java,v 1.1 2007-10-15 16:54:07 fmunoz Exp $
 */
package org.kermeta.trek;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.trek.TrekPackage
 * @generated
 */
public interface TrekFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrekFactory eINSTANCE = org.kermeta.trek.impl.TrekFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Use Kase Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Kase Model</em>'.
	 * @generated
	 */
	UseKaseModel createUseKaseModel();

	/**
	 * Returns a new object of class '<em>KUse Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KUse Case</em>'.
	 * @generated
	 */
	KUseCase createKUseCase();

	/**
	 * Returns a new object of class '<em>KTest Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KTest Case</em>'.
	 * @generated
	 */
	KTestCase createKTestCase();

	/**
	 * Returns a new object of class '<em>KUser Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KUser Story</em>'.
	 * @generated
	 */
	KUserStory createKUserStory();

	/**
	 * Returns a new object of class '<em>KTag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KTag Element</em>'.
	 * @generated
	 */
	KTagElement createKTagElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrekPackage getTrekPackage();

} //TrekFactory
