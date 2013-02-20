/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation;

import fr.tm.elibel.smartqvt.qvt.emof.Element;
import fr.tm.elibel.smartqvt.qvt.emof.Operation;

import fr.tm.elibel.smartqvt.qvt.qvtbase.TypedModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getImpl <em>Impl</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationImplementation()
 * @model
 * @generated
 */
public interface RelationImplementation extends Element {
	/**
	 * Returns the value of the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' reference.
	 * @see #setImpl(Operation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationImplementation_Impl()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getImpl();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getImpl <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(Operation value);

	/**
	 * Returns the value of the '<em><b>In Direction Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Direction Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Direction Of</em>' reference.
	 * @see #setInDirectionOf(TypedModel)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationImplementation_InDirectionOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypedModel getInDirectionOf();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Direction Of</em>' reference.
	 * @see #getInDirectionOf()
	 * @generated
	 */
	void setInDirectionOf(TypedModel value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getOperationalImpl <em>Operational Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' container reference.
	 * @see #setRelation(Relation)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelationImplementation_Relation()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getOperationalImpl
	 * @model opposite="operationalImpl" required="true" ordered="false"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation <em>Relation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' container reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // RelationImplementation
