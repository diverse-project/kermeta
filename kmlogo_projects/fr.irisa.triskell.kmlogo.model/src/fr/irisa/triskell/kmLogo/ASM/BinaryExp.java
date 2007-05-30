/**
 * <copyright>
 * </copyright>
 *
 * $Id: BinaryExp.java,v 1.1 2007-05-30 13:23:34 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.ASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getOperator <em>Operator</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBinaryExp()
 * @model
 * @generated
 */
public interface BinaryExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBinaryExp_Operator()
	 * @model dataType="fr.irisa.triskell.kmLogo.String"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBinaryExp_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see fr.irisa.triskell.kmLogo.ASM.ASMPackage#getBinaryExp_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link fr.irisa.triskell.kmLogo.ASM.BinaryExp#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // BinaryExp