/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.emof.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment#getTargetProperty <em>Target Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getPropertyAssignment()
 * @model
 * @generated
 */
public interface PropertyAssignment extends Assignment {
	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(Property)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getPropertyAssignment_TargetProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getTargetProperty();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.PropertyAssignment#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(Property value);

} // PropertyAssignment
