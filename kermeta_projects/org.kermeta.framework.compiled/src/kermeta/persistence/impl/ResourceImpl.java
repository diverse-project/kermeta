/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ResourceImpl.java,v 1.1 2008-06-24 14:23:34 cfaucher Exp $
 */
package kermeta.persistence.impl;

import java.util.Collection;

import kermeta.persistence.PersistencePackage;
import kermeta.persistence.Repository;
import kermeta.persistence.Resource;

import kermeta.standard.impl.SetImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getDependentResources <em>Dependent Resources</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.persistence.impl.ResourceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceImpl extends SetImpl<kermeta.language.structure.Object> implements Resource
{
  /**
   * The cached value of the '{@link #getDependentResources() <em>Dependent Resources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependentResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> dependentResources;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<kermeta.language.structure.Object> contents;

  /**
   * The default value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaModelURI()
   * @generated
   * @ordered
   */
  protected static final String META_MODEL_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaModelURI()
   * @generated
   * @ordered
   */
  protected String metaModelURI = META_MODEL_URI_EDEFAULT;

  /**
   * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReadOnly()
   * @generated
   * @ordered
   */
  protected static final boolean IS_READ_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReadOnly()
   * @generated
   * @ordered
   */
  protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

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
  protected ResourceImpl()
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
    return PersistencePackage.Literals.RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getDependentResources()
  {
    if (dependentResources == null)
    {
      dependentResources = new EObjectResolvingEList<Resource>(Resource.class, this, PersistencePackage.RESOURCE__DEPENDENT_RESOURCES);
    }
    return dependentResources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<kermeta.language.structure.Object> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectResolvingEList<kermeta.language.structure.Object>(kermeta.language.structure.Object.class, this, PersistencePackage.RESOURCE__CONTENTS);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository getRepository()
  {
    if (eContainerFeatureID != PersistencePackage.RESOURCE__REPOSITORY) return null;
    return (Repository)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newRepository, PersistencePackage.RESOURCE__REPOSITORY, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(Repository newRepository)
  {
    if (newRepository != eInternalContainer() || (eContainerFeatureID != PersistencePackage.RESOURCE__REPOSITORY && newRepository != null))
    {
      if (EcoreUtil.isAncestor(this, newRepository))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRepository != null)
        msgs = ((InternalEObject)newRepository).eInverseAdd(this, PersistencePackage.REPOSITORY__RESOURCES, Repository.class, msgs);
      msgs = basicSetRepository(newRepository, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE__REPOSITORY, newRepository, newRepository));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMetaModelURI()
  {
    return metaModelURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaModelURI(String newMetaModelURI)
  {
    String oldMetaModelURI = metaModelURI;
    metaModelURI = newMetaModelURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE__META_MODEL_URI, oldMetaModelURI, metaModelURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsReadOnly()
  {
    return isReadOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReadOnly(boolean newIsReadOnly)
  {
    boolean oldIsReadOnly = isReadOnly;
    isReadOnly = newIsReadOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUri(String newUri)
  {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.RESOURCE__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void save()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void saveWithNewURI(String new_uri)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void load()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource instances()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PersistencePackage.RESOURCE__REPOSITORY:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetRepository((Repository)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PersistencePackage.RESOURCE__REPOSITORY:
        return basicSetRepository(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case PersistencePackage.RESOURCE__REPOSITORY:
        return eInternalContainer().eInverseRemove(this, PersistencePackage.REPOSITORY__RESOURCES, Repository.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
        return getDependentResources();
      case PersistencePackage.RESOURCE__CONTENTS:
        return getContents();
      case PersistencePackage.RESOURCE__REPOSITORY:
        return getRepository();
      case PersistencePackage.RESOURCE__META_MODEL_URI:
        return getMetaModelURI();
      case PersistencePackage.RESOURCE__IS_READ_ONLY:
        return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
      case PersistencePackage.RESOURCE__URI:
        return getUri();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
        getDependentResources().clear();
        getDependentResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case PersistencePackage.RESOURCE__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends kermeta.language.structure.Object>)newValue);
        return;
      case PersistencePackage.RESOURCE__REPOSITORY:
        setRepository((Repository)newValue);
        return;
      case PersistencePackage.RESOURCE__META_MODEL_URI:
        setMetaModelURI((String)newValue);
        return;
      case PersistencePackage.RESOURCE__IS_READ_ONLY:
        setIsReadOnly(((Boolean)newValue).booleanValue());
        return;
      case PersistencePackage.RESOURCE__URI:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
        getDependentResources().clear();
        return;
      case PersistencePackage.RESOURCE__CONTENTS:
        getContents().clear();
        return;
      case PersistencePackage.RESOURCE__REPOSITORY:
        setRepository((Repository)null);
        return;
      case PersistencePackage.RESOURCE__META_MODEL_URI:
        setMetaModelURI(META_MODEL_URI_EDEFAULT);
        return;
      case PersistencePackage.RESOURCE__IS_READ_ONLY:
        setIsReadOnly(IS_READ_ONLY_EDEFAULT);
        return;
      case PersistencePackage.RESOURCE__URI:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersistencePackage.RESOURCE__DEPENDENT_RESOURCES:
        return dependentResources != null && !dependentResources.isEmpty();
      case PersistencePackage.RESOURCE__CONTENTS:
        return contents != null && !contents.isEmpty();
      case PersistencePackage.RESOURCE__REPOSITORY:
        return getRepository() != null;
      case PersistencePackage.RESOURCE__META_MODEL_URI:
        return META_MODEL_URI_EDEFAULT == null ? metaModelURI != null : !META_MODEL_URI_EDEFAULT.equals(metaModelURI);
      case PersistencePackage.RESOURCE__IS_READ_ONLY:
        return isReadOnly != IS_READ_ONLY_EDEFAULT;
      case PersistencePackage.RESOURCE__URI:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (metaModelURI: ");
    result.append(metaModelURI);
    result.append(", isReadOnly: ");
    result.append(isReadOnly);
    result.append(", uri: ");
    result.append(uri);
    result.append(')');
    return result.toString();
  }

} //ResourceImpl
