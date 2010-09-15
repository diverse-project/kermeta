/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.art2.Art2Package;
import org.kermeta.art2.Channel;
import org.kermeta.art2.Instance;
import org.kermeta.art2.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.art2.impl.ChannelImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends NamedElementImpl implements Channel {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition typeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Art2Package.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject)typeDefinition;
			typeDefinition = (TypeDefinition)eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Art2Package.CHANNEL__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(TypeDefinition newTypeDefinition) {
		TypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Art2Package.CHANNEL__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Art2Package.CHANNEL__TYPE_DEFINITION:
				if (resolve) return getTypeDefinition();
				return basicGetTypeDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Art2Package.CHANNEL__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)newValue);
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
			case Art2Package.CHANNEL__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)null);
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
			case Art2Package.CHANNEL__TYPE_DEFINITION:
				return typeDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Instance.class) {
			switch (derivedFeatureID) {
				case Art2Package.CHANNEL__TYPE_DEFINITION: return Art2Package.INSTANCE__TYPE_DEFINITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Instance.class) {
			switch (baseFeatureID) {
				case Art2Package.INSTANCE__TYPE_DEFINITION: return Art2Package.CHANNEL__TYPE_DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChannelImpl
