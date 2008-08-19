/**
 * <copyright>
 * </copyright>
 *
 * $Id: SystemEntryImpl.java,v 1.4 2008-08-19 07:04:46 edaubert Exp $
 */
package jar.impl;

import jar.JarPackage;
import jar.SystemEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jar.impl.SystemEntryImpl#isBundleClassPath <em>Bundle Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemEntryImpl extends BundleEntryImpl implements
		SystemEntry {
	/**
	 * The default value of the '{@link #isBundleClassPath() <em>Bundle Class Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isBundleClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUNDLE_CLASS_PATH_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBundleClassPath() <em>Bundle Class Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isBundleClassPath()
	 * @generated
	 * @ordered
	 */
	protected boolean bundleClassPath = BUNDLE_CLASS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JarPackage.Literals.SYSTEM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBundleClassPath() {
		return bundleClassPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleClassPath(boolean newBundleClassPath) {
		boolean oldBundleClassPath = bundleClassPath;
		bundleClassPath = newBundleClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JarPackage.SYSTEM_ENTRY__BUNDLE_CLASS_PATH, oldBundleClassPath, bundleClassPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JarPackage.SYSTEM_ENTRY__BUNDLE_CLASS_PATH:
				return isBundleClassPath() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JarPackage.SYSTEM_ENTRY__BUNDLE_CLASS_PATH:
				setBundleClassPath(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JarPackage.SYSTEM_ENTRY__BUNDLE_CLASS_PATH:
				setBundleClassPath(BUNDLE_CLASS_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JarPackage.SYSTEM_ENTRY__BUNDLE_CLASS_PATH:
				return bundleClassPath != BUNDLE_CLASS_PATH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bundleClassPath: ");
		result.append(bundleClassPath);
		result.append(')');
		return result.toString();
	}

} // SystemEntryImpl
