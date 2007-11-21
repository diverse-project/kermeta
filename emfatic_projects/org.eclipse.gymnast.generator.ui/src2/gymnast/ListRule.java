/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListRule.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.ListRule#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.ListRule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getListRule()
 * @model
 * @generated
 */
public interface ListRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference.
	 * @see #setDecl(ListRuleDecl)
	 * @see gymnast.gymnastPackage#getListRule_Decl()
	 * @model required="true"
	 * @generated
	 */
	ListRuleDecl getDecl();

	/**
	 * Sets the value of the '{@link gymnast.ListRule#getDecl <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl</em>' reference.
	 * @see #getDecl()
	 * @generated
	 */
	void setDecl(ListRuleDecl value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(ListRuleBody)
	 * @see gymnast.gymnastPackage#getListRule_Body()
	 * @model required="true"
	 * @generated
	 */
	ListRuleBody getBody();

	/**
	 * Sets the value of the '{@link gymnast.ListRule#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ListRuleBody value);

} // ListRule
