/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.emof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Package#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Package#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getPackage_NestedPackage()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Package" containment="true" ordered="false"
	 * @generated
	 */
	EList getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Type}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.emof.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getPackage_OwnedType()
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Type#getPackage
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Type" opposite="package" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedType();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getPackage_Uri()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.emof.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // Package
