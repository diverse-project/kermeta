/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.3 2008-09-22 14:49:02 cfaucher Exp $
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
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft239 = expressions.iterator();
      java.lang.Boolean idLoopCond_1019 = false;
      while( !idLoopCond_1019 ) {
      idLoopCond_1019 = it_ft239.isOff();
      if ( idLoopCond_1019 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp239 = it_ft239.next();
    
      java.lang.Boolean idIfCond_1020 = false;
      idIfCond_1020 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);
    
      if( idIfCond_1020 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
     else {
    
      i = 1;
    }
    
    
      java.lang.String str_param = "";
    
      java.lang.Boolean idIfCond_1021 = false;
      idIfCond_1021 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp239.isFunctionTypeVariable());
    
      if( idIfCond_1021 ) {
    
      str_param = e_lbdExp239.createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_1022 = false;
      idIfCond_1022 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, "this"));
    
      if( idIfCond_1022 ) {
    
      str_param = "self";
    }
    
    
      java.lang.Boolean idIfCond_1023 = false;
      idIfCond_1023 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp239, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp239, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp239, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp239, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp239.getStaticType().getTypeQName(), "kermeta::language::structure::Class"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp239.getStaticType().getTypeQName(), "kermeta::language::structure::Type")));
    
      if( idIfCond_1023 ) {
    
      str_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"", str_param), "\")");
    }
    
    }
     else {
    
      java.lang.String type_label = "";
    
      kermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();
    
      java.lang.Boolean idIfCond_1024 = false;
      idIfCond_1024 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp239), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_1024 ) {
    
      java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getRight().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_1025 = false;
      idIfCond_1025 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(lambdaExp_returnType));
    
      if( idIfCond_1025 ) {
    
      type_label = lambdaExp_returnType;
    }
    
    }
    
    
      java.lang.Boolean idIfCond_1026 = false;
      idIfCond_1026 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(type_label, "");
    
      if( idIfCond_1026 ) {
    
      context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix()), " = "), context.getTYPE_SEPARATOR()), type_label));
    
      ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp239), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp239), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getBeforeLambdaExpressionResult(), "\n"), type_label), " result_lambda"), context.printFtSuffix()), " = null;\n"), e_lbdExp239.createBehaviorJava(context)));
    
      str_param = kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix());
    
      context.getResultLastStatementStack().pop();
    }
     else {
    
      str_param = e_lbdExp239.createBehaviorJava(context);
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
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft240 = expressions.iterator();
      java.lang.Boolean idLoopCond_1027 = false;
      while( !idLoopCond_1027 ) {
      idLoopCond_1027 = it_ft240.isOff();
      if ( idLoopCond_1027 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp240 = it_ft240.next();
    
      result = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp240.createBehaviorJava(context));
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
    
      java.lang.Boolean idIfCond_1028 = false;
      idIfCond_1028 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem.getUpper(), 1);
    
      if( idIfCond_1028 ) {
    
      java.lang.Boolean idIfCond_1029 = false;
      idIfCond_1029 = elem.getIsOrdered();
    
      if( idIfCond_1029 ) {
    
      java.lang.Boolean idIfCond_1030 = false;
      idIfCond_1030 = elem.getIsUnique();
    
      if( idIfCond_1030 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.OrderedSet");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Sequence");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_1031 = false;
      idIfCond_1031 = elem.getIsUnique();
    
      if( idIfCond_1031 ) {
    
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
    
      java.lang.Boolean idIfCond_1032 = false;
      idIfCond_1032 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);
    
      if( idIfCond_1032 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), "Factory.eINSTANCE.create"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), "()");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", "Factory.eINSTANCE.create"), localType), "()");
    }
    
    
    return result;
    
  }

} //CompilerHelperJavaImpl
