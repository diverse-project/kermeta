/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtOperatorAssignment.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.code;

import spoon.reflect.code.BinaryOperatorKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Operator Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.code.CtOperatorAssignment#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.code.CodePackage#getCtOperatorAssignment()
 * @model
 * @generated
 */
public interface CtOperatorAssignment extends CtAssignment, spoon.reflect.code.CtOperatorAssignment {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(BinaryOperatorKind)
	 * @see emf.spoon.reflect.code.CodePackage#getCtOperatorAssignment_Kind()
	 * @model dataType="emf.spoon.BinaryOperatorKind"
	 * @generated
	 */
	BinaryOperatorKind getKind();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.code.CtOperatorAssignment#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BinaryOperatorKind value);

} // CtOperatorAssignment