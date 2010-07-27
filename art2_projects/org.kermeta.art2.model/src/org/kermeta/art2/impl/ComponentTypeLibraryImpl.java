/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.ComponentType;
import org.kermeta.art2.ComponentTypeLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeLibraryImpl#getSubComponentTypes <em>Sub Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeLibraryImpl extends DeployUnitImpl implements ComponentTypeLibrary {
	/**
	 * The cached value of the '{@link #getSubComponentTypes() <em>Sub Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> subComponentTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.COMPONENT_TYPE_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getSubComponentTypes() {
		if (subComponentTypes == null) {
			subComponentTypes = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, Art2Package.COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES);
		}
		return subComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES:
				return getSubComponentTypes();
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES:
				getSubComponentTypes().clear();
				getSubComponentTypes().addAll((Collection<? extends ComponentType>)newValue);
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES:
				getSubComponentTypes().clear();
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES:
				return subComponentTypes != null && !subComponentTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeLibraryImpl
