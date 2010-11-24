/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.language.structure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.structure.UnresolvedProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.language.structure.impl.UnresolvedPropertyImpl#getPropertyIdentifier <em>Property Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedPropertyImpl extends AbstractPropertyImpl implements UnresolvedProperty {
	/**
	 * The default value of the '{@link #getPropertyIdentifier() <em>Property Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyIdentifier() <em>Property Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String propertyIdentifier = PROPERTY_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.UNRESOLVED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyIdentifier() {
		return propertyIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyIdentifier(String newPropertyIdentifier) {
		String oldPropertyIdentifier = propertyIdentifier;
		propertyIdentifier = newPropertyIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER, oldPropertyIdentifier, propertyIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER:
				return getPropertyIdentifier();
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
			case StructurePackage.UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER:
				setPropertyIdentifier((String)newValue);
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
			case StructurePackage.UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER:
				setPropertyIdentifier(PROPERTY_IDENTIFIER_EDEFAULT);
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
			case StructurePackage.UNRESOLVED_PROPERTY__PROPERTY_IDENTIFIER:
				return PROPERTY_IDENTIFIER_EDEFAULT == null ? propertyIdentifier != null : !PROPERTY_IDENTIFIER_EDEFAULT.equals(propertyIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyIdentifier: ");
		result.append(propertyIdentifier);
		result.append(')');
		return result.toString();
	}

} //UnresolvedPropertyImpl
