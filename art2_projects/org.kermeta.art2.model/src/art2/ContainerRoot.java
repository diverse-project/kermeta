/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link art2.ContainerRoot#getNodes <em>Nodes</em>}</li>
 *   <li>{@link art2.ContainerRoot#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link art2.ContainerRoot#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link art2.ContainerRoot#getBindings <em>Bindings</em>}</li>
 *   <li>{@link art2.ContainerRoot#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link art2.ContainerRoot#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link art2.ContainerRoot#getLibrariy <em>Librariy</em>}</li>
 * </ul>
 * </p>
 *
 * @see art2.Art2Package#getContainerRoot()
 * @model
 * @generated
 */
public interface ContainerRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Component Types</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Types</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_ComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getComponentTypes();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link art2.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link art2.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedElement> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link art2.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_PortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortType> getPortTypes();

	/**
	 * Returns the value of the '<em><b>Librariy</b></em>' containment reference list.
	 * The list contents are of type {@link art2.ComponentTypeLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librariy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librariy</em>' containment reference list.
	 * @see art2.Art2Package#getContainerRoot_Librariy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentTypeLibrary> getLibrariy();

} // ContainerRoot
