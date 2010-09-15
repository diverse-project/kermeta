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
import org.kermeta.art2.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.TypedElementImpl#getGenericTypes <em>Generic Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedElementImpl extends NamedElementImpl implements TypedElement {
	/**
	 * The cached value of the '{@link #getGenericTypes() <em>Generic Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedElement> genericTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedElement> getGenericTypes() {
		if (genericTypes == null) {
			genericTypes = new EObjectResolvingEList<TypedElement>(TypedElement.class, this, Art2Package.TYPED_ELEMENT__GENERIC_TYPES);
		}
		return genericTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.TYPED_ELEMENT__GENERIC_TYPES:
				return getGenericTypes();
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
			case Art2Package.TYPED_ELEMENT__GENERIC_TYPES:
				getGenericTypes().clear();
				getGenericTypes().addAll((Collection<? extends TypedElement>)newValue);
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
			case Art2Package.TYPED_ELEMENT__GENERIC_TYPES:
				getGenericTypes().clear();
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
			case Art2Package.TYPED_ELEMENT__GENERIC_TYPES:
				return genericTypes != null && !genericTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypedElementImpl
