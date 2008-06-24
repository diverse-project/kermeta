/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: TestCaseImpl.java,v 1.1 2008-06-24 14:23:35 cfaucher Exp $
 */
package kermeta.kunit.impl;

import kermeta.kunit.AbstractFallible;
import kermeta.kunit.Fallible;
import kermeta.kunit.KunitPackage;
import kermeta.kunit.TestCase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#isStopOnFailure <em>Stop On Failure</em>}</li>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link kermeta.kunit.impl.TestCaseImpl#get__testMethodName <em>test Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestCaseImpl extends TestImpl implements TestCase
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
   * The default value of the '{@link #get__testMethodName() <em>test Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get__testMethodName()
   * @generated
   * @ordered
   */
  protected static final String _TEST_METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #get__testMethodName() <em>test Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get__testMethodName()
   * @generated
   * @ordered
   */
  protected String __testMethodName = _TEST_METHOD_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestCaseImpl()
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
    return KunitPackage.Literals.TEST_CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KunitPackage.TEST_CASE__STOP_ON_FAILURE, oldStopOnFailure, stopOnFailure));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KunitPackage.TEST_CASE__RANK, oldRank, rank));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String get__testMethodName()
  {
    return __testMethodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set__testMethodName(String new__testMethodName)
  {
    String old__testMethodName = __testMethodName;
    __testMethodName = new__testMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KunitPackage.TEST_CASE__TEST_METHOD_NAME, old__testMethodName, __testMethodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUp()
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
  public void raiseIfHasFailures()
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
  public TestCase setTestMethodName(String name)
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
  public String getTestMethodName()
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
  public void tearDown()
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
  public void assertTrue(boolean condition)
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
  public void assertFalseWithMsg(boolean condition, String message)
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
  public void fail(String msg)
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
  public void assertEqual(String expected, String actual)
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
  public void assertFalse(boolean condition)
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
  public void assertTrueWithMsg(boolean condition, String message)
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
  public void _assert(boolean condition)
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
  public void assertWithMsg(boolean condition, String msg)
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
  public String distil(String s)
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
  public void assertSimilar(String expected, String actual)
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
      case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
        return isStopOnFailure() ? Boolean.TRUE : Boolean.FALSE;
      case KunitPackage.TEST_CASE__RANK:
        return new Integer(getRank());
      case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
        return get__testMethodName();
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
      case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
        setStopOnFailure(((Boolean)newValue).booleanValue());
        return;
      case KunitPackage.TEST_CASE__RANK:
        setRank(((Integer)newValue).intValue());
        return;
      case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
        set__testMethodName((String)newValue);
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
      case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
        setStopOnFailure(STOP_ON_FAILURE_EDEFAULT);
        return;
      case KunitPackage.TEST_CASE__RANK:
        setRank(RANK_EDEFAULT);
        return;
      case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
        set__testMethodName(_TEST_METHOD_NAME_EDEFAULT);
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
      case KunitPackage.TEST_CASE__STOP_ON_FAILURE:
        return stopOnFailure != STOP_ON_FAILURE_EDEFAULT;
      case KunitPackage.TEST_CASE__RANK:
        return rank != RANK_EDEFAULT;
      case KunitPackage.TEST_CASE__TEST_METHOD_NAME:
        return _TEST_METHOD_NAME_EDEFAULT == null ? __testMethodName != null : !_TEST_METHOD_NAME_EDEFAULT.equals(__testMethodName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractFallible.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Fallible.class)
    {
      switch (derivedFeatureID)
      {
        case KunitPackage.TEST_CASE__STOP_ON_FAILURE: return KunitPackage.FALLIBLE__STOP_ON_FAILURE;
        case KunitPackage.TEST_CASE__RANK: return KunitPackage.FALLIBLE__RANK;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractFallible.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Fallible.class)
    {
      switch (baseFeatureID)
      {
        case KunitPackage.FALLIBLE__STOP_ON_FAILURE: return KunitPackage.TEST_CASE__STOP_ON_FAILURE;
        case KunitPackage.FALLIBLE__RANK: return KunitPackage.TEST_CASE__RANK;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", __testMethodName: ");
    result.append(__testMethodName);
    result.append(')');
    return result.toString();
  }

} //TestCaseImpl
