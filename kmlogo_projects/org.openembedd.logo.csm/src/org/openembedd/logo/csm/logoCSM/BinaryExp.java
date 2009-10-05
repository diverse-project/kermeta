/**
 * <copyright> </copyright>
 * 
 * $Id: BinaryExp.java,v 1.1 2008-05-28 12:47:10 vmahe Exp $
 */
package org.openembedd.logo.csm.logoCSM;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binary Exp</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getLhs <em>Lhs</em>}</li>
 * <li>{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getBinaryExp()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExp extends Expression
{
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getBinaryExp_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getLhs <em>Lhs</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see org.openembedd.logo.csm.logoCSM.LogoCSMPackage#getBinaryExp_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link org.openembedd.logo.csm.logoCSM.BinaryExp#getRhs <em>Rhs</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getExpressionSymbol();

} // BinaryExp
