/**
 * <copyright>
 * </copyright>
 *
 * $Id: Loop.java,v 1.3 2008-09-22 14:46:28 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link kermeta.language.behavior.Loop#getBody <em>Body</em>}</li>
 *   <li>{@link kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getLoop()
 * @model annotation="kermeta documentation='Loop refers to <code>from var x : X init a until booleanCondition loop ... end</code>'"
 *        annotation="kermeta documentation='/** Complete \052/'"
 * @generated
 */
public interface Loop extends Expression {
	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference.
	 * @see #setInitialization(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getLoop_Initialization()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Initialization expression for the loop'"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Loop#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getLoop_Body()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='Body of the loop'"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Loop#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Stop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Condition</em>' containment reference.
	 * @see #setStopCondition(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getLoop_StopCondition()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Stop condition of the loop, is interpreted as a Bollean value'"
	 * @generated
	 */
	Expression getStopCondition();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Loop#getStopCondition <em>Stop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Condition</em>' containment reference.
	 * @see #getStopCondition()
	 * @generated
	 */
	void setStopCondition(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tcontext.pushCondStack();\n\n\tjava.lang.Boolean idIfCond_461 = false;\n\tidIfCond_461 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\"));\n\n\tif( idIfCond_461 ) {\n}\n else {\n\n\tjava.lang.Boolean idIfCond_462 = false;\n\tidIfCond_462 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"));\n\n\tif( idIfCond_462 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\"), \"{\\n\");\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\t\"), this.getInitialization().createBehaviorJava(context));\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\tjava.lang.Boolean \"), context.getLoopConditionId()), \" = false;\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\twhile( !\"), context.getLoopConditionId()), \" ) {\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\t\"), context.getLoopConditionId()), \" = \"), this.getStopCondition().createBehaviorJava(context)), \";\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\tif ( \"), context.getLoopConditionId()), \" ) {\");\n\n\tcontext.getCondStack().pop();\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\t} else \");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.getBody().createBehaviorJava(context));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n\\t}\");\n\n\tjava.lang.Boolean idIfCond_463 = false;\n\tidIfCond_463 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\"));\n\n\tif( idIfCond_463 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \"\\n}\\n\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Loop
