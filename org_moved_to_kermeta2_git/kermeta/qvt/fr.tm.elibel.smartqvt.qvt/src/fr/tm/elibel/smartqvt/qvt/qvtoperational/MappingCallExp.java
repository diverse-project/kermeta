/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingCallExp()
 * @model
 * @generated
 */
public interface MappingCallExp extends ImperativeCallExp {
	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingCallExp_IsStrict()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsStrict();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingCallExp#getIsStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #getIsStrict()
	 * @generated
	 */
	void setIsStrict(Boolean value);

} // MappingCallExp
