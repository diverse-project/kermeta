/**
 * <copyright>
 * </copyright>
 *
 * $Id: SeqRule.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.SeqRule#getDecl <em>Decl</em>}</li>
 *   <li>{@link gymnast.SeqRule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getSeqRule()
 * @model
 * @generated
 */
public interface SeqRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Decl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl</em>' reference.
	 * @see #setDecl(SeqRuleDecl)
	 * @see gymnast.gymnastPackage#getSeqRule_Decl()
	 * @model required="true"
	 * @generated
	 */
	SeqRuleDecl getDecl();

	/**
	 * Sets the value of the '{@link gymnast.SeqRule#getDecl <em>Decl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl</em>' reference.
	 * @see #getDecl()
	 * @generated
	 */
	void setDecl(SeqRuleDecl value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link gymnast.Expr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see gymnast.gymnastPackage#getSeqRule_Body()
	 * @model type="gymnast.Expr" required="true"
	 * @generated
	 */
	EList<Expr> getBody();

} // SeqRule
