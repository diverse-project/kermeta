/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerFactoryImpl.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.compiler.model.compiler.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilerFactoryImpl extends EFactoryImpl implements CompilerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompilerFactory init() {
		try {
			CompilerFactory theCompilerFactory = (CompilerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/compiler"); 
			if (theCompilerFactory != null) {
				return theCompilerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompilerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompilerPackage.KERMETA_COMPILER: return createKermetaCompiler();
			case CompilerPackage.ECORE_COMPILER: return createEcoreCompiler();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KermetaCompiler createKermetaCompiler() {
		KermetaCompilerImpl kermetaCompiler = new KermetaCompilerImpl();
		return kermetaCompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreCompiler createEcoreCompiler() {
		EcoreCompilerImpl ecoreCompiler = new EcoreCompilerImpl();
		return ecoreCompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerPackage getCompilerPackage() {
		return (CompilerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompilerPackage getPackage() {
		return CompilerPackage.eINSTANCE;
	}

} //CompilerFactoryImpl
