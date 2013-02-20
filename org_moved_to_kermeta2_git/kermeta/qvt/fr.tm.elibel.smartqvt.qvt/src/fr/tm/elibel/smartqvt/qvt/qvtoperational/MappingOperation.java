/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression;

import fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getDisjunct <em>Disjunct</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getInherited <em>Inherited</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getMerged <em>Merged</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhen <em>When</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation()
 * @model
 * @generated
 */
public interface MappingOperation extends ImperativeOperation {
	/**
	 * Returns the value of the '<em><b>Disjunct</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjunct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjunct</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_Disjunct()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation"
	 * @generated
	 */
	EList getDisjunct();

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_Inherited()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation"
	 * @generated
	 */
	EList getInherited();

	/**
	 * Returns the value of the '<em><b>Merged</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_Merged()
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation"
	 * @generated
	 */
	EList getMerged();

	/**
	 * Returns the value of the '<em><b>Refined Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Relation</em>' reference.
	 * @see #setRefinedRelation(Relation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_RefinedRelation()
	 * @model ordered="false"
	 * @generated
	 */
	Relation getRefinedRelation();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getRefinedRelation <em>Refined Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Relation</em>' reference.
	 * @see #getRefinedRelation()
	 * @generated
	 */
	void setRefinedRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_When()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getWhen();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getMappingOperation_Where()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OclExpression getWhere();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.MappingOperation#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(OclExpression value);

} // MappingOperation
