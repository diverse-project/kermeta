/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getStringLiteral()
 * @model annotation="kermeta documentation='/** Complete \052/'"
 *        annotation="kermeta ecore='true'"
 *        annotation="kermeta documentation='This expression is a literal representing a String value, typically : \"my string\"'"
 * @generated
 */
public interface StringLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see kermeta.language.behavior.BehaviorPackage#getStringLiteral_Value()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta ecore='true'"
	 *        annotation="kermeta documentation='The concrete value represented by this literal'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.StringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Literal'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = this.getValue();\n\n\tjava.lang.Boolean idIfCond_681 = false;\n\tidIfCond_681 = kermeta.standard.helper.StringWrapper.equals(result, \".\");\n\n\tif( idIfCond_681 ) {\n\n\tresult = \"\\\".\\\"\";\n}\n else {\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(result, \"\\\\\", \"\\\\\\\\\");\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\\"\", kermeta.standard.helper.StringWrapper.replace(result, \"\\\"\", \"\\\\\\\"\")), \"\\\"\");\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(result, \"\\n\", \"\\\\n\");\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(result, \"\\t\", \"\\\\t\");\n\n\tresult = kermeta.standard.helper.StringWrapper.replace(result, \"\\r\", \"\\\\r\");\n}\n\n\n\tjava.lang.Boolean idIfCond_682 = false;\n\tidIfCond_682 = kermeta.standard.helper.BooleanWrapper.not(org.kermeta.compil.runtime.helper.language.ObjectUtil.isInstanceOfSwitcher(org.kermeta.compil.runtime.helper.language.ObjectUtil.containerSwitcher(this), org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.behavior.VariableDecl\")));\n\n\tif( idIfCond_682 ) {\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(result, this.endOfExpressionFixer());\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // StringLiteral
