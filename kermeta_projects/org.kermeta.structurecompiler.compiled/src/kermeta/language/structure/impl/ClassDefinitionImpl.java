/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassDefinitionImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EClass;
import ecore.EDataType;

import java.util.Collection;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.TypeVariable;

import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

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
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAspect <em>Is Aspect</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllOperation <em>All Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getAllAttribute <em>All Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.ClassDefinitionImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionImpl extends TraceabilityImpl<EClass> implements ClassDefinition
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
   * The default value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAspect()
   * @generated
   * @ordered
   */
  protected static final Boolean IS_ASPECT_EDEFAULT = Boolean.FALSE;

  /**
   * The cached value of the '{@link #getIsAspect() <em>Is Aspect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAspect()
   * @generated
   * @ordered
   */
  protected Boolean isAspect = IS_ASPECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameter()
   * @generated
   * @ordered
   */
  protected EList<TypeVariable> typeParameter;

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
   * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAbstract()
   * @generated
   * @ordered
   */
  protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

  /**
   * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAbstract()
   * @generated
   * @ordered
   */
  protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getEcoreDataType() <em>Ecore Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreDataType()
   * @generated
   * @ordered
   */
  protected EDataType ecoreDataType;

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
  protected org.eclipse.emf.ecore.EClass eStaticClass()
  {
    return StructurePackage.Literals.CLASS_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getIsAspect()
  {
    return isAspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAspect(Boolean newIsAspect)
  {
    Boolean oldIsAspect = isAspect;
    isAspect = newIsAspect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS_DEFINITION__IS_ASPECT, oldIsAspect, isAspect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeVariable> getTypeParameter()
  {
    if (typeParameter == null)
    {
      typeParameter = new EObjectContainmentEList.Resolving<TypeVariable>(TypeVariable.class, this, StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER);
    }
    return typeParameter;
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
      containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(Type.class, this, StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
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
      ownedOperation = new EObjectContainmentWithInverseEList.Resolving<Operation>(Operation.class, this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, StructurePackage.OPERATION__OWNING_CLASS);
    }
    return ownedOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(Boolean newIsAbstract)
  {
    Boolean oldIsAbstract = isAbstract;
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
      inv = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this, StructurePackage.CLASS_DEFINITION__INV, StructurePackage.CONSTRAINT__INV_OWNER);
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
      ownedAttribute = new EObjectContainmentWithInverseEList.Resolving<Property>(Property.class, this, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE, StructurePackage.PROPERTY__OWNING_CLASS);
    }
    return ownedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEcoreDataType()
  {
    if (ecoreDataType != null && ecoreDataType.eIsProxy())
    {
      InternalEObject oldEcoreDataType = (InternalEObject)ecoreDataType;
      ecoreDataType = (EDataType)eResolveProxy(oldEcoreDataType);
      if (ecoreDataType != oldEcoreDataType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
      }
    }
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType basicGetEcoreDataType()
  {
    return ecoreDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcoreDataType(EDataType newEcoreDataType)
  {
    EDataType oldEcoreDataType = ecoreDataType;
    ecoreDataType = newEcoreDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isMappedToJavaRawType()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_76 = false;
      idIfCond_76 = kermeta.standard.helper.BooleanWrapper.or(this.isCollection(), this.isIterator());
    
      if( idIfCond_76 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isIterator()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      result = this.isSubTypeOf("kermeta::standard::Iterator");
    
      java.lang.Boolean idIfCond_77 = false;
      idIfCond_77 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), "kermeta::standard::Iterator");
    
      if( idIfCond_77 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass1(KM2EcoreContext context)
  {
    
      kermeta.language.structure.Package p = ((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Package")));
    
      java.lang.Boolean idIfCond_78 = false;
      idIfCond_78 = this.isValueType();
    
      if( idIfCond_78 ) {
    
      java.lang.String instanceClassName = this.getEMFInstanceClassName();
    
      java.lang.Boolean idIfCond_79 = false;
      idIfCond_79 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(instanceClassName, "");
    
      if( idIfCond_79 ) {
    
      ecore.EDataType eDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EDataType"));
    
      eDataType.setName(kermeta.standard.helper.StringWrapper.plus("Java", this.getName()));
    
      eDataType.setInstanceClassName(instanceClassName);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(eDataType);
    
      this.setEcoreDataType(eDataType);
    }
     else {
    
      java.lang.Boolean idIfCond_80 = false;
      idIfCond_80 = kermeta.standard.helper.BooleanWrapper.not(this.getIsAbstract());
    
      if( idIfCond_80 ) {
    
      km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException except = ((km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.common.exception.UndefinedValueTypeInstanceClassNameException"));
    
      except.setMessage(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("The class definition: ", this.qualifiedName()), " is a ValueType, but the tag: @EMF_instanceClassName has not been correctly setted, please check this one in the *.km file that you try to load."));
    
      
    if (true)
      throw new org.kermeta.compil.runtime.helper.error.KRuntimeError( except );
    
    }
    
    }
    
    }
     else {
    
      ecore.EClass ecoreClass = this.createEcoreModelElement(context);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(p.getEcoreModelElement().getEClassifiers()).add(ecoreClass);
    
      this.setEcoreModelElement(ecoreClass);
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Property> it_ft38 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Property>convertAsOrderedSet(this.getOwnedAttribute()).iterator();
      java.lang.Boolean idLoopCond_81 = false;
      while( !idLoopCond_81 ) {
      idLoopCond_81 = it_ft38.isOff();
      if ( idLoopCond_81 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Property o = it_ft38.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Property o = o_ft38;
    
      java.lang.Boolean idIfCond_82 = false;
      idIfCond_82 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(o, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation")));
    
      if( idIfCond_82 ) {
    
      o.applyPass1(context);
    }
     else {
    
      kermeta.language.structure.Operation op = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(o, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation")));
    
      java.lang.Boolean idIfCond_83 = false;
      idIfCond_83 = kermeta.standard.helper.BooleanWrapper.not(op.isFunctionType());
    
      if( idIfCond_83 ) {
    
      op.applyPass1(context);
    }
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft39 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();
      java.lang.Boolean idLoopCond_84 = false;
      while( !idLoopCond_84 ) {
      idLoopCond_84 = it_ft39.isOff();
      if ( idLoopCond_84 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Operation o = it_ft39.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft40 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getInv()).iterator();
      java.lang.Boolean idLoopCond_85 = false;
      while( !idLoopCond_85 ) {
      idLoopCond_85 = it_ft40.isOff();
      if ( idLoopCond_85 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Constraint i = it_ft40.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft41 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();
      java.lang.Boolean idLoopCond_86 = false;
      while( !idLoopCond_86 ) {
      idLoopCond_86 = it_ft41.isOff();
      if ( idLoopCond_86 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.TypeVariable t = it_ft41.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isCollection()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      result = this.isSubTypeOf("kermeta::standard::Collection");
    
      java.lang.Boolean idIfCond_87 = false;
      idIfCond_87 = kermeta.standard.helper.StringWrapper.equals(this.qualifiedName(), "kermeta::standard::Collection");
    
      if( idIfCond_87 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass createEcoreModelElement(KM2EcoreContext context)
  {
    
    ecore.EClass result = null;
    
      ecore.EClass ecoreClass = ((ecore.EClass) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EClass"));
    
      ecoreClass.setInterface(false);
    
      ecoreClass.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getName(), context));
    
      ecoreClass.setAbstract(this.getIsAbstract());
    
      result = ecoreClass;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass2(KM2EcoreContext context)
  {
    
      this.setLinks(context);
    
      kermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isValueType()
  {
    
    java.lang.Boolean result = null;
    
      result = this.isSubTypeOf("kermeta::standard::ValueType");
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinks(KM2EcoreContext context)
  {
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft42 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();
      java.lang.Boolean idLoopCond_88 = false;
      while( !idLoopCond_88 ) {
      idLoopCond_88 = it_ft42.isOff();
      if ( idLoopCond_88 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Type t = it_ft42.next();
    
      java.lang.Boolean idIfCond_89 = false;
      idIfCond_89 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(t, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"));
    
      if( idIfCond_89 ) {
    
      kermeta.language.structure.ClassDefinition classDefinition = ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(t, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).getClassDefinitionAsTyped();
    
      java.lang.Boolean idIfCond_90 = false;
      idIfCond_90 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getEcoreModelElement()));
    
      if( idIfCond_90 ) {
    
      java.lang.Boolean idIfCond_91 = false;
      idIfCond_91 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(classDefinition.getEcoreModelElement()));
    
      if( idIfCond_91 ) {
    
      ecore.EGenericType new_eGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EGenericType"));
    
      new_eGenericType.setEClassifier(classDefinition.getEcoreModelElement());
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(this.getEcoreModelElement().getEGenericSuperTypes()).add(new_eGenericType);
    
      ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(t, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).setEcoreModelElement(new_eGenericType);
    
      ((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(t, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).setLinks(context);
    }
    
    }
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass2BehaviorJava(KM2EcoreContext context)
  {
    
      this.setLinks(context);
    
      java.lang.Boolean idIfCond_92 = false;
      idIfCond_92 = kermeta.standard.helper.BooleanWrapper.and(this.isValueType(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getName(), "Numeric"));
    
      if( idIfCond_92 ) {
    
      context.setCurrent_valueType(this);
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft43 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsOrderedSet(this.getOwnedOperation()).iterator();
      java.lang.Boolean idLoopCond_93 = false;
      while( !idLoopCond_93 ) {
      idLoopCond_93 = it_ft43.isOff();
      if ( idLoopCond_93 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Operation op = it_ft43.next();
    
      op.applyPass2BehaviorJava(context);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft44 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()).iterator();
      java.lang.Boolean idLoopCond_94 = false;
      while( !idLoopCond_94 ) {
      idLoopCond_94 = it_ft44.isOff();
      if ( idLoopCond_94 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Type t = it_ft44.next();
    
      java.lang.Boolean idIfCond_95 = false;
      idIfCond_95 = org.kermeta.compil.runtime.helper.language.TypeUtil.isInstance(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("t"));
    
      if( idIfCond_95 ) {
    
      kermeta.language.structure.Class c = null;
    
      c = (kermeta.language.structure.Class) t;
    
      kermeta.language.structure.ClassDefinition cDef = null;
    
      cDef = (kermeta.language.structure.ClassDefinition) c.getTypeDefinition();
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Operation> it_ft45 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Operation>convertAsSet(cDef.getAllOperation()).iterator();
      java.lang.Boolean idLoopCond_96 = false;
      while( !idLoopCond_96 ) {
      idLoopCond_96 = it_ft45.isOff();
      if ( idLoopCond_96 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Operation p = it_ft45.next();
    
      java.lang.Boolean idIfCond_97 = false;
      idIfCond_97 = kermeta.standard.helper.StringWrapper.equals(p.getRecopyInValueTypes(), "true");
    
      if( idIfCond_97 ) {
    
      p.applyPass2BehaviorJava(context);
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      context.setCurrent_valueType(null);
    }
     else {
    
      kermeta.language.structure.helper.ObjectSuper.super_applyPass2BehaviorJava(this, context);
    }
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<java.lang.String> it_ft46 = this.getEMFNeedProperty().iterator();
      java.lang.Boolean idLoopCond_98 = false;
      while( !idLoopCond_98 ) {
      idLoopCond_98 = it_ft46.isOff();
      if ( idLoopCond_98 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    java.lang.String emfNeedProperty = it_ft46.next();
    
      java.lang.Boolean idIfCond_99 = false;
      idIfCond_99 = kermeta.standard.helper.IntegerWrapper.isGreater(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).size(), 0);
    
      if( idIfCond_99 ) {
    
      ecore.EStructuralFeature newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EAttribute"));
    
      java.lang.Boolean idIfCond_100 = false;
      idIfCond_100 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("javaClass"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("javaClass"), ""));
    
      if( idIfCond_100 ) {
    
      newProperty = ((ecore.EAttribute) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EAttribute"));
    
      newProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("name"));
    
      newProperty.setTransient(false);
    
      ecore.EDataType newProperty_EDataType = ((ecore.EDataType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EDataType"));
    
      newProperty_EDataType.setName(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("KermetaProperty_", this.getName()), "_"), kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("name")));
    
      newProperty_EDataType.setInstanceClassName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("javaClass"));
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EClassifier>convertAsOrderedSet(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Package"))).getEcoreModelElement().getEClassifiers()).add(newProperty_EDataType);
    
      ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EGenericType"));
    
      newJavaCollection_EGenericType.setEClassifier(newProperty_EDataType);
    
      newProperty.setEGenericType(newJavaCollection_EGenericType);
    
      java.lang.Boolean idIfCond_101 = false;
      idIfCond_101 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));
    
      if( idIfCond_101 ) {
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<ecore.ETypeParameter> it_ft47 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();
      java.lang.Boolean idLoopCond_102 = false;
      while( !idLoopCond_102 ) {
      idLoopCond_102 = it_ft47.isOff();
      if ( idLoopCond_102 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    ecore.ETypeParameter etp = it_ft47.next();
    
      ecore.ETypeParameter newEtp = ((ecore.ETypeParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.ETypeParameter"));
    
      newEtp.setName(etp.getName());
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(newProperty_EDataType.getETypeParameters()).add(newEtp);
    
      ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EGenericType"));
    
      eta.setETypeParameter(etp);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_103 = false;
      idIfCond_103 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("classDefinitionQN"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("classDefinitionQN"), ""));
    
      if( idIfCond_103 ) {
    
      newProperty = ((ecore.EReference) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EReference"));
    
      newProperty.setName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("name"));
    
      newProperty.setTransient(false);
    
      ecore.EClassifier retrieved_EClassifier = context.getMu().getEClassifierByQualifiedName(kermeta.standard.helper.StringWrapper.getPropertyInfos(emfNeedProperty).getValue("classDefinitionQN"));
    
      ecore.EGenericType newJavaCollection_EGenericType = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EGenericType"));
    
      newJavaCollection_EGenericType.setEClassifier(retrieved_EClassifier);
    
      newProperty.setEGenericType(newJavaCollection_EGenericType);
    
      java.lang.Boolean idIfCond_104 = false;
      idIfCond_104 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).size(), 0));
    
      if( idIfCond_104 ) {
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<ecore.ETypeParameter> it_ft48 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.ETypeParameter>convertAsOrderedSet(this.getEcoreModelElement().getETypeParameters()).iterator();
      java.lang.Boolean idLoopCond_105 = false;
      while( !idLoopCond_105 ) {
      idLoopCond_105 = it_ft48.isOff();
      if ( idLoopCond_105 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    ecore.ETypeParameter etp = it_ft48.next();
    
      ecore.EGenericType eta = ((ecore.EGenericType) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EGenericType"));
    
      eta.setETypeParameter(etp);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EGenericType>convertAsOrderedSet(newProperty.getEGenericType().getETypeArguments()).add(eta);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    }
    
    }
     else {
    
      newProperty.setTransient(true);
    
      kermeta.language.structure.TypeDefinition retrievedTypeDef = context.getMu().getTypeDefinitionByQualifiedName("ecore::EEList");
    
      java.lang.Boolean idIfCond_106 = false;
      idIfCond_106 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"));
    
      if( idIfCond_106 ) {
    
      newProperty.setEType(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getEcoreModelElement());
    }
     else {
    
      java.lang.Boolean idIfCond_107 = false;
      idIfCond_107 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.PrimitiveType"));
    
      if( idIfCond_107 ) {
    
      newProperty.setEType(((kermeta.language.structure.PrimitiveType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(retrievedTypeDef, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.PrimitiveType"))).getEcoreModelElement());
    }
    
    }
    
    }
    
    }
    
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EStructuralFeature>convertAsOrderedSet(((ecore.EClass) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getEcoreModelElement(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("ecore.EClass"))).getEStructuralFeatures()).add(newProperty);
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set<Type> allSuperTypes()
  {
    
    kermeta.standard.Set<kermeta.language.structure.Type> result = null;
    
      kermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));
    
      kermeta.standard.Set<kermeta.language.structure.Type> superClasses = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));
    
      superClasses.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getSuperType()));
    
      
      kermeta.standard.helper.BooleanWrapper.not(superClasses.isEmpty());
      java.lang.Boolean idLoopCond_108 = false;
      while( !idLoopCond_108 ) {
      idLoopCond_108 = superClasses.isEmpty();
      if ( idLoopCond_108 ) {
      } else {
    
      allSuperClasses.addAll(superClasses);
    
      kermeta.standard.Set<kermeta.language.structure.Type> temp = ((kermeta.standard.Set<kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.Set<kermeta.language.structure.Type>"));
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft49 = superClasses.iterator();
      java.lang.Boolean idLoopCond_109 = false;
      while( !idLoopCond_109 ) {
      idLoopCond_109 = it_ft49.isOff();
      if ( idLoopCond_109 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Type s = it_ft49.next();
    
      java.lang.Boolean idIfCond_110 = false;
      idIfCond_110 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(s, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(s, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition")));
    
      if( idIfCond_110 ) {
    
      temp.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(s, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"))).getTypeDefinition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getSuperType()));
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      superClasses.clear();
    
      superClasses.addAll(temp);
    }
      }
    
      result = allSuperClasses;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isSubTypeOf(String superType_qualifiedName)
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      kermeta.language.structure.Type res = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Type result_ft50 = null;
    
      kermeta.language.structure.Type elem_ft50 = null;
    
      result_ft50 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft50 = this.allSuperTypes().iterator();
      java.lang.Boolean idLoopCond_111 = false;
      while( !idLoopCond_111 ) {
      idLoopCond_111 = kermeta.standard.helper.BooleanWrapper.or(it_ft50.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft50, null));
      if ( idLoopCond_111 ) {
      } else {
    
      elem_ft50 = it_ft50.next();
    
      java.lang.Boolean idIfCond_112 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Type st = elem_ft50;
    
      idIfCond_112 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(st, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType")), kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ParameterizedType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(st, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ParameterizedType"))).getTypeDefinition().qualifiedName(), superType_qualifiedName));
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_112 ) {
    
      result_ft50 = elem_ft50;
    }
    
    }
      }
    }
    
    
    //callElement
    res = result_ft50;
    //End of the Inlining of the function type: detect
    
    
      java.lang.Boolean idIfCond_113 = false;
      idIfCond_113 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(res));
    
      if( idIfCond_113 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String qualifiedName()
  {
    
    java.lang.String result = null;
    
      kermeta.language.structure.NamedElement elem = this;
    
      result = this.getName();
    
      java.lang.Boolean idIfCond_275 = false;
      idIfCond_275 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.NamedElement"));
    
      if( idIfCond_275 ) {
    
      
      elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem);
      java.lang.Boolean idLoopCond_276 = false;
      while( !idLoopCond_276 ) {
      idLoopCond_276 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(elem, null);
      if ( idLoopCond_276 ) {
      } else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(elem.getName(), "::"), result);
    
      java.lang.Boolean idIfCond_277 = false;
      idIfCond_277 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.NamedElement"));
    
      if( idIfCond_277 ) {
    
      elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(elem);
    }
     else {
    
      elem = null;
    }
    
    }
      }
    }
    
    
    return result;
    
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
      case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
        return ((InternalEList<?>)getTypeParameter()).basicRemove(otherEnd, msgs);
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
      case StructurePackage.CLASS_DEFINITION__NAME:
        return getName();
      case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
        return getIsAspect();
      case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
        return getTypeParameter();
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return getContainedType();
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return getOwnedOperation();
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        return getIsAbstract();
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
      case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
        if (resolve) return getEcoreDataType();
        return basicGetEcoreDataType();
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
      case StructurePackage.CLASS_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
        setIsAspect((Boolean)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
        getTypeParameter().clear();
        getTypeParameter().addAll((Collection<? extends TypeVariable>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        getContainedType().clear();
        getContainedType().addAll((Collection<? extends Type>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        getOwnedOperation().clear();
        getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
        return;
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
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
      case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)newValue);
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
      case StructurePackage.CLASS_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
        setIsAspect(IS_ASPECT_EDEFAULT);
        return;
      case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
        getTypeParameter().clear();
        return;
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
      case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
        setEcoreDataType((EDataType)null);
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
      case StructurePackage.CLASS_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StructurePackage.CLASS_DEFINITION__IS_ASPECT:
        return IS_ASPECT_EDEFAULT == null ? isAspect != null : !IS_ASPECT_EDEFAULT.equals(isAspect);
      case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER:
        return typeParameter != null && !typeParameter.isEmpty();
      case StructurePackage.CLASS_DEFINITION__CONTAINED_TYPE:
        return containedType != null && !containedType.isEmpty();
      case StructurePackage.CLASS_DEFINITION__OWNED_OPERATION:
        return ownedOperation != null && !ownedOperation.isEmpty();
      case StructurePackage.CLASS_DEFINITION__IS_ABSTRACT:
        return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
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
      case StructurePackage.CLASS_DEFINITION__ECORE_DATA_TYPE:
        return ecoreDataType != null;
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
        case StructurePackage.CLASS_DEFINITION__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypeDefinition.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.CLASS_DEFINITION__IS_ASPECT: return StructurePackage.TYPE_DEFINITION__IS_ASPECT;
        default: return -1;
      }
    }
    if (baseClass == GenericTypeDefinition.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER: return StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER;
        default: return -1;
      }
    }
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
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.CLASS_DEFINITION__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypeDefinition.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.TYPE_DEFINITION__IS_ASPECT: return StructurePackage.CLASS_DEFINITION__IS_ASPECT;
        default: return -1;
      }
    }
    if (baseClass == GenericTypeDefinition.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.GENERIC_TYPE_DEFINITION__TYPE_PARAMETER: return StructurePackage.CLASS_DEFINITION__TYPE_PARAMETER;
        default: return -1;
      }
    }
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
    result.append(" (name: ");
    result.append(name);
    result.append(", isAspect: ");
    result.append(isAspect);
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //ClassDefinitionImpl
