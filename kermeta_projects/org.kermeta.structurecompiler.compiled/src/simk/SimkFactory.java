/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimkFactory.java,v 1.10 2009-01-21 09:16:06 cfaucher Exp $
 */
package simk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simk.SimkPackage
 * @generated
 */
public interface SimkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimkFactory eINSTANCE = simk.impl.SimkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SIMK Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIMK Model</em>'.
	 * @generated
	 */
	SIMKModel createSIMKModel();

	/**
	 * Returns a new object of class '<em>SM Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Class</em>'.
	 * @generated
	 */
	SMClass createSMClass();

	/**
	 * Returns a new object of class '<em>SM Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Method</em>'.
	 * @generated
	 */
	SMMethod createSMMethod();

	/**
	 * Returns a new object of class '<em>SM Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Context</em>'.
	 * @generated
	 */
	SMContext createSMContext();

	/**
	 * Returns a new object of class '<em>SM Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Parameter</em>'.
	 * @generated
	 */
	SMParameter createSMParameter();

	/**
	 * Returns a new object of class '<em>SM Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM Return</em>'.
	 * @generated
	 */
	SMReturn createSMReturn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimkPackage getSimkPackage();

} //SimkFactory
