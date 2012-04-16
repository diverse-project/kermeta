/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Or Reject Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.SelectOrRejectOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getSelectOrRejectOperation()
 * @model
 * @generated
 */
public interface SelectOrRejectOperation extends SequenceExpansionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org3.kermeta.alf.SelectOrRejectOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.SelectOrRejectOperator
	 * @see #setOp(SelectOrRejectOperator)
	 * @see org3.kermeta.alf.AlfPackage#getSelectOrRejectOperation_Op()
	 * @model
	 * @generated
	 */
	SelectOrRejectOperator getOp();

	/**
	 * Sets the value of the '{@link org3.kermeta.alf.SelectOrRejectOperation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org3.kermeta.alf.SelectOrRejectOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(SelectOrRejectOperator value);

} // SelectOrRejectOperation
