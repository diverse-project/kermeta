/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerPackageImpl.java,v 1.1 2008-01-31 13:28:18 cfaucher Exp $
 */
package org.kermeta.compiler.model.compiler.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.compiler.model.compiler.AbstractCompiler;
import org.kermeta.compiler.model.compiler.CompilerFactory;
import org.kermeta.compiler.model.compiler.CompilerPackage;
import org.kermeta.compiler.model.compiler.EcoreCompiler;
import org.kermeta.compiler.model.compiler.KermetaCompiler;

import org.kermeta.simk.SimkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilerPackageImpl extends EPackageImpl implements CompilerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCompilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermetaCompilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreCompilerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.compiler.model.compiler.CompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompilerPackageImpl() {
		super(eNS_URI, CompilerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompilerPackage init() {
		if (isInited) return (CompilerPackage)EPackage.Registry.INSTANCE.getEPackage(CompilerPackage.eNS_URI);

		// Obtain or create and register package
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CompilerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();
		SimkPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompilerPackage.freeze();

		return theCompilerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCompiler() {
		return abstractCompilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCompiler_SimkModel() {
		return (EReference)abstractCompilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCompiler_GenModels() {
		return (EReference)abstractCompilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCompiler_RootGenModel() {
		return (EReference)abstractCompilerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermetaCompiler() {
		return kermetaCompilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreCompiler() {
		return ecoreCompilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerFactory getCompilerFactory() {
		return (CompilerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCompilerEClass = createEClass(ABSTRACT_COMPILER);
		createEReference(abstractCompilerEClass, ABSTRACT_COMPILER__SIMK_MODEL);
		createEReference(abstractCompilerEClass, ABSTRACT_COMPILER__GEN_MODELS);
		createEReference(abstractCompilerEClass, ABSTRACT_COMPILER__ROOT_GEN_MODEL);

		kermetaCompilerEClass = createEClass(KERMETA_COMPILER);

		ecoreCompilerEClass = createEClass(ECORE_COMPILER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SimkPackage theSimkPackage = (SimkPackage)EPackage.Registry.INSTANCE.getEPackage(SimkPackage.eNS_URI);
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kermetaCompilerEClass.getESuperTypes().add(this.getAbstractCompiler());
		ecoreCompilerEClass.getESuperTypes().add(this.getAbstractCompiler());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractCompilerEClass, AbstractCompiler.class, "AbstractCompiler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCompiler_SimkModel(), theSimkPackage.getSIMKModel(), null, "simkModel", null, 0, 1, AbstractCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCompiler_GenModels(), theGenModelPackage.getGenModel(), null, "genModels", null, 0, -1, AbstractCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCompiler_RootGenModel(), theGenModelPackage.getGenModel(), null, "rootGenModel", null, 1, 1, AbstractCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(abstractCompilerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kermetaCompilerEClass, KermetaCompiler.class, "KermetaCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreCompilerEClass, EcoreCompiler.class, "EcoreCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CompilerPackageImpl
