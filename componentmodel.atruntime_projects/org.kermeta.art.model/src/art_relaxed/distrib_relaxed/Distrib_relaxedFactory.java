/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.distrib_relaxed;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see art_relaxed.distrib_relaxed.Distrib_relaxedPackage
 * @generated
 */
public interface Distrib_relaxedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Distrib_relaxedFactory eINSTANCE = art_relaxed.distrib_relaxed.impl.Distrib_relaxedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Distrib_relaxedPackage getDistrib_relaxedPackage();

} //Distrib_relaxedFactory
