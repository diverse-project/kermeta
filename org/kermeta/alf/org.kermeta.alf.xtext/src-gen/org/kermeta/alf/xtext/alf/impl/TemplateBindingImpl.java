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
import org.kermeta.alf.xtext.alf.NamedTemplateBinding;
import org.kermeta.alf.xtext.alf.TemplateBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.impl.TemplateBindingImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends MinimalEObjectImpl.Container implements TemplateBinding
{
  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<NamedTemplateBinding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateBindingImpl()
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
    return AlfPackage.Literals.TEMPLATE_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedTemplateBinding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<NamedTemplateBinding>(NamedTemplateBinding.class, this, AlfPackage.TEMPLATE_BINDING__BINDINGS);
    }
    return bindings;
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
      case AlfPackage.TEMPLATE_BINDING__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case AlfPackage.TEMPLATE_BINDING__BINDINGS:
        return getBindings();
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
      case AlfPackage.TEMPLATE_BINDING__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends NamedTemplateBinding>)newValue);
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
      case AlfPackage.TEMPLATE_BINDING__BINDINGS:
        getBindings().clear();
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
      case AlfPackage.TEMPLATE_BINDING__BINDINGS:
        return bindings != null && !bindings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplateBindingImpl
