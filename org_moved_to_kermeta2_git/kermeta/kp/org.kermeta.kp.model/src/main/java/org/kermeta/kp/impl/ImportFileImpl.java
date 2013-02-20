/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.kp.ReusableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.ImportFileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.ImportFileImpl#getBytecodeFrom <em>Bytecode From</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.ImportFileImpl#getPackageEquivalences <em>Package Equivalences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportFileImpl extends EObjectImpl implements ImportFile {
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
   * The cached value of the '{@link #getBytecodeFrom() <em>Bytecode From</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBytecodeFrom()
   * @generated
   * @ordered
   */
	protected ReusableResource bytecodeFrom;

	/**
   * The cached value of the '{@link #getPackageEquivalences() <em>Package Equivalences</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPackageEquivalences()
   * @generated
   * @ordered
   */
	protected EList<PackageEquivalence> packageEquivalences;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ImportFileImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.IMPORT_FILE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.IMPORT_FILE__URL, oldUrl, url));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReusableResource getBytecodeFrom() {
    if (bytecodeFrom != null && bytecodeFrom.eIsProxy())
    {
      InternalEObject oldBytecodeFrom = (InternalEObject)bytecodeFrom;
      bytecodeFrom = (ReusableResource)eResolveProxy(oldBytecodeFrom);
      if (bytecodeFrom != oldBytecodeFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpPackage.IMPORT_FILE__BYTECODE_FROM, oldBytecodeFrom, bytecodeFrom));
      }
    }
    return bytecodeFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReusableResource basicGetBytecodeFrom() {
    return bytecodeFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBytecodeFrom(ReusableResource newBytecodeFrom) {
    ReusableResource oldBytecodeFrom = bytecodeFrom;
    bytecodeFrom = newBytecodeFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.IMPORT_FILE__BYTECODE_FROM, oldBytecodeFrom, bytecodeFrom));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PackageEquivalence> getPackageEquivalences() {
    if (packageEquivalences == null)
    {
      packageEquivalences = new EObjectContainmentEList<PackageEquivalence>(PackageEquivalence.class, this, KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES);
    }
    return packageEquivalences;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES:
        return ((InternalEList<?>)getPackageEquivalences()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KpPackage.IMPORT_FILE__URL:
        return getUrl();
      case KpPackage.IMPORT_FILE__BYTECODE_FROM:
        if (resolve) return getBytecodeFrom();
        return basicGetBytecodeFrom();
      case KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES:
        return getPackageEquivalences();
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
      case KpPackage.IMPORT_FILE__URL:
        setUrl((String)newValue);
        return;
      case KpPackage.IMPORT_FILE__BYTECODE_FROM:
        setBytecodeFrom((ReusableResource)newValue);
        return;
      case KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES:
        getPackageEquivalences().clear();
        getPackageEquivalences().addAll((Collection<? extends PackageEquivalence>)newValue);
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
      case KpPackage.IMPORT_FILE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case KpPackage.IMPORT_FILE__BYTECODE_FROM:
        setBytecodeFrom((ReusableResource)null);
        return;
      case KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES:
        getPackageEquivalences().clear();
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
      case KpPackage.IMPORT_FILE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case KpPackage.IMPORT_FILE__BYTECODE_FROM:
        return bytecodeFrom != null;
      case KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES:
        return packageEquivalences != null && !packageEquivalences.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ImportFileImpl
