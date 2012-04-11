/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

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
 *   <li>{@link alfDsl.SwitchClause#getSwitchCase <em>Switch Case</em>}</li>
 *   <li>{@link alfDsl.SwitchClause#getStatementSequence <em>Statement Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getSwitchClause()
 * @model
 * @generated
 */
public interface SwitchClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Switch Case</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.SwitchCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Case</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getSwitchClause_SwitchCase()
	 * @model type="alfDsl.SwitchCase" containment="true"
	 * @generated
	 */
	EList getSwitchCase();

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
	 * @see alfDsl.AlfDslPackage#getSwitchClause_StatementSequence()
	 * @model containment="true"
	 * @generated
	 */
	NonEmptyStatementSequence getStatementSequence();

	/**
	 * Sets the value of the '{@link alfDsl.SwitchClause#getStatementSequence <em>Statement Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Sequence</em>' containment reference.
	 * @see #getStatementSequence()
	 * @generated
	 */
	void setStatementSequence(NonEmptyStatementSequence value);

} // SwitchClause
