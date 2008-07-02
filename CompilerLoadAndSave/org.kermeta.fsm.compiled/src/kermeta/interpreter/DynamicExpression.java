/**
 * Copyright: IRISA/INRIA/Universite de Rennes 1 - License: EPL - Web site: http://www.kermeta.org
 *
 * $Id: DynamicExpression.java,v 1.1 2008-07-02 09:13:33 ftanguy Exp $
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
public interface DynamicExpression extends kermeta.language.structure.Object
{
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
   * @model
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
   * @model
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
   * @model type="kermeta.utils.Hashtable<kermeta.standard.String, kermeta.language.structure.Type>"
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
   * @model
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
   * @model ordered="false"
   *        annotation="kermeta documentation='/**\r\n\t * Initializes the formalParameters with an empty set of parameters\r\n\t * and the self type with void\r\n\t \052/'"
   * @generated
   */
  kermeta.standard.Void initializeDefaults();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model actualParamsType="kermeta.utils.Hashtable<kermeta.standard.String, kermeta.language.structure.Object>"
   *        annotation="kermeta documentation='/**\r\n     * Execute the expression in the given context\r\n     \052/'"
   * @generated
   */
  kermeta.language.structure.Object execute(kermeta.language.structure.Object selfObj, Hashtable<String, kermeta.language.structure.Object> actualParams);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="kermeta.standard.Boolean" expressionDataType="kermeta.standard.String"
   *        annotation="kermeta documentation='/**\r\n\t * Parse the expression as a string\r\n\t * and updates the expression field and errors\r\n\t * Returns true if the expression was parsed sucessfuly\r\n\t \052/'"
   * @generated
   */
  boolean parse(String expression);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model bodyDataType="kermeta.standard.String" actualParamsType="kermeta.utils.Hashtable<kermeta.standard.String, kermeta.language.structure.Object>"
   *        annotation="kermeta documentation='/**\r\n     * Execute the expression given as a string.\r\n     * the self type and formal parameters are supposed to be set\r\n     * before calling this operation\r\n     \052/'"
   * @generated
   */
  kermeta.language.structure.Object evalString(String body, kermeta.language.structure.Object selfObj, Hashtable<String, kermeta.language.structure.Object> actualParams);

} // DynamicExpression
