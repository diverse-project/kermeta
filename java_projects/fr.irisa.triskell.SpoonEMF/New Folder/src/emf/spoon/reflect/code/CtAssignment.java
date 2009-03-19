/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtAssignment.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtAssignment#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link emf.spoon.reflect.code.CtAssignment#getAssigned <em>Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtAssignment()
 * @model
 * @generated
 */
public interface CtAssignment extends CtExpression, CtStatement, spoon.reflect.code.CtAssignment {
	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference.
	 * @see #setAssignment(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtAssignment_Assignment()
	 * @model
	 * @generated
	 */
	CtExpression getAssignment();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtAssignment#getAssignment <em>Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(CtExpression value);

	/**
	 * Returns the value of the '<em><b>Assigned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned</em>' reference.
	 * @see #setAssigned(CtExpression)
	 * @see emf.spoon.reflect.code.CodePackage#getCtAssignment_Assigned()
	 * @model
	 * @generated
	 */
	CtExpression getAssigned();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtAssignment#getAssigned <em>Assigned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned</em>' reference.
	 * @see #getAssigned()
	 * @generated
	 */
	void setAssigned(CtExpression value);

} // CtAssignment