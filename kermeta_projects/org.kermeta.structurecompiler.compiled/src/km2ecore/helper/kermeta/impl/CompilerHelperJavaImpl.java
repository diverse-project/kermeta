/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.5 2008-10-16 13:17:43 cfaucher Exp $
 */
package km2ecore.helper.kermeta.impl;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.MultiplicityElement;

import kermeta.language.structure.impl.ObjectImpl;

import kermeta.standard.OrderedSet;
import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

import km2ecore.helper.kermeta.CompilerHelperJava;
import km2ecore.helper.kermeta.KermetaPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compiler Helper Java</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilerHelperJavaImpl extends ObjectImpl implements CompilerHelperJava
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompilerHelperJavaImpl()
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
    return KermetaPackage.Literals.COMPILER_HELPER_JAVA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String ppComaSeparatedNodes(Set<Expression> expressions, KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = "";
    
      java.lang.Integer i = 0;
    
      //BIft:each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft8 = expressions.iterator();
      java.lang.Boolean idLoopCond_30 = false;
      while( !idLoopCond_30 ) {
      idLoopCond_30 = it_ft8.isOff();
      if ( idLoopCond_30 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp8 = it_ft8.next();
    
      java.lang.Boolean idIfCond_31 = false;
      idIfCond_31 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);
    
      if( idIfCond_31 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
     else {
    
      i = 1;
    }
    
    
      java.lang.String str_param = "";
    
      java.lang.Boolean idIfCond_32 = false;
      idIfCond_32 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp8.isFunctionTypeVariable());
    
      if( idIfCond_32 ) {
    
      str_param = e_lbdExp8.createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_33 = false;
      idIfCond_33 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, "this"));
    
      if( idIfCond_33 ) {
    
      str_param = "self";
    }
    
    
      java.lang.Boolean idIfCond_34 = false;
      idIfCond_34 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp8, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp8, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp8, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp8, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp8.getStaticType().getTypeQName(), "kermeta::language::structure::Class"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp8.getStaticType().getTypeQName(), "kermeta::language::structure::Type")));
    
      if( idIfCond_34 ) {
    
      str_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"", str_param), "\")");
    }
    
    }
     else {
    
      java.lang.String type_label = "";
    
      kermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();
    
      java.lang.Boolean idIfCond_35 = false;
      idIfCond_35 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp8), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_35 ) {
    
      java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getRight().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_36 = false;
      idIfCond_36 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(lambdaExp_returnType));
    
      if( idIfCond_36 ) {
    
      type_label = lambdaExp_returnType;
    }
    
    }
    
    
      java.lang.Boolean idIfCond_37 = false;
      idIfCond_37 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(type_label, "");
    
      if( idIfCond_37 ) {
    
      context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix()), " = "), context.getTYPE_SEPARATOR()), type_label));
    
      ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp8), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp8), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getBeforeLambdaExpressionResult(), "\n"), type_label), " result_lambda"), context.printFtSuffix()), " = null;\n"), e_lbdExp8.createBehaviorJava(context)));
    
      str_param = kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix());
    
      context.getResultLastStatementStack().pop();
    }
     else {
    
      str_param = e_lbdExp8.createBehaviorJava(context);
    }
    
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, str_param);
    //EIle:func
    
    }
      }
    }
    
    //EIft:each
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String ppCRSeparatedNode(OrderedSet<Expression> expressions, KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = "";
    
      //BIft:each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft9 = expressions.iterator();
      java.lang.Boolean idLoopCond_38 = false;
      while( !idLoopCond_38 ) {
      idLoopCond_38 = it_ft9.isOff();
      if ( idLoopCond_38 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp9 = it_ft9.next();
    
      result = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp9.createBehaviorJava(context));
    //EIle:func
    
    }
      }
    }
    
    //EIft:each
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String ppTypeFromMultiplicityElement(MultiplicityElement elem, KM2EcoreContext context)
  {
    
    java.lang.String result = null;
    
      result = "";
    
      java.lang.Boolean idIfCond_39 = false;
      idIfCond_39 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem.getUpper(), 1);
    
      if( idIfCond_39 ) {
    
      java.lang.Boolean idIfCond_40 = false;
      idIfCond_40 = elem.getIsOrdered();
    
      if( idIfCond_40 ) {
    
      java.lang.Boolean idIfCond_41 = false;
      idIfCond_41 = elem.getIsUnique();
    
      if( idIfCond_41 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.OrderedSet");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Sequence");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_42 = false;
      idIfCond_42 = elem.getIsUnique();
    
      if( idIfCond_42 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Set");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Bag");
    }
    
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, "<"), elem.getType().createBehaviorJava(context)), ">");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, elem.getType().createBehaviorJava(context));
    }
    
    
    return result;
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String ppEmfLikeCreateFactory(String localType)
  {
    
    java.lang.String result = null;
    
      result = "";
    
      kermeta.standard.OrderedSet<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, "\\.");
    
      java.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));
    
      java.lang.Boolean idIfCond_43 = false;
      idIfCond_43 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);
    
      if( idIfCond_43 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), "Factory.eINSTANCE.create"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), "()");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", "Factory.eINSTANCE.create"), localType), "()");
    }
    
    
    return result;
    
  }

} //CompilerHelperJavaImpl
