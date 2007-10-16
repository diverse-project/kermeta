/**
 * <copyright>
 * </copyright>
 *
 * $Id: TrekPackageImpl.java,v 1.2 2007-10-16 08:20:33 cfaucher Exp $
 */
package org.kermeta.trek.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.trek.KTagElement;
import org.kermeta.trek.KTestCase;
import org.kermeta.trek.KUseCase;
import org.kermeta.trek.KUseLevel;
import org.kermeta.trek.KUserStory;
import org.kermeta.trek.TrekFactory;
import org.kermeta.trek.TrekPackage;
import org.kermeta.trek.UseKaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrekPackageImpl extends EPackageImpl implements TrekPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useKaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kUseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kUserStoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kTagElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kUseLevelEEnum = null;

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
	 * @see org.kermeta.trek.TrekPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrekPackageImpl() {
		super(eNS_URI, TrekFactory.eINSTANCE);
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
	public static TrekPackage init() {
		if (isInited) return (TrekPackage)EPackage.Registry.INSTANCE.getEPackage(TrekPackage.eNS_URI);

		// Obtain or create and register package
		TrekPackageImpl theTrekPackage = (TrekPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TrekPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TrekPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTrekPackage.createPackageContents();

		// Initialize created meta-data
		theTrekPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrekPackage.freeze();

		return theTrekPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseKaseModel() {
		return useKaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseKaseModel_KuseCases() {
		return (EReference)useKaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseKaseModel_KtestCases() {
		return (EReference)useKaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseKaseModel_Ktags() {
		return (EReference)useKaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseKaseModel_KuserStories() {
		return (EReference)useKaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKUseCase() {
		return kUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUseCase_Name() {
		return (EAttribute)kUseCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUseCase_Id() {
		return (EAttribute)kUseCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUseCase_Summary() {
		return (EAttribute)kUseCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUseCase_ShortSummary() {
		return (EAttribute)kUseCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_Use() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_UsedBy() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_VerifiedBy() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_Refines() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_RefinedBy() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_Covers() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUseCase_Level() {
		return (EAttribute)kUseCaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUseCase_Tags() {
		return (EReference)kUseCaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKTestCase() {
		return kTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKTestCase_Verifies() {
		return (EReference)kTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKTestCase_TestCase() {
		return (EAttribute)kTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKTestCase_File() {
		return (EAttribute)kTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKUserStory() {
		return kUserStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKUserStory_CoveredBy() {
		return (EReference)kUserStoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUserStory_Name() {
		return (EAttribute)kUserStoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUserStory_Id() {
		return (EAttribute)kUserStoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUserStory_Summary() {
		return (EAttribute)kUserStoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKUserStory_ShortSummary() {
		return (EAttribute)kUserStoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKTagElement() {
		return kTagElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKTagElement_Concept() {
		return (EAttribute)kTagElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKTagElement_Name() {
		return (EAttribute)kTagElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKUseLevel() {
		return kUseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrekFactory getTrekFactory() {
		return (TrekFactory)getEFactoryInstance();
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
		useKaseModelEClass = createEClass(USE_KASE_MODEL);
		createEReference(useKaseModelEClass, USE_KASE_MODEL__KUSE_CASES);
		createEReference(useKaseModelEClass, USE_KASE_MODEL__KTEST_CASES);
		createEReference(useKaseModelEClass, USE_KASE_MODEL__KTAGS);
		createEReference(useKaseModelEClass, USE_KASE_MODEL__KUSER_STORIES);

		kUseCaseEClass = createEClass(KUSE_CASE);
		createEAttribute(kUseCaseEClass, KUSE_CASE__NAME);
		createEAttribute(kUseCaseEClass, KUSE_CASE__ID);
		createEAttribute(kUseCaseEClass, KUSE_CASE__SUMMARY);
		createEAttribute(kUseCaseEClass, KUSE_CASE__SHORT_SUMMARY);
		createEReference(kUseCaseEClass, KUSE_CASE__USE);
		createEReference(kUseCaseEClass, KUSE_CASE__USED_BY);
		createEReference(kUseCaseEClass, KUSE_CASE__VERIFIED_BY);
		createEReference(kUseCaseEClass, KUSE_CASE__REFINES);
		createEReference(kUseCaseEClass, KUSE_CASE__REFINED_BY);
		createEReference(kUseCaseEClass, KUSE_CASE__COVERS);
		createEAttribute(kUseCaseEClass, KUSE_CASE__LEVEL);
		createEReference(kUseCaseEClass, KUSE_CASE__TAGS);

		kTestCaseEClass = createEClass(KTEST_CASE);
		createEReference(kTestCaseEClass, KTEST_CASE__VERIFIES);
		createEAttribute(kTestCaseEClass, KTEST_CASE__TEST_CASE);
		createEAttribute(kTestCaseEClass, KTEST_CASE__FILE);

		kUserStoryEClass = createEClass(KUSER_STORY);
		createEReference(kUserStoryEClass, KUSER_STORY__COVERED_BY);
		createEAttribute(kUserStoryEClass, KUSER_STORY__NAME);
		createEAttribute(kUserStoryEClass, KUSER_STORY__ID);
		createEAttribute(kUserStoryEClass, KUSER_STORY__SUMMARY);
		createEAttribute(kUserStoryEClass, KUSER_STORY__SHORT_SUMMARY);

		kTagElementEClass = createEClass(KTAG_ELEMENT);
		createEAttribute(kTagElementEClass, KTAG_ELEMENT__CONCEPT);
		createEAttribute(kTagElementEClass, KTAG_ELEMENT__NAME);

		// Create enums
		kUseLevelEEnum = createEEnum(KUSE_LEVEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(useKaseModelEClass, UseKaseModel.class, "UseKaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseKaseModel_KuseCases(), this.getKUseCase(), null, "kuseCases", null, 0, -1, UseKaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseKaseModel_KtestCases(), this.getKTestCase(), null, "ktestCases", null, 0, -1, UseKaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseKaseModel_Ktags(), this.getKTestCase(), null, "ktags", null, 0, -1, UseKaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseKaseModel_KuserStories(), this.getKUserStory(), null, "KuserStories", null, 0, -1, UseKaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kUseCaseEClass, KUseCase.class, "KUseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKUseCase_Name(), ecorePackage.getEString(), "name", "", 1, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUseCase_Id(), ecorePackage.getEString(), "id", null, 1, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUseCase_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUseCase_ShortSummary(), ecorePackage.getEString(), "shortSummary", null, 1, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_Use(), this.getKUseCase(), this.getKUseCase_UsedBy(), "use", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_UsedBy(), this.getKUseCase(), this.getKUseCase_Use(), "usedBy", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_VerifiedBy(), this.getKTestCase(), null, "verifiedBy", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_Refines(), this.getKUseCase(), this.getKUseCase_RefinedBy(), "refines", null, 0, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_RefinedBy(), this.getKUseCase(), this.getKUseCase_Refines(), "refinedBy", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_Covers(), this.getKUserStory(), this.getKUserStory_CoveredBy(), "covers", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUseCase_Level(), this.getKUseLevel(), "level", null, 1, 1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKUseCase_Tags(), this.getKTagElement(), null, "tags", null, 0, -1, KUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kTestCaseEClass, KTestCase.class, "KTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKTestCase_Verifies(), this.getKUseCase(), null, "verifies", null, 0, 1, KTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKTestCase_TestCase(), ecorePackage.getEString(), "testCase", null, 1, 1, KTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKTestCase_File(), ecorePackage.getEString(), "file", null, 1, 1, KTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kUserStoryEClass, KUserStory.class, "KUserStory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKUserStory_CoveredBy(), this.getKUseCase(), this.getKUseCase_Covers(), "coveredBy", null, 0, -1, KUserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUserStory_Name(), ecorePackage.getEString(), "name", "", 1, 1, KUserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUserStory_Id(), ecorePackage.getEString(), "id", null, 1, 1, KUserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUserStory_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, KUserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKUserStory_ShortSummary(), ecorePackage.getEString(), "shortSummary", null, 1, 1, KUserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kTagElementEClass, KTagElement.class, "KTagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKTagElement_Concept(), ecorePackage.getEString(), "concept", "", 1, 1, KTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKTagElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, KTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(kUseLevelEEnum, KUseLevel.class, "KUseLevel");
		addEEnumLiteral(kUseLevelEEnum, KUseLevel.IMPLEMENTATION);
		addEEnumLiteral(kUseLevelEEnum, KUseLevel.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //TrekPackageImpl
