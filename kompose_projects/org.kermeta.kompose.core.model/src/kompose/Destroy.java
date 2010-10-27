/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Destroy#getTarget <em>Target</em>}</li>
 *   <li>{@link kompose.Destroy#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getDestroy()
 * @model
 * @generated
 */
public interface Destroy extends ElementDirective {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ElementRef)
	 * @see kompose.KomposePackage#getDestroy_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getTarget();

	/**
	 * Sets the value of the '{@link kompose.Destroy#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementRef value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ElementRef)
	 * @see kompose.KomposePackage#getDestroy_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getValue();

	/**
	 * Sets the value of the '{@link kompose.Destroy#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ElementRef value);

} // Destroy
