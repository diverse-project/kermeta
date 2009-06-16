/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
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
 * @model annotation="kermeta documentation='/**\n * DynamicExpression is a class used to make dynamic calls, i.e dynamic evaluation\n * of Kermeta statements represented in a string.\n * \n * An example :\n *   var de : DynamicExpression init DynamicExpression.new\n *   de.initializeDefaults\n *   de.formalParameters.put(\"a\", String)\n *   de.parse(\"stdio.writeln(a)\") // note: to execute a list of statements, you have to surround them with do..end\n *   var params : Hashtable<String, Object> init Hashtable<String, Object>.new\n *   params.put(\"a\", \"hello world!\")\n *   de.execute(void, params)\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/dynamic_expression_view.png\"/>\n \052/'"
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
	 * @model annotation="kermeta documentation='/**\n\t * the expression\n\t \052/'"
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
	 * @model annotation="kermeta documentation='/**\n\t * Parse errors and type errors\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n\t * Formal parameters of the expression (bindings between parameters\' names and types)\n\t \052/'"
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
	 * @model annotation="kermeta documentation='/**\n\t * The type of the self object\n\t * or void if the expression is not to be executed\n\t * in the context of an object\n\t \052/'"
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
	 *        annotation="kermeta documentation='/**\n     * Execute the expression in the given context\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_355 = false;\n\tidIfCond_355 = org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getExpression(), null);\n\n\tif( idIfCond_355 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getDynamicExpressionException()));\n\n\te.setMessage(\"execute precondition - expression is void\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tjava.lang.Boolean idIfCond_356 = false;\n\tidIfCond_356 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).size(), 0);\n\n\tif( idIfCond_356 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getDynamicExpressionException()));\n\n\te.setMessage(\"execute precondition - expression contains errors\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil.execute(this, selfObj, actualParams);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object execute(
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="kermeta documentation='/**\n\t * Initializes the formalParameters with an empty set of parameters\n\t * and the self type with void\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\tthis.setFormalParameters(((kermeta.utils.Hashtable<java.lang.String, kermeta.language.structure.Type>) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.utils.UtilsPackage.eINSTANCE.getHashtable())));\n\n\tthis.setSelfClass((kermeta.language.structure.ClassDefinition) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(\"kermeta.language.structure.Object\").getTypeDefinition(), \"kermeta.language.structure.ClassDefinition\"));\n'"
	 * @generated
	 */
	void initializeDefaults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaBoolean" expressionDataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n\t * Parse the expression as a string\n\t * and updates the expression field and errors\n\t * Returns true if the expression was parsed sucessfuly\n\t \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.Boolean result = null;\n\n\torg.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).clear();\n\n\tjava.lang.Boolean idIfCond_357 = false;\n\tidIfCond_357 = kermeta.standard.helper.BooleanWrapper.or(org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getFormalParameters(), null), org.kermeta.compil.runtime.helper.language.ObjectUtil.equalsSwitcher(this.getSelfClass(), null));\n\n\tif( idIfCond_357 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getDynamicExpressionException()));\n\n\te.setMessage(\"parse precondition - formalParameters or selfType is void\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = (java.lang.Boolean) org.kermeta.compil.runtime.helper.language.ObjectUtil.asTypeOrVoid(org.kermeta.compil.runtime.helper.language.DynamicExpressionUtil.parse(this, expression), \"java.lang.Boolean\");\n\n\tjava.lang.Boolean idIfCond_358 = false;\n\tidIfCond_358 = org.kermeta.compil.runtime.helper.language.ObjectUtil.isNotEqualSwitcher(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).size(), 0);\n\n\tif( idIfCond_358 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getDynamicExpressionException()));\n\n\te.setMessage(\"parse result - expression contains errors\");\n\n\t//BIft:each\n\n\t\n{\n\n\tkermeta.standard.Iterator<kermeta.interpreter.KermetaError> it_ft87 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.<kermeta.interpreter.KermetaError>convertAsOrderedSet(this.getErrors()).iterator();\n\tjava.lang.Boolean idLoopCond_359 = false;\n\twhile( !idLoopCond_359 ) {\n\tidLoopCond_359 = it_ft87.isOff();\n\tif ( idLoopCond_359 ) {\n\t} else {\n\n\t//BIle:func\nkermeta.interpreter.KermetaError error_lbdExp87 = it_ft87.next();\n\n\tkermeta.standard.helper.StringWrapper.append(e.getMessage(), kermeta.standard.helper.StringWrapper.plus(\"\\n\", error_lbdExp87.getMessage()));\n//EIle:func\n\n}\n\t}\n}\n\n//EIft:each\n\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\nreturn result;\n'"
	 * @generated
	 */
	Boolean parse(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bodyDataType="kermeta.standard.JavaString" actualParamsType="kermeta.utils.Hashtable<kermeta.standard.JavaString, kermeta.language.structure.Object>"
	 *        annotation="kermeta documentation='/**\n     * Execute the expression given as a string.\n     * the self type and formal parameters are supposed to be set\n     * before calling this operation\n     \052/'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\nkermeta.language.structure.Object result = null;\n\n\tjava.lang.Boolean idIfCond_360 = false;\n\tidIfCond_360 = kermeta.standard.helper.BooleanWrapper.not(this.parse(body));\n\n\tif( idIfCond_360 ) {\n\n\tkermeta.exceptions.DynamicExpressionException e = ((kermeta.exceptions.DynamicExpressionException) org.kermeta.compil.runtime.helper.language.ClassUtil.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE.getDynamicExpressionException()));\n\n\te.setMessage(\"evalString - expression contains errors\");\n\n\t\nif (true)\n\tthrow new org.kermeta.compil.runtime.helper.error.KRuntimeError( e );\n\n}\n\n\n\tresult = this.execute(selfObj, actualParams);\n\nreturn result;\n'"
	 * @generated
	 */
	kermeta.language.structure.Object evalString(String body,
			kermeta.language.structure.Object selfObj,
			Hashtable<String, kermeta.language.structure.Object> actualParams);

} // DynamicExpression
