/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestAdapterFactory.java,v 1.2 2008-07-31 12:23:18 edaubert Exp $
 */
package manifest.util;

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
import manifest.MANIFESTEntry;
import manifest.ManifestPackage;
import manifest.RequireBundle;
import manifest.Service;
import manifest.SimpleMANIFESTEntry;
import manifest.SimpleManifestEntryManyValues;
import manifest.URLMANIFESTEntry;
import manifest.Version;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It
 * provides an adapter <code>createXXX</code> method for each class of the
 * model. <!-- end-user-doc -->
 * 
 * @see manifest.ManifestPackage
 * @generated
 */
public class ManifestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ManifestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ManifestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ManifestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code>
	 * if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ManifestSwitch<Adapter> modelSwitch = new ManifestSwitch<Adapter>() {
		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseVersion(Version object) {
			return createVersionAdapter();
		}

		@Override
		public Adapter caseMANIFEST(MANIFEST object) {
			return createMANIFESTAdapter();
		}

		@Override
		public Adapter caseMANIFESTEntry(MANIFESTEntry object) {
			return createMANIFESTEntryAdapter();
		}

		@Override
		public Adapter caseSimpleMANIFESTEntry(SimpleMANIFESTEntry object) {
			return createSimpleMANIFESTEntryAdapter();
		}

		@Override
		public Adapter caseBundleName(BundleName object) {
			return createBundleNameAdapter();
		}

		@Override
		public Adapter caseBundleSymbolicName(BundleSymbolicName object) {
			return createBundleSymbolicNameAdapter();
		}

		@Override
		public Adapter caseBundleDescription(BundleDescription object) {
			return createBundleDescriptionAdapter();
		}

		@Override
		public Adapter caseBundleLocalization(BundleLocalization object) {
			return createBundleLocalizationAdapter();
		}

		@Override
		public Adapter caseBundleVendor(BundleVendor object) {
			return createBundleVendorAdapter();
		}

		@Override
		public Adapter caseBundleContactAddress(BundleContactAddress object) {
			return createBundleContactAddressAdapter();
		}

		@Override
		public Adapter caseBundleCopyright(BundleCopyright object) {
			return createBundleCopyrightAdapter();
		}

		@Override
		public Adapter caseBundleCategory(BundleCategory object) {
			return createBundleCategoryAdapter();
		}

		@Override
		public Adapter caseURLMANIFESTEntry(URLMANIFESTEntry object) {
			return createURLMANIFESTEntryAdapter();
		}

		@Override
		public Adapter caseBundleDocURL(BundleDocURL object) {
			return createBundleDocURLAdapter();
		}

		@Override
		public Adapter caseBundleUpdateLocation(BundleUpdateLocation object) {
			return createBundleUpdateLocationAdapter();
		}

		@Override
		public Adapter caseBundleVersion(BundleVersion object) {
			return createBundleVersionAdapter();
		}

		@Override
		public Adapter caseBundleActivator(BundleActivator object) {
			return createBundleActivatorAdapter();
		}

		@Override
		public Adapter caseBundleClassPath(BundleClassPath object) {
			return createBundleClassPathAdapter();
		}

		@Override
		public Adapter caseBundleNativeCode(BundleNativeCode object) {
			return createBundleNativeCodeAdapter();
		}

		@Override
		public Adapter caseRequireBundle(RequireBundle object) {
			return createRequireBundleAdapter();
		}

		@Override
		public Adapter caseImportService(ImportService object) {
			return createImportServiceAdapter();
		}

		@Override
		public Adapter caseExportService(ExportService object) {
			return createExportServiceAdapter();
		}

		@Override
		public Adapter caseImportPackage(ImportPackage object) {
			return createImportPackageAdapter();
		}

		@Override
		public Adapter caseExportPackage(ExportPackage object) {
			return createExportPackageAdapter();
		}

		@Override
		public Adapter caseBundleActivationPolicy(BundleActivationPolicy object) {
			return createBundleActivationPolicyAdapter();
		}

		@Override
		public Adapter caseFragmentHost(FragmentHost object) {
			return createFragmentHostAdapter();
		}

		@Override
		public Adapter caseDynamicImportPackage(DynamicImportPackage object) {
			return createDynamicImportPackageAdapter();
		}

		@Override
		public Adapter caseBundleRequiredExecutionEnvironment(
				BundleRequiredExecutionEnvironment object) {
			return createBundleRequiredExecutionEnvironmentAdapter();
		}

		@Override
		public Adapter caseSimpleManifestEntryManyValues(
				SimpleManifestEntryManyValues object) {
			return createSimpleManifestEntryManyValuesAdapter();
		}

		@Override
		public Adapter caseBundleManifestVersion(BundleManifestVersion object) {
			return createBundleManifestVersionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.Service <em>Service</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.Version <em>Version</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.MANIFEST <em>MANIFEST</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.MANIFEST
	 * @generated
	 */
	public Adapter createMANIFESTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.MANIFESTEntry <em>MANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.MANIFESTEntry
	 * @generated
	 */
	public Adapter createMANIFESTEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.SimpleMANIFESTEntry <em>Simple MANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.SimpleMANIFESTEntry
	 * @generated
	 */
	public Adapter createSimpleMANIFESTEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleName
	 * @generated
	 */
	public Adapter createBundleNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleSymbolicName <em>Bundle Symbolic Name</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleSymbolicName
	 * @generated
	 */
	public Adapter createBundleSymbolicNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleDescription <em>Bundle Description</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleDescription
	 * @generated
	 */
	public Adapter createBundleDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleLocalization <em>Bundle Localization</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleLocalization
	 * @generated
	 */
	public Adapter createBundleLocalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleVendor <em>Bundle Vendor</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleVendor
	 * @generated
	 */
	public Adapter createBundleVendorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleContactAddress <em>Bundle Contact Address</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleContactAddress
	 * @generated
	 */
	public Adapter createBundleContactAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleCopyright <em>Bundle Copyright</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleCopyright
	 * @generated
	 */
	public Adapter createBundleCopyrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleCategory
	 * @generated
	 */
	public Adapter createBundleCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.URLMANIFESTEntry <em>URLMANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.URLMANIFESTEntry
	 * @generated
	 */
	public Adapter createURLMANIFESTEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleDocURL <em>Bundle Doc URL</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleDocURL
	 * @generated
	 */
	public Adapter createBundleDocURLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleUpdateLocation <em>Bundle Update Location</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleUpdateLocation
	 * @generated
	 */
	public Adapter createBundleUpdateLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleVersion <em>Bundle Version</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleVersion
	 * @generated
	 */
	public Adapter createBundleVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleActivator <em>Bundle Activator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleActivator
	 * @generated
	 */
	public Adapter createBundleActivatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleClassPath <em>Bundle Class Path</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleClassPath
	 * @generated
	 */
	public Adapter createBundleClassPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleNativeCode <em>Bundle Native Code</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleNativeCode
	 * @generated
	 */
	public Adapter createBundleNativeCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.RequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.RequireBundle
	 * @generated
	 */
	public Adapter createRequireBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.ImportService <em>Import Service</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.ImportService
	 * @generated
	 */
	public Adapter createImportServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.ExportService <em>Export Service</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.ExportService
	 * @generated
	 */
	public Adapter createExportServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.ImportPackage <em>Import Package</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.ImportPackage
	 * @generated
	 */
	public Adapter createImportPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.ExportPackage <em>Export Package</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.ExportPackage
	 * @generated
	 */
	public Adapter createExportPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleActivationPolicy <em>Bundle Activation Policy</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleActivationPolicy
	 * @generated
	 */
	public Adapter createBundleActivationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.FragmentHost <em>Fragment Host</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.FragmentHost
	 * @generated
	 */
	public Adapter createFragmentHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.DynamicImportPackage <em>Dynamic Import Package</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.DynamicImportPackage
	 * @generated
	 */
	public Adapter createDynamicImportPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleRequiredExecutionEnvironment <em>Bundle Required Execution Environment</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleRequiredExecutionEnvironment
	 * @generated
	 */
	public Adapter createBundleRequiredExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.SimpleManifestEntryManyValues <em>Simple Manifest Entry Many Values</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.SimpleManifestEntryManyValues
	 * @generated
	 */
	public Adapter createSimpleManifestEntryManyValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manifest.BundleManifestVersion <em>Bundle Manifest Version</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see manifest.BundleManifestVersion
	 * @generated
	 */
	public Adapter createBundleManifestVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ManifestAdapterFactory
