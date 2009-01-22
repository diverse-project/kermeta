/**
 * <copyright>
 * </copyright>
 *
 * $Id: Select.java,v 1.1 2009-01-22 20:26:53 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Select#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link kompose.Select#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link kompose.Select#getExpr <em>Expr</em>}</li>
 *   <li>{@link kompose.Select#getSelectTarget <em>Select Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends ElementDirective {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see kompose.KomposePackage#getSelect_PropertyName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link kompose.Select#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see kompose.KomposePackage#getSelect_Identifier()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link kompose.Select#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Equals)
	 * @see kompose.KomposePackage#getSelect_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Equals getExpr();

	/**
	 * Sets the value of the '{@link kompose.Select#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Equals value);

	/**
	 * Returns the value of the '<em><b>Select Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Target</em>' containment reference.
	 * @see #setSelectTarget(ElementRef)
	 * @see kompose.KomposePackage#getSelect_SelectTarget()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getSelectTarget();

	/**
	 * Sets the value of the '{@link kompose.Select#getSelectTarget <em>Select Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Target</em>' containment reference.
	 * @see #getSelectTarget()
	 * @generated
	 */
	void setSelectTarget(ElementRef value);

} // Select
