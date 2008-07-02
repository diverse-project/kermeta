/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: PropertyImpl.java,v 1.1 2008-07-02 09:13:17 ftanguy Exp $
 */
package kermeta.language.structure.impl;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#get_default <em>default</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getGetterBody <em>Getter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getSetterBody <em>Setter Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsSetterAbstract <em>Is Setter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsID <em>Is ID</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsGetterAbstract <em>Is Getter Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MultiplicityElementImpl implements Property
{
  /**
   * The default value of the '{@link #get_default() <em>default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_default()
   * @generated
   * @ordered
   */
  protected static final String _DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #get_default() <em>default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_default()
   * @generated
   * @ordered
   */
  protected String _default = _DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected Property opposite;

  /**
   * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected boolean isDerived = IS_DERIVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getGetterBody() <em>Getter Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetterBody()
   * @generated
   * @ordered
   */
  protected Expression getterBody;

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
   * The cached value of the '{@link #getSetterBody() <em>Setter Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetterBody()
   * @generated
   * @ordered
   */
  protected Expression setterBody;

  /**
   * The default value of the '{@link #isIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSetterAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SETTER_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSetterAbstract() <em>Is Setter Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSetterAbstract()
   * @generated
   * @ordered
   */
  protected boolean isSetterAbstract = IS_SETTER_ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsID()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsID()
   * @generated
   * @ordered
   */
  protected boolean isID = IS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsGetterAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_GETTER_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsGetterAbstract() <em>Is Getter Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsGetterAbstract()
   * @generated
   * @ordered
   */
  protected boolean isGetterAbstract = IS_GETTER_ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected static final boolean IS_COMPOSITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return StructurePackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String get_default()
  {
    return _default;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_default(String new_default)
  {
    String old_default = _default;
    _default = new_default;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__DEFAULT, old_default, _default));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getOpposite()
  {
    if (opposite != null && opposite.eIsProxy())
    {
      InternalEObject oldOpposite = (InternalEObject)opposite;
      opposite = (Property)eResolveProxy(oldOpposite);
      if (opposite != oldOpposite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.PROPERTY__OPPOSITE, oldOpposite, opposite));
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetOpposite()
  {
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpposite(Property newOpposite)
  {
    Property oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__OPPOSITE, oldOpposite, opposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDerived()
  {
    return isDerived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDerived(boolean newIsDerived)
  {
    boolean oldIsDerived = isDerived;
    isDerived = newIsDerived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getGetterBody()
  {
    return getterBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetterBody(Expression newGetterBody, NotificationChain msgs)
  {
    Expression oldGetterBody = getterBody;
    getterBody = newGetterBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__GETTER_BODY, oldGetterBody, newGetterBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetterBody(Expression newGetterBody)
  {
    if (newGetterBody != getterBody)
    {
      NotificationChain msgs = null;
      if (getterBody != null)
        msgs = ((InternalEObject)getterBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, msgs);
      if (newGetterBody != null)
        msgs = ((InternalEObject)newGetterBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__GETTER_BODY, null, msgs);
      msgs = basicSetGetterBody(newGetterBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__GETTER_BODY, newGetterBody, newGetterBody));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSetterBody()
  {
    return setterBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetterBody(Expression newSetterBody, NotificationChain msgs)
  {
    Expression oldSetterBody = setterBody;
    setterBody = newSetterBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__SETTER_BODY, oldSetterBody, newSetterBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetterBody(Expression newSetterBody)
  {
    if (newSetterBody != setterBody)
    {
      NotificationChain msgs = null;
      if (setterBody != null)
        msgs = ((InternalEObject)setterBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, msgs);
      if (newSetterBody != null)
        msgs = ((InternalEObject)newSetterBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.PROPERTY__SETTER_BODY, null, msgs);
      msgs = basicSetSetterBody(newSetterBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__SETTER_BODY, newSetterBody, newSetterBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSetterAbstract()
  {
    return isSetterAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSetterAbstract(boolean newIsSetterAbstract)
  {
    boolean oldIsSetterAbstract = isSetterAbstract;
    isSetterAbstract = newIsSetterAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_SETTER_ABSTRACT, oldIsSetterAbstract, isSetterAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsID()
  {
    return isID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsID(boolean newIsID)
  {
    boolean oldIsID = isID;
    isID = newIsID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_ID, oldIsID, isID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition getOwningClass()
  {
    if (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS) return null;
    return (ClassDefinition)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningClass(ClassDefinition newOwningClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningClass, StructurePackage.PROPERTY__OWNING_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningClass(ClassDefinition newOwningClass)
  {
    if (newOwningClass != eInternalContainer() || (eContainerFeatureID != StructurePackage.PROPERTY__OWNING_CLASS && newOwningClass != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningClass != null)
        msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, ClassDefinition.class, msgs);
      msgs = basicSetOwningClass(newOwningClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__OWNING_CLASS, newOwningClass, newOwningClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsGetterAbstract()
  {
    return isGetterAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsGetterAbstract(boolean newIsGetterAbstract)
  {
    boolean oldIsGetterAbstract = isGetterAbstract;
    isGetterAbstract = newIsGetterAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_GETTER_ABSTRACT, oldIsGetterAbstract, isGetterAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsComposite()
  {
    return isComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsComposite(boolean newIsComposite)
  {
    boolean oldIsComposite = isComposite;
    isComposite = newIsComposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
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
      case StructurePackage.PROPERTY__OWNING_CLASS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningClass((ClassDefinition)otherEnd, msgs);
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
      case StructurePackage.PROPERTY__GETTER_BODY:
        return basicSetGetterBody(null, msgs);
      case StructurePackage.PROPERTY__SETTER_BODY:
        return basicSetSetterBody(null, msgs);
      case StructurePackage.PROPERTY__OWNING_CLASS:
        return basicSetOwningClass(null, msgs);
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
      case StructurePackage.PROPERTY__OWNING_CLASS:
        return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, ClassDefinition.class, msgs);
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
      case StructurePackage.PROPERTY__DEFAULT:
        return get_default();
      case StructurePackage.PROPERTY__OPPOSITE:
        if (resolve) return getOpposite();
        return basicGetOpposite();
      case StructurePackage.PROPERTY__IS_DERIVED:
        return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.PROPERTY__GETTER_BODY:
        return getGetterBody();
      case StructurePackage.PROPERTY__IS_READ_ONLY:
        return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.PROPERTY__SETTER_BODY:
        return getSetterBody();
      case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
        return isIsSetterAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.PROPERTY__IS_ID:
        return isIsID() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.PROPERTY__OWNING_CLASS:
        return getOwningClass();
      case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
        return isIsGetterAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.PROPERTY__IS_COMPOSITE:
        return isIsComposite() ? Boolean.TRUE : Boolean.FALSE;
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
      case StructurePackage.PROPERTY__DEFAULT:
        set_default((String)newValue);
        return;
      case StructurePackage.PROPERTY__OPPOSITE:
        setOpposite((Property)newValue);
        return;
      case StructurePackage.PROPERTY__IS_DERIVED:
        setIsDerived(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.PROPERTY__GETTER_BODY:
        setGetterBody((Expression)newValue);
        return;
      case StructurePackage.PROPERTY__IS_READ_ONLY:
        setIsReadOnly(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.PROPERTY__SETTER_BODY:
        setSetterBody((Expression)newValue);
        return;
      case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
        setIsSetterAbstract(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.PROPERTY__IS_ID:
        setIsID(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.PROPERTY__OWNING_CLASS:
        setOwningClass((ClassDefinition)newValue);
        return;
      case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
        setIsGetterAbstract(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.PROPERTY__IS_COMPOSITE:
        setIsComposite(((Boolean)newValue).booleanValue());
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
      case StructurePackage.PROPERTY__DEFAULT:
        set_default(_DEFAULT_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__OPPOSITE:
        setOpposite((Property)null);
        return;
      case StructurePackage.PROPERTY__IS_DERIVED:
        setIsDerived(IS_DERIVED_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__GETTER_BODY:
        setGetterBody((Expression)null);
        return;
      case StructurePackage.PROPERTY__IS_READ_ONLY:
        setIsReadOnly(IS_READ_ONLY_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__SETTER_BODY:
        setSetterBody((Expression)null);
        return;
      case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
        setIsSetterAbstract(IS_SETTER_ABSTRACT_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__IS_ID:
        setIsID(IS_ID_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__OWNING_CLASS:
        setOwningClass((ClassDefinition)null);
        return;
      case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
        setIsGetterAbstract(IS_GETTER_ABSTRACT_EDEFAULT);
        return;
      case StructurePackage.PROPERTY__IS_COMPOSITE:
        setIsComposite(IS_COMPOSITE_EDEFAULT);
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
      case StructurePackage.PROPERTY__DEFAULT:
        return _DEFAULT_EDEFAULT == null ? _default != null : !_DEFAULT_EDEFAULT.equals(_default);
      case StructurePackage.PROPERTY__OPPOSITE:
        return opposite != null;
      case StructurePackage.PROPERTY__IS_DERIVED:
        return isDerived != IS_DERIVED_EDEFAULT;
      case StructurePackage.PROPERTY__GETTER_BODY:
        return getterBody != null;
      case StructurePackage.PROPERTY__IS_READ_ONLY:
        return isReadOnly != IS_READ_ONLY_EDEFAULT;
      case StructurePackage.PROPERTY__SETTER_BODY:
        return setterBody != null;
      case StructurePackage.PROPERTY__IS_SETTER_ABSTRACT:
        return isSetterAbstract != IS_SETTER_ABSTRACT_EDEFAULT;
      case StructurePackage.PROPERTY__IS_ID:
        return isID != IS_ID_EDEFAULT;
      case StructurePackage.PROPERTY__OWNING_CLASS:
        return getOwningClass() != null;
      case StructurePackage.PROPERTY__IS_GETTER_ABSTRACT:
        return isGetterAbstract != IS_GETTER_ABSTRACT_EDEFAULT;
      case StructurePackage.PROPERTY__IS_COMPOSITE:
        return isComposite != IS_COMPOSITE_EDEFAULT;
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
    result.append(" (_default: ");
    result.append(_default);
    result.append(", isDerived: ");
    result.append(isDerived);
    result.append(", isReadOnly: ");
    result.append(isReadOnly);
    result.append(", isSetterAbstract: ");
    result.append(isSetterAbstract);
    result.append(", isID: ");
    result.append(isID);
    result.append(", isGetterAbstract: ");
    result.append(isGetterAbstract);
    result.append(", isComposite: ");
    result.append(isComposite);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
