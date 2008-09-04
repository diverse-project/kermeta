/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompilerHelperJava.java,v 1.1 2008-09-04 15:40:42 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Integer i = 0;\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft169 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_789 = false;\n\twhile( !idLoopCond_789 ) {\n\tidLoopCond_789 = it_ft169.isOff();\n\tif ( idLoopCond_789 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.Expression e = it_ft169.next();\n\n\tjava.lang.Boolean idIfCond_790 = false;\n\tidIfCond_790 = kermeta.standard.helper.IntegerWrapper.equals(i, 1);\n\n\tif( idIfCond_790 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \", \");\n}\n else {\n\n\ti = 1;\n}\n\n\n\tjava.lang.String str_param = \"\";\n\n\tjava.lang.Boolean idIfCond_791 = false;\n\tidIfCond_791 = kermeta.standard.helper.BooleanWrapper.not(e.isFunctionTypeVariable());\n\n\tif( idIfCond_791 ) {\n\n\tstr_param = e.createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_792 = false;\n\tidIfCond_792 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(context.getCurrent_valueType())), context.getStaticOperationMode()), kermeta.standard.helper.StringWrapper.equals(str_param, \"this\"));\n\n\tif( idIfCond_792 ) {\n\n\tstr_param = \"self\";\n}\n\n\n\tjava.lang.Boolean idIfCond_793 = false;\n\tidIfCond_793 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.StringWrapper.equals(e.getStaticType().getTypeQName(), \"kermeta::language::structure::Class\"), kermeta.standard.helper.StringWrapper.equals(e.getStaticType().getTypeQName(), \"kermeta::language::structure::Type\"));\n\n\tif( idIfCond_793 ) {\n\n\tstr_param = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\\\"\", str_param), \"\\\")\");\n}\n\n}\n else {\n\n\tjava.lang.String type_label = \"\";\n\n\tkermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().peek();\n\n\tjava.lang.Boolean idIfCond_794 = false;\n\tidIfCond_794 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")));\n\n\tif( idIfCond_794 ) {\n\n\tjava.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_795 = false;\n\tidIfCond_795 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(lambdaExp_returnType));\n\n\tif( idIfCond_795 ) {\n\n\ttype_label = lambdaExp_returnType;\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_796 = false;\n\tidIfCond_796 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(type_label, \"\");\n\n\tif( idIfCond_796 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"result_lambda = \", context.getTYPE_SEPARATOR()), type_label));\n\n\t((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).setBeforeLambdaExpressionResult(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(e), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getBeforeLambdaExpressionResult(), \"\\n\"), type_label), \" result_lambda = null;\\n\"), e.createBehaviorJava(context)));\n\n\tstr_param = \"result_lambda\";\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tstr_param = e.createBehaviorJava(context);\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_param);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppComaSeparatedNodes(Set<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft170 = expressions.iterator();\n\tjava.lang.Boolean idLoopCond_797 = false;\n\twhile( !idLoopCond_797 ) {\n\tidLoopCond_797 = it_ft170.isOff();\n\tif ( idLoopCond_797 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.Expression e = it_ft170.next();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, e.createBehaviorJava(context));\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCRSeparatedNode(OrderedSet<Expression> expressions,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t *\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_798 = false;\n\tidIfCond_798 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(elem.getUpper(), 1);\n\n\tif( idIfCond_798 ) {\n\n\tjava.lang.Boolean idIfCond_799 = false;\n\tidIfCond_799 = elem.getIsOrdered();\n\n\tif( idIfCond_799 ) {\n\n\tjava.lang.Boolean idIfCond_800 = false;\n\tidIfCond_800 = elem.getIsUnique();\n\n\tif( idIfCond_800 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.OrderedSet\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Sequence\");\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_801 = false;\n\tidIfCond_801 = elem.getIsUnique();\n\n\tif( idIfCond_801 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Set\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"kermeta.standard.Bag\");\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"<\"), elem.getType().createBehaviorJava(context)), \">\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, elem.getType().createBehaviorJava(context));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppTypeFromMultiplicityElement(MultiplicityElement elem,
			KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString" localTypeDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Give the pp string corresponding to the CreateFactory in EMF-like of a type\n\t * @deprecated\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tkermeta.standard.OrderedSet<java.lang.String> name_set = kermeta.standard.helper.StringWrapper.split(localType, \"\\.\");\n\n\tjava.lang.String allPackages_label = kermeta.standard.helper.StringWrapper.substring(localType, 0, kermeta.standard.helper.IntegerWrapper.minus(kermeta.standard.helper.StringWrapper.size(localType), kermeta.standard.helper.StringWrapper.size(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1)))));\n\n\tjava.lang.Boolean idIfCond_802 = false;\n\tidIfCond_802 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(name_set.size(), 2);\n\n\tif( idIfCond_802 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" = \", allPackages_label), kermeta.standard.helper.StringWrapper.capName(name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 2)))), \"Factory.eINSTANCE.create\"), name_set.elementAt(kermeta.standard.helper.IntegerWrapper.minus(name_set.size(), 1))), \"()\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\" = \", \"Factory.eINSTANCE.create\"), localType), \"()\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppEmfLikeCreateFactory(String localType);

} // CompilerHelperJava
