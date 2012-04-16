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
 * A representation of the model object '<em><b>Non Empty Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.NonEmptyStatementSequence#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.AlfPackage#getNonEmptyStatementSequence()
 * @model
 * @generated
 */
public interface NonEmptyStatementSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.alf.DocumentedStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see org.kermeta.alf.AlfPackage#getNonEmptyStatementSequence_Statement()
	 * @model type="org.kermeta.alf.DocumentedStatement" containment="true"
	 * @generated
	 */
	EList getStatement();

} // NonEmptyStatementSequence
