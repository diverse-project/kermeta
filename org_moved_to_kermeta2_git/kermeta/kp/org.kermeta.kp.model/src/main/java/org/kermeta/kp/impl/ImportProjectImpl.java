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

import org.kermeta.kp.ImportProject;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.ReusableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.ImportProjectImpl#getProjectResource <em>Project Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportProjectImpl extends EObjectImpl implements ImportProject {
	/**
   * The cached value of the '{@link #getProjectResource() <em>Project Resource</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProjectResource()
   * @generated
   * @ordered
   */
	protected ReusableResource projectResource;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ImportProjectImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return KpPackage.Literals.IMPORT_PROJECT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReusableResource getProjectResource() {
    if (projectResource != null && projectResource.eIsProxy())
    {
      InternalEObject oldProjectResource = (InternalEObject)projectResource;
      projectResource = (ReusableResource)eResolveProxy(oldProjectResource);
      if (projectResource != oldProjectResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE, oldProjectResource, projectResource));
      }
    }
    return projectResource;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReusableResource basicGetProjectResource() {
    return projectResource;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setProjectResource(ReusableResource newProjectResource) {
    ReusableResource oldProjectResource = projectResource;
    projectResource = newProjectResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE, oldProjectResource, projectResource));
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
      case KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE:
        if (resolve) return getProjectResource();
        return basicGetProjectResource();
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
      case KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE:
        setProjectResource((ReusableResource)newValue);
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
      case KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE:
        setProjectResource((ReusableResource)null);
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
      case KpPackage.IMPORT_PROJECT__PROJECT_RESOURCE:
        return projectResource != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportProjectImpl
