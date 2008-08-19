/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestSwitch.java,v 1.4 2008-08-19 07:04:44 edaubert Exp $
 */
package manifest.util;

import java.util.List;

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
import manifest.ClassPath;
import manifest.DynamicImportPackage;
import manifest.ExportPackage;
import manifest.ExportService;
import manifest.FragmentHost;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.MANIFESTEntry;
import manifest.ManifestPackage;
import manifest.NativeCode;
import manifest.RequireBundle;
import manifest.Service;
import manifest.SimpleMANIFESTEntry;
import manifest.SimpleManifestEntryManyValues;
import manifest.URLMANIFESTEntry;
import manifest.Version;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see manifest.ManifestPackage
 * @generated
 */
public class ManifestSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManifestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ManifestSwitch() {
		if (modelPackage == null) {
			modelPackage = ManifestPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ManifestPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.MANIFEST: {
				MANIFEST manifest = (MANIFEST)theEObject;
				T result = caseMANIFEST(manifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.MANIFEST_ENTRY: {
				MANIFESTEntry manifestEntry = (MANIFESTEntry)theEObject;
				T result = caseMANIFESTEntry(manifestEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.SIMPLE_MANIFEST_ENTRY: {
				SimpleMANIFESTEntry simpleMANIFESTEntry = (SimpleMANIFESTEntry)theEObject;
				T result = caseSimpleMANIFESTEntry(simpleMANIFESTEntry);
				if (result == null) result = caseMANIFESTEntry(simpleMANIFESTEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_NAME: {
				BundleName bundleName = (BundleName)theEObject;
				T result = caseBundleName(bundleName);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleName);
				if (result == null) result = caseMANIFESTEntry(bundleName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME: {
				BundleSymbolicName bundleSymbolicName = (BundleSymbolicName)theEObject;
				T result = caseBundleSymbolicName(bundleSymbolicName);
				if (result == null) result = caseMANIFESTEntry(bundleSymbolicName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_DESCRIPTION: {
				BundleDescription bundleDescription = (BundleDescription)theEObject;
				T result = caseBundleDescription(bundleDescription);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleDescription);
				if (result == null) result = caseMANIFESTEntry(bundleDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_LOCALIZATION: {
				BundleLocalization bundleLocalization = (BundleLocalization)theEObject;
				T result = caseBundleLocalization(bundleLocalization);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleLocalization);
				if (result == null) result = caseMANIFESTEntry(bundleLocalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_VENDOR: {
				BundleVendor bundleVendor = (BundleVendor)theEObject;
				T result = caseBundleVendor(bundleVendor);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleVendor);
				if (result == null) result = caseMANIFESTEntry(bundleVendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_CONTACT_ADDRESS: {
				BundleContactAddress bundleContactAddress = (BundleContactAddress)theEObject;
				T result = caseBundleContactAddress(bundleContactAddress);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleContactAddress);
				if (result == null) result = caseMANIFESTEntry(bundleContactAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_COPYRIGHT: {
				BundleCopyright bundleCopyright = (BundleCopyright)theEObject;
				T result = caseBundleCopyright(bundleCopyright);
				if (result == null) result = caseSimpleMANIFESTEntry(bundleCopyright);
				if (result == null) result = caseMANIFESTEntry(bundleCopyright);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_CATEGORY: {
				BundleCategory bundleCategory = (BundleCategory)theEObject;
				T result = caseBundleCategory(bundleCategory);
				if (result == null) result = caseSimpleManifestEntryManyValues(bundleCategory);
				if (result == null) result = caseMANIFESTEntry(bundleCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.URLMANIFEST_ENTRY: {
				URLMANIFESTEntry urlmanifestEntry = (URLMANIFESTEntry)theEObject;
				T result = caseURLMANIFESTEntry(urlmanifestEntry);
				if (result == null) result = caseMANIFESTEntry(urlmanifestEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_DOC_URL: {
				BundleDocURL bundleDocURL = (BundleDocURL)theEObject;
				T result = caseBundleDocURL(bundleDocURL);
				if (result == null) result = caseURLMANIFESTEntry(bundleDocURL);
				if (result == null) result = caseMANIFESTEntry(bundleDocURL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_UPDATE_LOCATION: {
				BundleUpdateLocation bundleUpdateLocation = (BundleUpdateLocation)theEObject;
				T result = caseBundleUpdateLocation(bundleUpdateLocation);
				if (result == null) result = caseURLMANIFESTEntry(bundleUpdateLocation);
				if (result == null) result = caseMANIFESTEntry(bundleUpdateLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_VERSION: {
				BundleVersion bundleVersion = (BundleVersion)theEObject;
				T result = caseBundleVersion(bundleVersion);
				if (result == null) result = caseMANIFESTEntry(bundleVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_ACTIVATOR: {
				BundleActivator bundleActivator = (BundleActivator)theEObject;
				T result = caseBundleActivator(bundleActivator);
				if (result == null) result = caseMANIFESTEntry(bundleActivator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_CLASS_PATH: {
				BundleClassPath bundleClassPath = (BundleClassPath)theEObject;
				T result = caseBundleClassPath(bundleClassPath);
				if (result == null) result = caseMANIFESTEntry(bundleClassPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_NATIVE_CODE: {
				BundleNativeCode bundleNativeCode = (BundleNativeCode)theEObject;
				T result = caseBundleNativeCode(bundleNativeCode);
				if (result == null) result = caseMANIFESTEntry(bundleNativeCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.REQUIRE_BUNDLE: {
				RequireBundle requireBundle = (RequireBundle)theEObject;
				T result = caseRequireBundle(requireBundle);
				if (result == null) result = caseMANIFESTEntry(requireBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.IMPORT_SERVICE: {
				ImportService importService = (ImportService)theEObject;
				T result = caseImportService(importService);
				if (result == null) result = caseMANIFESTEntry(importService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.EXPORT_SERVICE: {
				ExportService exportService = (ExportService)theEObject;
				T result = caseExportService(exportService);
				if (result == null) result = caseMANIFESTEntry(exportService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.IMPORT_PACKAGE: {
				ImportPackage importPackage = (ImportPackage)theEObject;
				T result = caseImportPackage(importPackage);
				if (result == null) result = caseMANIFESTEntry(importPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.EXPORT_PACKAGE: {
				ExportPackage exportPackage = (ExportPackage)theEObject;
				T result = caseExportPackage(exportPackage);
				if (result == null) result = caseMANIFESTEntry(exportPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY: {
				BundleActivationPolicy bundleActivationPolicy = (BundleActivationPolicy)theEObject;
				T result = caseBundleActivationPolicy(bundleActivationPolicy);
				if (result == null) result = caseMANIFESTEntry(bundleActivationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.FRAGMENT_HOST: {
				FragmentHost fragmentHost = (FragmentHost)theEObject;
				T result = caseFragmentHost(fragmentHost);
				if (result == null) result = caseMANIFESTEntry(fragmentHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE: {
				DynamicImportPackage dynamicImportPackage = (DynamicImportPackage)theEObject;
				T result = caseDynamicImportPackage(dynamicImportPackage);
				if (result == null) result = caseMANIFESTEntry(dynamicImportPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT: {
				BundleRequiredExecutionEnvironment bundleRequiredExecutionEnvironment = (BundleRequiredExecutionEnvironment)theEObject;
				T result = caseBundleRequiredExecutionEnvironment(bundleRequiredExecutionEnvironment);
				if (result == null) result = caseMANIFESTEntry(bundleRequiredExecutionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES: {
				SimpleManifestEntryManyValues simpleManifestEntryManyValues = (SimpleManifestEntryManyValues)theEObject;
				T result = caseSimpleManifestEntryManyValues(simpleManifestEntryManyValues);
				if (result == null) result = caseMANIFESTEntry(simpleManifestEntryManyValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.BUNDLE_MANIFEST_VERSION: {
				BundleManifestVersion bundleManifestVersion = (BundleManifestVersion)theEObject;
				T result = caseBundleManifestVersion(bundleManifestVersion);
				if (result == null) result = caseMANIFESTEntry(bundleManifestVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.CLASS_PATH: {
				ClassPath classPath = (ClassPath)theEObject;
				T result = caseClassPath(classPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.NATIVE_CODE: {
				NativeCode nativeCode = (NativeCode)theEObject;
				T result = caseNativeCode(nativeCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManifestPackage.PACKAGE: {
				manifest.Package package_ = (manifest.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MANIFEST</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MANIFEST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMANIFEST(MANIFEST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MANIFEST Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MANIFEST Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMANIFESTEntry(MANIFESTEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple MANIFEST Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple MANIFEST Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMANIFESTEntry(SimpleMANIFESTEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Name</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleName(BundleName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Symbolic Name</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Symbolic Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleSymbolicName(BundleSymbolicName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Description</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleDescription(BundleDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Localization</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Localization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleLocalization(BundleLocalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Vendor</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleVendor(BundleVendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Contact Address</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Contact Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleContactAddress(BundleContactAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Copyright</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Copyright</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleCopyright(BundleCopyright object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Category</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleCategory(BundleCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URLMANIFEST Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URLMANIFEST Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLMANIFESTEntry(URLMANIFESTEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Doc URL</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Doc URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleDocURL(BundleDocURL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Update Location</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Update Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleUpdateLocation(BundleUpdateLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Version</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleVersion(BundleVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Activator</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Activator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleActivator(BundleActivator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Class Path</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Class Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleClassPath(BundleClassPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Native Code</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Native Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleNativeCode(BundleNativeCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Bundle</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireBundle(RequireBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Service</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportService(ImportService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Service</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportService(ExportService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Package</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportPackage(ImportPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Package</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportPackage(ExportPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Activation Policy</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Activation Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleActivationPolicy(BundleActivationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentHost(FragmentHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Import Package</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Import Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicImportPackage(DynamicImportPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Required Execution Environment</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Required Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleRequiredExecutionEnvironment(
			BundleRequiredExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Manifest Entry Many Values</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Manifest Entry Many Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleManifestEntryManyValues(
			SimpleManifestEntryManyValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Manifest Version</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Manifest Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleManifestVersion(BundleManifestVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Path</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassPath(ClassPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Code</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeCode(NativeCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(manifest.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // ManifestSwitch
