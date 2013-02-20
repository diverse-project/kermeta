/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.imperativeocl;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.SwitchExp#getAlternativePart <em>Alternative Part</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getSwitchExp()
 * @model
 * @generated
 */
public interface SwitchExp extends ImperativeExpression {
	/**
	 * Returns the value of the '<em><b>Alternative Part</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.imperativeocl.AltExp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Part</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getSwitchExp_AlternativePart()
	 * @model type="fr.tm.elibel.smartqvt.qvt.imperativeocl.AltExp" containment="true"
	 * @generated
	 */
	EList getAlternativePart();

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.imperativeocl.ImperativeoclPackage#getSwitchExp_ElsePart()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getElsePart();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(OclExpression value);

} // SwitchExp
