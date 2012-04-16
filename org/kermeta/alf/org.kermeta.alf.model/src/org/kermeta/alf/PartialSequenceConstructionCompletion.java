/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Sequence Construction Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.PartialSequenceConstructionCompletion#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getPartialSequenceConstructionCompletion()
 * @model
 * @generated
 */
public interface PartialSequenceConstructionCompletion extends EObject {
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
	 * @see org.kermeta.alf.AlfPackage#getPartialSequenceConstructionCompletion_Expression()
	 * @model containment="true"
	 * @generated
	 */
	SequenceConstructionExpression getExpression();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.PartialSequenceConstructionCompletion#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SequenceConstructionExpression value);

} // PartialSequenceConstructionCompletion
