/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallVariable.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.Parameter;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getCallVariable()
 * @model annotation="kermeta documentation='We call \"CallVariable\" the use of a variable in a statement.\nin <code>i := j + 1</code>, i and j are 2 CallVariables.'"
 * @generated
 */
public interface CallVariable extends CallExpression {
	/**
	 * Returns the value of the '<em><b>Is Atpre</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atpre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atpre</em>' attribute.
	 * @see #setIsAtpre(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getCallVariable_IsAtpre()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Tells whether this CallVariable represents a call to @pre in a postcondition'"
	 * @generated
	 */
	Boolean getIsAtpre();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.CallVariable#getIsAtpre <em>Is Atpre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atpre</em>' attribute.
	 * @see #getIsAtpre()
	 * @generated
	 */
	void setIsAtpre(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_388 = false;\n\tidIfCond_388 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.retrieveCorrespondingParameter()));\n\n\tif( idIfCond_388 ) {\n\n\tjava.lang.Boolean idIfCond_389 = false;\n\tidIfCond_389 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(this.retrieveCorrespondingParameter().getUpper(), 1);\n\n\tif( idIfCond_389 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterForOwningOperationMany();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::CallExpression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_390 = false;\n\tidIfCond_390 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.StringWrapper.equals(context.getTasks_stack().peek(), \"FunctionType_Compilation\"), kermeta.standard.helper.StringWrapper.equals(context.getCurrent_param_ft(), this.getName()));\n\n\tif( idIfCond_390 ) {\n\n\tcontext.getTasks_stack().pop();\n\n\tcontext.setFtSuffixActivation(false);\n\n\tkermeta.language.behavior.LambdaExpression theLambdaExp = context.getFtStack().pop();\n\n\tjava.lang.String str_toInclude = \"\";\n\n\tjava.lang.Boolean idIfCond_391 = false;\n\tidIfCond_391 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"));\n\n\tif( idIfCond_391 ) {\n\n\tjava.lang.String lambdaExp_returnType = ((kermeta.language.structure.FunctionType) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(theLambdaExp.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\"))).getRight().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = kermeta.standard.helper.BooleanWrapper.not(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.language.structure.Operation\")).isVoidType(lambdaExp_returnType));\n\n\tif( idIfCond_392 ) {\n}\n\n}\n\n\n\tjava.lang.Integer inc_param = 0;\n\n\t//Beginning of the Inlining of the function type: each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.LambdaParameter> it_ft91 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.LambdaParameter>convertAsOrderedSet(theLambdaExp.getParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_393 = false;\n\twhile( !idLoopCond_393 ) {\n\tidLoopCond_393 = it_ft91.isOff();\n\tif ( idLoopCond_393 ) {\n\t} else {\n\n\t//Beginning of the Inlining of the lambda expression: func\nkermeta.language.behavior.LambdaParameter p = it_ft91.next();\n\n\tjava.lang.String type_param_ = context.getFtProductTypeStack().peek().getTypeByIndex(inc_param).createBehaviorJava(context);\n\n\tstr_toInclude = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_toInclude, type_param_), \" \"), p.getName());\n\n\tcontext.setFtSuffixActivation(true);\n\n\tstr_toInclude = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_toInclude, \" = \"), org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(this.getParameters()).elementAt(inc_param).createBehaviorJava(context)), \";\\n\");\n\n\tcontext.setFtSuffixActivation(false);\n\n\tinc_param = kermeta.standard.helper.IntegerWrapper.plus(inc_param, 1);\n//End of the Inlining of the lambda expression: func\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: each\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"//Beginning of the Inlining of the lambda expression: \"), this.getName()), \"\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, str_toInclude), theLambdaExp.getBody().createBehaviorJava(context));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"//End of the Inlining of the lambda expression: \"), this.getName()), \"\\n\");\n\n\tcontext.setFtSuffixActivation(true);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = kermeta.standard.helper.StringWrapper.equals(this.getName(), \"stdio\");\n\n\tif( idIfCond_394 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"org.kermeta.compil.runtime.helper.io.StdIOUtil\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(this.isParameter()), kermeta.standard.helper.BooleanWrapper.not(this.isParameterForOwningOperation()));\n\n\tif( idIfCond_395 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context)), context.printFtSuffix());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_396 = false;\n\tidIfCond_396 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(this.isParameterSingle(), this.isParameterForOwningOperationSingle()), this.isParameterManyAndForOwningOperation());\n\n\tif( idIfCond_396 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context)), context.printFtSuffix());\n}\n else {\n\n\tkermeta.language.structure.Parameter c_param = null;\n\n\tjava.lang.Boolean idIfCond_397 = false;\n\tidIfCond_397 = this.isParameterForOwningOperation();\n\n\tif( idIfCond_397 ) {\n\n\tc_param = this.retrieveCorrespondingParameter();\n}\n else {\n\n\tc_param = this.getCallFeatureCorrespondingParameter();\n}\n\n\n\tjava.lang.String type_binding = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.TypeVariableBinding>convertAsOrderedSet(((kermeta.language.structure.Class) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getStaticType(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Class\"))).getTypeParamBinding()).one().getType().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_398 = false;\n\tidIfCond_398 = this.isParameterMany();\n\n\tif( idIfCond_398 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), \".<\"), type_binding), \">convertAsEList(\"), result);\n}\n else {\n\n\tjava.lang.Boolean idIfCond_399 = false;\n\tidIfCond_399 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(c_param.getIsUnique()), kermeta.standard.helper.BooleanWrapper.not(c_param.getIsOrdered()));\n\n\tif( idIfCond_399 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), \".<\"), type_binding), \">convertAsBag(\"), result);\n}\n\n\n\tjava.lang.Boolean idIfCond_400 = false;\n\tidIfCond_400 = kermeta.standard.helper.BooleanWrapper.and(c_param.getIsUnique(), kermeta.standard.helper.BooleanWrapper.not(c_param.getIsOrdered()));\n\n\tif( idIfCond_400 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), \".<\"), type_binding), \">convertAsSet(\"), result);\n}\n\n\n\tjava.lang.Boolean idIfCond_401 = false;\n\tidIfCond_401 = kermeta.standard.helper.BooleanWrapper.and(c_param.getIsUnique(), c_param.getIsOrdered());\n\n\tif( idIfCond_401 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), \".<\"), type_binding), \">convertAsOrderedSet(\"), result);\n}\n\n\n\tjava.lang.Boolean idIfCond_402 = false;\n\tidIfCond_402 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.not(c_param.getIsUnique()), c_param.getIsOrdered());\n\n\tif( idIfCond_402 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getCOLLECTION_UTIL_CLASS(), \".<\"), type_binding), \">convertAsSequence(\"), result);\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"km2ecore.helper.java.IdentifierHelper\")).getMangledIdentifier(this.getName(), context)), context.printFtSuffix()), \")\");\n}\n\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_403 = false;\n\tidIfCond_403 = kermeta.standard.helper.BooleanWrapper.and(this.isParameterMany(), this.isParameterForOwningOperation());\n\n\tif( idIfCond_403 ) {\n\n\tresult = true;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterManyAndForOwningOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Parameter result = null;\n\n\tkermeta.language.structure.Parameter ftParam = this.retrieveCorrespondingParameter();\n\n\tjava.lang.Boolean idIfCond_404 = false;\n\tidIfCond_404 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ftParam));\n\n\tif( idIfCond_404 ) {\n\n\tjava.lang.Boolean idIfCond_405 = false;\n\tidIfCond_405 = ftParam.isFunctionType();\n\n\tif( idIfCond_405 ) {\n\n\tresult = ftParam;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Parameter getFunctionTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Parameter result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_406 = false;\n\tidIfCond_406 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))));\n\n\tif( idIfCond_406 ) {\n\n\tresult = null;\n//Beginning of the Inlining of the function type: detect\n\nkermeta.language.structure.Parameter result_ft92 = null;\n\n\tkermeta.language.structure.Parameter elem_ft92 = null;\n\n\tresult_ft92 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft92 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_407 = false;\n\twhile( !idLoopCond_407 ) {\n\tidLoopCond_407 = kermeta.standard.helper.BooleanWrapper.or(it_ft92.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft92, null));\n\tif ( idLoopCond_407 ) {\n\t} else {\n\n\telem_ft92 = it_ft92.next();\n\n\tjava.lang.Boolean idIfCond_408 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.structure.Parameter p = elem_ft92;\n\n\tidIfCond_408 = kermeta.standard.helper.StringWrapper.equals(p.getName(), this.getName());\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_408 ) {\n\n\tresult_ft92 = elem_ft92;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Parameter retrieveCorrespondingParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_409 = false;\n\tidIfCond_409 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_409 ) {\n\n\tkermeta.language.behavior.Expression exp = null;\n//Beginning of the Inlining of the function type: detect\n\nkermeta.language.behavior.Expression result_ft93 = null;\n\n\tkermeta.language.behavior.Expression elem_ft93 = null;\n\n\tresult_ft93 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft93 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_410 = false;\n\twhile( !idLoopCond_410 ) {\n\tidLoopCond_410 = kermeta.standard.helper.BooleanWrapper.or(it_ft93.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft93, null));\n\tif ( idLoopCond_410 ) {\n\t} else {\n\n\telem_ft93 = it_ft93.next();\n\n\tjava.lang.Boolean idIfCond_411 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.behavior.Expression p = elem_ft93;\n\n\tidIfCond_411 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(p, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_411 ) {\n\n\tresult_ft93 = elem_ft93;\n}\n\n}\n\t}\n}\n\n\n//callElement\nexp = result_ft93;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_412 = false;\n\tidIfCond_412 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(exp));\n\n\tif( idIfCond_412 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Parameter result = null;\n\n\tresult = null;\n\n\tjava.lang.Boolean idIfCond_413 = false;\n\tidIfCond_413 = this.isParameter();\n\n\tif( idIfCond_413 ) {\n\n\tkermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")));\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.behavior.Expression exp = null;\n//Beginning of the Inlining of the function type: detect\n\nkermeta.language.behavior.Expression result_ft94 = null;\n\n\tkermeta.language.behavior.Expression elem_ft94 = null;\n\n\tresult_ft94 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft94 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(cf_.getParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_414 = false;\n\twhile( !idLoopCond_414 ) {\n\tidLoopCond_414 = kermeta.standard.helper.BooleanWrapper.or(it_ft94.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft94, null));\n\tif ( idLoopCond_414 ) {\n\t} else {\n\n\telem_ft94 = it_ft94.next();\n\n\tjava.lang.Boolean idIfCond_415 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.behavior.Expression p = elem_ft94;\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_415 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(p, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_415 ) {\n\n\tresult_ft94 = elem_ft94;\n}\n\n}\n\t}\n}\n\n\n//callElement\nexp = result_ft94;\n//End of the Inlining of the function type: detect\n\n\n\tresult = ((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(cf_.getStaticOperation().getOwnedParameter()).elementAt(i), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Parameter\")));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Parameter getCallFeatureCorrespondingParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_416 = false;\n\tidIfCond_416 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.retrieveCorrespondingParameter()));\n\n\tif( idIfCond_416 ) {\n\n\tjava.lang.Boolean idIfCond_417 = false;\n\tidIfCond_417 = kermeta.standard.helper.IntegerWrapper.equals(this.retrieveCorrespondingParameter().getUpper(), 1);\n\n\tif( idIfCond_417 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterForOwningOperationSingle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_418 = false;\n\tidIfCond_418 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")))));\n\n\tif( idIfCond_418 ) {\n\n\t//Beginning of the Inlining of the function type: detect\n\nkermeta.language.structure.Parameter result_ft95 = null;\n\n\tkermeta.language.structure.Parameter elem_ft95 = null;\n\n\tresult_ft95 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.structure.Parameter> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\")), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))).getOwnedParameter()).iterator();\n\tjava.lang.Boolean idLoopCond_419 = false;\n\twhile( !idLoopCond_419 ) {\n\tidLoopCond_419 = kermeta.standard.helper.BooleanWrapper.or(it_ft95.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft95, null));\n\tif ( idLoopCond_419 ) {\n\t} else {\n\n\telem_ft95 = it_ft95.next();\n\n\tjava.lang.Boolean idIfCond_420 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.structure.Parameter p = elem_ft95;\n\n\tidIfCond_420 = kermeta.standard.helper.StringWrapper.equals(p.getName(), this.getName());\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_420 ) {\n\n\tresult_ft95 = elem_ft95;\n}\n\n}\n\t}\n}\n\n//End of the Inlining of the function type: detect\nresult = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(result_ft95));\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterForOwningOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tkermeta.language.structure.Parameter ftParam = this.retrieveCorrespondingParameter();\n\n\tjava.lang.Boolean idIfCond_421 = false;\n\tidIfCond_421 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ftParam));\n\n\tif( idIfCond_421 ) {\n\n\tjava.lang.Boolean idIfCond_422 = false;\n\tidIfCond_422 = ftParam.isFunctionType();\n\n\tif( idIfCond_422 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionTypeVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_423 = false;\n\tidIfCond_423 = this.isParameter();\n\n\tif( idIfCond_423 ) {\n\n\tkermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")));\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.behavior.Expression exp = null;\n//Beginning of the Inlining of the function type: detect\n\nkermeta.language.behavior.Expression result_ft96 = null;\n\n\tkermeta.language.behavior.Expression elem_ft96 = null;\n\n\tresult_ft96 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft96 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(cf_.getParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_424 = false;\n\twhile( !idLoopCond_424 ) {\n\tidLoopCond_424 = kermeta.standard.helper.BooleanWrapper.or(it_ft96.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft96, null));\n\tif ( idLoopCond_424 ) {\n\t} else {\n\n\telem_ft96 = it_ft96.next();\n\n\tjava.lang.Boolean idIfCond_425 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.behavior.Expression p = elem_ft96;\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_425 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(p, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_425 ) {\n\n\tresult_ft96 = elem_ft96;\n}\n\n}\n\t}\n}\n\n\n//callElement\nexp = result_ft96;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_426 = false;\n\tidIfCond_426 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(cf_.getStaticOperation().getOwnedParameter()).elementAt(i), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Parameter\"))).getUpper(), 1);\n\n\tif( idIfCond_426 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterMany();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_427 = false;\n\tidIfCond_427 = this.isParameter();\n\n\tif( idIfCond_427 ) {\n\n\tkermeta.language.behavior.CallFeature cf_ = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.language.ObjectUtil.container(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")));\n\n\tjava.lang.Integer i = kermeta.standard.helper.IntegerWrapper.uminus(1);\n\n\tkermeta.language.behavior.Expression exp = null;\n//Beginning of the Inlining of the function type: detect\n\nkermeta.language.behavior.Expression result_ft97 = null;\n\n\tkermeta.language.behavior.Expression elem_ft97 = null;\n\n\tresult_ft97 = null;\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.language.behavior.Expression> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.behavior.Expression>convertAsOrderedSet(cf_.getParameters()).iterator();\n\tjava.lang.Boolean idLoopCond_428 = false;\n\twhile( !idLoopCond_428 ) {\n\tidLoopCond_428 = kermeta.standard.helper.BooleanWrapper.or(it_ft97.isOff(), org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqual(result_ft97, null));\n\tif ( idLoopCond_428 ) {\n\t} else {\n\n\telem_ft97 = it_ft97.next();\n\n\tjava.lang.Boolean idIfCond_429 = false;\n//Beginning of the Inlining of the lambda expression: detector\nkermeta.language.behavior.Expression p = elem_ft97;\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n\n\tidIfCond_429 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equals(p, this);\n//End of the Inlining of the lambda expression: detector\n\n\n\tif( idIfCond_429 ) {\n\n\tresult_ft97 = elem_ft97;\n}\n\n}\n\t}\n}\n\n\n//callElement\nexp = result_ft97;\n//End of the Inlining of the function type: detect\n\n\n\tjava.lang.Boolean idIfCond_430 = false;\n\tidIfCond_430 = kermeta.standard.helper.IntegerWrapper.equals(((kermeta.language.structure.Parameter) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.language.structure.Parameter>convertAsOrderedSet(cf_.getStaticOperation().getOwnedParameter()).elementAt(i), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Parameter\"))).getUpper(), 1);\n\n\tif( idIfCond_430 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isParameterSingle();

} // CallVariable
