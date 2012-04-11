/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Construction Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SequenceConstructionExpression#getSequenceElement <em>Sequence Element</em>}</li>
 *   <li>{@link alfDsl.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSequenceConstructionExpression()
 * @model
 * @generated
 */
public interface SequenceConstructionExpression extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>Sequence Element</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.SequenceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Element</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getSequenceConstructionExpression_SequenceElement()
	 * @model type="alfDsl.SequenceElement" containment="true"
	 * @generated
	 */
	EList getSequenceElement();

	/**
	 * Returns the value of the '<em><b>Range Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Upper</em>' containment reference.
	 * @see #setRangeUpper(Expression)
	 * @see alfDsl.AlfDslPackage#getSequenceConstructionExpression_RangeUpper()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRangeUpper();

	/**
	 * Sets the value of the '{@link alfDsl.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Upper</em>' containment reference.
	 * @see #getRangeUpper()
	 * @generated
	 */
	void setRangeUpper(Expression value);

} // SequenceConstructionExpression
