/**
 * <copyright>
 * </copyright>
 *
 * $Id: Expression.java,v 1.10 2009-01-21 09:15:49 cfaucher Exp $
 */
package kermeta.language.behavior;

import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Expression#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}</li>
 *   <li>{@link kermeta.language.behavior.Expression#getIsLastExpression <em>Is Last Expression</em>}</li>
 *   <li>{@link kermeta.language.behavior.Expression#getStaticType <em>Static Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getExpression()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='The base class for every entity used to define a behavior in operation body.'"
 * @generated
 */
public interface Expression extends TypeContainer {
	/**
	 * Returns the value of the '<em><b>Before Lambda Expression Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Lambda Expression Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Lambda Expression Result</em>' attribute.
	 * @see #setBeforeLambdaExpressionResult(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getExpression_BeforeLambdaExpressionResult()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getBeforeLambdaExpressionResult();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Expression#getBeforeLambdaExpressionResult <em>Before Lambda Expression Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Lambda Expression Result</em>' attribute.
	 * @see #getBeforeLambdaExpressionResult()
	 * @generated
	 */
	void setBeforeLambdaExpressionResult(String value);

	/**
	 * Returns the value of the '<em><b>Is Last Expression</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Last Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Last Expression</em>' attribute.
	 * @see #setIsLastExpression(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getExpression_IsLastExpression()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 * @generated
	 */
	Boolean getIsLastExpression();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Expression#getIsLastExpression <em>Is Last Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Last Expression</em>' attribute.
	 * @see #getIsLastExpression()
	 * @generated
	 */
	void setIsLastExpression(Boolean value);

	/**
	 * Returns the value of the '<em><b>Static Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Type</em>' reference.
	 * @see #setStaticType(Type)
	 * @see kermeta.language.behavior.BehaviorPackage#getExpression_StaticType()
	 * @model annotation="kermeta documentation='Type of the Expression (set by type checking)'"
	 * @generated
	 */
	Type getStaticType();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Expression#getStaticType <em>Static Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Type</em>' reference.
	 * @see #getStaticType()
	 * @generated
	 */
	void setStaticType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_385 = false;\n\tidIfCond_385 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getCompiledJavaExtern(), \"\"), kermeta.standard.helper.StringWrapper.equals(context.getCompiledJavaExtern(), \"\"));\n\n\tif( idIfCond_385 ) {\n\n\tcontext.setCompiledJavaExtern(this.getCompiledJavaExtern());\n\n\tjava.lang.Boolean idIfCond_386 = false;\n\tidIfCond_386 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\")))));\n\n\tif( idIfCond_386 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.split(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"(\", \"%\"), \"%\").first());\n}\n\n\n\tjava.lang.Boolean idIfCond_387 = false;\n\tidIfCond_387 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode());\n\n\tif( idIfCond_387 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"this\", \"self\"));\n}\n\n}\n\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Check if the current element is at the end of an Expression, if so a \";\" is added\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_388 = false;\n\tidIfCond_388 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());\n\n\tif( idIfCond_388 ) {\n\n\tjava.lang.Boolean idIfCond_389 = false;\n\tidIfCond_389 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Loop\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Rescue\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")));\n\n\tif( idIfCond_389 ) {\n\n\tjava.lang.Boolean idIfCond_390 = false;\n\tidIfCond_390 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_390 ) {\n\n\tkermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tjava.lang.Boolean idIfCond_391 = false;\n\tidIfCond_391 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(assignment.getTarget(), this);\n\n\tif( idIfCond_391 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_392 = false;\n\tidIfCond_392 = assignment.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_392 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_393 = false;\n\tidIfCond_393 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(assignment), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_393 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValueTypeCastSuffix(), ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getCacheCastSuffix()), \";\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tresult = \";\";\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String endOfExpressionFixer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_394 = false;\n\tidIfCond_394 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\")));\n\n\tif( idIfCond_394 ) {\n\n\tresult = true;\n}\n\n\n\tjava.lang.Boolean idIfCond_395 = false;\n\tidIfCond_395 = this.isFunctionTypeVariable();\n\n\tif( idIfCond_395 ) {\n\n\tresult = false;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeAssigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.utils.StringBuffer result = null;\n\n\tkermeta.language.behavior.Expression stm = this;\n\n\tjava.lang.String str_statement = kermeta.standard.helper.StringWrapper.normalizeStatement(stm.createBehaviorJava(context));\n\n\tkermeta.standard.Sequence<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());\n\n\tjava.lang.Boolean idIfCond_396 = false;\n\tidIfCond_396 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);\n\n\tif( idIfCond_396 ) {\n\n\tjava.lang.String s1 = str_statement_splitted.first();\n\n\tjava.lang.String s2 = str_statement_splitted.last();\n\n\tjava.lang.Boolean idIfCond_397 = false;\n\tidIfCond_397 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());\n\n\tif( idIfCond_397 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);\n}\n\n}\n\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), \"//\"), \"//\");\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getRETURN_EXPRESSION_TO_REPLACE(), \"result\"), \"result\");\n\n\tjavaCode.append(context.getBeforeLambdaExpressionResult());\n\n\tcontext.setBeforeLambdaExpressionResult(\"\");\n\n\tjavaCode.append(\"\\n\\t\");\n\n\tjava.lang.Boolean idIfCond_398 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft125 = null;\n\n\tjava.lang.Boolean idIfCond_399 = false;\n\tidIfCond_399 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getIsLastExpression()));\n\n\tif( idIfCond_399 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object i_lbdExp125 = null;\n\n\tresult_ft125 = this.getIsLastExpression();\n//EIle:right\n\n}\n else {\n\n\tresult_ft125 = false;\n}\n\n\n//CEC\nidIfCond_398 = result_ft125;\n//EIft:andThen\n\n\n\tif( idIfCond_398 ) {\n\n\tjava.lang.Boolean idIfCond_400 = false;\n\tidIfCond_400 = stm.mustBeAssigned();\n\n\tif( idIfCond_400 ) {\n\n\tjava.lang.Boolean idIfCond_401 = false;\n\tidIfCond_401 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_401 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_402 = false;\n\tidIfCond_402 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().getTypeName());\n\n\tif( idIfCond_402 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_403 = false;\n\tidIfCond_403 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\"))), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_403 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_404 = false;\n\tidIfCond_404 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_404 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_405 = false;\n\tidIfCond_405 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_405 ) {\n\n\tjava.lang.Boolean idIfCond_406 = false;\n\tidIfCond_406 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_406 ) {\n\n\tjava.lang.Boolean idIfCond_407 = false;\n\tidIfCond_407 = stm.callsFunctionType();\n\n\tif( idIfCond_407 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_statement, context.getResultLastStatementId()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), \";\\n\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_408 = false;\n\tidIfCond_408 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_408 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), context.getResultLastStatementId());\n}\n else {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_409 = false;\n\tidIfCond_409 = stm.mustBeAssigned();\n\n\tif( idIfCond_409 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_410 = false;\n\tidIfCond_410 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_410 ) {\n\n\tjava.lang.Boolean idIfCond_411 = false;\n\tidIfCond_411 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.contains(str_statement, kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\\\"\", context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()), \"\\\")\")));\n\n\tif( idIfCond_411 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), \"\");\n}\n\n}\n\n\n\tjavaCode.append(str_statement);\n\n\tresult = javaCode;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.utils.StringBuffer createExpression(KM2EcoreContext context,
			kermeta.utils.StringBuffer javaCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_412 = false;\n\tidIfCond_412 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_412 ) {\n\n\tjava.lang.Boolean idIfCond_413 = false;\n\tidIfCond_413 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).isFunctionTypeVariable();\n\n\tif( idIfCond_413 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionTypeVariable();

} // Expression
