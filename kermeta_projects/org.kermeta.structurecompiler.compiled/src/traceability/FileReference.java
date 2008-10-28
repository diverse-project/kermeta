/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileReference.java,v 1.6 2008-10-28 13:18:26 cfaucher Exp $
 */
package traceability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.FileReference#getFileURI <em>File URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getFileReference()
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
	 * @see traceability.TraceabilityPackage#getFileReference_FileURI()
	 * @model dataType="traceability.String" required="true"
	 *        annotation="kermeta documentation='/** URI of the file containing the referred concrete object \052/'"
	 * @generated
	 */
	String getFileURI();

	/**
	 * Sets the value of the '{@link traceability.FileReference#getFileURI <em>File URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File URI</em>' attribute.
	 * @see #getFileURI()
	 * @generated
	 */
	void setFileURI(String value);

} // FileReference
