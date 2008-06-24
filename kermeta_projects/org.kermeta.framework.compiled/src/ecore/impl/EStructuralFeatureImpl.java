/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EStructuralFeatureImpl.java,v 1.1 2008-06-24 14:23:19 cfaucher Exp $
 */
package ecore.impl;

import ecore.EStructuralFeature;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#is_volatile <em>volatile</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#is_transient <em>transient</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ecore.impl.EStructuralFeatureImpl#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EStructuralFeatureImpl extends ETypedElementImpl implements EStructuralFeature
{
  /**
   * The default value of the '{@link #is_volatile() <em>volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_volatile()
   * @generated
   * @ordered
   */
  protected static final boolean _VOLATILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #is_volatile() <em>volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_volatile()
   * @generated
   * @ordered
   */
  protected boolean _volatile = _VOLATILE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueLiteral()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueLiteral()
   * @generated
   * @ordered
   */
  protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #is_transient() <em>transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_transient()
   * @generated
   * @ordered
   */
  protected static final boolean _TRANSIENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #is_transient() <em>transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_transient()
   * @generated
   * @ordered
   */
  protected boolean _transient = _TRANSIENT_EDEFAULT;

  /**
   * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsettable()
   * @generated
   * @ordered
   */
  protected static final boolean UNSETTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsettable()
   * @generated
   * @ordered
   */
  protected boolean unsettable = UNSETTABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected static final boolean DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected boolean derived = DERIVED_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final Object DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected Object defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChangeable()
   * @generated
   * @ordered
   */
  protected static final boolean CHANGEABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChangeable()
   * @generated
   * @ordered
   */
  protected boolean changeable = CHANGEABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeatureImpl()
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
    return EcorePackage.Literals.ESTRUCTURAL_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean is_volatile()
  {
    return _volatile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_volatile(boolean new_volatile)
  {
    boolean old_volatile = _volatile;
    _volatile = new_volatile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE, old_volatile, _volatile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ecore.EClass getEContainingClass()
  {
    if (eContainerFeatureID != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS) return null;
    return (ecore.EClass)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEContainingClass(ecore.EClass newEContainingClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newEContainingClass, EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEContainingClass(ecore.EClass newEContainingClass)
  {
    if (newEContainingClass != eInternalContainer() || (eContainerFeatureID != EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS && newEContainingClass != null))
    {
      if (EcoreUtil.isAncestor(this, newEContainingClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newEContainingClass != null)
        msgs = ((InternalEObject)newEContainingClass).eInverseAdd(this, EcorePackage.ECLASS__ESTRUCTURAL_FEATURES, ecore.EClass.class, msgs);
      msgs = basicSetEContainingClass(newEContainingClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, newEContainingClass, newEContainingClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValueLiteral()
  {
    return defaultValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValueLiteral(String newDefaultValueLiteral)
  {
    String oldDefaultValueLiteral = defaultValueLiteral;
    defaultValueLiteral = newDefaultValueLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean is_transient()
  {
    return _transient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_transient(boolean new_transient)
  {
    boolean old_transient = _transient;
    _transient = new_transient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT, old_transient, _transient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnsettable()
  {
    return unsettable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsettable(boolean newUnsettable)
  {
    boolean oldUnsettable = unsettable;
    unsettable = newUnsettable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE, oldUnsettable, unsettable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDerived()
  {
    return derived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerived(boolean newDerived)
  {
    boolean oldDerived = derived;
    derived = newDerived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__DERIVED, oldDerived, derived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(Object newDefaultValue)
  {
    Object oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isChangeable()
  {
    return changeable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeable(boolean newChangeable)
  {
    boolean oldChangeable = changeable;
    changeable = newChangeable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE, oldChangeable, changeable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFeatureID()
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
  public Class getContainerClass()
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
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetEContainingClass((ecore.EClass)otherEnd, msgs);
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
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        return basicSetEContainingClass(null, msgs);
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
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        return eInternalContainer().eInverseRemove(this, EcorePackage.ECLASS__ESTRUCTURAL_FEATURES, ecore.EClass.class, msgs);
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
      case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
        return is_volatile() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        return getEContainingClass();
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
        return getDefaultValueLiteral();
      case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
        return is_transient() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
        return isUnsettable() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
        return isDerived() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
        return getDefaultValue();
      case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
        return isChangeable() ? Boolean.TRUE : Boolean.FALSE;
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
      case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
        set_volatile(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        setEContainingClass((ecore.EClass)newValue);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
        setDefaultValueLiteral((String)newValue);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
        set_transient(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
        setUnsettable(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
        setDerived(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
        setDefaultValue(newValue);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
        setChangeable(((Boolean)newValue).booleanValue());
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
      case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
        set_volatile(_VOLATILE_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        setEContainingClass((ecore.EClass)null);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
        setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
        set_transient(_TRANSIENT_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
        setUnsettable(UNSETTABLE_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
        setDerived(DERIVED_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
        setChangeable(CHANGEABLE_EDEFAULT);
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
      case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
        return _volatile != _VOLATILE_EDEFAULT;
      case EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS:
        return getEContainingClass() != null;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
        return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
      case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
        return _transient != _TRANSIENT_EDEFAULT;
      case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
        return unsettable != UNSETTABLE_EDEFAULT;
      case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
        return derived != DERIVED_EDEFAULT;
      case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
        return changeable != CHANGEABLE_EDEFAULT;
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
    result.append(" (_volatile: ");
    result.append(_volatile);
    result.append(", defaultValueLiteral: ");
    result.append(defaultValueLiteral);
    result.append(", _transient: ");
    result.append(_transient);
    result.append(", unsettable: ");
    result.append(unsettable);
    result.append(", derived: ");
    result.append(derived);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", changeable: ");
    result.append(changeable);
    result.append(')');
    return result.toString();
  }

} //EStructuralFeatureImpl
