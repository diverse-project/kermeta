/**
 * <copyright>
 * </copyright>
 *
 * $Id: Conditional.java,v 1.2 2008-09-11 12:34:36 cfaucher Exp $
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
 * @model annotation="kermeta documentation='Condition is the model-element representation for the <code></code> '"
 *        annotation="kermeta documentation='/** Complete \052/'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tcontext.pushCondStack();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"java.lang.Boolean \", context.getIfConditionId()), \" = false;\");\n\n\tjava.lang.String str_condition = \"\";\n\n\tjava.lang.Boolean idIfCond_551 = false;\n\tidIfCond_551 = kermeta.standard.helper.StringWrapper.equals(context.printFtSuffix(), \"\");\n\n\tif( idIfCond_551 ) {\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\\t\"), context.getIfConditionId()), \" = \"), this.getCondition().createBehaviorJava(context));\n}\n else {\n\n\tjava.lang.Boolean idIfCond_552 = false;\n\tidIfCond_552 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_552 ) {\n\n\tkermeta.language.structure.Parameter ftParam = ((kermeta.language.behavior.CallVariable) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getCondition(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"))).getFunctionTypeParameter();\n\n\tjava.lang.Boolean idIfCond_553 = false;\n\tidIfCond_553 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(ftParam));\n\n\tif( idIfCond_553 ) {\n\n\tjava.lang.Boolean idIfCond_554 = false;\n\tidIfCond_554 = ftParam.isBooleanFunctionType(context);\n\n\tif( idIfCond_554 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(context.getIfConditionId(), \" = \"), context.getTYPE_SEPARATOR()), \"java.lang.Boolean\"));\n\n\tstr_condition = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(str_condition, \"\\n\"), this.getCondition().createBehaviorJava(context));\n\n\tcontext.getResultLastStatementStack().pop();\n}\n\n}\n\n}\n\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, str_condition);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\n\\tif( \"), context.getIfConditionId()), \" ) \");\n\n\tjava.lang.Boolean idIfCond_555 = false;\n\tidIfCond_555 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getThenBody()));\n\n\tif( idIfCond_555 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getThenBody().createBehaviorJava(context)), \"\\n\");\n}\n\n\n\tjava.lang.Boolean idIfCond_556 = false;\n\tidIfCond_556 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoid(this.getElseBody()));\n\n\tif( idIfCond_556 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \" else \");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, this.getElseBody().createBehaviorJava(context)), \"\\n\");\n}\n\n\n\tcontext.getCondStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Conditional
