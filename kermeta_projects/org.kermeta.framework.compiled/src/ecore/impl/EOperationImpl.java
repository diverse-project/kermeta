/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EOperationImpl.java,v 1.1 2008-06-24 14:23:19 cfaucher Exp $
 */
package ecore.impl;

import ecore.EClassifier;
import ecore.EGenericType;
import ecore.EOperation;
import ecore.EParameter;
import ecore.ETypeParameter;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.impl.EOperationImpl#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 *   <li>{@link ecore.impl.EOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecore.impl.EOperationImpl#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecore.impl.EOperationImpl#getEExceptions <em>EExceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EOperationImpl extends ETypedElementImpl implements EOperation
{
  /**
   * The cached value of the '{@link #getEGenericExceptions() <em>EGeneric Exceptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEGenericExceptions()
   * @generated
   * @ordered
   */
  protected EList<EGenericType> eGenericExceptions;

  /**
   * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEParameters()
   * @generated
   * @ordered
   */
  protected EList<EParameter> eParameters;

  /**
   * The cached value of the '{@link #getETypeParameters() <em>EType Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getETypeParameters()
   * @generated
   * @ordered
   */
  protected EList<ETypeParameter> eTypeParameters;

  /**
   * The cached value of the '{@link #getEExceptions() <em>EExceptions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEExceptions()
   * @generated
   * @ordered
   */
  protected EList<EClassifier> eExceptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOperationImpl()
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
    return EcorePackage.Literals.EOPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecore.EClass getEContainingClass()
  {
    if (eContainerFeatureID != EcorePackage.EOPERATION__ECONTAINING_CLASS) return null;
    return (ecore.EClass)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEContainingClass(ecore.EClass newEContainingClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newEContainingClass, EcorePackage.EOPERATION__ECONTAINING_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEContainingClass(ecore.EClass newEContainingClass)
  {
    if (newEContainingClass != eInternalContainer() || (eContainerFeatureID != EcorePackage.EOPERATION__ECONTAINING_CLASS && newEContainingClass != null))
    {
      if (EcoreUtil.isAncestor(this, newEContainingClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newEContainingClass != null)
        msgs = ((InternalEObject)newEContainingClass).eInverseAdd(this, EcorePackage.ECLASS__EOPERATIONS, ecore.EClass.class, msgs);
      msgs = basicSetEContainingClass(newEContainingClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EOPERATION__ECONTAINING_CLASS, newEContainingClass, newEContainingClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGenericType> getEGenericExceptions()
  {
    if (eGenericExceptions == null)
    {
      eGenericExceptions = new EObjectContainmentEList<EGenericType>(EGenericType.class, this, EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS);
    }
    return eGenericExceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EParameter> getEParameters()
  {
    if (eParameters == null)
    {
      eParameters = new EObjectContainmentWithInverseEList<EParameter>(EParameter.class, this, EcorePackage.EOPERATION__EPARAMETERS, EcorePackage.EPARAMETER__EOPERATION);
    }
    return eParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETypeParameter> getETypeParameters()
  {
    if (eTypeParameters == null)
    {
      eTypeParameters = new EObjectContainmentEList<ETypeParameter>(ETypeParameter.class, this, EcorePackage.EOPERATION__ETYPE_PARAMETERS);
    }
    return eTypeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EClassifier> getEExceptions()
  {
    if (eExceptions == null)
    {
      eExceptions = new EObjectResolvingEList<EClassifier>(EClassifier.class, this, EcorePackage.EOPERATION__EEXCEPTIONS);
    }
    return eExceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetEContainingClass((ecore.EClass)otherEnd, msgs);
      case EcorePackage.EOPERATION__EPARAMETERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEParameters()).basicAdd(otherEnd, msgs);
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        return basicSetEContainingClass(null, msgs);
      case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
        return ((InternalEList<?>)getEGenericExceptions()).basicRemove(otherEnd, msgs);
      case EcorePackage.EOPERATION__EPARAMETERS:
        return ((InternalEList<?>)getEParameters()).basicRemove(otherEnd, msgs);
      case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
        return ((InternalEList<?>)getETypeParameters()).basicRemove(otherEnd, msgs);
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        return eInternalContainer().eInverseRemove(this, EcorePackage.ECLASS__EOPERATIONS, ecore.EClass.class, msgs);
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        return getEContainingClass();
      case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
        return getEGenericExceptions();
      case EcorePackage.EOPERATION__EPARAMETERS:
        return getEParameters();
      case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
        return getETypeParameters();
      case EcorePackage.EOPERATION__EEXCEPTIONS:
        return getEExceptions();
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        setEContainingClass((ecore.EClass)newValue);
        return;
      case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
        getEGenericExceptions().clear();
        getEGenericExceptions().addAll((Collection<? extends EGenericType>)newValue);
        return;
      case EcorePackage.EOPERATION__EPARAMETERS:
        getEParameters().clear();
        getEParameters().addAll((Collection<? extends EParameter>)newValue);
        return;
      case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
        getETypeParameters().clear();
        getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
        return;
      case EcorePackage.EOPERATION__EEXCEPTIONS:
        getEExceptions().clear();
        getEExceptions().addAll((Collection<? extends EClassifier>)newValue);
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        setEContainingClass((ecore.EClass)null);
        return;
      case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
        getEGenericExceptions().clear();
        return;
      case EcorePackage.EOPERATION__EPARAMETERS:
        getEParameters().clear();
        return;
      case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
        getETypeParameters().clear();
        return;
      case EcorePackage.EOPERATION__EEXCEPTIONS:
        getEExceptions().clear();
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
      case EcorePackage.EOPERATION__ECONTAINING_CLASS:
        return getEContainingClass() != null;
      case EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS:
        return eGenericExceptions != null && !eGenericExceptions.isEmpty();
      case EcorePackage.EOPERATION__EPARAMETERS:
        return eParameters != null && !eParameters.isEmpty();
      case EcorePackage.EOPERATION__ETYPE_PARAMETERS:
        return eTypeParameters != null && !eTypeParameters.isEmpty();
      case EcorePackage.EOPERATION__EEXCEPTIONS:
        return eExceptions != null && !eExceptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EOperationImpl
