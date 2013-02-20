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
 * A representation of the model object '<em><b>Switch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.alf.xtext.alf.SwitchClause#getSwitchCase <em>Switch Case</em>}</li>
 *   <li>{@link org.kermeta.alf.xtext.alf.SwitchClause#getStatementSequence <em>Statement Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getSwitchClause()
 * @model
 * @generated
 */
public interface SwitchClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch Case</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.SwitchCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Case</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Case</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getSwitchClause_SwitchCase()
   * @model containment="true"
   * @generated
   */
  EList<SwitchCase> getSwitchCase();

  /**
   * Returns the value of the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Sequence</em>' containment reference.
   * @see #setStatementSequence(NonEmptyStatementSequence)
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getSwitchClause_StatementSequence()
   * @model containment="true"
   * @generated
   */
  NonEmptyStatementSequence getStatementSequence();

  /**
   * Sets the value of the '{@link org.kermeta.alf.xtext.alf.SwitchClause#getStatementSequence <em>Statement Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Sequence</em>' containment reference.
   * @see #getStatementSequence()
   * @generated
   */
  void setStatementSequence(NonEmptyStatementSequence value);

} // SwitchClause
