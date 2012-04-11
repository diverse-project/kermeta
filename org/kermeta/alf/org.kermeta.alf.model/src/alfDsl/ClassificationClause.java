/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ClassificationClause#getClassifyFromClause <em>Classify From Clause</em>}</li>
 *   <li>{@link alfDsl.ClassificationClause#getClassifyToClause <em>Classify To Clause</em>}</li>
 *   <li>{@link alfDsl.ClassificationClause#getReclassyAllClause <em>Reclassy All Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getClassificationClause()
 * @model
 * @generated
 */
public interface ClassificationClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Classify From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classify From Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classify From Clause</em>' containment reference.
	 * @see #setClassifyFromClause(ClassificationFromClause)
	 * @see alfDsl.AlfDslPackage#getClassificationClause_ClassifyFromClause()
	 * @model containment="true"
	 * @generated
	 */
	ClassificationFromClause getClassifyFromClause();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationClause#getClassifyFromClause <em>Classify From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classify From Clause</em>' containment reference.
	 * @see #getClassifyFromClause()
	 * @generated
	 */
	void setClassifyFromClause(ClassificationFromClause value);

	/**
	 * Returns the value of the '<em><b>Classify To Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classify To Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classify To Clause</em>' containment reference.
	 * @see #setClassifyToClause(ClassificationToClause)
	 * @see alfDsl.AlfDslPackage#getClassificationClause_ClassifyToClause()
	 * @model containment="true"
	 * @generated
	 */
	ClassificationToClause getClassifyToClause();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationClause#getClassifyToClause <em>Classify To Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classify To Clause</em>' containment reference.
	 * @see #getClassifyToClause()
	 * @generated
	 */
	void setClassifyToClause(ClassificationToClause value);

	/**
	 * Returns the value of the '<em><b>Reclassy All Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclassy All Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclassy All Clause</em>' containment reference.
	 * @see #setReclassyAllClause(ReclassifyAllClause)
	 * @see alfDsl.AlfDslPackage#getClassificationClause_ReclassyAllClause()
	 * @model containment="true"
	 * @generated
	 */
	ReclassifyAllClause getReclassyAllClause();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationClause#getReclassyAllClause <em>Reclassy All Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclassy All Clause</em>' containment reference.
	 * @see #getReclassyAllClause()
	 * @generated
	 */
	void setReclassyAllClause(ReclassifyAllClause value);

} // ClassificationClause
