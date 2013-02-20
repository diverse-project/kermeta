/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation;

import fr.tm.elibel.smartqvt.qvt.emof.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getIdentifies <em>Identifies</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getPart <em>Part</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends Element {
	/**
	 * Returns the value of the '<em><b>Identifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifies</em>' reference.
	 * @see #setIdentifies(fr.tm.elibel.smartqvt.qvt.emof.Class)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getKey_Identifies()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	fr.tm.elibel.smartqvt.qvt.emof.Class getIdentifies();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getIdentifies <em>Identifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifies</em>' reference.
	 * @see #getIdentifies()
	 * @generated
	 */
	void setIdentifies(fr.tm.elibel.smartqvt.qvt.emof.Class value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getKey_Part()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Property" required="true" ordered="false"
	 * @generated
	 */
	EList getPart();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation#getOwnedKey <em>Owned Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(RelationalTransformation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getKey_Transformation()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationalTransformation#getOwnedKey
	 * @model opposite="ownedKey" ordered="false"
	 * @generated
	 */
	RelationalTransformation getTransformation();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Key#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(RelationalTransformation value);

} // Key
