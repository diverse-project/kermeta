/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.Create#getClassName <em>Class Name</em>}</li>
 *   <li>{@link directives.Create#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends UnaryDirective {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see directives.DirectivesPackage#getCreate_ClassName()
	 * @model dataType="directives.String"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link directives.Create#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(MetaRef)
	 * @see directives.DirectivesPackage#getCreate_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetaRef getType();

	/**
	 * Sets the value of the '{@link directives.Create#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MetaRef value);

} // Create
