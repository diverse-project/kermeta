/**
 * <copyright>
 * </copyright>
 *
 * $Id: Create.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Create#getClassName <em>Class Name</em>}</li>
 *   <li>{@link kompose.Create#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends ElementDirective {
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
	 * @see kompose.KomposePackage#getCreate_ClassName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link kompose.Create#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

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
	 * @see kompose.KomposePackage#getCreate_Identifier()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link kompose.Create#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // Create
