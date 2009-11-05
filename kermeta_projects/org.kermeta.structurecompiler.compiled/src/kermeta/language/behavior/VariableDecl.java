/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link kermeta.language.behavior.VariableDecl#getType <em>Type</em>}</li>
 *   <li>{@link kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getVariableDecl()
 * @model annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='refers to variable declaration <code>var x : X init a</code>\n<img alt=\"\" src=\"http://www.kermeta.org/docs/html.single/KerMeta-Manual/KerMeta-Manual_figures/kermeta_var_expressions.png\"/>'"
 * @generated
 */
public interface VariableDecl extends Expression {
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
	 * @see kermeta.language.behavior.BehaviorPackage#getVariableDecl_Initialization()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Initialization expression for the variable\nDefault value is <code>void</code> ????'"
	 * @generated
	 */
	Expression getInitialization();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.VariableDecl#getInitialization <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' containment reference.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(Expression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see kermeta.language.behavior.BehaviorPackage#getVariableDecl_Type()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Type of the declared variable'"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.VariableDecl#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getVariableDecl_Identifier()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='Initialization expression for the variable\nDefault value is <code>void</code> ????'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.VariableDecl#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = \"\";\n\n\tjava.lang.String localType = this.getStaticType().createBehaviorJava(context);\n\n\tjava.lang.String var_id = kermeta.standard.helper.StringWrapper.plus(((km2ecore.helper.java.IdentifierHelper) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(km2ecore.helper.java.JavaPackage.eINSTANCE.getIdentifierHelper())).getMangledIdentifier(this.getIdentifier(), context), context.printFtSuffix());\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, localType), \" \"), var_id);\n\n\tjava.lang.Boolean idIfCond_1 = false;\n\tidIfCond_1 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isVoidSwitcher(this.getInitialization()));\n\n\tif( idIfCond_1 ) {\n\n\tjava.lang.Boolean idIfCond_2 = false;\n\tidIfCond_2 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Conditional\"));\n\n\tif( idIfCond_2 ) {\n\n\tcontext.getResultLastStatementStack().push(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(var_id, \" = \"), context.getTYPE_SEPARATOR()), localType));\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \" = null;\\n\"), this.getInitialization().createBehaviorJava(context));\n\n\tcontext.getResultLastStatementStack().pop();\n}\n else {\n\n\tjava.lang.String literal_prefix = \"\";\n\n\tjava.lang.String literal_suffix = \"\";\n\n\tjava.lang.Boolean idIfCond_3 = false;\n\tidIfCond_3 = this.requireConversionValueTypeToObject();\n\n\tif( idIfCond_3 ) {\n\n\tliteral_prefix = kermeta.standard.helper.StringWrapper.plus(context.getOBJECT_UTIL_CLASS(), \".convertAsObject(\");\n\n\tliteral_suffix = \")\";\n}\n\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(result, \" = \"), literal_prefix), this.getInitialization().createBehaviorJava(context)), literal_suffix), this.endOfExpressionFixer());\n}\n\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, \" = null;\");\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\tresult = false;\n\n\tjava.lang.Boolean idIfCond_4 = false;\n\tidIfCond_4 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"));\n\n\tif( idIfCond_4 ) {\n\n\tjava.lang.Boolean idIfCond_5 = false;\n\tidIfCond_5 = ((kermeta.language.behavior.Literal) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeSwitcher(this.getInitialization(), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.Literal\"))).getStaticType().isValueType();\n\n\tif( idIfCond_5 ) {\n\n\tjava.lang.String left_type = this.getStaticType().getTypeQName();\n\n\tjava.lang.Boolean idIfCond_6 = false;\n\tidIfCond_6 = kermeta.standard.helper.StringWrapper.equals(left_type, \"kermeta::language::structure::Object\");\n\n\tif( idIfCond_6 ) {\n\n\tjava.lang.Boolean idIfCond_7 = false;\n\tidIfCond_7 = this.getInitialization().getStaticType().isValueType();\n\n\tif( idIfCond_7 ) {\n\n\tresult = true;\n}\n\n}\n\n}\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean requireConversionValueTypeToObject();

} // VariableDecl
