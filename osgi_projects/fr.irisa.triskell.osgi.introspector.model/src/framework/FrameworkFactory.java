/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkFactory.java,v 1.2 2008-07-31 13:43:53 edaubert Exp $
 */
package framework;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see framework.FrameworkPackage
 * @generated
 */
public interface FrameworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	FrameworkFactory eINSTANCE = framework.impl.FrameworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Framework</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Framework</em>'.
	 * @generated
	 */
	Framework createFramework();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FrameworkPackage getFrameworkPackage();

} // FrameworkFactory
