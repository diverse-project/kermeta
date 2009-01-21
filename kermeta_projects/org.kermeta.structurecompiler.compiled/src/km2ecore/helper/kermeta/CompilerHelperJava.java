/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJava.java,v 1.10 2009-01-21 09:16:06 cfaucher Exp $
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
 * @model annotation="kermeta documentation='/**\r\n * Class containing some helpers dedicated to the Kermeta compiler\r\n \052/'"
 * @generated
 */
public interface CompilerHelperJava extends kermeta.language.structure.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * This helper is used for the pretty printing of the parameters in a CallFeature\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Integer i = 0;\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft247 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_1081 = false;\n\twhile( !idLoopCond_1081 ) {\n\tidLoopCond_1081 = it_ft247.isOff();\n\tif ( idLoopCond_1081 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp247 = it_ft247.next();\n\n\tjava.lang.Boolean idIfCond_1082 = false;\n\tidIfCond_1082 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\n\tif( idIfCond_1082 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \", \");\n}\n else {\n\n\ti = 1;\n}\n\n\n\tjava.lang.String str_param = \"\";\n\n\tjava.lang.Boolean idIfCond_1083 = false;\n\tidIfCond_1083 = kermeta.standard.helper.BooleanWrapper.not(e_lbdExp247.isFunctionTypeVariable());\n\n\tif( idIfCond_1083 ) {\n\n\tstr_param = e_lbdExp247.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_1084 = false;\n\tidIfCond_1084 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, \"this\"));\n\n\tif( idIfCond_1084 ) {\n\n\tstr_param = \"self\";\n}\n\n\n\tjava.lang.Boolean idIfCond_1085 = false;\n\tidIfCond_1085 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp247, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp247, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp247, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(e_lbdExp247, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\")))), kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e_lbdExp247.getStaticType().getTypeQName(), \"kermeta::language::structure::Class\"), kermeta.standard.helper.StringWrapper.equals(e_lbdExp247.getStaticType().getTypeQName(), \"kermeta::language::structure::Type\")));\n\n\tif( idIfCond_1085 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getJAVA_INSTANCE_EXECUTION_CONTEXT(), \".getMetaClass(\\\"\"), str_param), \"\\\")\");\n}\n\n}\n else {\n\n\tjava.lang.String type_label = \"\";\n\n\tkermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();\n\n\tjava.lang.Boolean idIfCond_1086 = false;\n\tidIfCond_1086 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp247), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_1086 ) {\n\n\tjava.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_1087 = false;\n\tidIfCond_1087 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(lambdaExp_returnType));\n\n\tif( idIfCond_1087 ) {\n\n\ttype_label = lambdaExp_returnType;\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_1088 = false;\n\tidIfCond_1088 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(type_label, \"\");\n\n\tif( idIfCond_1088 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix()), \" = \"), context.getTYPE_SEPARATOR()), type_label));\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp247), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(e_lbdExp247), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getBeforeLambdaExpressionResult(), \"\\n\"), type_label), \" result_lambda\"), context.printFtSuffix()), \" = null;\\n\"), e_lbdExp247.createBehaviorJava(context)));\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(\"result_lambda\", context.printFtSuffix());\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tstr_param = e_lbdExp247.createBehaviorJava(context);\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_param);\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppComaSeparatedNodes(Set<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft248 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_1089 = false;\n\twhile( !idLoopCond_1089 ) {\n\tidLoopCond_1089 = it_ft248.isOff();\n\tif ( idLoopCond_1089 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.language.behavior.Expression e_lbdExp248 = it_ft248.next();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e_lbdExp248.createBehaviorJava(context));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCRSeparatedNode(OrderedSet<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t *\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_1090 = false;\n\tidIfCond_1090 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(elem.getUpper(), 1);\n\n\tif( idIfCond_1090 ) {\n\n\tjava.lang.Boolean idIfCond_1091 = false;\n\tidIfCond_1091 = elem.getIsOrdered();\n\n\tif( idIfCond_1091 ) {\n\n\tjava.lang.Boolean idIfCond_1092 = false;\n\tidIfCond_1092 = elem.getIsUnique();\n\n\tif( idIfCond_1092 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.OrderedSet\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Sequence\");\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_1093 = false;\n\tidIfCond_1093 = elem.getIsUnique();\n\n\tif( idIfCond_1093 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Set\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Bag\");\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"<\"), elem.getType().createBehaviorJava(context)), \">\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, elem.getType().createBehaviorJava(context));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppTypeFromMultiplicityElement(MultiplicityElement elem,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Give the pp string corresponding to the CreateFactory in EMF-like of a type\r\n\t * @deprecated\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_1094 = false;\n\tidIfCond_1094 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_1094 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" = \", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Factory.eINSTANCE.create\"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeCreateFactory(String localType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tlocalType = kermeta.standard.helper.StringWrapper.split(localType, \"<\").first();\n\n\tkermeta.standard.Sequence<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_1095 = false;\n\tidIfCond_1095 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_1095 ) {\n\n\tjava.lang.String class_label = name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1));\n\n\tjava.lang.Boolean idIfCond_1096 = false;\n\tidIfCond_1096 = kermeta.standard.helper.StringWrapper.equals(class_label, \"Class\");\n\n\tif( idIfCond_1096 ) {\n\n\tclass_label = kermeta.standard.helper.StringWrapper.plus(class_label, \"_\");\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(allPackages_label, kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Package.eINSTANCE.get\"), class_label), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeGetEMF(String localType);

} // CompilerHelperJava
