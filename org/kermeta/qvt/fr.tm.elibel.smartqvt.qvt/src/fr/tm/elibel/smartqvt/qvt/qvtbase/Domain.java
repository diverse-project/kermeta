/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtbase;

import fr.tm.elibel.smartqvt.qvt.emof.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getIsCheckable <em>Is Checkable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getIsEnforceable <em>Is Enforceable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getTypedModel <em>Typed Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getDomain()
 * @model abstract="true"
 * @generated
 */
public interface Domain extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Checkable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checkable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checkable</em>' attribute.
	 * @see #setIsCheckable(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getDomain_IsCheckable()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsCheckable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getIsCheckable <em>Is Checkable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checkable</em>' attribute.
	 * @see #getIsCheckable()
	 * @generated
	 */
	void setIsCheckable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Enforceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enforceable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enforceable</em>' attribute.
	 * @see #setIsEnforceable(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getDomain_IsEnforceable()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsEnforceable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getIsEnforceable <em>Is Enforceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enforceable</em>' attribute.
	 * @see #getIsEnforceable()
	 * @generated
	 */
	void setIsEnforceable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getDomain_Rule()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.Rule#getDomain
	 * @model opposite="domain" required="true" ordered="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Typed Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Model</em>' reference.
	 * @see #setTypedModel(TypedModel)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtbase.QvtbasePackage#getDomain_TypedModel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypedModel getTypedModel();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtbase.Domain#getTypedModel <em>Typed Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Model</em>' reference.
	 * @see #getTypedModel()
	 * @generated
	 */
	void setTypedModel(TypedModel value);

} // Domain
