/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assignment.java,v 1.10 2008-11-27 15:49:47 cfaucher Exp $
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
 *   <li>{@link kermeta.language.behavior.Assignment#getValueTypeCastSuffix <em>Value Type Cast Suffix</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getIsCast <em>Is Cast</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getValueTypeCastPrefix <em>Value Type Cast Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getAssignment()
 * @model annotation="kermeta documentation='Assignment is the model-element representation of the assignment statement <code>x := y</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_assign_expressions.png\"/>'"
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Value Type Cast Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type Cast Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Cast Suffix</em>' attribute.
	 * @see #setValueTypeCastSuffix(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_ValueTypeCastSuffix()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getValueTypeCastSuffix();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getValueTypeCastSuffix <em>Value Type Cast Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type Cast Suffix</em>' attribute.
	 * @see #getValueTypeCastSuffix()
	 * @generated
	 */
	void setValueTypeCastSuffix(String value);

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
	 * Returns the value of the '<em><b>Value Type Cast Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type Cast Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Cast Prefix</em>' attribute.
	 * @see #setValueTypeCastPrefix(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_ValueTypeCastPrefix()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getValueTypeCastPrefix();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getValueTypeCastPrefix <em>Value Type Cast Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type Cast Prefix</em>' attribute.
	 * @see #getValueTypeCastPrefix()
	 * @generated
	 */
	void setValueTypeCastPrefix(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_601 = false;\n\tidIfCond_601 = this.getIsCast();\n\n\tif( idIfCond_601 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(this.ppCast(context), context.getJAVA_INSTANCE_EXECUTION_CONTEXT()), \".<\"), this.getCastTypeQName(context)), \">asTypeOrVoid(\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastPrefix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String right_type = this.getValue().getStaticType().getTypeQName();\n\n\tkermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<java.lang.String>\"));\n\n\tvalue_type_list.add(\"kermeta::standard::String\");\n\n\tvalue_type_list.add(\"kermeta::standard::Boolean\");\n\n\tvalue_type_list.add(\"kermeta::standard::Integer\");\n\n\tvalue_type_list.add(\"kermeta::standard::Character\");\n\n\tvalue_type_list.add(\"kermeta::standard::Real\");\n\n\tjava.lang.String castType = this.getCastTypeQName(context);\n\n\tjava.lang.Boolean idIfCond_602 = false;\n\tidIfCond_602 = kermeta.standard.helper.StringWrapper.equals(right_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_602 ) {\n\n\tjava.lang.Boolean idIfCond_603 = false;\n\tidIfCond_603 = value_type_list.contains(castType);\n\n\tif( idIfCond_603 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"a conversion is required\");\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireConversionObjectToValueType(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tthis.initCast(context);\n\n\tjava.lang.String left = this.getTarget().createBehaviorJava(context);\n\n\tjava.lang.String ppCastPrefix = this.ppCastPrefix(context);\n\n\tjava.lang.String ppCastSuffix = this.ppCastSuffix();\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix), this.getValueTypeCastPrefix()), context.getTYPE_SEPARATOR()), this.getTarget().getStaticType().createBehaviorJava(context)));\n\n\tjava.lang.String right = this.getValue().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_604 = false;\n\tidIfCond_604 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"));\n\n\tif( idIfCond_604 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().errorln(\"Please contact the Kermeta development team if you are in this case: createBehaviorJava Assignment\");\n\n\tright = kermeta.standard.helper.StringWrapper.plus(\"function \", right);\n}\n\n\n\tjava.lang.Boolean idIfCond_605 = false;\n\tidIfCond_605 = this.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_605 ) {\n\n\tkermeta.standard.OrderedSet<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper.split(left, \"\\\\.\");\n\n\tresult = \"\";\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_606 = false;\n\twhile( !idLoopCond_606 ) {\n\tidLoopCond_606 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, tabLeft.size());\n\tif ( idLoopCond_606 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_607 = false;\n\tidIfCond_607 = kermeta.standard.helper.IntegerWrapper.isLower(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_607 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, tabLeft.elementAt(i)), \".\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_608 = false;\n\tidIfCond_608 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_608 ) {\n\n\tjava.lang.Boolean idIfCond_609 = false;\n\tidIfCond_609 = this.getValue().callsFunctionType();\n\n\tif( idIfCond_609 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(right, result), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), ppCastPrefix), this.getValueTypeCastPrefix()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), this.getValueTypeCastSuffix()), ppCastSuffix), \");\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), ppCastPrefix), this.getValueTypeCastPrefix()), right), this.getValueTypeCastSuffix()), ppCastSuffix), \");\");\n}\n\n}\n\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_610 = false;\n\tidIfCond_610 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\"));\n\n\tif( idIfCond_610 ) {\n\n\tresult = right;\n}\n else {\n\n\tjava.lang.Boolean idIfCond_611 = false;\n\tidIfCond_611 = kermeta.standard.helper.StringWrapper.contains(right, context.getRETURN_EXPRESSION_TO_REPLACE());\n\n\tif( idIfCond_611 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(right, context.getRETURN_EXPRESSION_TO_REPLACE(), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix), this.getValueTypeCastPrefix()));\n}\n else {\n\n\tjava.lang.Boolean idIfCond_612 = false;\n\tidIfCond_612 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), kermeta.standard.helper.BooleanWrapper.or(this.getValue().callsFunctionType(), this.getValue().isFunctionTypeVariable()));\n\n\tif( idIfCond_612 ) {\n\n\tresult = right;\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), ppCastPrefix), this.getValueTypeCastPrefix()), right);\n}\n\n}\n\n}\n\n}\n\n\n\tcontext.getResultLastStatementStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_613 = false;\n\tidIfCond_613 = this.getIsCast();\n\n\tif( idIfCond_613 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\", this.getCastTypeQName(context)), \") \");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCast(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_614 = false;\n\tidIfCond_614 = this.getIsCast();\n\n\tif( idIfCond_614 ) {\n\n\tresult = this.getTarget().getStaticType().createBehaviorJava(context);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getCastTypeQName(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_615 = false;\n\tidIfCond_615 = this.requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_615 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(context.getOBJECT_UTIL_CLASS(), \".convertAsObject(\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppValueTypeCastPrefix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setValueTypeCastPrefix(this.ppValueTypeCastPrefix(context));\n\n\tthis.setValueTypeCastSuffix(this.ppValueTypeCastSuffix(context));\n'"
	 * @generated
	 */
	void initCast(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_616 = false;\n\tidIfCond_616 = this.getIsCast();\n\n\tif( idIfCond_616 ) {\n\n\tresult = \")\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_617 = false;\n\tidIfCond_617 = this.requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_617 ) {\n\n\tresult = \")\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppValueTypeCastSuffix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String left_type = this.getTarget().getStaticType().getTypeQName();\n\n\tkermeta.standard.Set<java.lang.String> value_type_list = ((kermeta.standard.Set<java.lang.String>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.standard.Set<java.lang.String>\"));\n\n\tvalue_type_list.add(\"kermeta::standard::String\");\n\n\tvalue_type_list.add(\"kermeta::standard::Boolean\");\n\n\tvalue_type_list.add(\"kermeta::standard::Integer\");\n\n\tvalue_type_list.add(\"kermeta::standard::Character\");\n\n\tvalue_type_list.add(\"kermeta::standard::Real\");\n\n\tjava.lang.String castType = this.getValue().getStaticType().getTypeQName();\n\n\tjava.lang.Boolean idIfCond_618 = false;\n\tidIfCond_618 = kermeta.standard.helper.StringWrapper.equals(left_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_618 ) {\n\n\tjava.lang.Boolean idIfCond_619 = false;\n\tidIfCond_619 = value_type_list.contains(castType);\n\n\tif( idIfCond_619 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireConversionValueTypeToObject(KM2EcoreContext context);

} // Assignment
