/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Name Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.LocalNameDeclarationStatement#getVarName <em>Var Name</em>}</li>
 *   <li>{@link alfDsl.LocalNameDeclarationStatement#getType <em>Type</em>}</li>
 *   <li>{@link alfDsl.LocalNameDeclarationStatement#isMultiplicityIndicator <em>Multiplicity Indicator</em>}</li>
 *   <li>{@link alfDsl.LocalNameDeclarationStatement#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getLocalNameDeclarationStatement()
 * @model
 * @generated
 */
public interface LocalNameDeclarationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see alfDsl.AlfDslPackage#getLocalNameDeclarationStatement_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link alfDsl.LocalNameDeclarationStatement#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(QualifiedNameWithBinding)
	 * @see alfDsl.AlfDslPackage#getLocalNameDeclarationStatement_Type()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedNameWithBinding getType();

	/**
	 * Sets the value of the '{@link alfDsl.LocalNameDeclarationStatement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(QualifiedNameWithBinding value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Indicator</em>' attribute.
	 * @see #setMultiplicityIndicator(boolean)
	 * @see alfDsl.AlfDslPackage#getLocalNameDeclarationStatement_MultiplicityIndicator()
	 * @model
	 * @generated
	 */
	boolean isMultiplicityIndicator();

	/**
	 * Sets the value of the '{@link alfDsl.LocalNameDeclarationStatement#isMultiplicityIndicator <em>Multiplicity Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Indicator</em>' attribute.
	 * @see #isMultiplicityIndicator()
	 * @generated
	 */
	void setMultiplicityIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Expression)
	 * @see alfDsl.AlfDslPackage#getLocalNameDeclarationStatement_Init()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInit();

	/**
	 * Sets the value of the '{@link alfDsl.LocalNameDeclarationStatement#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Expression value);

} // LocalNameDeclarationStatement
