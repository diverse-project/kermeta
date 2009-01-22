/**
 * <copyright>
 * </copyright>
 *
 * $Id: Equals.java,v 1.1 2009-01-22 20:26:53 mclavreu Exp $
 */
package kompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Equals#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link kompose.Equals#getValue <em>Value</em>}</li>
 *   <li>{@link kompose.Equals#getEqualsValue <em>Equals Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getEquals()
 * @model
 * @generated
 */
public interface Equals extends ElementDirective {
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
	 * @see kompose.KomposePackage#getEquals_PropertyName()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link kompose.Equals#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see kompose.KomposePackage#getEquals_Value()
	 * @model dataType="kompose.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link kompose.Equals#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Equals Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equals Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equals Value</em>' containment reference.
	 * @see #setEqualsValue(ElementRef)
	 * @see kompose.KomposePackage#getEquals_EqualsValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getEqualsValue();

	/**
	 * Sets the value of the '{@link kompose.Equals#getEqualsValue <em>Equals Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equals Value</em>' containment reference.
	 * @see #getEqualsValue()
	 * @generated
	 */
	void setEqualsValue(ElementRef value);

} // Equals
