/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: ModelTypeImpl.java,v 1.1 2008-07-02 09:13:17 ftanguy Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.Model;
import kermeta.language.structure.ModelType;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#isIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeImpl#getIncludedTypeDefinition <em>Included Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends TypeImpl implements ModelType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIsAspect() <em>Is Aspect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAspect()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ASPECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAspect() <em>Is Aspect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAspect()
   * @generated
   * @ordered
   */
  protected boolean isAspect = IS_ASPECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludedTypeDefinition() <em>Included Type Definition</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedTypeDefinition()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> includedTypeDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelTypeImpl()
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
    return StructurePackage.Literals.MODEL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAspect()
  {
    return isAspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAspect(boolean newIsAspect)
  {
    boolean oldIsAspect = isAspect;
    isAspect = newIsAspect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.MODEL_TYPE__IS_ASPECT, oldIsAspect, isAspect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDefinition> getIncludedTypeDefinition()
  {
    if (includedTypeDefinition == null)
    {
      includedTypeDefinition = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION);
    }
    return includedTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model _new()
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
  public boolean isModelTypeOf(Model m)
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
  public String qualifiedName()
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
      case StructurePackage.MODEL_TYPE__NAME:
        return getName();
      case StructurePackage.MODEL_TYPE__IS_ASPECT:
        return isIsAspect() ? Boolean.TRUE : Boolean.FALSE;
      case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
        return getIncludedTypeDefinition();
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
      case StructurePackage.MODEL_TYPE__NAME:
        setName((String)newValue);
        return;
      case StructurePackage.MODEL_TYPE__IS_ASPECT:
        setIsAspect(((Boolean)newValue).booleanValue());
        return;
      case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
        getIncludedTypeDefinition().clear();
        getIncludedTypeDefinition().addAll((Collection<? extends TypeDefinition>)newValue);
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
      case StructurePackage.MODEL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StructurePackage.MODEL_TYPE__IS_ASPECT:
        setIsAspect(IS_ASPECT_EDEFAULT);
        return;
      case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
        getIncludedTypeDefinition().clear();
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
      case StructurePackage.MODEL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StructurePackage.MODEL_TYPE__IS_ASPECT:
        return isAspect != IS_ASPECT_EDEFAULT;
      case StructurePackage.MODEL_TYPE__INCLUDED_TYPE_DEFINITION:
        return includedTypeDefinition != null && !includedTypeDefinition.isEmpty();
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
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.MODEL_TYPE__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypeDefinition.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.MODEL_TYPE__IS_ASPECT: return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
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
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.MODEL_TYPE__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypeDefinition.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.TYPE_DEFINITION__IS_ASPECT: return StructurePackage.MODEL_TYPE__IS_ASPECT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", isAspect: ");
    result.append(isAspect);
    result.append(')');
    return result.toString();
  }

} //ModelTypeImpl
