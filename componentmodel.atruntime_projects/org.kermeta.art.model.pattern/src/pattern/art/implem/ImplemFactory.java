/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.implem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pattern.art.implem.ImplemPackage
 * @generated
 */
public interface ImplemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplemFactory eINSTANCE = pattern.art.implem.impl.ImplemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Implementation</em>'.
	 * @generated
	 */
	ComponentImplementation createComponentImplementation();

	/**
	 * Returns a new object of class '<em>Fractal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fractal Component</em>'.
	 * @generated
	 */
	FractalComponent createFractalComponent();

	/**
	 * Returns a new object of class '<em>OS Gi Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Gi Component</em>'.
	 * @generated
	 */
	OSGiComponent createOSGiComponent();

	/**
	 * Returns a new object of class '<em>Type Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Implementation</em>'.
	 * @generated
	 */
	TypeImplementation createTypeImplementation();

	/**
	 * Returns a new object of class '<em>OS Gi Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Gi Type</em>'.
	 * @generated
	 */
	OSGiType createOSGiType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImplemPackage getImplemPackage();

} //ImplemFactory
