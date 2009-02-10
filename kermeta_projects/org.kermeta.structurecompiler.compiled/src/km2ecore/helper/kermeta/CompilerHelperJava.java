/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CompilerHelperJava.java,v 1.11 2009-02-10 17:51:59 cfaucher Exp $
 */
package km2ecore.helper.kermeta;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.MultiplicityElement;

import kermeta.standard.OrderedSet;
import kermeta.standard.Set;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compiler Helper Java</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see km2ecore.helper.kermeta.KermetaPackage#getCompilerHelperJava()
 * @model annotation="kermeta documentation='/**\n * Class containing some helpers dedicated to the Kermeta compiler\n \052/'"
 * @generated
 */
public interface CompilerHelperJava extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * This helper is used for the pretty printing of the parameters in a CallFeature\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft3 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_14 = false;\n\twhile( !idLoopCond_14 ) {\n\tidLoopCond_14 = it_ft3.isOff();\n\tif ( idLoopCond_14 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp3 = it_ft3.next();\n\n\tjava.lang.Boolean idIfCond_15 = false;\n\tidIfCond_15 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\n\tif( idIfCond_15 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \", \");\n}\n else {\n\n\ti = 1;\n}\n\n\n\tjava.lang.String str_param = \"\";\n\n\tjava.lang.Boolean idIfCond_16 = false;\n\tidIfCond_16 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp3.isFunctionTypeVariable());\n\n\tif( idIfCond_16 ) {\n\n\tstr_param = e_lbdExp3.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_17 = false;\n\tidIfCond_17 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, \"this\"));\n\n\tif( idIfCond_17 ) {\n\n\tstr_param = \"self\";\n}\n\n\n\tjava.lang.Boolean idIfCond_18 = false;\n\tidIfCond_18 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp3.getStaticType().getTypeQName(), \"kermeta::language::structure::Class\"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp3.getStaticType().getTypeQName(), \"kermeta::language::structure::Type\")));\n\n\tif( idIfCond_18 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getJAVA_INSTANCE_EXECUTION_CONTEXT(), \".getMetaClass(\\\"\"), str_param), \"\\\")\");\n}\n\n\n\tjava.lang.Boolean idIfCond_19 = false;\n\tidIfCond_19 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_19 ) {\n\n\tkermeta.language.behavior.Assignment assign_ = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_param, assign_.getValueTypeCastSuffix()), assign_.getCacheCastSuffix());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_20 = false;\n\tidIfCond_20 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_20 ) {\n\n\tjava.lang.Boolean idIfCond_21 = false;\n\tidIfCond_21 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(e_lbdExp3, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_21 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getOBJECT_UTIL_CLASS(), \".convertAsObject(\"), str_param), \")\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.String type_label = \"\";\n\n\tkermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();\n\n\tjava.lang.Boolean idIfCond_22 = false;\n\tidIfCond_22 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp3), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_22 ) {\n\n\tjava.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_23 = false;\n\tidIfCond_23 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(lambdaExp_returnType));\n\n\tif( idIfCond_23 ) {\n\n\ttype_label = lambdaExp_returnType;\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_24 = false;\n\tidIfCond_24 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(type_label, \"\");\n\n\tif( idIfCond_24 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix()), \" = \"), context.getTYPE_SEPARATOR()), type_label));\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp3), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp3), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getBeforeLambdaExpressionResult(), \"\\n\"), type_label), \" result_lambda\"), context.printFtSuffix()), \" = null;\\n\"), e_lbdExp3.createBehaviorJava(context)));\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix());\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tstr_param = e_lbdExp3.createBehaviorJava(context);\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppComaSeparatedNodes(Set<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft4 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_25 = false;\n\twhile( !idLoopCond_25 ) {\n\tidLoopCond_25 = it_ft4.isOff();\n\tif ( idLoopCond_25 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp4 = it_ft4.next();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp4.createBehaviorJava(context));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCRSeparatedNode(OrderedSet<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t *\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_26 = false;\n\tidIfCond_26 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem.getUpper(), 1);\n\n\tif( idIfCond_26 ) {\n\n\tjava.lang.Boolean idIfCond_27 = false;\n\tidIfCond_27 = elem.getIsOrdered();\n\n\tif( idIfCond_27 ) {\n\n\tjava.lang.Boolean idIfCond_28 = false;\n\tidIfCond_28 = elem.getIsUnique();\n\n\tif( idIfCond_28 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.OrderedSet\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Sequence\");\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_29 = false;\n\tidIfCond_29 = elem.getIsUnique();\n\n\tif( idIfCond_29 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Set\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Bag\");\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"<\"), elem.getType().createBehaviorJava(context)), \">\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, elem.getType().createBehaviorJava(context));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppTypeFromMultiplicityElement(MultiplicityElement elem,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Give the pp string corresponding to the CreateFactory in EMF-like of a type\n\t * @deprecated\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_30 = false;\n\tidIfCond_30 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_30 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" = \", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Factory.eINSTANCE.create\"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeCreateFactory(String localType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tlocalType = kermeta.standard.helper.StringWrapper.split(localType, \"<\").first();\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_31 = false;\n\tidIfCond_31 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_31 ) {\n\n\tjava.lang.String class_label = name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1));\n\n\tjava.lang.Boolean idIfCond_32 = false;\n\tidIfCond_32 = kermeta.standard.helper.StringWrapper.equals(class_label, \"Class\");\n\n\tif( idIfCond_32 ) {\n\n\tclass_label = kermeta.standard.helper.StringWrapper.plus(class_label, \"_\");\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(allPackages_label, kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Package.eINSTANCE.get\"), class_label), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeGetEMF(String localType);

} // CompilerHelperJava
