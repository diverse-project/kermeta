/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed.impl;

import art_relaxed.group_relaxed.Group_relaxedPackage;
import art_relaxed.group_relaxed.InstanceGroup;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.Instance_relaxedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art_relaxed.group_relaxed.impl.InstanceGroupImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link art_relaxed.group_relaxed.impl.InstanceGroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceGroupImpl extends GroupImpl implements InstanceGroup {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> instances;

	/**
	 * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceGroup> subGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group_relaxedPackage.Literals.INSTANCE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList.ManyInverse<ComponentInstance>(ComponentInstance.class, this, Group_relaxedPackage.INSTANCE_GROUP__INSTANCES, Instance_relaxedPackage.COMPONENT_INSTANCE__GROUPS);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceGroup> getSubGroups() {
		if (subGroups == null) {
			subGroups = new EObjectContainmentEList<InstanceGroup>(InstanceGroup.class, this, Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS);
		}
		return subGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS:
				return ((InternalEList<?>)getSubGroups()).basicRemove(otherEnd, msgs);
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
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				return getInstances();
			case Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS:
				return getSubGroups();
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
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends InstanceGroup>)newValue);
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
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				getInstances().clear();
				return;
			case Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS:
				getSubGroups().clear();
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
			case Group_relaxedPackage.INSTANCE_GROUP__INSTANCES:
				return instances != null && !instances.isEmpty();
			case Group_relaxedPackage.INSTANCE_GROUP__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceGroupImpl
