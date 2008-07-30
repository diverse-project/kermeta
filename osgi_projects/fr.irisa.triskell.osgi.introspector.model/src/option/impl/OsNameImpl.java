/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsNameImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package option.impl;

import option.OptionPackage;
import option.OsName;
import option.OsNameEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.framework.Constants;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Os Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link option.impl.OsNameImpl#getOsname <em>Osname</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OsNameImpl extends NativeCodeDirectiveImpl implements OsName {
	/**
	 * The default value of the '{@link #getOsname() <em>Osname</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsname()
	 * @generated
	 * @ordered
	 */
	protected static final OsNameEnum OSNAME_EDEFAULT = OsNameEnum.AIX;

	/**
	 * The cached value of the '{@link #getOsname() <em>Osname</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOsname()
	 * @generated
	 * @ordered
	 */
	protected OsNameEnum osname = OSNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected OsNameImpl() {
		super();
		this.setToken(Constants.BUNDLE_NATIVECODE_OSNAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionPackage.Literals.OS_NAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OsNameEnum getOsname() {
		return osname;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOsname(OsNameEnum newOsname) {
		OsNameEnum oldOsname = osname;
		osname = newOsname == null ? OSNAME_EDEFAULT : newOsname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OptionPackage.OS_NAME__OSNAME, oldOsname, osname));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OptionPackage.OS_NAME__OSNAME:
			return getOsname();
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
		case OptionPackage.OS_NAME__OSNAME:
			setOsname((OsNameEnum) newValue);
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
		case OptionPackage.OS_NAME__OSNAME:
			setOsname(OSNAME_EDEFAULT);
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
		case OptionPackage.OS_NAME__OSNAME:
			return osname != OSNAME_EDEFAULT;
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
		result.append(" (osname: ");
		result.append(osname);
		result.append(')');
		return result.toString();
	}

} // OsNameImpl
