/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerFactory.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.compiler.model.compiler.CompilerPackage
 * @generated
 */
public interface CompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompilerFactory eINSTANCE = org.kermeta.compiler.model.compiler.impl.CompilerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kermeta Compiler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kermeta Compiler</em>'.
	 * @generated
	 */
	KermetaCompiler createKermetaCompiler();

	/**
	 * Returns a new object of class '<em>Ecore Compiler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecore Compiler</em>'.
	 * @generated
	 */
	EcoreCompiler createEcoreCompiler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompilerPackage getCompilerPackage();

} //CompilerFactory
