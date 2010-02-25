/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.smartadapters.core.Adaptation;
import org.smartadapters.core.Adapter;
import org.smartadapters.core.Aspect;
import org.smartadapters.core.CoreFactory;
import org.smartadapters.core.CorePackage;

import org.smartadapters.core.adaptations.AdaptationsPackage;

import org.smartadapters.core.adaptations.impl.AdaptationsPackageImpl;

import org.smartadapters.core.cloneAdaptation;
import org.smartadapters.core.createAdaptation;
import org.smartadapters.core.makeUnique;
import org.smartadapters.core.setAdaptation;
import org.smartadapters.core.uniqueType;
import org.smartadapters.core.unsetAdaptation;

import pattern.art.ArtPackage;

import patternframework.PatternframeworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloneAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeUniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uniqueTypeEEnum = null;

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
	 * @see org.smartadapters.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArtPackage.eINSTANCE.eClass();
		PatternframeworkPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) : AdaptationsPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theAdaptationsPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theAdaptationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapter_Aspect() {
		return (EReference)adapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdapter_Adapt() {
		return (EReference)adapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdapter_Name() {
		return (EAttribute)adapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Template() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Structure() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Persistent() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptation() {
		return adaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptation_Adapter() {
		return (EReference)adaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcloneAdaptation() {
		return cloneAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcloneAdaptation_IsUnique() {
		return (EAttribute)cloneAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcreateAdaptation() {
		return createAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcreateAdaptation_IsUnique() {
		return (EAttribute)createAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsetAdaptation() {
		return setAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getunsetAdaptation() {
		return unsetAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmakeUnique() {
		return makeUniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmakeUnique_Element() {
		return (EReference)makeUniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getuniqueType() {
		return uniqueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		adapterEClass = createEClass(ADAPTER);
		createEReference(adapterEClass, ADAPTER__ASPECT);
		createEReference(adapterEClass, ADAPTER__ADAPT);
		createEAttribute(adapterEClass, ADAPTER__NAME);

		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__TEMPLATE);
		createEReference(aspectEClass, ASPECT__STRUCTURE);
		createEReference(aspectEClass, ASPECT__PERSISTENT);

		adaptationEClass = createEClass(ADAPTATION);
		createEReference(adaptationEClass, ADAPTATION__ADAPTER);

		cloneAdaptationEClass = createEClass(CLONE_ADAPTATION);
		createEAttribute(cloneAdaptationEClass, CLONE_ADAPTATION__IS_UNIQUE);

		createAdaptationEClass = createEClass(CREATE_ADAPTATION);
		createEAttribute(createAdaptationEClass, CREATE_ADAPTATION__IS_UNIQUE);

		setAdaptationEClass = createEClass(SET_ADAPTATION);

		unsetAdaptationEClass = createEClass(UNSET_ADAPTATION);

		makeUniqueEClass = createEClass(MAKE_UNIQUE);
		createEReference(makeUniqueEClass, MAKE_UNIQUE__ELEMENT);

		// Create enums
		uniqueTypeEEnum = createEEnum(UNIQUE_TYPE);
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
		AdaptationsPackage theAdaptationsPackage = (AdaptationsPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI);
		ArtPackage theArtPackage = (ArtPackage)EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI);
		PatternframeworkPackage thePatternframeworkPackage = (PatternframeworkPackage)EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAdaptationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloneAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		createAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		setAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		unsetAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		makeUniqueEClass.getESuperTypes().add(this.getAdaptation());

		// Initialize classes and features; add operations and parameters
		initEClass(adapterEClass, Adapter.class, "Adapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdapter_Aspect(), this.getAspect(), null, "aspect", null, 1, 1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapter_Adapt(), this.getAdaptation(), this.getAdaptation_Adapter(), "adapt", null, 0, -1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdapter_Name(), theArtPackage.getString(), "name", null, 0, 1, Adapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_Template(), thePatternframeworkPackage.getModelPattern(), null, "template", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Structure(), thePatternframeworkPackage.getPModel(), null, "structure", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Persistent(), thePatternframeworkPackage.getPObject(), null, "persistent", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationEClass, Adaptation.class, "Adaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptation_Adapter(), this.getAdapter(), this.getAdapter_Adapt(), "adapter", null, 1, 1, Adaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloneAdaptationEClass, cloneAdaptation.class, "cloneAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcloneAdaptation_IsUnique(), this.getuniqueType(), "isUnique", null, 0, 1, cloneAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createAdaptationEClass, createAdaptation.class, "createAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcreateAdaptation_IsUnique(), this.getuniqueType(), "isUnique", null, 0, 1, createAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setAdaptationEClass, setAdaptation.class, "setAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsetAdaptationEClass, unsetAdaptation.class, "unsetAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(makeUniqueEClass, makeUnique.class, "makeUnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmakeUnique_Element(), thePatternframeworkPackage.getPObject(), null, "element", null, 1, 1, makeUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(uniqueTypeEEnum, uniqueType.class, "uniqueType");
		addEEnumLiteral(uniqueTypeEEnum, uniqueType.UNIQUE);
		addEEnumLiteral(uniqueTypeEEnum, uniqueType.NON_UNIQUE);
		addEEnumLiteral(uniqueTypeEEnum, uniqueType.ON_DEMAND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";		
		addAnnotation
		  (getAdapter_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getAspect_Persistent(), 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n   persistent refers to aspectual PObject that must not be\r\n   cloned between two bindings\r\n   TODO : contraints...\r\n   */"
		   });		
		addAnnotation
		  (getcloneAdaptation_IsUnique(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getcreateAdaptation_IsUnique(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });
	}

} //CorePackageImpl
