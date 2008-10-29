/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicExpression.java,v 1.7 2008-10-29 08:29:17 cfaucher Exp $
 */
package kermeta.interpreter;

import kermeta.language.behavior.Expression;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Type;

import kermeta.utils.Hashtable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.interpreter.DynamicExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link kermeta.interpreter.DynamicExpression#getErrors <em>Errors</em>}</li>
 *   <li>{@link kermeta.interpreter.DynamicExpression#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link kermeta.interpreter.DynamicExpression#getSelfClass <em>Self Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.interpreter.InterpreterPackage#getDynamicExpression()
 * @model annotation="kermeta documentation='/**\r\n * DynamicExpression is a class used to make dynamic calls, i.e dynamic evaluation\r\n * of Kermeta statements represented in a string.\r\n * \r\n * An example :\r\n *   var de : DynamicExpression init DynamicExpression.new\r\n *   de.initializeDefaults\r\n *   de.formalParameters.put(\"a\", String)\r\n *   de.parse(\"stdio.writeln(a)\") // note: to execute a list of statements, you have to surround them with do..end\r\n *   var params : Hashtable<String, Object> init Hashtable<String, Object>.new\r\n *   params.put(\"a\", \"hello world!\")\r\n *   de.execute(void, params)\r\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/dynamic_expression_view.png\"/>\r\n \052/'"
 * @generated
 */
public interface DynamicExpression extends kermeta.language.structure.Object {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see kermeta.interpreter.InterpreterPackage#getDynamicExpression_Expression()
	 * @model annotation="kermeta documentation='/**\r\n\t * the expression\r\n\t \052/'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link kermeta.interpreter.DynamicExpression#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' reference list.
	 * The list contents are of type {@link kermeta.interpreter.KermetaError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' reference list.
	 * @see kermeta.interpreter.InterpreterPackage#getDynamicExpression_Errors()
	 * @model annotation="kermeta documentation='/**\r\n\t * Parse errors and type errors\r\n\t \052/'"
	 * @generated
	 */
	EList<KermetaError> getErrors();

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' reference.
	 * @see #setFormalParameters(Hashtable)
	 * @see kermeta.interpreter.InterpreterPackage#getDynamicExpression_FormalParameters()
	 * @model type="kermeta.utils.Hashtable<kermeta.standard.JavaString, kermeta.language.structure.Type>"
	 *        annotation="kermeta documentation='/**\r\n\t * Formal parameters of the expression (bindings between parameters\' names and types)\r\n\t \052/'"
	 * @generated
	 */
	Hashtable<String, Type> getFormalParameters();

	/**
	 * Sets the value of the '{@link kermeta.interpreter.DynamicExpression#getFormalParameters <em>Formal Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameters</em>' reference.
	 * @see #getFormalParameters()
	 * @generated
	 */
	void setFormalParameters(Hashtable<String, Type> value);

	/**
	 * Returns the value of the '<em><b>Self Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Class</em>' reference.
	 * @see #setSelfClass(ClassDefinition)
	 * @see kermeta.interpreter.InterpreterPackage#getDynamicExpression_SelfClass()
	 * @model annotation="kermeta documentation='/**\r\n\t * The type of the self object\r\n\t * or void if the expression is not to be executed\r\n\t * in the context of an object\r\n\t \052/'"
	 * @generated
	 */
	ClassDefinition getSelfClass();

	/**
	 * Sets the value of the '{@link kermeta.interpreter.DynamicExpression#getSelfClass <em>Self Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Class</em>' reference.
	 * @see #getSelfClass()
	 * @generated
	 */
	void setSelfClass(ClassDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actualParamsType="kermeta.utils.Hashtable<kermeta.standard.JavaString, kermeta.language.structure.Object>"
	 *        annotation="kermeta documentation='/**\r\n     * Execute the expression in the given context\r\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_986 = false;\n\tidIfCond_986 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getExpression(), null);\n\n\tif( idIfCond_986 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.DynamicExpressionException\"));\n\n\te.setMessage(\"execute precondition - expression is void\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_987 = false;\n\tidIfCond_987 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).size(), 0);\n\n\tif( idIfCond_987 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.DynamicExpressionException\"));\n\n\te.setMessage(\"execute precondition - expression contains errors\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil.execute(this, selfObj, actualParams);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object execute(
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\r\n\t * Initializes the formalParameters with an empty set of parameters\r\n\t * and the self type with void\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setFormalParameters(((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Type>\")));\n\n\tthis.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Object\").getTypeDefinition());\n'"
	 * @generated
	 */
	void initializeDefaults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" expressionDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\r\n\t * Parse the expression as a string\r\n\t * and updates the expression field and errors\r\n\t * Returns true if the expression was parsed sucessfuly\r\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).clear();\n\n\tjava.lang.Boolean idIfCond_988 = false;\n\tidIfCond_988 = kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getFormalParameters(), null), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getSelfClass(), null));\n\n\tif( idIfCond_988 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.DynamicExpressionException\"));\n\n\te.setMessage(\"parse precondition - formalParameters or selfType is void\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil.parse(this, expression);\n\n\tjava.lang.Boolean idIfCond_989 = false;\n\tidIfCond_989 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).size(), 0);\n\n\tif( idIfCond_989 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.DynamicExpressionException\"));\n\n\te.setMessage(\"parse result - expression contains errors\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.interpreter.KermetaError> it_ft224 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_990 = false;\n\twhile( !idLoopCond_990 ) {\n\tidLoopCond_990 = it_ft224.isOff();\n\tif ( idLoopCond_990 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.interpreter.KermetaError error_lbdExp224 = it_ft224.next();\n\n\tkermeta.standard.helper.StringWrapper.append(e.getMessage(), kermeta.standard.helper.StringWrapper.plus(\"\\n\", error_lbdExp224.getMessage()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean parse(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString" actualParamsType="kermeta.utils.Hashtable<kermeta.standard.JavaString, kermeta.language.structure.Object>"
	 *        annotation="kermeta documentation='/**\r\n     * Execute the expression given as a string.\r\n     * the self type and formal parameters are supposed to be set\r\n     * before calling this operation\r\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_991 = false;\n\tidIfCond_991 = kermeta.standard.helper.BooleanWrapper.not(this.parse(body));\n\n\tif( idIfCond_991 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(\"kermeta.exceptions.DynamicExpressionException\"));\n\n\te.setMessage(\"evalString - expression contains errors\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = this.execute(selfObj, actualParams);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object evalString(String body,
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams);

} // DynamicExpression
