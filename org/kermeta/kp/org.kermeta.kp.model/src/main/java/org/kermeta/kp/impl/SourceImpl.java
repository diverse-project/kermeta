/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.kp.Dependency;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.SourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.SourceImpl#isByteCodeFromADependency <em>Byte Code From ADependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends EObjectImpl implements Source {
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
   * The default value of the '{@link #isByteCodeFromADependency() <em>Byte Code From ADependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByteCodeFromADependency()
   * @generated
   * @ordered
   */
  protected static final boolean BYTE_CODE_FROM_ADEPENDENCY_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isByteCodeFromADependency() <em>Byte Code From ADependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByteCodeFromADependency()
   * @generated
   * @ordered
   */
  protected boolean byteCodeFromADependency = BYTE_CODE_FROM_ADEPENDENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SourceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.SOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.SOURCE__URL, oldUrl, url));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isByteCodeFromADependency()
  {
    return byteCodeFromADependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByteCodeFromADependency(boolean newByteCodeFromADependency)
  {
    boolean oldByteCodeFromADependency = byteCodeFromADependency;
    byteCodeFromADependency = newByteCodeFromADependency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY, oldByteCodeFromADependency, byteCodeFromADependency));
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
      case KpPackage.SOURCE__URL:
        return getUrl();
      case KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY:
        return isByteCodeFromADependency();
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
      case KpPackage.SOURCE__URL:
        setUrl((String)newValue);
        return;
      case KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY:
        setByteCodeFromADependency((Boolean)newValue);
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
      case KpPackage.SOURCE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY:
        setByteCodeFromADependency(BYTE_CODE_FROM_ADEPENDENCY_EDEFAULT);
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
      case KpPackage.SOURCE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case KpPackage.SOURCE__BYTE_CODE_FROM_ADEPENDENCY:
        return byteCodeFromADependency != BYTE_CODE_FROM_ADEPENDENCY_EDEFAULT;
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
    result.append(" (url: ");
    result.append(url);
    result.append(", byteCodeFromADependency: ");
    result.append(byteCodeFromADependency);
    result.append(')');
    return result.toString();
  }

} //SourceImpl
