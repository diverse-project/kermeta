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
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link art2.ComponentInstance#getHostedPorts <em>Hosted Ports</em>}</li>
 *   <li>{@link art2.ComponentInstance#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link art2.ComponentInstance#getRequirePorts <em>Require Ports</em>}</li>
 *   <li>{@link art2.ComponentInstance#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link art2.ComponentInstance#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(ComponentType)
	 * @see art2.Art2Package#getComponentInstance_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link art2.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Hosted Ports</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Ports</em>' containment reference list.
	 * @see art2.Art2Package#getComponentInstance_HostedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getHostedPorts();

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(Dictionary)
	 * @see art2.Art2Package#getComponentInstance_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link art2.ComponentInstance#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Require Ports</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Ports</em>' containment reference list.
	 * @see art2.Art2Package#getComponentInstance_RequirePorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getRequirePorts();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see art2.Art2Package#getComponentInstance_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link art2.ComponentInstance#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link art2.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see art2.Art2Package#getComponentInstance_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

} // ComponentInstance
