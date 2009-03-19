/**
 * <copyright>
 * </copyright>
 *
 * $Id: FacadeFactory.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.facade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.facade.FacadePackage
 * @generated
 */
public interface FacadeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacadeFactory eINSTANCE = emf.spoon.facade.impl.FacadeFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacadePackage getFacadePackage();

} //FacadeFactory
