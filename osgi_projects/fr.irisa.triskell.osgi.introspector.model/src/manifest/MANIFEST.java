/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFEST.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MANIFEST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manifest.MANIFEST#getBundleClassPaths <em>Bundle Class Paths</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleNativeCodes <em>Bundle Native Codes</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleVersion <em>Bundle Version</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleRequiredExecutionEnvironments <em>Bundle Required Execution Environments</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleActivationPolicy <em>Bundle Activation Policy</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleActivator <em>Bundle Activator</em>}</li>
 *   <li>{@link manifest.MANIFEST#getRequireBundles <em>Require Bundles</em>}</li>
 *   <li>{@link manifest.MANIFEST#getImportServices <em>Import Services</em>}</li>
 *   <li>{@link manifest.MANIFEST#getExportServices <em>Export Services</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleSymbolicName <em>Bundle Symbolic Name</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleVendor <em>Bundle Vendor</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleCopyright <em>Bundle Copyright</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleContactAddress <em>Bundle Contact Address</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleDescription <em>Bundle Description</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleName <em>Bundle Name</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleCategory <em>Bundle Category</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleUpdateLocation <em>Bundle Update Location</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleDocURL <em>Bundle Doc URL</em>}</li>
 *   <li>{@link manifest.MANIFEST#getImportPackages <em>Import Packages</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleLocalization <em>Bundle Localization</em>}</li>
 *   <li>{@link manifest.MANIFEST#getFragmentHost <em>Fragment Host</em>}</li>
 *   <li>{@link manifest.MANIFEST#getDynamicImportPackages <em>Dynamic Import Packages</em>}</li>
 *   <li>{@link manifest.MANIFEST#getExportPackages <em>Export Packages</em>}</li>
 *   <li>{@link manifest.MANIFEST#getUnknownEntries <em>Unknown Entries</em>}</li>
 *   <li>{@link manifest.MANIFEST#isNativeCodeOptional <em>Native Code Optional</em>}</li>
 *   <li>{@link manifest.MANIFEST#getBundleManifestVersion <em>Bundle Manifest Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see manifest.ManifestPackage#getMANIFEST()
 * @model
 * @generated
 */
public interface MANIFEST extends EObject {
	/**
	 * Returns the value of the '<em><b>Bundle Class Paths</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.BundleClassPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Class Paths</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Class Paths</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_BundleClassPaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleClassPath> getBundleClassPaths();

	/**
	 * Returns the value of the '<em><b>Bundle Native Codes</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.BundleNativeCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Native Codes</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Native Codes</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_BundleNativeCodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleNativeCode> getBundleNativeCodes();

	/**
	 * Returns the value of the '<em><b>Bundle Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Version</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Version</em>' containment reference.
	 * @see #setBundleVersion(BundleVersion)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleVersion()
	 * @model containment="true"
	 * @generated
	 */
	BundleVersion getBundleVersion();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleVersion <em>Bundle Version</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Version</em>' containment reference.
	 * @see #getBundleVersion()
	 * @generated
	 */
	void setBundleVersion(BundleVersion value);

	/**
	 * Returns the value of the '<em><b>Bundle Required Execution Environments</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.BundleRequiredExecutionEnvironment}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Bundle Required Execution Environments</em>'
	 * containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Required Execution Environments</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_BundleRequiredExecutionEnvironments()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleRequiredExecutionEnvironment> getBundleRequiredExecutionEnvironments();

	/**
	 * Returns the value of the '<em><b>Bundle Activation Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Activation Policy</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Activation Policy</em>' containment reference.
	 * @see #setBundleActivationPolicy(BundleActivationPolicy)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleActivationPolicy()
	 * @model containment="true"
	 * @generated
	 */
	BundleActivationPolicy getBundleActivationPolicy();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleActivationPolicy <em>Bundle Activation Policy</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Activation Policy</em>' containment reference.
	 * @see #getBundleActivationPolicy()
	 * @generated
	 */
	void setBundleActivationPolicy(BundleActivationPolicy value);

	/**
	 * Returns the value of the '<em><b>Bundle Activator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Activator</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Activator</em>' containment reference.
	 * @see #setBundleActivator(BundleActivator)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleActivator()
	 * @model containment="true"
	 * @generated
	 */
	BundleActivator getBundleActivator();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleActivator <em>Bundle Activator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Activator</em>' containment reference.
	 * @see #getBundleActivator()
	 * @generated
	 */
	void setBundleActivator(BundleActivator value);

	/**
	 * Returns the value of the '<em><b>Require Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.RequireBundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Bundles</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Bundles</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_RequireBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequireBundle> getRequireBundles();

	/**
	 * Returns the value of the '<em><b>Import Services</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.ImportService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Services</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Services</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_ImportServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportService> getImportServices();

	/**
	 * Returns the value of the '<em><b>Export Services</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.ExportService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Services</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Services</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_ExportServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportService> getExportServices();

	/**
	 * Returns the value of the '<em><b>Bundle Symbolic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Symbolic Name</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Symbolic Name</em>' containment reference.
	 * @see #setBundleSymbolicName(BundleSymbolicName)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleSymbolicName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BundleSymbolicName getBundleSymbolicName();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleSymbolicName <em>Bundle Symbolic Name</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Symbolic Name</em>' containment reference.
	 * @see #getBundleSymbolicName()
	 * @generated
	 */
	void setBundleSymbolicName(BundleSymbolicName value);

	/**
	 * Returns the value of the '<em><b>Bundle Vendor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Vendor</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Vendor</em>' containment reference.
	 * @see #setBundleVendor(BundleVendor)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleVendor()
	 * @model containment="true"
	 * @generated
	 */
	BundleVendor getBundleVendor();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleVendor <em>Bundle Vendor</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Vendor</em>' containment reference.
	 * @see #getBundleVendor()
	 * @generated
	 */
	void setBundleVendor(BundleVendor value);

	/**
	 * Returns the value of the '<em><b>Bundle Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Copyright</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Copyright</em>' containment reference.
	 * @see #setBundleCopyright(BundleCopyright)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleCopyright()
	 * @model containment="true"
	 * @generated
	 */
	BundleCopyright getBundleCopyright();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleCopyright <em>Bundle Copyright</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Copyright</em>' containment reference.
	 * @see #getBundleCopyright()
	 * @generated
	 */
	void setBundleCopyright(BundleCopyright value);

	/**
	 * Returns the value of the '<em><b>Bundle Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Contact Address</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Contact Address</em>' containment reference.
	 * @see #setBundleContactAddress(BundleContactAddress)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleContactAddress()
	 * @model containment="true"
	 * @generated
	 */
	BundleContactAddress getBundleContactAddress();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleContactAddress <em>Bundle Contact Address</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Contact Address</em>' containment reference.
	 * @see #getBundleContactAddress()
	 * @generated
	 */
	void setBundleContactAddress(BundleContactAddress value);

	/**
	 * Returns the value of the '<em><b>Bundle Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Description</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Description</em>' containment reference.
	 * @see #setBundleDescription(BundleDescription)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleDescription()
	 * @model containment="true"
	 * @generated
	 */
	BundleDescription getBundleDescription();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleDescription <em>Bundle Description</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Description</em>' containment reference.
	 * @see #getBundleDescription()
	 * @generated
	 */
	void setBundleDescription(BundleDescription value);

	/**
	 * Returns the value of the '<em><b>Bundle Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Name</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Name</em>' containment reference.
	 * @see #setBundleName(BundleName)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleName()
	 * @model containment="true"
	 * @generated
	 */
	BundleName getBundleName();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleName <em>Bundle Name</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Name</em>' containment reference.
	 * @see #getBundleName()
	 * @generated
	 */
	void setBundleName(BundleName value);

	/**
	 * Returns the value of the '<em><b>Bundle Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Category</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Category</em>' containment reference.
	 * @see #setBundleCategory(BundleCategory)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleCategory()
	 * @model containment="true"
	 * @generated
	 */
	BundleCategory getBundleCategory();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleCategory <em>Bundle Category</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Category</em>' containment reference.
	 * @see #getBundleCategory()
	 * @generated
	 */
	void setBundleCategory(BundleCategory value);

	/**
	 * Returns the value of the '<em><b>Bundle Update Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Update Location</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Update Location</em>' containment reference.
	 * @see #setBundleUpdateLocation(BundleUpdateLocation)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleUpdateLocation()
	 * @model containment="true"
	 * @generated
	 */
	BundleUpdateLocation getBundleUpdateLocation();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleUpdateLocation <em>Bundle Update Location</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Update Location</em>' containment reference.
	 * @see #getBundleUpdateLocation()
	 * @generated
	 */
	void setBundleUpdateLocation(BundleUpdateLocation value);

	/**
	 * Returns the value of the '<em><b>Bundle Doc URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Doc URL</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Doc URL</em>' containment reference.
	 * @see #setBundleDocURL(BundleDocURL)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleDocURL()
	 * @model containment="true"
	 * @generated
	 */
	BundleDocURL getBundleDocURL();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleDocURL <em>Bundle Doc URL</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Doc URL</em>' containment reference.
	 * @see #getBundleDocURL()
	 * @generated
	 */
	void setBundleDocURL(BundleDocURL value);

	/**
	 * Returns the value of the '<em><b>Import Packages</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.ImportPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Packages</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Packages</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_ImportPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportPackage> getImportPackages();

	/**
	 * Returns the value of the '<em><b>Bundle Localization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Localization</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Localization</em>' containment reference.
	 * @see #setBundleLocalization(BundleLocalization)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleLocalization()
	 * @model containment="true"
	 * @generated
	 */
	BundleLocalization getBundleLocalization();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleLocalization <em>Bundle Localization</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Localization</em>' containment reference.
	 * @see #getBundleLocalization()
	 * @generated
	 */
	void setBundleLocalization(BundleLocalization value);

	/**
	 * Returns the value of the '<em><b>Fragment Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Host</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment Host</em>' containment reference.
	 * @see #setFragmentHost(FragmentHost)
	 * @see manifest.ManifestPackage#getMANIFEST_FragmentHost()
	 * @model containment="true"
	 * @generated
	 */
	FragmentHost getFragmentHost();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getFragmentHost <em>Fragment Host</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Host</em>' containment reference.
	 * @see #getFragmentHost()
	 * @generated
	 */
	void setFragmentHost(FragmentHost value);

	/**
	 * Returns the value of the '<em><b>Dynamic Import Packages</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.DynamicImportPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Import Packages</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Import Packages</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_DynamicImportPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicImportPackage> getDynamicImportPackages();

	/**
	 * Returns the value of the '<em><b>Export Packages</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.ExportPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Packages</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Packages</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_ExportPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportPackage> getExportPackages();

	/**
	 * Returns the value of the '<em><b>Unknown Entries</b></em>' containment reference list.
	 * The list contents are of type {@link manifest.SimpleManifestEntryManyValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Entries</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Entries</em>' containment reference list.
	 * @see manifest.ManifestPackage#getMANIFEST_UnknownEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleManifestEntryManyValues> getUnknownEntries();

	/**
	 * Returns the value of the '<em><b>Native Code Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Code Optional</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Code Optional</em>' attribute.
	 * @see #setNativeCodeOptional(boolean)
	 * @see manifest.ManifestPackage#getMANIFEST_NativeCodeOptional()
	 * @model dataType="manifest.boolean"
	 * @generated
	 */
	boolean isNativeCodeOptional();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#isNativeCodeOptional <em>Native Code Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Code Optional</em>' attribute.
	 * @see #isNativeCodeOptional()
	 * @generated
	 */
	void setNativeCodeOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Bundle Manifest Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Manifest Version</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Manifest Version</em>' containment reference.
	 * @see #setBundleManifestVersion(BundleManifestVersion)
	 * @see manifest.ManifestPackage#getMANIFEST_BundleManifestVersion()
	 * @model containment="true"
	 * @generated
	 */
	BundleManifestVersion getBundleManifestVersion();

	/**
	 * Sets the value of the '{@link manifest.MANIFEST#getBundleManifestVersion <em>Bundle Manifest Version</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Manifest Version</em>' containment reference.
	 * @see #getBundleManifestVersion()
	 * @generated
	 */
	void setBundleManifestVersion(BundleManifestVersion value);

	void addUnknownEntry(SimpleManifestEntryManyValues entry);

	void addBundleClassPath(BundleClassPath entry);

	void addBundleNativeCode(BundleNativeCode entry);

	void addBundleRequiredExecutionEnvironment(
			BundleRequiredExecutionEnvironment entry);

	void addDynamicImportPackage(DynamicImportPackage entry);

	void addExportPackage(ExportPackage entry);

	void addExportService(ExportService entry);

	void addImportPackage(ImportPackage entry);

	void addRequireBundle(RequireBundle entry);

	void addImportService(ImportService entry);

	void removeUnknownEntry(SimpleManifestEntryManyValues entry);

	void removeBundleClassPath(BundleClassPath entry);

	void removeBundleRequiredExecutionEnvironment(
			BundleRequiredExecutionEnvironment entry);

	void removeDynamicImportPackage(DynamicImportPackage entry);

	void removeExportPackage(ExportPackage entry);

	void removeExportService(ExportService entry);

	void removeImportService(ImportService entry);

	void removeImportPackage(ImportPackage entry);

	void removeRequireBundle(RequireBundle entry);

	void removeBundleNativeCode(BundleNativeCode entry);

} // MANIFEST
