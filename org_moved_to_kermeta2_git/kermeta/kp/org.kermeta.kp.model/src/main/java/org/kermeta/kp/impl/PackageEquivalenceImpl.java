/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.kp.KpPackage;
import org.kermeta.kp.PackageEquivalence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Equivalence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.PackageEquivalenceImpl#getEcorePackage <em>Ecore Package</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.PackageEquivalenceImpl#getJavaPackage <em>Java Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageEquivalenceImpl extends EObjectImpl implements PackageEquivalence {
	/**
   * The default value of the '{@link #getEcorePackage() <em>Ecore Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEcorePackage()
   * @generated
   * @ordered
   */
	protected static final String ECORE_PACKAGE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEcorePackage() <em>Ecore Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEcorePackage()
   * @generated
   * @ordered
   */
	protected String ecorePackage = ECORE_PACKAGE_EDEFAULT;

	/**
   * The default value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaPackage()
   * @generated
   * @ordered
   */
	protected static final String JAVA_PACKAGE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getJavaPackage() <em>Java Package</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getJavaPackage()
   * @generated
   * @ordered
   */
	protected String javaPackage = JAVA_PACKAGE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PackageEquivalenceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.PACKAGE_EQUIVALENCE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getEcorePackage() {
    return ecorePackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEcorePackage(String newEcorePackage) {
    String oldEcorePackage = ecorePackage;
    ecorePackage = newEcorePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE, oldEcorePackage, ecorePackage));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getJavaPackage() {
    return javaPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setJavaPackage(String newJavaPackage) {
    String oldJavaPackage = javaPackage;
    javaPackage = newJavaPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE, oldJavaPackage, javaPackage));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE:
        return getEcorePackage();
      case KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE:
        return getJavaPackage();
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
    switch (featureID)
    {
      case KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE:
        setEcorePackage((String)newValue);
        return;
      case KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE:
        setJavaPackage((String)newValue);
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
    switch (featureID)
    {
      case KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE:
        setEcorePackage(ECORE_PACKAGE_EDEFAULT);
        return;
      case KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE:
        setJavaPackage(JAVA_PACKAGE_EDEFAULT);
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
    switch (featureID)
    {
      case KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE:
        return ECORE_PACKAGE_EDEFAULT == null ? ecorePackage != null : !ECORE_PACKAGE_EDEFAULT.equals(ecorePackage);
      case KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE:
        return JAVA_PACKAGE_EDEFAULT == null ? javaPackage != null : !JAVA_PACKAGE_EDEFAULT.equals(javaPackage);
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
    result.append(" (ecorePackage: ");
    result.append(ecorePackage);
    result.append(", javaPackage: ");
    result.append(javaPackage);
    result.append(')');
    return result.toString();
  }

} //PackageEquivalenceImpl
