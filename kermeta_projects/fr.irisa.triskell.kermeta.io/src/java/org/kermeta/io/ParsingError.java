/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParsingError.java,v 1.2 2007-07-20 15:08:08 ftanguy Exp $
 */
package org.kermeta.io;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parsing Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.io.ParsingError#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.kermeta.io.ParsingError#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.io.IoPackage#getParsingError()
 * @model
 * @generated
 */
public interface ParsingError extends ErrorMessage {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.kermeta.io.IoPackage#getParsingError_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.kermeta.io.ParsingError#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.kermeta.io.IoPackage#getParsingError_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.kermeta.io.ParsingError#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // ParsingError