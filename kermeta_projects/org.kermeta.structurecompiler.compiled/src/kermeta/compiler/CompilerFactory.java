/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerFactory.java,v 1.9 2008-11-27 15:50:09 cfaucher Exp $
 */
package kermeta.compiler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.compiler.CompilerPackage
 * @generated
 */
public interface CompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompilerFactory eINSTANCE = kermeta.compiler.impl.CompilerFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompilerPackage getCompilerPackage();

} //CompilerFactory
