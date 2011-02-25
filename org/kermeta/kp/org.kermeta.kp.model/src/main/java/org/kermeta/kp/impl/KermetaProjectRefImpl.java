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

import org.kermeta.kp.KermetaProjectRef;
import org.kermeta.kp.KpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta Project Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectRefImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectRefImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.KermetaProjectRefImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KermetaProjectRefImpl extends NamedElementImpl implements KermetaProjectRef {
	/**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected static final String GROUP_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
	protected String group = GROUP_EDEFAULT;

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
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected static final String URI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected String uri = URI_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected KermetaProjectRefImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.KERMETA_PROJECT_REF;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getGroup() {
    return group;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setGroup(String newGroup) {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT_REF__GROUP, oldGroup, group));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT_REF__VERSION, oldVersion, version));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUri() {
    return uri;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUri(String newUri) {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.KERMETA_PROJECT_REF__URI, oldUri, uri));
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
      case KpPackage.KERMETA_PROJECT_REF__GROUP:
        return getGroup();
      case KpPackage.KERMETA_PROJECT_REF__VERSION:
        return getVersion();
      case KpPackage.KERMETA_PROJECT_REF__URI:
        return getUri();
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
      case KpPackage.KERMETA_PROJECT_REF__GROUP:
        setGroup((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT_REF__VERSION:
        setVersion((String)newValue);
        return;
      case KpPackage.KERMETA_PROJECT_REF__URI:
        setUri((String)newValue);
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
      case KpPackage.KERMETA_PROJECT_REF__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT_REF__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case KpPackage.KERMETA_PROJECT_REF__URI:
        setUri(URI_EDEFAULT);
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
      case KpPackage.KERMETA_PROJECT_REF__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case KpPackage.KERMETA_PROJECT_REF__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case KpPackage.KERMETA_PROJECT_REF__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
    result.append(" (group: ");
    result.append(group);
    result.append(", version: ");
    result.append(version);
    result.append(", uri: ");
    result.append(uri);
    result.append(')');
    return result.toString();
  }

} //KermetaProjectRefImpl
