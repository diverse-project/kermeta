/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org3.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrent Clauses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org3.kermeta.alf.ConcurrentClauses#getNonFinalClause <em>Non Final Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org3.kermeta.alf.AlfPackage#getConcurrentClauses()
 * @model
 * @generated
 */
public interface ConcurrentClauses extends EObject {
	/**
	 * Returns the value of the '<em><b>Non Final Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org3.kermeta.alf.NonFinalClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Final Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Final Clause</em>' containment reference list.
	 * @see org3.kermeta.alf.AlfPackage#getConcurrentClauses_NonFinalClause()
	 * @model containment="true"
	 * @generated
	 */
	EList<NonFinalClause> getNonFinalClause();

} // ConcurrentClauses
