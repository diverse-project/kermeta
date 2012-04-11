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
 * A representation of the model object '<em><b>Statement Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.StatementSequence#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getStatementSequence()
 * @model
 * @generated
 */
public interface StatementSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.DocumentedStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getStatementSequence_Statements()
	 * @model type="alfDsl.DocumentedStatement" containment="true"
	 * @generated
	 */
	EList getStatements();

} // StatementSequence
