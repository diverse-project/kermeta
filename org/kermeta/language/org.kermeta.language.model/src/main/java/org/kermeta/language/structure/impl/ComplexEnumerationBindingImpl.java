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

import org.kermeta.language.structure.ComplexEnumerationBinding;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Enumeration Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexEnumerationBindingImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexEnumerationBindingImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexEnumerationBindingImpl extends EnumerationBindingImpl implements ComplexEnumerationBinding {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEnumerationBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPLEX_ENUMERATION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Enumeration>(Enumeration.class, this, StructurePackage.COMPLEX_ENUMERATION_BINDING__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Enumeration>(Enumeration.class, this, StructurePackage.COMPLEX_ENUMERATION_BINDING__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__SOURCES:
				return getSources();
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__TARGETS:
				return getTargets();
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
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Enumeration>)newValue);
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
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__SOURCES:
				getSources().clear();
				return;
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__TARGETS:
				getTargets().clear();
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
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__SOURCES:
				return sources != null && !sources.isEmpty();
			case StructurePackage.COMPLEX_ENUMERATION_BINDING__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexEnumerationBindingImpl
