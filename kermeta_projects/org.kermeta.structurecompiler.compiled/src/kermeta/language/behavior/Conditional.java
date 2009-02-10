/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Conditional.java,v 1.11 2009-02-10 17:51:43 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Conditional#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.Conditional#getCondition <em>Condition</em>}</li>
 *   <li>{@link kermeta.language.behavior.Conditional#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getConditional()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta documentation='Condition is the model-element representation for the <code></code> '"
 * @generated
 */
public interface Conditional extends Expression {
	/**
	 * Returns the value of the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Body</em>' containment reference.
	 * @see #setThenBody(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getConditional_ThenBody()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Then part of the conditional statement'"
	 * @generated
	 */
	Expression getThenBody();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Conditional#getThenBody <em>Then Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' containment reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getConditional_Condition()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Condition expression of conditional statement'"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Conditional#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getConditional_ElseBody()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Optional else part of the conditional statement'"
	 * @generated
	 */
	Expression getElseBody();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Conditional#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tcontext.pushCondStack();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"java.lang.Boolean \", context.getIfConditionId()), \" = false;\");\n\n\tjava.lang.String str_condition = \"\";\n\n\tjava.lang.Boolean idIfCond_323 = false;\n\tidIfCond_323 = this.conditionIsCallFeatureThatCallsFunctionType();\n\n\tif( idIfCond_323 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getIfConditionId(), \" = \"), context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\"), this.getCondition().createBehaviorJava(context));\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tjava.lang.Boolean idIfCond_324 = false;\n\tidIfCond_324 = kermeta.standard.helper.StringWrapper.equals(context.printFtSuffix(), \"\");\n\n\tif( idIfCond_324 ) {\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\\t\"), context.getIfConditionId()), \" = \"), this.getCondition().createBehaviorJava(context));\n}\n else {\n\n\tjava.lang.Boolean idIfCond_325 = false;\n\tidIfCond_325 = kermeta.standard.helper.BooleanWrapper.or(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"))), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\")));\n\n\tif( idIfCond_325 ) {\n\n\tkermeta.language.structure.Parameter ftParam = null;\n\n\tjava.lang.Boolean idIfCond_326 = false;\n\tidIfCond_326 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_326 ) {\n\n\tftParam = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).getFunctionTypeParameter();\n}\n\n\n\tjava.lang.Boolean idIfCond_327 = false;\n\tidIfCond_327 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(ftParam));\n\n\tif( idIfCond_327 ) {\n\n\tjava.lang.Boolean idIfCond_328 = false;\n\tidIfCond_328 = ftParam.isBooleanFunctionType(context);\n\n\tif( idIfCond_328 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getIfConditionId(), \" = \"), context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\"), this.getCondition().createBehaviorJava(context));\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\\t\"), context.getIfConditionId()), \" = \"), this.getCondition().createBehaviorJava(context));\n}\n\n}\n\n}\n\n\n\tjava.lang.Boolean idIfCond_329 = false;\n\tidIfCond_329 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.SelfExpression\"));\n\n\tif( idIfCond_329 ) {\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\\t\"), context.getIfConditionId()), \" = \"), this.getCondition().createBehaviorJava(context));\n}\n\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_condition);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\n\\tif( \"), context.getIfConditionId()), \" ) \");\n\n\tjava.lang.Boolean idIfCond_330 = false;\n\tidIfCond_330 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getThenBody()));\n\n\tif( idIfCond_330 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getThenBody().createBehaviorJava(context)), \"\\n\");\n}\n\n\n\tjava.lang.Boolean idIfCond_331 = false;\n\tidIfCond_331 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getElseBody()));\n\n\tif( idIfCond_331 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \" else \");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getElseBody().createBehaviorJava(context)), \"\\n\");\n}\n\n\n\tcontext.getCondStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_332 = false;\n\tidIfCond_332 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"));\n\n\tif( idIfCond_332 ) {\n\n\tjava.lang.Boolean idIfCond_333 = false;\n\tidIfCond_333 = ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).callsFunctionType();\n\n\tif( idIfCond_333 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean conditionIsCallFeatureThatCallsFunctionType();

} // Conditional
