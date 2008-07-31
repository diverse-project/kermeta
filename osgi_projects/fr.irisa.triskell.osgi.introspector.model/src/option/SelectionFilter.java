/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectionFilter.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Selection Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link option.SelectionFilter#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see option.OptionPackage#getSelectionFilter()
 * @model
 * @generated
 */
public interface SelectionFilter extends NativeCodeDirective {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see option.OptionPackage#getSelectionFilter_Expression()
	 * @model dataType="manifest.String" required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link option.SelectionFilter#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SelectionFilter
