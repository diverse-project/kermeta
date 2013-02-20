/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.emof.Element;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern <em>Bottom Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getSlotExpression <em>Slot Expression</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Element {
	/**
	 * Returns the value of the '<em><b>Bottom Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Pattern</em>' container reference.
	 * @see #setBottomPattern(BottomPattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getAssignment_BottomPattern()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.BottomPattern#getAssignment
	 * @model opposite="assignment" required="true" ordered="false"
	 * @generated
	 */
	BottomPattern getBottomPattern();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getBottomPattern <em>Bottom Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Pattern</em>' container reference.
	 * @see #getBottomPattern()
	 * @generated
	 */
	void setBottomPattern(BottomPattern value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getAssignment_IsDefault()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Slot Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Expression</em>' containment reference.
	 * @see #setSlotExpression(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getAssignment_SlotExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getSlotExpression();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getSlotExpression <em>Slot Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Expression</em>' containment reference.
	 * @see #getSlotExpression()
	 * @generated
	 */
	void setSlotExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getAssignment_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

} // Assignment
