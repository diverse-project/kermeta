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
 *   <li>{@link org.kermeta.art2.ContainerRoot#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getMessageHub <em>Message Hub</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getMBindings <em>MBindings</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getThirdParties <em>Third Parties</em>}</li>
 *   <li>{@link org.kermeta.art2.ContainerRoot#getPlatformModel <em>Platform Model</em>}</li>
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
	 * Returns the value of the '<em><b>Port Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Types</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_PortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortType> getPortTypes();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.ComponentTypeLibrary}.
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
	EList<ComponentTypeLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Message Hub</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.Hub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Hub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Hub</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_MessageHub()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hub> getMessageHub();

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
	 * Returns the value of the '<em><b>Third Parties</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.art2.DeployUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Parties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Parties</em>' containment reference list.
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_ThirdParties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployUnit> getThirdParties();

	/**
	 * Returns the value of the '<em><b>Platform Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Model</em>' containment reference.
	 * @see #setPlatformModel(PlatformModel)
	 * @see org.kermeta.art2.Art2Package#getContainerRoot_PlatformModel()
	 * @model containment="true"
	 * @generated
	 */
	PlatformModel getPlatformModel();

	/**
	 * Sets the value of the '{@link org.kermeta.art2.ContainerRoot#getPlatformModel <em>Platform Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Model</em>' containment reference.
	 * @see #getPlatformModel()
	 * @generated
	 */
	void setPlatformModel(PlatformModel value);

} // ContainerRoot
