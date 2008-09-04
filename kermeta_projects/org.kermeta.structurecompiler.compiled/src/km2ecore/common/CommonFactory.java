/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommonFactory.java,v 1.1 2008-09-04 15:40:44 cfaucher Exp $
 */
package km2ecore.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = km2ecore.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Key Word List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Key Word List</em>'.
	 * @generated
	 */
	JavaKeyWordList createJavaKeyWordList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
