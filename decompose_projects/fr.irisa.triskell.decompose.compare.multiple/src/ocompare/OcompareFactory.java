/**
 * <copyright>
 * </copyright>
 *
 * $Id: OcompareFactory.java,v 1.1 2008-10-13 20:03:35 fmunoz Exp $
 */
package ocompare;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ocompare.OcomparePackage
 * @generated
 */
public interface OcompareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OcompareFactory eINSTANCE = ocompare.impl.OcompareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compare Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Element</em>'.
	 * @generated
	 */
	CompareElement createCompareElement();

	/**
	 * Returns a new object of class '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare</em>'.
	 * @generated
	 */
	Compare createCompare();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OcomparePackage getOcomparePackage();

} //OcompareFactory
