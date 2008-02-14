/**
 * <copyright>
 * </copyright>
 *
 * $Id: Raise.java,v 1.6 2008-02-14 07:13:03 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.Raise#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRaise()
 * @model annotation="GenModel documentation='/**\n * Refers to raise exception block\n \052/'"
 * @generated
 */
public interface Raise extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getRaise_Expression()
	 * @model containment="true" resolveProxies="true" required="true"
	 *        annotation="GenModel documentation='/**\n * To be written #######################\n \052/'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.Raise#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Raise