/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtcore;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext <em>Context</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getLocal <em>Local</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Rule, Area {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Mapping)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getMapping_Context()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getLocal
	 * @model opposite="local" ordered="false"
	 * @generated
	 */
	Mapping getContext();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Mapping value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getMapping_Local()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getContext
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping" opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList getLocal();

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getMapping_Refinement()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getSpecification
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping" opposite="specification" ordered="false"
	 * @generated
	 */
	EList getRefinement();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.QvtcorePackage#getMapping_Specification()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping#getRefinement
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtcore.Mapping" opposite="refinement" ordered="false"
	 * @generated
	 */
	EList getSpecification();

} // Mapping
