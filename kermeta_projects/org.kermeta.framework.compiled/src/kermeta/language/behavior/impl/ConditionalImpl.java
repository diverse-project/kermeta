/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ConditionalImpl.java,v 1.1 2008-06-24 14:23:31 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Conditional;
import kermeta.language.behavior.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.ConditionalImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends ExpressionImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getThenBody() <em>Then Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBody()
   * @generated
   * @ordered
   */
  protected Expression thenBody;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBody()
   * @generated
   * @ordered
   */
  protected Expression elseBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return BehaviorPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThenBody()
  {
    return thenBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBody(Expression newThenBody, NotificationChain msgs)
  {
    Expression oldThenBody = thenBody;
    thenBody = newThenBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__THEN_BODY, oldThenBody, newThenBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBody(Expression newThenBody)
  {
    if (newThenBody != thenBody)
    {
      NotificationChain msgs = null;
      if (thenBody != null)
        msgs = ((InternalEObject)thenBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__THEN_BODY, null, msgs);
      if (newThenBody != null)
        msgs = ((InternalEObject)newThenBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__THEN_BODY, null, msgs);
      msgs = basicSetThenBody(newThenBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__THEN_BODY, newThenBody, newThenBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElseBody()
  {
    return elseBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBody(Expression newElseBody, NotificationChain msgs)
  {
    Expression oldElseBody = elseBody;
    elseBody = newElseBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__ELSE_BODY, oldElseBody, newElseBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBody(Expression newElseBody)
  {
    if (newElseBody != elseBody)
    {
      NotificationChain msgs = null;
      if (elseBody != null)
        msgs = ((InternalEObject)elseBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__ELSE_BODY, null, msgs);
      if (newElseBody != null)
        msgs = ((InternalEObject)newElseBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CONDITIONAL__ELSE_BODY, null, msgs);
      msgs = basicSetElseBody(newElseBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CONDITIONAL__ELSE_BODY, newElseBody, newElseBody));
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
      case BehaviorPackage.CONDITIONAL__THEN_BODY:
        return basicSetThenBody(null, msgs);
      case BehaviorPackage.CONDITIONAL__CONDITION:
        return basicSetCondition(null, msgs);
      case BehaviorPackage.CONDITIONAL__ELSE_BODY:
        return basicSetElseBody(null, msgs);
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
      case BehaviorPackage.CONDITIONAL__THEN_BODY:
        return getThenBody();
      case BehaviorPackage.CONDITIONAL__CONDITION:
        return getCondition();
      case BehaviorPackage.CONDITIONAL__ELSE_BODY:
        return getElseBody();
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
      case BehaviorPackage.CONDITIONAL__THEN_BODY:
        setThenBody((Expression)newValue);
        return;
      case BehaviorPackage.CONDITIONAL__CONDITION:
        setCondition((Expression)newValue);
        return;
      case BehaviorPackage.CONDITIONAL__ELSE_BODY:
        setElseBody((Expression)newValue);
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
      case BehaviorPackage.CONDITIONAL__THEN_BODY:
        setThenBody((Expression)null);
        return;
      case BehaviorPackage.CONDITIONAL__CONDITION:
        setCondition((Expression)null);
        return;
      case BehaviorPackage.CONDITIONAL__ELSE_BODY:
        setElseBody((Expression)null);
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
      case BehaviorPackage.CONDITIONAL__THEN_BODY:
        return thenBody != null;
      case BehaviorPackage.CONDITIONAL__CONDITION:
        return condition != null;
      case BehaviorPackage.CONDITIONAL__ELSE_BODY:
        return elseBody != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalImpl
