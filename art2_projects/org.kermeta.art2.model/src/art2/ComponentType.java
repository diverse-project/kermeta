/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ComponentType#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link art2.ComponentType#getFactoryBean <em>Factory Bean</em>}</li>
 *   <li>{@link art2.ComponentType#getRequired <em>Required</em>}</li>
 *   <li>{@link art2.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}</li>
 *   <li>{@link art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}</li>
 *   <li>{@link art2.ComponentType#getProvided <em>Provided</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getComponentType()
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
	 * @see art2.Art2Package#getComponentType_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	DictionaryType getDictionary();

	/**
	 * Sets the value of the '{@link art2.ComponentType#getDictionary <em>Dictionary</em>}' containment reference.
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
	 * @see art2.Art2Package#getComponentType_FactoryBean()
	 * @model
	 * @generated
	 */
	String getFactoryBean();

	/**
	 * Sets the value of the '{@link art2.ComponentType#getFactoryBean <em>Factory Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Bean</em>' attribute.
	 * @see #getFactoryBean()
	 * @generated
	 */
	void setFactoryBean(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference list.
	 * @see art2.Art2Package#getComponentType_Required()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getRequired();

	/**
	 * Returns the value of the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link art2.IntegrationPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Patterns</em>' containment reference list.
	 * @see art2.Art2Package#getComponentType_IntegrationPatterns()
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
	 * @see art2.Art2Package#getComponentType_ExtraFonctionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	ExtraFonctionalProperty getExtraFonctionalProperties();

	/**
	 * Sets the value of the '{@link art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Fonctional Properties</em>' containment reference.
	 * @see #getExtraFonctionalProperties()
	 * @generated
	 */
	void setExtraFonctionalProperties(ExtraFonctionalProperty value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see art2.Art2Package#getComponentType_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getProvided();

} // ComponentType
