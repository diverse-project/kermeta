/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: FallibleImpl.java,v 1.1 2008-06-24 14:23:35 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.Log;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fallible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.FallibleImpl#isStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.impl.FallibleImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FallibleImpl extends AbstractFallibleImpl implements Fallible
{
  /**
   * The default value of the '{@link #isStopOnFailure() <em>Stop On Failure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStopOnFailure()
   * @generated
   * @ordered
   */
  protected static final boolean STOP_ON_FAILURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStopOnFailure() <em>Stop On Failure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStopOnFailure()
   * @generated
   * @ordered
   */
  protected boolean stopOnFailure = STOP_ON_FAILURE_EDEFAULT;

  /**
   * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRank()
   * @generated
   * @ordered
   */
  protected static final int RANK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRank()
   * @generated
   * @ordered
   */
  protected int rank = RANK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FallibleImpl()
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
    return KunitPackage.Literals.FALLIBLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStopOnFailure()
  {
    return stopOnFailure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopOnFailure(boolean newStopOnFailure)
  {
    boolean oldStopOnFailure = stopOnFailure;
    stopOnFailure = newStopOnFailure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KunitPackage.FALLIBLE__STOP_ON_FAILURE, oldStopOnFailure, stopOnFailure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRank()
  {
    return rank;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRank(int newRank)
  {
    int oldRank = rank;
    rank = newRank;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KunitPackage.FALLIBLE__RANK, oldRank, rank));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Log getLog()
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
  public int number()
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
  public boolean mustStop()
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
        return isStopOnFailure() ? Boolean.TRUE : Boolean.FALSE;
      case KunitPackage.FALLIBLE__RANK:
        return new Integer(getRank());
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
      case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
        setStopOnFailure(((Boolean)newValue).booleanValue());
        return;
      case KunitPackage.FALLIBLE__RANK:
        setRank(((Integer)newValue).intValue());
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
      case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
        setStopOnFailure(STOP_ON_FAILURE_EDEFAULT);
        return;
      case KunitPackage.FALLIBLE__RANK:
        setRank(RANK_EDEFAULT);
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
      case KunitPackage.FALLIBLE__STOP_ON_FAILURE:
        return stopOnFailure != STOP_ON_FAILURE_EDEFAULT;
      case KunitPackage.FALLIBLE__RANK:
        return rank != RANK_EDEFAULT;
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
    result.append(" (stopOnFailure: ");
    result.append(stopOnFailure);
    result.append(", rank: ");
    result.append(rank);
    result.append(')');
    return result.toString();
  }

} //FallibleImpl
