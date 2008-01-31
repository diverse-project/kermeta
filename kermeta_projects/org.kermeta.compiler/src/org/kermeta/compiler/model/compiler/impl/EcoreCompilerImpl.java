/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreCompilerImpl.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler.impl;

import org.eclipse.emf.ecore.EClass;

import org.kermeta.compiler.model.compiler.CompilerPackage;
import org.kermeta.compiler.model.compiler.EcoreCompiler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Compiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreCompilerImpl extends AbstractCompilerImpl implements EcoreCompiler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreCompilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.ECORE_COMPILER;
	}

} //EcoreCompilerImpl
