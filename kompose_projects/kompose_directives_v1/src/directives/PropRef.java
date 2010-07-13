/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prop Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.PropRef#getProperty <em>Property</em>}</li>
 *   <li>{@link directives.PropRef#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getPropRef()
 * @model
 * @generated
 */
public interface PropRef extends ElementRef {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see directives.DirectivesPackage#getPropRef_Property()
	 * @model dataType="directives.String"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link directives.PropRef#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectRef)
	 * @see directives.DirectivesPackage#getPropRef_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectRef getObject();

	/**
	 * Sets the value of the '{@link directives.PropRef#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectRef value);

} // PropRef
