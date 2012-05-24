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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getClass_IsAbstract()
	 * @model default="false" dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Property}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.emof.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getClass_OwnedAttribute()
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Property#getClass_
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Property" opposite="class" containment="true"
	 * @generated
	 */
	EList getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Operation}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.emof.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getClass_OwnedOperation()
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Operation#getClass_
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Operation" opposite="class" containment="true"
	 * @generated
	 */
	EList getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getClass_SuperClass()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Class" ordered="false"
	 * @generated
	 */
	EList getSuperClass();

} // Class
