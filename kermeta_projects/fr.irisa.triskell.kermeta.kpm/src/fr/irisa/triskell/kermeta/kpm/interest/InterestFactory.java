/**
 * <copyright>
 * </copyright>
 *
 * $Id: InterestFactory.java,v 1.1 2007-04-04 13:43:56 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.interest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.kpm.interest.InterestPackage
 * @generated
 */
public interface InterestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterestFactory eINSTANCE = fr.irisa.triskell.kermeta.kpm.interest.impl.InterestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	InterestKey createInterestKey();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	InterestEntry createInterestEntry();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	InterestHost createInterestHost();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterestPackage getInterestPackage();

} //InterestFactory
