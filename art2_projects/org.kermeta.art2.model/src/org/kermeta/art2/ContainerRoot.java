/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

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
 *   <li>{@link org.kermeta.art2.ContainerRoot#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getHubs <em>Hubs</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getMBindings <em>MBindings</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getDeployUnits <em>Deploy Units</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getNodeNetworks <em>Node Networks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.art2.Art2Package#getContainerRoot()
 * @model
 * @generated
 */
public interface ContainerRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.ContainerNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_TypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedElement> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.TypeLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Hubs</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hubs</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_Hubs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getHubs();

	/**
	 * Returns the value of the '<em><b>MBindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.MBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MBindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBindings</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_MBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBinding> getMBindings();

	/**
	 * Returns the value of the '<em><b>Deploy Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Units</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_DeployUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployUnit> getDeployUnits();

	/**
	 * Returns the value of the '<em><b>Node Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.NodeNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Networks</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_NodeNetworks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeNetwork> getNodeNetworks();

} // ContainerRoot
