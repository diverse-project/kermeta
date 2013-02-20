/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.XMLReference#getXPointer <em>XPointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getXMLReference()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a reference to a XML concrete object\r\n \052/'"
 * @generated
 */
public interface XMLReference extends FileReference {
	/**
	 * Returns the value of the '<em><b>XPointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPointer</em>' attribute.
	 * @see #setXPointer(String)
	 * @see org.kermeta.traceability.TraceabilityPackage#getXMLReference_XPointer()
	 * @model dataType="org.kermeta.traceability.String" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** XML link to the referred XML concrete object \052/'"
	 * @generated
	 */
	String getXPointer();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.XMLReference#getXPointer <em>XPointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPointer</em>' attribute.
	 * @see #getXPointer()
	 * @generated
	 */
	void setXPointer(String value);

} // XMLReference
