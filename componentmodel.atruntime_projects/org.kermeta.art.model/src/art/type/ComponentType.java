/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.type;

import art.ModelElement;

import art.group.TypeGroup;

import art.implem.TypeImplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art.type.ComponentType#getPort <em>Port</em>}</li>
 *   <li>{@link art.type.ComponentType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art.type.ComponentType#getGroups <em>Groups</em>}</li>
 *   <li>{@link art.type.ComponentType#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @see art.type.TypePackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.AbstractPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see art.type.TypePackage#getComponentType_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPort> getPort();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link art.type.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see art.type.TypePackage#getComponentType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link art.group.TypeGroup}.
	 * It is bidirectional and its opposite is '{@link art.group.TypeGroup#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see art.type.TypePackage#getComponentType_Groups()
	 * @see art.group.TypeGroup#getTypes
	 * @model opposite="types"
	 * @generated
	 */
	EList<TypeGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implem</em>' containment reference.
	 * @see #setImplem(TypeImplementation)
	 * @see art.type.TypePackage#getComponentType_Implem()
	 * @model containment="true"
	 * @generated
	 */
	TypeImplementation getImplem();

	/**
	 * Sets the value of the '{@link art.type.ComponentType#getImplem <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implem</em>' containment reference.
	 * @see #getImplem()
	 * @generated
	 */
	void setImplem(TypeImplementation value);

} // ComponentType
