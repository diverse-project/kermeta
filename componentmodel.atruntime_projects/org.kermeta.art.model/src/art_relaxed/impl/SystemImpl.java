/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.impl;

import art_relaxed.Art_relaxedPackage;
import art_relaxed.DataType;

import art_relaxed.distrib_relaxed.Node;

import art_relaxed.group_relaxed.Group;

import art_relaxed.type_relaxed.ComponentType;
import art_relaxed.type_relaxed.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art_relaxed.impl.SystemImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link art_relaxed.impl.SystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link art_relaxed.impl.SystemImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link art_relaxed.impl.SystemImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link art_relaxed.impl.SystemImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ModelElementImpl implements art_relaxed.System {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> types;

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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art_relaxedPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, Art_relaxedPackage.SYSTEM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, Art_relaxedPackage.SYSTEM__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, Art_relaxedPackage.SYSTEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, Art_relaxedPackage.SYSTEM__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, Art_relaxedPackage.SYSTEM__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Art_relaxedPackage.SYSTEM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case Art_relaxedPackage.SYSTEM__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case Art_relaxedPackage.SYSTEM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case Art_relaxedPackage.SYSTEM__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case Art_relaxedPackage.SYSTEM__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case Art_relaxedPackage.SYSTEM__NODES:
				return getNodes();
			case Art_relaxedPackage.SYSTEM__SERVICES:
				return getServices();
			case Art_relaxedPackage.SYSTEM__TYPES:
				return getTypes();
			case Art_relaxedPackage.SYSTEM__DATA_TYPES:
				return getDataTypes();
			case Art_relaxedPackage.SYSTEM__GROUPS:
				return getGroups();
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
			case Art_relaxedPackage.SYSTEM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case Art_relaxedPackage.SYSTEM__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case Art_relaxedPackage.SYSTEM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case Art_relaxedPackage.SYSTEM__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case Art_relaxedPackage.SYSTEM__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
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
			case Art_relaxedPackage.SYSTEM__NODES:
				getNodes().clear();
				return;
			case Art_relaxedPackage.SYSTEM__SERVICES:
				getServices().clear();
				return;
			case Art_relaxedPackage.SYSTEM__TYPES:
				getTypes().clear();
				return;
			case Art_relaxedPackage.SYSTEM__DATA_TYPES:
				getDataTypes().clear();
				return;
			case Art_relaxedPackage.SYSTEM__GROUPS:
				getGroups().clear();
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
			case Art_relaxedPackage.SYSTEM__NODES:
				return nodes != null && !nodes.isEmpty();
			case Art_relaxedPackage.SYSTEM__SERVICES:
				return services != null && !services.isEmpty();
			case Art_relaxedPackage.SYSTEM__TYPES:
				return types != null && !types.isEmpty();
			case Art_relaxedPackage.SYSTEM__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case Art_relaxedPackage.SYSTEM__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
