/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: CompilerHelperJava.java,v 1.12 2009-02-23 15:26:55 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft7 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_28 = false;\n\twhile( !idLoopCond_28 ) {\n\tidLoopCond_28 = it_ft7.isOff();\n\tif ( idLoopCond_28 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp7 = it_ft7.next();\n\n\tjava.lang.Boolean idIfCond_29 = false;\n\tidIfCond_29 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\n\tif( idIfCond_29 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \", \");\n}\n else {\n\n\ti = 1;\n}\n\n\n\tjava.lang.String str_param = \"\";\n\n\tjava.lang.Boolean idIfCond_30 = false;\n\tidIfCond_30 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp7.isFunctionTypeVariable());\n\n\tif( idIfCond_30 ) {\n\n\tstr_param = e_lbdExp7.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_31 = false;\n\tidIfCond_31 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, \"this\"));\n\n\tif( idIfCond_31 ) {\n\n\tstr_param = \"self\";\n}\n\n\n\tjava.lang.Boolean idIfCond_32 = false;\n\tidIfCond_32 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp7.getStaticType().getTypeQName(), \"kermeta::language::structure::Class\"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp7.getStaticType().getTypeQName(), \"kermeta::language::structure::Type\")));\n\n\tif( idIfCond_32 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getJAVA_INSTANCE_EXECUTION_CONTEXT(), \".getMetaClass(\\\"\"), str_param), \"\\\")\");\n}\n\n\n\tjava.lang.Boolean idIfCond_33 = false;\n\tidIfCond_33 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_33 ) {\n\n\tkermeta.language.behavior.Assignment assign_ = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_param, assign_.getValueTypeCastSuffix()), assign_.getCacheCastSuffix());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_34 = false;\n\tidIfCond_34 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_34 ) {\n\n\tjava.lang.Boolean idIfCond_35 = false;\n\tidIfCond_35 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(e_lbdExp7, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_35 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getOBJECT_UTIL_CLASS(), \".convertAsObject(\"), str_param), \")\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.String type_label = \"\";\n\n\tkermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();\n\n\tjava.lang.Boolean idIfCond_36 = false;\n\tidIfCond_36 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp7), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_36 ) {\n\n\tjava.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_37 = false;\n\tidIfCond_37 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(lambdaExp_returnType));\n\n\tif( idIfCond_37 ) {\n\n\ttype_label = lambdaExp_returnType;\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_38 = false;\n\tidIfCond_38 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(type_label, \"\");\n\n\tif( idIfCond_38 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix()), \" = \"), context.getTYPE_SEPARATOR()), type_label));\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp7), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp7), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getBeforeLambdaExpressionResult(), \"\\n\"), type_label), \" result_lambda\"), context.printFtSuffix()), \" = null;\\n\"), e_lbdExp7.createBehaviorJava(context)));\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix());\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tstr_param = e_lbdExp7.createBehaviorJava(context);\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppComaSeparatedNodes(Set<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft8 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_39 = false;\n\twhile( !idLoopCond_39 ) {\n\tidLoopCond_39 = it_ft8.isOff();\n\tif ( idLoopCond_39 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp8 = it_ft8.next();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp8.createBehaviorJava(context));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCRSeparatedNode(OrderedSet<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t *\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_40 = false;\n\tidIfCond_40 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem.getUpper(), 1);\n\n\tif( idIfCond_40 ) {\n\n\tjava.lang.Boolean idIfCond_41 = false;\n\tidIfCond_41 = elem.getIsOrdered();\n\n\tif( idIfCond_41 ) {\n\n\tjava.lang.Boolean idIfCond_42 = false;\n\tidIfCond_42 = elem.getIsUnique();\n\n\tif( idIfCond_42 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.OrderedSet\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Sequence\");\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_43 = false;\n\tidIfCond_43 = elem.getIsUnique();\n\n\tif( idIfCond_43 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Set\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Bag\");\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"<\"), elem.getType().createBehaviorJava(context)), \">\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, elem.getType().createBehaviorJava(context));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppTypeFromMultiplicityElement(MultiplicityElement elem,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Give the pp string corresponding to the CreateFactory in EMF-like of a type\n\t * @deprecated\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_44 = false;\n\tidIfCond_44 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_44 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" = \", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Factory.eINSTANCE.create\"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeCreateFactory(String localType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tlocalType = kermeta.standard.helper.StringWrapper.split(localType, \"<\").first();\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_45 = false;\n\tidIfCond_45 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_45 ) {\n\n\tjava.lang.String class_label = name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1));\n\n\tjava.lang.Boolean idIfCond_46 = false;\n\tidIfCond_46 = kermeta.standard.helper.StringWrapper.equals(class_label, \"Class\");\n\n\tif( idIfCond_46 ) {\n\n\tclass_label = kermeta.standard.helper.StringWrapper.plus(class_label, \"_\");\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(allPackages_label, kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Package.eINSTANCE.get\"), class_label), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeGetEMF(String localType);

} // CompilerHelperJava
