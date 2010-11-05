/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;

import art_relaxed.ModelElement;

import art_relaxed.group_relaxed.TypeGroup;

import art_relaxed.implem_relaxed.TypeImplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.type_relaxed.ComponentType#getPort <em>Port</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.ComponentType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.ComponentType#getGroups <em>Groups</em>}</li>
 *   <li>{@link art_relaxed.type_relaxed.ComponentType#getImplem <em>Implem</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.AbstractPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getComponentType_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPort> getPort();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getComponentType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.group_relaxed.TypeGroup}.
	 * It is bidirectional and its opposite is '{@link art_relaxed.group_relaxed.TypeGroup#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getComponentType_Groups()
	 * @see art_relaxed.group_relaxed.TypeGroup#getTypes
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
	 * @see art_relaxed.type_relaxed.Type_relaxedPackage#getComponentType_Implem()
	 * @model containment="true"
	 * @generated
	 */
	TypeImplementation getImplem();

	/**
	 * Sets the value of the '{@link art_relaxed.type_relaxed.ComponentType#getImplem <em>Implem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implem</em>' containment reference.
	 * @see #getImplem()
	 * @generated
	 */
	void setImplem(TypeImplementation value);

} // ComponentType
