/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.qvtoperational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getAdditionalCondition <em>Additional Condition</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends fr.tm.elibel.smartqvt.qvt.emof.Class {
	/**
	 * Returns the value of the '<em><b>Additional Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Condition</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModelType_AdditionalCondition()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.OclExpression" containment="true"
	 * @generated
	 */
	EList getAdditionalCondition();

	/**
	 * Returns the value of the '<em><b>Conformance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance Kind</em>' attribute.
	 * @see #setConformanceKind(String)
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModelType_ConformanceKind()
	 * @model dataType="fr.tm.elibel.smartqvt.qvt.primitivetypes.String"
	 * @generated
	 */
	String getConformanceKind();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.qvtoperational.ModelType#getConformanceKind <em>Conformance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Kind</em>' attribute.
	 * @see #getConformanceKind()
	 * @generated
	 */
	void setConformanceKind(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.emof.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.qvtoperational.QvtoperationalPackage#getModelType_Metamodel()
	 * @model type="fr.tm.elibel.smartqvt.qvt.emof.Package" required="true"
	 * @generated
	 */
	EList getMetamodel();

} // ModelType
