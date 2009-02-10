/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: Assignment.java,v 1.12 2009-02-10 17:51:43 cfaucher Exp $
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
 *   <li>{@link kermeta.language.behavior.Assignment#getCacheCastPrefix <em>Cache Cast Prefix</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getCacheCastSuffix <em>Cache Cast Suffix</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getValueTypeCastSuffix <em>Value Type Cast Suffix</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link kermeta.language.behavior.Assignment#getValue <em>Value</em>}</li>
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
	 * Returns the value of the '<em><b>Cache Cast Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Cast Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Cast Prefix</em>' attribute.
	 * @see #setCacheCastPrefix(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_CacheCastPrefix()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getCacheCastPrefix();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getCacheCastPrefix <em>Cache Cast Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Cast Prefix</em>' attribute.
	 * @see #getCacheCastPrefix()
	 * @generated
	 */
	void setCacheCastPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Cache Cast Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Cast Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Cast Suffix</em>' attribute.
	 * @see #setCacheCastSuffix(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getAssignment_CacheCastSuffix()
	 * @model dataType="kermeta.standard.JavaString"
	 * @generated
	 */
	String getCacheCastSuffix();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Assignment#getCacheCastSuffix <em>Cache Cast Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Cast Suffix</em>' attribute.
	 * @see #getCacheCastSuffix()
	 * @generated
	 */
	void setCacheCastSuffix(String value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_299 = false;\n\tidIfCond_299 = this.getIsCast();\n\n\tif( idIfCond_299 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(this.ppCast(context), context.getOBJECT_UTIL_CLASS()), \".asTypeOrVoid(\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastPrefix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tthis.initCast(context);\n\n\tjava.lang.String left = this.getTarget().createBehaviorJava(context);\n\n\tthis.setCacheCastPrefix(this.ppCastPrefix(context));\n\n\tthis.setCacheCastSuffix(this.ppCastSuffix(context));\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), this.getCacheCastPrefix()), this.getValueTypeCastPrefix()), context.getTYPE_SEPARATOR()), this.getTarget().getStaticType().createBehaviorJava(context)));\n\n\tjava.lang.String right = this.getValue().createBehaviorJava(context);\n\n\tjava.lang.Boolean idIfCond_300 = false;\n\tidIfCond_300 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.LambdaExpression\"));\n\n\tif( idIfCond_300 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().errorln(\"Please contact the Kermeta development team if you are in this case: createBehaviorJava Assignment\");\n\n\tright = kermeta.standard.helper.StringWrapper.plus(\"function \", right);\n}\n\n\n\tjava.lang.Boolean idIfCond_301 = false;\n\tidIfCond_301 = this.getTarget().isCallFeatureAsStaticProperty();\n\n\tif( idIfCond_301 ) {\n\n\tkermeta.standard.Sequence<java.lang.String> tabLeft = kermeta.standard.helper.StringWrapper.split(left, \"\\\\.\");\n\n\tresult = \"\";\n\n\t\n{\n\n\tjava.lang.Integer i = 0;\n\tjava.lang.Boolean idLoopCond_302 = false;\n\twhile( !idLoopCond_302 ) {\n\tidLoopCond_302 = kermeta.standard.helper.IntegerWrapper.isGreaterOrEqual(i, tabLeft.size());\n\tif ( idLoopCond_302 ) {\n\t} else {\n\n\tjava.lang.Boolean idIfCond_303 = false;\n\tidIfCond_303 = kermeta.standard.helper.IntegerWrapper.isLower(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_303 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, tabLeft.elementAt(i)), \".\");\n}\n else {\n\n\tjava.lang.Boolean idIfCond_304 = false;\n\tidIfCond_304 = kermeta.standard.helper.IntegerWrapper.equals(i, kermeta.standard.helper.IntegerWrapper.minus(tabLeft.size(), 1));\n\n\tif( idIfCond_304 ) {\n\n\tjava.lang.Boolean idIfCond_305 = false;\n\tidIfCond_305 = this.getValue().callsFunctionType();\n\n\tif( idIfCond_305 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(right, result), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), this.getCacheCastPrefix()), this.getValueTypeCastPrefix()), ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).getCalledFtResult()), this.getValueTypeCastSuffix()), this.getCacheCastSuffix()), \");\");\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, ((kermeta.language.behavior.CallFeature) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallFeature\"))).printSetAccessor(context)), \"(\"), this.getCacheCastPrefix()), this.getValueTypeCastPrefix()), right), this.getValueTypeCastSuffix()), this.getCacheCastSuffix()), \");\");\n}\n\n}\n\n}\n\n\n\ti = kermeta.standard.helper.IntegerWrapper.plus(i, 1);\n}\n\t}\n}\n\n}\n else {\n\n\tjava.lang.Boolean idIfCond_306 = false;\n\tidIfCond_306 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getValue(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\"));\n\n\tif( idIfCond_306 ) {\n\n\tresult = right;\n}\n else {\n\n\tjava.lang.Boolean idIfCond_307 = false;\n\tidIfCond_307 = kermeta.standard.helper.StringWrapper.contains(right, context.getRETURN_EXPRESSION_TO_REPLACE());\n\n\tif( idIfCond_307 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(right, context.getRETURN_EXPRESSION_TO_REPLACE(), kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), this.getCacheCastPrefix()), this.getValueTypeCastPrefix()));\n}\n else {\n\n\tjava.lang.Boolean idIfCond_308 = false;\n\tidIfCond_308 = kermeta.standard.helper.BooleanWrapper.and(kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallVariable\")), org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getTarget(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.CallResult\"))), kermeta.standard.helper.BooleanWrapper.or(this.getValue().callsFunctionType(), this.getValue().isFunctionTypeVariable()));\n\n\tif( idIfCond_308 ) {\n\n\tresult = right;\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(left, \" = \"), this.getCacheCastPrefix()), this.getValueTypeCastPrefix()), right);\n}\n\n}\n\n}\n\n}\n\n\n\tcontext.getResultLastStatementStack().pop();\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String right_type = this.getValue().getStaticType().getTypeQName();\n\n\tjava.lang.Boolean idIfCond_309 = false;\n\tidIfCond_309 = kermeta.standard.helper.StringWrapper.equals(right_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_309 ) {\n\n\tjava.lang.Boolean idIfCond_310 = false;\n\tidIfCond_310 = this.getTarget().getStaticType().isValueType();\n\n\tif( idIfCond_310 ) {\n\n\torg.kermeta.compil.runtime.helper.io.StdIOUtil.getInstance().writeln(\"Not implemented yet, a conversion is required, see at: Assignment::requireConversionObjectToValueType\");\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireConversionObjectToValueType(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_311 = false;\n\tidIfCond_311 = this.getIsCast();\n\n\tif( idIfCond_311 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"(\", this.getCastTypeQName(context)), \") \");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCast(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_312 = false;\n\tidIfCond_312 = this.getIsCast();\n\n\tif( idIfCond_312 ) {\n\n\tresult = this.getTarget().getStaticType().createBehaviorJava(context);\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String getCastTypeQName(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_313 = false;\n\tidIfCond_313 = this.requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_313 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(context.getOBJECT_UTIL_CLASS(), \".convertAsObject(\");\n}\n\n\nreturn result;\n'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_314 = false;\n\tidIfCond_314 = this.getIsCast();\n\n\tif( idIfCond_314 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\", \\\"\", this.getCastTypeQName(context)), \"\\\")\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppCastSuffix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tresult = \"\";\n\n\tjava.lang.Boolean idIfCond_315 = false;\n\tidIfCond_315 = this.requireConversionValueTypeToObject(context);\n\n\tif( idIfCond_315 ) {\n\n\tresult = \")\";\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String ppValueTypeCastSuffix(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.String left_type = this.getTarget().getStaticType().getTypeQName();\n\n\tjava.lang.Boolean idIfCond_316 = false;\n\tidIfCond_316 = kermeta.standard.helper.StringWrapper.equals(left_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_316 ) {\n\n\tjava.lang.Boolean idIfCond_317 = false;\n\tidIfCond_317 = this.getValue().getStaticType().isValueType();\n\n\tif( idIfCond_317 ) {\n\n\tresult = true;\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireConversionValueTypeToObject(KM2EcoreContext context);

} // Assignment
