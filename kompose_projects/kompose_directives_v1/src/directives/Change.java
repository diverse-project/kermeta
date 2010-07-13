/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.Change#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getChange()
 * @model abstract="true"
 * @generated
 */
public interface Change extends BinaryDirective {
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
	 * @see directives.DirectivesPackage#getChange_PropertyName()
	 * @model dataType="directives.String"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link directives.Change#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // Change
