/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' reference.
	 * @see #setTargetVariable(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getVariableAssignment_TargetVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getTargetVariable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.VariableAssignment#getTargetVariable <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' reference.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(Variable value);

} // VariableAssignment
