/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtArrayAccess.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtArrayAccess#getIndexExpression <em>Index Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtArrayAccess()
 * @model
 * @generated
 */
public interface CtArrayAccess extends CtTargetedExpression, spoon.reflect.code.CtArrayAccess {
	/**
	 * Returns the value of the '<em><b>Index Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Expression</em>' reference.
	 * @see #setIndexExpression(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtArrayAccess_IndexExpression()
	 * @model
	 * @generated
	 */
	CtExpression getIndexExpression();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtArrayAccess#getIndexExpression <em>Index Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Expression</em>' reference.
	 * @see #getIndexExpression()
	 * @generated
	 */
	void setIndexExpression(CtExpression value);

} // CtArrayAccess