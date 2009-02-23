/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Expression.java,v 1.12 2009-02-23 15:26:37 cfaucher Exp $
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
 * @model abstract="true"
 *        annotation="kermeta documentation='The base class for every entity used to define a behavior in operation body.'"
 *        annotation="kermeta documentation='/** Complete \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_453 = false;\n\tidIfCond_453 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getCompiledJavaExtern(), \"\"), kermeta.standard.helper.StringWrapper.equals(context.getCompiledJavaExtern(), \"\"));\n\n\tif( idIfCond_453 ) {\n\n\tcontext.setCompiledJavaExtern(this.getCompiledJavaExtern());\n\n\tjava.lang.Boolean idIfCond_454 = false;\n\tidIfCond_454 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\")))));\n\n\tif( idIfCond_454 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.split(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"(\", \"%\"), \"%\").first());\n}\n\n\n\tjava.lang.Boolean idIfCond_455 = false;\n\tidIfCond_455 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode());\n\n\tif( idIfCond_455 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"this\", \"self\"));\n}\n\n}\n\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Check if the current element is at the end of an Expression, if so a \";\" is added\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_456 = false;\n\tidIfCond_456 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());\n\n\tif( idIfCond_456 ) {\n\n\tjava.lang.Boolean idIfCond_457 = false;\n\tidIfCond_457 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Loop\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Rescue\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")));\n\n\tif( idIfCond_457 ) {\n\n\tjava.lang.Boolean idIfCond_458 = false;\n\tidIfCond_458 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_458 ) {\n\n\tkermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tjava.lang.Boolean idIfCond_459 = false;\n\tidIfCond_459 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(assignment.getTarget(), this);\n\n\tif( idIfCond_459 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_460 = false;\n\tidIfCond_460 = assignment.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_460 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_461 = false;\n\tidIfCond_461 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(assignment), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_461 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValueTypeCastSuffix(), ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getCacheCastSuffix()), \";\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tresult = \";\";\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String endOfExpressionFixer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_462 = false;\n\tidIfCond_462 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\")));\n\n\tif( idIfCond_462 ) {\n\n\tresult = true;\n}\n\n\n\tjava.lang.Boolean idIfCond_463 = false;\n\tidIfCond_463 = this.isFunctionTypeVariable();\n\n\tif( idIfCond_463 ) {\n\n\tresult = false;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeAssigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.utils.StringBuffer result = null;\n\n\tkermeta.language.behavior.Expression stm = this;\n\n\tjava.lang.String str_statement = kermeta.standard.helper.StringWrapper.normalizeStatement(stm.createBehaviorJava(context));\n\n\tkermeta.standard.Sequence<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());\n\n\tjava.lang.Boolean idIfCond_464 = false;\n\tidIfCond_464 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);\n\n\tif( idIfCond_464 ) {\n\n\tjava.lang.String s1 = str_statement_splitted.first();\n\n\tjava.lang.String s2 = str_statement_splitted.last();\n\n\tjava.lang.Boolean idIfCond_465 = false;\n\tidIfCond_465 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());\n\n\tif( idIfCond_465 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);\n}\n\n}\n\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), \"//\"), \"//\");\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getRETURN_EXPRESSION_TO_REPLACE(), \"result\"), \"result\");\n\n\tjavaCode.append(context.getBeforeLambdaExpressionResult());\n\n\tcontext.setBeforeLambdaExpressionResult(\"\");\n\n\tjavaCode.append(\"\\n\\t\");\n\n\tjava.lang.Boolean idIfCond_466 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft131 = null;\n\n\tjava.lang.Boolean idIfCond_467 = false;\n\tidIfCond_467 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getIsLastExpression()));\n\n\tif( idIfCond_467 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object i_lbdExp131 = null;\n\n\tresult_ft131 = this.getIsLastExpression();\n//EIle:right\n\n}\n else {\n\n\tresult_ft131 = false;\n}\n\n\n//CEC\nidIfCond_466 = result_ft131;\n//EIft:andThen\n\n\n\tif( idIfCond_466 ) {\n\n\tjava.lang.Boolean idIfCond_468 = false;\n\tidIfCond_468 = stm.mustBeAssigned();\n\n\tif( idIfCond_468 ) {\n\n\tjava.lang.Boolean idIfCond_469 = false;\n\tidIfCond_469 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_469 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_470 = false;\n\tidIfCond_470 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().getTypeName());\n\n\tif( idIfCond_470 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_471 = false;\n\tidIfCond_471 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\"))), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_471 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_472 = false;\n\tidIfCond_472 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_472 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_473 = false;\n\tidIfCond_473 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_473 ) {\n\n\tjava.lang.Boolean idIfCond_474 = false;\n\tidIfCond_474 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_474 ) {\n\n\tjava.lang.Boolean idIfCond_475 = false;\n\tidIfCond_475 = stm.callsFunctionType();\n\n\tif( idIfCond_475 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_statement, context.getResultLastStatementId()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), \";\\n\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_476 = false;\n\tidIfCond_476 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_476 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), context.getResultLastStatementId());\n}\n else {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_477 = false;\n\tidIfCond_477 = stm.mustBeAssigned();\n\n\tif( idIfCond_477 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_478 = false;\n\tidIfCond_478 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_478 ) {\n\n\tjava.lang.Boolean idIfCond_479 = false;\n\tidIfCond_479 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.contains(str_statement, kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\\\"\", context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()), \"\\\")\")));\n\n\tif( idIfCond_479 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), \"\");\n}\n\n}\n\n\n\tjavaCode.append(str_statement);\n\n\tresult = javaCode;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.utils.StringBuffer createExpression(KM2EcoreContext context,
			kermeta.utils.StringBuffer javaCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_480 = false;\n\tidIfCond_480 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_480 ) {\n\n\tjava.lang.Boolean idIfCond_481 = false;\n\tidIfCond_481 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).isFunctionTypeVariable();\n\n\tif( idIfCond_481 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionTypeVariable();

} // Expression
