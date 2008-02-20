/**
 * <copyright>
 * </copyright>
 *
 * $Id: Element.java,v 1.1 2008-02-20 14:16:35 ffleurey Exp $
 */
package acm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link acm.Element#getType <em>Type</em>}</li>
 *   <li>{@link acm.Element#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see acm.AcmPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ElementType)
	 * @see acm.AcmPackage#getElement_Type()
	 * @model required="true"
	 * @generated
	 */
	ElementType getType();

	/**
	 * Sets the value of the '{@link acm.Element#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link acm.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see acm.AcmPackage#getElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getChildren();

} // Element
