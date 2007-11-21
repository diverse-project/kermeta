/**
 * <copyright>
 * </copyright>
 *
 * $Id: AltRuleDecl.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Rule Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.AltRuleDecl#getKind <em>Kind</em>}</li>
 *   <li>{@link gymnast.AltRuleDecl#getName <em>Name</em>}</li>
 *   <li>{@link gymnast.AltRuleDecl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getAltRuleDecl()
 * @model
 * @generated
 */
public interface AltRuleDecl extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gymnast.AltRuleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gymnast.AltRuleKind
	 * @see #setKind(AltRuleKind)
	 * @see gymnast.gymnastPackage#getAltRuleDecl_Kind()
	 * @model
	 * @generated
	 */
	AltRuleKind getKind();

	/**
	 * Sets the value of the '{@link gymnast.AltRuleDecl#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gymnast.AltRuleKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AltRuleKind value);

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
	 * @see gymnast.gymnastPackage#getAltRuleDecl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gymnast.AltRuleDecl#getName <em>Name</em>}' attribute.
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
	 * @see gymnast.gymnastPackage#getAltRuleDecl_Attrs()
	 * @model
	 * @generated
	 */
	Attrs getAttrs();

	/**
	 * Sets the value of the '{@link gymnast.AltRuleDecl#getAttrs <em>Attrs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attrs</em>' reference.
	 * @see #getAttrs()
	 * @generated
	 */
	void setAttrs(Attrs value);

} // AltRuleDecl
