/**
 * <copyright>
 * </copyright>
 *
 * $Id: Km2ecoreFactory.java,v 1.6 2008-10-28 13:18:09 cfaucher Exp $
 */
package km2ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.Km2ecorePackage
 * @generated
 */
public interface Km2ecoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Km2ecoreFactory eINSTANCE = km2ecore.impl.Km2ecoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Tracer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Tracer</em>'.
	 * @generated
	 */
	SourceTracer createSourceTracer();

	/**
	 * Returns a new object of class '<em>KM2 Ecore Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KM2 Ecore Context</em>'.
	 * @generated
	 */
	KM2EcoreContext createKM2EcoreContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Km2ecorePackage getKm2ecorePackage();

} //Km2ecoreFactory
