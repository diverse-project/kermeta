/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractEntity.java,v 1.1 2007-04-04 13:43:54 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.kpm.AbstractEntity#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractEntity()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(SimpleExpression)
	 * @see fr.irisa.triskell.kermeta.kpm.KpmPackage#getAbstractEntity_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SimpleExpression getExpression();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kermeta.kpm.AbstractEntity#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SimpleExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluate(Unit unit);

} // AbstractEntity