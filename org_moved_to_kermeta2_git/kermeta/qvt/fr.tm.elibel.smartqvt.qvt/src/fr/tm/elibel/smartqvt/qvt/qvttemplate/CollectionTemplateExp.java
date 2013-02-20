/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvttemplate;

import fr.tm.elibel.smartqvt.qvt.essentialocl.CollectionType;
import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Template Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp#getMember <em>Member</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp#getReferredCollectionType <em>Referred Collection Type</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getCollectionTemplateExp()
 * @model
 * @generated
 */
public interface CollectionTemplateExp extends TemplateExp {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getCollectionTemplateExp_Member()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getMember();

	/**
	 * Returns the value of the '<em><b>Referred Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Collection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Collection Type</em>' reference.
	 * @see #setReferredCollectionType(CollectionType)
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getCollectionTemplateExp_ReferredCollectionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CollectionType getReferredCollectionType();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp#getReferredCollectionType <em>Referred Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Collection Type</em>' reference.
	 * @see #getReferredCollectionType()
	 * @generated
	 */
	void setReferredCollectionType(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' reference.
	 * @see #setRest(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.qvttemplate.QvttemplatePackage#getCollectionTemplateExp_Rest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getRest();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvttemplate.CollectionTemplateExp#getRest <em>Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(Variable value);

} // CollectionTemplateExp
