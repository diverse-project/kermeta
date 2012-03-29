/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.PartialBinding;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.PartialBindingImpl#getWithRespectTo <em>With Respect To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartialBindingImpl extends ModelTypeBindingImpl implements PartialBinding {
	/**
	 * The cached value of the '{@link #getWithRespectTo() <em>With Respect To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithRespectTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> withRespectTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.PARTIAL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getWithRespectTo() {
		if (withRespectTo == null) {
			withRespectTo = new EObjectResolvingEList<Operation>(Operation.class, this, StructurePackage.PARTIAL_BINDING__WITH_RESPECT_TO);
		}
		return withRespectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.PARTIAL_BINDING__WITH_RESPECT_TO:
				return getWithRespectTo();
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
			case StructurePackage.PARTIAL_BINDING__WITH_RESPECT_TO:
				getWithRespectTo().clear();
				getWithRespectTo().addAll((Collection<? extends Operation>)newValue);
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
			case StructurePackage.PARTIAL_BINDING__WITH_RESPECT_TO:
				getWithRespectTo().clear();
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
			case StructurePackage.PARTIAL_BINDING__WITH_RESPECT_TO:
				return withRespectTo != null && !withRespectTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartialBindingImpl
