/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectFactory.java,v 1.1 2007/02/14 20:38:04 barais Exp $
 */
package emf.spoon.reflect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.ReflectPackage
 * @generated
 */
public interface ReflectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReflectFactory eINSTANCE = emf.spoon.reflect.impl.ReflectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy</em>'.
	 * @generated
	 */
	Dummy createDummy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReflectPackage getReflectPackage();

} //ReflectFactory
