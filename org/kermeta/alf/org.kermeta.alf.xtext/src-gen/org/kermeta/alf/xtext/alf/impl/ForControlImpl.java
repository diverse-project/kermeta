/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.alf.xtext.alf.AlfPackage;
import org.kermeta.alf.xtext.alf.ForControl;
import org.kermeta.alf.xtext.alf.LoopVariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.ForControlImpl#getLoopVariableDefinition <em>Loop Variable Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForControlImpl extends MinimalEObjectImpl.Container implements ForControl
{
  /**
   * The cached value of the '{@link #getLoopVariableDefinition() <em>Loop Variable Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoopVariableDefinition()
   * @generated
   * @ordered
   */
  protected EList<LoopVariableDefinition> loopVariableDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForControlImpl()
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
    return AlfPackage.Literals.FOR_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LoopVariableDefinition> getLoopVariableDefinition()
  {
    if (loopVariableDefinition == null)
    {
      loopVariableDefinition = new EObjectContainmentEList<LoopVariableDefinition>(LoopVariableDefinition.class, this, AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION);
    }
    return loopVariableDefinition;
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return ((InternalEList<?>)getLoopVariableDefinition()).basicRemove(otherEnd, msgs);
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return getLoopVariableDefinition();
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        getLoopVariableDefinition().clear();
        getLoopVariableDefinition().addAll((Collection<? extends LoopVariableDefinition>)newValue);
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        getLoopVariableDefinition().clear();
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return loopVariableDefinition != null && !loopVariableDefinition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForControlImpl
