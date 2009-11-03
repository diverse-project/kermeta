/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem.impl;

import art.implem.ImplemPackage;
import art.implem.OSGiComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Gi Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art.implem.impl.OSGiComponentImpl#getImplementingClass <em>Implementing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSGiComponentImpl extends ComponentImplementationImpl implements OSGiComponent {
	/**
	 * The default value of the '{@link #getImplementingClass() <em>Implementing Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClass()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTING_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementingClass() <em>Implementing Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClass()
	 * @generated
	 * @ordered
	 */
	protected String implementingClass = IMPLEMENTING_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSGiComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplemPackage.Literals.OS_GI_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementingClass() {
		return implementingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingClass(String newImplementingClass) {
		String oldImplementingClass = implementingClass;
		implementingClass = newImplementingClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS, oldImplementingClass, implementingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS:
				return getImplementingClass();
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
			case ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS:
				setImplementingClass((String)newValue);
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
			case ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS:
				setImplementingClass(IMPLEMENTING_CLASS_EDEFAULT);
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
			case ImplemPackage.OS_GI_COMPONENT__IMPLEMENTING_CLASS:
				return IMPLEMENTING_CLASS_EDEFAULT == null ? implementingClass != null : !IMPLEMENTING_CLASS_EDEFAULT.equals(implementingClass);
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
		result.append(" (implementingClass: ");
		result.append(implementingClass);
		result.append(')');
		return result.toString();
	}

} //OSGiComponentImpl
