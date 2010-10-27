/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Merge#getLeft <em>Left</em>}</li>
 *   <li>{@link kompose.Merge#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends ElementDirective {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(NameRef)
	 * @see kompose.KomposePackage#getMerge_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameRef getLeft();

	/**
	 * Sets the value of the '{@link kompose.Merge#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(NameRef value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(NameRef)
	 * @see kompose.KomposePackage#getMerge_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameRef getRight();

	/**
	 * Sets the value of the '{@link kompose.Merge#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(NameRef value);

} // Merge
