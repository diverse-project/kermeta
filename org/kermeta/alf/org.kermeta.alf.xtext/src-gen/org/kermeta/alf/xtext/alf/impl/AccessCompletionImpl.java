/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.kermeta.alf.xtext.alf.AccessCompletion;
import org.kermeta.alf.xtext.alf.AlfPackage;
import org.kermeta.alf.xtext.alf.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.AccessCompletionImpl#getAccessIndex <em>Access Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessCompletionImpl extends MinimalEObjectImpl.Container implements AccessCompletion
{
  /**
   * The cached value of the '{@link #getAccessIndex() <em>Access Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessIndex()
   * @generated
   * @ordered
   */
  protected Expression accessIndex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessCompletionImpl()
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
    return AlfPackage.Literals.ACCESS_COMPLETION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAccessIndex()
  {
    return accessIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessIndex(Expression newAccessIndex, NotificationChain msgs)
  {
    Expression oldAccessIndex = accessIndex;
    accessIndex = newAccessIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX, oldAccessIndex, newAccessIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessIndex(Expression newAccessIndex)
  {
    if (newAccessIndex != accessIndex)
    {
      NotificationChain msgs = null;
      if (accessIndex != null)
        msgs = ((InternalEObject)accessIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX, null, msgs);
      if (newAccessIndex != null)
        msgs = ((InternalEObject)newAccessIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX, null, msgs);
      msgs = basicSetAccessIndex(newAccessIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX, newAccessIndex, newAccessIndex));
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
      case AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX:
        return basicSetAccessIndex(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX:
        return getAccessIndex();
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
      case AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX:
        setAccessIndex((Expression)newValue);
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
      case AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX:
        setAccessIndex((Expression)null);
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
      case AlfPackage.ACCESS_COMPLETION__ACCESS_INDEX:
        return accessIndex != null;
    }
    return super.eIsSet(featureID);
  }

} //AccessCompletionImpl
