/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelTypeVariableImpl.java,v 1.4 2008-10-08 14:37:29 cfaucher Exp $
 */
package kermeta.language.structure.impl;

import java.util.Collection;

import kermeta.language.structure.ModelTypeVariable;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.VirtualType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kermeta.language.structure.impl.ModelTypeVariableImpl#getVirtualType <em>Virtual Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeVariableImpl extends TypeVariableImpl implements
		ModelTypeVariable {
	/**
	 * The cached value of the '{@link #getVirtualType() <em>Virtual Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualType()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualType> virtualType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.MODEL_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualType> getVirtualType() {
		if (virtualType == null) {
			virtualType = new EObjectContainmentWithInverseEList.Resolving<VirtualType>(
					VirtualType.class, this,
					StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE,
					StructurePackage.VIRTUAL_TYPE__MODEL_TYPE);
		}
		return virtualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVirtualType())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			return ((InternalEList<?>) getVirtualType()).basicRemove(otherEnd,
					msgs);
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
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			return getVirtualType();
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
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			getVirtualType().clear();
			getVirtualType().addAll(
					(Collection<? extends VirtualType>) newValue);
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
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			getVirtualType().clear();
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
		case StructurePackage.MODEL_TYPE_VARIABLE__VIRTUAL_TYPE:
			return virtualType != null && !virtualType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeVariableImpl
