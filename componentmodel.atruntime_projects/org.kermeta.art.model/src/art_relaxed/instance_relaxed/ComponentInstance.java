/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import art_relaxed.ModelElement;

import art_relaxed.group_relaxed.InstanceGroup;

import art_relaxed.implem_relaxed.ComponentImplementation;

import art_relaxed.type_relaxed.ComponentType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getState <em>State</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getBinding <em>Binding</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getImplem <em>Implem</em>}</li>
 *   <li>{@link art_relaxed.instance_relaxed.ComponentInstance#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance()
 * @model abstract="true"
 * @generated
 */
public interface ComponentInstance extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_State()
	 * @model dataType="art_relaxed.String" required="true"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.ComponentInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Super Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link art_relaxed.instance_relaxed.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Component</em>' container reference.
	 * @see #setSuperComponent(CompositeInstance)
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_SuperComponent()
	 * @see art_relaxed.instance_relaxed.CompositeInstance#getSubComponent
	 * @model opposite="subComponent" transient="false"
	 * @generated
	 */
	CompositeInstance getSuperComponent();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent <em>Super Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Component</em>' container reference.
	 * @see #getSuperComponent()
	 * @generated
	 */
	void setSuperComponent(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.AttributeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeInstance> getAttribute();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_Binding()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransmissionBinding> getBinding();

	/**
	 * Returns the value of the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implem</em>' containment reference.
	 * @see #setImplem(ComponentImplementation)
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_Implem()
	 * @model containment="true"
	 * @generated
	 */
	ComponentImplementation getImplem();

	/**
	 * Sets the value of the '{@link art_relaxed.instance_relaxed.ComponentInstance#getImplem <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implem</em>' containment reference.
	 * @see #getImplem()
	 * @generated
	 */
	void setImplem(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.group_relaxed.InstanceGroup}.
	 * It is bidirectional and its opposite is '{@link art_relaxed.group_relaxed.InstanceGroup#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#getComponentInstance_Groups()
	 * @see art_relaxed.group_relaxed.InstanceGroup#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	EList<InstanceGroup> getGroups();

} // ComponentInstance
