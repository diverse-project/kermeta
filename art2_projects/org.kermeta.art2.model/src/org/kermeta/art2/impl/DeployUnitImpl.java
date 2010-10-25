/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.DeployUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.DeployUnitImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.DeployUnitImpl#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.DeployUnitImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.DeployUnitImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.DeployUnitImpl#getHashcode <em>Hashcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployUnitImpl extends NamedElementImpl implements DeployUnit {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected String unitName = UNIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHashcode() <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected static final String HASHCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashcode() <em>Hashcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashcode()
	 * @generated
	 * @ordered
	 */
	protected String hashcode = HASHCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.DEPLOY_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.DEPLOY_UNIT__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitName(String newUnitName) {
		String oldUnitName = unitName;
		unitName = newUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.DEPLOY_UNIT__UNIT_NAME, oldUnitName, unitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.DEPLOY_UNIT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.DEPLOY_UNIT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashcode() {
		return hashcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashcode(String newHashcode) {
		String oldHashcode = hashcode;
		hashcode = newHashcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.DEPLOY_UNIT__HASHCODE, oldHashcode, hashcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.DEPLOY_UNIT__GROUP_NAME:
				return getGroupName();
			case Art2Package.DEPLOY_UNIT__UNIT_NAME:
				return getUnitName();
			case Art2Package.DEPLOY_UNIT__VERSION:
				return getVersion();
			case Art2Package.DEPLOY_UNIT__URL:
				return getUrl();
			case Art2Package.DEPLOY_UNIT__HASHCODE:
				return getHashcode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2Package.DEPLOY_UNIT__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case Art2Package.DEPLOY_UNIT__UNIT_NAME:
				setUnitName((String)newValue);
				return;
			case Art2Package.DEPLOY_UNIT__VERSION:
				setVersion((String)newValue);
				return;
			case Art2Package.DEPLOY_UNIT__URL:
				setUrl((String)newValue);
				return;
			case Art2Package.DEPLOY_UNIT__HASHCODE:
				setHashcode((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Art2Package.DEPLOY_UNIT__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case Art2Package.DEPLOY_UNIT__UNIT_NAME:
				setUnitName(UNIT_NAME_EDEFAULT);
				return;
			case Art2Package.DEPLOY_UNIT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Art2Package.DEPLOY_UNIT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Art2Package.DEPLOY_UNIT__HASHCODE:
				setHashcode(HASHCODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Art2Package.DEPLOY_UNIT__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case Art2Package.DEPLOY_UNIT__UNIT_NAME:
				return UNIT_NAME_EDEFAULT == null ? unitName != null : !UNIT_NAME_EDEFAULT.equals(unitName);
			case Art2Package.DEPLOY_UNIT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case Art2Package.DEPLOY_UNIT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Art2Package.DEPLOY_UNIT__HASHCODE:
				return HASHCODE_EDEFAULT == null ? hashcode != null : !HASHCODE_EDEFAULT.equals(hashcode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (groupName: ");
		result.append(groupName);
		result.append(", unitName: ");
		result.append(unitName);
		result.append(", version: ");
		result.append(version);
		result.append(", url: ");
		result.append(url);
		result.append(", hashcode: ");
		result.append(hashcode);
		result.append(')');
		return result.toString();
	}

} //DeployUnitImpl
