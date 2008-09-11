/**
 * <copyright>
 * </copyright>
 *
 * $Id: Raise.java,v 1.2 2008-09-11 12:34:36 cfaucher Exp $
 */
package kermeta.language.behavior;

import km2ecore.KM2EcoreContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.language.behavior.Raise#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.language.behavior.BehaviorPackage#getRaise()
 * @model annotation="kermeta documentation='Refers to raise exception block'"
 *        annotation="kermeta documentation='/** Complete \052/'"
 * @generated
 */
public interface Raise extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see kermeta.language.behavior.BehaviorPackage#getRaise_Expression()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="kermeta documentation='To be written #######################'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link kermeta.language.behavior.Raise#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta superOperation='kermeta::language::behavior::Expression'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\njava.lang.String result = null;\n\n\tsuper.createBehaviorJava(context);\n\n\tresult = kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(kermeta.standard.helper.StringWrapper.plus(\"\\nif (true)\\n\\tthrow new \", context.getJAVA_CLASS_EXCEPTION_SWITCHER()), \"( \"), this.getExpression().createBehaviorJava(context)), \" );\\n\");\n\nreturn result;\n'"
	 * @generated
	 */
	String createBehaviorJava(KM2EcoreContext context);

} // Raise
