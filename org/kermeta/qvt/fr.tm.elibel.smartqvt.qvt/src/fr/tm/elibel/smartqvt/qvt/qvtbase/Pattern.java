/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase;

import fr.tm.elibel.smartqvt.qvt.emof.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Element {
	/**
	 * Returns the value of the '<em><b>Binds To</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getPattern_BindsTo()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.Variable" ordered="false"
	 * @generated
	 */
	EList getBindsTo();

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getPattern_Predicate()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate#getPattern
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtbase.Predicate" opposite="pattern" containment="true" ordered="false"
	 * @generated
	 */
	EList getPredicate();

} // Pattern
