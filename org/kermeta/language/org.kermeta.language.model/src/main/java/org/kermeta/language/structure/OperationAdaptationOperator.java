/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Adaptation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.OperationAdaptationOperator#getBody <em>Body</em>}</li>
 *   <li>{@link org.kermeta.language.structure.OperationAdaptationOperator#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.language.structure.StructurePackage#getOperationAdaptationOperator()
 * @model
 * @generated
 */
public interface OperationAdaptationOperator extends AdaptationOperator {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.kermeta.language.structure.StructurePackage#getOperationAdaptationOperator_Body()
	 * @model dataType="org.kermeta.language.structure.String"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.OperationAdaptationOperator#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Operation)
	 * @see org.kermeta.language.structure.StructurePackage#getOperationAdaptationOperator_Target()
	 * @model required="true"
	 * @generated
	 */
	Operation getTarget();

	/**
	 * Sets the value of the '{@link org.kermeta.language.structure.OperationAdaptationOperator#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Operation value);

} // OperationAdaptationOperator
