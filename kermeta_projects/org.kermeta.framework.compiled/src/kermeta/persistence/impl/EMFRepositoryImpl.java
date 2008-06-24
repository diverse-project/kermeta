/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EMFRepositoryImpl.java,v 1.1 2008-06-24 14:23:34 cfaucher Exp $
 */
package kermeta.persistence.impl;

import kermeta.persistence.EMFRepository;
import kermeta.persistence.PersistencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#isUseInterpreterInternalResources <em>Use Interpreter Internal Resources</em>}</li>
 *   <li>{@link kermeta.persistence.impl.EMFRepositoryImpl#isIgnoreLoadErrors <em>Ignore Load Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFRepositoryImpl extends RepositoryImpl implements EMFRepository
{
  /**
   * The default value of the '{@link #isUseInterpreterInternalResources() <em>Use Interpreter Internal Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseInterpreterInternalResources()
   * @generated
   * @ordered
   */
  protected static final boolean USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUseInterpreterInternalResources() <em>Use Interpreter Internal Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUseInterpreterInternalResources()
   * @generated
   * @ordered
   */
  protected boolean useInterpreterInternalResources = USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT;

  /**
   * The default value of the '{@link #isIgnoreLoadErrors() <em>Ignore Load Errors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreLoadErrors()
   * @generated
   * @ordered
   */
  protected static final boolean IGNORE_LOAD_ERRORS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIgnoreLoadErrors() <em>Ignore Load Errors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreLoadErrors()
   * @generated
   * @ordered
   */
  protected boolean ignoreLoadErrors = IGNORE_LOAD_ERRORS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMFRepositoryImpl()
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
    return PersistencePackage.Literals.EMF_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseInterpreterInternalResources()
  {
    return useInterpreterInternalResources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseInterpreterInternalResources(boolean newUseInterpreterInternalResources)
  {
    boolean oldUseInterpreterInternalResources = useInterpreterInternalResources;
    useInterpreterInternalResources = newUseInterpreterInternalResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES, oldUseInterpreterInternalResources, useInterpreterInternalResources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreLoadErrors()
  {
    return ignoreLoadErrors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreLoadErrors(boolean newIgnoreLoadErrors)
  {
    boolean oldIgnoreLoadErrors = ignoreLoadErrors;
    ignoreLoadErrors = newIgnoreLoadErrors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS, oldIgnoreLoadErrors, ignoreLoadErrors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
        return isUseInterpreterInternalResources() ? Boolean.TRUE : Boolean.FALSE;
      case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
        return isIgnoreLoadErrors() ? Boolean.TRUE : Boolean.FALSE;
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
        setUseInterpreterInternalResources(((Boolean)newValue).booleanValue());
        return;
      case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
        setIgnoreLoadErrors(((Boolean)newValue).booleanValue());
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
        setUseInterpreterInternalResources(USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT);
        return;
      case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
        setIgnoreLoadErrors(IGNORE_LOAD_ERRORS_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.EMF_REPOSITORY__USE_INTERPRETER_INTERNAL_RESOURCES:
        return useInterpreterInternalResources != USE_INTERPRETER_INTERNAL_RESOURCES_EDEFAULT;
      case PersistencePackage.EMF_REPOSITORY__IGNORE_LOAD_ERRORS:
        return ignoreLoadErrors != IGNORE_LOAD_ERRORS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (useInterpreterInternalResources: ");
    result.append(useInterpreterInternalResources);
    result.append(", ignoreLoadErrors: ");
    result.append(ignoreLoadErrors);
    result.append(')');
    return result.toString();
  }

} //EMFRepositoryImpl
