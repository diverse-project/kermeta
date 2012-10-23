/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.kermeta.kp.ImportBytecodeJar;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.KpFactory;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.kp.ReusableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpPackageImpl extends EPackageImpl implements KpPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass kermetaProjectEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass packageEquivalenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass reusableResourceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass importProjectSourcesEClass = null;

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass importFileEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass importProjectJarEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass importBytecodeJarEClass = null;

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
   * @see org.kermeta.kp.KpPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private KpPackageImpl() {
    super(eNS_URI, KpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link KpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static KpPackage init() {
    if (isInited) return (KpPackage)EPackage.Registry.INSTANCE.getEPackage(KpPackage.eNS_URI);

    // Obtain or create and register package
    KpPackageImpl theKpPackage = (KpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KpPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKpPackage.createPackageContents();

    // Initialize created meta-data
    theKpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KpPackage.eNS_URI, theKpPackage);
    return theKpPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getKermetaProject() {
    return kermetaProjectEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getKermetaProject_MetamodelName() {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKermetaProject_DefaultMainClass()
  {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKermetaProject_DefaultMainOperation()
  {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getKermetaProject_JavaBasePackage() {
    return (EAttribute)kermetaProjectEClass.getEStructuralFeatures().get(3);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_ReusableResources() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(4);
  }

				/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_ImportedProjectJars() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(5);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_ImportedBytecodeJars() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(6);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_ImportedProjectSources() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(7);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getKermetaProject_ImportedFiles() {
    return (EReference)kermetaProjectEClass.getEStructuralFeatures().get(8);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getPackageEquivalence() {
    return packageEquivalenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPackageEquivalence_EcorePackage() {
    return (EAttribute)packageEquivalenceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPackageEquivalence_JavaPackage() {
    return (EAttribute)packageEquivalenceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getReusableResource() {
    return reusableResourceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getReusableResource_Url() {
    return (EAttribute)reusableResourceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getReusableResource_AlternateUrls() {
    return (EAttribute)reusableResourceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getReusableResource_ReusableResourceName() {
    return (EAttribute)reusableResourceEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getImportProjectSources() {
    return importProjectSourcesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getImportProjectSources_Url() {
    return (EAttribute)importProjectSourcesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getImportProjectJar() {
    return importProjectJarEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getImportProjectJar_Url() {
    return (EAttribute)importProjectJarEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getImportBytecodeJar() {
    return importBytecodeJarEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getImportBytecodeJar_Url() {
    return (EAttribute)importBytecodeJarEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getImportFile() {
    return importFileEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getImportFile_Url() {
    return (EAttribute)importFileEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getImportFile_BytecodeFrom() {
    return (EReference)importFileEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getImportFile_PackageEquivalences() {
    return (EReference)importFileEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public KpFactory getKpFactory() {
    return (KpFactory)getEFactoryInstance();
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
    kermetaProjectEClass = createEClass(KERMETA_PROJECT);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__METAMODEL_NAME);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__DEFAULT_MAIN_CLASS);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__DEFAULT_MAIN_OPERATION);
    createEAttribute(kermetaProjectEClass, KERMETA_PROJECT__JAVA_BASE_PACKAGE);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__REUSABLE_RESOURCES);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__IMPORTED_PROJECT_JARS);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__IMPORTED_BYTECODE_JARS);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES);
    createEReference(kermetaProjectEClass, KERMETA_PROJECT__IMPORTED_FILES);

    importFileEClass = createEClass(IMPORT_FILE);
    createEAttribute(importFileEClass, IMPORT_FILE__URL);
    createEReference(importFileEClass, IMPORT_FILE__BYTECODE_FROM);
    createEReference(importFileEClass, IMPORT_FILE__PACKAGE_EQUIVALENCES);

    packageEquivalenceEClass = createEClass(PACKAGE_EQUIVALENCE);
    createEAttribute(packageEquivalenceEClass, PACKAGE_EQUIVALENCE__ECORE_PACKAGE);
    createEAttribute(packageEquivalenceEClass, PACKAGE_EQUIVALENCE__JAVA_PACKAGE);

    reusableResourceEClass = createEClass(REUSABLE_RESOURCE);
    createEAttribute(reusableResourceEClass, REUSABLE_RESOURCE__URL);
    createEAttribute(reusableResourceEClass, REUSABLE_RESOURCE__ALTERNATE_URLS);
    createEAttribute(reusableResourceEClass, REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME);

    importProjectSourcesEClass = createEClass(IMPORT_PROJECT_SOURCES);
    createEAttribute(importProjectSourcesEClass, IMPORT_PROJECT_SOURCES__URL);

    importProjectJarEClass = createEClass(IMPORT_PROJECT_JAR);
    createEAttribute(importProjectJarEClass, IMPORT_PROJECT_JAR__URL);

    importBytecodeJarEClass = createEClass(IMPORT_BYTECODE_JAR);
    createEAttribute(importBytecodeJarEClass, IMPORT_BYTECODE_JAR__URL);
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
    initEClass(kermetaProjectEClass, KermetaProject.class, "KermetaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKermetaProject_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_DefaultMainClass(), ecorePackage.getEString(), "defaultMainClass", null, 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_DefaultMainOperation(), ecorePackage.getEString(), "defaultMainOperation", null, 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKermetaProject_JavaBasePackage(), ecorePackage.getEString(), "javaBasePackage", "default", 0, 1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_ReusableResources(), this.getReusableResource(), null, "reusableResources", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_ImportedProjectJars(), this.getImportProjectJar(), null, "importedProjectJars", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_ImportedBytecodeJars(), this.getImportBytecodeJar(), null, "importedBytecodeJars", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_ImportedProjectSources(), this.getImportProjectSources(), null, "importedProjectSources", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKermetaProject_ImportedFiles(), this.getImportFile(), null, "importedFiles", null, 0, -1, KermetaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importFileEClass, ImportFile.class, "ImportFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportFile_Url(), ecorePackage.getEString(), "url", null, 1, 1, ImportFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImportFile_BytecodeFrom(), this.getReusableResource(), null, "bytecodeFrom", null, 0, 1, ImportFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImportFile_PackageEquivalences(), this.getPackageEquivalence(), null, "packageEquivalences", null, 0, -1, ImportFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEquivalenceEClass, PackageEquivalence.class, "PackageEquivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageEquivalence_EcorePackage(), ecorePackage.getEString(), "ecorePackage", null, 1, 1, PackageEquivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageEquivalence_JavaPackage(), ecorePackage.getEString(), "javaPackage", null, 1, 1, PackageEquivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reusableResourceEClass, ReusableResource.class, "ReusableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReusableResource_Url(), ecorePackage.getEString(), "url", null, 1, 1, ReusableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReusableResource_AlternateUrls(), ecorePackage.getEString(), "alternateUrls", null, 0, -1, ReusableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReusableResource_ReusableResourceName(), ecorePackage.getEString(), "reusableResourceName", null, 1, 1, ReusableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(reusableResourceEClass, ecorePackage.getEString(), "allUrls", 1, -1, IS_UNIQUE, IS_ORDERED);

    initEClass(importProjectSourcesEClass, ImportProjectSources.class, "ImportProjectSources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportProjectSources_Url(), ecorePackage.getEString(), "url", null, 1, 1, ImportProjectSources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importProjectJarEClass, ImportProjectJar.class, "ImportProjectJar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportProjectJar_Url(), ecorePackage.getEString(), "url", null, 1, 1, ImportProjectJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importBytecodeJarEClass, ImportBytecodeJar.class, "ImportBytecodeJar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportBytecodeJar_Url(), ecorePackage.getEString(), "url", null, 1, 1, ImportBytecodeJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KpPackageImpl
