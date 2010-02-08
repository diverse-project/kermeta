/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import org.eclipse.emf.common.util.EList;

import pattern.art.ModelElement;

import pattern.art.group.InstanceGroup;

import pattern.art.implem.ComponentImplementation;

import pattern.art.type.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pattern.art.instance.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getState <em>State</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getBinding <em>Binding</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getImplem <em>Implem</em>}</li>
 *   <li>{@link pattern.art.instance.ComponentInstance#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see pattern.art.instance.InstancePackage#getComponentInstance()
 * @model
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
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_Type()
	 * @model
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link pattern.art.instance.ComponentInstance#getType <em>Type</em>}' reference.
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
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_State()
	 * @model dataType="pattern.art.String"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link pattern.art.instance.ComponentInstance#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Super Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pattern.art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Component</em>' container reference.
	 * @see #setSuperComponent(CompositeInstance)
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_SuperComponent()
	 * @see pattern.art.instance.CompositeInstance#getSubComponent
	 * @model opposite="subComponent" transient="false"
	 * @generated
	 */
	CompositeInstance getSuperComponent();

	/**
	 * Sets the value of the '{@link pattern.art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Component</em>' container reference.
	 * @see #getSuperComponent()
	 * @generated
	 */
	void setSuperComponent(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.instance.AttributeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeInstance> getAttribute();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link pattern.art.instance.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_Binding()
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
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_Implem()
	 * @model containment="true"
	 * @generated
	 */
	ComponentImplementation getImplem();

	/**
	 * Sets the value of the '{@link pattern.art.instance.ComponentInstance#getImplem <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implem</em>' containment reference.
	 * @see #getImplem()
	 * @generated
	 */
	void setImplem(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.group.InstanceGroup}.
	 * It is bidirectional and its opposite is '{@link pattern.art.group.InstanceGroup#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see pattern.art.instance.InstancePackage#getComponentInstance_Groups()
	 * @see pattern.art.group.InstanceGroup#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	EList<InstanceGroup> getGroups();

} // ComponentInstance
