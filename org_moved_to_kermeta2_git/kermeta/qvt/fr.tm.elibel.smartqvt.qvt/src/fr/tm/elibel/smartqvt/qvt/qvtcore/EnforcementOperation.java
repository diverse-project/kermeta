/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.emof.Element;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OperationCallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforcement Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern <em>Bottom Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getEnforcementMode <em>Enforcement Mode</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getOperationCallExp <em>Operation Call Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getEnforcementOperation()
 * @model
 * @generated
 */
public interface EnforcementOperation extends Element {
	/**
	 * Returns the value of the '<em><b>Bottom Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getEnforcementOperation <em>Enforcement Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Pattern</em>' container reference.
	 * @see #setBottomPattern(BottomPattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getEnforcementOperation_BottomPattern()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getEnforcementOperation
	 * @model opposite="enforcementOperation" required="true" ordered="false"
	 * @generated
	 */
	BottomPattern getBottomPattern();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern <em>Bottom Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Pattern</em>' container reference.
	 * @see #getBottomPattern()
	 * @generated
	 */
	void setBottomPattern(BottomPattern value);

	/**
	 * Returns the value of the '<em><b>Enforcement Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enforcement Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforcement Mode</em>' attribute.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode
	 * @see #setEnforcementMode(EnforcementMode)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getEnforcementOperation_EnforcementMode()
	 * @model
	 * @generated
	 */
	EnforcementMode getEnforcementMode();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getEnforcementMode <em>Enforcement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforcement Mode</em>' attribute.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementMode
	 * @see #getEnforcementMode()
	 * @generated
	 */
	void setEnforcementMode(EnforcementMode value);

	/**
	 * Returns the value of the '<em><b>Operation Call Exp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Call Exp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Exp</em>' reference.
	 * @see #setOperationCallExp(OperationCallExp)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getEnforcementOperation_OperationCallExp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationCallExp getOperationCallExp();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getOperationCallExp <em>Operation Call Exp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Exp</em>' reference.
	 * @see #getOperationCallExp()
	 * @generated
	 */
	void setOperationCallExp(OperationCallExp value);

} // EnforcementOperation
