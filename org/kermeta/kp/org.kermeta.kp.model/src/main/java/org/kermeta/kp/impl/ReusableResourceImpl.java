/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.kermeta.kp.KpPackage;
import org.kermeta.kp.ReusableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.ReusableResourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.ReusableResourceImpl#getAlternateUrls <em>Alternate Urls</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.ReusableResourceImpl#getReusableResourceName <em>Reusable Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReusableResourceImpl extends EObjectImpl implements ReusableResource {
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
   * The cached value of the '{@link #getAlternateUrls() <em>Alternate Urls</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAlternateUrls()
   * @generated
   * @ordered
   */
	protected EList<String> alternateUrls;

	/**
   * The default value of the '{@link #getReusableResourceName() <em>Reusable Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReusableResourceName()
   * @generated
   * @ordered
   */
	protected static final String REUSABLE_RESOURCE_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getReusableResourceName() <em>Reusable Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReusableResourceName()
   * @generated
   * @ordered
   */
	protected String reusableResourceName = REUSABLE_RESOURCE_NAME_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ReusableResourceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.REUSABLE_RESOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.REUSABLE_RESOURCE__URL, oldUrl, url));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<String> getAlternateUrls() {
    if (alternateUrls == null)
    {
      alternateUrls = new EDataTypeUniqueEList<String>(String.class, this, KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS);
    }
    return alternateUrls;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getReusableResourceName() {
    return reusableResourceName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReusableResourceName(String newReusableResourceName) {
    String oldReusableResourceName = reusableResourceName;
    reusableResourceName = newReusableResourceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME, oldReusableResourceName, reusableResourceName));
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> allUrls() {
		EList<String> result = new BasicEList<String>();
		result.add(getUrl());
		result.addAll(getAlternateUrls());
		return result;
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
      case KpPackage.REUSABLE_RESOURCE__URL:
        return getUrl();
      case KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS:
        return getAlternateUrls();
      case KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME:
        return getReusableResourceName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case KpPackage.REUSABLE_RESOURCE__URL:
        setUrl((String)newValue);
        return;
      case KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS:
        getAlternateUrls().clear();
        getAlternateUrls().addAll((Collection<? extends String>)newValue);
        return;
      case KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME:
        setReusableResourceName((String)newValue);
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
      case KpPackage.REUSABLE_RESOURCE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS:
        getAlternateUrls().clear();
        return;
      case KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME:
        setReusableResourceName(REUSABLE_RESOURCE_NAME_EDEFAULT);
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
      case KpPackage.REUSABLE_RESOURCE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS:
        return alternateUrls != null && !alternateUrls.isEmpty();
      case KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME:
        return REUSABLE_RESOURCE_NAME_EDEFAULT == null ? reusableResourceName != null : !REUSABLE_RESOURCE_NAME_EDEFAULT.equals(reusableResourceName);
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
    result.append(", alternateUrls: ");
    result.append(alternateUrls);
    result.append(", reusableResourceName: ");
    result.append(reusableResourceName);
    result.append(')');
    return result.toString();
  }

} //ReusableResourceImpl
