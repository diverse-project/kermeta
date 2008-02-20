/**
 * <copyright>
 * </copyright>
 *
 * $Id: Rule.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acm.Rule#getType <em>Type</em>}</li>
 *   <li>{@link acm.Rule#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see acm.AcmPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RuleType)
	 * @see acm.AcmPackage#getRule_Type()
	 * @model required="true"
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link acm.Rule#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link acm.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see acm.AcmPackage#getRule_Parameters()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getParameters();

} // Rule
