/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleExpr.java,v 1.1 2007-11-21 10:22:22 ftanguy Exp $
 */
package gymnast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gymnast.SimpleExpr#getName <em>Name</em>}</li>
 *   <li>{@link gymnast.SimpleExpr#getValue <em>Value</em>}</li>
 *   <li>{@link gymnast.SimpleExpr#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see gymnast.gymnastPackage#getSimpleExpr()
 * @model
 * @generated
 */
public interface SimpleExpr extends Expr {
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
	 * @see gymnast.gymnastPackage#getSimpleExpr_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gymnast.SimpleExpr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gymnast.gymnastPackage#getSimpleExpr_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gymnast.SimpleExpr#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see gymnast.gymnastPackage#getSimpleExpr_Attrs()
	 * @model
	 * @generated
	 */
	Attrs getAttrs();

	/**
	 * Sets the value of the '{@link gymnast.SimpleExpr#getAttrs <em>Attrs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attrs</em>' reference.
	 * @see #getAttrs()
	 * @generated
	 */
	void setAttrs(Attrs value);

} // SimpleExpr
