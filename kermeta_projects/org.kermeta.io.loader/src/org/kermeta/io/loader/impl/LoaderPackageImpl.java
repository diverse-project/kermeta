/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoaderPackageImpl.java,v 1.3 2008-02-27 15:21:09 dvojtise Exp $
 */
package org.kermeta.io.loader.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.kermeta.io.IoPackage;
import org.kermeta.io.loader.AbstractStep;
import org.kermeta.io.loader.Action;
import org.kermeta.io.loader.EcoreLoader;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.KMLoader;
import org.kermeta.io.loader.KMTLoader;
import org.kermeta.io.loader.Loader;
import org.kermeta.io.loader.LoaderFactory;
import org.kermeta.io.loader.LoaderPackage;
import org.kermeta.io.loader.LoadingContext;
import org.kermeta.io.loader.LoadingStep;

import fr.irisa.triskell.kermeta.KmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoaderPackageImpl extends EPackageImpl implements LoaderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadingStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kmtLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kmLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadingContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iLoadingDatasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

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
	 * @see org.kermeta.io.loader.LoaderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoaderPackageImpl() {
		super(eNS_URI, LoaderFactory.eINSTANCE);
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
	public static LoaderPackage init() {
		if (isInited) return (LoaderPackage)EPackage.Registry.INSTANCE.getEPackage(LoaderPackage.eNS_URI);

		// Obtain or create and register package
		LoaderPackageImpl theLoaderPackage = (LoaderPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof LoaderPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new LoaderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IoPackage.eINSTANCE.eClass();
		KmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLoaderPackage.createPackageContents();

		// Initialize created meta-data
		theLoaderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLoaderPackage.freeze();

		return theLoaderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadingStep() {
		return loadingStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadingStep_Name() {
		return (EAttribute)loadingStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadingStep_Done() {
		return (EAttribute)loadingStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadingStep_Action() {
		return (EReference)loadingStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadingStep_Propagate() {
		return (EAttribute)loadingStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadingStep_PerformActionIfError() {
		return (EAttribute)loadingStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoader() {
		return loaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoader_Datas() {
		return (EReference)loaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoader_Uri() {
		return (EAttribute)loaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKMTLoader() {
		return kmtLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcoreLoader() {
		return ecoreLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKMLoader() {
		return kmLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadingContext() {
		return loadingContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadingContext_Loaders() {
		return (EReference)loadingContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getILoadingDatas() {
		return iLoadingDatasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getILoadingDatas_KermetaUnit() {
		return (EReference)iLoadingDatasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStep() {
		return abstractStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_Steps() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_CurrentStep() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Class() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoaderFactory getLoaderFactory() {
		return (LoaderFactory)getEFactoryInstance();
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
		loadingStepEClass = createEClass(LOADING_STEP);
		createEAttribute(loadingStepEClass, LOADING_STEP__NAME);
		createEAttribute(loadingStepEClass, LOADING_STEP__DONE);
		createEReference(loadingStepEClass, LOADING_STEP__ACTION);
		createEAttribute(loadingStepEClass, LOADING_STEP__PROPAGATE);
		createEAttribute(loadingStepEClass, LOADING_STEP__PERFORM_ACTION_IF_ERROR);

		loaderEClass = createEClass(LOADER);
		createEReference(loaderEClass, LOADER__DATAS);
		createEAttribute(loaderEClass, LOADER__URI);

		kmtLoaderEClass = createEClass(KMT_LOADER);

		ecoreLoaderEClass = createEClass(ECORE_LOADER);

		kmLoaderEClass = createEClass(KM_LOADER);

		loadingContextEClass = createEClass(LOADING_CONTEXT);
		createEReference(loadingContextEClass, LOADING_CONTEXT__LOADERS);

		iLoadingDatasEClass = createEClass(ILOADING_DATAS);
		createEReference(iLoadingDatasEClass, ILOADING_DATAS__KERMETA_UNIT);

		abstractStepEClass = createEClass(ABSTRACT_STEP);
		createEReference(abstractStepEClass, ABSTRACT_STEP__STEPS);
		createEReference(abstractStepEClass, ABSTRACT_STEP__CURRENT_STEP);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__CLASS);

		// Create data types
		uriEDataType = createEDataType(URI);
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
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loadingStepEClass.getESuperTypes().add(this.getAbstractStep());
		loaderEClass.getESuperTypes().add(this.getAbstractStep());
		kmtLoaderEClass.getESuperTypes().add(this.getLoader());
		ecoreLoaderEClass.getESuperTypes().add(this.getLoader());
		kmLoaderEClass.getESuperTypes().add(this.getLoader());

		// Initialize classes and features; add operations and parameters
		initEClass(loadingStepEClass, LoadingStep.class, "LoadingStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadingStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, LoadingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadingStep_Done(), ecorePackage.getEBoolean(), "done", null, 1, 1, LoadingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadingStep_Action(), this.getAction(), null, "action", null, 0, 1, LoadingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadingStep_Propagate(), ecorePackage.getEBoolean(), "propagate", null, 1, 1, LoadingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadingStep_PerformActionIfError(), ecorePackage.getEBoolean(), "performActionIfError", null, 1, 1, LoadingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(loadingStepEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getILoadingDatas(), "datas", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loadingStepEClass, null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getILoadingDatas(), "datas", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loaderEClass, Loader.class, "Loader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoader_Datas(), this.getILoadingDatas(), null, "datas", null, 1, 1, Loader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoader_Uri(), this.getURI(), "uri", null, 0, 1, Loader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(loaderEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loaderEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loaderEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stepName", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(loaderEClass, null, "initializeDatas", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kmtLoaderEClass, KMTLoader.class, "KMTLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecoreLoaderEClass, EcoreLoader.class, "EcoreLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kmLoaderEClass, KMLoader.class, "KMLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadingContextEClass, LoadingContext.class, "LoadingContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadingContext_Loaders(), this.getLoader(), null, "loaders", null, 0, -1, LoadingContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(loadingContextEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loadingContextEClass, this.getLoader(), "getLoader", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURI(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loadingContextEClass, null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stepName", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loadingContextEClass, this.getLoader(), "getLoaderToUse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURI(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iLoadingDatasEClass, ILoadingDatas.class, "ILoadingDatas", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getILoadingDatas_KermetaUnit(), theIoPackage.getKermetaUnit(), null, "kermetaUnit", null, 0, 1, ILoadingDatas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStepEClass, AbstractStep.class, "AbstractStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStep_Steps(), this.getLoadingStep(), null, "steps", null, 0, -1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_CurrentStep(), this.getLoadingStep(), null, "currentStep", null, 0, 1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(abstractStepEClass, this.getLoadingStep(), "getNextStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractStepEClass, ecorePackage.getEBoolean(), "goToNextStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Class(), ecorePackage.getEString(), "class", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LoaderPackageImpl
