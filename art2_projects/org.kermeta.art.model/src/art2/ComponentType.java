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
 *   <li>{@link art2.ComponentType#getHostedPortTypes <em>Hosted Port Types</em>}</li>
 *   <li>{@link art2.ComponentType#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link art2.ComponentType#getRequirePortTypes <em>Require Port Types</em>}</li>
 *   <li>{@link art2.ComponentType#getBean <em>Bean</em>}</li>
 *   <li>{@link art2.ComponentType#getPortTypeRefs <em>Port Type Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends DeployUnit {
	/**
	 * Returns the value of the '<em><b>Hosted Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Port Types</em>' containment reference list.
	 * @see art2.Art2Package#getComponentType_HostedPortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortType> getHostedPortTypes();

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
	 * Returns the value of the '<em><b>Require Port Types</b></em>' reference list.
	 * The list contents are of type {@link art2.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Port Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Port Types</em>' reference list.
	 * @see art2.Art2Package#getComponentType_RequirePortTypes()
	 * @model
	 * @generated
	 */
	EList<PortType> getRequirePortTypes();

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
	 * @see art2.Art2Package#getComponentType_Bean()
	 * @model
	 * @generated
	 */
	String getBean();

	/**
	 * Sets the value of the '{@link art2.ComponentType#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(String value);

	/**
	 * Returns the value of the '<em><b>Port Type Refs</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type Refs</em>' containment reference list.
	 * @see art2.Art2Package#getComponentType_PortTypeRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeRef> getPortTypeRefs();

} // ComponentType
