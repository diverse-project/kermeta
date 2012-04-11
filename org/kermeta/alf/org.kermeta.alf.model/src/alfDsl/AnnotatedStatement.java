/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.AnnotatedStatement#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link alfDsl.AnnotatedStatement#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getAnnotatedStatement()
 * @model
 * @generated
 */
public interface AnnotatedStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see alfDsl.AlfDslPackage#getAnnotatedStatement_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link alfDsl.AnnotatedStatement#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see alfDsl.AlfDslPackage#getAnnotatedStatement_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link alfDsl.AnnotatedStatement#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

} // AnnotatedStatement
