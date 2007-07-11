/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualTypeContainerImpl.java,v 1.3 2007-07-11 14:41:54 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.irisa.triskell.kermeta.language.structure.impl.VirtualTypeContainerImpl#getVirtualType <em>Virtual Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VirtualTypeContainerImpl extends EObjectImpl implements VirtualTypeContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";
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
	protected VirtualTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.VIRTUAL_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualType> getVirtualType() {
		if (virtualType == null) {
			virtualType = new EObjectContainmentWithInverseEList.Resolving<VirtualType>(VirtualType.class, this, StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE, StructurePackage.VIRTUAL_TYPE__MODEL_TYPE);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVirtualType()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
				return ((InternalEList<?>)getVirtualType()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
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
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
				getVirtualType().clear();
				getVirtualType().addAll((Collection<? extends VirtualType>)newValue);
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
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
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
			case StructurePackage.VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE:
				return virtualType != null && !virtualType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualTypeContainerImpl