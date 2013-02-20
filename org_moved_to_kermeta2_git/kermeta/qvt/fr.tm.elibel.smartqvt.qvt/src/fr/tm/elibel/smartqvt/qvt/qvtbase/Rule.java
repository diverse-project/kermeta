/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase;

import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getDomain <em>Domain</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getRule_Domain()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getRule
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtbase.Domain" opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	EList getDomain();

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overrides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' reference.
	 * @see #setOverrides(Rule)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getRule_Overrides()
	 * @model ordered="false"
	 * @generated
	 */
	Rule getOverrides();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getOverrides <em>Overrides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrides</em>' reference.
	 * @see #getOverrides()
	 * @generated
	 */
	void setOverrides(Rule value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getRule_Transformation()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Transformation#getRule
	 * @model opposite="rule" required="true" ordered="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

} // Rule
