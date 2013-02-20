/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.TryExp#getExceptClause <em>Except Clause</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.TryExp#getTryBody <em>Try Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getTryExp()
 * @model
 * @generated
 */
public interface TryExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Except Clause</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Except Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except Clause</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getTryExp_ExceptClause()
	 * @model type="fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp" containment="true"
	 * @generated
	 */
	EList getExceptClause();

	/**
	 * Returns the value of the '<em><b>Try Body</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try Body</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getTryExp_TryBody()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression" containment="true"
	 * @generated
	 */
	EList getTryBody();

} // TryExp
