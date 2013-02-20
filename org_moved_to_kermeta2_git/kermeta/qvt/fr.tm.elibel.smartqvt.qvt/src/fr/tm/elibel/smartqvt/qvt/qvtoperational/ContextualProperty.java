/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import fr.tm.elibel.smartqvt.qvt.emof.Property;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getContext <em>Context</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getOverridden <em>Overridden</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getContextualProperty()
 * @model
 * @generated
 */
public interface ContextualProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(fr.tm.elibel.smartqvt.qvt.emof.Class)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getContextualProperty_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Class getContext();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(fr.tm.elibel.smartqvt.qvt.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getContextualProperty_InitExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getInitExpression();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Overridden</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden</em>' reference.
	 * @see #setOverridden(Property)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getContextualProperty_Overridden()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getOverridden();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ContextualProperty#getOverridden <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden</em>' reference.
	 * @see #getOverridden()
	 * @generated
	 */
	void setOverridden(Property value);

} // ContextualProperty
