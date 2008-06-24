/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ClassDefinitionImpl.java,v 1.1 2008-06-24 14:23:40 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllOperation <em>All Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllAttribute <em>All Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends GenericTypeDefinitionImpl implements ClassDefinition
{
  /**
   * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainedType()
   * @generated
   * @ordered
   */
  protected EList<Type> containedType;

  /**
   * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedOperation()
   * @generated
   * @ordered
   */
  protected EList<Operation> ownedOperation;

  /**
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EList<Type> superType;

  /**
   * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInv()
   * @generated
   * @ordered
   */
  protected EList<Constraint> inv;

  /**
   * The cached value of the '{@link #getAllOperation() <em>All Operation</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllOperation()
   * @generated
   * @ordered
   */
  protected EList<Operation> allOperation;

  /**
   * The cached value of the '{@link #getAllAttribute() <em>All Attribute</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllAttribute()
   * @generated
   * @ordered
   */
  protected EList<Property> allAttribute;

  /**
   * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAttribute()
   * @generated
   * @ordered
   */
  protected EList<Property> ownedAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDefinitionImpl()
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
    return StructurePackage.Literals.CLASS_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getContainedType()
  {
    if (containedType == null)
    {
      containedType = new EObjectContainmentWithInverseEList<Type>(Type.class, this, StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
    }
    return containedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOwnedOperation()
  {
    if (ownedOperation == null)
    {
      ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, StructurePackage.OPERATION__OWNING_CLASS);
    }
    return ownedOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS_DEFINITION__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getSuperType()
  {
    if (superType == null)
    {
      superType = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.CLASS_DEFINITION__SUPER_TYPE);
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getInv()
  {
    if (inv == null)
    {
      inv = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, StructurePackage.CLASS_DEFINITION__INV, StructurePackage.CONSTRAINT__INV_OWNER);
    }
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getAllOperation()
  {
    if (allOperation == null)
    {
      allOperation = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.CLASS_DEFINITION__ALL_OPERATION);
    }
    return allOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getAllAttribute()
  {
    if (allAttribute == null)
    {
      allAttribute = new EObjectResolvingEList<Property>(Property.class, this, StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE);
    }
    return allAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getOwnedAttribute()
  {
    if (ownedAttribute == null)
    {
      ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, StructurePackage.PROPERTY__OWNING_CLASS);
    }
    return ownedAttribute;
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__INV:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getInv()).basicAdd(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__INV:
        return ((InternalEList<?>)getInv()).basicRemove(otherEnd, msgs);
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return getContainedType();
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return getOwnedOperation();
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
        return getSuperType();
      case StructurePackage.CLASS_DEFINITION__INV:
        return getInv();
      case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
        return getAllOperation();
      case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
        return getAllAttribute();
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        return getOwnedAttribute();
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        getContainedType().clear();
        getContainedType().addAll((Collection<? extends Type>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        getOwnedOperation().clear();
        getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        setIsAbstract(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
        getSuperType().clear();
        getSuperType().addAll((Collection<? extends Type>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__INV:
        getInv().clear();
        getInv().addAll((Collection<? extends Constraint>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
        getAllOperation().clear();
        getAllOperation().addAll((Collection<? extends Operation>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
        getAllAttribute().clear();
        getAllAttribute().addAll((Collection<? extends Property>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        getOwnedAttribute().clear();
        getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        getContainedType().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        getOwnedOperation().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
        getSuperType().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__INV:
        getInv().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
        getAllOperation().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
        getAllAttribute().clear();
        return;
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        getOwnedAttribute().clear();
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
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return containedType != null && !containedType.isEmpty();
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return ownedOperation != null && !ownedOperation.isEmpty();
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case StructurePackage.CLASS_DEFINITION__SUPER_TYPE:
        return superType != null && !superType.isEmpty();
      case StructurePackage.CLASS_DEFINITION__INV:
        return inv != null && !inv.isEmpty();
      case StructurePackage.CLASS_DEFINITION__ALL_OPERATION:
        return allOperation != null && !allOperation.isEmpty();
      case StructurePackage.CLASS_DEFINITION__ALL_ATTRIBUTE:
        return allAttribute != null && !allAttribute.isEmpty();
      case StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE:
        return ownedAttribute != null && !ownedAttribute.isEmpty();
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
    if (baseClass == TypeContainer.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
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
    if (baseClass == TypeContainer.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE;
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
    result.append(" (isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //ClassDefinitionImpl
