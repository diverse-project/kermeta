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

import org.kermeta.language.structure.ComplexPropertyBinding;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexPropertyBindingImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.kermeta.language.structure.impl.ComplexPropertyBindingImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexPropertyBindingImpl extends PropertyBindingImpl implements ComplexPropertyBinding {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexPropertyBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPLEX_PROPERTY_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Property>(Property.class, this, StructurePackage.COMPLEX_PROPERTY_BINDING__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Property>(Property.class, this, StructurePackage.COMPLEX_PROPERTY_BINDING__TARGETS);
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
			case StructurePackage.COMPLEX_PROPERTY_BINDING__SOURCES:
				return getSources();
			case StructurePackage.COMPLEX_PROPERTY_BINDING__TARGETS:
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
			case StructurePackage.COMPLEX_PROPERTY_BINDING__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Property>)newValue);
				return;
			case StructurePackage.COMPLEX_PROPERTY_BINDING__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Property>)newValue);
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
			case StructurePackage.COMPLEX_PROPERTY_BINDING__SOURCES:
				getSources().clear();
				return;
			case StructurePackage.COMPLEX_PROPERTY_BINDING__TARGETS:
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
			case StructurePackage.COMPLEX_PROPERTY_BINDING__SOURCES:
				return sources != null && !sources.isEmpty();
			case StructurePackage.COMPLEX_PROPERTY_BINDING__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexPropertyBindingImpl
