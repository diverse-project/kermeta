/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;

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
 *   <li>{@link org.kermeta.alf.xtext.alf.NonEmptyStatementSequence#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getNonEmptyStatementSequence()
 * @model
 * @generated
 */
public interface NonEmptyStatementSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.DocumentedStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getNonEmptyStatementSequence_Statement()
   * @model containment="true"
   * @generated
   */
  EList<DocumentedStatement> getStatement();

} // NonEmptyStatementSequence
