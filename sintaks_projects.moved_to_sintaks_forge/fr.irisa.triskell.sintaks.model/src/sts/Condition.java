/**
 * <copyright>
 * </copyright>
 *
 * $Id: Condition.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sts.Condition#getSubRule <em>Sub Rule</em>}</li>
 *   <li>{@link sts.Condition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see sts.StsPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rule</em>' containment reference.
	 * @see #setSubRule(Rule)
	 * @see sts.StsPackage#getCondition_SubRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getSubRule();

	/**
	 * Sets the value of the '{@link sts.Condition#getSubRule <em>Sub Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Rule</em>' containment reference.
	 * @see #getSubRule()
	 * @generated
	 */
	void setSubRule(Rule value);

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
	 * @see sts.StsPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sts.Condition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Condition