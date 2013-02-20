/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation;

import fr.tm.elibel.smartqvt.qvt.essentialocl.Variable;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getDefaultAssignment <em>Default Assignment</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getPattern <em>Pattern</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getRootVariable <em>Root Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationDomain()
 * @model
 * @generated
 */
public interface RelationDomain extends Domain {
	/**
	 * Returns the value of the '<em><b>Default Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Assignment</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationDomain_DefaultAssignment()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomainAssignment" containment="true" ordered="false"
	 * @generated
	 */
	EList getDefaultAssignment();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(DomainPattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationDomain_Pattern()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DomainPattern getPattern();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(DomainPattern value);

	/**
	 * Returns the value of the '<em><b>Root Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Variable</em>' reference.
	 * @see #setRootVariable(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationDomain_RootVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getRootVariable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationDomain#getRootVariable <em>Root Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Variable</em>' reference.
	 * @see #getRootVariable()
	 * @generated
	 */
	void setRootVariable(Variable value);

} // RelationDomain
