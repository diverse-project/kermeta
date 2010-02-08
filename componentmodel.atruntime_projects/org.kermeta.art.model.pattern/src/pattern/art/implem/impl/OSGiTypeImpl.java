/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.implem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pattern.art.implem.ImplemPackage;
import pattern.art.implem.OSGiType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Gi Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pattern.art.implem.impl.OSGiTypeImpl#getGenerateInstanceBundle <em>Generate Instance Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSGiTypeImpl extends TypeImplementationImpl implements OSGiType {
	/**
	 * The default value of the '{@link #getGenerateInstanceBundle() <em>Generate Instance Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateInstanceBundle()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GENERATE_INSTANCE_BUNDLE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getGenerateInstanceBundle() <em>Generate Instance Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateInstanceBundle()
	 * @generated
	 * @ordered
	 */
	protected Boolean generateInstanceBundle = GENERATE_INSTANCE_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSGiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplemPackage.Literals.OS_GI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGenerateInstanceBundle() {
		return generateInstanceBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateInstanceBundle(Boolean newGenerateInstanceBundle) {
		Boolean oldGenerateInstanceBundle = generateInstanceBundle;
		generateInstanceBundle = newGenerateInstanceBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE, oldGenerateInstanceBundle, generateInstanceBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE:
				return getGenerateInstanceBundle();
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
			case ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE:
				setGenerateInstanceBundle((Boolean)newValue);
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
			case ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE:
				setGenerateInstanceBundle(GENERATE_INSTANCE_BUNDLE_EDEFAULT);
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
			case ImplemPackage.OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE:
				return GENERATE_INSTANCE_BUNDLE_EDEFAULT == null ? generateInstanceBundle != null : !GENERATE_INSTANCE_BUNDLE_EDEFAULT.equals(generateInstanceBundle);
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
		result.append(" (generateInstanceBundle: ");
		result.append(generateInstanceBundle);
		result.append(')');
		return result.toString();
	}

} //OSGiTypeImpl
