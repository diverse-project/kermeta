/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tm.elibel.smartqvt.qvt.essentialocl;

import fr.tm.elibel.smartqvt.qvt.emof.TypedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression In Ocl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getBodyExpression <em>Body Expression</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getContextVariable <em>Context Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getParameterVariable <em>Parameter Variable</em>}</li>
 *   <li>{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getResultVariable <em>Result Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getExpressionInOcl()
 * @model
 * @generated
 */
public interface ExpressionInOcl extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Expression</em>' containment reference.
	 * @see #setBodyExpression(OclExpression)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getExpressionInOcl_BodyExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBodyExpression();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getBodyExpression <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Expression</em>' containment reference.
	 * @see #getBodyExpression()
	 * @generated
	 */
	void setBodyExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Context Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Variable</em>' containment reference.
	 * @see #setContextVariable(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getExpressionInOcl_ContextVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Variable getContextVariable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getContextVariable <em>Context Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Variable</em>' containment reference.
	 * @see #getContextVariable()
	 * @generated
	 */
	void setContextVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Parameter Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tm.elibel.smartqvt.qvt.essentialocl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Variable</em>' containment reference list.
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getExpressionInOcl_ParameterVariable()
	 * @model type="fr.tm.elibel.smartqvt.qvt.essentialocl.Variable" containment="true" ordered="false"
	 * @generated
	 */
	EList getParameterVariable();

	/**
	 * Returns the value of the '<em><b>Result Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Variable</em>' containment reference.
	 * @see #setResultVariable(Variable)
	 * @see fr.tm.elibel.smartqvt.qvt.essentialocl.EssentialoclPackage#getExpressionInOcl_ResultVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Variable getResultVariable();

	/**
	 * Sets the value of the '{@link fr.tm.elibel.smartqvt.qvt.essentialocl.ExpressionInOcl#getResultVariable <em>Result Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Variable</em>' containment reference.
	 * @see #getResultVariable()
	 * @generated
	 */
	void setResultVariable(Variable value);

} // ExpressionInOcl
