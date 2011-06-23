/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.diagnostic.InvariantProxy#getMetaclassQualifiedName <em>Metaclass Qualified Name</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.InvariantProxy#getInvariantName <em>Invariant Name</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.InvariantProxy#getMmUri <em>Mm Uri</em>}</li>
 *   <li>{@link org.kermeta.diagnostic.InvariantProxy#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.diagnostic.DiagnosticPackage#getInvariantProxy()
 * @model
 * @generated
 */
public interface InvariantProxy extends Invariant {
	/**
	 * Returns the value of the '<em><b>Metaclass Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Qualified Name</em>' attribute.
	 * @see #setMetaclassQualifiedName(String)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getInvariantProxy_MetaclassQualifiedName()
	 * @model dataType="org.kermeta.diagnostic.String" required="true"
	 * @generated
	 */
	String getMetaclassQualifiedName();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.InvariantProxy#getMetaclassQualifiedName <em>Metaclass Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass Qualified Name</em>' attribute.
	 * @see #getMetaclassQualifiedName()
	 * @generated
	 */
	void setMetaclassQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Invariant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant Name</em>' attribute.
	 * @see #setInvariantName(String)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getInvariantProxy_InvariantName()
	 * @model dataType="org.kermeta.diagnostic.String" required="true"
	 * @generated
	 */
	String getInvariantName();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.InvariantProxy#getInvariantName <em>Invariant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Name</em>' attribute.
	 * @see #getInvariantName()
	 * @generated
	 */
	void setInvariantName(String value);

	/**
	 * Returns the value of the '<em><b>Mm Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mm Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mm Uri</em>' attribute.
	 * @see #setMmUri(String)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getInvariantProxy_MmUri()
	 * @model dataType="org.kermeta.diagnostic.String" required="true"
	 * @generated
	 */
	String getMmUri();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.InvariantProxy#getMmUri <em>Mm Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mm Uri</em>' attribute.
	 * @see #getMmUri()
	 * @generated
	 */
	void setMmUri(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.kermeta.diagnostic.DiagnosticPackage#getInvariantProxy_Message()
	 * @model dataType="org.kermeta.diagnostic.String"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.kermeta.diagnostic.InvariantProxy#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // InvariantProxy
