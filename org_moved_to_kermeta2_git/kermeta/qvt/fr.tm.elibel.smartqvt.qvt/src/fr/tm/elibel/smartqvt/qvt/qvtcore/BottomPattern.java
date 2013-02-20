/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bottom Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea <em>Area</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getEnforcementOperation <em>Enforcement Operation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getRealizedVariable <em>Realized Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getBottomPattern()
 * @model
 * @generated
 */
public interface BottomPattern extends CorePattern {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' container reference.
	 * @see #setArea(Area)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getBottomPattern_Area()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern
	 * @model opposite="bottomPattern" required="true" ordered="false"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea <em>Area</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' container reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getBottomPattern_Assignment()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment" opposite="bottomPattern" containment="true" ordered="false"
	 * @generated
	 */
	EList getAssignment();

	/**
	 * Returns the value of the '<em><b>Enforcement Operation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enforcement Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforcement Operation</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getBottomPattern_EnforcementOperation()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation#getBottomPattern
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.EnforcementOperation" opposite="bottomPattern" containment="true" ordered="false"
	 * @generated
	 */
	EList getEnforcementOperation();

	/**
	 * Returns the value of the '<em><b>Realized Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable#getBottomPattern <em>Bottom Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Variable</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getBottomPattern_RealizedVariable()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable#getBottomPattern
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.RealizedVariable" opposite="bottomPattern" containment="true" ordered="false"
	 * @generated
	 */
	EList getRealizedVariable();

} // BottomPattern
