/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Or Reject Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.SelectOrRejectOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSelectOrRejectOperation()
 * @model
 * @generated
 */
public interface SelectOrRejectOperation extends SequenceExpansionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link alfDsl.SelectOrRejectOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see alfDsl.SelectOrRejectOperator
	 * @see #setOp(SelectOrRejectOperator)
	 * @see alfDsl.AlfDslPackage#getSelectOrRejectOperation_Op()
	 * @model
	 * @generated
	 */
	SelectOrRejectOperator getOp();

	/**
	 * Sets the value of the '{@link alfDsl.SelectOrRejectOperation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see alfDsl.SelectOrRejectOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(SelectOrRejectOperator value);

} // SelectOrRejectOperation
