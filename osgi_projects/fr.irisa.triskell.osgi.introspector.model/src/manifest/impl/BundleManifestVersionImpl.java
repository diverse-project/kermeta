/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleManifestVersionImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleManifestVersion;
import manifest.MANIFESTVersionEnum;
import manifest.ManifestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Manifest Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.BundleManifestVersionImpl#getManifestVersion <em>Manifest Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleManifestVersionImpl extends MANIFESTEntryImpl implements
		BundleManifestVersion {
	/**
	 * The default value of the '{@link #getManifestVersion() <em>Manifest Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getManifestVersion()
	 * @generated
	 * @ordered
	 */
	protected static final MANIFESTVersionEnum MANIFEST_VERSION_EDEFAULT = MANIFESTVersionEnum.MORE_THAN1_3;

	/**
	 * The cached value of the '{@link #getManifestVersion() <em>Manifest Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getManifestVersion()
	 * @generated
	 * @ordered
	 */
	protected MANIFESTVersionEnum manifestVersion = MANIFEST_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleManifestVersionImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_MANIFESTVERSION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_MANIFEST_VERSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MANIFESTVersionEnum getManifestVersion() {
		return manifestVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setManifestVersion(MANIFESTVersionEnum newManifestVersion) {
		MANIFESTVersionEnum oldManifestVersion = manifestVersion;
		manifestVersion = newManifestVersion == null ? MANIFEST_VERSION_EDEFAULT
				: newManifestVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ManifestPackage.BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION,
					oldManifestVersion, manifestVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION:
			return getManifestVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION:
			setManifestVersion((MANIFESTVersionEnum) newValue);
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
		case ManifestPackage.BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION:
			setManifestVersion(MANIFEST_VERSION_EDEFAULT);
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
		case ManifestPackage.BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION:
			return manifestVersion != MANIFEST_VERSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (manifestVersion: ");
		result.append(manifestVersion);
		result.append(')');
		return result.toString();
	}

} // BundleManifestVersionImpl
