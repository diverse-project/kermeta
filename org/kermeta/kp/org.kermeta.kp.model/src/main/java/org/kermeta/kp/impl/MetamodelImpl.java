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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KpPackage;
import org.kermeta.kp.Metamodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.kp.impl.MetamodelImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.MetamodelImpl#getImportedFiles <em>Imported Files</em>}</li>
 *   <li>{@link org.kermeta.kp.impl.MetamodelImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends EObjectImpl implements Metamodel
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
	protected EList<Metamodel> extends_;
	/**
   * The cached value of the '{@link #getImportedFiles() <em>Imported Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedFiles()
   * @generated
   * @ordered
   */
protected EList<ImportFile> importedFiles;
	/**
   * The default value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetamodelName()
   * @generated
   * @ordered
   */
	protected static final String METAMODEL_NAME_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMetamodelName()
   * @generated
   * @ordered
   */
	protected String metamodelName = METAMODEL_NAME_EDEFAULT;

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KpPackage.Literals.METAMODEL;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ImportFile> getImportedFiles() {
    if (importedFiles == null)
    {
      importedFiles = new EObjectContainmentEList<ImportFile>(ImportFile.class, this, KpPackage.METAMODEL__IMPORTED_FILES);
    }
    return importedFiles;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMetamodelName() {
    return metamodelName;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMetamodelName(String newMetamodelName) {
    String oldMetamodelName = metamodelName;
    metamodelName = newMetamodelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KpPackage.METAMODEL__METAMODEL_NAME, oldMetamodelName, metamodelName));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Metamodel> getExtends() {
    if (extends_ == null)
    {
      extends_ = new EObjectResolvingEList<Metamodel>(Metamodel.class, this, KpPackage.METAMODEL__EXTENDS);
    }
    return extends_;
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
      case KpPackage.METAMODEL__IMPORTED_FILES:
        return ((InternalEList<?>)getImportedFiles()).basicRemove(otherEnd, msgs);
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
      case KpPackage.METAMODEL__EXTENDS:
        return getExtends();
      case KpPackage.METAMODEL__IMPORTED_FILES:
        return getImportedFiles();
      case KpPackage.METAMODEL__METAMODEL_NAME:
        return getMetamodelName();
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
      case KpPackage.METAMODEL__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends Metamodel>)newValue);
        return;
      case KpPackage.METAMODEL__IMPORTED_FILES:
        getImportedFiles().clear();
        getImportedFiles().addAll((Collection<? extends ImportFile>)newValue);
        return;
      case KpPackage.METAMODEL__METAMODEL_NAME:
        setMetamodelName((String)newValue);
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
      case KpPackage.METAMODEL__EXTENDS:
        getExtends().clear();
        return;
      case KpPackage.METAMODEL__IMPORTED_FILES:
        getImportedFiles().clear();
        return;
      case KpPackage.METAMODEL__METAMODEL_NAME:
        setMetamodelName(METAMODEL_NAME_EDEFAULT);
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
      case KpPackage.METAMODEL__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case KpPackage.METAMODEL__IMPORTED_FILES:
        return importedFiles != null && !importedFiles.isEmpty();
      case KpPackage.METAMODEL__METAMODEL_NAME:
        return METAMODEL_NAME_EDEFAULT == null ? metamodelName != null : !METAMODEL_NAME_EDEFAULT.equals(metamodelName);
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
    result.append(" (metamodelName: ");
    result.append(metamodelName);
    result.append(')');
    return result.toString();
  }

} //MetamodelImpl
