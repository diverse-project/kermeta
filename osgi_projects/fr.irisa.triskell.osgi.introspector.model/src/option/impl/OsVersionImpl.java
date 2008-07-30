/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsVersionImpl.java,v 1.1 2008-07-30 14:08:01 edaubert Exp $
 */
package option.impl;

import manifest.Version;
import option.OptionPackage;
import option.OsVersion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Os Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link option.impl.OsVersionImpl#getMinVersion <em>Min Version</em>}</li>
 * <li>{@link option.impl.OsVersionImpl#getMaxVersion <em>Max Version</em>}</li>
 * <li>{@link option.impl.OsVersionImpl#isMinNotInclude <em>Min Not Include</em>}</li>
 * <li>{@link option.impl.OsVersionImpl#isMaxNotInclude <em>Max Not Include</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OsVersionImpl extends NativeCodeDirectiveImpl implements OsVersion {
	/**
	 * The cached value of the '{@link #getMinVersion() <em>Min Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinVersion()
	 * @generated
	 * @ordered
	 */
	protected Version minVersion;

	/**
	 * The cached value of the '{@link #getMaxVersion() <em>Max Version</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxVersion()
	 * @generated
	 * @ordered
	 */
	protected Version maxVersion;

	/**
	 * The default value of the '{@link #isMinNotInclude() <em>Min Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMinNotInclude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_NOT_INCLUDE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMinNotInclude() <em>Min Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMinNotInclude()
	 * @generated
	 * @ordered
	 */
	protected boolean minNotInclude = MIN_NOT_INCLUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxNotInclude() <em>Max Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMaxNotInclude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_NOT_INCLUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxNotInclude() <em>Max Not Include</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isMaxNotInclude()
	 * @generated
	 * @ordered
	 */
	protected boolean maxNotInclude = MAX_NOT_INCLUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected OsVersionImpl() {
		super();
		this.setToken(Constants.BUNDLE_NATIVECODE_OSVERSION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.OS_VERSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Version getMinVersion() {
		return minVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMinVersion(Version newMinVersion,
			NotificationChain msgs) {
		Version oldMinVersion = minVersion;
		minVersion = newMinVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, OptionPackage.OS_VERSION__MIN_VERSION,
					oldMinVersion, newMinVersion);
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
	public void setMinVersion(Version newMinVersion) {
		if (newMinVersion != minVersion) {
			NotificationChain msgs = null;
			if (minVersion != null)
				msgs = ((InternalEObject) minVersion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- OptionPackage.OS_VERSION__MIN_VERSION, null,
						msgs);
			if (newMinVersion != null)
				msgs = ((InternalEObject) newMinVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- OptionPackage.OS_VERSION__MIN_VERSION, null,
						msgs);
			msgs = basicSetMinVersion(newMinVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.OS_VERSION__MIN_VERSION, newMinVersion,
					newMinVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Version getMaxVersion() {
		return maxVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMaxVersion(Version newMaxVersion,
			NotificationChain msgs) {
		Version oldMaxVersion = maxVersion;
		maxVersion = newMaxVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, OptionPackage.OS_VERSION__MAX_VERSION,
					oldMaxVersion, newMaxVersion);
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
	public void setMaxVersion(Version newMaxVersion) {
		if (newMaxVersion != maxVersion) {
			NotificationChain msgs = null;
			if (maxVersion != null)
				msgs = ((InternalEObject) maxVersion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- OptionPackage.OS_VERSION__MAX_VERSION, null,
						msgs);
			if (newMaxVersion != null)
				msgs = ((InternalEObject) newMaxVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- OptionPackage.OS_VERSION__MAX_VERSION, null,
						msgs);
			msgs = basicSetMaxVersion(newMaxVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.OS_VERSION__MAX_VERSION, newMaxVersion,
					newMaxVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isMinNotInclude() {
		return minNotInclude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinNotInclude(boolean newMinNotInclude) {
		boolean oldMinNotInclude = minNotInclude;
		minNotInclude = newMinNotInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.OS_VERSION__MIN_NOT_INCLUDE,
					oldMinNotInclude, minNotInclude));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isMaxNotInclude() {
		return maxNotInclude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMaxNotInclude(boolean newMaxNotInclude) {
		boolean oldMaxNotInclude = maxNotInclude;
		maxNotInclude = newMaxNotInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.OS_VERSION__MAX_NOT_INCLUDE,
					oldMaxNotInclude, maxNotInclude));
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
		case OptionPackage.OS_VERSION__MIN_VERSION:
			return basicSetMinVersion(null, msgs);
		case OptionPackage.OS_VERSION__MAX_VERSION:
			return basicSetMaxVersion(null, msgs);
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
		case OptionPackage.OS_VERSION__MIN_VERSION:
			return getMinVersion();
		case OptionPackage.OS_VERSION__MAX_VERSION:
			return getMaxVersion();
		case OptionPackage.OS_VERSION__MIN_NOT_INCLUDE:
			return isMinNotInclude() ? Boolean.TRUE : Boolean.FALSE;
		case OptionPackage.OS_VERSION__MAX_NOT_INCLUDE:
			return isMaxNotInclude() ? Boolean.TRUE : Boolean.FALSE;
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
		case OptionPackage.OS_VERSION__MIN_VERSION:
			setMinVersion((Version) newValue);
			return;
		case OptionPackage.OS_VERSION__MAX_VERSION:
			setMaxVersion((Version) newValue);
			return;
		case OptionPackage.OS_VERSION__MIN_NOT_INCLUDE:
			setMinNotInclude(((Boolean) newValue).booleanValue());
			return;
		case OptionPackage.OS_VERSION__MAX_NOT_INCLUDE:
			setMaxNotInclude(((Boolean) newValue).booleanValue());
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
		case OptionPackage.OS_VERSION__MIN_VERSION:
			setMinVersion((Version) null);
			return;
		case OptionPackage.OS_VERSION__MAX_VERSION:
			setMaxVersion((Version) null);
			return;
		case OptionPackage.OS_VERSION__MIN_NOT_INCLUDE:
			setMinNotInclude(MIN_NOT_INCLUDE_EDEFAULT);
			return;
		case OptionPackage.OS_VERSION__MAX_NOT_INCLUDE:
			setMaxNotInclude(MAX_NOT_INCLUDE_EDEFAULT);
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
		case OptionPackage.OS_VERSION__MIN_VERSION:
			return minVersion != null;
		case OptionPackage.OS_VERSION__MAX_VERSION:
			return maxVersion != null;
		case OptionPackage.OS_VERSION__MIN_NOT_INCLUDE:
			return minNotInclude != MIN_NOT_INCLUDE_EDEFAULT;
		case OptionPackage.OS_VERSION__MAX_NOT_INCLUDE:
			return maxNotInclude != MAX_NOT_INCLUDE_EDEFAULT;
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
		result.append(" (minNotInclude: ");
		result.append(minNotInclude);
		result.append(", maxNotInclude: ");
		result.append(maxNotInclude);
		result.append(')');
		return result.toString();
	}

} // OsVersionImpl
