/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assignment.java,v 1.9 2008-11-07 08:52:21 cfaucher Exp $
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_647 = false;\n\tidIfCond_647 = this.getIsCast();\n\n\tif( idIfCond_647 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(this.ppCast(context), context.getJAVA_INSTANCE_EXECUTION_CONTEXT()), \".<\"), this.getCastTypeQName(context)), \">asTypeOrVoid(\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastPrefix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String right_type = this.getValue().getStaticType().getTypeQName();\n\n\tkermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<java.lang.String>\"));\n\n\tvalue_type_list.add(\"java.lang.String\");\n\n\tvalue_type_list.add(\"java.lang.Boolean\");\n\n\tvalue_type_list.add(\"java.lang.Integer\");\n\n\tvalue_type_list.add(\"java.lang.Character\");\n\n\tvalue_type_list.add(\"java.lang.Double\");\n\n\tjava.lang.String castType = this.getCastTypeQName(context);\n\n\tjava.lang.Boolean idIfCond_648 = false;\n\tidIfCond_648 = kermeta.standard.helper.StringWrapper.equals(right_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_648 ) {\n\n\tjava.lang.Boolean idIfCond_649 = false;\n\tidIfCond_649 = value_type_list.contains(castType);\n\n\tif( idIfCond_649 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"a conversion is required\");\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireValueTypeConversion(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.String left = this.getTarget().createBehaviorJava(context);\n\n\tjava.lang.String ppCastPrefix = this.ppCastPrefix(context);\n\n\tjava.lang.String ppCastSuffix = this.ppCastSuffix();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix), context.getTYPE_SEPARATOR()), this.getTarget().getStaticType().createBehaviorJava(context)));\n\n\tjava.lang.String right = this.getValue().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_650 = false;\n\tidIfCond_650 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"));\n\n\tif( idIfCond_650 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().errorln(\"Please contact the Kermeta development team if you are in this case: createBehaviorJava Assignment\");\n\n\tright = kermeta.standard.helper.StringWrapper.plus(\"function \", right);\n}\n\n\n\tjava.lang.Boolean idIfCond_651 = false;\n\tidIfCond_651 = this.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_651 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper.split(left, \"\\\\.\");\n\n\tresult = \"\";\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_652 = false;\n\twhile( !idLoopCond_652 ) {\n\tidLoopCond_652 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, tabLeft.size());\n\tif ( idLoopCond_652 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_653 = false;\n\tidIfCond_653 = kermeta.standard.helper.IntegerWrapper.isLower(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_653 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, tabLeft.elementAt(i)), \".\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_654 = false;\n\tidIfCond_654 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_654 ) {\n\n\tjava.lang.Boolean idIfCond_655 = false;\n\tidIfCond_655 = this.getValue().callsFunctionType();\n\n\tif( idIfCond_655 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(right, result), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), ppCastPrefix), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), ppCastSuffix), \");\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), ppCastPrefix), right), ppCastSuffix), \");\");\n}\n\n}\n\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_656 = false;\n\tidIfCond_656 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\"));\n\n\tif( idIfCond_656 ) {\n\n\tresult = right;\n}\n else {\n\n\tjava.lang.Boolean idIfCond_657 = false;\n\tidIfCond_657 = kermeta.standard.helper.StringWrapper.contains(right, context.getRETURN_EXPRESSION_TO_REPLACE());\n\n\tif( idIfCond_657 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(right, context.getRETURN_EXPRESSION_TO_REPLACE(), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix));\n}\n else {\n\n\tjava.lang.Boolean idIfCond_658 = false;\n\tidIfCond_658 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), kermeta.standard.helper.BooleanWrapper.or(this.getValue().callsFunctionType(), this.getValue().isFunctionTypeVariable()));\n\n\tif( idIfCond_658 ) {\n\n\tresult = right;\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix), right);\n}\n\n}\n\n}\n\n}\n\n\n\tcontext.getResultLastStatementStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_659 = false;\n\tidIfCond_659 = this.getIsCast();\n\n\tif( idIfCond_659 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\", this.getCastTypeQName(context)), \") \");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCast(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_660 = false;\n\tidIfCond_660 = this.getIsCast();\n\n\tif( idIfCond_660 ) {\n\n\tresult = this.getTarget().getStaticType().createBehaviorJava(context);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getCastTypeQName(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_661 = false;\n\tidIfCond_661 = this.getIsCast();\n\n\tif( idIfCond_661 ) {\n\n\tresult = \")\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastSuffix();

} // Assignment
