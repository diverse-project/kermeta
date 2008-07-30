/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleRequiredExecutionEnvironmentImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package manifest.impl;

import manifest.BundleRequiredExecutionEnvironment;
import manifest.ManifestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bundle Required Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link manifest.impl.BundleRequiredExecutionEnvironmentImpl#getProfile <em>Profile</em>}</li>
 * <li>{@link manifest.impl.BundleRequiredExecutionEnvironmentImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleRequiredExecutionEnvironmentImpl extends MANIFESTEntryImpl
		implements BundleRequiredExecutionEnvironment {
	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected BundleRequiredExecutionEnvironmentImpl() {
		super();
		this.setEntryName(Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE,
					oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION,
					oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE:
			return getProfile();
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION:
			return getConfiguration();
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
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE:
			setProfile((String) newValue);
			return;
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION:
			setConfiguration((String) newValue);
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
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE:
			setProfile(PROFILE_EDEFAULT);
			return;
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION:
			setConfiguration(CONFIGURATION_EDEFAULT);
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
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE:
			return PROFILE_EDEFAULT == null ? profile != null
					: !PROFILE_EDEFAULT.equals(profile);
		case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION:
			return CONFIGURATION_EDEFAULT == null ? configuration != null
					: !CONFIGURATION_EDEFAULT.equals(configuration);
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
		result.append(" (profile: ");
		result.append(profile);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(')');
		return result.toString();
	}

} // BundleRequiredExecutionEnvironmentImpl
