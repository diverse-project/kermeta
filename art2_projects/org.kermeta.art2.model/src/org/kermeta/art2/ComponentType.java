/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.art2.ComponentType#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getRequired <em>Required</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getBean <em>Bean</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getStartMethod <em>Start Method</em>}</li>
 *   <li>{@link org.kermeta.art2.ComponentType#getStopMethod <em>Stop Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends DeployUnit {
	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(DictionaryType)
	 * @see org.kermeta.art2.Art2Package#getComponentType_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	DictionaryType getDictionary();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(DictionaryType value);

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
	 * @see org.kermeta.art2.Art2Package#getComponentType_FactoryBean()
	 * @model
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentType_Required()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getRequired();

	/**
	 * Returns the value of the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.IntegrationPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Patterns</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentType_IntegrationPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegrationPattern> getIntegrationPatterns();

	/**
	 * Returns the value of the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Fonctional Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Fonctional Properties</em>' containment reference.
	 * @see #setExtraFonctionalProperties(ExtraFonctionalProperty)
	 * @see org.kermeta.art2.Art2Package#getComponentType_ExtraFonctionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	ExtraFonctionalProperty getExtraFonctionalProperties();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Fonctional Properties</em>' containment reference.
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 */
	void setExtraFonctionalProperties(ExtraFonctionalProperty value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getComponentType_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getProvided();

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
	 * @see org.kermeta.art2.Art2Package#getComponentType_Bean()
	 * @model
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getBean <em>Bean</em>}' attribute.
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
	 * @see org.kermeta.art2.Art2Package#getComponentType_StartMethod()
	 * @model
	 * @generated
	 */
	String getStartMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getStartMethod <em>Start Method</em>}' attribute.
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
	 * @see org.kermeta.art2.Art2Package#getComponentType_StopMethod()
	 * @model
	 * @generated
	 */
	String getStopMethod();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ComponentType#getStopMethod <em>Stop Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Method</em>' attribute.
	 * @see #getStopMethod()
	 * @generated
	 */
	void setStopMethod(String value);

} // ComponentType
