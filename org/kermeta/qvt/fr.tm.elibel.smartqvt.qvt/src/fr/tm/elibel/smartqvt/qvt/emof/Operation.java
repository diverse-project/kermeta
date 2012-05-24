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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.emof.Operation#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.emof.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(fr.tm.elibel.smartqvt.qvt.emof.Class)
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getOperation_Class()
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Class#getOwnedOperation
	 * @model opposite="ownedOperation" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Class getClass_();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.emof.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(fr.tm.elibel.smartqvt.qvt.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Parameter}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.emof.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getOperation_OwnedParameter()
	 * @see fr.tm.elibel.smartqvt.qvt.emof.Parameter#getOperation
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Parameter" opposite="operation" containment="true"
	 * @generated
	 */
	EList getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.emof.EmofPackage#getOperation_RaisedException()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Type" ordered="false"
	 * @generated
	 */
	EList getRaisedException();

} // Operation
