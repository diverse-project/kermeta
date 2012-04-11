/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Or Exists Or One Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ForAllOrExistsOrOneOperation#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getForAllOrExistsOrOneOperation()
 * @model
 * @generated
 */
public interface ForAllOrExistsOrOneOperation extends SequenceExpansionExpression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link alfDsl.ForAllOrExistsOrOneOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see alfDsl.ForAllOrExistsOrOneOperator
	 * @see #setOp(ForAllOrExistsOrOneOperator)
	 * @see alfDsl.AlfDslPackage#getForAllOrExistsOrOneOperation_Op()
	 * @model
	 * @generated
	 */
	ForAllOrExistsOrOneOperator getOp();

	/**
	 * Sets the value of the '{@link alfDsl.ForAllOrExistsOrOneOperation#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see alfDsl.ForAllOrExistsOrOneOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ForAllOrExistsOrOneOperator value);

} // ForAllOrExistsOrOneOperation
