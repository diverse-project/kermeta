/**
 * <copyright>
 * </copyright>
 *
 * $Id: Change.java,v 1.1.1.1 2008-11-17 15:36:42 mclavreu Exp $
 */
package kompose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Change#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link kompose.Change#getTarget <em>Target</em>}</li>
 *   <li>{@link kompose.Change#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getChange()
 * @model abstract="true"
 * @generated
 */
public interface Change extends ElementDirective {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see kompose.KomposePackage#getChange_PropertyName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link kompose.Change#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

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
	 * @see kompose.KomposePackage#getChange_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getTarget();

	/**
	 * Sets the value of the '{@link kompose.Change#getTarget <em>Target</em>}' containment reference.
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
	 * @see kompose.KomposePackage#getChange_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getValue();

	/**
	 * Sets the value of the '{@link kompose.Change#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ElementRef value);

} // Change
