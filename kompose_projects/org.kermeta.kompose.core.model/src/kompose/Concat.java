/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Concat#getPropertyNames <em>Property Names</em>}</li>
 *   <li>{@link kompose.Concat#getTarget <em>Target</em>}</li>
 *   <li>{@link kompose.Concat#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getConcat()
 * @model
 * @generated
 */
public interface Concat extends ElementDirective {
	/**
	 * Returns the value of the '<em><b>Property Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Names</em>' attribute list.
	 * @see kompose.KomposePackage#getConcat_PropertyNames()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	EList<String> getPropertyNames();

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
	 * @see kompose.KomposePackage#getConcat_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getTarget();

	/**
	 * Sets the value of the '{@link kompose.Concat#getTarget <em>Target</em>}' containment reference.
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
	 * @see kompose.KomposePackage#getConcat_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getValue();

	/**
	 * Sets the value of the '{@link kompose.Concat#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ElementRef value);

} // Concat
