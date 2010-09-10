/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.HubType#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.HubType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.HubType#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link org.kermeta.art2.HubType#getStopMethod <em>Stop Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getHubType()
 * @model
 * @generated
 */
public interface HubType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Bean</em>' attribute.
	 * @see #setFactoryBean(String)
	 * @see org.kermeta.art2.Art2Package#getHubType_FactoryBean()
	 * @model
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.HubType#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(String)
	 * @see org.kermeta.art2.Art2Package#getHubType_Bean()
	 * @model
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.HubType#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

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
	 * @see org.kermeta.art2.Art2Package#getHubType_StartMethod()
	 * @model
	 * @generated
	 */
	String getStartMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.HubType#getStartMethod <em>Start Method</em>}' attribute.
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
	 * @see org.kermeta.art2.Art2Package#getHubType_StopMethod()
	 * @model
	 * @generated
	 */
	String getStopMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.HubType#getStopMethod <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Method</em>' attribute.
	 * @see #getStopMethod()
	 * @generated
	 */
	void setStopMethod(String value);

} // HubType
