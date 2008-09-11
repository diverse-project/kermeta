/**
 * <copyright>
 * </copyright>
 *
 * $Id: Exception.java,v 1.2 2008-09-11 12:34:44 cfaucher Exp $
 */
package kermeta.exceptions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kermeta.exceptions.Exception#getMessage <em>Message</em>}</li>
 *   <li>{@link kermeta.exceptions.Exception#getNestedException <em>Nested Exception</em>}</li>
 *   <li>{@link kermeta.exceptions.Exception#getStackTrace <em>Stack Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see kermeta.exceptions.ExceptionsPackage#getException()
 * @model annotation="kermeta documentation='/**\n * Generic exceptions\n * The main class from which all the exception inherit\n \052/'"
 * @generated
 */
public interface Exception extends kermeta.language.structure.Object {
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
	 * @see kermeta.exceptions.ExceptionsPackage#getException_Message()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/** The message attached to the exception     \052/'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.Exception#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Nested Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Exception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Exception</em>' containment reference.
	 * @see #setNestedException(Exception)
	 * @see kermeta.exceptions.ExceptionsPackage#getException_NestedException()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="kermeta documentation='/** Any nested exception     \052/'"
	 * @generated
	 */
	Exception getNestedException();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.Exception#getNestedException <em>Nested Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Exception</em>' containment reference.
	 * @see #getNestedException()
	 * @generated
	 */
	void setNestedException(Exception value);

	/**
	 * Returns the value of the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Trace</em>' attribute.
	 * @see #setStackTrace(String)
	 * @see kermeta.exceptions.ExceptionsPackage#getException_StackTrace()
	 * @model dataType="kermeta.standard.JavaString"
	 *        annotation="kermeta documentation='/**\n     * The stack trace as a String\n     * Filled by the interpreted when the exception is raised\n     \052/'"
	 * @generated
	 */
	String getStackTrace();

	/**
	 * Sets the value of the '{@link kermeta.exceptions.Exception#getStackTrace <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Trace</em>' attribute.
	 * @see #getStackTrace()
	 * @generated
	 */
	void setStackTrace(String value);

} // Exception
