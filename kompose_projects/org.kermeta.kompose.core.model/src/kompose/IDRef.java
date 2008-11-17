/**
 * <copyright>
 * </copyright>
 *
 * $Id: IDRef.java,v 1.1.1.1 2008-11-17 15:36:42 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.IDRef#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getIDRef()
 * @model
 * @generated
 */
public interface IDRef extends ElementRef {
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
	 * @see kompose.KomposePackage#getIDRef_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link kompose.IDRef#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // IDRef
