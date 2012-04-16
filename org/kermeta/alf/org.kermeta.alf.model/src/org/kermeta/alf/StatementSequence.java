/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.StatementSequence#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getStatementSequence()
 * @model
 * @generated
 */
public interface StatementSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.DocumentedStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getStatementSequence_Statements()
	 * @model type="org.kermeta.alf.DocumentedStatement" containment="true"
	 * @generated
	 */
	EList getStatements();

} // StatementSequence
