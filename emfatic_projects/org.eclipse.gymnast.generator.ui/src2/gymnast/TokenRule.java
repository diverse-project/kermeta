/**
 * <copyright>
 * </copyright>
 *
 * $Id: TokenRule.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.TokenRule#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.TokenRule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getTokenRule()
 * @model
 * @generated
 */
public interface TokenRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference.
	 * @see #setDecl(TokenRuleDecl)
	 * @see gymnast.gymnastPackage#getTokenRule_Decl()
	 * @model required="true"
	 * @generated
	 */
	TokenRuleDecl getDecl();

	/**
	 * Sets the value of the '{@link gymnast.TokenRule#getDecl <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl</em>' reference.
	 * @see #getDecl()
	 * @generated
	 */
	void setDecl(TokenRuleDecl value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link gymnast.SimpleExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see gymnast.gymnastPackage#getTokenRule_Body()
	 * @model type="gymnast.SimpleExpr"
	 * @generated
	 */
	EList<SimpleExpr> getBody();

} // TokenRule
