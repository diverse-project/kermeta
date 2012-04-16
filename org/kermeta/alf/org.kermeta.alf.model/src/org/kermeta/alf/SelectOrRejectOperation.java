/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Or Reject Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.SelectOrRejectOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getSelectOrRejectOperation()
 * @model
 * @generated
 */
public interface SelectOrRejectOperation extends SequenceExpansionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.alf.SelectOrRejectOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.kermeta.alf.SelectOrRejectOperator
	 * @see #setOp(SelectOrRejectOperator)
	 * @see org.kermeta.alf.AlfPackage#getSelectOrRejectOperation_Op()
	 * @model
	 * @generated
	 */
	SelectOrRejectOperator getOp();

	/**
	 * Sets the value of the '{@link org.kermeta.alf.SelectOrRejectOperation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.kermeta.alf.SelectOrRejectOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(SelectOrRejectOperator value);

} // SelectOrRejectOperation
