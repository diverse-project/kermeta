/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assignment.java,v 1.1 2008-09-04 15:40:22 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getAssignment()
 * @model annotation="kermeta documentation='Assignment is the model-element representation of the assignment statement <code>x := y</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png\"/>'"
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(CallExpression)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_Target()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Target of the assignment, as a CallExpression'"
	 * @generated
	 */
	CallExpression getTarget();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CallExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_Value()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='Value to be assigned, as a KerMeta expression'"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Cast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cast</em>' attribute.
	 * @see #setIsCast(Boolean)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_IsCast()
	 * @model default="false" dataType="kermeta.standard.JavaBoolean"
	 *        annotation="kermeta documentation='Boolean stating whether current assignment corresponds to a cast operation '"
	 * @generated
	 */
	Boolean getIsCast();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cast</em>' attribute.
	 * @see #getIsCast()
	 * @generated
	 */
	void setIsCast(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.String left = this.getTarget().createBehaviorJava(context);\n\n\tjava.lang.String ppCast = \"\";\n\n\tjava.lang.Boolean idIfCond_438 = false;\n\tidIfCond_438 = this.getIsCast();\n\n\tif( idIfCond_438 ) {\n\n\tppCast = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\", this.getTarget().getStaticType().createBehaviorJava(context)), \") \");\n}\n\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCast), context.getTYPE_SEPARATOR()), this.getStaticType().createBehaviorJava(context)));\n\n\tjava.lang.String right = this.getValue().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_439 = false;\n\tidIfCond_439 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"));\n\n\tif( idIfCond_439 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.errorln(\"Alert in createBehaviorJava Assignment\");\n\n\tright = kermeta.standard.helper.StringWrapper.plus(\"function \", right);\n}\n\n\n\tjava.lang.Boolean idIfCond_440 = false;\n\tidIfCond_440 = this.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_440 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper.split(left, \"\\.\");\n\n\tresult = \"\";\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_441 = false;\n\twhile( !idLoopCond_441 ) {\n\tidLoopCond_441 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, tabLeft.size());\n\tif ( idLoopCond_441 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_442 = false;\n\tidIfCond_442 = kermeta.standard.helper.IntegerWrapper.isLower(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_442 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, tabLeft.elementAt(i)), \"\\\\.\");\n}\n\n\n\tjava.lang.Boolean idIfCond_443 = false;\n\tidIfCond_443 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_443 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \"set\"), kermeta.standard.helper.StringWrapper.capName(((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asType(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getStaticProperty().getFinalName())), \"(\"), ppCast), right), \");\");\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_444 = false;\n\tidIfCond_444 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOf(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\"));\n\n\tif( idIfCond_444 ) {\n\n\tresult = right;\n}\n else {\n\n\tjava.lang.Boolean idIfCond_445 = false;\n\tidIfCond_445 = kermeta.standard.helper.StringWrapper.contains(right, context.getRETURN_EXPRESSION_TO_REPLACE());\n\n\tif( idIfCond_445 ) {\n\n\tkermeta.standard.helper.StringWrapper.replace(right, context.getresult = (), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCast));\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCast), right);\n}\n\n}\n\n}\n\n\n\tcontext.getResultLastStatementStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Assignment
