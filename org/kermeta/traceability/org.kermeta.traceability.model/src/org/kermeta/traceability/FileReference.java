/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.FileReference#getFileURI <em>File URI</em>}</li>
 *   <li>{@link org.kermeta.traceability.FileReference#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getFileReference()
 * @model abstract="true"
 *        annotation="kermeta documentation='/**\r\n * This class represents a reference to a concrete object contained by a file\r\n \052/'"
 * @generated
 */
public interface FileReference extends Reference {
	/**
	 * Returns the value of the '<em><b>File URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File URI</em>' attribute.
	 * @see #setFileURI(String)
	 * @see org.kermeta.traceability.TraceabilityPackage#getFileReference_FileURI()
	 * @model dataType="org.kermeta.traceability.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** URI of the file containing the referred concrete object \052/'"
	 * @generated
	 */
	String getFileURI();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.FileReference#getFileURI <em>File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File URI</em>' attribute.
	 * @see #getFileURI()
	 * @generated
	 */
	void setFileURI(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see org.kermeta.traceability.TraceabilityPackage#getFileReference_TimeStamp()
	 * @model dataType="org.kermeta.traceability.String"
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.FileReference#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

} // FileReference
