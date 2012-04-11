/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Operation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.LinkOperationExpression#getKind <em>Kind</em>}</li>
 *   <li>{@link alfDsl.LinkOperationExpression#getTuple <em>Tuple</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getLinkOperationExpression()
 * @model
 * @generated
 */
public interface LinkOperationExpression extends SuffixExpression {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link alfDsl.LinkOperationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see alfDsl.LinkOperationKind
	 * @see #setKind(LinkOperationKind)
	 * @see alfDsl.AlfDslPackage#getLinkOperationExpression_Kind()
	 * @model
	 * @generated
	 */
	LinkOperationKind getKind();

	/**
	 * Sets the value of the '{@link alfDsl.LinkOperationExpression#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see alfDsl.LinkOperationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(LinkOperationKind value);

	/**
	 * Returns the value of the '<em><b>Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple</em>' containment reference.
	 * @see #setTuple(LinkOperationTuple)
	 * @see alfDsl.AlfDslPackage#getLinkOperationExpression_Tuple()
	 * @model containment="true"
	 * @generated
	 */
	LinkOperationTuple getTuple();

	/**
	 * Sets the value of the '{@link alfDsl.LinkOperationExpression#getTuple <em>Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple</em>' containment reference.
	 * @see #getTuple()
	 * @generated
	 */
	void setTuple(LinkOperationTuple value);

} // LinkOperationExpression
