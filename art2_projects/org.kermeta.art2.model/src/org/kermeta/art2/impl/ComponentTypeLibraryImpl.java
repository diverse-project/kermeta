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
import org.kermeta.art2.ComponentTypeLibrary;
import org.kermeta.art2.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ComponentTypeLibraryImpl#getSubTypes <em>Sub Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeLibraryImpl extends NamedElementImpl implements ComponentTypeLibrary {
	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDefinition> subTypes;

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
	public EList<TypeDefinition> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectResolvingEList<TypeDefinition>(TypeDefinition.class, this, Art2Package.COMPONENT_TYPE_LIBRARY__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_TYPES:
				return getSubTypes();
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_TYPES:
				getSubTypes().clear();
				getSubTypes().addAll((Collection<? extends TypeDefinition>)newValue);
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_TYPES:
				getSubTypes().clear();
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
			case Art2Package.COMPONENT_TYPE_LIBRARY__SUB_TYPES:
				return subTypes != null && !subTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeLibraryImpl
