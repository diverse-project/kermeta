/**
 * <copyright>
 * </copyright>
 *
 * $Id: MANIFESTImpl.java,v 1.2 2008-07-31 12:23:18 edaubert Exp $
 */
package manifest.impl;

import jar.File;
import jar.Package;
import jar.SystemEntry;

import java.util.Collection;
import java.util.Iterator;

import manifest.BundleActivationPolicy;
import manifest.BundleActivator;
import manifest.BundleCategory;
import manifest.BundleClassPath;
import manifest.BundleContactAddress;
import manifest.BundleCopyright;
import manifest.BundleDescription;
import manifest.BundleDocURL;
import manifest.BundleLocalization;
import manifest.BundleManifestVersion;
import manifest.BundleName;
import manifest.BundleNativeCode;
import manifest.BundleRequiredExecutionEnvironment;
import manifest.BundleSymbolicName;
import manifest.BundleUpdateLocation;
import manifest.BundleVendor;
import manifest.BundleVersion;
import manifest.DynamicImportPackage;
import manifest.ExportPackage;
import manifest.ExportService;
import manifest.FragmentHost;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.ManifestPackage;
import manifest.RequireBundle;
import manifest.SimpleManifestEntryManyValues;
import option.AttributEntry;
import option.ExportPackageDirective;
import option.FragmentAttachment;
import option.Singleton;
import option.SymbolicNameDirective;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MANIFEST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleClassPaths <em>Bundle Class Paths</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleNativeCodes <em>Bundle Native Codes</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleVersion <em>Bundle Version</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleRequiredExecutionEnvironments <em>Bundle Required Execution Environments</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleActivationPolicy <em>Bundle Activation Policy</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleActivator <em>Bundle Activator</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getRequireBundles <em>Require Bundles</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getImportServices <em>Import Services</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getExportServices <em>Export Services</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleSymbolicName <em>Bundle Symbolic Name</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleVendor <em>Bundle Vendor</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleCopyright <em>Bundle Copyright</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleContactAddress <em>Bundle Contact Address</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleDescription <em>Bundle Description</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleName <em>Bundle Name</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleCategory <em>Bundle Category</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleUpdateLocation <em>Bundle Update Location</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleDocURL <em>Bundle Doc URL</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getImportPackages <em>Import Packages</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleLocalization <em>Bundle Localization</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getFragmentHost <em>Fragment Host</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getDynamicImportPackages <em>Dynamic Import Packages</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getExportPackages <em>Export Packages</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getUnknownEntries <em>Unknown Entries</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#isNativeCodeOptional <em>Native Code Optional</em>}</li>
 * <li>{@link manifest.impl.MANIFESTImpl#getBundleManifestVersion <em>Bundle Manifest Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MANIFESTImpl extends EObjectImpl implements MANIFEST {
	/**
	 * The cached value of the '{@link #getBundleClassPaths() <em>Bundle Class Paths</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleClassPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleClassPath> bundleClassPaths;

	/**
	 * The cached value of the '{@link #getBundleNativeCodes() <em>Bundle Native Codes</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleNativeCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleNativeCode> bundleNativeCodes;

	/**
	 * The cached value of the '{@link #getBundleVersion() <em>Bundle Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleVersion()
	 * @generated
	 * @ordered
	 */
	protected BundleVersion bundleVersion;

	/**
	 * The cached value of the '{@link #getBundleRequiredExecutionEnvironments() <em>Bundle Required Execution Environments</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleRequiredExecutionEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleRequiredExecutionEnvironment> bundleRequiredExecutionEnvironments;

	/**
	 * The cached value of the '{@link #getBundleActivationPolicy() <em>Bundle Activation Policy</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleActivationPolicy()
	 * @generated
	 * @ordered
	 */
	protected BundleActivationPolicy bundleActivationPolicy;

	/**
	 * The cached value of the '{@link #getBundleActivator() <em>Bundle Activator</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleActivator()
	 * @generated
	 * @ordered
	 */
	protected BundleActivator bundleActivator;

	/**
	 * The cached value of the '{@link #getRequireBundles() <em>Require Bundles</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRequireBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireBundle> requireBundles;

	/**
	 * The cached value of the '{@link #getImportServices() <em>Import Services</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImportServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportService> importServices;

	/**
	 * The cached value of the '{@link #getExportServices() <em>Export Services</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExportServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportService> exportServices;

	/**
	 * The cached value of the '{@link #getBundleSymbolicName() <em>Bundle Symbolic Name</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected BundleSymbolicName bundleSymbolicName;

	/**
	 * The cached value of the '{@link #getBundleVendor() <em>Bundle Vendor</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleVendor()
	 * @generated
	 * @ordered
	 */
	protected BundleVendor bundleVendor;

	/**
	 * The cached value of the '{@link #getBundleCopyright() <em>Bundle Copyright</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleCopyright()
	 * @generated
	 * @ordered
	 */
	protected BundleCopyright bundleCopyright;

	/**
	 * The cached value of the '{@link #getBundleContactAddress() <em>Bundle Contact Address</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleContactAddress()
	 * @generated
	 * @ordered
	 */
	protected BundleContactAddress bundleContactAddress;

	/**
	 * The cached value of the '{@link #getBundleDescription() <em>Bundle Description</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleDescription()
	 * @generated
	 * @ordered
	 */
	protected BundleDescription bundleDescription;

	/**
	 * The cached value of the '{@link #getBundleName() <em>Bundle Name</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected BundleName bundleName;

	/**
	 * The cached value of the '{@link #getBundleCategory() <em>Bundle Category</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleCategory()
	 * @generated
	 * @ordered
	 */
	protected BundleCategory bundleCategory;

	/**
	 * The cached value of the '{@link #getBundleUpdateLocation() <em>Bundle Update Location</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleUpdateLocation()
	 * @generated
	 * @ordered
	 */
	protected BundleUpdateLocation bundleUpdateLocation;

	/**
	 * The cached value of the '{@link #getBundleDocURL() <em>Bundle Doc URL</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleDocURL()
	 * @generated
	 * @ordered
	 */
	protected BundleDocURL bundleDocURL;

	/**
	 * The cached value of the '{@link #getImportPackages() <em>Import Packages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImportPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportPackage> importPackages;

	/**
	 * The cached value of the '{@link #getBundleLocalization() <em>Bundle Localization</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleLocalization()
	 * @generated
	 * @ordered
	 */
	protected BundleLocalization bundleLocalization;

	/**
	 * The cached value of the '{@link #getFragmentHost() <em>Fragment Host</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFragmentHost()
	 * @generated
	 * @ordered
	 */
	protected FragmentHost fragmentHost;

	/**
	 * The cached value of the '{@link #getDynamicImportPackages() <em>Dynamic Import Packages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDynamicImportPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicImportPackage> dynamicImportPackages;

	/**
	 * The cached value of the '{@link #getExportPackages() <em>Export Packages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExportPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportPackage> exportPackages;

	/**
	 * The cached value of the '{@link #getUnknownEntries() <em>Unknown Entries</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnknownEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleManifestEntryManyValues> unknownEntries;

	/**
	 * The default value of the '{@link #isNativeCodeOptional() <em>Native Code Optional</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isNativeCodeOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_CODE_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNativeCodeOptional() <em>Native Code Optional</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isNativeCodeOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean nativeCodeOptional = NATIVE_CODE_OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBundleManifestVersion() <em>Bundle Manifest Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBundleManifestVersion()
	 * @generated
	 * @ordered
	 */
	protected BundleManifestVersion bundleManifestVersion;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MANIFESTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.MANIFEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BundleClassPath> getBundleClassPaths() {
		if (bundleClassPaths == null) {
			bundleClassPaths = new EObjectContainmentEList<BundleClassPath>(
					BundleClassPath.class, this,
					ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS);
		}
		return bundleClassPaths;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BundleNativeCode> getBundleNativeCodes() {
		if (bundleNativeCodes == null) {
			bundleNativeCodes = new EObjectContainmentEList<BundleNativeCode>(
					BundleNativeCode.class, this,
					ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES);
		}
		return bundleNativeCodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleVersion getBundleVersion() {
		return bundleVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleVersion(
			BundleVersion newBundleVersion, NotificationChain msgs) {
		BundleVersion oldBundleVersion = bundleVersion;
		bundleVersion = newBundleVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.MANIFEST__BUNDLE_VERSION,
					oldBundleVersion, newBundleVersion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleVersion(BundleVersion newBundleVersion) {
		if (newBundleVersion != bundleVersion) {
			NotificationChain msgs = null;
			if (bundleVersion != null)
				msgs = ((InternalEObject) bundleVersion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_VERSION,
						null, msgs);
			if (newBundleVersion != null)
				msgs = ((InternalEObject) newBundleVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_VERSION,
						null, msgs);
			msgs = basicSetBundleVersion(newBundleVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_VERSION, newBundleVersion,
					newBundleVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BundleRequiredExecutionEnvironment> getBundleRequiredExecutionEnvironments() {
		if (bundleRequiredExecutionEnvironments == null) {
			bundleRequiredExecutionEnvironments = new EObjectContainmentEList<BundleRequiredExecutionEnvironment>(
					BundleRequiredExecutionEnvironment.class,
					this,
					ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS);
		}
		return bundleRequiredExecutionEnvironments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleActivationPolicy getBundleActivationPolicy() {
		return bundleActivationPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleActivationPolicy(
			BundleActivationPolicy newBundleActivationPolicy,
			NotificationChain msgs) {
		BundleActivationPolicy oldBundleActivationPolicy = bundleActivationPolicy;
		bundleActivationPolicy = newBundleActivationPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY,
					oldBundleActivationPolicy, newBundleActivationPolicy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleActivationPolicy(
			BundleActivationPolicy newBundleActivationPolicy) {
		if (newBundleActivationPolicy != bundleActivationPolicy) {
			NotificationChain msgs = null;
			if (bundleActivationPolicy != null)
				msgs = ((InternalEObject) bundleActivationPolicy)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY,
								null, msgs);
			if (newBundleActivationPolicy != null)
				msgs = ((InternalEObject) newBundleActivationPolicy)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY,
								null, msgs);
			msgs = basicSetBundleActivationPolicy(newBundleActivationPolicy,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY,
					newBundleActivationPolicy, newBundleActivationPolicy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleActivator getBundleActivator() {
		return bundleActivator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleActivator(
			BundleActivator newBundleActivator, NotificationChain msgs) {
		BundleActivator oldBundleActivator = bundleActivator;
		bundleActivator = newBundleActivator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR,
					oldBundleActivator, newBundleActivator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleActivator(BundleActivator newBundleActivator) {
		if (newBundleActivator != bundleActivator) {
			NotificationChain msgs = null;
			if (bundleActivator != null)
				msgs = ((InternalEObject) bundleActivator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR,
						null, msgs);
			if (newBundleActivator != null)
				msgs = ((InternalEObject) newBundleActivator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR,
						null, msgs);
			msgs = basicSetBundleActivator(newBundleActivator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR,
					newBundleActivator, newBundleActivator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequireBundle> getRequireBundles() {
		if (requireBundles == null) {
			requireBundles = new EObjectContainmentEList<RequireBundle>(
					RequireBundle.class, this,
					ManifestPackage.MANIFEST__REQUIRE_BUNDLES);
		}
		return requireBundles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ImportService> getImportServices() {
		if (importServices == null) {
			importServices = new EObjectContainmentEList<ImportService>(
					ImportService.class, this,
					ManifestPackage.MANIFEST__IMPORT_SERVICES);
		}
		return importServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExportService> getExportServices() {
		if (exportServices == null) {
			exportServices = new EObjectContainmentEList<ExportService>(
					ExportService.class, this,
					ManifestPackage.MANIFEST__EXPORT_SERVICES);
		}
		return exportServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleSymbolicName getBundleSymbolicName() {
		return bundleSymbolicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleSymbolicName(
			BundleSymbolicName newBundleSymbolicName, NotificationChain msgs) {
		BundleSymbolicName oldBundleSymbolicName = bundleSymbolicName;
		bundleSymbolicName = newBundleSymbolicName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME,
					oldBundleSymbolicName, newBundleSymbolicName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleSymbolicName(BundleSymbolicName newBundleSymbolicName) {
		if (newBundleSymbolicName != bundleSymbolicName) {
			NotificationChain msgs = null;
			if (bundleSymbolicName != null)
				msgs = ((InternalEObject) bundleSymbolicName)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME,
								null, msgs);
			if (newBundleSymbolicName != null)
				msgs = ((InternalEObject) newBundleSymbolicName)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME,
								null, msgs);
			msgs = basicSetBundleSymbolicName(newBundleSymbolicName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME,
					newBundleSymbolicName, newBundleSymbolicName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleVendor getBundleVendor() {
		return bundleVendor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleVendor(BundleVendor newBundleVendor,
			NotificationChain msgs) {
		BundleVendor oldBundleVendor = bundleVendor;
		bundleVendor = newBundleVendor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.MANIFEST__BUNDLE_VENDOR,
					oldBundleVendor, newBundleVendor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleVendor(BundleVendor newBundleVendor) {
		if (newBundleVendor != bundleVendor) {
			NotificationChain msgs = null;
			if (bundleVendor != null)
				msgs = ((InternalEObject) bundleVendor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_VENDOR,
						null, msgs);
			if (newBundleVendor != null)
				msgs = ((InternalEObject) newBundleVendor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_VENDOR,
						null, msgs);
			msgs = basicSetBundleVendor(newBundleVendor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_VENDOR, newBundleVendor,
					newBundleVendor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleCopyright getBundleCopyright() {
		return bundleCopyright;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleCopyright(
			BundleCopyright newBundleCopyright, NotificationChain msgs) {
		BundleCopyright oldBundleCopyright = bundleCopyright;
		bundleCopyright = newBundleCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT,
					oldBundleCopyright, newBundleCopyright);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleCopyright(BundleCopyright newBundleCopyright) {
		if (newBundleCopyright != bundleCopyright) {
			NotificationChain msgs = null;
			if (bundleCopyright != null)
				msgs = ((InternalEObject) bundleCopyright).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT,
						null, msgs);
			if (newBundleCopyright != null)
				msgs = ((InternalEObject) newBundleCopyright).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT,
						null, msgs);
			msgs = basicSetBundleCopyright(newBundleCopyright, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT,
					newBundleCopyright, newBundleCopyright));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleContactAddress getBundleContactAddress() {
		return bundleContactAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleContactAddress(
			BundleContactAddress newBundleContactAddress, NotificationChain msgs) {
		BundleContactAddress oldBundleContactAddress = bundleContactAddress;
		bundleContactAddress = newBundleContactAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS,
					oldBundleContactAddress, newBundleContactAddress);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleContactAddress(
			BundleContactAddress newBundleContactAddress) {
		if (newBundleContactAddress != bundleContactAddress) {
			NotificationChain msgs = null;
			if (bundleContactAddress != null)
				msgs = ((InternalEObject) bundleContactAddress)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS,
								null, msgs);
			if (newBundleContactAddress != null)
				msgs = ((InternalEObject) newBundleContactAddress)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS,
								null, msgs);
			msgs = basicSetBundleContactAddress(newBundleContactAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS,
					newBundleContactAddress, newBundleContactAddress));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleDescription getBundleDescription() {
		return bundleDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleDescription(
			BundleDescription newBundleDescription, NotificationChain msgs) {
		BundleDescription oldBundleDescription = bundleDescription;
		bundleDescription = newBundleDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION,
					oldBundleDescription, newBundleDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleDescription(BundleDescription newBundleDescription) {
		if (newBundleDescription != bundleDescription) {
			NotificationChain msgs = null;
			if (bundleDescription != null)
				msgs = ((InternalEObject) bundleDescription).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION,
						null, msgs);
			if (newBundleDescription != null)
				msgs = ((InternalEObject) newBundleDescription).eInverseAdd(
						this, EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION,
						null, msgs);
			msgs = basicSetBundleDescription(newBundleDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION,
					newBundleDescription, newBundleDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleName getBundleName() {
		return bundleName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleName(BundleName newBundleName,
			NotificationChain msgs) {
		BundleName oldBundleName = bundleName;
		bundleName = newBundleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.MANIFEST__BUNDLE_NAME,
					oldBundleName, newBundleName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleName(BundleName newBundleName) {
		if (newBundleName != bundleName) {
			NotificationChain msgs = null;
			if (bundleName != null)
				msgs = ((InternalEObject) bundleName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_NAME, null,
						msgs);
			if (newBundleName != null)
				msgs = ((InternalEObject) newBundleName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_NAME, null,
						msgs);
			msgs = basicSetBundleName(newBundleName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_NAME, newBundleName,
					newBundleName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleCategory getBundleCategory() {
		return bundleCategory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleCategory(
			BundleCategory newBundleCategory, NotificationChain msgs) {
		BundleCategory oldBundleCategory = bundleCategory;
		bundleCategory = newBundleCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_CATEGORY,
					oldBundleCategory, newBundleCategory);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleCategory(BundleCategory newBundleCategory) {
		if (newBundleCategory != bundleCategory) {
			NotificationChain msgs = null;
			if (bundleCategory != null)
				msgs = ((InternalEObject) bundleCategory).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_CATEGORY,
						null, msgs);
			if (newBundleCategory != null)
				msgs = ((InternalEObject) newBundleCategory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_CATEGORY,
						null, msgs);
			msgs = basicSetBundleCategory(newBundleCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_CATEGORY,
					newBundleCategory, newBundleCategory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleUpdateLocation getBundleUpdateLocation() {
		return bundleUpdateLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleUpdateLocation(
			BundleUpdateLocation newBundleUpdateLocation, NotificationChain msgs) {
		BundleUpdateLocation oldBundleUpdateLocation = bundleUpdateLocation;
		bundleUpdateLocation = newBundleUpdateLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION,
					oldBundleUpdateLocation, newBundleUpdateLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleUpdateLocation(
			BundleUpdateLocation newBundleUpdateLocation) {
		if (newBundleUpdateLocation != bundleUpdateLocation) {
			NotificationChain msgs = null;
			if (bundleUpdateLocation != null)
				msgs = ((InternalEObject) bundleUpdateLocation)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION,
								null, msgs);
			if (newBundleUpdateLocation != null)
				msgs = ((InternalEObject) newBundleUpdateLocation)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION,
								null, msgs);
			msgs = basicSetBundleUpdateLocation(newBundleUpdateLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION,
					newBundleUpdateLocation, newBundleUpdateLocation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleDocURL getBundleDocURL() {
		return bundleDocURL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleDocURL(BundleDocURL newBundleDocURL,
			NotificationChain msgs) {
		BundleDocURL oldBundleDocURL = bundleDocURL;
		bundleDocURL = newBundleDocURL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.MANIFEST__BUNDLE_DOC_URL,
					oldBundleDocURL, newBundleDocURL);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleDocURL(BundleDocURL newBundleDocURL) {
		if (newBundleDocURL != bundleDocURL) {
			NotificationChain msgs = null;
			if (bundleDocURL != null)
				msgs = ((InternalEObject) bundleDocURL).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_DOC_URL,
						null, msgs);
			if (newBundleDocURL != null)
				msgs = ((InternalEObject) newBundleDocURL).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__BUNDLE_DOC_URL,
						null, msgs);
			msgs = basicSetBundleDocURL(newBundleDocURL, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_DOC_URL, newBundleDocURL,
					newBundleDocURL));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ImportPackage> getImportPackages() {
		if (importPackages == null) {
			importPackages = new EObjectContainmentEList<ImportPackage>(
					ImportPackage.class, this,
					ManifestPackage.MANIFEST__IMPORT_PACKAGES);
		}
		return importPackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleLocalization getBundleLocalization() {
		return bundleLocalization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleLocalization(
			BundleLocalization newBundleLocalization, NotificationChain msgs) {
		BundleLocalization oldBundleLocalization = bundleLocalization;
		bundleLocalization = newBundleLocalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION,
					oldBundleLocalization, newBundleLocalization);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleLocalization(BundleLocalization newBundleLocalization) {
		if (newBundleLocalization != bundleLocalization) {
			NotificationChain msgs = null;
			if (bundleLocalization != null)
				msgs = ((InternalEObject) bundleLocalization)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION,
								null, msgs);
			if (newBundleLocalization != null)
				msgs = ((InternalEObject) newBundleLocalization)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION,
								null, msgs);
			msgs = basicSetBundleLocalization(newBundleLocalization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION,
					newBundleLocalization, newBundleLocalization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FragmentHost getFragmentHost() {
		return fragmentHost;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFragmentHost(FragmentHost newFragmentHost,
			NotificationChain msgs) {
		FragmentHost oldFragmentHost = fragmentHost;
		fragmentHost = newFragmentHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ManifestPackage.MANIFEST__FRAGMENT_HOST,
					oldFragmentHost, newFragmentHost);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFragmentHost(FragmentHost newFragmentHost) {
		if (newFragmentHost != fragmentHost) {
			NotificationChain msgs = null;
			if (fragmentHost != null)
				msgs = ((InternalEObject) fragmentHost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__FRAGMENT_HOST,
						null, msgs);
			if (newFragmentHost != null)
				msgs = ((InternalEObject) newFragmentHost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ManifestPackage.MANIFEST__FRAGMENT_HOST,
						null, msgs);
			msgs = basicSetFragmentHost(newFragmentHost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__FRAGMENT_HOST, newFragmentHost,
					newFragmentHost));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DynamicImportPackage> getDynamicImportPackages() {
		if (dynamicImportPackages == null) {
			dynamicImportPackages = new EObjectContainmentEList<DynamicImportPackage>(
					DynamicImportPackage.class, this,
					ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES);
		}
		return dynamicImportPackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ExportPackage> getExportPackages() {
		if (exportPackages == null) {
			exportPackages = new EObjectContainmentEList<ExportPackage>(
					ExportPackage.class, this,
					ManifestPackage.MANIFEST__EXPORT_PACKAGES);
		}
		return exportPackages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SimpleManifestEntryManyValues> getUnknownEntries() {
		if (unknownEntries == null) {
			unknownEntries = new EObjectContainmentEList<SimpleManifestEntryManyValues>(
					SimpleManifestEntryManyValues.class, this,
					ManifestPackage.MANIFEST__UNKNOWN_ENTRIES);
		}
		return unknownEntries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isNativeCodeOptional() {
		return nativeCodeOptional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNativeCodeOptional(boolean newNativeCodeOptional) {
		boolean oldNativeCodeOptional = nativeCodeOptional;
		nativeCodeOptional = newNativeCodeOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__NATIVE_CODE_OPTIONAL,
					oldNativeCodeOptional, nativeCodeOptional));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BundleManifestVersion getBundleManifestVersion() {
		return bundleManifestVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBundleManifestVersion(
			BundleManifestVersion newBundleManifestVersion,
			NotificationChain msgs) {
		BundleManifestVersion oldBundleManifestVersion = bundleManifestVersion;
		bundleManifestVersion = newBundleManifestVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION,
					oldBundleManifestVersion, newBundleManifestVersion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBundleManifestVersion(
			BundleManifestVersion newBundleManifestVersion) {
		if (newBundleManifestVersion != bundleManifestVersion) {
			NotificationChain msgs = null;
			if (bundleManifestVersion != null)
				msgs = ((InternalEObject) bundleManifestVersion)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION,
								null, msgs);
			if (newBundleManifestVersion != null)
				msgs = ((InternalEObject) newBundleManifestVersion)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION,
								null, msgs);
			msgs = basicSetBundleManifestVersion(newBundleManifestVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION,
					newBundleManifestVersion, newBundleManifestVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS:
			return ((InternalEList<?>) getBundleClassPaths()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES:
			return ((InternalEList<?>) getBundleNativeCodes()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_VERSION:
			return basicSetBundleVersion(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS:
			return ((InternalEList<?>) getBundleRequiredExecutionEnvironments())
					.basicRemove(otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY:
			return basicSetBundleActivationPolicy(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR:
			return basicSetBundleActivator(null, msgs);
		case ManifestPackage.MANIFEST__REQUIRE_BUNDLES:
			return ((InternalEList<?>) getRequireBundles()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__IMPORT_SERVICES:
			return ((InternalEList<?>) getImportServices()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__EXPORT_SERVICES:
			return ((InternalEList<?>) getExportServices()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME:
			return basicSetBundleSymbolicName(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_VENDOR:
			return basicSetBundleVendor(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT:
			return basicSetBundleCopyright(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS:
			return basicSetBundleContactAddress(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION:
			return basicSetBundleDescription(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_NAME:
			return basicSetBundleName(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_CATEGORY:
			return basicSetBundleCategory(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION:
			return basicSetBundleUpdateLocation(null, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_DOC_URL:
			return basicSetBundleDocURL(null, msgs);
		case ManifestPackage.MANIFEST__IMPORT_PACKAGES:
			return ((InternalEList<?>) getImportPackages()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION:
			return basicSetBundleLocalization(null, msgs);
		case ManifestPackage.MANIFEST__FRAGMENT_HOST:
			return basicSetFragmentHost(null, msgs);
		case ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES:
			return ((InternalEList<?>) getDynamicImportPackages()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__EXPORT_PACKAGES:
			return ((InternalEList<?>) getExportPackages()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__UNKNOWN_ENTRIES:
			return ((InternalEList<?>) getUnknownEntries()).basicRemove(
					otherEnd, msgs);
		case ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION:
			return basicSetBundleManifestVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS:
			return getBundleClassPaths();
		case ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES:
			return getBundleNativeCodes();
		case ManifestPackage.MANIFEST__BUNDLE_VERSION:
			return getBundleVersion();
		case ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS:
			return getBundleRequiredExecutionEnvironments();
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY:
			return getBundleActivationPolicy();
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR:
			return getBundleActivator();
		case ManifestPackage.MANIFEST__REQUIRE_BUNDLES:
			return getRequireBundles();
		case ManifestPackage.MANIFEST__IMPORT_SERVICES:
			return getImportServices();
		case ManifestPackage.MANIFEST__EXPORT_SERVICES:
			return getExportServices();
		case ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME:
			return getBundleSymbolicName();
		case ManifestPackage.MANIFEST__BUNDLE_VENDOR:
			return getBundleVendor();
		case ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT:
			return getBundleCopyright();
		case ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS:
			return getBundleContactAddress();
		case ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION:
			return getBundleDescription();
		case ManifestPackage.MANIFEST__BUNDLE_NAME:
			return getBundleName();
		case ManifestPackage.MANIFEST__BUNDLE_CATEGORY:
			return getBundleCategory();
		case ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION:
			return getBundleUpdateLocation();
		case ManifestPackage.MANIFEST__BUNDLE_DOC_URL:
			return getBundleDocURL();
		case ManifestPackage.MANIFEST__IMPORT_PACKAGES:
			return getImportPackages();
		case ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION:
			return getBundleLocalization();
		case ManifestPackage.MANIFEST__FRAGMENT_HOST:
			return getFragmentHost();
		case ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES:
			return getDynamicImportPackages();
		case ManifestPackage.MANIFEST__EXPORT_PACKAGES:
			return getExportPackages();
		case ManifestPackage.MANIFEST__UNKNOWN_ENTRIES:
			return getUnknownEntries();
		case ManifestPackage.MANIFEST__NATIVE_CODE_OPTIONAL:
			return isNativeCodeOptional() ? Boolean.TRUE : Boolean.FALSE;
		case ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION:
			return getBundleManifestVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS:
			getBundleClassPaths().clear();
			getBundleClassPaths().addAll(
					(Collection<? extends BundleClassPath>) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES:
			getBundleNativeCodes().clear();
			getBundleNativeCodes().addAll(
					(Collection<? extends BundleNativeCode>) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_VERSION:
			setBundleVersion((BundleVersion) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS:
			getBundleRequiredExecutionEnvironments().clear();
			getBundleRequiredExecutionEnvironments()
					.addAll(
							(Collection<? extends BundleRequiredExecutionEnvironment>) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY:
			setBundleActivationPolicy((BundleActivationPolicy) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR:
			setBundleActivator((BundleActivator) newValue);
			return;
		case ManifestPackage.MANIFEST__REQUIRE_BUNDLES:
			getRequireBundles().clear();
			getRequireBundles().addAll(
					(Collection<? extends RequireBundle>) newValue);
			return;
		case ManifestPackage.MANIFEST__IMPORT_SERVICES:
			getImportServices().clear();
			getImportServices().addAll(
					(Collection<? extends ImportService>) newValue);
			return;
		case ManifestPackage.MANIFEST__EXPORT_SERVICES:
			getExportServices().clear();
			getExportServices().addAll(
					(Collection<? extends ExportService>) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME:
			setBundleSymbolicName((BundleSymbolicName) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_VENDOR:
			setBundleVendor((BundleVendor) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT:
			setBundleCopyright((BundleCopyright) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS:
			setBundleContactAddress((BundleContactAddress) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION:
			setBundleDescription((BundleDescription) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_NAME:
			setBundleName((BundleName) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_CATEGORY:
			setBundleCategory((BundleCategory) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION:
			setBundleUpdateLocation((BundleUpdateLocation) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_DOC_URL:
			setBundleDocURL((BundleDocURL) newValue);
			return;
		case ManifestPackage.MANIFEST__IMPORT_PACKAGES:
			getImportPackages().clear();
			getImportPackages().addAll(
					(Collection<? extends ImportPackage>) newValue);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION:
			setBundleLocalization((BundleLocalization) newValue);
			return;
		case ManifestPackage.MANIFEST__FRAGMENT_HOST:
			setFragmentHost((FragmentHost) newValue);
			return;
		case ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES:
			getDynamicImportPackages().clear();
			getDynamicImportPackages().addAll(
					(Collection<? extends DynamicImportPackage>) newValue);
			return;
		case ManifestPackage.MANIFEST__EXPORT_PACKAGES:
			getExportPackages().clear();
			getExportPackages().addAll(
					(Collection<? extends ExportPackage>) newValue);
			return;
		case ManifestPackage.MANIFEST__UNKNOWN_ENTRIES:
			getUnknownEntries().clear();
			getUnknownEntries()
					.addAll(
							(Collection<? extends SimpleManifestEntryManyValues>) newValue);
			return;
		case ManifestPackage.MANIFEST__NATIVE_CODE_OPTIONAL:
			setNativeCodeOptional(((Boolean) newValue).booleanValue());
			return;
		case ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION:
			setBundleManifestVersion((BundleManifestVersion) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS:
			getBundleClassPaths().clear();
			return;
		case ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES:
			getBundleNativeCodes().clear();
			return;
		case ManifestPackage.MANIFEST__BUNDLE_VERSION:
			setBundleVersion((BundleVersion) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS:
			getBundleRequiredExecutionEnvironments().clear();
			return;
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY:
			setBundleActivationPolicy((BundleActivationPolicy) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR:
			setBundleActivator((BundleActivator) null);
			return;
		case ManifestPackage.MANIFEST__REQUIRE_BUNDLES:
			getRequireBundles().clear();
			return;
		case ManifestPackage.MANIFEST__IMPORT_SERVICES:
			getImportServices().clear();
			return;
		case ManifestPackage.MANIFEST__EXPORT_SERVICES:
			getExportServices().clear();
			return;
		case ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME:
			setBundleSymbolicName((BundleSymbolicName) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_VENDOR:
			setBundleVendor((BundleVendor) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT:
			setBundleCopyright((BundleCopyright) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS:
			setBundleContactAddress((BundleContactAddress) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION:
			setBundleDescription((BundleDescription) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_NAME:
			setBundleName((BundleName) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_CATEGORY:
			setBundleCategory((BundleCategory) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION:
			setBundleUpdateLocation((BundleUpdateLocation) null);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_DOC_URL:
			setBundleDocURL((BundleDocURL) null);
			return;
		case ManifestPackage.MANIFEST__IMPORT_PACKAGES:
			getImportPackages().clear();
			return;
		case ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION:
			setBundleLocalization((BundleLocalization) null);
			return;
		case ManifestPackage.MANIFEST__FRAGMENT_HOST:
			setFragmentHost((FragmentHost) null);
			return;
		case ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES:
			getDynamicImportPackages().clear();
			return;
		case ManifestPackage.MANIFEST__EXPORT_PACKAGES:
			getExportPackages().clear();
			return;
		case ManifestPackage.MANIFEST__UNKNOWN_ENTRIES:
			getUnknownEntries().clear();
			return;
		case ManifestPackage.MANIFEST__NATIVE_CODE_OPTIONAL:
			setNativeCodeOptional(NATIVE_CODE_OPTIONAL_EDEFAULT);
			return;
		case ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION:
			setBundleManifestVersion((BundleManifestVersion) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ManifestPackage.MANIFEST__BUNDLE_CLASS_PATHS:
			return bundleClassPaths != null && !bundleClassPaths.isEmpty();
		case ManifestPackage.MANIFEST__BUNDLE_NATIVE_CODES:
			return bundleNativeCodes != null && !bundleNativeCodes.isEmpty();
		case ManifestPackage.MANIFEST__BUNDLE_VERSION:
			return bundleVersion != null;
		case ManifestPackage.MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS:
			return bundleRequiredExecutionEnvironments != null
					&& !bundleRequiredExecutionEnvironments.isEmpty();
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATION_POLICY:
			return bundleActivationPolicy != null;
		case ManifestPackage.MANIFEST__BUNDLE_ACTIVATOR:
			return bundleActivator != null;
		case ManifestPackage.MANIFEST__REQUIRE_BUNDLES:
			return requireBundles != null && !requireBundles.isEmpty();
		case ManifestPackage.MANIFEST__IMPORT_SERVICES:
			return importServices != null && !importServices.isEmpty();
		case ManifestPackage.MANIFEST__EXPORT_SERVICES:
			return exportServices != null && !exportServices.isEmpty();
		case ManifestPackage.MANIFEST__BUNDLE_SYMBOLIC_NAME:
			return bundleSymbolicName != null;
		case ManifestPackage.MANIFEST__BUNDLE_VENDOR:
			return bundleVendor != null;
		case ManifestPackage.MANIFEST__BUNDLE_COPYRIGHT:
			return bundleCopyright != null;
		case ManifestPackage.MANIFEST__BUNDLE_CONTACT_ADDRESS:
			return bundleContactAddress != null;
		case ManifestPackage.MANIFEST__BUNDLE_DESCRIPTION:
			return bundleDescription != null;
		case ManifestPackage.MANIFEST__BUNDLE_NAME:
			return bundleName != null;
		case ManifestPackage.MANIFEST__BUNDLE_CATEGORY:
			return bundleCategory != null;
		case ManifestPackage.MANIFEST__BUNDLE_UPDATE_LOCATION:
			return bundleUpdateLocation != null;
		case ManifestPackage.MANIFEST__BUNDLE_DOC_URL:
			return bundleDocURL != null;
		case ManifestPackage.MANIFEST__IMPORT_PACKAGES:
			return importPackages != null && !importPackages.isEmpty();
		case ManifestPackage.MANIFEST__BUNDLE_LOCALIZATION:
			return bundleLocalization != null;
		case ManifestPackage.MANIFEST__FRAGMENT_HOST:
			return fragmentHost != null;
		case ManifestPackage.MANIFEST__DYNAMIC_IMPORT_PACKAGES:
			return dynamicImportPackages != null
					&& !dynamicImportPackages.isEmpty();
		case ManifestPackage.MANIFEST__EXPORT_PACKAGES:
			return exportPackages != null && !exportPackages.isEmpty();
		case ManifestPackage.MANIFEST__UNKNOWN_ENTRIES:
			return unknownEntries != null && !unknownEntries.isEmpty();
		case ManifestPackage.MANIFEST__NATIVE_CODE_OPTIONAL:
			return nativeCodeOptional != NATIVE_CODE_OPTIONAL_EDEFAULT;
		case ManifestPackage.MANIFEST__BUNDLE_MANIFEST_VERSION:
			return bundleManifestVersion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		// A améliorer
		String returnString = "";
		if (getBundleManifestVersion() != null) {
			returnString += "Bundle-ManifestVersion"
					+ ": "
					+ getBundleManifestVersion().getManifestVersion()
							.getLiteral() + "\n";
		}
		if (getBundleName() != null) {
			returnString += getBundleName().getEntryName() + ": "
					+ getBundleName().getValue() + "\n";
			for (Iterator<AttributEntry> optionsIterator = getBundleSymbolicName()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleSymbolicName() != null) {
			returnString += getBundleSymbolicName().getEntryName() + ": "
					+ getBundleSymbolicName().getSymbolicName() + "\n";
			for (Iterator<SymbolicNameDirective> directivesIterator = getBundleSymbolicName()
					.getDirectives().iterator(); directivesIterator.hasNext();) {
				SymbolicNameDirective directive = directivesIterator.next();
				if (directive instanceof Singleton) {
					returnString += "\t" + directive.getToken() + " = "
							+ ((Singleton) directive).isSingleton() + "\n";
				} else if (directive instanceof FragmentAttachment) {
					returnString += "\t"
							+ directive.getToken()
							+ " = "
							+ ((FragmentAttachment) directive)
									.getFragmentAttachment().getLiteral()
							+ "\n";
				}
			}
			for (Iterator<AttributEntry> optionsIterator = getBundleSymbolicName()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleVersion() != null) {
			returnString += getBundleVersion().getEntryName() + ": ";
			returnString += getBundleVersion().getVersion().getMajor();
			returnString += "." + getBundleVersion().getVersion().getMinor();
			returnString += "." + getBundleVersion().getVersion().getMicro();
			if (getBundleVersion().getVersion().getQualifier() != null
					&& !getBundleVersion().getVersion().getQualifier().equals(
							"")) {
				returnString += "."
						+ getBundleVersion().getVersion().getQualifier();
			}
			returnString += "\n";
		}
		for (Iterator<BundleRequiredExecutionEnvironment> requiredExecutionIterator = getBundleRequiredExecutionEnvironments()
				.iterator(); requiredExecutionIterator.hasNext();) {
			BundleRequiredExecutionEnvironment requiredExecution = requiredExecutionIterator
					.next();
			returnString += requiredExecution.getEntryName() + ": ";
			if (requiredExecution.getConfiguration() != null) {
				returnString += requiredExecution.getConfiguration() + "/";
			}
			returnString += requiredExecution.getProfile() + "\n";
			for (Iterator<AttributEntry> optionsIterator = requiredExecution
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleActivator() != null) {
			returnString += getBundleActivator().getEntryName() + ": "
					+ getBundleActivator().getActivator().getFullPath() + "\n";
			for (Iterator<AttributEntry> optionsIterator = getBundleActivator()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		for (Iterator<BundleClassPath> classpathIterator = getBundleClassPaths()
				.iterator(); classpathIterator.hasNext();) {
			BundleClassPath classPath = classpathIterator.next();
			returnString += classPath.getEntryName() + ": \n";
			for (Iterator<SystemEntry> entriesIterator = classPath.getEntries()
					.iterator(); entriesIterator.hasNext();) {
				SystemEntry entry = entriesIterator.next();
				returnString += "\t" + entry.getFullPath() + "\n";
			}
			for (Iterator<AttributEntry> optionsIterator = classPath
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		for (Iterator<BundleNativeCode> nativeCodeIterator = getBundleNativeCodes()
				.iterator(); nativeCodeIterator.hasNext();) {
			BundleNativeCode nativeCode = nativeCodeIterator.next();
			returnString += nativeCode.getEntryName() + ": \n";
			for (Iterator<File> entriesIterator = nativeCode.getFile()
					.iterator(); entriesIterator.hasNext();) {
				File file = entriesIterator.next();
				returnString += "\t" + file.getFullPath() + "\n";
			}
			for (Iterator<AttributEntry> optionsIterator = nativeCode
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleDocURL() != null) {
			returnString += getBundleDocURL().getEntryName() + ": "
					+ getBundleDocURL().getUrl().toString() + "\n";
		}

		if (getBundleDescription() != null) {
			returnString += getBundleDescription().getEntryName() + ": "
					+ getBundleDescription().getValue() + "\n";
		}
		if (getBundleVendor() != null) {
			returnString += getBundleVendor().getEntryName() + ": "
					+ getBundleVendor().getValue() + "\n";
			for (Iterator<AttributEntry> optionsIterator = getBundleSymbolicName()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleCopyright() != null) {
			returnString += getBundleCopyright().getEntryName() + ": "
					+ getBundleCopyright().getValue() + "\n";
		}
		if (getBundleLocalization() != null) {
			returnString += getBundleLocalization().getEntryName() + ": "
					+ getBundleLocalization().getValue() + "\n";
			for (Iterator<AttributEntry> optionsIterator = getBundleSymbolicName()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		if (getBundleActivationPolicy() != null) {
			returnString += getBundleActivationPolicy().getEntryName() + ": "
					+ getBundleActivationPolicy().getPolicy().getLiteral()
					+ "\n";
			for (Iterator<AttributEntry> optionsIterator = getBundleSymbolicName()
					.getOptions().iterator(); optionsIterator.hasNext();) {
				AttributEntry entry = optionsIterator.next();
				returnString += "\t" + entry.getToken() + " = "
						+ entry.getValue() + "\n";
			}
		}
		returnString += "Export-Service: \n";
		for (Iterator<ExportService> unknownEntriesIterator = getExportServices()
				.iterator(); unknownEntriesIterator.hasNext();) {
			ExportService entry = unknownEntriesIterator.next();
			returnString += "\t"
					+ entry.getService().getInterface().getFullPath() + "\n";
			for (Iterator<AttributEntry> optionsIterator = entry.getOptions()
					.iterator(); optionsIterator.hasNext();) {
				AttributEntry attribute = optionsIterator.next();
				returnString += "\t\t" + attribute.getToken() + " = "
						+ attribute.getValue() + "\n";
			}
		}
		returnString += "Export-Package: \n";
		for (Iterator<ExportPackage> unknownEntriesIterator = getExportPackages()
				.iterator(); unknownEntriesIterator.hasNext();) {
			ExportPackage entry = unknownEntriesIterator.next();
			for (Package p : entry.getPackages()) {
				returnString += "\t" + p.getFullPath() + "\n";
			}
			for (Iterator<AttributEntry> optionsIterator = entry.getOptions()
					.iterator(); optionsIterator.hasNext();) {
				AttributEntry attribute = optionsIterator.next();
				returnString += "\t\t" + attribute.getToken() + " = "
						+ attribute.getValue() + "\n";
			}
			for (Iterator<ExportPackageDirective> optionsIterator = entry
					.getDirectives().iterator(); optionsIterator.hasNext();) {
				ExportPackageDirective directive = optionsIterator.next();
				returnString += "\t\t" + directive.toString() + "\n";
			}
		}
		for (Iterator<DynamicImportPackage> unknownEntriesIterator = getDynamicImportPackages()
				.iterator(); unknownEntriesIterator.hasNext();) {
			DynamicImportPackage entry = unknownEntriesIterator.next();
			returnString += "\t" + entry.getEntryName() + ": \n";
			for (String e : entry.getPackages()) {
				returnString += "\t" + e + "\n";
			}
		}
		returnString += "unknown entries :\n";
		for (Iterator<SimpleManifestEntryManyValues> unknownEntriesIterator = getUnknownEntries()
				.iterator(); unknownEntriesIterator.hasNext();) {
			SimpleManifestEntryManyValues entry = unknownEntriesIterator.next();
			returnString += "\t" + entry.getEntryName() + ": ";
			for (String value : entry.getValues()) {
				returnString += "\t\t" + value;
			}
			returnString += "\n";
		}

		return returnString;
	}

	public void addUnknownEntry(SimpleManifestEntryManyValues entry) {
		getUnknownEntries().add(entry);
	}

	public void addBundleClassPath(BundleClassPath entry) {
		getBundleClassPaths().add(entry);
	}

	public void addBundleRequiredExecutionEnvironment(
			BundleRequiredExecutionEnvironment entry) {
		getBundleRequiredExecutionEnvironments().add(entry);

	}

	public void addDynamicImportPackage(DynamicImportPackage entry) {
		getDynamicImportPackages().add(entry);

	}

	public void addExportPackage(ExportPackage entry) {
		getExportPackages().add(entry);

	}

	public void addExportService(ExportService entry) {
		getExportServices().add(entry);

	}

	public void addImportService(ImportService entry) {
		getImportServices().add(entry);

	}

	public void addImportPackage(ImportPackage entry) {
		getImportPackages().add(entry);

	}

	public void addRequireBundle(RequireBundle entry) {
		getRequireBundles().add(entry);

	}

	public void addBundleNativeCode(BundleNativeCode entry) {
		getBundleNativeCodes().add(entry);

	}

	public void removeUnknownEntry(SimpleManifestEntryManyValues entry) {
		getUnknownEntries().remove(entry);
	}

	public void removeBundleClassPath(BundleClassPath entry) {
		getBundleClassPaths().remove(entry);
	}

	public void removeBundleRequiredExecutionEnvironment(
			BundleRequiredExecutionEnvironment entry) {
		getBundleRequiredExecutionEnvironments().remove(entry);

	}

	public void removeDynamicImportPackage(DynamicImportPackage entry) {
		getDynamicImportPackages().remove(entry);

	}

	public void removeExportPackage(ExportPackage entry) {
		getExportPackages().remove(entry);

	}

	public void removeExportService(ExportService entry) {
		getExportServices().remove(entry);

	}

	public void removeImportService(ImportService entry) {
		getImportServices().remove(entry);

	}

	public void removeImportPackage(ImportPackage entry) {
		getImportPackages().remove(entry);

	}

	public void removeRequireBundle(RequireBundle entry) {
		getRequireBundles().remove(entry);

	}

	public void removeBundleNativeCode(BundleNativeCode entry) {
		getBundleNativeCodes().remove(entry);

	}

} // MANIFESTImpl
