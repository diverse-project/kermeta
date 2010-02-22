/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.Art2Package;
import art2.OSGiScrDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Gi Scr Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.OSGiScrDataTypeImpl#getInterfaceImpl <em>Interface Impl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSGiScrDataTypeImpl extends ServiceDataTypeImpl implements OSGiScrDataType {
	/**
	 * The default value of the '{@link #getInterfaceImpl() <em>Interface Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceImpl()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_IMPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceImpl() <em>Interface Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceImpl()
	 * @generated
	 * @ordered
	 */
	protected String interfaceImpl = INTERFACE_IMPL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSGiScrDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.OS_GI_SCR_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceImpl() {
		return interfaceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceImpl(String newInterfaceImpl) {
		String oldInterfaceImpl = interfaceImpl;
		interfaceImpl = newInterfaceImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL, oldInterfaceImpl, interfaceImpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL:
				return getInterfaceImpl();
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
			case Art2Package.OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL:
				setInterfaceImpl((String)newValue);
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
			case Art2Package.OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL:
				setInterfaceImpl(INTERFACE_IMPL_EDEFAULT);
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
			case Art2Package.OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL:
				return INTERFACE_IMPL_EDEFAULT == null ? interfaceImpl != null : !INTERFACE_IMPL_EDEFAULT.equals(interfaceImpl);
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
		result.append(" (interfaceImpl: ");
		result.append(interfaceImpl);
		result.append(')');
		return result.toString();
	}

} //OSGiScrDataTypeImpl
