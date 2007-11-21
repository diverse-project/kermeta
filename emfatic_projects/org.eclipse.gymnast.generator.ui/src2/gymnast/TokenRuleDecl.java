/**
 * <copyright>
 * </copyright>
 *
 * $Id: TokenRuleDecl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Rule Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.TokenRuleDecl#getName <em>Name</em>}</li>
 *   <li>{@link gymnast.TokenRuleDecl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getTokenRuleDecl()
 * @model
 * @generated
 */
public interface TokenRuleDecl extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gymnast.gymnastPackage#getTokenRuleDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gymnast.TokenRuleDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attrs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attrs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attrs</em>' reference.
	 * @see #setAttrs(Attrs)
	 * @see gymnast.gymnastPackage#getTokenRuleDecl_Attrs()
	 * @model
	 * @generated
	 */
	Attrs getAttrs();

	/**
	 * Sets the value of the '{@link gymnast.TokenRuleDecl#getAttrs <em>Attrs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attrs</em>' reference.
	 * @see #getAttrs()
	 * @generated
	 */
	void setAttrs(Attrs value);

} // TokenRuleDecl
