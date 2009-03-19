/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpoonFactory.java,v 1.1 2007/02/14 20:38:07 barais Exp $
 */
package emf.spoon;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.SpoonPackage
 * @generated
 */
public interface SpoonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpoonFactory eINSTANCE = emf.spoon.impl.SpoonFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpoonPackage getSpoonPackage();

} //SpoonFactory
