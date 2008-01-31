/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerPackage.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.compiler.model.compiler.CompilerFactory
 * @model kind="package"
 * @generated
 */
public interface CompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/compiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompilerPackage eINSTANCE = org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl <em>Abstract Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl
	 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getAbstractCompiler()
	 * @generated
	 */
	int ABSTRACT_COMPILER = 0;

	/**
	 * The feature id for the '<em><b>Simk Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPILER__SIMK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gen Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPILER__GEN_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Root Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPILER__ROOT_GEN_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Abstract Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPILER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.compiler.model.compiler.impl.KermetaCompilerImpl <em>Kermeta Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.compiler.model.compiler.impl.KermetaCompilerImpl
	 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getKermetaCompiler()
	 * @generated
	 */
	int KERMETA_COMPILER = 1;

	/**
	 * The feature id for the '<em><b>Simk Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_COMPILER__SIMK_MODEL = ABSTRACT_COMPILER__SIMK_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_COMPILER__GEN_MODELS = ABSTRACT_COMPILER__GEN_MODELS;

	/**
	 * The feature id for the '<em><b>Root Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_COMPILER__ROOT_GEN_MODEL = ABSTRACT_COMPILER__ROOT_GEN_MODEL;

	/**
	 * The number of structural features of the '<em>Kermeta Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_COMPILER_FEATURE_COUNT = ABSTRACT_COMPILER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.compiler.model.compiler.impl.EcoreCompilerImpl <em>Ecore Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.compiler.model.compiler.impl.EcoreCompilerImpl
	 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getEcoreCompiler()
	 * @generated
	 */
	int ECORE_COMPILER = 2;

	/**
	 * The feature id for the '<em><b>Simk Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_COMPILER__SIMK_MODEL = ABSTRACT_COMPILER__SIMK_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_COMPILER__GEN_MODELS = ABSTRACT_COMPILER__GEN_MODELS;

	/**
	 * The feature id for the '<em><b>Root Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_COMPILER__ROOT_GEN_MODEL = ABSTRACT_COMPILER__ROOT_GEN_MODEL;

	/**
	 * The number of structural features of the '<em>Ecore Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_COMPILER_FEATURE_COUNT = ABSTRACT_COMPILER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.kermeta.compiler.model.compiler.AbstractCompiler <em>Abstract Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Compiler</em>'.
	 * @see org.kermeta.compiler.model.compiler.AbstractCompiler
	 * @generated
	 */
	EClass getAbstractCompiler();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getSimkModel <em>Simk Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simk Model</em>'.
	 * @see org.kermeta.compiler.model.compiler.AbstractCompiler#getSimkModel()
	 * @see #getAbstractCompiler()
	 * @generated
	 */
	EReference getAbstractCompiler_SimkModel();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getGenModels <em>Gen Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Models</em>'.
	 * @see org.kermeta.compiler.model.compiler.AbstractCompiler#getGenModels()
	 * @see #getAbstractCompiler()
	 * @generated
	 */
	EReference getAbstractCompiler_GenModels();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.compiler.model.compiler.AbstractCompiler#getRootGenModel <em>Root Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Gen Model</em>'.
	 * @see org.kermeta.compiler.model.compiler.AbstractCompiler#getRootGenModel()
	 * @see #getAbstractCompiler()
	 * @generated
	 */
	EReference getAbstractCompiler_RootGenModel();

	/**
	 * Returns the meta object for class '{@link org.kermeta.compiler.model.compiler.KermetaCompiler <em>Kermeta Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Compiler</em>'.
	 * @see org.kermeta.compiler.model.compiler.KermetaCompiler
	 * @generated
	 */
	EClass getKermetaCompiler();

	/**
	 * Returns the meta object for class '{@link org.kermeta.compiler.model.compiler.EcoreCompiler <em>Ecore Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore Compiler</em>'.
	 * @see org.kermeta.compiler.model.compiler.EcoreCompiler
	 * @generated
	 */
	EClass getEcoreCompiler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompilerFactory getCompilerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl <em>Abstract Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.compiler.model.compiler.impl.AbstractCompilerImpl
		 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getAbstractCompiler()
		 * @generated
		 */
		EClass ABSTRACT_COMPILER = eINSTANCE.getAbstractCompiler();

		/**
		 * The meta object literal for the '<em><b>Simk Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPILER__SIMK_MODEL = eINSTANCE.getAbstractCompiler_SimkModel();

		/**
		 * The meta object literal for the '<em><b>Gen Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPILER__GEN_MODELS = eINSTANCE.getAbstractCompiler_GenModels();

		/**
		 * The meta object literal for the '<em><b>Root Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPILER__ROOT_GEN_MODEL = eINSTANCE.getAbstractCompiler_RootGenModel();

		/**
		 * The meta object literal for the '{@link org.kermeta.compiler.model.compiler.impl.KermetaCompilerImpl <em>Kermeta Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.compiler.model.compiler.impl.KermetaCompilerImpl
		 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getKermetaCompiler()
		 * @generated
		 */
		EClass KERMETA_COMPILER = eINSTANCE.getKermetaCompiler();

		/**
		 * The meta object literal for the '{@link org.kermeta.compiler.model.compiler.impl.EcoreCompilerImpl <em>Ecore Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.compiler.model.compiler.impl.EcoreCompilerImpl
		 * @see org.kermeta.compiler.model.compiler.impl.CompilerPackageImpl#getEcoreCompiler()
		 * @generated
		 */
		EClass ECORE_COMPILER = eINSTANCE.getEcoreCompiler();

	}

} //CompilerPackage
