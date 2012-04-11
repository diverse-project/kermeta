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
 * A representation of the model object '<em><b>Classification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.ClassificationExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link alfDsl.ClassificationExpression#getOp <em>Op</em>}</li>
 *   <li>{@link alfDsl.ClassificationExpression#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getClassificationExpression()
 * @model
 * @generated
 */
public interface ClassificationExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(RelationalExpression)
	 * @see alfDsl.AlfDslPackage#getClassificationExpression_Exp()
	 * @model containment="true"
	 * @generated
	 */
	RelationalExpression getExp();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationExpression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(RelationalExpression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see alfDsl.AlfDslPackage#getClassificationExpression_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(NameExpression)
	 * @see alfDsl.AlfDslPackage#getClassificationExpression_TypeName()
	 * @model containment="true"
	 * @generated
	 */
	NameExpression getTypeName();

	/**
	 * Sets the value of the '{@link alfDsl.ClassificationExpression#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(NameExpression value);

} // ClassificationExpression
