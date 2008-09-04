/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.1 2008-09-04 15:40:25 cfaucher Exp $
 */
package kermeta.language.behavior.impl;

import java.util.Collection;

import kermeta.language.behavior.BehaviorPackage;
import kermeta.language.behavior.Block;
import kermeta.language.behavior.Expression;
import kermeta.language.behavior.Rescue;

import km2ecore.KM2EcoreContext;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link kermeta.language.behavior.impl.BlockImpl#getRescueBlock <em>Rescue Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ExpressionImpl implements Block
{
  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected EList<Expression> statement;

  /**
   * The cached value of the '{@link #getRescueBlock() <em>Rescue Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRescueBlock()
   * @generated
   * @ordered
   */
  protected EList<Rescue> rescueBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return BehaviorPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getStatement()
  {
    if (statement == null)
    {
      statement = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this, BehaviorPackage.BLOCK__STATEMENT);
    }
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rescue> getRescueBlock()
  {
    if (rescueBlock == null)
    {
      rescueBlock = new EObjectContainmentEList.Resolving<Rescue>(Rescue.class, this, BehaviorPackage.BLOCK__RESCUE_BLOCK);
    }
    return rescueBlock;
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
    
      kermeta.utils.StringBuffer javaCode = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.utils.StringBuffer"));
    
      java.lang.Boolean idIfCond_282 = false;
      idIfCond_282 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"))));
    
      if( idIfCond_282 ) {
    
      javaCode.append("{\n");
    }
    
    
      java.lang.Boolean idIfCond_283 = false;
      idIfCond_283 = this.containsRescue();
    
      if( idIfCond_283 ) {
    
      javaCode.append("try {");
    }
    
    
      java.lang.Integer nbrStm = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).size();
    
      java.lang.Integer i_stm = 0;
    
      //Beginning of the Inlining of the function type: eachOwnedElement
    
      
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft82 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getStatement()).iterator();
      java.lang.Boolean idLoopCond_284 = false;
      while( !idLoopCond_284 ) {
      idLoopCond_284 = it_ft82.isOff();
      if ( idLoopCond_284 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Expression s = it_ft82.next();
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Expression stm = s_ft82;
    
      java.lang.String str_statement = kermeta.standard.helper.StringWrapper.replace(kermeta.standard.helper.StringWrapper.replace(stm.createBehaviorJava(context), " == null", " == null"), ";", ";");
    
      kermeta.standard.OrderedSet<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());
    
      java.lang.Boolean idIfCond_285 = false;
      idIfCond_285 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);
    
      if( idIfCond_285 ) {
    
      java.lang.String s1 = str_statement_splitted.one();
    
      java.lang.String s2 = str_statement_splitted.last();
    
      java.lang.Boolean idIfCond_286 = false;
      idIfCond_286 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());
    
      if( idIfCond_286 ) {
    
      str_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);
    }
    
    }
    
    
      str_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), "//"), "//");
    
      str_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getkermeta.standard.helper.StringWrapper.plus((), "result"), "result");
    
      javaCode.append(context.getBeforeLambdaExpressionResult());
    
      context.setBeforeLambdaExpressionResult("");
    
      javaCode.append("\n\t");
    
      java.lang.Boolean idIfCond_287 = false;
      idIfCond_287 = kermeta.standard.helper.IntegerWrapper.equals(i_stm, kermeta.standard.helper.IntegerWrapper.minus(nbrStm, 1));
    
      if( idIfCond_287 ) {
    
      java.lang.Boolean idIfCond_288 = false;
      idIfCond_288 = kermeta.standard.helper.IntegerWrapper.isGreater(context.getLastStatementStack().size(), 0);
    
      if( idIfCond_288 ) {
    
      javaCode.append(context.getLastStatementStack().pop());
    }
    
    
      java.lang.Boolean idIfCond_289 = false;
      idIfCond_289 = stm.mustBeAssigned();
    
      if( idIfCond_289 ) {
    
      java.lang.Boolean idIfCond_290 = false;
      idIfCond_290 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"));
    
      if( idIfCond_290 ) {
    
      javaCode.append(context.getNOT_EVALUATED_MESSAGE());
    }
     else {
    
      java.lang.Boolean idIfCond_291 = false;
      idIfCond_291 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getStaticType().getTypeName());
    
      if( idIfCond_291 ) {
    
      javaCode.append(context.getNOT_EVALUATED_MESSAGE());
    }
     else {
    
      java.lang.Boolean idIfCond_292 = false;
      idIfCond_292 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Block")), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));
    
      if( idIfCond_292 ) {
    
      javaCode.append(context.getNOT_EVALUATED_MESSAGE());
    }
     else {
    
      java.lang.Boolean idIfCond_293 = false;
      idIfCond_293 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getStaticType().createBehaviorJava(context));
    
      if( idIfCond_293 ) {
    
      javaCode.append(context.getResultLastStatementId());
    }
    
    }
    
    }
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_294 = false;
      idIfCond_294 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));
    
      if( idIfCond_294 ) {
    
      java.lang.Boolean idIfCond_295 = false;
      idIfCond_295 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getStaticType().createBehaviorJava(context));
    
      if( idIfCond_295 ) {
    
      javaCode.append(context.getResultLastStatementId());
    }
    
    }
    
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_296 = false;
      idIfCond_296 = stm.mustBeAssigned();
    
      if( idIfCond_296 ) {
    
      javaCode.append(context.getNOT_EVALUATED_MESSAGE());
    }
    
    }
    
    
      javaCode.append(str_statement);
    
      javaCode.append("\n");
    
      i_stm = kermeta.standard.helper.IntegerWrapper.plus(i_stm, 1);
    //End of the Inlining of the lambda expression: func
    
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    //End of the Inlining of the function type: eachOwnedElement
    
    
      java.lang.Boolean idIfCond_297 = false;
      idIfCond_297 = this.containsRescue();
    
      if( idIfCond_297 ) {
    
      context.pushKRErrorStack();
    
      javaCode.append(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("} catch( ", context.getJAVA_CLASS_EXCEPTION_SWITCHER()), " "), context.getVARIABLE_EXCEPTION_SWITCHER()), "_"), context.getKRErrorStack().peek()), " ) {\n"));
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Rescue> it_ft83 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).iterator();
      java.lang.Boolean idLoopCond_298 = false;
      while( !idLoopCond_298 ) {
      idLoopCond_298 = it_ft83.isOff();
      if ( idLoopCond_298 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Rescue e = it_ft83.next();
    
      javaCode.append(e.createBehaviorJava(context));
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
      javaCode.append("\n}\n");
    
      context.getKRErrorStack().pop();
    }
     else {
    }
    
    
      java.lang.Boolean idIfCond_299 = false;
      idIfCond_299 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.Operation"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.LambdaExpression"))));
    
      if( idIfCond_299 ) {
    
      javaCode.append("}");
    }
    
    
      result = javaCode.toString();
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean containsRescue()
  {
    
    java.lang.Boolean result = null;
    
      result = false;
    
      java.lang.Boolean idIfCond_300 = false;
      idIfCond_300 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()))), kermeta.standard.helper.IntegerWrapper.isGreater(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Rescue>convertAsOrderedSet(this.getRescueBlock()).size(), 0));
    
      if( idIfCond_300 ) {
    
      result = true;
    }
    
    
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
      case BehaviorPackage.BLOCK__STATEMENT:
        return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
      case BehaviorPackage.BLOCK__RESCUE_BLOCK:
        return ((InternalEList<?>)getRescueBlock()).basicRemove(otherEnd, msgs);
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
      case BehaviorPackage.BLOCK__STATEMENT:
        return getStatement();
      case BehaviorPackage.BLOCK__RESCUE_BLOCK:
        return getRescueBlock();
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
      case BehaviorPackage.BLOCK__STATEMENT:
        getStatement().clear();
        getStatement().addAll((Collection<? extends Expression>)newValue);
        return;
      case BehaviorPackage.BLOCK__RESCUE_BLOCK:
        getRescueBlock().clear();
        getRescueBlock().addAll((Collection<? extends Rescue>)newValue);
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
      case BehaviorPackage.BLOCK__STATEMENT:
        getStatement().clear();
        return;
      case BehaviorPackage.BLOCK__RESCUE_BLOCK:
        getRescueBlock().clear();
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
      case BehaviorPackage.BLOCK__STATEMENT:
        return statement != null && !statement.isEmpty();
      case BehaviorPackage.BLOCK__RESCUE_BLOCK:
        return rescueBlock != null && !rescueBlock.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
