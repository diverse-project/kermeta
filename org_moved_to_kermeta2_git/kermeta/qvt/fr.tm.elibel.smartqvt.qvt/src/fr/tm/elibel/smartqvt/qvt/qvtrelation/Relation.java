/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtrelation;

import fr.tm.elibel.smartqvt.qvt.qvtbase.Pattern;
import fr.tm.elibel.smartqvt.qvt.qvtbase.Rule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getIsTopLevel <em>Is Top Level</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getOperationalImpl <em>Operational Impl</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhen <em>When</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Rule {
	/**
	 * Returns the value of the '<em><b>Is Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Top Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Top Level</em>' attribute.
	 * @see #setIsTopLevel(Boolean)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation_IsTopLevel()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.Boolean"
	 * @generated
	 */
	Boolean getIsTopLevel();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getIsTopLevel <em>Is Top Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Top Level</em>' attribute.
	 * @see #getIsTopLevel()
	 * @generated
	 */
	void setIsTopLevel(Boolean value);

	/**
	 * Returns the value of the '<em><b>Operational Impl</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation}.
	 * It is bidirectional and its opposite is '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Impl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Impl</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation_OperationalImpl()
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation#getRelation
	 * @model type="fr.tm.elibel.smartqvt.qvt.qvtrelation.RelationImplementation" opposite="relation" containment="true" ordered="false"
	 * @generated
	 */
	EList getOperationalImpl();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation_Variable()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.Variable" containment="true" ordered="false"
	 * @generated
	 */
	EList getVariable();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Pattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation_When()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Pattern getWhen();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Pattern value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Pattern)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtrelation.QvtrelationPackage#getRelation_Where()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Pattern getWhere();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtrelation.Relation#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Pattern value);

} // Relation
