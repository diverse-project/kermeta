/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.NameRef#getQname <em>Qname</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getNameRef()
 * @model
 * @generated
 */
public interface NameRef extends ObjectRef {
	/**
	 * Returns the value of the '<em><b>Qname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qname</em>' attribute.
	 * @see #setQname(String)
	 * @see directives.DirectivesPackage#getNameRef_Qname()
	 * @model dataType="directives.String"
	 * @generated
	 */
	String getQname();

	/**
	 * Sets the value of the '{@link directives.NameRef#getQname <em>Qname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qname</em>' attribute.
	 * @see #getQname()
	 * @generated
	 */
	void setQname(String value);

} // NameRef
