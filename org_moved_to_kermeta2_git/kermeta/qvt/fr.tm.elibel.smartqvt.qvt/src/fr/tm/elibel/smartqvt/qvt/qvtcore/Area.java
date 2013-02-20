/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern <em>Bottom Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getGuardPattern <em>Guard Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getArea()
 * @model abstract="true"
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Bottom Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Pattern</em>' containment reference.
	 * @see #setBottomPattern(BottomPattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getArea_BottomPattern()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getArea
	 * @model opposite="area" containment="true" required="true" ordered="false"
	 * @generated
	 */
	BottomPattern getBottomPattern();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getBottomPattern <em>Bottom Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Pattern</em>' containment reference.
	 * @see #getBottomPattern()
	 * @generated
	 */
	void setBottomPattern(BottomPattern value);

	/**
	 * Returns the value of the '<em><b>Guard Pattern</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Pattern</em>' containment reference.
	 * @see #setGuardPattern(GuardPattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getArea_GuardPattern()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.GuardPattern#getArea
	 * @model opposite="area" containment="true" required="true" ordered="false"
	 * @generated
	 */
	GuardPattern getGuardPattern();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Area#getGuardPattern <em>Guard Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Pattern</em>' containment reference.
	 * @see #getGuardPattern()
	 * @generated
	 */
	void setGuardPattern(GuardPattern value);

} // Area
