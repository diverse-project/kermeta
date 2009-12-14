/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import art.CardinalityElement;

import art.implem.PortImplementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.Port#getIsOptional <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends CardinalityElement, AbstractPort {
	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(Boolean)
	 * @see art.type.TypePackage#getPort_IsOptional()
	 * @model default="false" dataType="art.Boolean"
	 * @generated
	 */
	Boolean getIsOptional();

	/**
	 * Sets the value of the '{@link art.type.Port#getIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #getIsOptional()
	 * @generated
	 */
	void setIsOptional(Boolean value);

} // Port
