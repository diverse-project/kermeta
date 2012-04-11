/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Construction Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SequenceConstructionCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}</li>
 *   <li>{@link alfDsl.SequenceConstructionCompletion#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSequenceConstructionCompletion()
 * @model
 * @generated
 */
public interface SequenceConstructionCompletion extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Indicator</em>' attribute.
	 * @see #setMultiplicityIndicator(boolean)
	 * @see alfDsl.AlfDslPackage#getSequenceConstructionCompletion_MultiplicityIndicator()
	 * @model
	 * @generated
	 */
	boolean isMultiplicityIndicator();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceConstructionCompletion#isMultiplicityIndicator <em>Multiplicity Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Indicator</em>' attribute.
	 * @see #isMultiplicityIndicator()
	 * @generated
	 */
	void setMultiplicityIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(SequenceConstructionExpression)
	 * @see alfDsl.AlfDslPackage#getSequenceConstructionCompletion_Expression()
	 * @model containment="true"
	 * @generated
	 */
	SequenceConstructionExpression getExpression();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceConstructionCompletion#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SequenceConstructionExpression value);

} // SequenceConstructionCompletion
