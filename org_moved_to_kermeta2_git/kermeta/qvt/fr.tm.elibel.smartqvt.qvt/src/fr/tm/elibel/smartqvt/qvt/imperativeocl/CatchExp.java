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
 * A representation of the model object '<em><b>Catch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp#getBody <em>Body</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.CatchExp#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getCatchExp()
 * @model
 * @generated
 */
public interface CatchExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getCatchExp_Body()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression" containment="true"
	 * @generated
	 */
	EList getBody();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getCatchExp_Exception()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Type"
	 * @generated
	 */
	EList getException();

} // CatchExp
