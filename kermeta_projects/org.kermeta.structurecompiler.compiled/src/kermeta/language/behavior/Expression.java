/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Expression.java,v 1.11 2009-02-10 17:51:43 cfaucher Exp $
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
	 *        annotation="kermeta documentation='/**\n\t * Check if the current element is at the end of an Expression, if so a \";\" is added\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_54 = false;\n\tidIfCond_54 = kermeta.standard.helper.BooleanWrapper.not(this.callsFunctionType());\n\n\tif( idIfCond_54 ) {\n\n\tjava.lang.Boolean idIfCond_55 = false;\n\tidIfCond_55 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Loop\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Rescue\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\")));\n\n\tif( idIfCond_55 ) {\n\n\tjava.lang.Boolean idIfCond_56 = false;\n\tidIfCond_56 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"));\n\n\tif( idIfCond_56 ) {\n\n\tkermeta.language.behavior.Assignment assignment = ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\")));\n\n\tjava.lang.Boolean idIfCond_57 = false;\n\tidIfCond_57 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(assignment.getTarget(), this);\n\n\tif( idIfCond_57 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_58 = false;\n\tidIfCond_58 = assignment.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_58 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tjava.lang.Boolean idIfCond_59 = false;\n\tidIfCond_59 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(assignment), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_59 ) {\n\n\tresult = \"\";\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getValueTypeCastSuffix(), ((kermeta.language.behavior.Assignment) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Assignment\"))).getCacheCastSuffix()), \";\");\n}\n\n}\n\n}\n\n}\n else {\n\n\tresult = \";\";\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String endOfExpressionFixer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tjava.lang.Boolean idIfCond_60 = false;\n\tidIfCond_60 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(this.getCompiledJavaExtern(), \"\"), kermeta.standard.helper.StringWrapper.equals(context.getCompiledJavaExtern(), \"\"));\n\n\tif( idIfCond_60 ) {\n\n\tcontext.setCompiledJavaExtern(this.getCompiledJavaExtern());\n\n\tjava.lang.Boolean idIfCond_61 = false;\n\tidIfCond_61 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.FunctionType\")))), kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getContainerAsType(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\")))));\n\n\tif( idIfCond_61 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.split(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"(\", \"%\"), \"%\").first());\n}\n\n\n\tjava.lang.Boolean idIfCond_62 = false;\n\tidIfCond_62 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(context.getCurrent_valueType())), context.getStaticOperationMode());\n\n\tif( idIfCond_62 ) {\n\n\tcontext.setCompiledJavaExtern(kermeta.standard.helper.StringWrapper.replace(context.getCompiledJavaExtern(), \"this\", \"self\"));\n}\n\n}\n\n\n\tresult = \"\";\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta superOperation='kermeta::language::structure::Object'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_63 = false;\n\tidIfCond_63 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.VoidType\")));\n\n\tif( idIfCond_63 ) {\n\n\tresult = true;\n}\n\n\n\tjava.lang.Boolean idIfCond_64 = false;\n\tidIfCond_64 = this.isFunctionTypeVariable();\n\n\tif( idIfCond_64 ) {\n\n\tresult = false;\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean mustBeAssigned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.utils.StringBuffer result = null;\n\n\tkermeta.language.behavior.Expression stm = this;\n\n\tjava.lang.String str_statement = kermeta.standard.helper.StringWrapper.normalizeStatement(stm.createBehaviorJava(context));\n\n\tkermeta.standard.Sequence<java.lang.String> str_statement_splitted = kermeta.standard.helper.StringWrapper.split(str_statement, context.getSEPARATOR_STATEMENT_FT());\n\n\tjava.lang.Boolean idIfCond_65 = false;\n\tidIfCond_65 = kermeta.standard.helper.IntegerWrapper.equals(str_statement_splitted.size(), 2);\n\n\tif( idIfCond_65 ) {\n\n\tjava.lang.String s1 = str_statement_splitted.first();\n\n\tjava.lang.String s2 = str_statement_splitted.last();\n\n\tjava.lang.Boolean idIfCond_66 = false;\n\tidIfCond_66 = kermeta.standard.helper.StringWrapper.contains(s2, context.getPREVIOUS_STATEMENT_FT());\n\n\tif( idIfCond_66 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(s2, context.getPREVIOUS_STATEMENT_FT(), s1);\n}\n\n}\n\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getSEPARATOR_STATEMENT_FT(), \"//\"), \"//\");\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, kermeta.standard.helper.StringWrapper.plus(context.getRETURN_EXPRESSION_TO_REPLACE(), \"result\"), \"result\");\n\n\tjavaCode.append(context.getBeforeLambdaExpressionResult());\n\n\tcontext.setBeforeLambdaExpressionResult(\"\");\n\n\tjavaCode.append(\"\\n\\t\");\n\n\tjava.lang.Boolean idIfCond_67 = false;\n//BIft:andThen\n\njava.lang.Boolean result_ft11 = null;\n\n\tjava.lang.Boolean idIfCond_68 = false;\n\tidIfCond_68 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getIsLastExpression()));\n\n\tif( idIfCond_68 ) {\n\n\t//BIle:right\n/*This variable should be never used\052/ kermeta.language.structure.Object i_lbdExp11 = null;\n\n\tresult_ft11 = this.getIsLastExpression();\n//EIle:right\n\n}\n else {\n\n\tresult_ft11 = false;\n}\n\n\n//CEC\nidIfCond_67 = result_ft11;\n//EIft:andThen\n\n\n\tif( idIfCond_67 ) {\n\n\tjava.lang.Boolean idIfCond_69 = false;\n\tidIfCond_69 = stm.mustBeAssigned();\n\n\tif( idIfCond_69 ) {\n\n\tjava.lang.Boolean idIfCond_70 = false;\n\tidIfCond_70 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"));\n\n\tif( idIfCond_70 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_71 = false;\n\tidIfCond_71 = ((kermeta.language.structure.Operation) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.language.structure.StructurePackage.eINSTANCE.getOperation())).isVoidType(((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().getTypeName());\n\n\tif( idIfCond_71 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_72 = false;\n\tidIfCond_72 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Block\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Operation\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Property\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this)), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Constraint\"))), kermeta.standard.helper.IntegerWrapper.equals(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_72 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n else {\n\n\tjava.lang.Boolean idIfCond_73 = false;\n\tidIfCond_73 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_73 ) {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_74 = false;\n\tidIfCond_74 = kermeta.standard.helper.BooleanWrapper.and(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\")), kermeta.standard.helper.IntegerWrapper.isGreater(context.getResultLastStatementStack().size(), 0));\n\n\tif( idIfCond_74 ) {\n\n\tjava.lang.Boolean idIfCond_75 = false;\n\tidIfCond_75 = kermeta.standard.helper.StringWrapper.equals(context.getResultLastStatementType(), ((kermeta.language.behavior.Expression) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Expression\"))).getStaticType().createBehaviorJava(context));\n\n\tif( idIfCond_75 ) {\n\n\tjava.lang.Boolean idIfCond_76 = false;\n\tidIfCond_76 = stm.callsFunctionType();\n\n\tif( idIfCond_76 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_statement, context.getResultLastStatementId()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(stm, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), \";\\n\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_77 = false;\n\tidIfCond_77 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_77 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), context.getResultLastStatementId());\n}\n else {\n\n\tjavaCode.append(context.getResultLastStatementId());\n}\n\n}\n\n}\n\n}\n\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_78 = false;\n\tidIfCond_78 = stm.mustBeAssigned();\n\n\tif( idIfCond_78 ) {\n\n\tjavaCode.append(context.getNOT_EVALUATED_MESSAGE());\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_79 = false;\n\tidIfCond_79 = kermeta.standard.helper.StringWrapper.contains(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL());\n\n\tif( idIfCond_79 ) {\n\n\tjava.lang.Boolean idIfCond_80 = false;\n\tidIfCond_80 = kermeta.standard.helper.BooleanWrapper.not(kermeta.standard.helper.StringWrapper.contains(str_statement, kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\\\"\", context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL()), \"\\\")\")));\n\n\tif( idIfCond_80 ) {\n\n\tstr_statement = kermeta.standard.helper.StringWrapper.replace(str_statement, context.getRETURN_EXPRESSION_TO_REPLACE_SPECIAL(), \"\");\n}\n\n}\n\n\n\tjavaCode.append(str_statement);\n\n\tresult = javaCode;\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.utils.StringBuffer createExpression(KM2EcoreContext context,
			kermeta.utils.StringBuffer javaCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_81 = false;\n\tidIfCond_81 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_81 ) {\n\n\tjava.lang.Boolean idIfCond_82 = false;\n\tidIfCond_82 = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this, org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).isFunctionTypeVariable();\n\n\tif( idIfCond_82 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean isFunctionTypeVariable();

} // Expression
