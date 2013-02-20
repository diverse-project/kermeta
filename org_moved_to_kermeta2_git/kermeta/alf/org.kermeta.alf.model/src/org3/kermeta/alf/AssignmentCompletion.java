/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.AssignmentCompletion#getOp <em>Op</em>}</li>
 *   <li>{@link org3.kermeta.alf.AssignmentCompletion#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getAssignmentCompletion()
 * @model
 * @generated
 */
public interface AssignmentCompletion extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org3.kermeta.alf.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.AssignmentOperator
	 * @see #setOp(AssignmentOperator)
	 * @see org3.kermeta.alf.AlfPackage#getAssignmentCompletion_Op()
	 * @model
	 * @generated
	 */
	AssignmentOperator getOp();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.AssignmentCompletion#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.AssignmentOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #setRightHandSide(Expression)
	 * @see org3.kermeta.alf.AlfPackage#getAssignmentCompletion_RightHandSide()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightHandSide();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.AssignmentCompletion#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Expression value);

} // AssignmentCompletion
