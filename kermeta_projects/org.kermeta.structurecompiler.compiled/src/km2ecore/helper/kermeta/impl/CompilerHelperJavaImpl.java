/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.4 2008-10-08 14:37:31 cfaucher Exp $
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
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft237 = expressions.iterator();
      java.lang.Boolean idLoopCond_1035 = false;
      while( !idLoopCond_1035 ) {
      idLoopCond_1035 = it_ft237.isOff();
      if ( idLoopCond_1035 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp237 = it_ft237.next();
    
      java.lang.Boolean idIfCond_1036 = false;
      idIfCond_1036 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);
    
      if( idIfCond_1036 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
     else {
    
      i = 1;
    }
    
    
      java.lang.String str_param = "";
    
      java.lang.Boolean idIfCond_1037 = false;
      idIfCond_1037 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp237.isFunctionTypeVariable());
    
      if( idIfCond_1037 ) {
    
      str_param = e_lbdExp237.createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_1038 = false;
      idIfCond_1038 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, "this"));
    
      if( idIfCond_1038 ) {
    
      str_param = "self";
    }
    
    
      java.lang.Boolean idIfCond_1039 = false;
      idIfCond_1039 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallVariable"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallResult")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(e_lbdExp237, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.SelfExpression")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp237.getStaticType().getTypeQName(), "kermeta::language::structure::Class"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp237.getStaticType().getTypeQName(), "kermeta::language::structure::Type")));
    
      if( idIfCond_1039 ) {
    
      str_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"", str_param), "\")");
    }
    
    }
     else {
    
      java.lang.String type_label = "";
    
      kermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();
    
      java.lang.Boolean idIfCond_1040 = false;
      idIfCond_1040 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp237), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_1040 ) {
    
      java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getRight().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_1041 = false;
      idIfCond_1041 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(lambdaExp_returnType));
    
      if( idIfCond_1041 ) {
    
      type_label = lambdaExp_returnType;
    }
    
    }
    
    
      java.lang.Boolean idIfCond_1042 = false;
      idIfCond_1042 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(type_label, "");
    
      if( idIfCond_1042 ) {
    
      context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix()), " = "), context.getTYPE_SEPARATOR()), type_label));
    
      ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp237), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e_lbdExp237), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getBeforeLambdaExpressionResult(), "\n"), type_label), " result_lambda"), context.printFtSuffix()), " = null;\n"), e_lbdExp237.createBehaviorJava(context)));
    
      str_param = kermeta.standard.helper.StringWrapper.plus("result_lambda", context.printFtSuffix());
    
      context.getResultLastStatementStack().pop();
    }
     else {
    
      str_param = e_lbdExp237.createBehaviorJava(context);
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
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft238 = expressions.iterator();
      java.lang.Boolean idLoopCond_1043 = false;
      while( !idLoopCond_1043 ) {
      idLoopCond_1043 = it_ft238.isOff();
      if ( idLoopCond_1043 ) {
      } else {
    
      //BIle:func
    kermeta.language.behavior.Expression e_lbdExp238 = it_ft238.next();
    
      result = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp238.createBehaviorJava(context));
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
    
      java.lang.Boolean idIfCond_1044 = false;
      idIfCond_1044 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem.getUpper(), 1);
    
      if( idIfCond_1044 ) {
    
      java.lang.Boolean idIfCond_1045 = false;
      idIfCond_1045 = elem.getIsOrdered();
    
      if( idIfCond_1045 ) {
    
      java.lang.Boolean idIfCond_1046 = false;
      idIfCond_1046 = elem.getIsUnique();
    
      if( idIfCond_1046 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.OrderedSet");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Sequence");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_1047 = false;
      idIfCond_1047 = elem.getIsUnique();
    
      if( idIfCond_1047 ) {
    
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
    
      java.lang.Boolean idIfCond_1048 = false;
      idIfCond_1048 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);
    
      if( idIfCond_1048 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), "Factory.eINSTANCE.create"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), "()");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", "Factory.eINSTANCE.create"), localType), "()");
    }
    
    
    return result;
    
  }

} //CompilerHelperJavaImpl
