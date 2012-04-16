/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Construction Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.SequenceConstructionExpression#getSequenceElement <em>Sequence Element</em>}</li>
 *   <li>{@link org3.kermeta.alf.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getSequenceConstructionExpression()
 * @model
 * @generated
 */
public interface SequenceConstructionExpression extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>Sequence Element</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.SequenceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Element</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getSequenceConstructionExpression_SequenceElement()
	 * @model type="org3.kermeta.alf.SequenceElement" containment="true"
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
	 * @see org3.kermeta.alf.AlfPackage#getSequenceConstructionExpression_RangeUpper()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRangeUpper();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.SequenceConstructionExpression#getRangeUpper <em>Range Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Upper</em>' containment reference.
	 * @see #getRangeUpper()
	 * @generated
	 */
	void setRangeUpper(Expression value);

} // SequenceConstructionExpression
