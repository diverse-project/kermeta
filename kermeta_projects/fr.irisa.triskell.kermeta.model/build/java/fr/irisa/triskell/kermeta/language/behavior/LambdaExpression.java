/**
 * <copyright>
 * </copyright>
 *
 * $Id: LambdaExpression.java,v 1.5 2007-07-11 14:41:50 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.LambdaExpression#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.irisa.triskell.kermeta.language.behavior.LambdaExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaExpression()
 * @model
 * @generated
 */
public interface LambdaExpression extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "IRISA / INRIA / Universite de Rennes 1";

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.triskell.kermeta.language.behavior.LambdaParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaExpression_Parameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<LambdaParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage#getLambdaExpression_Body()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.language.behavior.LambdaExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // LambdaExpression