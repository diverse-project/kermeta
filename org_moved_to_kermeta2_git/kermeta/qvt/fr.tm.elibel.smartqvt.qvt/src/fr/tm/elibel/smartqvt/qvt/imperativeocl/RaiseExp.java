/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl;

import fr.tm.elibel.smartqvt.qvt.emof.Type;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getRaiseExp()
 * @model
 * @generated
 */
public interface RaiseExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getRaiseExp_Argument()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getArgument();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(Type)
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getRaiseExp_Exception()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Type getException();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.RaiseExp#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(Type value);

} // RaiseExp
