/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRule.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.AltRule#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.AltRule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getAltRule()
 * @model
 * @generated
 */
public interface AltRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference.
	 * @see #setDecl(AltRuleDecl)
	 * @see gymnast.gymnastPackage#getAltRule_Decl()
	 * @model required="true"
	 * @generated
	 */
	AltRuleDecl getDecl();

	/**
	 * Sets the value of the '{@link gymnast.AltRule#getDecl <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl</em>' reference.
	 * @see #getDecl()
	 * @generated
	 */
	void setDecl(AltRuleDecl value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(AltRuleBody)
	 * @see gymnast.gymnastPackage#getAltRule_Body()
	 * @model required="true"
	 * @generated
	 */
	AltRuleBody getBody();

	/**
	 * Sets the value of the '{@link gymnast.AltRule#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AltRuleBody value);

} // AltRule
