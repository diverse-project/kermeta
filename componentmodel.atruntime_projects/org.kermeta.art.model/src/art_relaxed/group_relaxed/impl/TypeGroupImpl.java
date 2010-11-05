/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed.impl;

import art_relaxed.group_relaxed.Group_relaxedPackage;
import art_relaxed.group_relaxed.TypeGroup;

import art_relaxed.type_relaxed.ComponentType;
import art_relaxed.type_relaxed.Type_relaxedPackage;

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
 * An implementation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link art_relaxed.group_relaxed.impl.TypeGroupImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link art_relaxed.group_relaxed.impl.TypeGroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupImpl extends GroupImpl implements TypeGroup {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> types;

	/**
	 * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGroup> subGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Group_relaxedPackage.Literals.TYPE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getTypes() {
		if (types == null) {
			types = new EObjectWithInverseResolvingEList.ManyInverse<ComponentType>(ComponentType.class, this, Group_relaxedPackage.TYPE_GROUP__TYPES, Type_relaxedPackage.COMPONENT_TYPE__GROUPS);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGroup> getSubGroups() {
		if (subGroups == null) {
			subGroups = new EObjectContainmentEList<TypeGroup>(TypeGroup.class, this, Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS);
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS:
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				return getTypes();
			case Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS:
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends TypeGroup>)newValue);
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				getTypes().clear();
				return;
			case Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS:
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
			case Group_relaxedPackage.TYPE_GROUP__TYPES:
				return types != null && !types.isEmpty();
			case Group_relaxedPackage.TYPE_GROUP__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeGroupImpl
