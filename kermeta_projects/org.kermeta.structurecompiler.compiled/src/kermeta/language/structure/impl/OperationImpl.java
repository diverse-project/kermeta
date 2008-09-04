/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import ecore.EOperation;

import java.util.Collection;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeVariable;
import kermeta.language.structure.TypedElement;

import kermeta.standard.Sequence;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getSuperOperation <em>Super Operation</em>}</li>
 *   <li>{@link kermeta.language.structure.impl.OperationImpl#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends TraceabilityImpl<EOperation> implements Operation
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsOrdered()
   * @generated
   * @ordered
   */
  protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

  /**
   * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsOrdered()
   * @generated
   * @ordered
   */
  protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final Integer UPPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected Integer upper = UPPER_EDEFAULT;

  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final Integer LOWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected Integer lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsUnique()
   * @generated
   * @ordered
   */
  protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.FALSE;

  /**
   * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsUnique()
   * @generated
   * @ordered
   */
  protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameter()
   * @generated
   * @ordered
   */
  protected EList<TypeVariable> typeParameter;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Expression body;

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
   * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> ownedParameter;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected EList<Constraint> post;

  /**
   * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaisedException()
   * @generated
   * @ordered
   */
  protected EList<Type> raisedException;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected EList<Constraint> pre;

  /**
   * The cached value of the '{@link #getSuperOperation() <em>Super Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperOperation()
   * @generated
   * @ordered
   */
  protected Operation superOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return StructurePackage.Literals.OPERATION;
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
      containedType = new EObjectContainmentWithInverseEList.Resolving<Type>(Type.class, this, StructurePackage.OPERATION__CONTAINED_TYPE, StructurePackage.TYPE__TYPE_CONTAINER);
    }
    return containedType;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OPERATION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getIsOrdered()
  {
    return isOrdered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOrdered(Boolean newIsOrdered)
  {
    Boolean oldIsOrdered = isOrdered;
    isOrdered = newIsOrdered;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__IS_ORDERED, oldIsOrdered, isOrdered));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(Integer newUpper)
  {
    Integer oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__UPPER, oldUpper, upper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(Integer newLower)
  {
    Integer oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getIsUnique()
  {
    return isUnique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsUnique(Boolean newIsUnique)
  {
    Boolean oldIsUnique = isUnique;
    isUnique = newIsUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__IS_UNIQUE, oldIsUnique, isUnique));
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
      typeParameter = new EObjectResolvingEList<TypeVariable>(TypeVariable.class, this, StructurePackage.OPERATION__TYPE_PARAMETER);
    }
    return typeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBody()
  {
    if (body != null && body.eIsProxy())
    {
      InternalEObject oldBody = (InternalEObject)body;
      body = (Expression)eResolveProxy(oldBody);
      if (body != oldBody)
      {
        InternalEObject newBody = (InternalEObject)body;
        NotificationChain msgs = oldBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, null);
        if (newBody.eInternalContainer() == null)
        {
          msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OPERATION__BODY, oldBody, body));
      }
    }
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs)
  {
    Expression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Expression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OPERATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__BODY, newBody, newBody));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getOwnedParameter()
  {
    if (ownedParameter == null)
    {
      ownedParameter = new EObjectContainmentWithInverseEList.Resolving<Parameter>(Parameter.class, this, StructurePackage.OPERATION__OWNED_PARAMETER, StructurePackage.PARAMETER__OPERATION);
    }
    return ownedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getPost()
  {
    if (post == null)
    {
      post = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this, StructurePackage.OPERATION__POST, StructurePackage.CONSTRAINT__POST_OWNER);
    }
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getRaisedException()
  {
    if (raisedException == null)
    {
      raisedException = new EObjectResolvingEList<Type>(Type.class, this, StructurePackage.OPERATION__RAISED_EXCEPTION);
    }
    return raisedException;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getPre()
  {
    if (pre == null)
    {
      pre = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this, StructurePackage.OPERATION__PRE, StructurePackage.CONSTRAINT__PRE_OWNER);
    }
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getSuperOperation()
  {
    if (superOperation != null && superOperation.eIsProxy())
    {
      InternalEObject oldSuperOperation = (InternalEObject)superOperation;
      superOperation = (Operation)eResolveProxy(oldSuperOperation);
      if (superOperation != oldSuperOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.OPERATION__SUPER_OPERATION, oldSuperOperation, superOperation));
      }
    }
    return superOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetSuperOperation()
  {
    return superOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperOperation(Operation newSuperOperation)
  {
    Operation oldSuperOperation = superOperation;
    superOperation = newSuperOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__SUPER_OPERATION, oldSuperOperation, superOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition getOwningClass()
  {
    if (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS) return null;
    return (ClassDefinition)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition basicGetOwningClass()
  {
    if (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS) return null;
    return (ClassDefinition)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningClass(ClassDefinition newOwningClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningClass, StructurePackage.OPERATION__OWNING_CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningClass(ClassDefinition newOwningClass)
  {
    if (newOwningClass != eInternalContainer() || (eContainerFeatureID != StructurePackage.OPERATION__OWNING_CLASS && newOwningClass != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningClass != null)
        msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
      msgs = basicSetOwningClass(newOwningClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OPERATION__OWNING_CLASS, newOwningClass, newOwningClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isRunnable()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      kermeta.language.structure.Parameter param = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Parameter result_ft51 = null;
    
      kermeta.language.structure.Parameter elem_ft51 = null;
    
      result_ft51 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft51 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_114 = false;
      while( !idLoopCond_114 ) {
      idLoopCond_114 = kermeta.standard.helper.BooleanWrapper.or(it_ft51.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft51, null));
      if ( idLoopCond_114 ) {
      } else {
    
      elem_ft51 = it_ft51.next();
    
      java.lang.Boolean idIfCond_115 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Parameter param = elem_ft51;
    
      idIfCond_115 = kermeta.standard.helper.BooleanWrapper.not(param.isRunnable());
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_115 ) {
    
      result_ft51 = elem_ft51;
    }
    
    }
      }
    }
    
    
    //callElement
    param = result_ft51;
    //End of the Inlining of the function type: detect
    
    
      java.lang.Boolean idIfCond_116 = false;
      idIfCond_116 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(param);
    
      if( idIfCond_116 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createBehaviorJava(KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = null;
    
      kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.utils.StringBuffer"));
    
      java.lang.Boolean idIfCond_117 = false;
      idIfCond_117 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getBody()));
    
      if( idIfCond_117 ) {
    
      java.lang.String type_label = "";
    
      java.lang.Boolean idIfCond_118 = false;
      idIfCond_118 = context.getFtSuffixActivation();
    
      if( idIfCond_118 ) {
    
      type_label = context.getFtReturnType();
    
      context.setFtReturnType("");
    }
     else {
    
      type_label = ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.kermeta.CompilerHelperJava")).ppTypeFromMultiplicityElement(this, context);
    }
    
    
      java.lang.Boolean idIfCond_119 = false;
      idIfCond_119 = kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label));
    
      if( idIfCond_119 ) {
    
      javaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("\n", type_label), " result"), context.printFtSuffix()), " = null;\n"));
    }
    
    
      javaCode.append(this.getBody().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_120 = false;
      idIfCond_120 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isVoidType(type_label)), kermeta.standard.helper.BooleanWrapper.not(context.getFtSuffixActivation()));
    
      if( idIfCond_120 ) {
    
      javaCode.append(this.ppReturnResult(context));
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_121 = false;
      idIfCond_121 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(this.getType().getTypeQName()));
    
      if( idIfCond_121 ) {
    
      javaCode.append(kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.kermeta.CompilerHelperJava")).ppTypeFromMultiplicityElement(this, context), " result = null;\n"));
    
      javaCode.append(this.ppReturnResult(context));
    }
    
    }
    
    
      java.lang.Boolean idIfCond_122 = false;
      idIfCond_122 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(context.getTasks_stack().peek(), "FunctionType_Compilation"), org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType()));
    
      if( idIfCond_122 ) {
    
      ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.ecore.EAnnotationHelper")).addAnnotationGenModelImpl(this.getEcoreModelElement(), javaCode.toString());
    }
    
    
      result = javaCode.toString();
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean mustBeCompiled()
  {
    
    java.lang.Boolean result = null;
    
      result = true;
    
      kermeta.language.structure.ClassDefinition cd_container = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition")));
    
      java.lang.Boolean idIfCond_123 = false;
      idIfCond_123 = cd_container.isValueType();
    
      if( idIfCond_123 ) {
    
      java.lang.Boolean idIfCond_124 = false;
      idIfCond_124 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(cd_container.getEMFInstanceClassName(), "");
    
      if( idIfCond_124 ) {
    
      result = false;
    }
    
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptimizedStaticCall(KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = "";
    
      java.lang.Boolean idIfCond_125 = false;
      idIfCond_125 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"));
    
      if( idIfCond_125 ) {
    
      java.lang.Boolean idIfCond_126 = false;
      idIfCond_126 = kermeta.standard.helper.IntegerWrapper.equals(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()).size(), 1);
    
      if( idIfCond_126 ) {
    
      java.lang.Boolean idIfCond_127 = false;
      idIfCond_127 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.JavaStaticCall"));
    
      if( idIfCond_127 ) {
    
      kermeta.standard.OrderedSet<java.lang.String> static_call_set_1 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.JavaStaticCall"))).createBehaviorJava(context), "(");
    
      result = static_call_set_1.one();
    }
     else {
    
      java.lang.Boolean idIfCond_128 = false;
      idIfCond_128 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"));
    
      if( idIfCond_128 ) {
    
      java.lang.Boolean idIfCond_129 = false;
      idIfCond_129 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.JavaStaticCall"));
    
      if( idIfCond_129 ) {
    
      kermeta.standard.OrderedSet<java.lang.String> static_call_set_2 = kermeta.standard.helper.StringWrapper.split(((kermeta.language.behavior.JavaStaticCall) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.Block) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getBody(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block"))).getStatement()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment"))).getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.JavaStaticCall"))).createBehaviorJava(context), "(");
    
      result = static_call_set_2.one();
    }
    
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
  public void applyPass1(KM2EcoreContext context)
  {
    
      ecore.EOperation ecoreOperation = this.createEcoreModelElement(context);
    
      kermeta.language.structure.ClassDefinition c = null;
    
      c = (kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EOperation>convertAsOrderedSet(c.getEcoreModelElement().getEOperations()).add(ecoreOperation);
    
      this.setEcoreModelElement(ecoreOperation);
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft53 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_130 = false;
      while( !idLoopCond_130 ) {
      idLoopCond_130 = it_ft53.isOff();
      if ( idLoopCond_130 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter o = it_ft53.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter o = o_ft53;
    
      o.applyPass1(context);
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft54 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPre()).iterator();
      java.lang.Boolean idLoopCond_131 = false;
      while( !idLoopCond_131 ) {
      idLoopCond_131 = it_ft54.isOff();
      if ( idLoopCond_131 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Constraint o = it_ft54.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Constraint> it_ft55 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Constraint>convertAsOrderedSet(this.getPost()).iterator();
      java.lang.Boolean idLoopCond_132 = false;
      while( !idLoopCond_132 ) {
      idLoopCond_132 = it_ft55.isOff();
      if ( idLoopCond_132 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Constraint o = it_ft55.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.TypeVariable> it_ft56 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getTypeParameter()).iterator();
      java.lang.Boolean idLoopCond_133 = false;
      while( !idLoopCond_133 ) {
      idLoopCond_133 = it_ft56.isOff();
      if ( idLoopCond_133 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.TypeVariable t = it_ft56.next();
    
      func;
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass2(KM2EcoreContext context)
  {
    
      java.lang.Boolean idIfCond_134 = false;
      idIfCond_134 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());
    
      if( idIfCond_134 ) {
    
      this.setLinks(context);
    
      kermeta.language.structure.helper.ObjectSuper.super_applyPass2(this, context);
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinks(KM2EcoreContext context)
  {
    
      kermeta.language.structure.LinkSetterForTypedElement s = ((kermeta.language.structure.LinkSetterForTypedElement) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.LinkSetterForTypedElement"));
    
      s.setLinks(this, this.getEcoreModelElement(), context);
    
      java.lang.Boolean idIfCond_135 = false;
      idIfCond_135 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getSuperOperation()));
    
      if( idIfCond_135 ) {
    
      java.lang.String qualifiedName = this.getSuperOperation().getOwningClass().qualifiedName();
    
      ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.ecore.EAnnotationHelper")).createKermetaEAnnotation(kermeta.standard.helper.StringWrapper.toString(km2ecore.helper.ecore.KermetaEAnnotationKey.getByName("superOperation").getName()), qualifiedName);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(this.getEcoreModelElement().getEAnnotations()).add(ecoreAnnotation);
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isFunctionType()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_136 = false;
      idIfCond_136 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getFunctionTypeParameter())), kermeta.standard.helper.IntegerWrapper.isGreater(this.getFunctionTypeParameter().size(), 0));
    
      if( idIfCond_136 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void compilingInSimkMode(KM2EcoreContext context)
  {
    
      simk.SMContext sMContext = context.getSimkModel().retrieveOrCreateContextForWrapper(this, context);
    
      java.lang.Boolean idIfCond_137 = false;
      idIfCond_137 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMContext));
    
      if( idIfCond_137 ) {
    
      simk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.StaticMethod"));
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(sMContext.getStaticMethods()).add(staticMethod);
    
      staticMethod.setName(this.getName());
    
      staticMethod.setWrapperUsage();
    
      simk.SMParameter self_param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMParameter"));
    
      self_param.setName("self");
    
      java.lang.Boolean idIfCond_138 = false;
      idIfCond_138 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getWrapperValueTypeSelfExpression(), "");
    
      if( idIfCond_138 ) {
    
      kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeSelfExpression());
    
      java.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());
    
      java.lang.Boolean idIfCond_139 = false;
      idIfCond_139 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(map_value));
    
      if( idIfCond_139 ) {
    
      self_param.setType(map_value);
    }
    
    }
    
    
      java.lang.Boolean idIfCond_140 = false;
      idIfCond_140 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(self_param.getType());
    
      if( idIfCond_140 ) {
    
      self_param.setType(context.getCurrent_valueType().getEMFInstanceClassName());
    }
    
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(self_param);
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft57 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_141 = false;
      while( !idLoopCond_141 ) {
      idLoopCond_141 = it_ft57.isOff();
      if ( idLoopCond_141 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter p = it_ft57.next();
    
      simk.SMParameter param = ((simk.SMParameter) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMParameter"));
    
      param.setName(p.getName());
    
      java.lang.Boolean idIfCond_142 = false;
      idIfCond_142 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_142 ) {
    
      java.lang.Boolean idIfCond_143 = false;
      idIfCond_143 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(p.getType().getTypeQName(), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName()), kermeta.standard.helper.StringWrapper.equals(p.getType().getTypeQName(), "kermeta::language::structure::Object"));
    
      if( idIfCond_143 ) {
    
      param.setType(context.getCurrent_valueType().getEMFInstanceClassName());
    }
     else {
    
      param.setType(p.getType().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_144 = false;
      idIfCond_144 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(param.getType());
    
      if( idIfCond_144 ) {
    
      param.setType("void");
    }
    
    }
    
    }
     else {
    }
    
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.SMParameter>convertAsOrderedSet(staticMethod.getSMParameters()).add(param);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      simk.SMReturn sMReturn = ((simk.SMReturn) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.SMReturn"));
    
      staticMethod.setSMReturn(sMReturn);
    
      java.lang.Boolean idIfCond_145 = false;
      idIfCond_145 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getWrapperValueTypeReturnType(), "");
    
      if( idIfCond_145 ) {
    
      kermeta.utils.Hashtable<java.lang.String, java.lang.String> map_infos = kermeta.standard.helper.StringWrapper.getPropertyInfos(this.getWrapperValueTypeReturnType());
    
      java.lang.String map_value = map_infos.getValue(context.getCurrent_valueType().getEMFInstanceClassName());
    
      java.lang.Boolean idIfCond_146 = false;
      idIfCond_146 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(map_value));
    
      if( idIfCond_146 ) {
    
      sMReturn.setType(map_value);
    }
    
    }
    
    
      java.lang.Boolean idIfCond_147 = false;
      idIfCond_147 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(sMReturn.getType());
    
      if( idIfCond_147 ) {
    
      sMReturn.setType(this.getType().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_148 = false;
      idIfCond_148 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(sMReturn.getType());
    
      if( idIfCond_148 ) {
    
      sMReturn.setType("void");
    }
    
    }
    
    
      staticMethod.setBody(this.createBehaviorJava(context));
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String ppReturnResult(KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = "\nreturn ";
    
      java.lang.Boolean idIfCond_149 = false;
      idIfCond_149 = kermeta.standard.helper.IntegerWrapper.equals(this.getUpper(), 1);
    
      if( idIfCond_149 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "result");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, context.getCOLLECTION_UTIL_CLASS()), ".convertAsEList(result)");
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ";\n");
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean mustBeDuplicated()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_150 = false;
      idIfCond_150 = kermeta.standard.helper.BooleanWrapper.or(this.getType().isValueType(), this.hasAValueTypedParameter());
    
      if( idIfCond_150 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence<Parameter> getFunctionTypeParameter()
  {
    
    kermeta.standard.Sequence<kermeta.language.structure.Parameter> result = null;
    
      result = null;
    
      kermeta.standard.Sequence<kermeta.language.structure.Parameter> ft_parameters = null;
    //Beginning of the Inlining of the function type: select
    
    kermeta.standard.Sequence<kermeta.language.structure.Parameter> result_ft58 = null;
    
      kermeta.language.structure.Parameter elem_ft58 = null;
    
      result_ft58 = ((kermeta.standard.Sequence<kermeta.language.structure.Parameter>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.standard.Sequence<kermeta.language.structure.Parameter>"));
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft58 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_151 = false;
      while( !idLoopCond_151 ) {
      idLoopCond_151 = it_ft58.isOff();
      if ( idLoopCond_151 ) {
      } else {
    
      elem_ft58 = it_ft58.next();
    
      java.lang.Boolean idIfCond_152 = false;
    //Beginning of the Inlining of the lambda expression: selector
    kermeta.language.structure.Parameter p = elem_ft58;
    
      idIfCond_152 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"));
    //End of the Inlining of the lambda expression: selector
    
    
      if( idIfCond_152 ) {
    
      result_ft58.add(elem_ft58);
    }
    
    }
      }
    }
    
    
    //callElement
    ft_parameters = result_ft58;
    //End of the Inlining of the function type: select
    
    
      result = ft_parameters;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isVoidType(String type_label)
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_153 = false;
      idIfCond_153 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(type_label, "null"), kermeta.standard.helper.StringWrapper.equals(type_label, "void")), kermeta.standard.helper.StringWrapper.equals(type_label, "Void")), kermeta.standard.helper.StringWrapper.equals(type_label, "VoidType")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta::standard::Void")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta::standard::VoidType")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta::language::structure::Void")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta::language::structure::VoidType")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta.standard.Void")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta.standard.VoidType")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta.language.structure.Void")), kermeta.standard.helper.StringWrapper.equals(type_label, "kermeta.language.structure.VoidType"));
    
      if( idIfCond_153 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation createEcoreModelElement(KM2EcoreContext context)
  {
    
    ecore.EOperation result = null;
    
      ecore.EOperation ecoreOperation = ((ecore.EOperation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("ecore.EOperation"));
    
      ecoreOperation.setName(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getFinalName(), context));
    
      ecoreOperation.setOrdered(this.getIsOrdered());
    
      ecoreOperation.setUnique(this.getIsUnique());
    
      ecoreOperation.setLowerBound(this.getLower());
    
      ecoreOperation.setUpperBound(this.getUpper());
    
      java.lang.Boolean idIfCond_154 = false;
      idIfCond_154 = this.getIsAbstract();
    
      if( idIfCond_154 ) {
    
      ecore.EAnnotation ecoreAnnotation = ((km2ecore.helper.ecore.EAnnotationHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.ecore.EAnnotationHelper")).createAbstract();
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<ecore.EAnnotation>convertAsOrderedSet(ecoreOperation.getEAnnotations()).add(ecoreAnnotation);
    }
    
    
      result = ecoreOperation;
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean hasAValueTypedParameter()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      kermeta.language.structure.Parameter p = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.structure.Parameter result_ft59 = null;
    
      kermeta.language.structure.Parameter elem_ft59 = null;
    
      result_ft59 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft59 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_155 = false;
      while( !idLoopCond_155 ) {
      idLoopCond_155 = kermeta.standard.helper.BooleanWrapper.or(it_ft59.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft59, null));
      if ( idLoopCond_155 ) {
      } else {
    
      elem_ft59 = it_ft59.next();
    
      java.lang.Boolean idIfCond_156 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.structure.Parameter p = elem_ft59;
    
      idIfCond_156 = p.getType().isValueType();
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_156 ) {
    
      result_ft59 = elem_ft59;
    }
    
    }
      }
    }
    
    
    //callElement
    p = result_ft59;
    //End of the Inlining of the function type: detect
    
    
      java.lang.Boolean idIfCond_157 = false;
      idIfCond_157 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(p));
    
      if( idIfCond_157 ) {
    
      result = true;
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void applyPass2BehaviorJava(KM2EcoreContext context)
  {
    
      java.lang.Boolean idIfCond_158 = false;
      idIfCond_158 = kermeta.standard.helper.BooleanWrapper.not(this.isFunctionType());
    
      if( idIfCond_158 ) {
    
      java.lang.Boolean idIfCond_159 = false;
      idIfCond_159 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType());
    
      if( idIfCond_159 ) {
    
      this.setLinks(context);
    
      kermeta.language.structure.helper.ObjectSuper.super_applyPass2BehaviorJava(this, context);
    
      this.createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_160 = false;
      idIfCond_160 = this.isRunnable();
    
      if( idIfCond_160 ) {
    
      simk.SMContext smContext = context.getSimkModel().retrieveOrCreateContextForRunner(this, context);
    
      simk.StaticMethod staticMethod = ((simk.StaticMethod) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("simk.StaticMethod"));
    
      java.lang.String cd_qn = kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName(), "::", "\\.");
    
      staticMethod.setName("main");
    
      staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("\n", cd_qn), " anExec = ("), cd_qn), ")"), " org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\""), cd_qn), "\");"), "\nanExec."), ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getFinalName(), context)), "("));
    
      java.lang.Integer i = 0;
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft60 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_161 = false;
      while( !idLoopCond_161 ) {
      idLoopCond_161 = it_ft60.isOff();
      if ( idLoopCond_161 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter params = it_ft60.next();
    
      java.lang.Boolean idIfCond_162 = false;
      idIfCond_162 = kermeta.standard.helper.IntegerWrapper.isGreater(i, 0);
    
      if( idIfCond_162 ) {
    
      staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), ", "));
    }
    
    
      staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), " args["), kermeta.standard.helper.IntegerWrapper.toString(i)), "]"));
    
      i = kermeta.standard.helper.IntegerWrapper.plus(i, 1);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      staticMethod.setBody(kermeta.standard.helper.StringWrapper.plus(staticMethod.getBody(), ");\n"));
    
      staticMethod.setUsages(simk.SMUsage.getByName("Runner"));
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(context.getSimkModel().getStaticMethods()).add(staticMethod);
    
      org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<simk.StaticMethod>convertAsOrderedSet(smContext.getStaticMethods()).add(staticMethod);
    }
    
    }
     else {
    
      this.compilingInSimkMode(context);
    }
    
    }
    
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecopyInValueTypes()
  {
    
    java.lang.String result = null;
    
      result = this.getUniqueTagValue("RecopyInValueTypes");
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFinalName()
  {
    
    java.lang.String result = null;
    
      result = this.getName();
    
      java.lang.Boolean idIfCond_266 = false;
      idIfCond_266 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getEMFRenameAs(), "");
    
      if( idIfCond_266 ) {
    
      result = this.getEMFRenameAs();
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEMFRenameAs()
  {
    
    java.lang.String result = null;
    
      result = this.getUniqueTagValue("EMF_renameAs");
    
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedType()).basicAdd(otherEnd, msgs);
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
      case StructurePackage.OPERATION__POST:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPost()).basicAdd(otherEnd, msgs);
      case StructurePackage.OPERATION__PRE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPre()).basicAdd(otherEnd, msgs);
      case StructurePackage.OPERATION__OWNING_CLASS:
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        return ((InternalEList<?>)getContainedType()).basicRemove(otherEnd, msgs);
      case StructurePackage.OPERATION__BODY:
        return basicSetBody(null, msgs);
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
      case StructurePackage.OPERATION__POST:
        return ((InternalEList<?>)getPost()).basicRemove(otherEnd, msgs);
      case StructurePackage.OPERATION__PRE:
        return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
      case StructurePackage.OPERATION__OWNING_CLASS:
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
      case StructurePackage.OPERATION__OWNING_CLASS:
        return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS_DEFINITION__OWNED_OPERATION, ClassDefinition.class, msgs);
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        return getContainedType();
      case StructurePackage.OPERATION__NAME:
        return getName();
      case StructurePackage.OPERATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case StructurePackage.OPERATION__IS_ORDERED:
        return getIsOrdered();
      case StructurePackage.OPERATION__UPPER:
        return getUpper();
      case StructurePackage.OPERATION__LOWER:
        return getLower();
      case StructurePackage.OPERATION__IS_UNIQUE:
        return getIsUnique();
      case StructurePackage.OPERATION__TYPE_PARAMETER:
        return getTypeParameter();
      case StructurePackage.OPERATION__BODY:
        if (resolve) return getBody();
        return basicGetBody();
      case StructurePackage.OPERATION__IS_ABSTRACT:
        return getIsAbstract();
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        return getOwnedParameter();
      case StructurePackage.OPERATION__POST:
        return getPost();
      case StructurePackage.OPERATION__RAISED_EXCEPTION:
        return getRaisedException();
      case StructurePackage.OPERATION__PRE:
        return getPre();
      case StructurePackage.OPERATION__SUPER_OPERATION:
        if (resolve) return getSuperOperation();
        return basicGetSuperOperation();
      case StructurePackage.OPERATION__OWNING_CLASS:
        if (resolve) return getOwningClass();
        return basicGetOwningClass();
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        getContainedType().clear();
        getContainedType().addAll((Collection<? extends Type>)newValue);
        return;
      case StructurePackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case StructurePackage.OPERATION__TYPE:
        setType((Type)newValue);
        return;
      case StructurePackage.OPERATION__IS_ORDERED:
        setIsOrdered((Boolean)newValue);
        return;
      case StructurePackage.OPERATION__UPPER:
        setUpper((Integer)newValue);
        return;
      case StructurePackage.OPERATION__LOWER:
        setLower((Integer)newValue);
        return;
      case StructurePackage.OPERATION__IS_UNIQUE:
        setIsUnique((Boolean)newValue);
        return;
      case StructurePackage.OPERATION__TYPE_PARAMETER:
        getTypeParameter().clear();
        getTypeParameter().addAll((Collection<? extends TypeVariable>)newValue);
        return;
      case StructurePackage.OPERATION__BODY:
        setBody((Expression)newValue);
        return;
      case StructurePackage.OPERATION__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        getOwnedParameter().clear();
        getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
        return;
      case StructurePackage.OPERATION__POST:
        getPost().clear();
        getPost().addAll((Collection<? extends Constraint>)newValue);
        return;
      case StructurePackage.OPERATION__RAISED_EXCEPTION:
        getRaisedException().clear();
        getRaisedException().addAll((Collection<? extends Type>)newValue);
        return;
      case StructurePackage.OPERATION__PRE:
        getPre().clear();
        getPre().addAll((Collection<? extends Constraint>)newValue);
        return;
      case StructurePackage.OPERATION__SUPER_OPERATION:
        setSuperOperation((Operation)newValue);
        return;
      case StructurePackage.OPERATION__OWNING_CLASS:
        setOwningClass((ClassDefinition)newValue);
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        getContainedType().clear();
        return;
      case StructurePackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StructurePackage.OPERATION__TYPE:
        setType((Type)null);
        return;
      case StructurePackage.OPERATION__IS_ORDERED:
        setIsOrdered(IS_ORDERED_EDEFAULT);
        return;
      case StructurePackage.OPERATION__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case StructurePackage.OPERATION__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case StructurePackage.OPERATION__IS_UNIQUE:
        setIsUnique(IS_UNIQUE_EDEFAULT);
        return;
      case StructurePackage.OPERATION__TYPE_PARAMETER:
        getTypeParameter().clear();
        return;
      case StructurePackage.OPERATION__BODY:
        setBody((Expression)null);
        return;
      case StructurePackage.OPERATION__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        getOwnedParameter().clear();
        return;
      case StructurePackage.OPERATION__POST:
        getPost().clear();
        return;
      case StructurePackage.OPERATION__RAISED_EXCEPTION:
        getRaisedException().clear();
        return;
      case StructurePackage.OPERATION__PRE:
        getPre().clear();
        return;
      case StructurePackage.OPERATION__SUPER_OPERATION:
        setSuperOperation((Operation)null);
        return;
      case StructurePackage.OPERATION__OWNING_CLASS:
        setOwningClass((ClassDefinition)null);
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
      case StructurePackage.OPERATION__CONTAINED_TYPE:
        return containedType != null && !containedType.isEmpty();
      case StructurePackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StructurePackage.OPERATION__TYPE:
        return type != null;
      case StructurePackage.OPERATION__IS_ORDERED:
        return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
      case StructurePackage.OPERATION__UPPER:
        return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
      case StructurePackage.OPERATION__LOWER:
        return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
      case StructurePackage.OPERATION__IS_UNIQUE:
        return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
      case StructurePackage.OPERATION__TYPE_PARAMETER:
        return typeParameter != null && !typeParameter.isEmpty();
      case StructurePackage.OPERATION__BODY:
        return body != null;
      case StructurePackage.OPERATION__IS_ABSTRACT:
        return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
      case StructurePackage.OPERATION__OWNED_PARAMETER:
        return ownedParameter != null && !ownedParameter.isEmpty();
      case StructurePackage.OPERATION__POST:
        return post != null && !post.isEmpty();
      case StructurePackage.OPERATION__RAISED_EXCEPTION:
        return raisedException != null && !raisedException.isEmpty();
      case StructurePackage.OPERATION__PRE:
        return pre != null && !pre.isEmpty();
      case StructurePackage.OPERATION__SUPER_OPERATION:
        return superOperation != null;
      case StructurePackage.OPERATION__OWNING_CLASS:
        return basicGetOwningClass() != null;
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
        case StructurePackage.OPERATION__CONTAINED_TYPE: return StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.OPERATION__NAME: return StructurePackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.OPERATION__TYPE: return StructurePackage.TYPED_ELEMENT__TYPE;
        default: return -1;
      }
    }
    if (baseClass == MultiplicityElement.class)
    {
      switch (derivedFeatureID)
      {
        case StructurePackage.OPERATION__IS_ORDERED: return StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
        case StructurePackage.OPERATION__UPPER: return StructurePackage.MULTIPLICITY_ELEMENT__UPPER;
        case StructurePackage.OPERATION__LOWER: return StructurePackage.MULTIPLICITY_ELEMENT__LOWER;
        case StructurePackage.OPERATION__IS_UNIQUE: return StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
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
        case StructurePackage.TYPE_CONTAINER__CONTAINED_TYPE: return StructurePackage.OPERATION__CONTAINED_TYPE;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.NAMED_ELEMENT__NAME: return StructurePackage.OPERATION__NAME;
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.TYPED_ELEMENT__TYPE: return StructurePackage.OPERATION__TYPE;
        default: return -1;
      }
    }
    if (baseClass == MultiplicityElement.class)
    {
      switch (baseFeatureID)
      {
        case StructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return StructurePackage.OPERATION__IS_ORDERED;
        case StructurePackage.MULTIPLICITY_ELEMENT__UPPER: return StructurePackage.OPERATION__UPPER;
        case StructurePackage.MULTIPLICITY_ELEMENT__LOWER: return StructurePackage.OPERATION__LOWER;
        case StructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return StructurePackage.OPERATION__IS_UNIQUE;
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
    result.append(", isOrdered: ");
    result.append(isOrdered);
    result.append(", upper: ");
    result.append(upper);
    result.append(", lower: ");
    result.append(lower);
    result.append(", isUnique: ");
    result.append(isUnique);
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
