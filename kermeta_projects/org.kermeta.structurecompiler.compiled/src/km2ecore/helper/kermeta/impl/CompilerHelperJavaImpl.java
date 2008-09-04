/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJavaImpl.java,v 1.1 2008-09-04 15:40:29 cfaucher Exp $
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
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft169 = expressions.iterator();
      java.lang.Boolean idLoopCond_789 = false;
      while( !idLoopCond_789 ) {
      idLoopCond_789 = it_ft169.isOff();
      if ( idLoopCond_789 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Expression e = it_ft169.next();
    
      java.lang.Boolean idIfCond_790 = false;
      idIfCond_790 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);
    
      if( idIfCond_790 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, ", ");
    }
     else {
    
      i = 1;
    }
    
    
      java.lang.String str_param = "";
    
      java.lang.Boolean idIfCond_791 = false;
      idIfCond_791 = kermeta.standard.helper.BooleanWrapper.not(e.isFunctionTypeVariable());
    
      if( idIfCond_791 ) {
    
      str_param = e.createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_792 = false;
      idIfCond_792 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, "this"));
    
      if( idIfCond_792 ) {
    
      str_param = "self";
    }
    
    
      java.lang.Boolean idIfCond_793 = false;
      idIfCond_793 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e.getStaticType().getTypeQName(), "kermeta::language::structure::Class"), kermeta.standard.helper.StringWrapper.equals(e.getStaticType().getTypeQName(), "kermeta::language::structure::Type"));
    
      if( idIfCond_793 ) {
    
      str_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"", str_param), "\")");
    }
    
    }
     else {
    
      java.lang.String type_label = "";
    
      kermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();
    
      java.lang.Boolean idIfCond_794 = false;
      idIfCond_794 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.CallFeature")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType")));
    
      if( idIfCond_794 ) {
    
      java.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.structure.FunctionType"))).getRight().createBehaviorJava(context);
    
      java.lang.Boolean idIfCond_795 = false;
      idIfCond_795 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject("kermeta.language.structure.Operation")).isVoidType(lambdaExp_returnType));
    
      if( idIfCond_795 ) {
    
      type_label = lambdaExp_returnType;
    }
    
    }
    
    
      java.lang.Boolean idIfCond_796 = false;
      idIfCond_796 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(type_label, "");
    
      if( idIfCond_796 ) {
    
      context.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus("result_lambda = ", context.getTYPE_SEPARATOR()), type_label));
    
      ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("kermeta.language.behavior.Expression"))).getBeforeLambdaExpressionResult(), "\n"), type_label), " result_lambda = null;\n"), e.createBehaviorJava(context)));
    
      str_param = "result_lambda";
    
      context.getResultLastStatementStack().pop();
    }
     else {
    
      str_param = e.createBehaviorJava(context);
    }
    
    }
    
    
      result = kermeta.standard.helper.StringWrapper.plus(result, str_param);
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
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
    
      //Beginning of the Inlining of the function type: each
    
      
    {
    
      kermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft170 = expressions.iterator();
      java.lang.Boolean idLoopCond_797 = false;
      while( !idLoopCond_797 ) {
      idLoopCond_797 = it_ft170.isOff();
      if ( idLoopCond_797 ) {
      } else {
    
      //Beginning of the Inlining of the lambda expression: func
    kermeta.language.behavior.Expression e = it_ft170.next();
    
      result = kermeta.standard.helper.StringWrapper.plus(result, e.createBehaviorJava(context));
    //End of the Inlining of the lambda expression: func
    
    }
      }
    }
    
    //End of the Inlining of the function type: each
    
    
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
    
      java.lang.Boolean idIfCond_798 = false;
      idIfCond_798 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem.getUpper(), 1);
    
      if( idIfCond_798 ) {
    
      java.lang.Boolean idIfCond_799 = false;
      idIfCond_799 = elem.getIsOrdered();
    
      if( idIfCond_799 ) {
    
      java.lang.Boolean idIfCond_800 = false;
      idIfCond_800 = elem.getIsUnique();
    
      if( idIfCond_800 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.OrderedSet");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(result, "kermeta.standard.Sequence");
    }
    
    }
     else {
    
      java.lang.Boolean idIfCond_801 = false;
      idIfCond_801 = elem.getIsUnique();
    
      if( idIfCond_801 ) {
    
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
    
      java.lang.Boolean idIfCond_802 = false;
      idIfCond_802 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);
    
      if( idIfCond_802 ) {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), "Factory.eINSTANCE.create"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), "()");
    }
     else {
    
      result = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(" = ", "Factory.eINSTANCE.create"), localType), "()");
    }
    
    
    return result;
    
  }

} //CompilerHelperJavaImpl
