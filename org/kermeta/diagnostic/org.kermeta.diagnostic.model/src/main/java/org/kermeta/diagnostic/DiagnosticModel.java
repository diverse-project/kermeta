/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.DiagnosticModel#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.DiagnosticModel#getReferences <em>References</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.DiagnosticModel#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.diagnostic.DiagnosticPackage#getDiagnosticModel()
 * @model
 * @generated
 */
public interface DiagnosticModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.diagnostic.ConstraintDiagnostic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference list.
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getDiagnosticModel_Diagnostics()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintDiagnostic> getDiagnostics();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.diagnostic.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getDiagnosticModel_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.diagnostic.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getDiagnosticModel_Constraints()
	 * @model
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // DiagnosticModel
