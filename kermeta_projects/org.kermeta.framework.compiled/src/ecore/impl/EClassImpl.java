/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: EClassImpl.java,v 1.1 2008-06-24 14:23:19 cfaucher Exp $
 */
package ecore.impl;

import ecore.EAttribute;
import ecore.EClass;
import ecore.EGenericType;
import ecore.EOperation;
import ecore.EReference;
import ecore.EStructuralFeature;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecore.impl.EClassImpl#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#is_abstract <em>abstract</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#is_interface <em>interface</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link ecore.impl.EClassImpl#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassImpl extends EClassifierImpl implements EClass
{
  /**
   * The cached value of the '{@link #getEStructuralFeatures() <em>EStructural Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEStructuralFeatures()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeature> eStructuralFeatures;

  /**
   * The default value of the '{@link #is_abstract() <em>abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_abstract()
   * @generated
   * @ordered
   */
  protected static final boolean _ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #is_abstract() <em>abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_abstract()
   * @generated
   * @ordered
   */
  protected boolean _abstract = _ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEOperations()
   * @generated
   * @ordered
   */
  protected EList<EOperation> eOperations;

  /**
   * The cached value of the '{@link #getEAllAttributes() <em>EAll Attributes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllAttributes()
   * @generated
   * @ordered
   */
  protected EList<EAttribute> eAllAttributes;

  /**
   * The default value of the '{@link #is_interface() <em>interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_interface()
   * @generated
   * @ordered
   */
  protected static final boolean _INTERFACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #is_interface() <em>interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #is_interface()
   * @generated
   * @ordered
   */
  protected boolean _interface = _INTERFACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEReferences() <em>EReferences</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEReferences()
   * @generated
   * @ordered
   */
  protected EList<EReference> eReferences;

  /**
   * The cached value of the '{@link #getEAllReferences() <em>EAll References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllReferences()
   * @generated
   * @ordered
   */
  protected EList<EReference> eAllReferences;

  /**
   * The cached value of the '{@link #getESuperTypes() <em>ESuper Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getESuperTypes()
   * @generated
   * @ordered
   */
  protected EList<EClass> eSuperTypes;

  /**
   * The cached value of the '{@link #getEAllContainments() <em>EAll Containments</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllContainments()
   * @generated
   * @ordered
   */
  protected EList<EReference> eAllContainments;

  /**
   * The cached value of the '{@link #getEGenericSuperTypes() <em>EGeneric Super Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEGenericSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<EGenericType> eGenericSuperTypes;

  /**
   * The cached value of the '{@link #getEAllGenericSuperTypes() <em>EAll Generic Super Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllGenericSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<EGenericType> eAllGenericSuperTypes;

  /**
   * The cached value of the '{@link #getEAttributes() <em>EAttributes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAttributes()
   * @generated
   * @ordered
   */
  protected EList<EAttribute> eAttributes;

  /**
   * The cached value of the '{@link #getEIDAttribute() <em>EID Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEIDAttribute()
   * @generated
   * @ordered
   */
  protected EAttribute eIDAttribute;

  /**
   * The cached value of the '{@link #getEAllOperations() <em>EAll Operations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllOperations()
   * @generated
   * @ordered
   */
  protected EList<EOperation> eAllOperations;

  /**
   * The cached value of the '{@link #getEAllStructuralFeatures() <em>EAll Structural Features</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllStructuralFeatures()
   * @generated
   * @ordered
   */
  protected EList<EStructuralFeature> eAllStructuralFeatures;

  /**
   * The cached value of the '{@link #getEAllSuperTypes() <em>EAll Super Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEAllSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<EClass> eAllSuperTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected org.eclipse.emf.ecore.EClass eStaticClass()
  {
    return EcorePackage.Literals.ECLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EStructuralFeature> getEStructuralFeatures()
  {
    if (eStructuralFeatures == null)
    {
      eStructuralFeatures = new EObjectContainmentWithInverseEList<EStructuralFeature>(EStructuralFeature.class, this, EcorePackage.ECLASS__ESTRUCTURAL_FEATURES, EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
    }
    return eStructuralFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean is_abstract()
  {
    return _abstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_abstract(boolean new_abstract)
  {
    boolean old_abstract = _abstract;
    _abstract = new_abstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ECLASS__ABSTRACT, old_abstract, _abstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EOperation> getEOperations()
  {
    if (eOperations == null)
    {
      eOperations = new EObjectContainmentWithInverseEList<EOperation>(EOperation.class, this, EcorePackage.ECLASS__EOPERATIONS, EcorePackage.EOPERATION__ECONTAINING_CLASS);
    }
    return eOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAttribute> getEAllAttributes()
  {
    if (eAllAttributes == null)
    {
      eAllAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, EcorePackage.ECLASS__EALL_ATTRIBUTES);
    }
    return eAllAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean is_interface()
  {
    return _interface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_interface(boolean new_interface)
  {
    boolean old_interface = _interface;
    _interface = new_interface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ECLASS__INTERFACE, old_interface, _interface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReference> getEReferences()
  {
    if (eReferences == null)
    {
      eReferences = new EObjectResolvingEList<EReference>(EReference.class, this, EcorePackage.ECLASS__EREFERENCES);
    }
    return eReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReference> getEAllReferences()
  {
    if (eAllReferences == null)
    {
      eAllReferences = new EObjectResolvingEList<EReference>(EReference.class, this, EcorePackage.ECLASS__EALL_REFERENCES);
    }
    return eAllReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EClass> getESuperTypes()
  {
    if (eSuperTypes == null)
    {
      eSuperTypes = new EObjectResolvingEList<EClass>(EClass.class, this, EcorePackage.ECLASS__ESUPER_TYPES);
    }
    return eSuperTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReference> getEAllContainments()
  {
    if (eAllContainments == null)
    {
      eAllContainments = new EObjectResolvingEList<EReference>(EReference.class, this, EcorePackage.ECLASS__EALL_CONTAINMENTS);
    }
    return eAllContainments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGenericType> getEGenericSuperTypes()
  {
    if (eGenericSuperTypes == null)
    {
      eGenericSuperTypes = new EObjectContainmentEList<EGenericType>(EGenericType.class, this, EcorePackage.ECLASS__EGENERIC_SUPER_TYPES);
    }
    return eGenericSuperTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGenericType> getEAllGenericSuperTypes()
  {
    if (eAllGenericSuperTypes == null)
    {
      eAllGenericSuperTypes = new EObjectResolvingEList<EGenericType>(EGenericType.class, this, EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES);
    }
    return eAllGenericSuperTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAttribute> getEAttributes()
  {
    if (eAttributes == null)
    {
      eAttributes = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, EcorePackage.ECLASS__EATTRIBUTES);
    }
    return eAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEIDAttribute()
  {
    if (eIDAttribute != null && eIDAttribute.eIsProxy())
    {
      InternalEObject oldEIDAttribute = (InternalEObject)eIDAttribute;
      eIDAttribute = (EAttribute)eResolveProxy(oldEIDAttribute);
      if (eIDAttribute != oldEIDAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.ECLASS__EID_ATTRIBUTE, oldEIDAttribute, eIDAttribute));
      }
    }
    return eIDAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetEIDAttribute()
  {
    return eIDAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEIDAttribute(EAttribute newEIDAttribute)
  {
    EAttribute oldEIDAttribute = eIDAttribute;
    eIDAttribute = newEIDAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ECLASS__EID_ATTRIBUTE, oldEIDAttribute, eIDAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EOperation> getEAllOperations()
  {
    if (eAllOperations == null)
    {
      eAllOperations = new EObjectResolvingEList<EOperation>(EOperation.class, this, EcorePackage.ECLASS__EALL_OPERATIONS);
    }
    return eAllOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EStructuralFeature> getEAllStructuralFeatures()
  {
    if (eAllStructuralFeatures == null)
    {
      eAllStructuralFeatures = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES);
    }
    return eAllStructuralFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EClass> getEAllSuperTypes()
  {
    if (eAllSuperTypes == null)
    {
      eAllSuperTypes = new EObjectResolvingEList<EClass>(EClass.class, this, EcorePackage.ECLASS__EALL_SUPER_TYPES);
    }
    return eAllSuperTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFeatureID(EStructuralFeature feature)
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
  public EStructuralFeature getEStructuralFeature(String featureName)
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
  public boolean isSuperTypeOf(EClass someClass)
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
  public int getFeatureCount()
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
  public EStructuralFeature op_getEStructuralFeature(int featureID)
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
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEStructuralFeatures()).basicAdd(otherEnd, msgs);
      case EcorePackage.ECLASS__EOPERATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEOperations()).basicAdd(otherEnd, msgs);
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
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        return ((InternalEList<?>)getEStructuralFeatures()).basicRemove(otherEnd, msgs);
      case EcorePackage.ECLASS__EOPERATIONS:
        return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
      case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
        return ((InternalEList<?>)getEGenericSuperTypes()).basicRemove(otherEnd, msgs);
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
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        return getEStructuralFeatures();
      case EcorePackage.ECLASS__ABSTRACT:
        return is_abstract() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ECLASS__EOPERATIONS:
        return getEOperations();
      case EcorePackage.ECLASS__EALL_ATTRIBUTES:
        return getEAllAttributes();
      case EcorePackage.ECLASS__INTERFACE:
        return is_interface() ? Boolean.TRUE : Boolean.FALSE;
      case EcorePackage.ECLASS__EREFERENCES:
        return getEReferences();
      case EcorePackage.ECLASS__EALL_REFERENCES:
        return getEAllReferences();
      case EcorePackage.ECLASS__ESUPER_TYPES:
        return getESuperTypes();
      case EcorePackage.ECLASS__EALL_CONTAINMENTS:
        return getEAllContainments();
      case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
        return getEGenericSuperTypes();
      case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
        return getEAllGenericSuperTypes();
      case EcorePackage.ECLASS__EATTRIBUTES:
        return getEAttributes();
      case EcorePackage.ECLASS__EID_ATTRIBUTE:
        if (resolve) return getEIDAttribute();
        return basicGetEIDAttribute();
      case EcorePackage.ECLASS__EALL_OPERATIONS:
        return getEAllOperations();
      case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
        return getEAllStructuralFeatures();
      case EcorePackage.ECLASS__EALL_SUPER_TYPES:
        return getEAllSuperTypes();
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
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        getEStructuralFeatures().clear();
        getEStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
        return;
      case EcorePackage.ECLASS__ABSTRACT:
        set_abstract(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ECLASS__EOPERATIONS:
        getEOperations().clear();
        getEOperations().addAll((Collection<? extends EOperation>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_ATTRIBUTES:
        getEAllAttributes().clear();
        getEAllAttributes().addAll((Collection<? extends EAttribute>)newValue);
        return;
      case EcorePackage.ECLASS__INTERFACE:
        set_interface(((Boolean)newValue).booleanValue());
        return;
      case EcorePackage.ECLASS__EREFERENCES:
        getEReferences().clear();
        getEReferences().addAll((Collection<? extends EReference>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_REFERENCES:
        getEAllReferences().clear();
        getEAllReferences().addAll((Collection<? extends EReference>)newValue);
        return;
      case EcorePackage.ECLASS__ESUPER_TYPES:
        getESuperTypes().clear();
        getESuperTypes().addAll((Collection<? extends EClass>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_CONTAINMENTS:
        getEAllContainments().clear();
        getEAllContainments().addAll((Collection<? extends EReference>)newValue);
        return;
      case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
        getEGenericSuperTypes().clear();
        getEGenericSuperTypes().addAll((Collection<? extends EGenericType>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
        getEAllGenericSuperTypes().clear();
        getEAllGenericSuperTypes().addAll((Collection<? extends EGenericType>)newValue);
        return;
      case EcorePackage.ECLASS__EATTRIBUTES:
        getEAttributes().clear();
        getEAttributes().addAll((Collection<? extends EAttribute>)newValue);
        return;
      case EcorePackage.ECLASS__EID_ATTRIBUTE:
        setEIDAttribute((EAttribute)newValue);
        return;
      case EcorePackage.ECLASS__EALL_OPERATIONS:
        getEAllOperations().clear();
        getEAllOperations().addAll((Collection<? extends EOperation>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
        getEAllStructuralFeatures().clear();
        getEAllStructuralFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
        return;
      case EcorePackage.ECLASS__EALL_SUPER_TYPES:
        getEAllSuperTypes().clear();
        getEAllSuperTypes().addAll((Collection<? extends EClass>)newValue);
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
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        getEStructuralFeatures().clear();
        return;
      case EcorePackage.ECLASS__ABSTRACT:
        set_abstract(_ABSTRACT_EDEFAULT);
        return;
      case EcorePackage.ECLASS__EOPERATIONS:
        getEOperations().clear();
        return;
      case EcorePackage.ECLASS__EALL_ATTRIBUTES:
        getEAllAttributes().clear();
        return;
      case EcorePackage.ECLASS__INTERFACE:
        set_interface(_INTERFACE_EDEFAULT);
        return;
      case EcorePackage.ECLASS__EREFERENCES:
        getEReferences().clear();
        return;
      case EcorePackage.ECLASS__EALL_REFERENCES:
        getEAllReferences().clear();
        return;
      case EcorePackage.ECLASS__ESUPER_TYPES:
        getESuperTypes().clear();
        return;
      case EcorePackage.ECLASS__EALL_CONTAINMENTS:
        getEAllContainments().clear();
        return;
      case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
        getEGenericSuperTypes().clear();
        return;
      case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
        getEAllGenericSuperTypes().clear();
        return;
      case EcorePackage.ECLASS__EATTRIBUTES:
        getEAttributes().clear();
        return;
      case EcorePackage.ECLASS__EID_ATTRIBUTE:
        setEIDAttribute((EAttribute)null);
        return;
      case EcorePackage.ECLASS__EALL_OPERATIONS:
        getEAllOperations().clear();
        return;
      case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
        getEAllStructuralFeatures().clear();
        return;
      case EcorePackage.ECLASS__EALL_SUPER_TYPES:
        getEAllSuperTypes().clear();
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
      case EcorePackage.ECLASS__ESTRUCTURAL_FEATURES:
        return eStructuralFeatures != null && !eStructuralFeatures.isEmpty();
      case EcorePackage.ECLASS__ABSTRACT:
        return _abstract != _ABSTRACT_EDEFAULT;
      case EcorePackage.ECLASS__EOPERATIONS:
        return eOperations != null && !eOperations.isEmpty();
      case EcorePackage.ECLASS__EALL_ATTRIBUTES:
        return eAllAttributes != null && !eAllAttributes.isEmpty();
      case EcorePackage.ECLASS__INTERFACE:
        return _interface != _INTERFACE_EDEFAULT;
      case EcorePackage.ECLASS__EREFERENCES:
        return eReferences != null && !eReferences.isEmpty();
      case EcorePackage.ECLASS__EALL_REFERENCES:
        return eAllReferences != null && !eAllReferences.isEmpty();
      case EcorePackage.ECLASS__ESUPER_TYPES:
        return eSuperTypes != null && !eSuperTypes.isEmpty();
      case EcorePackage.ECLASS__EALL_CONTAINMENTS:
        return eAllContainments != null && !eAllContainments.isEmpty();
      case EcorePackage.ECLASS__EGENERIC_SUPER_TYPES:
        return eGenericSuperTypes != null && !eGenericSuperTypes.isEmpty();
      case EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES:
        return eAllGenericSuperTypes != null && !eAllGenericSuperTypes.isEmpty();
      case EcorePackage.ECLASS__EATTRIBUTES:
        return eAttributes != null && !eAttributes.isEmpty();
      case EcorePackage.ECLASS__EID_ATTRIBUTE:
        return eIDAttribute != null;
      case EcorePackage.ECLASS__EALL_OPERATIONS:
        return eAllOperations != null && !eAllOperations.isEmpty();
      case EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES:
        return eAllStructuralFeatures != null && !eAllStructuralFeatures.isEmpty();
      case EcorePackage.ECLASS__EALL_SUPER_TYPES:
        return eAllSuperTypes != null && !eAllSuperTypes.isEmpty();
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
    result.append(" (_abstract: ");
    result.append(_abstract);
    result.append(", _interface: ");
    result.append(_interface);
    result.append(')');
    return result.toString();
  }

} //EClassImpl
