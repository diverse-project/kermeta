/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallFeatureImpl.java,v 1.1 2008-09-04 15:40:25 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.CallFeature;
import kermeta.language.behavior.Expression;

import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Property;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticOperation <em>Static Operation</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getIsAtpre <em>Is Atpre</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticEnumLiteral <em>Static Enum Literal</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.CallFeatureImpl#getStaticProperty <em>Static Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallFeatureImpl extends CallExpressionImpl implements CallFeature
{
  /**
   * The cached value of the '{@link #getStaticOperation() <em>Static Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticOperation()
   * @generated
   * @ordered
   */
  protected Operation staticOperation;

  /**
   * The default value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAtpre()
   * @generated
   * @ordered
   */
  protected static final Boolean IS_ATPRE_EDEFAULT = Boolean.FALSE;

  /**
   * The cached value of the '{@link #getIsAtpre() <em>Is Atpre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsAtpre()
   * @generated
   * @ordered
   */
  protected Boolean isAtpre = IS_ATPRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Expression target;

  /**
   * The cached value of the '{@link #getStaticEnumLiteral() <em>Static Enum Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticEnumLiteral()
   * @generated
   * @ordered
   */
  protected EnumerationLiteral staticEnumLiteral;

  /**
   * The cached value of the '{@link #getStaticProperty() <em>Static Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticProperty()
   * @generated
   * @ordered
   */
  protected Property staticProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallFeatureImpl()
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
    return BehaviorPackage.Literals.CALL_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getStaticOperation()
  {
    if (staticOperation != null && staticOperation.eIsProxy())
    {
      InternalEObject oldStaticOperation = (InternalEObject)staticOperation;
      staticOperation = (Operation)eResolveProxy(oldStaticOperation);
      if (staticOperation != oldStaticOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_OPERATION, oldStaticOperation, staticOperation));
      }
    }
    return staticOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetStaticOperation()
  {
    return staticOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticOperation(Operation newStaticOperation)
  {
    Operation oldStaticOperation = staticOperation;
    staticOperation = newStaticOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_OPERATION, oldStaticOperation, staticOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getIsAtpre()
  {
    return isAtpre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAtpre(Boolean newIsAtpre)
  {
    Boolean oldIsAtpre = isAtpre;
    isAtpre = newIsAtpre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__IS_ATPRE, oldIsAtpre, isAtpre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Expression)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        InternalEObject newTarget = (InternalEObject)target;
        NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, null);
        if (newTarget.eInternalContainer() == null)
        {
          msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Expression newTarget, NotificationChain msgs)
  {
    Expression oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Expression newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.CALL_FEATURE__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral getStaticEnumLiteral()
  {
    if (staticEnumLiteral != null && staticEnumLiteral.eIsProxy())
    {
      InternalEObject oldStaticEnumLiteral = (InternalEObject)staticEnumLiteral;
      staticEnumLiteral = (EnumerationLiteral)eResolveProxy(oldStaticEnumLiteral);
      if (staticEnumLiteral != oldStaticEnumLiteral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL, oldStaticEnumLiteral, staticEnumLiteral));
      }
    }
    return staticEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral basicGetStaticEnumLiteral()
  {
    return staticEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticEnumLiteral(EnumerationLiteral newStaticEnumLiteral)
  {
    EnumerationLiteral oldStaticEnumLiteral = staticEnumLiteral;
    staticEnumLiteral = newStaticEnumLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL, oldStaticEnumLiteral, staticEnumLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getStaticProperty()
  {
    if (staticProperty != null && staticProperty.eIsProxy())
    {
      InternalEObject oldStaticProperty = (InternalEObject)staticProperty;
      staticProperty = (Property)eResolveProxy(oldStaticProperty);
      if (staticProperty != oldStaticProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY, oldStaticProperty, staticProperty));
      }
    }
    return staticProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetStaticProperty()
  {
    return staticProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticProperty(Property newStaticProperty)
  {
    Property oldStaticProperty = staticProperty;
    staticProperty = newStaticProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY, oldStaticProperty, staticProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean fromUtil(KM2EcoreContext context)
  {
    
    java.lang.Boolean result = null;
    
      java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getName(), context);
    
      java.lang.Boolean idIfCond_320 = false;
      idIfCond_320 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).isValueType(), kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName(), "kermeta::language::structure::Object"), kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(fName), kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression"))))))), kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName(), "kermeta::language::structure::Type"), kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<java.lang.String>convertAsOrderedSet(context.getFrameworkOperations()).contains(fName), kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))))));
    
      if( idIfCond_320 ) {
    
      result = true;
    }
     else {
    
      result = false;
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
    
      super.createBehaviorJava(context);
    
      result = "";
    
      java.lang.Boolean ppCast = false;
    
      java.lang.String cf_prop_suffix = "";
    
      java.lang.Boolean idIfCond_321 = false;
      idIfCond_321 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getTarget());
    
      if( idIfCond_321 ) {
    
      this.setTarget(((kermeta.language.behavior.SelfExpression) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.behavior.SelfExpression")));
    }
    
    
      kermeta.language.behavior.Expression tgt = this.getTarget();
    
      java.lang.String fName = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getName(), context);
    
      java.lang.String static_call = "";
    
      java.lang.Boolean idIfCond_322 = false;
      idIfCond_322 = this.isCallFeatureAsStaticOperation();
    
      if( idIfCond_322 ) {
    
      java.lang.Boolean idIfCond_323 = false;
      idIfCond_323 = this.callsFunctionType();
    
      if( idIfCond_323 ) {
    
      java.lang.String ft_str = this.createStringFromFunctionType(context);
    
      result = ft_str;
    }
     else {
    
      java.lang.Boolean idIfCond_324 = false;
      idIfCond_324 = this.fromUtil(context);
    
      if( idIfCond_324 ) {
    
      java.lang.Boolean idIfCond_325 = false;
      idIfCond_325 = ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).isValueType();
    
      if( idIfCond_325 ) {
    
      static_call = this.getStaticOperation().getOptimizedStaticCall(context);
    
      java.lang.Boolean idIfCond_326 = false;
      idIfCond_326 = kermeta.standard.helper.StringWrapper.equals(static_call, "");
    
      if( idIfCond_326 ) {
    
      static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.replace(((kermeta.language.structure.Package) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition")))), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Package"))).qualifiedName(), "::", "\\."), ".helper."), ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getName()), "Wrapper."), fName);
    }
    
    }
     else {
    
      static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.helper.language.", ((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).getName()), "Util."), fName);
    
      java.lang.Boolean idIfCond_327 = false;
      idIfCond_327 = kermeta.standard.helper.StringWrapper.equals(fName, "asType");
    
      if( idIfCond_327 ) {
    
      ppCast = true;
    
      static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("(", org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).one().createBehaviorJava(context)), ") "), static_call);
    }
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_328 = false;
      idIfCond_328 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(tgt));
    
      if( idIfCond_328 ) {
    
      java.lang.Boolean idIfCond_329 = false;
      idIfCond_329 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(tgt.getStaticType()));
    
      if( idIfCond_329 ) {
    
      java.lang.Boolean idIfCond_330 = false;
      idIfCond_330 = tgt.getStaticType().isValueType();
    
      if( idIfCond_330 ) {
    
      static_call = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.helper.basetypes.", tgt.getStaticType().getTypeName()), "Util."), fName);
    }
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_331 = false;
      idIfCond_331 = kermeta.standard.helper.BooleanWrapper.and(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).isMappedToJavaRawType(), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getStaticOperation().getBody())));
    
      if( idIfCond_331 ) {
    
      static_call = this.getStaticOperation().getOptimizedStaticCall(context);
    }
    
    }
    
    }
    
    }
    
    }
    
    
      java.lang.Boolean idIfCond_332 = false;
      idIfCond_332 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(fName, "_new"), this.isFromClass()), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult"))));
    
      if( idIfCond_332 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "(("), tgt.createBehaviorJava(context)), ") "), "org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\""), tgt.createBehaviorJava(context)), "\"))");
    }
     else {
    
      java.lang.Boolean idIfCond_333 = false;
      idIfCond_333 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(tgt));
    
      if( idIfCond_333 ) {
    
      java.lang.Boolean idIfCond_334 = false;
      idIfCond_334 = kermeta.standard.helper.BooleanWrapper.not(tgt.callsFunctionType());
    
      if( idIfCond_334 ) {
    
      java.lang.Boolean idIfCond_335 = false;
      idIfCond_335 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());
    
      if( idIfCond_335 ) {
    
      java.lang.Boolean idIfCond_336 = false;
      idIfCond_336 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(tgt, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.TypeLiteral")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(org.kermeta.compil.runtime.helper.language.ObjectUtil.toString(tgt.getStaticType()), "Enumeration"));
    
      if( idIfCond_336 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\""), tgt.createBehaviorJava(context)), "\")");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, tgt.createBehaviorJava(context));
    }
    
    
      java.lang.Boolean idIfCond_337 = false;
      idIfCond_337 = kermeta.standard.helper.StringWrapper.equals(static_call, "");
    
      if( idIfCond_337 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "\\.");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_338 = false;
      idIfCond_338 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallExpression")), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this).callsFunctionType()));
    
      if( idIfCond_338 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, context.getPREVIOUS_STATEMENT_FT()), context.getkermeta.standard.helper.StringWrapper.plus(()), context.getResultOfLastFt());
    }
    
    }
    
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(tgt.createBehaviorJava(context), kermeta.standard.helper.StringWrapper.replace(result, context.getSELF_EXPRESSION_TO_REPLACE(), context.getResultOfLastFt()));
    }
    
    }
    
    
      java.lang.Boolean idIfCond_339 = false;
      idIfCond_339 = kermeta.standard.helper.StringWrapper.equals(static_call, "");
    
      if( idIfCond_339 ) {
    
      java.lang.Boolean idIfCond_340 = false;
      idIfCond_340 = this.isCallFeatureAsStaticEnumLiteral();
    
      if( idIfCond_340 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "getByName(\""), fName), "\")");
    }
     else {
    
      java.lang.Boolean idIfCond_341 = false;
      idIfCond_341 = this.isCallFeatureAsStaticProperty();
    
      if( idIfCond_341 ) {
    
      java.lang.Boolean idIfCond_342 = false;
      idIfCond_342 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getStaticProperty().getUpper(), 1);
    
      if( idIfCond_342 ) {
    
      java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).getTypeParamBinding()).one().getType().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_343 = false;
      idIfCond_343 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsUnique()), kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsOrdered()));
    
      if( idIfCond_343 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsBag("), result);
    }
    
    
      java.lang.Boolean idIfCond_344 = false;
      idIfCond_344 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticProperty().getIsUnique(), kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsOrdered()));
    
      if( idIfCond_344 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSet("), result);
    }
    
    
      java.lang.Boolean idIfCond_345 = false;
      idIfCond_345 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticProperty().getIsUnique(), this.getStaticProperty().getIsOrdered());
    
      if( idIfCond_345 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsOrderedSet("), result);
    }
    
    
      java.lang.Boolean idIfCond_346 = false;
      idIfCond_346 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticProperty().getIsUnique()), this.getStaticProperty().getIsOrdered());
    
      if( idIfCond_346 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSequence("), result);
    }
    
    
      cf_prop_suffix = ")";
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "get"), kermeta.standard.helper.StringWrapper.capName(this.getStaticProperty().getFinalName())), "()"), cf_prop_suffix);
    
      cf_prop_suffix = "";
    }
     else {
    
      java.lang.Boolean idIfCond_347 = false;
      idIfCond_347 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());
    
      if( idIfCond_347 ) {
    
      java.lang.Boolean idIfCond_348 = false;
      idIfCond_348 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.getStaticOperation().getUpper(), 1);
    
      if( idIfCond_348 ) {
    
      java.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Class"))).getTypeParamBinding()).one().getType().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_349 = false;
      idIfCond_349 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsUnique()), kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsOrdered()));
    
      if( idIfCond_349 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsBag("), result);
    }
    
    
      java.lang.Boolean idIfCond_350 = false;
      idIfCond_350 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticOperation().getIsUnique(), kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsOrdered()));
    
      if( idIfCond_350 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSet("), result);
    }
    
    
      java.lang.Boolean idIfCond_351 = false;
      idIfCond_351 = kermeta.standard.helper.BooleanWrapper.and(this.getStaticOperation().getIsUnique(), this.getStaticOperation().getIsOrdered());
    
      if( idIfCond_351 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsOrderedSet("), result);
    }
    
    
      java.lang.Boolean idIfCond_352 = false;
      idIfCond_352 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.getStaticOperation().getIsUnique()), this.getStaticOperation().getIsOrdered());
    
      if( idIfCond_352 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), ".<"), type_binding), ">convertAsSequence("), result);
    }
    
    
      cf_prop_suffix = ")";
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(this.getStaticOperation().getFinalName(), context));
    }
     else {
    
      java.lang.Boolean idIfCond_353 = false;
      idIfCond_353 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallExpression")), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this).callsFunctionType()));
    
      if( idIfCond_353 ) {
    
      java.lang.Boolean idIfCond_354 = false;
      idIfCond_354 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature"));
    
      if( idIfCond_354 ) {
    
      kermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")));
    
      java.lang.Boolean idIfCond_355 = false;
      idIfCond_355 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cf_.getStaticOperation()));
    
      if( idIfCond_355 ) {
    
      java.lang.Boolean idIfCond_356 = false;
      idIfCond_356 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(cf_.fromUtil(context), this.isParameter()), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(cf_.getStaticOperation().getCompiledJavaExtern(), ""));
    
      if( idIfCond_356 ) {
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "\\.");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_357 = false;
      idIfCond_357 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(cf_.getStaticProperty()));
    
      if( idIfCond_357 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "\\.");
    }
    
    }
    
    }
    
    }
    
    }
    
    }
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_358 = false;
      idIfCond_358 = kermeta.standard.helper.StringWrapper.contains(result, context.getRETURN_EXPRESSION_TO_REPLACE());
    
      if( idIfCond_358 ) {
    
      kermeta.standard.helper.StringWrapper.replace(result, context.getresult = (), kermeta.standard.helper.StringWrapper.plus(static_call, "("));
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(static_call, "("), result);
    }
    
    
      java.lang.Boolean idIfCond_359 = false;
      idIfCond_359 = ppCast;
    
      if( idIfCond_359 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus("(", result);
    }
    
    }
    
    
      java.lang.Boolean idIfCond_360 = false;
      idIfCond_360 = kermeta.standard.helper.BooleanWrapper.and(this.isCallFeatureAsStaticOperation(), kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType()));
    
      if( idIfCond_360 ) {
    
      java.lang.Boolean idIfCond_361 = false;
      idIfCond_361 = kermeta.standard.helper.StringWrapper.equals(static_call, "");
    
      if( idIfCond_361 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "(");
    }
     else {
    
      static_call = "";
    
      java.lang.Boolean idIfCond_362 = false;
      idIfCond_362 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).size(), 0));
    
      if( idIfCond_362 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
    
    }
    
    
      this.setBeforeLambdaExpressionResult("");
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.kermeta.CompilerHelperJava) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.kermeta.CompilerHelperJava")).ppComaSeparatedNodes(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()), context)), ")"), cf_prop_suffix);
    
      context.setBeforeLambdaExpressionResult(this.getBeforeLambdaExpressionResult());
    
      this.setBeforeLambdaExpressionResult("");
    
      java.lang.Boolean idIfCond_363 = false;
      idIfCond_363 = ppCast;
    
      if( idIfCond_363 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ")");
    
      ppCast = false;
    }
    
    }
    
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParamBindings()
  {
    
    java.lang.String result = null;
    
      result = "";
    
      java.lang.Integer i = 0;
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft86 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).iterator();
      java.lang.Boolean idLoopCond_364 = false;
      while( !idLoopCond_364 ) {
      idLoopCond_364 = it_ft86.isOff();
      if ( idLoopCond_364 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Expression param = it_ft86.next();
    
      java.lang.Boolean idIfCond_365 = false;
      idIfCond_365 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(param, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"));
    
      if( idIfCond_365 ) {
    
      java.lang.Boolean idIfCond_366 = false;
      idIfCond_366 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(param, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"))).getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ProductType"));
    
      if( idIfCond_366 ) {
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsSequence(((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(param, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"))).getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ProductType"))).getType()).iterator();
      java.lang.Boolean idLoopCond_367 = false;
      while( !idLoopCond_367 ) {
      idLoopCond_367 = it_ft87.isOff();
      if ( idLoopCond_367 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Type t = it_ft87.next();
    
      java.lang.Boolean idIfCond_368 = false;
      idIfCond_368 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);
    
      if( idIfCond_368 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
     else {
    
      i = 1;
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, t.getTypeQName());
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    }
    
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      java.lang.Boolean idIfCond_369 = false;
      idIfCond_369 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result, "");
    
      if( idIfCond_369 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("<", result), ">");
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isFromClass()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_370 = false;
      idIfCond_370 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getStaticOperation()));
    
      if( idIfCond_370 ) {
    
      java.lang.Boolean idIfCond_371 = false;
      idIfCond_371 = kermeta.standard.helper.StringWrapper.equals(((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this.getStaticOperation()), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ClassDefinition"))).qualifiedName(), "kermeta::language::structure::Class");
    
      if( idIfCond_371 ) {
    
      result = true;
    }
    
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean isParameter()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_372 = false;
      idIfCond_372 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature"));
    
      if( idIfCond_372 ) {
    
      kermeta.language.behavior.Expression exp = null;
    //Beginning of the Inlining of the function type: detect
    
    kermeta.language.behavior.Expression result_ft88 = null;
    
      kermeta.language.behavior.Expression elem_ft88 = null;
    
      result_ft88 = null;
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft88 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature"))).getParameters()).iterator();
      java.lang.Boolean idLoopCond_373 = false;
      while( !idLoopCond_373 ) {
      idLoopCond_373 = kermeta.standard.helper.BooleanWrapper.or(it_ft88.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft88, null));
      if ( idLoopCond_373 ) {
      } else {
    
      elem_ft88 = it_ft88.next();
    
      java.lang.Boolean idIfCond_374 = false;
    //Beginning of the Inlining of the lambda expression: detector
    kermeta.language.behavior.Expression p = elem_ft88;
    
      idIfCond_374 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(p, this);
    //End of the Inlining of the lambda expression: detector
    
    
      if( idIfCond_374 ) {
    
      result_ft88 = elem_ft88;
    }
    
    }
      }
    }
    
    
    //callElement
    exp = result_ft88;
    //End of the Inlining of the function type: detect
    
    
      java.lang.Boolean idIfCond_375 = false;
      idIfCond_375 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(exp));
    
      if( idIfCond_375 ) {
    
      result = true;
    }
    
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createStringFromFunctionType(KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      kermeta.language.behavior.Expression tgt = this.getTarget();
    
      context.getTasks_stack().push("FunctionType_Compilation");
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft89 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(this.getStaticOperation().getOwnedParameter()).iterator();
      java.lang.Boolean idLoopCond_376 = false;
      while( !idLoopCond_376 ) {
      idLoopCond_376 = it_ft89.isOff();
      if ( idLoopCond_376 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Parameter p = it_ft89.next();
    
      java.lang.Boolean idIfCond_377 = false;
      idIfCond_377 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(p.getType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"));
    
      if( idIfCond_377 ) {
    
      context.setCurrent_param_ft(p.getName());
    }
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type> map_type = ((kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.utils.Hashtable<kermeta.language.structure.Type, kermeta.language.structure.Type>"));
    
      java.lang.Integer inc_tp = 0;
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft90 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Type>convertAsOrderedSet(this.getStaticTypeVariableBindings()).iterator();
      java.lang.Boolean idLoopCond_378 = false;
      while( !idLoopCond_378 ) {
      idLoopCond_378 = it_ft90.isOff();
      if ( idLoopCond_378 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.structure.Type type_ = it_ft90.next();
    
      map_type.put(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariable>convertAsOrderedSet(this.getStaticOperation().getTypeParameter()).elementAt(inc_tp), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("type_"));
    
      inc_tp = kermeta.standard.helper.IntegerWrapper.plus(inc_tp, 1);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      context.getFtMapTypeStack().push(map_type);
    
      kermeta.language.structure.Type ftRightType = ((kermeta.language.structure.Type) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Type"));
    
      java.lang.Boolean idIfCond_379 = false;
      idIfCond_379 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).one(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"));
    
      if( idIfCond_379 ) {
    
      kermeta.language.behavior.LambdaExpression theLambdaExp = ((kermeta.language.behavior.LambdaExpression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).one(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression")));
    
      context.getFtStack().push(theLambdaExp);
    
      java.lang.Boolean idIfCond_380 = false;
      idIfCond_380 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"));
    
      if( idIfCond_380 ) {
    
      java.lang.Boolean idIfCond_381 = false;
      idIfCond_381 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getLeft(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ProductType"));
    
      if( idIfCond_381 ) {
    
      context.getFtProductTypeStack().push(((kermeta.language.structure.ProductType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getLeft(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.ProductType"))));
    }
    
    
      ftRightType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getRight();
    }
    
    }
    
    
      java.lang.String ft_str = "";
    
      context.pushFtSuffix();
    
      java.lang.Boolean idIfCond_382 = false;
      idIfCond_382 = tgt.callsFunctionType();
    
      if( idIfCond_382 ) {
    
      context.setFtContextualSelf(context.getSELF_EXPRESSION_TO_REPLACE());
    }
     else {
    
      context.setFtContextualSelf(tgt.createBehaviorJava(context));
    }
    
    
      context.setFtSuffixActivation(true);
    
      java.lang.String callElement = "";
    
      java.lang.Boolean idIfCond_383 = false;
      idIfCond_383 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.VariableDecl"));
    
      if( idIfCond_383 ) {
    
      callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(((kermeta.language.behavior.VariableDecl) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.VariableDecl"))).getIdentifier(), context);
    }
     else {
    
      java.lang.Boolean idIfCond_384 = false;
      idIfCond_384 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"));
    
      if( idIfCond_384 ) {
    
      callElement = ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("km2ecore.helper.java.IdentifierHelper")).getMangledIdentifier(((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))).getName(), context);
    }
    
    }
    
    
      java.lang.Boolean idIfCond_385 = false;
      idIfCond_385 = kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(callElement, ""), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Assignment")));
    
      if( idIfCond_385 ) {
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str, "null;\n");
    }
    
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(ft_str, context.getSEPARATOR_STATEMENT_FT()), "//Beginning of the Inlining of the function type: "), this.getStaticOperation().getName()), "\n");
    
      context.setFtSuffixActivation(false);
    
      java.lang.String type_ftReturnType = this.getStaticType().createBehaviorJava(context);
    
      context.setFtSuffixActivation(true);
    
      context.setFtReturnType(type_ftReturnType);
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str, this.getStaticOperation().createBehaviorJava(context));
    
      java.lang.Boolean idIfCond_386 = false;
      idIfCond_386 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(callElement, "");
    
      if( idIfCond_386 ) {
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(ft_str, "\n//callElement\n");
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(ft_str, callElement), " = result"), context.printFtSuffix()), ";\n");
    }
    
    
      java.lang.Boolean idIfCond_387 = false;
      idIfCond_387 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(callElement, ""), kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(this.getStaticType().getTypeName())));
    
      if( idIfCond_387 ) {
    
      context.setResultOfLastFt(kermeta.standard.helper.StringWrapper.plus("result", context.printFtSuffix()));
    }
    
    
      ft_str = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(ft_str, "//End of the Inlining of the function type: "), this.getStaticOperation().getName()), "\n");
    
      context.setFtSuffixActivation(false);
    
      context.getFtMapTypeStack().pop();
    
      context.getFtProductTypeStack().pop();
    
      context.getFtSuffix().pop();
    
      result = ft_str;
    
    return result;
    
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
      case BehaviorPackage.CALL_FEATURE__TARGET:
        return basicSetTarget(null, msgs);
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
      case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
        if (resolve) return getStaticOperation();
        return basicGetStaticOperation();
      case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
        return getIsAtpre();
      case BehaviorPackage.CALL_FEATURE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
        if (resolve) return getStaticEnumLiteral();
        return basicGetStaticEnumLiteral();
      case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
        if (resolve) return getStaticProperty();
        return basicGetStaticProperty();
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
      case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
        setStaticOperation((Operation)newValue);
        return;
      case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
        setIsAtpre((Boolean)newValue);
        return;
      case BehaviorPackage.CALL_FEATURE__TARGET:
        setTarget((Expression)newValue);
        return;
      case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
        setStaticEnumLiteral((EnumerationLiteral)newValue);
        return;
      case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
        setStaticProperty((Property)newValue);
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
      case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
        setStaticOperation((Operation)null);
        return;
      case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
        setIsAtpre(IS_ATPRE_EDEFAULT);
        return;
      case BehaviorPackage.CALL_FEATURE__TARGET:
        setTarget((Expression)null);
        return;
      case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
        setStaticEnumLiteral((EnumerationLiteral)null);
        return;
      case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
        setStaticProperty((Property)null);
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
      case BehaviorPackage.CALL_FEATURE__STATIC_OPERATION:
        return staticOperation != null;
      case BehaviorPackage.CALL_FEATURE__IS_ATPRE:
        return IS_ATPRE_EDEFAULT == null ? isAtpre != null : !IS_ATPRE_EDEFAULT.equals(isAtpre);
      case BehaviorPackage.CALL_FEATURE__TARGET:
        return target != null;
      case BehaviorPackage.CALL_FEATURE__STATIC_ENUM_LITERAL:
        return staticEnumLiteral != null;
      case BehaviorPackage.CALL_FEATURE__STATIC_PROPERTY:
        return staticProperty != null;
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
    result.append(" (isAtpre: ");
    result.append(isAtpre);
    result.append(')');
    return result.toString();
  }

} //CallFeatureImpl
