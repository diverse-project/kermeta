/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptionPackage.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see option.OptionFactory
 * @model kind="package"
 * @generated
 */
public interface OptionPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "option";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://org.osgi.framework/manifest/option";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "org.osgi.framework.manifest.option";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	OptionPackage eINSTANCE = option.impl.OptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link option.impl.ParameterEntryImpl <em>Parameter Entry</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ParameterEntryImpl
	 * @see option.impl.OptionPackageImpl#getParameterEntry()
	 * @generated
	 */
	int PARAMETER_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY__TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Parameter Entry</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link option.impl.DirectiveEntryImpl <em>Directive Entry</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.DirectiveEntryImpl
	 * @see option.impl.OptionPackageImpl#getDirectiveEntry()
	 * @generated
	 */
	int DIRECTIVE_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_ENTRY__TOKEN = PARAMETER_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Directive Entry</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_ENTRY_FEATURE_COUNT = PARAMETER_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.AttributEntryImpl <em>Attribut Entry</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.AttributEntryImpl
	 * @see option.impl.OptionPackageImpl#getAttributEntry()
	 * @generated
	 */
	int ATTRIBUT_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_ENTRY__TOKEN = PARAMETER_ENTRY__TOKEN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_ENTRY__VALUE = PARAMETER_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribut Entry</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_ENTRY_FEATURE_COUNT = PARAMETER_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.NativeCodeDirectiveImpl <em>Native Code Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.NativeCodeDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getNativeCodeDirective()
	 * @generated
	 */
	int NATIVE_CODE_DIRECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Native Code Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.OsNameImpl <em>Os Name</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.OsNameImpl
	 * @see option.impl.OptionPackageImpl#getOsName()
	 * @generated
	 */
	int OS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_NAME__TOKEN = NATIVE_CODE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Osname</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_NAME__OSNAME = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Os Name</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_NAME_FEATURE_COUNT = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.OsVersionImpl <em>Os Version</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.OsVersionImpl
	 * @see option.impl.OptionPackageImpl#getOsVersion()
	 * @generated
	 */
	int OS_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION__TOKEN = NATIVE_CODE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Min Version</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION__MIN_VERSION = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Version</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION__MAX_VERSION = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Not Include</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION__MIN_NOT_INCLUDE = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Not Include</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION__MAX_NOT_INCLUDE = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Os Version</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OS_VERSION_FEATURE_COUNT = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link option.impl.ActivationPolicyDirectiveImpl <em>Activation Policy Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ActivationPolicyDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getActivationPolicyDirective()
	 * @generated
	 */
	int ACTIVATION_POLICY_DIRECTIVE = 23;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_POLICY_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Activation Policy Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_POLICY_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.ExcludePackagesImpl <em>Exclude Packages</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ExcludePackagesImpl
	 * @see option.impl.OptionPackageImpl#getExcludePackages()
	 * @generated
	 */
	int EXCLUDE_PACKAGES = 6;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_PACKAGES__TOKEN = ACTIVATION_POLICY_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_PACKAGES__PACKAGES = ACTIVATION_POLICY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclude Packages</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_PACKAGES_FEATURE_COUNT = ACTIVATION_POLICY_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.ProcessorImpl <em>Processor</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ProcessorImpl
	 * @see option.impl.OptionPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 7;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TOKEN = NATIVE_CODE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROCESSOR = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.IncludePackagesImpl <em>Include Packages</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.IncludePackagesImpl
	 * @see option.impl.OptionPackageImpl#getIncludePackages()
	 * @generated
	 */
	int INCLUDE_PACKAGES = 8;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_PACKAGES__TOKEN = ACTIVATION_POLICY_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_PACKAGES__PACKAGES = ACTIVATION_POLICY_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include Packages</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_PACKAGES_FEATURE_COUNT = ACTIVATION_POLICY_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.ExportPackageDirectiveImpl <em>Export Package Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ExportPackageDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getExportPackageDirective()
	 * @generated
	 */
	int EXPORT_PACKAGE_DIRECTIVE = 21;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Export Package Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.UsesImpl <em>Uses</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.UsesImpl
	 * @see option.impl.OptionPackageImpl#getUses()
	 * @generated
	 */
	int USES = 9;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USES__TOKEN = EXPORT_PACKAGE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USES__PACKAGES = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uses</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.FragmentHostDirectiveImpl <em>Fragment Host Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.FragmentHostDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getFragmentHostDirective()
	 * @generated
	 */
	int FRAGMENT_HOST_DIRECTIVE = 19;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Fragment Host Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.ExtensionImpl <em>Extension</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ExtensionImpl
	 * @see option.impl.OptionPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 10;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TOKEN = FRAGMENT_HOST_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION = FRAGMENT_HOST_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = FRAGMENT_HOST_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.MandatoryImpl <em>Mandatory</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.MandatoryImpl
	 * @see option.impl.OptionPackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 11;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANDATORY__TOKEN = EXPORT_PACKAGE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ATTRIBUTS = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.LanguageImpl <em>Language</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.LanguageImpl
	 * @see option.impl.OptionPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 12;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TOKEN = NATIVE_CODE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ISO_CODE = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.RequireBundleDirectiveImpl <em>Require Bundle Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.RequireBundleDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getRequireBundleDirective()
	 * @generated
	 */
	int REQUIRE_BUNDLE_DIRECTIVE = 18;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Require Bundle Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.VisibilityImpl <em>Visibility</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.VisibilityImpl
	 * @see option.impl.OptionPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 13;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__TOKEN = REQUIRE_BUNDLE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__VISIBILITY = REQUIRE_BUNDLE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = REQUIRE_BUNDLE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.SymbolicNameDirectiveImpl <em>Symbolic Name Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.SymbolicNameDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getSymbolicNameDirective()
	 * @generated
	 */
	int SYMBOLIC_NAME_DIRECTIVE = 20;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_NAME_DIRECTIVE__TOKEN = DIRECTIVE_ENTRY__TOKEN;

	/**
	 * The number of structural features of the '<em>Symbolic Name Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_NAME_DIRECTIVE_FEATURE_COUNT = DIRECTIVE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.SingletonImpl <em>Singleton</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.SingletonImpl
	 * @see option.impl.OptionPackageImpl#getSingleton()
	 * @generated
	 */
	int SINGLETON = 14;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON__TOKEN = SYMBOLIC_NAME_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON__SINGLETON = SYMBOLIC_NAME_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FEATURE_COUNT = SYMBOLIC_NAME_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.ImportPackageDirectiveImpl <em>Import Package Directive</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ImportPackageDirectiveImpl
	 * @see option.impl.OptionPackageImpl#getImportPackageDirective()
	 * @generated
	 */
	int IMPORT_PACKAGE_DIRECTIVE = 22;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE_DIRECTIVE__TOKEN = REQUIRE_BUNDLE_DIRECTIVE__TOKEN;

	/**
	 * The number of structural features of the '<em>Import Package Directive</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT = REQUIRE_BUNDLE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link option.impl.ResolutionImpl <em>Resolution</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ResolutionImpl
	 * @see option.impl.OptionPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 15;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__TOKEN = IMPORT_PACKAGE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__RESOLUTION = IMPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FEATURE_COUNT = IMPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.FragmentAttachmentImpl <em>Fragment Attachment</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.FragmentAttachmentImpl
	 * @see option.impl.OptionPackageImpl#getFragmentAttachment()
	 * @generated
	 */
	int FRAGMENT_ATTACHMENT = 16;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_ATTACHMENT__TOKEN = SYMBOLIC_NAME_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Fragment Attachment</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT = SYMBOLIC_NAME_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment Attachment</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_ATTACHMENT_FEATURE_COUNT = SYMBOLIC_NAME_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.SelectionFilterImpl <em>Selection Filter</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.SelectionFilterImpl
	 * @see option.impl.OptionPackageImpl#getSelectionFilter()
	 * @generated
	 */
	int SELECTION_FILTER = 17;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTION_FILTER__TOKEN = NATIVE_CODE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTION_FILTER__EXPRESSION = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Filter</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SELECTION_FILTER_FEATURE_COUNT = NATIVE_CODE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.IncludeClassesImpl <em>Include Classes</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.IncludeClassesImpl
	 * @see option.impl.OptionPackageImpl#getIncludeClasses()
	 * @generated
	 */
	int INCLUDE_CLASSES = 24;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CLASSES__TOKEN = EXPORT_PACKAGE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CLASSES__CLASSES = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include Classes</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_CLASSES_FEATURE_COUNT = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.impl.ExcludeClassesImpl <em>Exclude Classes</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.impl.ExcludeClassesImpl
	 * @see option.impl.OptionPackageImpl#getExcludeClasses()
	 * @generated
	 */
	int EXCLUDE_CLASSES = 25;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CLASSES__TOKEN = EXPORT_PACKAGE_DIRECTIVE__TOKEN;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CLASSES__CLASSES = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclude Classes</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_CLASSES_FEATURE_COUNT = EXPORT_PACKAGE_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link option.FragmentAttachmentEnum <em>Fragment Attachment Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.FragmentAttachmentEnum
	 * @see option.impl.OptionPackageImpl#getFragmentAttachmentEnum()
	 * @generated
	 */
	int FRAGMENT_ATTACHMENT_ENUM = 26;

	/**
	 * The meta object id for the '{@link option.ProcessorEnum <em>Processor Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.ProcessorEnum
	 * @see option.impl.OptionPackageImpl#getProcessorEnum()
	 * @generated
	 */
	int PROCESSOR_ENUM = 27;

	/**
	 * The meta object id for the '{@link option.ResolutionEnum <em>Resolution Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.ResolutionEnum
	 * @see option.impl.OptionPackageImpl#getResolutionEnum()
	 * @generated
	 */
	int RESOLUTION_ENUM = 28;

	/**
	 * The meta object id for the '{@link option.VisibilityEnum <em>Visibility Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.VisibilityEnum
	 * @see option.impl.OptionPackageImpl#getVisibilityEnum()
	 * @generated
	 */
	int VISIBILITY_ENUM = 29;

	/**
	 * The meta object id for the '{@link option.ISOCodeLanguage <em>ISO Code Language</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.ISOCodeLanguage
	 * @see option.impl.OptionPackageImpl#getISOCodeLanguage()
	 * @generated
	 */
	int ISO_CODE_LANGUAGE = 30;

	/**
	 * The meta object id for the '{@link option.ExtensionEnum <em>Extension Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.ExtensionEnum
	 * @see option.impl.OptionPackageImpl#getExtensionEnum()
	 * @generated
	 */
	int EXTENSION_ENUM = 31;

	/**
	 * The meta object id for the '{@link option.OsNameEnum <em>Os Name Enum</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see option.OsNameEnum
	 * @see option.impl.OptionPackageImpl#getOsNameEnum()
	 * @generated
	 */
	int OS_NAME_ENUM = 32;

	/**
	 * Returns the meta object for class '{@link option.ParameterEntry <em>Parameter Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Entry</em>'.
	 * @see option.ParameterEntry
	 * @generated
	 */
	EClass getParameterEntry();

	/**
	 * Returns the meta object for the attribute '{@link option.ParameterEntry#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see option.ParameterEntry#getToken()
	 * @see #getParameterEntry()
	 * @generated
	 */
	EAttribute getParameterEntry_Token();

	/**
	 * Returns the meta object for class '{@link option.DirectiveEntry <em>Directive Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directive Entry</em>'.
	 * @see option.DirectiveEntry
	 * @generated
	 */
	EClass getDirectiveEntry();

	/**
	 * Returns the meta object for class '{@link option.AttributEntry <em>Attribut Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attribut Entry</em>'.
	 * @see option.AttributEntry
	 * @generated
	 */
	EClass getAttributEntry();

	/**
	 * Returns the meta object for the attribute '{@link option.AttributEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see option.AttributEntry#getValue()
	 * @see #getAttributEntry()
	 * @generated
	 */
	EAttribute getAttributEntry_Value();

	/**
	 * Returns the meta object for class '{@link option.OsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Os Name</em>'.
	 * @see option.OsName
	 * @generated
	 */
	EClass getOsName();

	/**
	 * Returns the meta object for the attribute '{@link option.OsName#getOsname <em>Osname</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Osname</em>'.
	 * @see option.OsName#getOsname()
	 * @see #getOsName()
	 * @generated
	 */
	EAttribute getOsName_Osname();

	/**
	 * Returns the meta object for class '{@link option.NativeCodeDirective <em>Native Code Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Native Code Directive</em>'.
	 * @see option.NativeCodeDirective
	 * @generated
	 */
	EClass getNativeCodeDirective();

	/**
	 * Returns the meta object for class '{@link option.OsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Os Version</em>'.
	 * @see option.OsVersion
	 * @generated
	 */
	EClass getOsVersion();

	/**
	 * Returns the meta object for the containment reference '{@link option.OsVersion#getMinVersion <em>Min Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Min Version</em>'.
	 * @see option.OsVersion#getMinVersion()
	 * @see #getOsVersion()
	 * @generated
	 */
	EReference getOsVersion_MinVersion();

	/**
	 * Returns the meta object for the containment reference '{@link option.OsVersion#getMaxVersion <em>Max Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Max Version</em>'.
	 * @see option.OsVersion#getMaxVersion()
	 * @see #getOsVersion()
	 * @generated
	 */
	EReference getOsVersion_MaxVersion();

	/**
	 * Returns the meta object for the attribute '{@link option.OsVersion#isMinNotInclude <em>Min Not Include</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min Not Include</em>'.
	 * @see option.OsVersion#isMinNotInclude()
	 * @see #getOsVersion()
	 * @generated
	 */
	EAttribute getOsVersion_MinNotInclude();

	/**
	 * Returns the meta object for the attribute '{@link option.OsVersion#isMaxNotInclude <em>Max Not Include</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max Not Include</em>'.
	 * @see option.OsVersion#isMaxNotInclude()
	 * @see #getOsVersion()
	 * @generated
	 */
	EAttribute getOsVersion_MaxNotInclude();

	/**
	 * Returns the meta object for class '{@link option.ExcludePackages <em>Exclude Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Exclude Packages</em>'.
	 * @see option.ExcludePackages
	 * @generated
	 */
	EClass getExcludePackages();

	/**
	 * Returns the meta object for the reference list '{@link option.ExcludePackages#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see option.ExcludePackages#getPackages()
	 * @see #getExcludePackages()
	 * @generated
	 */
	EReference getExcludePackages_Packages();

	/**
	 * Returns the meta object for class '{@link option.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see option.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link option.Processor#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see option.Processor#getProcessor()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Processor();

	/**
	 * Returns the meta object for class '{@link option.IncludePackages <em>Include Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Include Packages</em>'.
	 * @see option.IncludePackages
	 * @generated
	 */
	EClass getIncludePackages();

	/**
	 * Returns the meta object for the reference list '{@link option.IncludePackages#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see option.IncludePackages#getPackages()
	 * @see #getIncludePackages()
	 * @generated
	 */
	EReference getIncludePackages_Packages();

	/**
	 * Returns the meta object for class '{@link option.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see option.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for the attribute list '{@link option.Uses#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Packages</em>'.
	 * @see option.Uses#getPackages()
	 * @see #getUses()
	 * @generated
	 */
	EAttribute getUses_Packages();

	/**
	 * Returns the meta object for class '{@link option.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see option.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link option.Extension#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see option.Extension#getExtension()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Extension();

	/**
	 * Returns the meta object for class '{@link option.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see option.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for the reference list '{@link option.Mandatory#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Attributs</em>'.
	 * @see option.Mandatory#getAttributs()
	 * @see #getMandatory()
	 * @generated
	 */
	EReference getMandatory_Attributs();

	/**
	 * Returns the meta object for class '{@link option.Language <em>Language</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Language</em>'.
	 * @see option.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link option.Language#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see option.Language#getIsoCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IsoCode();

	/**
	 * Returns the meta object for class '{@link option.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see option.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the attribute '{@link option.Visibility#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see option.Visibility#getVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	EAttribute getVisibility_Visibility();

	/**
	 * Returns the meta object for class '{@link option.Singleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Singleton</em>'.
	 * @see option.Singleton
	 * @generated
	 */
	EClass getSingleton();

	/**
	 * Returns the meta object for the attribute '{@link option.Singleton#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see option.Singleton#isSingleton()
	 * @see #getSingleton()
	 * @generated
	 */
	EAttribute getSingleton_Singleton();

	/**
	 * Returns the meta object for class '{@link option.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see option.Resolution
	 * @generated
	 */
	EClass getResolution();

	/**
	 * Returns the meta object for the attribute '{@link option.Resolution#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see option.Resolution#getResolution()
	 * @see #getResolution()
	 * @generated
	 */
	EAttribute getResolution_Resolution();

	/**
	 * Returns the meta object for class '{@link option.FragmentAttachment <em>Fragment Attachment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Fragment Attachment</em>'.
	 * @see option.FragmentAttachment
	 * @generated
	 */
	EClass getFragmentAttachment();

	/**
	 * Returns the meta object for the attribute '{@link option.FragmentAttachment#getFragmentAttachment <em>Fragment Attachment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Fragment Attachment</em>'.
	 * @see option.FragmentAttachment#getFragmentAttachment()
	 * @see #getFragmentAttachment()
	 * @generated
	 */
	EAttribute getFragmentAttachment_FragmentAttachment();

	/**
	 * Returns the meta object for class '{@link option.SelectionFilter <em>Selection Filter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Selection Filter</em>'.
	 * @see option.SelectionFilter
	 * @generated
	 */
	EClass getSelectionFilter();

	/**
	 * Returns the meta object for the attribute '{@link option.SelectionFilter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see option.SelectionFilter#getExpression()
	 * @see #getSelectionFilter()
	 * @generated
	 */
	EAttribute getSelectionFilter_Expression();

	/**
	 * Returns the meta object for class '{@link option.RequireBundleDirective <em>Require Bundle Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Require Bundle Directive</em>'.
	 * @see option.RequireBundleDirective
	 * @generated
	 */
	EClass getRequireBundleDirective();

	/**
	 * Returns the meta object for class '{@link option.FragmentHostDirective <em>Fragment Host Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Fragment Host Directive</em>'.
	 * @see option.FragmentHostDirective
	 * @generated
	 */
	EClass getFragmentHostDirective();

	/**
	 * Returns the meta object for class '{@link option.SymbolicNameDirective <em>Symbolic Name Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Symbolic Name Directive</em>'.
	 * @see option.SymbolicNameDirective
	 * @generated
	 */
	EClass getSymbolicNameDirective();

	/**
	 * Returns the meta object for class '{@link option.ExportPackageDirective <em>Export Package Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Export Package Directive</em>'.
	 * @see option.ExportPackageDirective
	 * @generated
	 */
	EClass getExportPackageDirective();

	/**
	 * Returns the meta object for class '{@link option.ImportPackageDirective <em>Import Package Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Import Package Directive</em>'.
	 * @see option.ImportPackageDirective
	 * @generated
	 */
	EClass getImportPackageDirective();

	/**
	 * Returns the meta object for class '{@link option.ActivationPolicyDirective <em>Activation Policy Directive</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Activation Policy Directive</em>'.
	 * @see option.ActivationPolicyDirective
	 * @generated
	 */
	EClass getActivationPolicyDirective();

	/**
	 * Returns the meta object for class '{@link option.IncludeClasses <em>Include Classes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Include Classes</em>'.
	 * @see option.IncludeClasses
	 * @generated
	 */
	EClass getIncludeClasses();

	/**
	 * Returns the meta object for the reference list '{@link option.IncludeClasses#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see option.IncludeClasses#getClasses()
	 * @see #getIncludeClasses()
	 * @generated
	 */
	EReference getIncludeClasses_Classes();

	/**
	 * Returns the meta object for class '{@link option.ExcludeClasses <em>Exclude Classes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Exclude Classes</em>'.
	 * @see option.ExcludeClasses
	 * @generated
	 */
	EClass getExcludeClasses();

	/**
	 * Returns the meta object for the reference list '{@link option.ExcludeClasses#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see option.ExcludeClasses#getClasses()
	 * @see #getExcludeClasses()
	 * @generated
	 */
	EReference getExcludeClasses_Classes();

	/**
	 * Returns the meta object for enum '{@link option.FragmentAttachmentEnum <em>Fragment Attachment Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Fragment Attachment Enum</em>'.
	 * @see option.FragmentAttachmentEnum
	 * @generated
	 */
	EEnum getFragmentAttachmentEnum();

	/**
	 * Returns the meta object for enum '{@link option.ProcessorEnum <em>Processor Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Processor Enum</em>'.
	 * @see option.ProcessorEnum
	 * @generated
	 */
	EEnum getProcessorEnum();

	/**
	 * Returns the meta object for enum '{@link option.ResolutionEnum <em>Resolution Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Resolution Enum</em>'.
	 * @see option.ResolutionEnum
	 * @generated
	 */
	EEnum getResolutionEnum();

	/**
	 * Returns the meta object for enum '{@link option.VisibilityEnum <em>Visibility Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Visibility Enum</em>'.
	 * @see option.VisibilityEnum
	 * @generated
	 */
	EEnum getVisibilityEnum();

	/**
	 * Returns the meta object for enum '{@link option.ISOCodeLanguage <em>ISO Code Language</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>ISO Code Language</em>'.
	 * @see option.ISOCodeLanguage
	 * @generated
	 */
	EEnum getISOCodeLanguage();

	/**
	 * Returns the meta object for enum '{@link option.ExtensionEnum <em>Extension Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Extension Enum</em>'.
	 * @see option.ExtensionEnum
	 * @generated
	 */
	EEnum getExtensionEnum();

	/**
	 * Returns the meta object for enum '{@link option.OsNameEnum <em>Os Name Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Os Name Enum</em>'.
	 * @see option.OsNameEnum
	 * @generated
	 */
	EEnum getOsNameEnum();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptionFactory getOptionFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link option.impl.ParameterEntryImpl <em>Parameter Entry</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ParameterEntryImpl
		 * @see option.impl.OptionPackageImpl#getParameterEntry()
		 * @generated
		 */
		EClass PARAMETER_ENTRY = eINSTANCE.getParameterEntry();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER_ENTRY__TOKEN = eINSTANCE.getParameterEntry_Token();

		/**
		 * The meta object literal for the '{@link option.impl.DirectiveEntryImpl <em>Directive Entry</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.DirectiveEntryImpl
		 * @see option.impl.OptionPackageImpl#getDirectiveEntry()
		 * @generated
		 */
		EClass DIRECTIVE_ENTRY = eINSTANCE.getDirectiveEntry();

		/**
		 * The meta object literal for the '{@link option.impl.AttributEntryImpl <em>Attribut Entry</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.AttributEntryImpl
		 * @see option.impl.OptionPackageImpl#getAttributEntry()
		 * @generated
		 */
		EClass ATTRIBUT_ENTRY = eINSTANCE.getAttributEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUT_ENTRY__VALUE = eINSTANCE.getAttributEntry_Value();

		/**
		 * The meta object literal for the '{@link option.impl.OsNameImpl <em>Os Name</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.OsNameImpl
		 * @see option.impl.OptionPackageImpl#getOsName()
		 * @generated
		 */
		EClass OS_NAME = eINSTANCE.getOsName();

		/**
		 * The meta object literal for the '<em><b>Osname</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OS_NAME__OSNAME = eINSTANCE.getOsName_Osname();

		/**
		 * The meta object literal for the '{@link option.impl.NativeCodeDirectiveImpl <em>Native Code Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.NativeCodeDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getNativeCodeDirective()
		 * @generated
		 */
		EClass NATIVE_CODE_DIRECTIVE = eINSTANCE.getNativeCodeDirective();

		/**
		 * The meta object literal for the '{@link option.impl.OsVersionImpl <em>Os Version</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.OsVersionImpl
		 * @see option.impl.OptionPackageImpl#getOsVersion()
		 * @generated
		 */
		EClass OS_VERSION = eINSTANCE.getOsVersion();

		/**
		 * The meta object literal for the '<em><b>Min Version</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OS_VERSION__MIN_VERSION = eINSTANCE
				.getOsVersion_MinVersion();

		/**
		 * The meta object literal for the '<em><b>Max Version</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OS_VERSION__MAX_VERSION = eINSTANCE
				.getOsVersion_MaxVersion();

		/**
		 * The meta object literal for the '<em><b>Min Not Include</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OS_VERSION__MIN_NOT_INCLUDE = eINSTANCE
				.getOsVersion_MinNotInclude();

		/**
		 * The meta object literal for the '<em><b>Max Not Include</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OS_VERSION__MAX_NOT_INCLUDE = eINSTANCE
				.getOsVersion_MaxNotInclude();

		/**
		 * The meta object literal for the '{@link option.impl.ExcludePackagesImpl <em>Exclude Packages</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ExcludePackagesImpl
		 * @see option.impl.OptionPackageImpl#getExcludePackages()
		 * @generated
		 */
		EClass EXCLUDE_PACKAGES = eINSTANCE.getExcludePackages();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXCLUDE_PACKAGES__PACKAGES = eINSTANCE
				.getExcludePackages_Packages();

		/**
		 * The meta object literal for the '{@link option.impl.ProcessorImpl <em>Processor</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ProcessorImpl
		 * @see option.impl.OptionPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROCESSOR__PROCESSOR = eINSTANCE.getProcessor_Processor();

		/**
		 * The meta object literal for the '{@link option.impl.IncludePackagesImpl <em>Include Packages</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.IncludePackagesImpl
		 * @see option.impl.OptionPackageImpl#getIncludePackages()
		 * @generated
		 */
		EClass INCLUDE_PACKAGES = eINSTANCE.getIncludePackages();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INCLUDE_PACKAGES__PACKAGES = eINSTANCE
				.getIncludePackages_Packages();

		/**
		 * The meta object literal for the '{@link option.impl.UsesImpl <em>Uses</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.UsesImpl
		 * @see option.impl.OptionPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute USES__PACKAGES = eINSTANCE.getUses_Packages();

		/**
		 * The meta object literal for the '{@link option.impl.ExtensionImpl <em>Extension</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ExtensionImpl
		 * @see option.impl.OptionPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EXTENSION__EXTENSION = eINSTANCE.getExtension_Extension();

		/**
		 * The meta object literal for the '{@link option.impl.MandatoryImpl <em>Mandatory</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.MandatoryImpl
		 * @see option.impl.OptionPackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MANDATORY__ATTRIBUTS = eINSTANCE.getMandatory_Attributs();

		/**
		 * The meta object literal for the '{@link option.impl.LanguageImpl <em>Language</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.LanguageImpl
		 * @see option.impl.OptionPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LANGUAGE__ISO_CODE = eINSTANCE.getLanguage_IsoCode();

		/**
		 * The meta object literal for the '{@link option.impl.VisibilityImpl <em>Visibility</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.VisibilityImpl
		 * @see option.impl.OptionPackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VISIBILITY__VISIBILITY = eINSTANCE
				.getVisibility_Visibility();

		/**
		 * The meta object literal for the '{@link option.impl.SingletonImpl <em>Singleton</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.SingletonImpl
		 * @see option.impl.OptionPackageImpl#getSingleton()
		 * @generated
		 */
		EClass SINGLETON = eINSTANCE.getSingleton();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SINGLETON__SINGLETON = eINSTANCE.getSingleton_Singleton();

		/**
		 * The meta object literal for the '{@link option.impl.ResolutionImpl <em>Resolution</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ResolutionImpl
		 * @see option.impl.OptionPackageImpl#getResolution()
		 * @generated
		 */
		EClass RESOLUTION = eINSTANCE.getResolution();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLUTION__RESOLUTION = eINSTANCE
				.getResolution_Resolution();

		/**
		 * The meta object literal for the '{@link option.impl.FragmentAttachmentImpl <em>Fragment Attachment</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.FragmentAttachmentImpl
		 * @see option.impl.OptionPackageImpl#getFragmentAttachment()
		 * @generated
		 */
		EClass FRAGMENT_ATTACHMENT = eINSTANCE.getFragmentAttachment();

		/**
		 * The meta object literal for the '<em><b>Fragment Attachment</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FRAGMENT_ATTACHMENT__FRAGMENT_ATTACHMENT = eINSTANCE
				.getFragmentAttachment_FragmentAttachment();

		/**
		 * The meta object literal for the '{@link option.impl.SelectionFilterImpl <em>Selection Filter</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.SelectionFilterImpl
		 * @see option.impl.OptionPackageImpl#getSelectionFilter()
		 * @generated
		 */
		EClass SELECTION_FILTER = eINSTANCE.getSelectionFilter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SELECTION_FILTER__EXPRESSION = eINSTANCE
				.getSelectionFilter_Expression();

		/**
		 * The meta object literal for the '{@link option.impl.RequireBundleDirectiveImpl <em>Require Bundle Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.RequireBundleDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getRequireBundleDirective()
		 * @generated
		 */
		EClass REQUIRE_BUNDLE_DIRECTIVE = eINSTANCE.getRequireBundleDirective();

		/**
		 * The meta object literal for the '{@link option.impl.FragmentHostDirectiveImpl <em>Fragment Host Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.FragmentHostDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getFragmentHostDirective()
		 * @generated
		 */
		EClass FRAGMENT_HOST_DIRECTIVE = eINSTANCE.getFragmentHostDirective();

		/**
		 * The meta object literal for the '{@link option.impl.SymbolicNameDirectiveImpl <em>Symbolic Name Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.SymbolicNameDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getSymbolicNameDirective()
		 * @generated
		 */
		EClass SYMBOLIC_NAME_DIRECTIVE = eINSTANCE.getSymbolicNameDirective();

		/**
		 * The meta object literal for the '{@link option.impl.ExportPackageDirectiveImpl <em>Export Package Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ExportPackageDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getExportPackageDirective()
		 * @generated
		 */
		EClass EXPORT_PACKAGE_DIRECTIVE = eINSTANCE.getExportPackageDirective();

		/**
		 * The meta object literal for the '{@link option.impl.ImportPackageDirectiveImpl <em>Import Package Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ImportPackageDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getImportPackageDirective()
		 * @generated
		 */
		EClass IMPORT_PACKAGE_DIRECTIVE = eINSTANCE.getImportPackageDirective();

		/**
		 * The meta object literal for the '{@link option.impl.ActivationPolicyDirectiveImpl <em>Activation Policy Directive</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ActivationPolicyDirectiveImpl
		 * @see option.impl.OptionPackageImpl#getActivationPolicyDirective()
		 * @generated
		 */
		EClass ACTIVATION_POLICY_DIRECTIVE = eINSTANCE
				.getActivationPolicyDirective();

		/**
		 * The meta object literal for the '{@link option.impl.IncludeClassesImpl <em>Include Classes</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.IncludeClassesImpl
		 * @see option.impl.OptionPackageImpl#getIncludeClasses()
		 * @generated
		 */
		EClass INCLUDE_CLASSES = eINSTANCE.getIncludeClasses();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INCLUDE_CLASSES__CLASSES = eINSTANCE
				.getIncludeClasses_Classes();

		/**
		 * The meta object literal for the '{@link option.impl.ExcludeClassesImpl <em>Exclude Classes</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.impl.ExcludeClassesImpl
		 * @see option.impl.OptionPackageImpl#getExcludeClasses()
		 * @generated
		 */
		EClass EXCLUDE_CLASSES = eINSTANCE.getExcludeClasses();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXCLUDE_CLASSES__CLASSES = eINSTANCE
				.getExcludeClasses_Classes();

		/**
		 * The meta object literal for the '{@link option.FragmentAttachmentEnum <em>Fragment Attachment Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.FragmentAttachmentEnum
		 * @see option.impl.OptionPackageImpl#getFragmentAttachmentEnum()
		 * @generated
		 */
		EEnum FRAGMENT_ATTACHMENT_ENUM = eINSTANCE.getFragmentAttachmentEnum();

		/**
		 * The meta object literal for the '{@link option.ProcessorEnum <em>Processor Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.ProcessorEnum
		 * @see option.impl.OptionPackageImpl#getProcessorEnum()
		 * @generated
		 */
		EEnum PROCESSOR_ENUM = eINSTANCE.getProcessorEnum();

		/**
		 * The meta object literal for the '{@link option.ResolutionEnum <em>Resolution Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.ResolutionEnum
		 * @see option.impl.OptionPackageImpl#getResolutionEnum()
		 * @generated
		 */
		EEnum RESOLUTION_ENUM = eINSTANCE.getResolutionEnum();

		/**
		 * The meta object literal for the '{@link option.VisibilityEnum <em>Visibility Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.VisibilityEnum
		 * @see option.impl.OptionPackageImpl#getVisibilityEnum()
		 * @generated
		 */
		EEnum VISIBILITY_ENUM = eINSTANCE.getVisibilityEnum();

		/**
		 * The meta object literal for the '{@link option.ISOCodeLanguage <em>ISO Code Language</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.ISOCodeLanguage
		 * @see option.impl.OptionPackageImpl#getISOCodeLanguage()
		 * @generated
		 */
		EEnum ISO_CODE_LANGUAGE = eINSTANCE.getISOCodeLanguage();

		/**
		 * The meta object literal for the '{@link option.ExtensionEnum <em>Extension Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.ExtensionEnum
		 * @see option.impl.OptionPackageImpl#getExtensionEnum()
		 * @generated
		 */
		EEnum EXTENSION_ENUM = eINSTANCE.getExtensionEnum();

		/**
		 * The meta object literal for the '{@link option.OsNameEnum <em>Os Name Enum</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see option.OsNameEnum
		 * @see option.impl.OptionPackageImpl#getOsNameEnum()
		 * @generated
		 */
		EEnum OS_NAME_ENUM = eINSTANCE.getOsNameEnum();

	}

} // OptionPackage
