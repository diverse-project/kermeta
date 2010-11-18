/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.traceability.TextReference#getCharBeginOffset <em>Char Begin Offset</em>}</li>
 *   <li>{@link org.kermeta.traceability.TextReference#getCharEndOffset <em>Char End Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.traceability.TraceabilityPackage#getTextReference()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a reference to a textual file concrete object\r\n \052/'"
 *        annotation="kermeta.inv validTextRef='do\n\tlineEndAt.isGreater(lineBeginAt).~or(lineBeginAt.equals(lineEndAt).~and(charEndAt.isGreaterOrEqual(charBeginAt)))\nend'"
 * @generated
 */
public interface TextReference extends FileReference {
	/**
	 * Returns the value of the '<em><b>Char Begin Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Begin Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Begin Offset</em>' attribute.
	 * @see #setCharBeginOffset(Integer)
	 * @see org.kermeta.traceability.TraceabilityPackage#getTextReference_CharBeginOffset()
	 * @model dataType="org.kermeta.traceability.Integer" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Starting line number \052/'"
	 * @generated
	 */
	Integer getCharBeginOffset();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.TextReference#getCharBeginOffset <em>Char Begin Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Begin Offset</em>' attribute.
	 * @see #getCharBeginOffset()
	 * @generated
	 */
	void setCharBeginOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Char End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End Offset</em>' attribute.
	 * @see #setCharEndOffset(Integer)
	 * @see org.kermeta.traceability.TraceabilityPackage#getTextReference_CharEndOffset()
	 * @model dataType="org.kermeta.traceability.Integer" required="true"
	 *        annotation="kermeta isComposite='true' documentation='/** Starting character number \052/'"
	 * @generated
	 */
	Integer getCharEndOffset();

	/**
	 * Sets the value of the '{@link org.kermeta.traceability.TextReference#getCharEndOffset <em>Char End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char End Offset</em>' attribute.
	 * @see #getCharEndOffset()
	 * @generated
	 */
	void setCharEndOffset(Integer value);

} // TextReference
