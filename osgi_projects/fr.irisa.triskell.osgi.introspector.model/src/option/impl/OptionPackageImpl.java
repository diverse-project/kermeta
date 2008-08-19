/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionPackageImpl.java,v 1.5 2008-08-19 07:04:45 edaubert Exp $
 */
package option.impl;

import jar.JarPackage;
import jar.impl.JarPackageImpl;
import manifest.ManifestPackage;
import manifest.impl.ManifestPackageImpl;
import option.ActivationPolicyDirective;
import option.AttributEntry;
import option.DirectiveEntry;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.ExportPackageDirective;
import option.Extension;
import option.ExtensionEnum;
import option.FragmentAttachment;
import option.FragmentAttachmentEnum;
import option.FragmentHostDirective;
import option.ISOCodeLanguage;
import option.ImportPackageDirective;
import option.IncludeClasses;
import option.IncludePackages;
import option.Language;
import option.Mandatory;
import option.NativeCodeDirective;
import option.OptionFactory;
import option.OptionPackage;
import option.OsName;
import option.OsNameEnum;
import option.OsVersion;
import option.ParameterEntry;
import option.Processor;
import option.ProcessorEnum;
import option.RequireBundleDirective;
import option.Resolution;
import option.ResolutionEnum;
import option.SelectionFilter;
import option.Singleton;
import option.SymbolicNameDirective;
import option.Uses;
import option.Visibility;
import option.VisibilityEnum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import framework.FrameworkPackage;
import framework.impl.FrameworkPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OptionPackageImpl extends EPackageImpl implements OptionPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directiveEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osNameEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeCodeDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osVersionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludePackagesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includePackagesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionFilterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireBundleDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentHostDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicNameDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportPackageDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importPackageDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationPolicyDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeClassesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeClassesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fragmentAttachmentEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isoCodeLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extensionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osNameEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see option.OptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptionPackageImpl() {
		super(eNS_URI, OptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptionPackage init() {
		if (isInited) return (OptionPackage)EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI);

		// Obtain or create and register package
		OptionPackageImpl theOptionPackage = (OptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OptionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrameworkPackageImpl theFrameworkPackage = (FrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI) instanceof FrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI) : FrameworkPackage.eINSTANCE);
		ManifestPackageImpl theManifestPackage = (ManifestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI) : ManifestPackage.eINSTANCE);
		JarPackageImpl theJarPackage = (JarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) instanceof JarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) : JarPackage.eINSTANCE);

		// Create package meta-data objects
		theOptionPackage.createPackageContents();
		theFrameworkPackage.createPackageContents();
		theManifestPackage.createPackageContents();
		theJarPackage.createPackageContents();

		// Initialize created meta-data
		theOptionPackage.initializePackageContents();
		theFrameworkPackage.initializePackageContents();
		theManifestPackage.initializePackageContents();
		theJarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOptionPackage.freeze();

		return theOptionPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterEntry() {
		return parameterEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterEntry_Token() {
		return (EAttribute)parameterEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectiveEntry() {
		return directiveEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributEntry() {
		return attributEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributEntry_Value() {
		return (EAttribute)attributEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsName() {
		return osNameEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsName_Osname() {
		return (EAttribute)osNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeCodeDirective() {
		return nativeCodeDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsVersion() {
		return osVersionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsVersion_MinVersion() {
		return (EReference)osVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsVersion_MaxVersion() {
		return (EReference)osVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsVersion_MinNotInclude() {
		return (EAttribute)osVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsVersion_MaxNotInclude() {
		return (EAttribute)osVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludePackages() {
		return excludePackagesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludePackages_Packages() {
		return (EReference)excludePackagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Processor() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludePackages() {
		return includePackagesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludePackages_Packages() {
		return (EReference)includePackagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUses() {
		return usesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUses_Packages() {
		return (EAttribute)usesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUses_Resolved() {
		return (EAttribute)usesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Extension() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatory() {
		return mandatoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandatory_Attributs() {
		return (EReference)mandatoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_IsoCode() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibility() {
		return visibilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibility_Visibility() {
		return (EAttribute)visibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleton() {
		return singletonEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleton_Singleton() {
		return (EAttribute)singletonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolution() {
		return resolutionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolution_Resolution() {
		return (EAttribute)resolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentAttachment() {
		return fragmentAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragmentAttachment_FragmentAttachment() {
		return (EAttribute)fragmentAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionFilter() {
		return selectionFilterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionFilter_Expression() {
		return (EAttribute)selectionFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequireBundleDirective() {
		return requireBundleDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentHostDirective() {
		return fragmentHostDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicNameDirective() {
		return symbolicNameDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportPackageDirective() {
		return exportPackageDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportPackageDirective() {
		return importPackageDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationPolicyDirective() {
		return activationPolicyDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeClasses() {
		return includeClassesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeClasses_Classes() {
		return (EReference)includeClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeClasses() {
		return excludeClassesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeClasses_Classes() {
		return (EReference)excludeClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Classes() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Resolved() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Reference() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Package() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Resolved() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Reference() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFragmentAttachmentEnum() {
		return fragmentAttachmentEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorEnum() {
		return processorEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionEnum() {
		return resolutionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityEnum() {
		return visibilityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getISOCodeLanguage() {
		return isoCodeLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtensionEnum() {
		return extensionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOsNameEnum() {
		return osNameEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OptionFactory getOptionFactory() {
		return (OptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		parameterEntryEClass = createEClass(PARAMETER_ENTRY);
		createEAttribute(parameterEntryEClass, PARAMETER_ENTRY__TOKEN);

		directiveEntryEClass = createEClass(DIRECTIVE_ENTRY);

		attributEntryEClass = createEClass(ATTRIBUT_ENTRY);
		createEAttribute(attributEntryEClass, ATTRIBUT_ENTRY__VALUE);

		osNameEClass = createEClass(OS_NAME);
		createEAttribute(osNameEClass, OS_NAME__OSNAME);

		nativeCodeDirectiveEClass = createEClass(NATIVE_CODE_DIRECTIVE);

		osVersionEClass = createEClass(OS_VERSION);
		createEReference(osVersionEClass, OS_VERSION__MIN_VERSION);
		createEReference(osVersionEClass, OS_VERSION__MAX_VERSION);
		createEAttribute(osVersionEClass, OS_VERSION__MIN_NOT_INCLUDE);
		createEAttribute(osVersionEClass, OS_VERSION__MAX_NOT_INCLUDE);

		excludePackagesEClass = createEClass(EXCLUDE_PACKAGES);
		createEReference(excludePackagesEClass, EXCLUDE_PACKAGES__PACKAGES);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__PROCESSOR);

		includePackagesEClass = createEClass(INCLUDE_PACKAGES);
		createEReference(includePackagesEClass, INCLUDE_PACKAGES__PACKAGES);

		usesEClass = createEClass(USES);
		createEAttribute(usesEClass, USES__PACKAGES);
		createEAttribute(usesEClass, USES__RESOLVED);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__EXTENSION);

		mandatoryEClass = createEClass(MANDATORY);
		createEReference(mandatoryEClass, MANDATORY__ATTRIBUTS);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__ISO_CODE);

		visibilityEClass = createEClass(VISIBILITY);
		createEAttribute(visibilityEClass, VISIBILITY__VISIBILITY);

		singletonEClass = createEClass(SINGLETON);
		createEAttribute(singletonEClass, SINGLETON__SINGLETON);

		resolutionEClass = createEClass(RESOLUTION);
		createEAttribute(resolutionEClass, RESOLUTION__RESOLUTION);

		fragmentAttachmentEClass = createEClass(FRAGMENT_ATTACHMENT);
		createEAttribute(fragmentAttachmentEClass, FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT);

		selectionFilterEClass = createEClass(SELECTION_FILTER);
		createEAttribute(selectionFilterEClass, SELECTION_FILTER__EXPRESSION);

		requireBundleDirectiveEClass = createEClass(REQUIRE_BUNDLE_DIRECTIVE);

		fragmentHostDirectiveEClass = createEClass(FRAGMENT_HOST_DIRECTIVE);

		symbolicNameDirectiveEClass = createEClass(SYMBOLIC_NAME_DIRECTIVE);

		exportPackageDirectiveEClass = createEClass(EXPORT_PACKAGE_DIRECTIVE);

		importPackageDirectiveEClass = createEClass(IMPORT_PACKAGE_DIRECTIVE);

		activationPolicyDirectiveEClass = createEClass(ACTIVATION_POLICY_DIRECTIVE);

		includeClassesEClass = createEClass(INCLUDE_CLASSES);
		createEReference(includeClassesEClass, INCLUDE_CLASSES__CLASSES);

		excludeClassesEClass = createEClass(EXCLUDE_CLASSES);
		createEReference(excludeClassesEClass, EXCLUDE_CLASSES__CLASSES);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__CLASSES);
		createEAttribute(classEClass, CLASS__RESOLVED);
		createEAttribute(classEClass, CLASS__REFERENCE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PACKAGE);
		createEAttribute(packageEClass, PACKAGE__RESOLVED);
		createEAttribute(packageEClass, PACKAGE__REFERENCE);

		// Create enums
		fragmentAttachmentEnumEEnum = createEEnum(FRAGMENT_ATTACHMENT_ENUM);
		processorEnumEEnum = createEEnum(PROCESSOR_ENUM);
		resolutionEnumEEnum = createEEnum(RESOLUTION_ENUM);
		visibilityEnumEEnum = createEEnum(VISIBILITY_ENUM);
		isoCodeLanguageEEnum = createEEnum(ISO_CODE_LANGUAGE);
		extensionEnumEEnum = createEEnum(EXTENSION_ENUM);
		osNameEnumEEnum = createEEnum(OS_NAME_ENUM);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		ManifestPackage theManifestPackage = (ManifestPackage)EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);
		FrameworkPackage theFrameworkPackage = (FrameworkPackage)EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI);
		JarPackage theJarPackage = (JarPackage)EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		directiveEntryEClass.getESuperTypes().add(this.getParameterEntry());
		attributEntryEClass.getESuperTypes().add(this.getParameterEntry());
		osNameEClass.getESuperTypes().add(this.getNativeCodeDirective());
		nativeCodeDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		osVersionEClass.getESuperTypes().add(this.getNativeCodeDirective());
		excludePackagesEClass.getESuperTypes().add(this.getActivationPolicyDirective());
		processorEClass.getESuperTypes().add(this.getNativeCodeDirective());
		includePackagesEClass.getESuperTypes().add(this.getActivationPolicyDirective());
		usesEClass.getESuperTypes().add(this.getExportPackageDirective());
		extensionEClass.getESuperTypes().add(this.getFragmentHostDirective());
		mandatoryEClass.getESuperTypes().add(this.getExportPackageDirective());
		languageEClass.getESuperTypes().add(this.getNativeCodeDirective());
		visibilityEClass.getESuperTypes().add(this.getRequireBundleDirective());
		singletonEClass.getESuperTypes().add(this.getSymbolicNameDirective());
		resolutionEClass.getESuperTypes().add(this.getImportPackageDirective());
		fragmentAttachmentEClass.getESuperTypes().add(this.getSymbolicNameDirective());
		selectionFilterEClass.getESuperTypes().add(this.getNativeCodeDirective());
		requireBundleDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		fragmentHostDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		symbolicNameDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		exportPackageDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		importPackageDirectiveEClass.getESuperTypes().add(this.getRequireBundleDirective());
		activationPolicyDirectiveEClass.getESuperTypes().add(this.getDirectiveEntry());
		includeClassesEClass.getESuperTypes().add(this.getExportPackageDirective());
		excludeClassesEClass.getESuperTypes().add(this.getExportPackageDirective());

		// Initialize classes and features; add operations and parameters
		initEClass(parameterEntryEClass, ParameterEntry.class, "ParameterEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterEntry_Token(), theManifestPackage.getString(), "token", null, 1, 1, ParameterEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directiveEntryEClass, DirectiveEntry.class, "DirectiveEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributEntryEClass, AttributEntry.class, "AttributEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributEntry_Value(), theManifestPackage.getString(), "value", null, 1, 1, AttributEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osNameEClass, OsName.class, "OsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsName_Osname(), this.getOsNameEnum(), "osname", null, 1, 1, OsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeCodeDirectiveEClass, NativeCodeDirective.class, "NativeCodeDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osVersionEClass, OsVersion.class, "OsVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsVersion_MinVersion(), theManifestPackage.getVersion(), null, "minVersion", null, 1, 1, OsVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsVersion_MaxVersion(), theManifestPackage.getVersion(), null, "maxVersion", null, 0, 1, OsVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsVersion_MinNotInclude(), theManifestPackage.getboolean(), "minNotInclude", "true", 1, 1, OsVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsVersion_MaxNotInclude(), theManifestPackage.getboolean(), "maxNotInclude", null, 0, 1, OsVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludePackagesEClass, ExcludePackages.class, "ExcludePackages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludePackages_Packages(), this.getPackage(), null, "packages", null, 1, -1, ExcludePackages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Processor(), this.getProcessorEnum(), "processor", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includePackagesEClass, IncludePackages.class, "IncludePackages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludePackages_Packages(), this.getPackage(), null, "packages", null, 1, -1, IncludePackages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usesEClass, Uses.class, "Uses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUses_Packages(), theFrameworkPackage.getString(), "packages", null, 1, -1, Uses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUses_Resolved(), theManifestPackage.getboolean(), "resolved", null, 1, 1, Uses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Extension(), this.getExtensionEnum(), "extension", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMandatory_Attributs(), this.getAttributEntry(), null, "attributs", null, 0, -1, Mandatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_IsoCode(), this.getISOCodeLanguage(), "isoCode", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityEClass, Visibility.class, "Visibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibility_Visibility(), this.getVisibilityEnum(), "visibility", null, 1, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonEClass, Singleton.class, "Singleton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleton_Singleton(), theManifestPackage.getboolean(), "singleton", null, 1, 1, Singleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionEClass, Resolution.class, "Resolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolution_Resolution(), this.getResolutionEnum(), "resolution", null, 1, 1, Resolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentAttachmentEClass, FragmentAttachment.class, "FragmentAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFragmentAttachment_FragmentAttachment(), this.getFragmentAttachmentEnum(), "fragmentAttachment", null, 1, 1, FragmentAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionFilterEClass, SelectionFilter.class, "SelectionFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionFilter_Expression(), theManifestPackage.getString(), "expression", null, 1, 1, SelectionFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireBundleDirectiveEClass, RequireBundleDirective.class, "RequireBundleDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fragmentHostDirectiveEClass, FragmentHostDirective.class, "FragmentHostDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolicNameDirectiveEClass, SymbolicNameDirective.class, "SymbolicNameDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportPackageDirectiveEClass, ExportPackageDirective.class, "ExportPackageDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importPackageDirectiveEClass, ImportPackageDirective.class, "ImportPackageDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activationPolicyDirectiveEClass, ActivationPolicyDirective.class, "ActivationPolicyDirective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeClassesEClass, IncludeClasses.class, "IncludeClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludeClasses_Classes(), this.getClass_(), null, "classes", null, 1, -1, IncludeClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeClassesEClass, ExcludeClasses.class, "ExcludeClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludeClasses_Classes(), this.getClass_(), null, "classes", null, 1, -1, ExcludeClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, option.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Classes(), theJarPackage.getClass_(), null, "classes", null, 0, -1, option.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Resolved(), theManifestPackage.getboolean(), "resolved", "false", 1, 1, option.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Reference(), theManifestPackage.getString(), "reference", null, 1, 1, option.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, option.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Package(), theJarPackage.getPackage(), null, "package", null, 0, 1, option.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Resolved(), theManifestPackage.getboolean(), "resolved", "false", 1, 1, option.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Reference(), theManifestPackage.getString(), "reference", null, 1, 1, option.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fragmentAttachmentEnumEEnum, FragmentAttachmentEnum.class, "FragmentAttachmentEnum");
		addEEnumLiteral(fragmentAttachmentEnumEEnum, FragmentAttachmentEnum.ALWAYS);
		addEEnumLiteral(fragmentAttachmentEnumEEnum, FragmentAttachmentEnum.NEVER);
		addEEnumLiteral(fragmentAttachmentEnumEEnum, FragmentAttachmentEnum.RESOLVETIME);

		initEEnum(processorEnumEEnum, ProcessorEnum.class, "ProcessorEnum");
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.P6_8K);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.ARM);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.ALPHA);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.IGNITE);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.MIPS);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.PARISC);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.POWER_PC);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.SH4);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.SPARC);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.S390);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.S39_0X);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.V850E);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.X86);
		addEEnumLiteral(processorEnumEEnum, ProcessorEnum.X8664);

		initEEnum(resolutionEnumEEnum, ResolutionEnum.class, "ResolutionEnum");
		addEEnumLiteral(resolutionEnumEEnum, ResolutionEnum.MANDATORY);
		addEEnumLiteral(resolutionEnumEEnum, ResolutionEnum.OPTIONAL);

		initEEnum(visibilityEnumEEnum, VisibilityEnum.class, "VisibilityEnum");
		addEEnumLiteral(visibilityEnumEEnum, VisibilityEnum.PRIVATE);
		addEEnumLiteral(visibilityEnumEEnum, VisibilityEnum.REEXPORT);

		initEEnum(isoCodeLanguageEEnum, ISOCodeLanguage.class, "ISOCodeLanguage");
		addEEnumLiteral(isoCodeLanguageEEnum, ISOCodeLanguage.FR);
		addEEnumLiteral(isoCodeLanguageEEnum, ISOCodeLanguage.EN);

		initEEnum(extensionEnumEEnum, ExtensionEnum.class, "ExtensionEnum");
		addEEnumLiteral(extensionEnumEEnum, ExtensionEnum.FRAMEWORK);
		addEEnumLiteral(extensionEnumEEnum, ExtensionEnum.BOOTCLASSPATH);

		initEEnum(osNameEnumEEnum, OsNameEnum.class, "OsNameEnum");
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.AIX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.DIGITAL_UNIX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.EMBOS);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.EPOC32);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.FREE_BSD);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.HPUX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.IRIX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.LINUX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.MAC_OS);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.NET_BSD);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.NETWARE);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.OPEN_BSD);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.OS2);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.QNX);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.SOLARIS);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.SUN_OS);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.VX_WORKS);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS95);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS98);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS_NT);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS_CE);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS2000);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS2003);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS_XP);
		addEEnumLiteral(osNameEnumEEnum, OsNameEnum.WINDOWS_VISTA);

		// Create resource
		createResource(eNS_URI);
	}

} // OptionPackageImpl
