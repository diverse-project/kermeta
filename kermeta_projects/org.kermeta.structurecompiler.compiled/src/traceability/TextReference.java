/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextReference.java,v 1.4 2008-10-08 14:37:53 cfaucher Exp $
 */
package traceability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.TextReference#getCharEndAt <em>Char End At</em>}</li>
 *   <li>{@link traceability.TextReference#getCharBeginAt <em>Char Begin At</em>}</li>
 *   <li>{@link traceability.TextReference#getLineEndAt <em>Line End At</em>}</li>
 *   <li>{@link traceability.TextReference#getLineBeginAt <em>Line Begin At</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getTextReference()
 * @model annotation="kermeta documentation='/**\r\n * This class represents a reference to a textual file concrete object\r\n \052/'"
 *        annotation="kermeta.inv validTextRef=''"
 * @generated
 */
public interface TextReference extends FileReference {
	/**
	 * Returns the value of the '<em><b>Char End At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End At</em>' attribute.
	 * @see #setCharEndAt(Integer)
	 * @see traceability.TraceabilityPackage#getTextReference_CharEndAt()
	 * @model dataType="traceability.Integer" required="true"
	 *        annotation="kermeta documentation='/** Ending character number \052/'"
	 * @generated
	 */
	Integer getCharEndAt();

	/**
	 * Sets the value of the '{@link traceability.TextReference#getCharEndAt <em>Char End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char End At</em>' attribute.
	 * @see #getCharEndAt()
	 * @generated
	 */
	void setCharEndAt(Integer value);

	/**
	 * Returns the value of the '<em><b>Char Begin At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Begin At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Begin At</em>' attribute.
	 * @see #setCharBeginAt(Integer)
	 * @see traceability.TraceabilityPackage#getTextReference_CharBeginAt()
	 * @model dataType="traceability.Integer" required="true"
	 *        annotation="kermeta documentation='/** Starting character number \052/'"
	 * @generated
	 */
	Integer getCharBeginAt();

	/**
	 * Sets the value of the '{@link traceability.TextReference#getCharBeginAt <em>Char Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Begin At</em>' attribute.
	 * @see #getCharBeginAt()
	 * @generated
	 */
	void setCharBeginAt(Integer value);

	/**
	 * Returns the value of the '<em><b>Line End At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line End At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line End At</em>' attribute.
	 * @see #setLineEndAt(Integer)
	 * @see traceability.TraceabilityPackage#getTextReference_LineEndAt()
	 * @model dataType="traceability.Integer" required="true"
	 *        annotation="kermeta documentation='/** Ending line number \052/'"
	 * @generated
	 */
	Integer getLineEndAt();

	/**
	 * Sets the value of the '{@link traceability.TextReference#getLineEndAt <em>Line End At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line End At</em>' attribute.
	 * @see #getLineEndAt()
	 * @generated
	 */
	void setLineEndAt(Integer value);

	/**
	 * Returns the value of the '<em><b>Line Begin At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Begin At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Begin At</em>' attribute.
	 * @see #setLineBeginAt(Integer)
	 * @see traceability.TraceabilityPackage#getTextReference_LineBeginAt()
	 * @model dataType="traceability.Integer" required="true"
	 *        annotation="kermeta documentation='/** Starting line number \052/'"
	 * @generated
	 */
	Integer getLineBeginAt();

	/**
	 * Sets the value of the '{@link traceability.TextReference#getLineBeginAt <em>Line Begin At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Begin At</em>' attribute.
	 * @see #getLineBeginAt()
	 * @generated
	 */
	void setLineBeginAt(Integer value);

} // TextReference
