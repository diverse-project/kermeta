/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2.impl;

import art2.AbstractPortImpl;
import art2.Art2Package;
import art2.ComponentType;
import art2.ContainerNode;
import art2.ContainerRoot;
import art2.DataType;
import art2.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art2.impl.ContainerRootImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link art2.impl.ContainerRootImpl#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link art2.impl.ContainerRootImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link art2.impl.ContainerRootImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link art2.impl.ContainerRootImpl#getAvailablePortImpl <em>Available Port Impl</em>}</li>
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
	 * The cached value of the '{@link #getComponentTypes() <em>Component Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypes;

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
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getAvailablePortImpl() <em>Available Port Impl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailablePortImpl()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPortImpl> availablePortImpl;

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
	public EList<ComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, Art2Package.CONTAINER_ROOT__COMPONENT_TYPES);
		}
		return componentTypes;
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
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, Art2Package.CONTAINER_ROOT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPortImpl> getAvailablePortImpl() {
		if (availablePortImpl == null) {
			availablePortImpl = new EObjectContainmentEList<AbstractPortImpl>(AbstractPortImpl.class, this, Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL);
		}
		return availablePortImpl;
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
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
				return ((InternalEList<?>)getComponentTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL:
				return ((InternalEList<?>)getAvailablePortImpl()).basicRemove(otherEnd, msgs);
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
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
				return getComponentTypes();
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return getRepositories();
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return getDataTypes();
			case Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL:
				return getAvailablePortImpl();
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
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
				getComponentTypes().clear();
				getComponentTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL:
				getAvailablePortImpl().clear();
				getAvailablePortImpl().addAll((Collection<? extends AbstractPortImpl>)newValue);
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
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
				getComponentTypes().clear();
				return;
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				getRepositories().clear();
				return;
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				getDataTypes().clear();
				return;
			case Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL:
				getAvailablePortImpl().clear();
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
			case Art2Package.CONTAINER_ROOT__COMPONENT_TYPES:
				return componentTypes != null && !componentTypes.isEmpty();
			case Art2Package.CONTAINER_ROOT__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case Art2Package.CONTAINER_ROOT__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case Art2Package.CONTAINER_ROOT__AVAILABLE_PORT_IMPL:
				return availablePortImpl != null && !availablePortImpl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerRootImpl
