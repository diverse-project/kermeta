/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed;

import art_relaxed.distrib_relaxed.Node;

import art_relaxed.group_relaxed.Group;

import art_relaxed.type_relaxed.ComponentType;
import art_relaxed.type_relaxed.Service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art_relaxed.System#getNodes <em>Nodes</em>}</li>
 *   <li>{@link art_relaxed.System#getServices <em>Services</em>}</li>
 *   <li>{@link art_relaxed.System#getTypes <em>Types</em>}</li>
 *   <li>{@link art_relaxed.System#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link art_relaxed.System#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see art_relaxed.Art_relaxedPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.distrib_relaxed.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see art_relaxed.Art_relaxedPackage#getSystem_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see art_relaxed.Art_relaxedPackage#getSystem_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see art_relaxed.Art_relaxedPackage#getSystem_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getTypes();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see art_relaxed.Art_relaxedPackage#getSystem_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link art_relaxed.group_relaxed.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see art_relaxed.Art_relaxedPackage#getSystem_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

} // System
