/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.ConstraintDiagnostic#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.ConstraintDiagnostic#getFailedConstraint <em>Failed Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.diagnostic.DiagnosticPackage#getConstraintDiagnostic()
 * @model
 * @generated
 */
public interface ConstraintDiagnostic extends EObject {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' reference.
	 * @see #setAppliesTo(Reference)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getConstraintDiagnostic_AppliesTo()
	 * @model required="true"
	 * @generated
	 */
	Reference getAppliesTo();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.ConstraintDiagnostic#getAppliesTo <em>Applies To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(Reference value);

	/**
	 * Returns the value of the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Constraint</em>' reference.
	 * @see #setFailedConstraint(Constraint)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getConstraintDiagnostic_FailedConstraint()
	 * @model required="true"
	 * @generated
	 */
	Constraint getFailedConstraint();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.ConstraintDiagnostic#getFailedConstraint <em>Failed Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Constraint</em>' reference.
	 * @see #getFailedConstraint()
	 * @generated
	 */
	void setFailedConstraint(Constraint value);

} // ConstraintDiagnostic
