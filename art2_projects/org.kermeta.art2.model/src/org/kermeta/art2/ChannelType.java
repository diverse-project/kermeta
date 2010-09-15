/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.ChannelType#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link org.kermeta.art2.ChannelType#getStopMethod <em>Stop Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getChannelType()
 * @model
 * @generated
 */
public interface ChannelType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Method</em>' attribute.
	 * @see #setStartMethod(String)
	 * @see org.kermeta.art2.Art2Package#getChannelType_StartMethod()
	 * @model
	 * @generated
	 */
	String getStartMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ChannelType#getStartMethod <em>Start Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Method</em>' attribute.
	 * @see #getStartMethod()
	 * @generated
	 */
	void setStartMethod(String value);

	/**
	 * Returns the value of the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Method</em>' attribute.
	 * @see #setStopMethod(String)
	 * @see org.kermeta.art2.Art2Package#getChannelType_StopMethod()
	 * @model
	 * @generated
	 */
	String getStopMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ChannelType#getStopMethod <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Method</em>' attribute.
	 * @see #getStopMethod()
	 * @generated
	 */
	void setStopMethod(String value);

} // ChannelType
