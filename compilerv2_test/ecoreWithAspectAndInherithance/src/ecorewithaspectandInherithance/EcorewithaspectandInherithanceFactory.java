/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecorewithaspectandInherithance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecorewithaspectandInherithance.EcorewithaspectandInherithancePackage
 * @generated
 */
public interface EcorewithaspectandInherithanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorewithaspectandInherithanceFactory eINSTANCE = ecorewithaspectandInherithance.impl.EcorewithaspectandInherithanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A</em>'.
	 * @generated
	 */
	A createA();

	/**
	 * Returns a new object of class '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B</em>'.
	 * @generated
	 */
	B createB();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorewithaspectandInherithancePackage getEcorewithaspectandInherithancePackage();

} //EcorewithaspectandInherithanceFactory
