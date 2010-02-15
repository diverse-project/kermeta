/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.DeployUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.DeployUnitImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link art2.impl.DeployUnitImpl#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link art2.impl.DeployUnitImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeployUnitImpl extends NamedElementImpl implements DeployUnit {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.DEPLOY_UNIT__GROUP_NAME:
				return getGroupName();
			case Art2Package.DEPLOY_UNIT__UNIT_NAME:
				return getUnitName();
			case Art2Package.DEPLOY_UNIT__VERSION:
				return getVersion();
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
		result.append(')');
		return result.toString();
	}

} //DeployUnitImpl
