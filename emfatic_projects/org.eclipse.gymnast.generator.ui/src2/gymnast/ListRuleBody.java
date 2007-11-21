/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListRuleBody.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.ListRuleBody#getListExpr <em>List Expr</em>}</li>
 *   <li>{@link gymnast.ListRuleBody#getSeparator <em>Separator</em>}</li>
 *   <li>{@link gymnast.ListRuleBody#getListExpr2 <em>List Expr2</em>}</li>
 *   <li>{@link gymnast.ListRuleBody#getListMark <em>List Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getListRuleBody()
 * @model
 * @generated
 */
public interface ListRuleBody extends GymnastEASTNode {
	/**
	 * Returns the value of the '<em><b>List Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Expr</em>' reference.
	 * @see #setListExpr(SimpleExpr)
	 * @see gymnast.gymnastPackage#getListRuleBody_ListExpr()
	 * @model required="true"
	 * @generated
	 */
	SimpleExpr getListExpr();

	/**
	 * Sets the value of the '{@link gymnast.ListRuleBody#getListExpr <em>List Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Expr</em>' reference.
	 * @see #getListExpr()
	 * @generated
	 */
	void setListExpr(SimpleExpr value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' reference.
	 * @see #setSeparator(SimpleExpr)
	 * @see gymnast.gymnastPackage#getListRuleBody_Separator()
	 * @model
	 * @generated
	 */
	SimpleExpr getSeparator();

	/**
	 * Sets the value of the '{@link gymnast.ListRuleBody#getSeparator <em>Separator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(SimpleExpr value);

	/**
	 * Returns the value of the '<em><b>List Expr2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Expr2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Expr2</em>' reference.
	 * @see #setListExpr2(SimpleExpr)
	 * @see gymnast.gymnastPackage#getListRuleBody_ListExpr2()
	 * @model
	 * @generated
	 */
	SimpleExpr getListExpr2();

	/**
	 * Sets the value of the '{@link gymnast.ListRuleBody#getListExpr2 <em>List Expr2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Expr2</em>' reference.
	 * @see #getListExpr2()
	 * @generated
	 */
	void setListExpr2(SimpleExpr value);

	/**
	 * Returns the value of the '<em><b>List Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Mark</em>' attribute.
	 * @see #setListMark(String)
	 * @see gymnast.gymnastPackage#getListRuleBody_ListMark()
	 * @model
	 * @generated
	 */
	String getListMark();

	/**
	 * Sets the value of the '{@link gymnast.ListRuleBody#getListMark <em>List Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mark</em>' attribute.
	 * @see #getListMark()
	 * @generated
	 */
	void setListMark(String value);

} // ListRuleBody
