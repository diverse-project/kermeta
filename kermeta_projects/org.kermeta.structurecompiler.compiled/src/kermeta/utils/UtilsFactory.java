/**
 * <copyright>
 * </copyright>
 *
 * $Id: UtilsFactory.java,v 1.8 2008-11-07 08:53:58 cfaucher Exp $
 */
package kermeta.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.utils.UtilsPackage
 * @generated
 */
public interface UtilsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsFactory eINSTANCE = kermeta.utils.impl.UtilsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack</em>'.
	 * @generated
	 */
	<G> Stack<G> createStack();

	/**
	 * Returns a new object of class '<em>Hashtable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashtable</em>'.
	 * @generated
	 */
	<K, V> Hashtable<K, V> createHashtable();

	/**
	 * Returns a new object of class '<em>String Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Buffer</em>'.
	 * @generated
	 */
	kermeta.utils.StringBuffer createStringBuffer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilsPackage getUtilsPackage();

} //UtilsFactory
