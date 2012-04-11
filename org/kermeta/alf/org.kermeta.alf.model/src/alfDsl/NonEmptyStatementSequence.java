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
 * A representation of the model object '<em><b>Non Empty Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.NonEmptyStatementSequence#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getNonEmptyStatementSequence()
 * @model
 * @generated
 */
public interface NonEmptyStatementSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.DocumentedStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getNonEmptyStatementSequence_Statement()
	 * @model type="alfDsl.DocumentedStatement" containment="true"
	 * @generated
	 */
	EList getStatement();

} // NonEmptyStatementSequence
