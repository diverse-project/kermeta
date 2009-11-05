/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 *        annotation="kermeta ecore='true'"
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
	 * @model annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Type of the Expression (set by type checking)'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_8 = false;\n\tidIfCond_8 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getCompiledJavaExtern(), \"\"), kermeta.standard.helper.StringWrapper.equals(context.getCompiledJavaExtern(), \"\"));\n\n\tif( idIfCond_8 ) {\n\n\tcontext.setCompiledJavaExtern(this.getCompiledJavaExtern());\n\n\tjava.lang.Boolean idIfCond_9 = false;\n\tidIfCond_9 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\")))));\n\n\tif( idIfCond_9 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.split(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"(\", \"%\"), \"%\").first());\n}\n\n\n\tjava.lang.Boolean idIfCond_10 = false;\n\tidIfCond_10 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode());\n\n\tif( idIfCond_10 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"this\", \"self\"));\n}\n\n}\n\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Check if the current element is at the end of an Expression, if so a \";\" is added\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_11 = false;\n\tidIfCond_11 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());\n\n\tif( idIfCond_11 ) {\n\n\tjava.lang.Boolean idIfCond_12 = false;\n\tidIfCond_12 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Loop\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Rescue\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")));\n\n\tif( idIfCond_12 ) {\n\n\tjava.lang.Boolean idIfCond_13 = false;\n\tidIfCond_13 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_13 ) {\n\n\tkermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tjava.lang.Boolean idIfCond_14 = false;\n\tidIfCond_14 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(assignment.getTarget(), this);\n\n\tif( idIfCond_14 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_15 = false;\n\tidIfCond_15 = assignment.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_15 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_16 = false;\n\tidIfCond_16 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(assignment), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_16 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValueTypeCastSuffix(), ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getCacheCastSuffix()), \";\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tresult = \";\";\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String endOfExpressionFixer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_17 = false;\n\tidIfCond_17 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\")));\n\n\tif( idIfCond_17 ) {\n\n\tresult = true;\n}\n\n\n\tjava.lang.Boolean idIfCond_18 = false;\n\tidIfCond_18 = this.isFunctionTypeVariable();\n\n\tif( idIfCond_18 ) {\n\n\tresult = false;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeAssigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.utils.StringBuffer result = null;\n\n\tkermeta.language.behavior.Expression stm = this;\n\n\tjava.lang.String str_statement = kermeta.standard.helper.StringWrapper.normalizeStatement(stm.createBehaviorJava(context));\n\n\tkermeta.standard.Sequence<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());\n\n\tjava.lang.Boolean idIfCond_19 = false;\n\tidIfCond_19 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);\n\n\tif( idIfCond_19 ) {\n\n\tjava.lang.String s1 = str_statement_splitted.first();\n\n\tjava.lang.String s2 = str_statement_splitted.last();\n\n\tjava.lang.Boolean idIfCond_20 = false;\n\tidIfCond_20 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());\n\n\tif( idIfCond_20 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);\n}\n\n}\n\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), \"//\"), \"//\");\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getRETURN_EXPRESSION_TO_REPLACE(), \"result\"), \"result\");\n\n\tjavaCode.append(context.getBeforeLambdaExpressionResult());\n\n\tcontext.setBeforeLambdaExpressionResult(\"\");\n\n\tjavaCode.append(\"\\n\\t\");\n\n\tjava.lang.Boolean idIfCond_21 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft1 = null;\n\n\tjava.lang.Boolean idIfCond_22 = false;\n\tidIfCond_22 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getIsLastExpression()));\n\n\tif( idIfCond_22 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object i_lbdExp1 = null;\n\n\tresult_ft1 = this.getIsLastExpression();\n//EIle:right\n\n}\n else {\n\n\tresult_ft1 = false;\n}\n\n\n//CEC\nidIfCond_21 = result_ft1;\n//EIft:andThen\n\n\n\tif( idIfCond_21 ) {\n\n\tjava.lang.Boolean idIfCond_23 = false;\n\tidIfCond_23 = stm.mustBeAssigned();\n\n\tif( idIfCond_23 ) {\n\n\tjava.lang.Boolean idIfCond_24 = false;\n\tidIfCond_24 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_24 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_25 = false;\n\tidIfCond_25 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().getTypeName());\n\n\tif( idIfCond_25 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_26 = false;\n\tidIfCond_26 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\"))), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_26 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_27 = false;\n\tidIfCond_27 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_27 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_28 = false;\n\tidIfCond_28 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_28 ) {\n\n\tjava.lang.Boolean idIfCond_29 = false;\n\tidIfCond_29 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_29 ) {\n\n\tjava.lang.Boolean idIfCond_30 = false;\n\tidIfCond_30 = stm.callsFunctionType();\n\n\tif( idIfCond_30 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_statement, context.getResultLastStatementId()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), \";\\n\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_31 = false;\n\tidIfCond_31 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_31 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), context.getResultLastStatementId());\n}\n else {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_32 = false;\n\tidIfCond_32 = stm.mustBeAssigned();\n\n\tif( idIfCond_32 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_33 = false;\n\tidIfCond_33 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_33 ) {\n\n\tjava.lang.Boolean idIfCond_34 = false;\n\tidIfCond_34 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.contains(str_statement, kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\\\"\", context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()), \"\\\")\")));\n\n\tif( idIfCond_34 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), \"\");\n}\n\n}\n\n\n\tjavaCode.append(str_statement);\n\n\tresult = javaCode;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.utils.StringBuffer createExpression(KM2EcoreContext context,
			kermeta.utils.StringBuffer javaCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_35 = false;\n\tidIfCond_35 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_35 ) {\n\n\tjava.lang.Boolean idIfCond_36 = false;\n\tidIfCond_36 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).isFunctionTypeVariable();\n\n\tif( idIfCond_36 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionTypeVariable();

} // Expression
