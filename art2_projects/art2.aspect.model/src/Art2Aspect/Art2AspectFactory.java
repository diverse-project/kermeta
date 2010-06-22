/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Art2Aspect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Art2Aspect.Art2AspectPackage
 * @generated
 */
public interface Art2AspectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2AspectFactory eINSTANCE = Art2Aspect.impl.Art2AspectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aspect Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Root</em>'.
	 * @generated
	 */
	AspectRoot createAspectRoot();

	/**
	 * Returns a new object of class '<em>Aspect Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Definition</em>'.
	 * @generated
	 */
	AspectDefinition createAspectDefinition();

	/**
	 * Returns a new object of class '<em>Pointcut Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointcut Definition</em>'.
	 * @generated
	 */
	PointcutDefinition createPointcutDefinition();

	/**
	 * Returns a new object of class '<em>Binding Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Pattern</em>'.
	 * @generated
	 */
	BindingPattern createBindingPattern();

	/**
	 * Returns a new object of class '<em>Component Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Pattern</em>'.
	 * @generated
	 */
	ComponentTypePattern createComponentTypePattern();

	/**
	 * Returns a new object of class '<em>Node Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Pattern</em>'.
	 * @generated
	 */
	NodePattern createNodePattern();

	/**
	 * Returns a new object of class '<em>Port Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Pattern</em>'.
	 * @generated
	 */
	PortPattern createPortPattern();

	/**
	 * Returns a new object of class '<em>Component Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Pattern</em>'.
	 * @generated
	 */
	ComponentPattern createComponentPattern();

	/**
	 * Returns a new object of class '<em>Port Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type Pattern</em>'.
	 * @generated
	 */
	PortTypePattern createPortTypePattern();

	/**
	 * Returns a new object of class '<em>Port Type Ref Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type Ref Pattern</em>'.
	 * @generated
	 */
	PortTypeRefPattern createPortTypeRefPattern();

	/**
	 * Returns a new object of class '<em>Pattern Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Named Element</em>'.
	 * @generated
	 */
	PatternNamedElement createPatternNamedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Art2AspectPackage getArt2AspectPackage();

} //Art2AspectFactory
