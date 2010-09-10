/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ComponentTypeLibrary;
import org.kermeta.art2.ContainerNode;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.DeployUnit;
import org.kermeta.art2.Hub;
import org.kermeta.art2.MBinding;
import org.kermeta.art2.PlatformModel;
import org.kermeta.art2.PortType;
import org.kermeta.art2.Repository;
import org.kermeta.art2.TypeDefinition;
import org.kermeta.art2.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getPortTypes <em>Port Types</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getMessageHub <em>Message Hub</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getMBindings <em>MBindings</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getThirdParties <em>Third Parties</em>}</li>
 *   <li>{@link org.kermeta.art2.impl.ContainerRootImpl#getPlatformModel <em>Platform Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerRootImpl extends EObjectImpl implements ContainerRoot {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerNode> nodes;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> typeDefinitions;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> dataTypes;

	/**
	 * The cached value of the '{@link #getPortTypes() <em>Port Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> portTypes;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentTypeLibrary> libraries;

	/**
	 * The cached value of the '{@link #getMessageHub() <em>Message Hub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHub()
	 * @generated
	 * @ordered
	 */
	protected EList<Hub> messageHub;

	/**
	 * The cached value of the '{@link #getMBindings() <em>MBindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<MBinding> mBindings;

	/**
	 * The cached value of the '{@link #getThirdParties() <em>Third Parties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdParties()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployUnit> thirdParties;

	/**
	 * The cached value of the '{@link #getPlatformModel() <em>Platform Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformModel()
	 * @generated
	 * @ordered
	 */
	protected PlatformModel platformModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.CONTAINER_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ContainerNode>(ContainerNode.class, this, Art2Package.CONTAINER_ROOT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, Art2Package.CONTAINER_ROOT__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedElement> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<TypedElement>(TypedElement.class, this, Art2Package.CONTAINER_ROOT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EObjectContainmentEList<PortType>(PortType.class, this, Art2Package.CONTAINER_ROOT__PORT_TYPES);
		}
		return portTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentTypeLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<ComponentTypeLibrary>(ComponentTypeLibrary.class, this, Art2Package.CONTAINER_ROOT__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hub> getMessageHub() {
		if (messageHub == null) {
			messageHub = new EObjectContainmentEList<Hub>(Hub.class, this, Art2Package.CONTAINER_ROOT__MESSAGE_HUB);
		}
		return messageHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBinding> getMBindings() {
		if (mBindings == null) {
			mBindings = new EObjectContainmentEList<MBinding>(MBinding.class, this, Art2Package.CONTAINER_ROOT__MBINDINGS);
		}
		return mBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployUnit> getThirdParties() {
		if (thirdParties == null) {
			thirdParties = new EObjectContainmentEList<DeployUnit>(DeployUnit.class, this, Art2Package.CONTAINER_ROOT__THIRD_PARTIES);
		}
		return thirdParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getPlatformModel() {
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformModel(PlatformModel newPlatformModel, NotificationChain msgs) {
		PlatformModel oldPlatformModel = platformModel;
		platformModel = newPlatformModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Art2Package.CONTAINER_ROOT__PLATFORM_MODEL, oldPlatformModel, newPlatformModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformModel(PlatformModel newPlatformModel) {
		if (newPlatformModel != platformModel) {
			NotificationChain msgs = null;
			if (platformModel != null)
				msgs = ((InternalEObject)platformModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Art2Package.CONTAINER_ROOT__PLATFORM_MODEL, null, msgs);
			if (newPlatformModel != null)
				msgs = ((InternalEObject)newPlatformModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Art2Package.CONTAINER_ROOT__PLATFORM_MODEL, null, msgs);
			msgs = basicSetPlatformModel(newPlatformModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.CONTAINER_ROOT__PLATFORM_MODEL, newPlatformModel, newPlatformModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art2Package.CONTAINER_ROOT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
				return ((InternalEList<?>)getPortTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
				return ((InternalEList<?>)getMessageHub()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
				return ((InternalEList<?>)getMBindings()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
				return ((InternalEList<?>)getThirdParties()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__PLATFORM_MODEL:
				return basicSetPlatformModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.CONTAINER_ROOT__NODES:
				return getNodes();
			case Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return getRepositories();
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return getDataTypes();
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
				return getPortTypes();
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
				return getLibraries();
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
				return getMessageHub();
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
				return getMBindings();
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
				return getThirdParties();
			case Art2Package.CONTAINER_ROOT__PLATFORM_MODEL:
				return getPlatformModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2Package.CONTAINER_ROOT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ContainerNode>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends TypeDefinition>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends TypedElement>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
				getPortTypes().clear();
				getPortTypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends ComponentTypeLibrary>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
				getMessageHub().clear();
				getMessageHub().addAll((Collection<? extends Hub>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
				getMBindings().clear();
				getMBindings().addAll((Collection<? extends MBinding>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
				getThirdParties().clear();
				getThirdParties().addAll((Collection<? extends DeployUnit>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Art2Package.CONTAINER_ROOT__NODES:
				getNodes().clear();
				return;
			case Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				return;
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				return;
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				return;
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
				getPortTypes().clear();
				return;
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
				getLibraries().clear();
				return;
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
				getMessageHub().clear();
				return;
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
				getMBindings().clear();
				return;
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
				getThirdParties().clear();
				return;
			case Art2Package.CONTAINER_ROOT__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Art2Package.CONTAINER_ROOT__NODES:
				return nodes != null && !nodes.isEmpty();
			case Art2Package.CONTAINER_ROOT__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case Art2Package.CONTAINER_ROOT__PORT_TYPES:
				return portTypes != null && !portTypes.isEmpty();
			case Art2Package.CONTAINER_ROOT__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case Art2Package.CONTAINER_ROOT__MESSAGE_HUB:
				return messageHub != null && !messageHub.isEmpty();
			case Art2Package.CONTAINER_ROOT__MBINDINGS:
				return mBindings != null && !mBindings.isEmpty();
			case Art2Package.CONTAINER_ROOT__THIRD_PARTIES:
				return thirdParties != null && !thirdParties.isEmpty();
			case Art2Package.CONTAINER_ROOT__PLATFORM_MODEL:
				return platformModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerRootImpl
